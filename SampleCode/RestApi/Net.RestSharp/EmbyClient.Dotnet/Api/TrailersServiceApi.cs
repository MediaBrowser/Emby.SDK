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
        public interface ITrailersServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetTrailers (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan);

        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetTrailersWithHttpInfo (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetTrailersAsync (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan);

        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetTrailersAsyncWithHttpInfo (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class TrailersServiceApi : ITrailersServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TrailersServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TrailersServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TrailersServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public TrailersServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TrailersServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TrailersServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetTrailers (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetTrailersWithHttpInfo(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetTrailersWithHttpInfo (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan)
        {

            var localVarPath = "/Trailers";
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

            if (artistType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ArtistType", artistType)); // query parameter
            if (maxOfficialRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxOfficialRating", maxOfficialRating)); // query parameter
            if (hasThemeSong != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasThemeSong", hasThemeSong)); // query parameter
            if (hasThemeVideo != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasThemeVideo", hasThemeVideo)); // query parameter
            if (hasSubtitles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasSubtitles", hasSubtitles)); // query parameter
            if (hasSpecialFeature != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasSpecialFeature", hasSpecialFeature)); // query parameter
            if (hasTrailer != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasTrailer", hasTrailer)); // query parameter
            if (isSpecialSeason != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsSpecialSeason", isSpecialSeason)); // query parameter
            if (adjacentTo != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AdjacentTo", adjacentTo)); // query parameter
            if (startItemId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartItemId", startItemId)); // query parameter
            if (minIndexNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinIndexNumber", minIndexNumber)); // query parameter
            if (minStartDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinStartDate", minStartDate)); // query parameter
            if (maxStartDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxStartDate", maxStartDate)); // query parameter
            if (minEndDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinEndDate", minEndDate)); // query parameter
            if (maxEndDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxEndDate", maxEndDate)); // query parameter
            if (minPlayers != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinPlayers", minPlayers)); // query parameter
            if (maxPlayers != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxPlayers", maxPlayers)); // query parameter
            if (parentIndexNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentIndexNumber", parentIndexNumber)); // query parameter
            if (hasParentalRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasParentalRating", hasParentalRating)); // query parameter
            if (isHD != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHD", isHD)); // query parameter
            if (isUnaired != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsUnaired", isUnaired)); // query parameter
            if (minCommunityRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinCommunityRating", minCommunityRating)); // query parameter
            if (minCriticRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinCriticRating", minCriticRating)); // query parameter
            if (airedDuringSeason != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AiredDuringSeason", airedDuringSeason)); // query parameter
            if (minPremiereDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinPremiereDate", minPremiereDate)); // query parameter
            if (minDateLastSaved != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinDateLastSaved", minDateLastSaved)); // query parameter
            if (minDateLastSavedForUser != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinDateLastSavedForUser", minDateLastSavedForUser)); // query parameter
            if (maxPremiereDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxPremiereDate", maxPremiereDate)); // query parameter
            if (hasOverview != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasOverview", hasOverview)); // query parameter
            if (hasImdbId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasImdbId", hasImdbId)); // query parameter
            if (hasTmdbId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasTmdbId", hasTmdbId)); // query parameter
            if (hasTvdbId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasTvdbId", hasTvdbId)); // query parameter
            if (excludeItemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExcludeItemIds", excludeItemIds)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (recursive != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Recursive", recursive)); // query parameter
            if (searchTerm != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SearchTerm", searchTerm)); // query parameter
            if (sortOrder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SortOrder", sortOrder)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (excludeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExcludeItemTypes", excludeItemTypes)); // query parameter
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (anyProviderIdEquals != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AnyProviderIdEquals", anyProviderIdEquals)); // query parameter
            if (filters != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Filters", filters)); // query parameter
            if (isFavorite != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFavorite", isFavorite)); // query parameter
            if (isMovie != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsMovie", isMovie)); // query parameter
            if (isSeries != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsSeries", isSeries)); // query parameter
            if (isFolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFolder", isFolder)); // query parameter
            if (isNews != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsNews", isNews)); // query parameter
            if (isKids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsKids", isKids)); // query parameter
            if (isSports != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsSports", isSports)); // query parameter
            if (isNew != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsNew", isNew)); // query parameter
            if (isPremiere != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPremiere", isPremiere)); // query parameter
            if (isNewOrPremiere != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsNewOrPremiere", isNewOrPremiere)); // query parameter
            if (isRepeat != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsRepeat", isRepeat)); // query parameter
            if (projectToMedia != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProjectToMedia", projectToMedia)); // query parameter
            if (mediaTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaTypes", mediaTypes)); // query parameter
            if (imageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypes", imageTypes)); // query parameter
            if (sortBy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SortBy", sortBy)); // query parameter
            if (isPlayed != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPlayed", isPlayed)); // query parameter
            if (genres != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Genres", genres)); // query parameter
            if (officialRatings != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "OfficialRatings", officialRatings)); // query parameter
            if (tags != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Tags", tags)); // query parameter
            if (excludeTags != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExcludeTags", excludeTags)); // query parameter
            if (years != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Years", years)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (person != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Person", person)); // query parameter
            if (personIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PersonIds", personIds)); // query parameter
            if (personTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PersonTypes", personTypes)); // query parameter
            if (studios != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Studios", studios)); // query parameter
            if (studioIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StudioIds", studioIds)); // query parameter
            if (artists != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Artists", artists)); // query parameter
            if (artistIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ArtistIds", artistIds)); // query parameter
            if (albums != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Albums", albums)); // query parameter
            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
            if (videoTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoTypes", videoTypes)); // query parameter
            if (containers != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Containers", containers)); // query parameter
            if (audioCodecs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodecs", audioCodecs)); // query parameter
            if (audioLayouts != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioLayouts", audioLayouts)); // query parameter
            if (videoCodecs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodecs", videoCodecs)); // query parameter
            if (extendedVideoTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExtendedVideoTypes", extendedVideoTypes)); // query parameter
            if (subtitleCodecs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleCodecs", subtitleCodecs)); // query parameter
            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (minOfficialRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinOfficialRating", minOfficialRating)); // query parameter
            if (isLocked != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsLocked", isLocked)); // query parameter
            if (isPlaceHolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPlaceHolder", isPlaceHolder)); // query parameter
            if (hasOfficialRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasOfficialRating", hasOfficialRating)); // query parameter
            if (groupItemsIntoCollections != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "GroupItemsIntoCollections", groupItemsIntoCollections)); // query parameter
            if (is3D != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Is3D", is3D)); // query parameter
            if (seriesStatus != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SeriesStatus", seriesStatus)); // query parameter
            if (nameStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWithOrGreater", nameStartsWithOrGreater)); // query parameter
            if (artistStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ArtistStartsWithOrGreater", artistStartsWithOrGreater)); // query parameter
            if (albumArtistStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater)); // query parameter
            if (nameStartsWith != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWith", nameStartsWith)); // query parameter
            if (nameLessThan != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameLessThan", nameLessThan)); // query parameter
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
                Exception exception = ExceptionFactory("GetTrailers", localVarResponse);
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
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetTrailersAsync (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetTrailersAsyncWithHttpInfo(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="artistType">Artist or AlbumArtist (optional)</param>
        /// <param name="maxOfficialRating">Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="hasThemeSong">Optional filter by items with theme songs. (optional)</param>
        /// <param name="hasThemeVideo">Optional filter by items with theme videos. (optional)</param>
        /// <param name="hasSubtitles">Optional filter by items with subtitles. (optional)</param>
        /// <param name="hasSpecialFeature">Optional filter by items with special features. (optional)</param>
        /// <param name="hasTrailer">Optional filter by items with trailers. (optional)</param>
        /// <param name="isSpecialSeason">Optional. Filter by special season. (optional)</param>
        /// <param name="adjacentTo">Optional. Return items that are siblings of a supplied item. (optional)</param>
        /// <param name="startItemId">Optional. Skip through the list until a given item is found. (optional)</param>
        /// <param name="minIndexNumber">Optional filter by minimum index number. (optional)</param>
        /// <param name="minStartDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxStartDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minEndDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxEndDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minPlayers">Optional filter by minimum number of game players. (optional)</param>
        /// <param name="maxPlayers">Optional filter by maximum number of game players. (optional)</param>
        /// <param name="parentIndexNumber">Optional filter by parent index number. (optional)</param>
        /// <param name="hasParentalRating">Optional filter by items that have or do not have a parental rating (optional)</param>
        /// <param name="isHD">Optional filter by items that are HD or not. (optional)</param>
        /// <param name="isUnaired">Optional filter by items that are unaired episodes or not. (optional)</param>
        /// <param name="minCommunityRating">Optional filter by minimum community rating. (optional)</param>
        /// <param name="minCriticRating">Optional filter by minimum critic rating. (optional)</param>
        /// <param name="airedDuringSeason">Gets all episodes that aired during a season, including specials. (optional)</param>
        /// <param name="minPremiereDate">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSaved">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="minDateLastSavedForUser">Optional. The minimum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="maxPremiereDate">Optional. The maximum premiere date. Format &#x3D; ISO (optional)</param>
        /// <param name="hasOverview">Optional filter by items that have an overview or not. (optional)</param>
        /// <param name="hasImdbId">Optional filter by items that have an imdb id or not. (optional)</param>
        /// <param name="hasTmdbId">Optional filter by items that have a tmdb id or not. (optional)</param>
        /// <param name="hasTvdbId">Optional filter by items that have a tvdb id or not. (optional)</param>
        /// <param name="excludeItemIds">Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="recursive">When searching within folders, this determines whether or not the search will be recursive. true/false (optional)</param>
        /// <param name="searchTerm">Enter a search term to perform a search request (optional)</param>
        /// <param name="sortOrder">Sort Order - Ascending,Descending (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)</param>
        /// <param name="excludeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="anyProviderIdEquals">Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)</param>
        /// <param name="filters">Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)</param>
        /// <param name="isFavorite">Optional filter by items that are marked as favorite, or not. (optional)</param>
        /// <param name="isMovie">Optional filter for movies. (optional)</param>
        /// <param name="isSeries">Optional filter for series. (optional)</param>
        /// <param name="isFolder">Optional filter for folders. (optional)</param>
        /// <param name="isNews">Optional filter for news. (optional)</param>
        /// <param name="isKids">Optional filter for kids. (optional)</param>
        /// <param name="isSports">Optional filter for sports. (optional)</param>
        /// <param name="isNew">Optional filter for IsNew. (optional)</param>
        /// <param name="isPremiere">Optional filter for IsPremiere. (optional)</param>
        /// <param name="isNewOrPremiere">Optional filter for IsNewOrPremiere. (optional)</param>
        /// <param name="isRepeat">Optional filter for IsRepeat. (optional)</param>
        /// <param name="projectToMedia">ProjectToMedia (optional)</param>
        /// <param name="mediaTypes">Optional filter by MediaType. Allows multiple, comma delimited. (optional)</param>
        /// <param name="imageTypes">Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)</param>
        /// <param name="sortBy">Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)</param>
        /// <param name="isPlayed">Optional filter by items that are played, or not. (optional)</param>
        /// <param name="genres">Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="officialRatings">Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="tags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="excludeTags">Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="years">Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="person">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personIds">Optional. If specified, results will be filtered to include only those containing the specified person. (optional)</param>
        /// <param name="personTypes">Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)</param>
        /// <param name="studios">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="studioIds">Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artists">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="artistIds">Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="albums">Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)</param>
        /// <param name="ids">Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)</param>
        /// <param name="videoTypes">Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)</param>
        /// <param name="containers">Optional filter by Container. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioCodecs">Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="audioLayouts">Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="videoCodecs">Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="extendedVideoTypes">Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="subtitleCodecs">Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="path">Optional filter by Path. (optional)</param>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="minOfficialRating">Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)</param>
        /// <param name="isLocked">Optional filter by items that are locked. (optional)</param>
        /// <param name="isPlaceHolder">Optional filter by items that are placeholders (optional)</param>
        /// <param name="hasOfficialRating">Optional filter by items that have official ratings (optional)</param>
        /// <param name="groupItemsIntoCollections">Whether or not to hide items behind their boxsets. (optional)</param>
        /// <param name="is3D">Optional filter by items that are 3D, or not. (optional)</param>
        /// <param name="seriesStatus">Optional filter by Series Status. Allows multiple, comma delimeted. (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="artistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="albumArtistStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <param name="nameStartsWith">Optional filter by items whose name is sorted equally than a given input string. (optional)</param>
        /// <param name="nameLessThan">Optional filter by items whose name is equally or lesser than a given input string. (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetTrailersAsyncWithHttpInfo (string artistType, string maxOfficialRating, bool? hasThemeSong, bool? hasThemeVideo, bool? hasSubtitles, bool? hasSpecialFeature, bool? hasTrailer, bool? isSpecialSeason, string adjacentTo, string startItemId, int? minIndexNumber, DateTimeOffset? minStartDate, DateTimeOffset? maxStartDate, DateTimeOffset? minEndDate, DateTimeOffset? maxEndDate, int? minPlayers, int? maxPlayers, int? parentIndexNumber, bool? hasParentalRating, bool? isHD, bool? isUnaired, double? minCommunityRating, double? minCriticRating, int? airedDuringSeason, DateTimeOffset? minPremiereDate, DateTimeOffset? minDateLastSaved, DateTimeOffset? minDateLastSavedForUser, DateTimeOffset? maxPremiereDate, bool? hasOverview, bool? hasImdbId, bool? hasTmdbId, bool? hasTvdbId, string excludeItemIds, int? startIndex, int? limit, bool? recursive, string searchTerm, string sortOrder, string parentId, string fields, string excludeItemTypes, string includeItemTypes, string anyProviderIdEquals, string filters, bool? isFavorite, bool? isMovie, bool? isSeries, bool? isFolder, bool? isNews, bool? isKids, bool? isSports, bool? isNew, bool? isPremiere, bool? isNewOrPremiere, bool? isRepeat, bool? projectToMedia, string mediaTypes, string imageTypes, string sortBy, bool? isPlayed, string genres, string officialRatings, string tags, string excludeTags, string years, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string person, string personIds, string personTypes, string studios, string studioIds, string artists, string artistIds, string albums, string ids, string videoTypes, string containers, string audioCodecs, string audioLayouts, string videoCodecs, string extendedVideoTypes, string subtitleCodecs, string path, string userId, string minOfficialRating, bool? isLocked, bool? isPlaceHolder, bool? hasOfficialRating, bool? groupItemsIntoCollections, bool? is3D, string seriesStatus, string nameStartsWithOrGreater, string artistStartsWithOrGreater, string albumArtistStartsWithOrGreater, string nameStartsWith, string nameLessThan)
        {

            var localVarPath = "/Trailers";
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

            if (artistType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ArtistType", artistType)); // query parameter
            if (maxOfficialRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxOfficialRating", maxOfficialRating)); // query parameter
            if (hasThemeSong != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasThemeSong", hasThemeSong)); // query parameter
            if (hasThemeVideo != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasThemeVideo", hasThemeVideo)); // query parameter
            if (hasSubtitles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasSubtitles", hasSubtitles)); // query parameter
            if (hasSpecialFeature != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasSpecialFeature", hasSpecialFeature)); // query parameter
            if (hasTrailer != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasTrailer", hasTrailer)); // query parameter
            if (isSpecialSeason != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsSpecialSeason", isSpecialSeason)); // query parameter
            if (adjacentTo != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AdjacentTo", adjacentTo)); // query parameter
            if (startItemId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartItemId", startItemId)); // query parameter
            if (minIndexNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinIndexNumber", minIndexNumber)); // query parameter
            if (minStartDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinStartDate", minStartDate)); // query parameter
            if (maxStartDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxStartDate", maxStartDate)); // query parameter
            if (minEndDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinEndDate", minEndDate)); // query parameter
            if (maxEndDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxEndDate", maxEndDate)); // query parameter
            if (minPlayers != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinPlayers", minPlayers)); // query parameter
            if (maxPlayers != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxPlayers", maxPlayers)); // query parameter
            if (parentIndexNumber != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentIndexNumber", parentIndexNumber)); // query parameter
            if (hasParentalRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasParentalRating", hasParentalRating)); // query parameter
            if (isHD != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHD", isHD)); // query parameter
            if (isUnaired != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsUnaired", isUnaired)); // query parameter
            if (minCommunityRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinCommunityRating", minCommunityRating)); // query parameter
            if (minCriticRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinCriticRating", minCriticRating)); // query parameter
            if (airedDuringSeason != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AiredDuringSeason", airedDuringSeason)); // query parameter
            if (minPremiereDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinPremiereDate", minPremiereDate)); // query parameter
            if (minDateLastSaved != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinDateLastSaved", minDateLastSaved)); // query parameter
            if (minDateLastSavedForUser != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinDateLastSavedForUser", minDateLastSavedForUser)); // query parameter
            if (maxPremiereDate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxPremiereDate", maxPremiereDate)); // query parameter
            if (hasOverview != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasOverview", hasOverview)); // query parameter
            if (hasImdbId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasImdbId", hasImdbId)); // query parameter
            if (hasTmdbId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasTmdbId", hasTmdbId)); // query parameter
            if (hasTvdbId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasTvdbId", hasTvdbId)); // query parameter
            if (excludeItemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExcludeItemIds", excludeItemIds)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (recursive != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Recursive", recursive)); // query parameter
            if (searchTerm != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SearchTerm", searchTerm)); // query parameter
            if (sortOrder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SortOrder", sortOrder)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (excludeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExcludeItemTypes", excludeItemTypes)); // query parameter
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (anyProviderIdEquals != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AnyProviderIdEquals", anyProviderIdEquals)); // query parameter
            if (filters != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Filters", filters)); // query parameter
            if (isFavorite != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFavorite", isFavorite)); // query parameter
            if (isMovie != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsMovie", isMovie)); // query parameter
            if (isSeries != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsSeries", isSeries)); // query parameter
            if (isFolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFolder", isFolder)); // query parameter
            if (isNews != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsNews", isNews)); // query parameter
            if (isKids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsKids", isKids)); // query parameter
            if (isSports != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsSports", isSports)); // query parameter
            if (isNew != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsNew", isNew)); // query parameter
            if (isPremiere != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPremiere", isPremiere)); // query parameter
            if (isNewOrPremiere != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsNewOrPremiere", isNewOrPremiere)); // query parameter
            if (isRepeat != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsRepeat", isRepeat)); // query parameter
            if (projectToMedia != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProjectToMedia", projectToMedia)); // query parameter
            if (mediaTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaTypes", mediaTypes)); // query parameter
            if (imageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypes", imageTypes)); // query parameter
            if (sortBy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SortBy", sortBy)); // query parameter
            if (isPlayed != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPlayed", isPlayed)); // query parameter
            if (genres != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Genres", genres)); // query parameter
            if (officialRatings != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "OfficialRatings", officialRatings)); // query parameter
            if (tags != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Tags", tags)); // query parameter
            if (excludeTags != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExcludeTags", excludeTags)); // query parameter
            if (years != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Years", years)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (person != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Person", person)); // query parameter
            if (personIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PersonIds", personIds)); // query parameter
            if (personTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PersonTypes", personTypes)); // query parameter
            if (studios != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Studios", studios)); // query parameter
            if (studioIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StudioIds", studioIds)); // query parameter
            if (artists != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Artists", artists)); // query parameter
            if (artistIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ArtistIds", artistIds)); // query parameter
            if (albums != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Albums", albums)); // query parameter
            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
            if (videoTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoTypes", videoTypes)); // query parameter
            if (containers != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Containers", containers)); // query parameter
            if (audioCodecs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodecs", audioCodecs)); // query parameter
            if (audioLayouts != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioLayouts", audioLayouts)); // query parameter
            if (videoCodecs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodecs", videoCodecs)); // query parameter
            if (extendedVideoTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ExtendedVideoTypes", extendedVideoTypes)); // query parameter
            if (subtitleCodecs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleCodecs", subtitleCodecs)); // query parameter
            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (minOfficialRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MinOfficialRating", minOfficialRating)); // query parameter
            if (isLocked != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsLocked", isLocked)); // query parameter
            if (isPlaceHolder != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPlaceHolder", isPlaceHolder)); // query parameter
            if (hasOfficialRating != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "HasOfficialRating", hasOfficialRating)); // query parameter
            if (groupItemsIntoCollections != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "GroupItemsIntoCollections", groupItemsIntoCollections)); // query parameter
            if (is3D != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Is3D", is3D)); // query parameter
            if (seriesStatus != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SeriesStatus", seriesStatus)); // query parameter
            if (nameStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWithOrGreater", nameStartsWithOrGreater)); // query parameter
            if (artistStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ArtistStartsWithOrGreater", artistStartsWithOrGreater)); // query parameter
            if (albumArtistStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater)); // query parameter
            if (nameStartsWith != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWith", nameStartsWith)); // query parameter
            if (nameLessThan != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameLessThan", nameLessThan)); // query parameter
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
                Exception exception = ExceptionFactory("GetTrailers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

    }
}
