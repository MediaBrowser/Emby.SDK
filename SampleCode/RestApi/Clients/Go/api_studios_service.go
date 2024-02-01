
/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

import (
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"fmt"
	"github.com/antihax/optional"
)

// Linger please
var (
	_ context.Context
)

type StudiosServiceApiService service
/*
StudiosServiceApiService Gets all studios from a given item, folder, or the entire library
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *StudiosServiceApiGetStudiosOpts - Optional Parameters:
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.
@return QueryResultBaseItemDto
*/

type StudiosServiceApiGetStudiosOpts struct {
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *StudiosServiceApiService) GetStudios(ctx context.Context, localVarOptionals *StudiosServiceApiGetStudiosOpts) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Studios"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v QueryResultBaseItemDto
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
/*
StudiosServiceApiService Gets a studio, by name
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name The studio name
 * @param optional nil or *StudiosServiceApiGetStudiosByNameOpts - Optional Parameters:
     * @param "UserId" (optional.String) -  Optional. Filter by user id, and attach user data
@return BaseItemDto
*/

type StudiosServiceApiGetStudiosByNameOpts struct {
    UserId optional.String
}

func (a *StudiosServiceApiService) GetStudiosByName(ctx context.Context, name string, localVarOptionals *StudiosServiceApiGetStudiosByNameOpts) (BaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue BaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Studios/{Name}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v BaseItemDto
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
