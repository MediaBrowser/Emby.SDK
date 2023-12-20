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
        public interface IUserLibraryServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto DeleteUsersByUseridFavoriteitemsById (string userId, string id);

        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> DeleteUsersByUseridFavoriteitemsByIdWithHttpInfo (string userId, string id);
        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto DeleteUsersByUseridItemsByIdRating (string userId, string id);

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> DeleteUsersByUseridItemsByIdRatingWithHttpInfo (string userId, string id);
        /// <summary>
        /// Gets a live tv program
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>BaseItemDto</returns>
        BaseItemDto GetLivetvProgramsById (string id);

        /// <summary>
        /// Gets a live tv program
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of BaseItemDto</returns>
        ApiResponse<BaseItemDto> GetLivetvProgramsByIdWithHttpInfo (string id);
        /// <summary>
        /// Gets an item from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>BaseItemDto</returns>
        BaseItemDto GetUsersByUseridItemsById (string userId, string id);

        /// <summary>
        /// Gets an item from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of BaseItemDto</returns>
        ApiResponse<BaseItemDto> GetUsersByUseridItemsByIdWithHttpInfo (string userId, string id);
        /// <summary>
        /// Gets intros to play before the main media item plays
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetUsersByUseridItemsByIdIntros (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets intros to play before the main media item plays
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetUsersByUseridItemsByIdIntrosWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets local trailers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        List<BaseItemDto> GetUsersByUseridItemsByIdLocaltrailers (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets local trailers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        ApiResponse<List<BaseItemDto>> GetUsersByUseridItemsByIdLocaltrailersWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets special features for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        List<BaseItemDto> GetUsersByUseridItemsByIdSpecialfeatures (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets special features for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        ApiResponse<List<BaseItemDto>> GetUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets latest media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        List<BaseItemDto> GetUsersByUseridItemsLatest (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets latest media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        ApiResponse<List<BaseItemDto>> GetUsersByUseridItemsLatestWithHttpInfo (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets the root folder from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>BaseItemDto</returns>
        BaseItemDto GetUsersByUseridItemsRoot (string userId);

        /// <summary>
        /// Gets the root folder from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>ApiResponse of BaseItemDto</returns>
        ApiResponse<BaseItemDto> GetUsersByUseridItemsRootWithHttpInfo (string userId);
        /// <summary>
        /// Gets additional parts for a video.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetVideosByIdAdditionalparts (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets additional parts for a video.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetVideosByIdAdditionalpartsWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Updates user item access
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns></returns>
        void PostItemsAccess (UserLibraryUpdateUserItemAccess body);

        /// <summary>
        /// Updates user item access
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsAccessWithHttpInfo (UserLibraryUpdateUserItemAccess body);
        /// <summary>
        /// Makes an item private
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void PostItemsByIdMakeprivate (string id);

        /// <summary>
        /// Makes an item private
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsByIdMakeprivateWithHttpInfo (string id);
        /// <summary>
        /// Makes an item public to all users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void PostItemsByIdMakepublic (string id);

        /// <summary>
        /// Makes an item public to all users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsByIdMakepublicWithHttpInfo (string id);
        /// <summary>
        /// Leaves a shared item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns></returns>
        void PostItemsSharedLeave (UserLibraryLeaveSharedItems body);

        /// <summary>
        /// Leaves a shared item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsSharedLeaveWithHttpInfo (UserLibraryLeaveSharedItems body);
        /// <summary>
        /// Marks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridFavoriteitemsById (string userId, string id);

        /// <summary>
        /// Marks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridFavoriteitemsByIdWithHttpInfo (string userId, string id);
        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridFavoriteitemsByIdDelete (string userId, string id);

        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo (string userId, string id);
        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridItemsByIdHidefromresume (string userId, string id, bool? hide);

        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridItemsByIdHidefromresumeWithHttpInfo (string userId, string id, bool? hide);
        /// <summary>
        /// Updates a user&#x27;s rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridItemsByIdRating (string userId, string id, bool? likes);

        /// <summary>
        /// Updates a user&#x27;s rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridItemsByIdRatingWithHttpInfo (string userId, string id, bool? likes);
        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridItemsByIdRatingDelete (string userId, string id);

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridItemsByIdRatingDeleteWithHttpInfo (string userId, string id);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> DeleteUsersByUseridFavoriteitemsByIdAsync (string userId, string id);

        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> DeleteUsersByUseridFavoriteitemsByIdAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> DeleteUsersByUseridItemsByIdRatingAsync (string userId, string id);

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> DeleteUsersByUseridItemsByIdRatingAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Gets a live tv program
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of BaseItemDto</returns>
        System.Threading.Tasks.Task<BaseItemDto> GetLivetvProgramsByIdAsync (string id);

        /// <summary>
        /// Gets a live tv program
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (BaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<BaseItemDto>> GetLivetvProgramsByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets an item from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of BaseItemDto</returns>
        System.Threading.Tasks.Task<BaseItemDto> GetUsersByUseridItemsByIdAsync (string userId, string id);

        /// <summary>
        /// Gets an item from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (BaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<BaseItemDto>> GetUsersByUseridItemsByIdAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Gets intros to play before the main media item plays
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetUsersByUseridItemsByIdIntrosAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets intros to play before the main media item plays
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetUsersByUseridItemsByIdIntrosAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets local trailers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        System.Threading.Tasks.Task<List<BaseItemDto>> GetUsersByUseridItemsByIdLocaltrailersAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets local trailers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetUsersByUseridItemsByIdLocaltrailersAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets special features for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        System.Threading.Tasks.Task<List<BaseItemDto>> GetUsersByUseridItemsByIdSpecialfeaturesAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets special features for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetUsersByUseridItemsByIdSpecialfeaturesAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets latest media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        System.Threading.Tasks.Task<List<BaseItemDto>> GetUsersByUseridItemsLatestAsync (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets latest media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetUsersByUseridItemsLatestAsyncWithHttpInfo (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Gets the root folder from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of BaseItemDto</returns>
        System.Threading.Tasks.Task<BaseItemDto> GetUsersByUseridItemsRootAsync (string userId);

        /// <summary>
        /// Gets the root folder from a user&#x27;s library
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of ApiResponse (BaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<BaseItemDto>> GetUsersByUseridItemsRootAsyncWithHttpInfo (string userId);
        /// <summary>
        /// Gets additional parts for a video.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetVideosByIdAdditionalpartsAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets additional parts for a video.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetVideosByIdAdditionalpartsAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        /// <summary>
        /// Updates user item access
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsAccessAsync (UserLibraryUpdateUserItemAccess body);

        /// <summary>
        /// Updates user item access
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsAccessAsyncWithHttpInfo (UserLibraryUpdateUserItemAccess body);
        /// <summary>
        /// Makes an item private
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsByIdMakeprivateAsync (string id);

        /// <summary>
        /// Makes an item private
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdMakeprivateAsyncWithHttpInfo (string id);
        /// <summary>
        /// Makes an item public to all users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsByIdMakepublicAsync (string id);

        /// <summary>
        /// Makes an item public to all users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdMakepublicAsyncWithHttpInfo (string id);
        /// <summary>
        /// Leaves a shared item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsSharedLeaveAsync (UserLibraryLeaveSharedItems body);

        /// <summary>
        /// Leaves a shared item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsSharedLeaveAsyncWithHttpInfo (UserLibraryLeaveSharedItems body);
        /// <summary>
        /// Marks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridFavoriteitemsByIdAsync (string userId, string id);

        /// <summary>
        /// Marks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridFavoriteitemsByIdAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridFavoriteitemsByIdDeleteAsync (string userId, string id);

        /// <summary>
        /// Unmarks an item as a favorite
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridFavoriteitemsByIdDeleteAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridItemsByIdHidefromresumeAsync (string userId, string id, bool? hide);

        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridItemsByIdHidefromresumeAsyncWithHttpInfo (string userId, string id, bool? hide);
        /// <summary>
        /// Updates a user&#x27;s rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridItemsByIdRatingAsync (string userId, string id, bool? likes);

        /// <summary>
        /// Updates a user&#x27;s rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridItemsByIdRatingAsyncWithHttpInfo (string userId, string id, bool? likes);
        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridItemsByIdRatingDeleteAsync (string userId, string id);

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridItemsByIdRatingDeleteAsyncWithHttpInfo (string userId, string id);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class UserLibraryServiceApi : IUserLibraryServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserLibraryServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public UserLibraryServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UserLibraryServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto DeleteUsersByUseridFavoriteitemsById (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = DeleteUsersByUseridFavoriteitemsByIdWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > DeleteUsersByUseridFavoriteitemsByIdWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->DeleteUsersByUseridFavoriteitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->DeleteUsersByUseridFavoriteitemsById");

            var localVarPath = "/Users/{UserId}/FavoriteItems/{Id}";
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridFavoriteitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> DeleteUsersByUseridFavoriteitemsByIdAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await DeleteUsersByUseridFavoriteitemsByIdAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> DeleteUsersByUseridFavoriteitemsByIdAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->DeleteUsersByUseridFavoriteitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->DeleteUsersByUseridFavoriteitemsById");

            var localVarPath = "/Users/{UserId}/FavoriteItems/{Id}";
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridFavoriteitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto DeleteUsersByUseridItemsByIdRating (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = DeleteUsersByUseridItemsByIdRatingWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > DeleteUsersByUseridItemsByIdRatingWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->DeleteUsersByUseridItemsByIdRating");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->DeleteUsersByUseridItemsByIdRating");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Rating";
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridItemsByIdRating", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> DeleteUsersByUseridItemsByIdRatingAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await DeleteUsersByUseridItemsByIdRatingAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> DeleteUsersByUseridItemsByIdRatingAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->DeleteUsersByUseridItemsByIdRating");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->DeleteUsersByUseridItemsByIdRating");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Rating";
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridItemsByIdRating", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Gets a live tv program Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>BaseItemDto</returns>
        public BaseItemDto GetLivetvProgramsById (string id)
        {
             ApiResponse<BaseItemDto> localVarResponse = GetLivetvProgramsByIdWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a live tv program Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of BaseItemDto</returns>
        public ApiResponse< BaseItemDto > GetLivetvProgramsByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetLivetvProgramsById");

            var localVarPath = "/LiveTv/Programs/{Id}";
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
                Exception exception = ExceptionFactory("GetLivetvProgramsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<BaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (BaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(BaseItemDto)));
        }

        /// <summary>
        /// Gets a live tv program Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of BaseItemDto</returns>
        public async System.Threading.Tasks.Task<BaseItemDto> GetLivetvProgramsByIdAsync (string id)
        {
             ApiResponse<BaseItemDto> localVarResponse = await GetLivetvProgramsByIdAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a live tv program Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (BaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<BaseItemDto>> GetLivetvProgramsByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetLivetvProgramsById");

            var localVarPath = "/LiveTv/Programs/{Id}";
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
                Exception exception = ExceptionFactory("GetLivetvProgramsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<BaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (BaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(BaseItemDto)));
        }

        /// <summary>
        /// Gets an item from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>BaseItemDto</returns>
        public BaseItemDto GetUsersByUseridItemsById (string userId, string id)
        {
             ApiResponse<BaseItemDto> localVarResponse = GetUsersByUseridItemsByIdWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets an item from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of BaseItemDto</returns>
        public ApiResponse< BaseItemDto > GetUsersByUseridItemsByIdWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsById");

            var localVarPath = "/Users/{UserId}/Items/{Id}";
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
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersByUseridItemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<BaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (BaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(BaseItemDto)));
        }

        /// <summary>
        /// Gets an item from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of BaseItemDto</returns>
        public async System.Threading.Tasks.Task<BaseItemDto> GetUsersByUseridItemsByIdAsync (string userId, string id)
        {
             ApiResponse<BaseItemDto> localVarResponse = await GetUsersByUseridItemsByIdAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets an item from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (BaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<BaseItemDto>> GetUsersByUseridItemsByIdAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsById");

            var localVarPath = "/Users/{UserId}/Items/{Id}";
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
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersByUseridItemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<BaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (BaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(BaseItemDto)));
        }

        /// <summary>
        /// Gets intros to play before the main media item plays Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetUsersByUseridItemsByIdIntros (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetUsersByUseridItemsByIdIntrosWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets intros to play before the main media item plays Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetUsersByUseridItemsByIdIntrosWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdIntros");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdIntros");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Intros";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsByIdIntros", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets intros to play before the main media item plays Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetUsersByUseridItemsByIdIntrosAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetUsersByUseridItemsByIdIntrosAsyncWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets intros to play before the main media item plays Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetUsersByUseridItemsByIdIntrosAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdIntros");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdIntros");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Intros";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsByIdIntros", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets local trailers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        public List<BaseItemDto> GetUsersByUseridItemsByIdLocaltrailers (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = GetUsersByUseridItemsByIdLocaltrailersWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets local trailers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        public ApiResponse< List<BaseItemDto> > GetUsersByUseridItemsByIdLocaltrailersWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdLocaltrailers");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdLocaltrailers");

            var localVarPath = "/Users/{UserId}/Items/{Id}/LocalTrailers";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsByIdLocaltrailers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets local trailers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<BaseItemDto>> GetUsersByUseridItemsByIdLocaltrailersAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = await GetUsersByUseridItemsByIdLocaltrailersAsyncWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets local trailers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetUsersByUseridItemsByIdLocaltrailersAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdLocaltrailers");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdLocaltrailers");

            var localVarPath = "/Users/{UserId}/Items/{Id}/LocalTrailers";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsByIdLocaltrailers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets special features for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        public List<BaseItemDto> GetUsersByUseridItemsByIdSpecialfeatures (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = GetUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets special features for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        public ApiResponse< List<BaseItemDto> > GetUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdSpecialfeatures");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdSpecialfeatures");

            var localVarPath = "/Users/{UserId}/Items/{Id}/SpecialFeatures";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsByIdSpecialfeatures", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets special features for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<BaseItemDto>> GetUsersByUseridItemsByIdSpecialfeaturesAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = await GetUsersByUseridItemsByIdSpecialfeaturesAsyncWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets special features for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Movie Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetUsersByUseridItemsByIdSpecialfeaturesAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdSpecialfeatures");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetUsersByUseridItemsByIdSpecialfeatures");

            var localVarPath = "/Users/{UserId}/Items/{Id}/SpecialFeatures";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsByIdSpecialfeatures", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets latest media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        public List<BaseItemDto> GetUsersByUseridItemsLatest (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = GetUsersByUseridItemsLatestWithHttpInfo(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets latest media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        public ApiResponse< List<BaseItemDto> > GetUsersByUseridItemsLatestWithHttpInfo (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsLatest");

            var localVarPath = "/Users/{UserId}/Items/Latest";
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
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (mediaTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaTypes", mediaTypes)); // query parameter
            if (isFolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFolder", isFolder)); // query parameter
            if (isPlayed != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPlayed", isPlayed)); // query parameter
            if (groupItems != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "GroupItems", groupItems)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsLatest", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets latest media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<BaseItemDto>> GetUsersByUseridItemsLatestAsync (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = await GetUsersByUseridItemsLatestAsyncWithHttpInfo(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets latest media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="limit">Limit (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isFolder">Filter by items that are folders, or not. (optional)</param>
        /// <param name="isPlayed">Filter by items that are played, or not. (optional)</param>
        /// <param name="groupItems">Whether or not to group items into a parent container. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetUsersByUseridItemsLatestAsyncWithHttpInfo (string userId, int? limit, string parentId, string fields, string includeItemTypes, string mediaTypes, bool? isFolder, bool? isPlayed, bool? groupItems, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsLatest");

            var localVarPath = "/Users/{UserId}/Items/Latest";
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
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (mediaTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaTypes", mediaTypes)); // query parameter
            if (isFolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFolder", isFolder)); // query parameter
            if (isPlayed != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPlayed", isPlayed)); // query parameter
            if (groupItems != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "GroupItems", groupItems)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsLatest", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets the root folder from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>BaseItemDto</returns>
        public BaseItemDto GetUsersByUseridItemsRoot (string userId)
        {
             ApiResponse<BaseItemDto> localVarResponse = GetUsersByUseridItemsRootWithHttpInfo(userId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the root folder from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>ApiResponse of BaseItemDto</returns>
        public ApiResponse< BaseItemDto > GetUsersByUseridItemsRootWithHttpInfo (string userId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsRoot");

            var localVarPath = "/Users/{UserId}/Items/Root";
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsRoot", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<BaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (BaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(BaseItemDto)));
        }

        /// <summary>
        /// Gets the root folder from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of BaseItemDto</returns>
        public async System.Threading.Tasks.Task<BaseItemDto> GetUsersByUseridItemsRootAsync (string userId)
        {
             ApiResponse<BaseItemDto> localVarResponse = await GetUsersByUseridItemsRootAsyncWithHttpInfo(userId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the root folder from a user&#x27;s library Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of ApiResponse (BaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<BaseItemDto>> GetUsersByUseridItemsRootAsyncWithHttpInfo (string userId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->GetUsersByUseridItemsRoot");

            var localVarPath = "/Users/{UserId}/Items/Root";
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
                Exception exception = ExceptionFactory("GetUsersByUseridItemsRoot", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<BaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (BaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(BaseItemDto)));
        }

        /// <summary>
        /// Gets additional parts for a video. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetVideosByIdAdditionalparts (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetVideosByIdAdditionalpartsWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets additional parts for a video. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetVideosByIdAdditionalpartsWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetVideosByIdAdditionalparts");

            var localVarPath = "/Videos/{Id}/AdditionalParts";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdAdditionalparts", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets additional parts for a video. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetVideosByIdAdditionalpartsAsync (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetVideosByIdAdditionalpartsAsyncWithHttpInfo(userId, fields, id, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets additional parts for a video. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetVideosByIdAdditionalpartsAsyncWithHttpInfo (string userId, string fields, string id, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->GetVideosByIdAdditionalparts");

            var localVarPath = "/Videos/{Id}/AdditionalParts";
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
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdAdditionalparts", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Updates user item access Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns></returns>
        public void PostItemsAccess (UserLibraryUpdateUserItemAccess body)
        {
             PostItemsAccessWithHttpInfo(body);
        }

        /// <summary>
        /// Updates user item access Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsAccessWithHttpInfo (UserLibraryUpdateUserItemAccess body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserLibraryServiceApi->PostItemsAccess");

            var localVarPath = "/Items/Access";
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
                Exception exception = ExceptionFactory("PostItemsAccess", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates user item access Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsAccessAsync (UserLibraryUpdateUserItemAccess body)
        {
             await PostItemsAccessAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Updates user item access Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserItemAccess</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsAccessAsyncWithHttpInfo (UserLibraryUpdateUserItemAccess body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserLibraryServiceApi->PostItemsAccess");

            var localVarPath = "/Items/Access";
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
                Exception exception = ExceptionFactory("PostItemsAccess", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Makes an item private Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void PostItemsByIdMakeprivate (string id)
        {
             PostItemsByIdMakeprivateWithHttpInfo(id);
        }

        /// <summary>
        /// Makes an item private Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsByIdMakeprivateWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostItemsByIdMakeprivate");

            var localVarPath = "/Items/{Id}/MakePrivate";
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
                Exception exception = ExceptionFactory("PostItemsByIdMakeprivate", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Makes an item private Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsByIdMakeprivateAsync (string id)
        {
             await PostItemsByIdMakeprivateAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Makes an item private Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdMakeprivateAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostItemsByIdMakeprivate");

            var localVarPath = "/Items/{Id}/MakePrivate";
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
                Exception exception = ExceptionFactory("PostItemsByIdMakeprivate", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Makes an item public to all users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void PostItemsByIdMakepublic (string id)
        {
             PostItemsByIdMakepublicWithHttpInfo(id);
        }

        /// <summary>
        /// Makes an item public to all users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsByIdMakepublicWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostItemsByIdMakepublic");

            var localVarPath = "/Items/{Id}/MakePublic";
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
                Exception exception = ExceptionFactory("PostItemsByIdMakepublic", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Makes an item public to all users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsByIdMakepublicAsync (string id)
        {
             await PostItemsByIdMakepublicAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Makes an item public to all users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdMakepublicAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostItemsByIdMakepublic");

            var localVarPath = "/Items/{Id}/MakePublic";
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
                Exception exception = ExceptionFactory("PostItemsByIdMakepublic", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Leaves a shared item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns></returns>
        public void PostItemsSharedLeave (UserLibraryLeaveSharedItems body)
        {
             PostItemsSharedLeaveWithHttpInfo(body);
        }

        /// <summary>
        /// Leaves a shared item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsSharedLeaveWithHttpInfo (UserLibraryLeaveSharedItems body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserLibraryServiceApi->PostItemsSharedLeave");

            var localVarPath = "/Items/Shared/Leave";
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
                Exception exception = ExceptionFactory("PostItemsSharedLeave", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Leaves a shared item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsSharedLeaveAsync (UserLibraryLeaveSharedItems body)
        {
             await PostItemsSharedLeaveAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Leaves a shared item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">LeaveSharedItems</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsSharedLeaveAsyncWithHttpInfo (UserLibraryLeaveSharedItems body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserLibraryServiceApi->PostItemsSharedLeave");

            var localVarPath = "/Items/Shared/Leave";
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
                Exception exception = ExceptionFactory("PostItemsSharedLeave", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridFavoriteitemsById (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridFavoriteitemsByIdWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Marks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridFavoriteitemsByIdWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsById");

            var localVarPath = "/Users/{UserId}/FavoriteItems/{Id}";
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
                Exception exception = ExceptionFactory("PostUsersByUseridFavoriteitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Marks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridFavoriteitemsByIdAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridFavoriteitemsByIdAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Marks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridFavoriteitemsByIdAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsById");

            var localVarPath = "/Users/{UserId}/FavoriteItems/{Id}";
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
                Exception exception = ExceptionFactory("PostUsersByUseridFavoriteitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridFavoriteitemsByIdDelete (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsByIdDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsByIdDelete");

            var localVarPath = "/Users/{UserId}/FavoriteItems/{Id}/Delete";
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
                Exception exception = ExceptionFactory("PostUsersByUseridFavoriteitemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridFavoriteitemsByIdDeleteAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridFavoriteitemsByIdDeleteAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Unmarks an item as a favorite Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridFavoriteitemsByIdDeleteAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsByIdDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridFavoriteitemsByIdDelete");

            var localVarPath = "/Users/{UserId}/FavoriteItems/{Id}/Delete";
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
                Exception exception = ExceptionFactory("PostUsersByUseridFavoriteitemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridItemsByIdHidefromresume (string userId, string id, bool? hide)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridItemsByIdHidefromresumeWithHttpInfo(userId, id, hide);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridItemsByIdHidefromresumeWithHttpInfo (string userId, string id, bool? hide)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdHidefromresume");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdHidefromresume");
            // verify the required parameter 'hide' is set
            if (hide == null)
                throw new ApiException(400, "Missing required parameter 'hide' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdHidefromresume");

            var localVarPath = "/Users/{UserId}/Items/{Id}/HideFromResume";
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
            if (hide != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Hide", hide)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByIdHidefromresume", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridItemsByIdHidefromresumeAsync (string userId, string id, bool? hide)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridItemsByIdHidefromresumeAsyncWithHttpInfo(userId, id, hide);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Updates a user&#x27;s hide from resume for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="hide">Whether the item should be hidden from reusme or not. true/false</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridItemsByIdHidefromresumeAsyncWithHttpInfo (string userId, string id, bool? hide)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdHidefromresume");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdHidefromresume");
            // verify the required parameter 'hide' is set
            if (hide == null)
                throw new ApiException(400, "Missing required parameter 'hide' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdHidefromresume");

            var localVarPath = "/Users/{UserId}/Items/{Id}/HideFromResume";
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
            if (hide != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Hide", hide)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByIdHidefromresume", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Updates a user&#x27;s rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridItemsByIdRating (string userId, string id, bool? likes)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridItemsByIdRatingWithHttpInfo(userId, id, likes);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Updates a user&#x27;s rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridItemsByIdRatingWithHttpInfo (string userId, string id, bool? likes)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRating");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRating");
            // verify the required parameter 'likes' is set
            if (likes == null)
                throw new ApiException(400, "Missing required parameter 'likes' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRating");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Rating";
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
            if (likes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Likes", likes)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByIdRating", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Updates a user&#x27;s rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridItemsByIdRatingAsync (string userId, string id, bool? likes)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridItemsByIdRatingAsyncWithHttpInfo(userId, id, likes);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Updates a user&#x27;s rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="likes">Whether the user likes the item or not. true/false</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridItemsByIdRatingAsyncWithHttpInfo (string userId, string id, bool? likes)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRating");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRating");
            // verify the required parameter 'likes' is set
            if (likes == null)
                throw new ApiException(400, "Missing required parameter 'likes' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRating");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Rating";
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
            if (likes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Likes", likes)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByIdRating", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridItemsByIdRatingDelete (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridItemsByIdRatingDeleteWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridItemsByIdRatingDeleteWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRatingDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRatingDelete");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Rating/Delete";
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByIdRatingDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridItemsByIdRatingDeleteAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridItemsByIdRatingDeleteAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Deletes a user&#x27;s saved personal rating for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridItemsByIdRatingDeleteAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRatingDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserLibraryServiceApi->PostUsersByUseridItemsByIdRatingDelete");

            var localVarPath = "/Users/{UserId}/Items/{Id}/Rating/Delete";
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByIdRatingDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

    }
}
