/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

// This is strictly used as a data transfer object from the api layer. This holds information about a BaseItem in a format that is convenient for the client.  
type BaseItemDto struct {
	// The name.
	Name string `json:"Name,omitempty"`
	OriginalTitle string `json:"OriginalTitle,omitempty"`
	// The server identifier.
	ServerId string `json:"ServerId,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
	Guid string `json:"Guid,omitempty"`
	// The etag.
	Etag string `json:"Etag,omitempty"`
	// The Prefix.
	Prefix string `json:"Prefix,omitempty"`
	// The playlist item identifier.
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
	// The date created.
	DateCreated time.Time `json:"DateCreated,omitempty"`
	ExtraType string `json:"ExtraType,omitempty"`
	SortIndexNumber int32 `json:"SortIndexNumber,omitempty"`
	SortParentIndexNumber int32 `json:"SortParentIndexNumber,omitempty"`
	CanDelete bool `json:"CanDelete,omitempty"`
	CanDownload bool `json:"CanDownload,omitempty"`
	CanEditItems bool `json:"CanEditItems,omitempty"`
	SupportsResume bool `json:"SupportsResume,omitempty"`
	PresentationUniqueKey string `json:"PresentationUniqueKey,omitempty"`
	PreferredMetadataLanguage string `json:"PreferredMetadataLanguage,omitempty"`
	PreferredMetadataCountryCode string `json:"PreferredMetadataCountryCode,omitempty"`
	// A value indicating whether \\[supports synchronize\\].
	SupportsSync bool `json:"SupportsSync,omitempty"`
	SyncStatus *SyncJobItemStatus `json:"SyncStatus,omitempty"`
	CanManageAccess bool `json:"CanManageAccess,omitempty"`
	CanLeaveContent bool `json:"CanLeaveContent,omitempty"`
	CanMakePublic bool `json:"CanMakePublic,omitempty"`
	Container string `json:"Container,omitempty"`
	// The name of the sort.
	SortName string `json:"SortName,omitempty"`
	ForcedSortName string `json:"ForcedSortName,omitempty"`
	Video3DFormat *Video3DFormat `json:"Video3DFormat,omitempty"`
	// The premiere date.
	PremiereDate time.Time `json:"PremiereDate,omitempty"`
	// The external urls.
	ExternalUrls []ExternalUrl `json:"ExternalUrls,omitempty"`
	// The media versions.
	MediaSources []MediaSourceInfo `json:"MediaSources,omitempty"`
	// The critic rating.
	CriticRating float32 `json:"CriticRating,omitempty"`
	GameSystemId int64 `json:"GameSystemId,omitempty"`
	AsSeries bool `json:"AsSeries,omitempty"`
	// The game system.
	GameSystem string `json:"GameSystem,omitempty"`
	ProductionLocations []string `json:"ProductionLocations,omitempty"`
	// The path.
	Path string `json:"Path,omitempty"`
	// The official rating.
	OfficialRating string `json:"OfficialRating,omitempty"`
	// The custom rating.
	CustomRating string `json:"CustomRating,omitempty"`
	// The channel identifier.
	ChannelId string `json:"ChannelId,omitempty"`
	ChannelName string `json:"ChannelName,omitempty"`
	// The overview.
	Overview string `json:"Overview,omitempty"`
	// The taglines.
	Taglines []string `json:"Taglines,omitempty"`
	// The genres.
	Genres []string `json:"Genres,omitempty"`
	// The community rating.
	CommunityRating float32 `json:"CommunityRating,omitempty"`
	// The run time ticks.
	RunTimeTicks int64 `json:"RunTimeTicks,omitempty"`
	Size int64 `json:"Size,omitempty"`
	FileName string `json:"FileName,omitempty"`
	Bitrate int32 `json:"Bitrate,omitempty"`
	// The production year.
	ProductionYear int32 `json:"ProductionYear,omitempty"`
	// The number.
	Number string `json:"Number,omitempty"`
	ChannelNumber string `json:"ChannelNumber,omitempty"`
	// The index number.
	IndexNumber int32 `json:"IndexNumber,omitempty"`
	// The index number end.
	IndexNumberEnd int32 `json:"IndexNumberEnd,omitempty"`
	// The parent index number.
	ParentIndexNumber int32 `json:"ParentIndexNumber,omitempty"`
	// The trailer urls.
	RemoteTrailers []MediaUrl `json:"RemoteTrailers,omitempty"`
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`
	// A value indicating whether this instance is folder.
	IsFolder bool `json:"IsFolder,omitempty"`
	// The parent id.
	ParentId string `json:"ParentId,omitempty"`
	// The type.
	Type_ string `json:"Type,omitempty"`
	// The people.
	People []BaseItemPerson `json:"People,omitempty"`
	// The studios.
	Studios []NameLongIdPair `json:"Studios,omitempty"`
	GenreItems []NameLongIdPair `json:"GenreItems,omitempty"`
	TagItems []NameLongIdPair `json:"TagItems,omitempty"`
	// If the item does not have a logo, this will hold the Id of the Parent that has one.
	ParentLogoItemId string `json:"ParentLogoItemId,omitempty"`
	// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	ParentBackdropItemId string `json:"ParentBackdropItemId,omitempty"`
	// The parent backdrop image tags.
	ParentBackdropImageTags []string `json:"ParentBackdropImageTags,omitempty"`
	// The local trailer count.
	LocalTrailerCount int32 `json:"LocalTrailerCount,omitempty"`
	UserData *UserItemDataDto `json:"UserData,omitempty"`
	// The recursive item count.
	RecursiveItemCount int32 `json:"RecursiveItemCount,omitempty"`
	// The child count.
	ChildCount int32 `json:"ChildCount,omitempty"`
	// The name of the series.
	SeriesName string `json:"SeriesName,omitempty"`
	// The series id.
	SeriesId string `json:"SeriesId,omitempty"`
	// The season identifier.
	SeasonId string `json:"SeasonId,omitempty"`
	// The special feature count.
	SpecialFeatureCount int32 `json:"SpecialFeatureCount,omitempty"`
	// The display preferences id.
	DisplayPreferencesId string `json:"DisplayPreferencesId,omitempty"`
	// The status.
	Status string `json:"Status,omitempty"`
	// The air days.
	AirDays []DayOfWeek `json:"AirDays,omitempty"`
	// The tags.
	Tags []string `json:"Tags,omitempty"`
	// The primary image aspect ratio, after image enhancements.
	PrimaryImageAspectRatio float64 `json:"PrimaryImageAspectRatio,omitempty"`
	// The artists.
	Artists []string `json:"Artists,omitempty"`
	// The artist items.
	ArtistItems []NameIdPair `json:"ArtistItems,omitempty"`
	Composers []NameIdPair `json:"Composers,omitempty"`
	// The album.
	Album string `json:"Album,omitempty"`
	// The type of the collection.
	CollectionType string `json:"CollectionType,omitempty"`
	// The display order.
	DisplayOrder string `json:"DisplayOrder,omitempty"`
	// The album id.
	AlbumId string `json:"AlbumId,omitempty"`
	// The album image tag.
	AlbumPrimaryImageTag string `json:"AlbumPrimaryImageTag,omitempty"`
	// The series primary image tag.
	SeriesPrimaryImageTag string `json:"SeriesPrimaryImageTag,omitempty"`
	// The album artist.
	AlbumArtist string `json:"AlbumArtist,omitempty"`
	// The album artists.
	AlbumArtists []NameIdPair `json:"AlbumArtists,omitempty"`
	// The name of the season.
	SeasonName string `json:"SeasonName,omitempty"`
	// The media streams.
	MediaStreams []MediaStream `json:"MediaStreams,omitempty"`
	// The part count.
	PartCount int32 `json:"PartCount,omitempty"`
	// The image tags.
	ImageTags map[string]string `json:"ImageTags,omitempty"`
	// The backdrop image tags.
	BackdropImageTags []string `json:"BackdropImageTags,omitempty"`
	// The parent logo image tag.
	ParentLogoImageTag string `json:"ParentLogoImageTag,omitempty"`
	// The series studio.
	SeriesStudio string `json:"SeriesStudio,omitempty"`
	PrimaryImageItemId string `json:"PrimaryImageItemId,omitempty"`
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
	// The parent thumb item id.
	ParentThumbItemId string `json:"ParentThumbItemId,omitempty"`
	// The parent thumb image tag.
	ParentThumbImageTag string `json:"ParentThumbImageTag,omitempty"`
	// The chapters.
	Chapters []ChapterInfo `json:"Chapters,omitempty"`
	LocationType *LocationType `json:"LocationType,omitempty"`
	// The type of the media.
	MediaType string `json:"MediaType,omitempty"`
	// The end date.
	EndDate time.Time `json:"EndDate,omitempty"`
	// The locked fields.
	LockedFields []MetadataFields `json:"LockedFields,omitempty"`
	// A value indicating whether \\[enable internet providers\\].
	LockData bool `json:"LockData,omitempty"`
	Width int32 `json:"Width,omitempty"`
	Height int32 `json:"Height,omitempty"`
	CameraMake string `json:"CameraMake,omitempty"`
	CameraModel string `json:"CameraModel,omitempty"`
	Software string `json:"Software,omitempty"`
	ExposureTime float64 `json:"ExposureTime,omitempty"`
	FocalLength float64 `json:"FocalLength,omitempty"`
	ImageOrientation *DrawingImageOrientation `json:"ImageOrientation,omitempty"`
	Aperture float64 `json:"Aperture,omitempty"`
	ShutterSpeed float64 `json:"ShutterSpeed,omitempty"`
	Latitude float64 `json:"Latitude,omitempty"`
	Longitude float64 `json:"Longitude,omitempty"`
	Altitude float64 `json:"Altitude,omitempty"`
	IsoSpeedRating int32 `json:"IsoSpeedRating,omitempty"`
	// The series timer identifier.
	SeriesTimerId string `json:"SeriesTimerId,omitempty"`
	// The channel primary image tag.
	ChannelPrimaryImageTag string `json:"ChannelPrimaryImageTag,omitempty"`
	// The start date of the recording, in UTC.
	StartDate time.Time `json:"StartDate,omitempty"`
	// The completion percentage.
	CompletionPercentage float64 `json:"CompletionPercentage,omitempty"`
	// A value indicating whether this instance is repeat.
	IsRepeat bool `json:"IsRepeat,omitempty"`
	IsNew bool `json:"IsNew,omitempty"`
	// The episode title.
	EpisodeTitle string `json:"EpisodeTitle,omitempty"`
	// A value indicating whether this instance is movie.
	IsMovie bool `json:"IsMovie,omitempty"`
	// A value indicating whether this instance is sports.
	IsSports bool `json:"IsSports,omitempty"`
	// A value indicating whether this instance is series.
	IsSeries bool `json:"IsSeries,omitempty"`
	// A value indicating whether this instance is live.
	IsLive bool `json:"IsLive,omitempty"`
	// A value indicating whether this instance is news.
	IsNews bool `json:"IsNews,omitempty"`
	// A value indicating whether this instance is kids.
	IsKids bool `json:"IsKids,omitempty"`
	// A value indicating whether this instance is premiere.
	IsPremiere bool `json:"IsPremiere,omitempty"`
	TimerType *LiveTvTimerType `json:"TimerType,omitempty"`
	Disabled bool `json:"Disabled,omitempty"`
	ManagementId string `json:"ManagementId,omitempty"`
	// The timer identifier.
	TimerId string `json:"TimerId,omitempty"`
	CurrentProgram *BaseItemDto `json:"CurrentProgram,omitempty"`
	MovieCount int32 `json:"MovieCount,omitempty"`
	SeriesCount int32 `json:"SeriesCount,omitempty"`
	AlbumCount int32 `json:"AlbumCount,omitempty"`
	SongCount int32 `json:"SongCount,omitempty"`
	MusicVideoCount int32 `json:"MusicVideoCount,omitempty"`
	Subviews []string `json:"Subviews,omitempty"`
	ListingsProviderId string `json:"ListingsProviderId,omitempty"`
	ListingsChannelId string `json:"ListingsChannelId,omitempty"`
	ListingsPath string `json:"ListingsPath,omitempty"`
	ListingsId string `json:"ListingsId,omitempty"`
	ListingsChannelName string `json:"ListingsChannelName,omitempty"`
	ListingsChannelNumber string `json:"ListingsChannelNumber,omitempty"`
	AffiliateCallSign string `json:"AffiliateCallSign,omitempty"`
}
