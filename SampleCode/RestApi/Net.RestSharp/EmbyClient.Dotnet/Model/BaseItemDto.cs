/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// This is strictly used as a data transfer object from the api layer. This holds information about a BaseItem in a format that is convenient for the client.  
    /// </summary>
    [DataContract]
        public partial class BaseItemDto :  IEquatable<BaseItemDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BaseItemDto" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="originalTitle">originalTitle.</param>
        /// <param name="serverId">The server identifier..</param>
        /// <param name="id">The id..</param>
        /// <param name="guid">guid.</param>
        /// <param name="etag">The etag..</param>
        /// <param name="prefix">The Prefix..</param>
        /// <param name="tunerName">tunerName.</param>
        /// <param name="playlistItemId">The playlist item identifier..</param>
        /// <param name="dateCreated">The date created..</param>
        /// <param name="dateModified">dateModified.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="averageFrameRate">averageFrameRate.</param>
        /// <param name="realFrameRate">realFrameRate.</param>
        /// <param name="extraType">extraType.</param>
        /// <param name="sortIndexNumber">sortIndexNumber.</param>
        /// <param name="sortParentIndexNumber">sortParentIndexNumber.</param>
        /// <param name="canDelete">canDelete.</param>
        /// <param name="canDownload">canDownload.</param>
        /// <param name="canEditItems">canEditItems.</param>
        /// <param name="supportsResume">supportsResume.</param>
        /// <param name="presentationUniqueKey">presentationUniqueKey.</param>
        /// <param name="preferredMetadataLanguage">preferredMetadataLanguage.</param>
        /// <param name="preferredMetadataCountryCode">preferredMetadataCountryCode.</param>
        /// <param name="supportsSync">A value indicating whether \\[supports synchronize\\]..</param>
        /// <param name="syncStatus">syncStatus.</param>
        /// <param name="canManageAccess">canManageAccess.</param>
        /// <param name="canLeaveContent">canLeaveContent.</param>
        /// <param name="canMakePublic">canMakePublic.</param>
        /// <param name="container">container.</param>
        /// <param name="sortName">The name of the sort..</param>
        /// <param name="forcedSortName">forcedSortName.</param>
        /// <param name="video3DFormat">video3DFormat.</param>
        /// <param name="premiereDate">The premiere date..</param>
        /// <param name="externalUrls">The external urls..</param>
        /// <param name="mediaSources">The media versions..</param>
        /// <param name="criticRating">The critic rating..</param>
        /// <param name="gameSystemId">gameSystemId.</param>
        /// <param name="asSeries">asSeries.</param>
        /// <param name="gameSystem">The game system..</param>
        /// <param name="productionLocations">productionLocations.</param>
        /// <param name="path">The path..</param>
        /// <param name="officialRating">The official rating..</param>
        /// <param name="customRating">The custom rating..</param>
        /// <param name="channelId">The channel identifier..</param>
        /// <param name="channelName">channelName.</param>
        /// <param name="overview">The overview..</param>
        /// <param name="taglines">The taglines..</param>
        /// <param name="genres">The genres..</param>
        /// <param name="communityRating">The community rating..</param>
        /// <param name="runTimeTicks">The run time ticks..</param>
        /// <param name="size">size.</param>
        /// <param name="fileName">fileName.</param>
        /// <param name="bitrate">bitrate.</param>
        /// <param name="productionYear">The production year..</param>
        /// <param name="number">The number..</param>
        /// <param name="channelNumber">channelNumber.</param>
        /// <param name="indexNumber">The index number..</param>
        /// <param name="indexNumberEnd">The index number end..</param>
        /// <param name="parentIndexNumber">The parent index number..</param>
        /// <param name="remoteTrailers">The trailer urls..</param>
        /// <param name="providerIds">providerIds.</param>
        /// <param name="isFolder">A value indicating whether this instance is folder..</param>
        /// <param name="parentId">The parent id..</param>
        /// <param name="type">The type..</param>
        /// <param name="people">The people..</param>
        /// <param name="studios">The studios..</param>
        /// <param name="genreItems">genreItems.</param>
        /// <param name="tagItems">tagItems.</param>
        /// <param name="parentLogoItemId">If the item does not have a logo, this will hold the Id of the Parent that has one..</param>
        /// <param name="parentBackdropItemId">If the item does not have any backdrops, this will hold the Id of the Parent that has one..</param>
        /// <param name="parentBackdropImageTags">The parent backdrop image tags..</param>
        /// <param name="localTrailerCount">The local trailer count..</param>
        /// <param name="userData">userData.</param>
        /// <param name="recursiveItemCount">The recursive item count..</param>
        /// <param name="childCount">The child count..</param>
        /// <param name="seasonCount">seasonCount.</param>
        /// <param name="seriesName">The name of the series..</param>
        /// <param name="seriesId">The series id..</param>
        /// <param name="seasonId">The season identifier..</param>
        /// <param name="specialFeatureCount">The special feature count..</param>
        /// <param name="displayPreferencesId">The display preferences id..</param>
        /// <param name="status">The status..</param>
        /// <param name="airDays">The air days..</param>
        /// <param name="tags">The tags..</param>
        /// <param name="primaryImageAspectRatio">The primary image aspect ratio, after image enhancements..</param>
        /// <param name="artists">The artists..</param>
        /// <param name="artistItems">The artist items..</param>
        /// <param name="composers">composers.</param>
        /// <param name="album">The album..</param>
        /// <param name="collectionType">The type of the collection..</param>
        /// <param name="displayOrder">The display order..</param>
        /// <param name="albumId">The album id..</param>
        /// <param name="albumPrimaryImageTag">The album image tag..</param>
        /// <param name="seriesPrimaryImageTag">The series primary image tag..</param>
        /// <param name="albumArtist">The album artist..</param>
        /// <param name="albumArtists">The album artists..</param>
        /// <param name="seasonName">The name of the season..</param>
        /// <param name="mediaStreams">The media streams..</param>
        /// <param name="partCount">The part count..</param>
        /// <param name="imageTags">The image tags..</param>
        /// <param name="backdropImageTags">The backdrop image tags..</param>
        /// <param name="parentLogoImageTag">The parent logo image tag..</param>
        /// <param name="seriesStudio">The series studio..</param>
        /// <param name="primaryImageItemId">primaryImageItemId.</param>
        /// <param name="primaryImageTag">primaryImageTag.</param>
        /// <param name="parentThumbItemId">The parent thumb item id..</param>
        /// <param name="parentThumbImageTag">The parent thumb image tag..</param>
        /// <param name="chapters">The chapters..</param>
        /// <param name="locationType">locationType.</param>
        /// <param name="mediaType">The type of the media..</param>
        /// <param name="endDate">The end date..</param>
        /// <param name="lockedFields">The locked fields..</param>
        /// <param name="lockData">A value indicating whether \\[enable internet providers\\]..</param>
        /// <param name="width">width.</param>
        /// <param name="height">height.</param>
        /// <param name="cameraMake">cameraMake.</param>
        /// <param name="cameraModel">cameraModel.</param>
        /// <param name="software">software.</param>
        /// <param name="exposureTime">exposureTime.</param>
        /// <param name="focalLength">focalLength.</param>
        /// <param name="imageOrientation">imageOrientation.</param>
        /// <param name="aperture">aperture.</param>
        /// <param name="shutterSpeed">shutterSpeed.</param>
        /// <param name="latitude">latitude.</param>
        /// <param name="longitude">longitude.</param>
        /// <param name="altitude">altitude.</param>
        /// <param name="isoSpeedRating">isoSpeedRating.</param>
        /// <param name="seriesTimerId">The series timer identifier..</param>
        /// <param name="channelPrimaryImageTag">The channel primary image tag..</param>
        /// <param name="startDate">The start date of the recording, in UTC..</param>
        /// <param name="completionPercentage">The completion percentage..</param>
        /// <param name="isRepeat">A value indicating whether this instance is repeat..</param>
        /// <param name="isNew">isNew.</param>
        /// <param name="episodeTitle">The episode title..</param>
        /// <param name="isMovie">A value indicating whether this instance is movie..</param>
        /// <param name="isSports">A value indicating whether this instance is sports..</param>
        /// <param name="isSeries">A value indicating whether this instance is series..</param>
        /// <param name="isLive">A value indicating whether this instance is live..</param>
        /// <param name="isNews">A value indicating whether this instance is news..</param>
        /// <param name="isKids">A value indicating whether this instance is kids..</param>
        /// <param name="isPremiere">A value indicating whether this instance is premiere..</param>
        /// <param name="timerType">timerType.</param>
        /// <param name="disabled">disabled.</param>
        /// <param name="managementId">managementId.</param>
        /// <param name="timerId">The timer identifier..</param>
        /// <param name="currentProgram">currentProgram.</param>
        /// <param name="movieCount">movieCount.</param>
        /// <param name="seriesCount">seriesCount.</param>
        /// <param name="albumCount">albumCount.</param>
        /// <param name="songCount">songCount.</param>
        /// <param name="musicVideoCount">musicVideoCount.</param>
        /// <param name="subviews">subviews.</param>
        /// <param name="listingsProviderId">listingsProviderId.</param>
        /// <param name="listingsChannelId">listingsChannelId.</param>
        /// <param name="listingsPath">listingsPath.</param>
        /// <param name="listingsId">listingsId.</param>
        /// <param name="listingsChannelName">listingsChannelName.</param>
        /// <param name="listingsChannelNumber">listingsChannelNumber.</param>
        /// <param name="affiliateCallSign">affiliateCallSign.</param>
        public BaseItemDto(string name = default(string), string originalTitle = default(string), string serverId = default(string), string id = default(string), string guid = default(string), string etag = default(string), string prefix = default(string), string tunerName = default(string), string playlistItemId = default(string), DateTimeOffset? dateCreated = default(DateTimeOffset?), DateTimeOffset? dateModified = default(DateTimeOffset?), string videoCodec = default(string), string audioCodec = default(string), float? averageFrameRate = default(float?), float? realFrameRate = default(float?), string extraType = default(string), int? sortIndexNumber = default(int?), int? sortParentIndexNumber = default(int?), bool? canDelete = default(bool?), bool? canDownload = default(bool?), bool? canEditItems = default(bool?), bool? supportsResume = default(bool?), string presentationUniqueKey = default(string), string preferredMetadataLanguage = default(string), string preferredMetadataCountryCode = default(string), bool? supportsSync = default(bool?), SyncJobItemStatus syncStatus = default(SyncJobItemStatus), bool? canManageAccess = default(bool?), bool? canLeaveContent = default(bool?), bool? canMakePublic = default(bool?), string container = default(string), string sortName = default(string), string forcedSortName = default(string), Video3DFormat video3DFormat = default(Video3DFormat), DateTimeOffset? premiereDate = default(DateTimeOffset?), List<ExternalUrl> externalUrls = default(List<ExternalUrl>), List<MediaSourceInfo> mediaSources = default(List<MediaSourceInfo>), float? criticRating = default(float?), long? gameSystemId = default(long?), bool? asSeries = default(bool?), string gameSystem = default(string), List<string> productionLocations = default(List<string>), string path = default(string), string officialRating = default(string), string customRating = default(string), string channelId = default(string), string channelName = default(string), string overview = default(string), List<string> taglines = default(List<string>), List<string> genres = default(List<string>), float? communityRating = default(float?), long? runTimeTicks = default(long?), long? size = default(long?), string fileName = default(string), int? bitrate = default(int?), int? productionYear = default(int?), string number = default(string), string channelNumber = default(string), int? indexNumber = default(int?), int? indexNumberEnd = default(int?), int? parentIndexNumber = default(int?), List<MediaUrl> remoteTrailers = default(List<MediaUrl>), ProviderIdDictionary providerIds = default(ProviderIdDictionary), bool? isFolder = default(bool?), string parentId = default(string), string type = default(string), List<BaseItemPerson> people = default(List<BaseItemPerson>), List<NameLongIdPair> studios = default(List<NameLongIdPair>), List<NameLongIdPair> genreItems = default(List<NameLongIdPair>), List<NameLongIdPair> tagItems = default(List<NameLongIdPair>), string parentLogoItemId = default(string), string parentBackdropItemId = default(string), List<string> parentBackdropImageTags = default(List<string>), int? localTrailerCount = default(int?), UserItemDataDto userData = default(UserItemDataDto), int? recursiveItemCount = default(int?), int? childCount = default(int?), int? seasonCount = default(int?), string seriesName = default(string), string seriesId = default(string), string seasonId = default(string), int? specialFeatureCount = default(int?), string displayPreferencesId = default(string), string status = default(string), List<DayOfWeek> airDays = default(List<DayOfWeek>), List<string> tags = default(List<string>), double? primaryImageAspectRatio = default(double?), List<string> artists = default(List<string>), List<NameIdPair> artistItems = default(List<NameIdPair>), List<NameIdPair> composers = default(List<NameIdPair>), string album = default(string), string collectionType = default(string), string displayOrder = default(string), string albumId = default(string), string albumPrimaryImageTag = default(string), string seriesPrimaryImageTag = default(string), string albumArtist = default(string), List<NameIdPair> albumArtists = default(List<NameIdPair>), string seasonName = default(string), List<MediaStream> mediaStreams = default(List<MediaStream>), int? partCount = default(int?), Dictionary<string, string> imageTags = default(Dictionary<string, string>), List<string> backdropImageTags = default(List<string>), string parentLogoImageTag = default(string), string seriesStudio = default(string), string primaryImageItemId = default(string), string primaryImageTag = default(string), string parentThumbItemId = default(string), string parentThumbImageTag = default(string), List<ChapterInfo> chapters = default(List<ChapterInfo>), LocationType locationType = default(LocationType), string mediaType = default(string), DateTimeOffset? endDate = default(DateTimeOffset?), List<MetadataFields> lockedFields = default(List<MetadataFields>), bool? lockData = default(bool?), int? width = default(int?), int? height = default(int?), string cameraMake = default(string), string cameraModel = default(string), string software = default(string), double? exposureTime = default(double?), double? focalLength = default(double?), DrawingImageOrientation imageOrientation = default(DrawingImageOrientation), double? aperture = default(double?), double? shutterSpeed = default(double?), double? latitude = default(double?), double? longitude = default(double?), double? altitude = default(double?), int? isoSpeedRating = default(int?), string seriesTimerId = default(string), string channelPrimaryImageTag = default(string), DateTimeOffset? startDate = default(DateTimeOffset?), double? completionPercentage = default(double?), bool? isRepeat = default(bool?), bool? isNew = default(bool?), string episodeTitle = default(string), bool? isMovie = default(bool?), bool? isSports = default(bool?), bool? isSeries = default(bool?), bool? isLive = default(bool?), bool? isNews = default(bool?), bool? isKids = default(bool?), bool? isPremiere = default(bool?), LiveTvTimerType timerType = default(LiveTvTimerType), bool? disabled = default(bool?), string managementId = default(string), string timerId = default(string), BaseItemDto currentProgram = default(BaseItemDto), int? movieCount = default(int?), int? seriesCount = default(int?), int? albumCount = default(int?), int? songCount = default(int?), int? musicVideoCount = default(int?), List<string> subviews = default(List<string>), string listingsProviderId = default(string), string listingsChannelId = default(string), string listingsPath = default(string), string listingsId = default(string), string listingsChannelName = default(string), string listingsChannelNumber = default(string), string affiliateCallSign = default(string))
        {
            this.Name = name;
            this.OriginalTitle = originalTitle;
            this.ServerId = serverId;
            this.Id = id;
            this.Guid = guid;
            this.Etag = etag;
            this.Prefix = prefix;
            this.TunerName = tunerName;
            this.PlaylistItemId = playlistItemId;
            this.DateCreated = dateCreated;
            this.DateModified = dateModified;
            this.VideoCodec = videoCodec;
            this.AudioCodec = audioCodec;
            this.AverageFrameRate = averageFrameRate;
            this.RealFrameRate = realFrameRate;
            this.ExtraType = extraType;
            this.SortIndexNumber = sortIndexNumber;
            this.SortParentIndexNumber = sortParentIndexNumber;
            this.CanDelete = canDelete;
            this.CanDownload = canDownload;
            this.CanEditItems = canEditItems;
            this.SupportsResume = supportsResume;
            this.PresentationUniqueKey = presentationUniqueKey;
            this.PreferredMetadataLanguage = preferredMetadataLanguage;
            this.PreferredMetadataCountryCode = preferredMetadataCountryCode;
            this.SupportsSync = supportsSync;
            this.SyncStatus = syncStatus;
            this.CanManageAccess = canManageAccess;
            this.CanLeaveContent = canLeaveContent;
            this.CanMakePublic = canMakePublic;
            this.Container = container;
            this.SortName = sortName;
            this.ForcedSortName = forcedSortName;
            this.Video3DFormat = video3DFormat;
            this.PremiereDate = premiereDate;
            this.ExternalUrls = externalUrls;
            this.MediaSources = mediaSources;
            this.CriticRating = criticRating;
            this.GameSystemId = gameSystemId;
            this.AsSeries = asSeries;
            this.GameSystem = gameSystem;
            this.ProductionLocations = productionLocations;
            this.Path = path;
            this.OfficialRating = officialRating;
            this.CustomRating = customRating;
            this.ChannelId = channelId;
            this.ChannelName = channelName;
            this.Overview = overview;
            this.Taglines = taglines;
            this.Genres = genres;
            this.CommunityRating = communityRating;
            this.RunTimeTicks = runTimeTicks;
            this.Size = size;
            this.FileName = fileName;
            this.Bitrate = bitrate;
            this.ProductionYear = productionYear;
            this.Number = number;
            this.ChannelNumber = channelNumber;
            this.IndexNumber = indexNumber;
            this.IndexNumberEnd = indexNumberEnd;
            this.ParentIndexNumber = parentIndexNumber;
            this.RemoteTrailers = remoteTrailers;
            this.ProviderIds = providerIds;
            this.IsFolder = isFolder;
            this.ParentId = parentId;
            this.Type = type;
            this.People = people;
            this.Studios = studios;
            this.GenreItems = genreItems;
            this.TagItems = tagItems;
            this.ParentLogoItemId = parentLogoItemId;
            this.ParentBackdropItemId = parentBackdropItemId;
            this.ParentBackdropImageTags = parentBackdropImageTags;
            this.LocalTrailerCount = localTrailerCount;
            this.UserData = userData;
            this.RecursiveItemCount = recursiveItemCount;
            this.ChildCount = childCount;
            this.SeasonCount = seasonCount;
            this.SeriesName = seriesName;
            this.SeriesId = seriesId;
            this.SeasonId = seasonId;
            this.SpecialFeatureCount = specialFeatureCount;
            this.DisplayPreferencesId = displayPreferencesId;
            this.Status = status;
            this.AirDays = airDays;
            this.Tags = tags;
            this.PrimaryImageAspectRatio = primaryImageAspectRatio;
            this.Artists = artists;
            this.ArtistItems = artistItems;
            this.Composers = composers;
            this.Album = album;
            this.CollectionType = collectionType;
            this.DisplayOrder = displayOrder;
            this.AlbumId = albumId;
            this.AlbumPrimaryImageTag = albumPrimaryImageTag;
            this.SeriesPrimaryImageTag = seriesPrimaryImageTag;
            this.AlbumArtist = albumArtist;
            this.AlbumArtists = albumArtists;
            this.SeasonName = seasonName;
            this.MediaStreams = mediaStreams;
            this.PartCount = partCount;
            this.ImageTags = imageTags;
            this.BackdropImageTags = backdropImageTags;
            this.ParentLogoImageTag = parentLogoImageTag;
            this.SeriesStudio = seriesStudio;
            this.PrimaryImageItemId = primaryImageItemId;
            this.PrimaryImageTag = primaryImageTag;
            this.ParentThumbItemId = parentThumbItemId;
            this.ParentThumbImageTag = parentThumbImageTag;
            this.Chapters = chapters;
            this.LocationType = locationType;
            this.MediaType = mediaType;
            this.EndDate = endDate;
            this.LockedFields = lockedFields;
            this.LockData = lockData;
            this.Width = width;
            this.Height = height;
            this.CameraMake = cameraMake;
            this.CameraModel = cameraModel;
            this.Software = software;
            this.ExposureTime = exposureTime;
            this.FocalLength = focalLength;
            this.ImageOrientation = imageOrientation;
            this.Aperture = aperture;
            this.ShutterSpeed = shutterSpeed;
            this.Latitude = latitude;
            this.Longitude = longitude;
            this.Altitude = altitude;
            this.IsoSpeedRating = isoSpeedRating;
            this.SeriesTimerId = seriesTimerId;
            this.ChannelPrimaryImageTag = channelPrimaryImageTag;
            this.StartDate = startDate;
            this.CompletionPercentage = completionPercentage;
            this.IsRepeat = isRepeat;
            this.IsNew = isNew;
            this.EpisodeTitle = episodeTitle;
            this.IsMovie = isMovie;
            this.IsSports = isSports;
            this.IsSeries = isSeries;
            this.IsLive = isLive;
            this.IsNews = isNews;
            this.IsKids = isKids;
            this.IsPremiere = isPremiere;
            this.TimerType = timerType;
            this.Disabled = disabled;
            this.ManagementId = managementId;
            this.TimerId = timerId;
            this.CurrentProgram = currentProgram;
            this.MovieCount = movieCount;
            this.SeriesCount = seriesCount;
            this.AlbumCount = albumCount;
            this.SongCount = songCount;
            this.MusicVideoCount = musicVideoCount;
            this.Subviews = subviews;
            this.ListingsProviderId = listingsProviderId;
            this.ListingsChannelId = listingsChannelId;
            this.ListingsPath = listingsPath;
            this.ListingsId = listingsId;
            this.ListingsChannelName = listingsChannelName;
            this.ListingsChannelNumber = listingsChannelNumber;
            this.AffiliateCallSign = affiliateCallSign;
        }
        
        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets OriginalTitle
        /// </summary>
        [DataMember(Name="OriginalTitle", EmitDefaultValue=false)]
        public string OriginalTitle { get; set; }

        /// <summary>
        /// The server identifier.
        /// </summary>
        /// <value>The server identifier.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// The id.
        /// </summary>
        /// <value>The id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Guid
        /// </summary>
        [DataMember(Name="Guid", EmitDefaultValue=false)]
        public string Guid { get; set; }

        /// <summary>
        /// The etag.
        /// </summary>
        /// <value>The etag.</value>
        [DataMember(Name="Etag", EmitDefaultValue=false)]
        public string Etag { get; set; }

        /// <summary>
        /// The Prefix.
        /// </summary>
        /// <value>The Prefix.</value>
        [DataMember(Name="Prefix", EmitDefaultValue=false)]
        public string Prefix { get; set; }

        /// <summary>
        /// Gets or Sets TunerName
        /// </summary>
        [DataMember(Name="TunerName", EmitDefaultValue=false)]
        public string TunerName { get; set; }

        /// <summary>
        /// The playlist item identifier.
        /// </summary>
        /// <value>The playlist item identifier.</value>
        [DataMember(Name="PlaylistItemId", EmitDefaultValue=false)]
        public string PlaylistItemId { get; set; }

        /// <summary>
        /// The date created.
        /// </summary>
        /// <value>The date created.</value>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets DateModified
        /// </summary>
        [DataMember(Name="DateModified", EmitDefaultValue=false)]
        public DateTimeOffset? DateModified { get; set; }

        /// <summary>
        /// Gets or Sets VideoCodec
        /// </summary>
        [DataMember(Name="VideoCodec", EmitDefaultValue=false)]
        public string VideoCodec { get; set; }

        /// <summary>
        /// Gets or Sets AudioCodec
        /// </summary>
        [DataMember(Name="AudioCodec", EmitDefaultValue=false)]
        public string AudioCodec { get; set; }

        /// <summary>
        /// Gets or Sets AverageFrameRate
        /// </summary>
        [DataMember(Name="AverageFrameRate", EmitDefaultValue=false)]
        public float? AverageFrameRate { get; set; }

        /// <summary>
        /// Gets or Sets RealFrameRate
        /// </summary>
        [DataMember(Name="RealFrameRate", EmitDefaultValue=false)]
        public float? RealFrameRate { get; set; }

        /// <summary>
        /// Gets or Sets ExtraType
        /// </summary>
        [DataMember(Name="ExtraType", EmitDefaultValue=false)]
        public string ExtraType { get; set; }

        /// <summary>
        /// Gets or Sets SortIndexNumber
        /// </summary>
        [DataMember(Name="SortIndexNumber", EmitDefaultValue=false)]
        public int? SortIndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets SortParentIndexNumber
        /// </summary>
        [DataMember(Name="SortParentIndexNumber", EmitDefaultValue=false)]
        public int? SortParentIndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets CanDelete
        /// </summary>
        [DataMember(Name="CanDelete", EmitDefaultValue=false)]
        public bool? CanDelete { get; set; }

        /// <summary>
        /// Gets or Sets CanDownload
        /// </summary>
        [DataMember(Name="CanDownload", EmitDefaultValue=false)]
        public bool? CanDownload { get; set; }

        /// <summary>
        /// Gets or Sets CanEditItems
        /// </summary>
        [DataMember(Name="CanEditItems", EmitDefaultValue=false)]
        public bool? CanEditItems { get; set; }

        /// <summary>
        /// Gets or Sets SupportsResume
        /// </summary>
        [DataMember(Name="SupportsResume", EmitDefaultValue=false)]
        public bool? SupportsResume { get; set; }

        /// <summary>
        /// Gets or Sets PresentationUniqueKey
        /// </summary>
        [DataMember(Name="PresentationUniqueKey", EmitDefaultValue=false)]
        public string PresentationUniqueKey { get; set; }

        /// <summary>
        /// Gets or Sets PreferredMetadataLanguage
        /// </summary>
        [DataMember(Name="PreferredMetadataLanguage", EmitDefaultValue=false)]
        public string PreferredMetadataLanguage { get; set; }

        /// <summary>
        /// Gets or Sets PreferredMetadataCountryCode
        /// </summary>
        [DataMember(Name="PreferredMetadataCountryCode", EmitDefaultValue=false)]
        public string PreferredMetadataCountryCode { get; set; }

        /// <summary>
        /// A value indicating whether \\[supports synchronize\\].
        /// </summary>
        /// <value>A value indicating whether \\[supports synchronize\\].</value>
        [DataMember(Name="SupportsSync", EmitDefaultValue=false)]
        public bool? SupportsSync { get; set; }

        /// <summary>
        /// Gets or Sets SyncStatus
        /// </summary>
        [DataMember(Name="SyncStatus", EmitDefaultValue=false)]
        public SyncJobItemStatus SyncStatus { get; set; }

        /// <summary>
        /// Gets or Sets CanManageAccess
        /// </summary>
        [DataMember(Name="CanManageAccess", EmitDefaultValue=false)]
        public bool? CanManageAccess { get; set; }

        /// <summary>
        /// Gets or Sets CanLeaveContent
        /// </summary>
        [DataMember(Name="CanLeaveContent", EmitDefaultValue=false)]
        public bool? CanLeaveContent { get; set; }

        /// <summary>
        /// Gets or Sets CanMakePublic
        /// </summary>
        [DataMember(Name="CanMakePublic", EmitDefaultValue=false)]
        public bool? CanMakePublic { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// The name of the sort.
        /// </summary>
        /// <value>The name of the sort.</value>
        [DataMember(Name="SortName", EmitDefaultValue=false)]
        public string SortName { get; set; }

        /// <summary>
        /// Gets or Sets ForcedSortName
        /// </summary>
        [DataMember(Name="ForcedSortName", EmitDefaultValue=false)]
        public string ForcedSortName { get; set; }

        /// <summary>
        /// Gets or Sets Video3DFormat
        /// </summary>
        [DataMember(Name="Video3DFormat", EmitDefaultValue=false)]
        public Video3DFormat Video3DFormat { get; set; }

        /// <summary>
        /// The premiere date.
        /// </summary>
        /// <value>The premiere date.</value>
        [DataMember(Name="PremiereDate", EmitDefaultValue=false)]
        public DateTimeOffset? PremiereDate { get; set; }

        /// <summary>
        /// The external urls.
        /// </summary>
        /// <value>The external urls.</value>
        [DataMember(Name="ExternalUrls", EmitDefaultValue=false)]
        public List<ExternalUrl> ExternalUrls { get; set; }

        /// <summary>
        /// The media versions.
        /// </summary>
        /// <value>The media versions.</value>
        [DataMember(Name="MediaSources", EmitDefaultValue=false)]
        public List<MediaSourceInfo> MediaSources { get; set; }

        /// <summary>
        /// The critic rating.
        /// </summary>
        /// <value>The critic rating.</value>
        [DataMember(Name="CriticRating", EmitDefaultValue=false)]
        public float? CriticRating { get; set; }

        /// <summary>
        /// Gets or Sets GameSystemId
        /// </summary>
        [DataMember(Name="GameSystemId", EmitDefaultValue=false)]
        public long? GameSystemId { get; set; }

        /// <summary>
        /// Gets or Sets AsSeries
        /// </summary>
        [DataMember(Name="AsSeries", EmitDefaultValue=false)]
        public bool? AsSeries { get; set; }

        /// <summary>
        /// The game system.
        /// </summary>
        /// <value>The game system.</value>
        [DataMember(Name="GameSystem", EmitDefaultValue=false)]
        public string GameSystem { get; set; }

        /// <summary>
        /// Gets or Sets ProductionLocations
        /// </summary>
        [DataMember(Name="ProductionLocations", EmitDefaultValue=false)]
        public List<string> ProductionLocations { get; set; }

        /// <summary>
        /// The path.
        /// </summary>
        /// <value>The path.</value>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// The official rating.
        /// </summary>
        /// <value>The official rating.</value>
        [DataMember(Name="OfficialRating", EmitDefaultValue=false)]
        public string OfficialRating { get; set; }

        /// <summary>
        /// The custom rating.
        /// </summary>
        /// <value>The custom rating.</value>
        [DataMember(Name="CustomRating", EmitDefaultValue=false)]
        public string CustomRating { get; set; }

        /// <summary>
        /// The channel identifier.
        /// </summary>
        /// <value>The channel identifier.</value>
        [DataMember(Name="ChannelId", EmitDefaultValue=false)]
        public string ChannelId { get; set; }

        /// <summary>
        /// Gets or Sets ChannelName
        /// </summary>
        [DataMember(Name="ChannelName", EmitDefaultValue=false)]
        public string ChannelName { get; set; }

        /// <summary>
        /// The overview.
        /// </summary>
        /// <value>The overview.</value>
        [DataMember(Name="Overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

        /// <summary>
        /// The taglines.
        /// </summary>
        /// <value>The taglines.</value>
        [DataMember(Name="Taglines", EmitDefaultValue=false)]
        public List<string> Taglines { get; set; }

        /// <summary>
        /// The genres.
        /// </summary>
        /// <value>The genres.</value>
        [DataMember(Name="Genres", EmitDefaultValue=false)]
        public List<string> Genres { get; set; }

        /// <summary>
        /// The community rating.
        /// </summary>
        /// <value>The community rating.</value>
        [DataMember(Name="CommunityRating", EmitDefaultValue=false)]
        public float? CommunityRating { get; set; }

        /// <summary>
        /// The run time ticks.
        /// </summary>
        /// <value>The run time ticks.</value>
        [DataMember(Name="RunTimeTicks", EmitDefaultValue=false)]
        public long? RunTimeTicks { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name="Size", EmitDefaultValue=false)]
        public long? Size { get; set; }

        /// <summary>
        /// Gets or Sets FileName
        /// </summary>
        [DataMember(Name="FileName", EmitDefaultValue=false)]
        public string FileName { get; set; }

        /// <summary>
        /// Gets or Sets Bitrate
        /// </summary>
        [DataMember(Name="Bitrate", EmitDefaultValue=false)]
        public int? Bitrate { get; set; }

        /// <summary>
        /// The production year.
        /// </summary>
        /// <value>The production year.</value>
        [DataMember(Name="ProductionYear", EmitDefaultValue=false)]
        public int? ProductionYear { get; set; }

        /// <summary>
        /// The number.
        /// </summary>
        /// <value>The number.</value>
        [DataMember(Name="Number", EmitDefaultValue=false)]
        public string Number { get; set; }

        /// <summary>
        /// Gets or Sets ChannelNumber
        /// </summary>
        [DataMember(Name="ChannelNumber", EmitDefaultValue=false)]
        public string ChannelNumber { get; set; }

        /// <summary>
        /// The index number.
        /// </summary>
        /// <value>The index number.</value>
        [DataMember(Name="IndexNumber", EmitDefaultValue=false)]
        public int? IndexNumber { get; set; }

        /// <summary>
        /// The index number end.
        /// </summary>
        /// <value>The index number end.</value>
        [DataMember(Name="IndexNumberEnd", EmitDefaultValue=false)]
        public int? IndexNumberEnd { get; set; }

        /// <summary>
        /// The parent index number.
        /// </summary>
        /// <value>The parent index number.</value>
        [DataMember(Name="ParentIndexNumber", EmitDefaultValue=false)]
        public int? ParentIndexNumber { get; set; }

        /// <summary>
        /// The trailer urls.
        /// </summary>
        /// <value>The trailer urls.</value>
        [DataMember(Name="RemoteTrailers", EmitDefaultValue=false)]
        public List<MediaUrl> RemoteTrailers { get; set; }

        /// <summary>
        /// Gets or Sets ProviderIds
        /// </summary>
        [DataMember(Name="ProviderIds", EmitDefaultValue=false)]
        public ProviderIdDictionary ProviderIds { get; set; }

        /// <summary>
        /// A value indicating whether this instance is folder.
        /// </summary>
        /// <value>A value indicating whether this instance is folder.</value>
        [DataMember(Name="IsFolder", EmitDefaultValue=false)]
        public bool? IsFolder { get; set; }

        /// <summary>
        /// The parent id.
        /// </summary>
        /// <value>The parent id.</value>
        [DataMember(Name="ParentId", EmitDefaultValue=false)]
        public string ParentId { get; set; }

        /// <summary>
        /// The type.
        /// </summary>
        /// <value>The type.</value>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The people.
        /// </summary>
        /// <value>The people.</value>
        [DataMember(Name="People", EmitDefaultValue=false)]
        public List<BaseItemPerson> People { get; set; }

        /// <summary>
        /// The studios.
        /// </summary>
        /// <value>The studios.</value>
        [DataMember(Name="Studios", EmitDefaultValue=false)]
        public List<NameLongIdPair> Studios { get; set; }

        /// <summary>
        /// Gets or Sets GenreItems
        /// </summary>
        [DataMember(Name="GenreItems", EmitDefaultValue=false)]
        public List<NameLongIdPair> GenreItems { get; set; }

        /// <summary>
        /// Gets or Sets TagItems
        /// </summary>
        [DataMember(Name="TagItems", EmitDefaultValue=false)]
        public List<NameLongIdPair> TagItems { get; set; }

        /// <summary>
        /// If the item does not have a logo, this will hold the Id of the Parent that has one.
        /// </summary>
        /// <value>If the item does not have a logo, this will hold the Id of the Parent that has one.</value>
        [DataMember(Name="ParentLogoItemId", EmitDefaultValue=false)]
        public string ParentLogoItemId { get; set; }

        /// <summary>
        /// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
        /// </summary>
        /// <value>If the item does not have any backdrops, this will hold the Id of the Parent that has one.</value>
        [DataMember(Name="ParentBackdropItemId", EmitDefaultValue=false)]
        public string ParentBackdropItemId { get; set; }

        /// <summary>
        /// The parent backdrop image tags.
        /// </summary>
        /// <value>The parent backdrop image tags.</value>
        [DataMember(Name="ParentBackdropImageTags", EmitDefaultValue=false)]
        public List<string> ParentBackdropImageTags { get; set; }

        /// <summary>
        /// The local trailer count.
        /// </summary>
        /// <value>The local trailer count.</value>
        [DataMember(Name="LocalTrailerCount", EmitDefaultValue=false)]
        public int? LocalTrailerCount { get; set; }

        /// <summary>
        /// Gets or Sets UserData
        /// </summary>
        [DataMember(Name="UserData", EmitDefaultValue=false)]
        public UserItemDataDto UserData { get; set; }

        /// <summary>
        /// The recursive item count.
        /// </summary>
        /// <value>The recursive item count.</value>
        [DataMember(Name="RecursiveItemCount", EmitDefaultValue=false)]
        public int? RecursiveItemCount { get; set; }

        /// <summary>
        /// The child count.
        /// </summary>
        /// <value>The child count.</value>
        [DataMember(Name="ChildCount", EmitDefaultValue=false)]
        public int? ChildCount { get; set; }

        /// <summary>
        /// Gets or Sets SeasonCount
        /// </summary>
        [DataMember(Name="SeasonCount", EmitDefaultValue=false)]
        public int? SeasonCount { get; set; }

        /// <summary>
        /// The name of the series.
        /// </summary>
        /// <value>The name of the series.</value>
        [DataMember(Name="SeriesName", EmitDefaultValue=false)]
        public string SeriesName { get; set; }

        /// <summary>
        /// The series id.
        /// </summary>
        /// <value>The series id.</value>
        [DataMember(Name="SeriesId", EmitDefaultValue=false)]
        public string SeriesId { get; set; }

        /// <summary>
        /// The season identifier.
        /// </summary>
        /// <value>The season identifier.</value>
        [DataMember(Name="SeasonId", EmitDefaultValue=false)]
        public string SeasonId { get; set; }

        /// <summary>
        /// The special feature count.
        /// </summary>
        /// <value>The special feature count.</value>
        [DataMember(Name="SpecialFeatureCount", EmitDefaultValue=false)]
        public int? SpecialFeatureCount { get; set; }

        /// <summary>
        /// The display preferences id.
        /// </summary>
        /// <value>The display preferences id.</value>
        [DataMember(Name="DisplayPreferencesId", EmitDefaultValue=false)]
        public string DisplayPreferencesId { get; set; }

        /// <summary>
        /// The status.
        /// </summary>
        /// <value>The status.</value>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// The air days.
        /// </summary>
        /// <value>The air days.</value>
        [DataMember(Name="AirDays", EmitDefaultValue=false)]
        public List<DayOfWeek> AirDays { get; set; }

        /// <summary>
        /// The tags.
        /// </summary>
        /// <value>The tags.</value>
        [DataMember(Name="Tags", EmitDefaultValue=false)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// The primary image aspect ratio, after image enhancements.
        /// </summary>
        /// <value>The primary image aspect ratio, after image enhancements.</value>
        [DataMember(Name="PrimaryImageAspectRatio", EmitDefaultValue=false)]
        public double? PrimaryImageAspectRatio { get; set; }

        /// <summary>
        /// The artists.
        /// </summary>
        /// <value>The artists.</value>
        [DataMember(Name="Artists", EmitDefaultValue=false)]
        public List<string> Artists { get; set; }

        /// <summary>
        /// The artist items.
        /// </summary>
        /// <value>The artist items.</value>
        [DataMember(Name="ArtistItems", EmitDefaultValue=false)]
        public List<NameIdPair> ArtistItems { get; set; }

        /// <summary>
        /// Gets or Sets Composers
        /// </summary>
        [DataMember(Name="Composers", EmitDefaultValue=false)]
        public List<NameIdPair> Composers { get; set; }

        /// <summary>
        /// The album.
        /// </summary>
        /// <value>The album.</value>
        [DataMember(Name="Album", EmitDefaultValue=false)]
        public string Album { get; set; }

        /// <summary>
        /// The type of the collection.
        /// </summary>
        /// <value>The type of the collection.</value>
        [DataMember(Name="CollectionType", EmitDefaultValue=false)]
        public string CollectionType { get; set; }

        /// <summary>
        /// The display order.
        /// </summary>
        /// <value>The display order.</value>
        [DataMember(Name="DisplayOrder", EmitDefaultValue=false)]
        public string DisplayOrder { get; set; }

        /// <summary>
        /// The album id.
        /// </summary>
        /// <value>The album id.</value>
        [DataMember(Name="AlbumId", EmitDefaultValue=false)]
        public string AlbumId { get; set; }

        /// <summary>
        /// The album image tag.
        /// </summary>
        /// <value>The album image tag.</value>
        [DataMember(Name="AlbumPrimaryImageTag", EmitDefaultValue=false)]
        public string AlbumPrimaryImageTag { get; set; }

        /// <summary>
        /// The series primary image tag.
        /// </summary>
        /// <value>The series primary image tag.</value>
        [DataMember(Name="SeriesPrimaryImageTag", EmitDefaultValue=false)]
        public string SeriesPrimaryImageTag { get; set; }

        /// <summary>
        /// The album artist.
        /// </summary>
        /// <value>The album artist.</value>
        [DataMember(Name="AlbumArtist", EmitDefaultValue=false)]
        public string AlbumArtist { get; set; }

        /// <summary>
        /// The album artists.
        /// </summary>
        /// <value>The album artists.</value>
        [DataMember(Name="AlbumArtists", EmitDefaultValue=false)]
        public List<NameIdPair> AlbumArtists { get; set; }

        /// <summary>
        /// The name of the season.
        /// </summary>
        /// <value>The name of the season.</value>
        [DataMember(Name="SeasonName", EmitDefaultValue=false)]
        public string SeasonName { get; set; }

        /// <summary>
        /// The media streams.
        /// </summary>
        /// <value>The media streams.</value>
        [DataMember(Name="MediaStreams", EmitDefaultValue=false)]
        public List<MediaStream> MediaStreams { get; set; }

        /// <summary>
        /// The part count.
        /// </summary>
        /// <value>The part count.</value>
        [DataMember(Name="PartCount", EmitDefaultValue=false)]
        public int? PartCount { get; set; }

        /// <summary>
        /// The image tags.
        /// </summary>
        /// <value>The image tags.</value>
        [DataMember(Name="ImageTags", EmitDefaultValue=false)]
        public Dictionary<string, string> ImageTags { get; set; }

        /// <summary>
        /// The backdrop image tags.
        /// </summary>
        /// <value>The backdrop image tags.</value>
        [DataMember(Name="BackdropImageTags", EmitDefaultValue=false)]
        public List<string> BackdropImageTags { get; set; }

        /// <summary>
        /// The parent logo image tag.
        /// </summary>
        /// <value>The parent logo image tag.</value>
        [DataMember(Name="ParentLogoImageTag", EmitDefaultValue=false)]
        public string ParentLogoImageTag { get; set; }

        /// <summary>
        /// The series studio.
        /// </summary>
        /// <value>The series studio.</value>
        [DataMember(Name="SeriesStudio", EmitDefaultValue=false)]
        public string SeriesStudio { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageItemId
        /// </summary>
        [DataMember(Name="PrimaryImageItemId", EmitDefaultValue=false)]
        public string PrimaryImageItemId { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageTag
        /// </summary>
        [DataMember(Name="PrimaryImageTag", EmitDefaultValue=false)]
        public string PrimaryImageTag { get; set; }

        /// <summary>
        /// The parent thumb item id.
        /// </summary>
        /// <value>The parent thumb item id.</value>
        [DataMember(Name="ParentThumbItemId", EmitDefaultValue=false)]
        public string ParentThumbItemId { get; set; }

        /// <summary>
        /// The parent thumb image tag.
        /// </summary>
        /// <value>The parent thumb image tag.</value>
        [DataMember(Name="ParentThumbImageTag", EmitDefaultValue=false)]
        public string ParentThumbImageTag { get; set; }

        /// <summary>
        /// The chapters.
        /// </summary>
        /// <value>The chapters.</value>
        [DataMember(Name="Chapters", EmitDefaultValue=false)]
        public List<ChapterInfo> Chapters { get; set; }

        /// <summary>
        /// Gets or Sets LocationType
        /// </summary>
        [DataMember(Name="LocationType", EmitDefaultValue=false)]
        public LocationType LocationType { get; set; }

        /// <summary>
        /// The type of the media.
        /// </summary>
        /// <value>The type of the media.</value>
        [DataMember(Name="MediaType", EmitDefaultValue=false)]
        public string MediaType { get; set; }

        /// <summary>
        /// The end date.
        /// </summary>
        /// <value>The end date.</value>
        [DataMember(Name="EndDate", EmitDefaultValue=false)]
        public DateTimeOffset? EndDate { get; set; }

        /// <summary>
        /// The locked fields.
        /// </summary>
        /// <value>The locked fields.</value>
        [DataMember(Name="LockedFields", EmitDefaultValue=false)]
        public List<MetadataFields> LockedFields { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable internet providers\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable internet providers\\].</value>
        [DataMember(Name="LockData", EmitDefaultValue=false)]
        public bool? LockData { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// Gets or Sets CameraMake
        /// </summary>
        [DataMember(Name="CameraMake", EmitDefaultValue=false)]
        public string CameraMake { get; set; }

        /// <summary>
        /// Gets or Sets CameraModel
        /// </summary>
        [DataMember(Name="CameraModel", EmitDefaultValue=false)]
        public string CameraModel { get; set; }

        /// <summary>
        /// Gets or Sets Software
        /// </summary>
        [DataMember(Name="Software", EmitDefaultValue=false)]
        public string Software { get; set; }

        /// <summary>
        /// Gets or Sets ExposureTime
        /// </summary>
        [DataMember(Name="ExposureTime", EmitDefaultValue=false)]
        public double? ExposureTime { get; set; }

        /// <summary>
        /// Gets or Sets FocalLength
        /// </summary>
        [DataMember(Name="FocalLength", EmitDefaultValue=false)]
        public double? FocalLength { get; set; }

        /// <summary>
        /// Gets or Sets ImageOrientation
        /// </summary>
        [DataMember(Name="ImageOrientation", EmitDefaultValue=false)]
        public DrawingImageOrientation ImageOrientation { get; set; }

        /// <summary>
        /// Gets or Sets Aperture
        /// </summary>
        [DataMember(Name="Aperture", EmitDefaultValue=false)]
        public double? Aperture { get; set; }

        /// <summary>
        /// Gets or Sets ShutterSpeed
        /// </summary>
        [DataMember(Name="ShutterSpeed", EmitDefaultValue=false)]
        public double? ShutterSpeed { get; set; }

        /// <summary>
        /// Gets or Sets Latitude
        /// </summary>
        [DataMember(Name="Latitude", EmitDefaultValue=false)]
        public double? Latitude { get; set; }

        /// <summary>
        /// Gets or Sets Longitude
        /// </summary>
        [DataMember(Name="Longitude", EmitDefaultValue=false)]
        public double? Longitude { get; set; }

        /// <summary>
        /// Gets or Sets Altitude
        /// </summary>
        [DataMember(Name="Altitude", EmitDefaultValue=false)]
        public double? Altitude { get; set; }

        /// <summary>
        /// Gets or Sets IsoSpeedRating
        /// </summary>
        [DataMember(Name="IsoSpeedRating", EmitDefaultValue=false)]
        public int? IsoSpeedRating { get; set; }

        /// <summary>
        /// The series timer identifier.
        /// </summary>
        /// <value>The series timer identifier.</value>
        [DataMember(Name="SeriesTimerId", EmitDefaultValue=false)]
        public string SeriesTimerId { get; set; }

        /// <summary>
        /// The channel primary image tag.
        /// </summary>
        /// <value>The channel primary image tag.</value>
        [DataMember(Name="ChannelPrimaryImageTag", EmitDefaultValue=false)]
        public string ChannelPrimaryImageTag { get; set; }

        /// <summary>
        /// The start date of the recording, in UTC.
        /// </summary>
        /// <value>The start date of the recording, in UTC.</value>
        [DataMember(Name="StartDate", EmitDefaultValue=false)]
        public DateTimeOffset? StartDate { get; set; }

        /// <summary>
        /// The completion percentage.
        /// </summary>
        /// <value>The completion percentage.</value>
        [DataMember(Name="CompletionPercentage", EmitDefaultValue=false)]
        public double? CompletionPercentage { get; set; }

        /// <summary>
        /// A value indicating whether this instance is repeat.
        /// </summary>
        /// <value>A value indicating whether this instance is repeat.</value>
        [DataMember(Name="IsRepeat", EmitDefaultValue=false)]
        public bool? IsRepeat { get; set; }

        /// <summary>
        /// Gets or Sets IsNew
        /// </summary>
        [DataMember(Name="IsNew", EmitDefaultValue=false)]
        public bool? IsNew { get; set; }

        /// <summary>
        /// The episode title.
        /// </summary>
        /// <value>The episode title.</value>
        [DataMember(Name="EpisodeTitle", EmitDefaultValue=false)]
        public string EpisodeTitle { get; set; }

        /// <summary>
        /// A value indicating whether this instance is movie.
        /// </summary>
        /// <value>A value indicating whether this instance is movie.</value>
        [DataMember(Name="IsMovie", EmitDefaultValue=false)]
        public bool? IsMovie { get; set; }

        /// <summary>
        /// A value indicating whether this instance is sports.
        /// </summary>
        /// <value>A value indicating whether this instance is sports.</value>
        [DataMember(Name="IsSports", EmitDefaultValue=false)]
        public bool? IsSports { get; set; }

        /// <summary>
        /// A value indicating whether this instance is series.
        /// </summary>
        /// <value>A value indicating whether this instance is series.</value>
        [DataMember(Name="IsSeries", EmitDefaultValue=false)]
        public bool? IsSeries { get; set; }

        /// <summary>
        /// A value indicating whether this instance is live.
        /// </summary>
        /// <value>A value indicating whether this instance is live.</value>
        [DataMember(Name="IsLive", EmitDefaultValue=false)]
        public bool? IsLive { get; set; }

        /// <summary>
        /// A value indicating whether this instance is news.
        /// </summary>
        /// <value>A value indicating whether this instance is news.</value>
        [DataMember(Name="IsNews", EmitDefaultValue=false)]
        public bool? IsNews { get; set; }

        /// <summary>
        /// A value indicating whether this instance is kids.
        /// </summary>
        /// <value>A value indicating whether this instance is kids.</value>
        [DataMember(Name="IsKids", EmitDefaultValue=false)]
        public bool? IsKids { get; set; }

        /// <summary>
        /// A value indicating whether this instance is premiere.
        /// </summary>
        /// <value>A value indicating whether this instance is premiere.</value>
        [DataMember(Name="IsPremiere", EmitDefaultValue=false)]
        public bool? IsPremiere { get; set; }

        /// <summary>
        /// Gets or Sets TimerType
        /// </summary>
        [DataMember(Name="TimerType", EmitDefaultValue=false)]
        public LiveTvTimerType TimerType { get; set; }

        /// <summary>
        /// Gets or Sets Disabled
        /// </summary>
        [DataMember(Name="Disabled", EmitDefaultValue=false)]
        public bool? Disabled { get; set; }

        /// <summary>
        /// Gets or Sets ManagementId
        /// </summary>
        [DataMember(Name="ManagementId", EmitDefaultValue=false)]
        public string ManagementId { get; set; }

        /// <summary>
        /// The timer identifier.
        /// </summary>
        /// <value>The timer identifier.</value>
        [DataMember(Name="TimerId", EmitDefaultValue=false)]
        public string TimerId { get; set; }

        /// <summary>
        /// Gets or Sets CurrentProgram
        /// </summary>
        [DataMember(Name="CurrentProgram", EmitDefaultValue=false)]
        public BaseItemDto CurrentProgram { get; set; }

        /// <summary>
        /// Gets or Sets MovieCount
        /// </summary>
        [DataMember(Name="MovieCount", EmitDefaultValue=false)]
        public int? MovieCount { get; set; }

        /// <summary>
        /// Gets or Sets SeriesCount
        /// </summary>
        [DataMember(Name="SeriesCount", EmitDefaultValue=false)]
        public int? SeriesCount { get; set; }

        /// <summary>
        /// Gets or Sets AlbumCount
        /// </summary>
        [DataMember(Name="AlbumCount", EmitDefaultValue=false)]
        public int? AlbumCount { get; set; }

        /// <summary>
        /// Gets or Sets SongCount
        /// </summary>
        [DataMember(Name="SongCount", EmitDefaultValue=false)]
        public int? SongCount { get; set; }

        /// <summary>
        /// Gets or Sets MusicVideoCount
        /// </summary>
        [DataMember(Name="MusicVideoCount", EmitDefaultValue=false)]
        public int? MusicVideoCount { get; set; }

        /// <summary>
        /// Gets or Sets Subviews
        /// </summary>
        [DataMember(Name="Subviews", EmitDefaultValue=false)]
        public List<string> Subviews { get; set; }

        /// <summary>
        /// Gets or Sets ListingsProviderId
        /// </summary>
        [DataMember(Name="ListingsProviderId", EmitDefaultValue=false)]
        public string ListingsProviderId { get; set; }

        /// <summary>
        /// Gets or Sets ListingsChannelId
        /// </summary>
        [DataMember(Name="ListingsChannelId", EmitDefaultValue=false)]
        public string ListingsChannelId { get; set; }

        /// <summary>
        /// Gets or Sets ListingsPath
        /// </summary>
        [DataMember(Name="ListingsPath", EmitDefaultValue=false)]
        public string ListingsPath { get; set; }

        /// <summary>
        /// Gets or Sets ListingsId
        /// </summary>
        [DataMember(Name="ListingsId", EmitDefaultValue=false)]
        public string ListingsId { get; set; }

        /// <summary>
        /// Gets or Sets ListingsChannelName
        /// </summary>
        [DataMember(Name="ListingsChannelName", EmitDefaultValue=false)]
        public string ListingsChannelName { get; set; }

        /// <summary>
        /// Gets or Sets ListingsChannelNumber
        /// </summary>
        [DataMember(Name="ListingsChannelNumber", EmitDefaultValue=false)]
        public string ListingsChannelNumber { get; set; }

        /// <summary>
        /// Gets or Sets AffiliateCallSign
        /// </summary>
        [DataMember(Name="AffiliateCallSign", EmitDefaultValue=false)]
        public string AffiliateCallSign { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BaseItemDto {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  OriginalTitle: ").Append(OriginalTitle).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  Etag: ").Append(Etag).Append("\n");
            sb.Append("  Prefix: ").Append(Prefix).Append("\n");
            sb.Append("  TunerName: ").Append(TunerName).Append("\n");
            sb.Append("  PlaylistItemId: ").Append(PlaylistItemId).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  DateModified: ").Append(DateModified).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  AverageFrameRate: ").Append(AverageFrameRate).Append("\n");
            sb.Append("  RealFrameRate: ").Append(RealFrameRate).Append("\n");
            sb.Append("  ExtraType: ").Append(ExtraType).Append("\n");
            sb.Append("  SortIndexNumber: ").Append(SortIndexNumber).Append("\n");
            sb.Append("  SortParentIndexNumber: ").Append(SortParentIndexNumber).Append("\n");
            sb.Append("  CanDelete: ").Append(CanDelete).Append("\n");
            sb.Append("  CanDownload: ").Append(CanDownload).Append("\n");
            sb.Append("  CanEditItems: ").Append(CanEditItems).Append("\n");
            sb.Append("  SupportsResume: ").Append(SupportsResume).Append("\n");
            sb.Append("  PresentationUniqueKey: ").Append(PresentationUniqueKey).Append("\n");
            sb.Append("  PreferredMetadataLanguage: ").Append(PreferredMetadataLanguage).Append("\n");
            sb.Append("  PreferredMetadataCountryCode: ").Append(PreferredMetadataCountryCode).Append("\n");
            sb.Append("  SupportsSync: ").Append(SupportsSync).Append("\n");
            sb.Append("  SyncStatus: ").Append(SyncStatus).Append("\n");
            sb.Append("  CanManageAccess: ").Append(CanManageAccess).Append("\n");
            sb.Append("  CanLeaveContent: ").Append(CanLeaveContent).Append("\n");
            sb.Append("  CanMakePublic: ").Append(CanMakePublic).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  SortName: ").Append(SortName).Append("\n");
            sb.Append("  ForcedSortName: ").Append(ForcedSortName).Append("\n");
            sb.Append("  Video3DFormat: ").Append(Video3DFormat).Append("\n");
            sb.Append("  PremiereDate: ").Append(PremiereDate).Append("\n");
            sb.Append("  ExternalUrls: ").Append(ExternalUrls).Append("\n");
            sb.Append("  MediaSources: ").Append(MediaSources).Append("\n");
            sb.Append("  CriticRating: ").Append(CriticRating).Append("\n");
            sb.Append("  GameSystemId: ").Append(GameSystemId).Append("\n");
            sb.Append("  AsSeries: ").Append(AsSeries).Append("\n");
            sb.Append("  GameSystem: ").Append(GameSystem).Append("\n");
            sb.Append("  ProductionLocations: ").Append(ProductionLocations).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  OfficialRating: ").Append(OfficialRating).Append("\n");
            sb.Append("  CustomRating: ").Append(CustomRating).Append("\n");
            sb.Append("  ChannelId: ").Append(ChannelId).Append("\n");
            sb.Append("  ChannelName: ").Append(ChannelName).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  Taglines: ").Append(Taglines).Append("\n");
            sb.Append("  Genres: ").Append(Genres).Append("\n");
            sb.Append("  CommunityRating: ").Append(CommunityRating).Append("\n");
            sb.Append("  RunTimeTicks: ").Append(RunTimeTicks).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  Bitrate: ").Append(Bitrate).Append("\n");
            sb.Append("  ProductionYear: ").Append(ProductionYear).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  ChannelNumber: ").Append(ChannelNumber).Append("\n");
            sb.Append("  IndexNumber: ").Append(IndexNumber).Append("\n");
            sb.Append("  IndexNumberEnd: ").Append(IndexNumberEnd).Append("\n");
            sb.Append("  ParentIndexNumber: ").Append(ParentIndexNumber).Append("\n");
            sb.Append("  RemoteTrailers: ").Append(RemoteTrailers).Append("\n");
            sb.Append("  ProviderIds: ").Append(ProviderIds).Append("\n");
            sb.Append("  IsFolder: ").Append(IsFolder).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  People: ").Append(People).Append("\n");
            sb.Append("  Studios: ").Append(Studios).Append("\n");
            sb.Append("  GenreItems: ").Append(GenreItems).Append("\n");
            sb.Append("  TagItems: ").Append(TagItems).Append("\n");
            sb.Append("  ParentLogoItemId: ").Append(ParentLogoItemId).Append("\n");
            sb.Append("  ParentBackdropItemId: ").Append(ParentBackdropItemId).Append("\n");
            sb.Append("  ParentBackdropImageTags: ").Append(ParentBackdropImageTags).Append("\n");
            sb.Append("  LocalTrailerCount: ").Append(LocalTrailerCount).Append("\n");
            sb.Append("  UserData: ").Append(UserData).Append("\n");
            sb.Append("  RecursiveItemCount: ").Append(RecursiveItemCount).Append("\n");
            sb.Append("  ChildCount: ").Append(ChildCount).Append("\n");
            sb.Append("  SeasonCount: ").Append(SeasonCount).Append("\n");
            sb.Append("  SeriesName: ").Append(SeriesName).Append("\n");
            sb.Append("  SeriesId: ").Append(SeriesId).Append("\n");
            sb.Append("  SeasonId: ").Append(SeasonId).Append("\n");
            sb.Append("  SpecialFeatureCount: ").Append(SpecialFeatureCount).Append("\n");
            sb.Append("  DisplayPreferencesId: ").Append(DisplayPreferencesId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  AirDays: ").Append(AirDays).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  PrimaryImageAspectRatio: ").Append(PrimaryImageAspectRatio).Append("\n");
            sb.Append("  Artists: ").Append(Artists).Append("\n");
            sb.Append("  ArtistItems: ").Append(ArtistItems).Append("\n");
            sb.Append("  Composers: ").Append(Composers).Append("\n");
            sb.Append("  Album: ").Append(Album).Append("\n");
            sb.Append("  CollectionType: ").Append(CollectionType).Append("\n");
            sb.Append("  DisplayOrder: ").Append(DisplayOrder).Append("\n");
            sb.Append("  AlbumId: ").Append(AlbumId).Append("\n");
            sb.Append("  AlbumPrimaryImageTag: ").Append(AlbumPrimaryImageTag).Append("\n");
            sb.Append("  SeriesPrimaryImageTag: ").Append(SeriesPrimaryImageTag).Append("\n");
            sb.Append("  AlbumArtist: ").Append(AlbumArtist).Append("\n");
            sb.Append("  AlbumArtists: ").Append(AlbumArtists).Append("\n");
            sb.Append("  SeasonName: ").Append(SeasonName).Append("\n");
            sb.Append("  MediaStreams: ").Append(MediaStreams).Append("\n");
            sb.Append("  PartCount: ").Append(PartCount).Append("\n");
            sb.Append("  ImageTags: ").Append(ImageTags).Append("\n");
            sb.Append("  BackdropImageTags: ").Append(BackdropImageTags).Append("\n");
            sb.Append("  ParentLogoImageTag: ").Append(ParentLogoImageTag).Append("\n");
            sb.Append("  SeriesStudio: ").Append(SeriesStudio).Append("\n");
            sb.Append("  PrimaryImageItemId: ").Append(PrimaryImageItemId).Append("\n");
            sb.Append("  PrimaryImageTag: ").Append(PrimaryImageTag).Append("\n");
            sb.Append("  ParentThumbItemId: ").Append(ParentThumbItemId).Append("\n");
            sb.Append("  ParentThumbImageTag: ").Append(ParentThumbImageTag).Append("\n");
            sb.Append("  Chapters: ").Append(Chapters).Append("\n");
            sb.Append("  LocationType: ").Append(LocationType).Append("\n");
            sb.Append("  MediaType: ").Append(MediaType).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  LockedFields: ").Append(LockedFields).Append("\n");
            sb.Append("  LockData: ").Append(LockData).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  CameraMake: ").Append(CameraMake).Append("\n");
            sb.Append("  CameraModel: ").Append(CameraModel).Append("\n");
            sb.Append("  Software: ").Append(Software).Append("\n");
            sb.Append("  ExposureTime: ").Append(ExposureTime).Append("\n");
            sb.Append("  FocalLength: ").Append(FocalLength).Append("\n");
            sb.Append("  ImageOrientation: ").Append(ImageOrientation).Append("\n");
            sb.Append("  Aperture: ").Append(Aperture).Append("\n");
            sb.Append("  ShutterSpeed: ").Append(ShutterSpeed).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  Altitude: ").Append(Altitude).Append("\n");
            sb.Append("  IsoSpeedRating: ").Append(IsoSpeedRating).Append("\n");
            sb.Append("  SeriesTimerId: ").Append(SeriesTimerId).Append("\n");
            sb.Append("  ChannelPrimaryImageTag: ").Append(ChannelPrimaryImageTag).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  CompletionPercentage: ").Append(CompletionPercentage).Append("\n");
            sb.Append("  IsRepeat: ").Append(IsRepeat).Append("\n");
            sb.Append("  IsNew: ").Append(IsNew).Append("\n");
            sb.Append("  EpisodeTitle: ").Append(EpisodeTitle).Append("\n");
            sb.Append("  IsMovie: ").Append(IsMovie).Append("\n");
            sb.Append("  IsSports: ").Append(IsSports).Append("\n");
            sb.Append("  IsSeries: ").Append(IsSeries).Append("\n");
            sb.Append("  IsLive: ").Append(IsLive).Append("\n");
            sb.Append("  IsNews: ").Append(IsNews).Append("\n");
            sb.Append("  IsKids: ").Append(IsKids).Append("\n");
            sb.Append("  IsPremiere: ").Append(IsPremiere).Append("\n");
            sb.Append("  TimerType: ").Append(TimerType).Append("\n");
            sb.Append("  Disabled: ").Append(Disabled).Append("\n");
            sb.Append("  ManagementId: ").Append(ManagementId).Append("\n");
            sb.Append("  TimerId: ").Append(TimerId).Append("\n");
            sb.Append("  CurrentProgram: ").Append(CurrentProgram).Append("\n");
            sb.Append("  MovieCount: ").Append(MovieCount).Append("\n");
            sb.Append("  SeriesCount: ").Append(SeriesCount).Append("\n");
            sb.Append("  AlbumCount: ").Append(AlbumCount).Append("\n");
            sb.Append("  SongCount: ").Append(SongCount).Append("\n");
            sb.Append("  MusicVideoCount: ").Append(MusicVideoCount).Append("\n");
            sb.Append("  Subviews: ").Append(Subviews).Append("\n");
            sb.Append("  ListingsProviderId: ").Append(ListingsProviderId).Append("\n");
            sb.Append("  ListingsChannelId: ").Append(ListingsChannelId).Append("\n");
            sb.Append("  ListingsPath: ").Append(ListingsPath).Append("\n");
            sb.Append("  ListingsId: ").Append(ListingsId).Append("\n");
            sb.Append("  ListingsChannelName: ").Append(ListingsChannelName).Append("\n");
            sb.Append("  ListingsChannelNumber: ").Append(ListingsChannelNumber).Append("\n");
            sb.Append("  AffiliateCallSign: ").Append(AffiliateCallSign).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BaseItemDto);
        }

        /// <summary>
        /// Returns true if BaseItemDto instances are equal
        /// </summary>
        /// <param name="input">Instance of BaseItemDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BaseItemDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.OriginalTitle == input.OriginalTitle ||
                    (this.OriginalTitle != null &&
                    this.OriginalTitle.Equals(input.OriginalTitle))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Guid == input.Guid ||
                    (this.Guid != null &&
                    this.Guid.Equals(input.Guid))
                ) && 
                (
                    this.Etag == input.Etag ||
                    (this.Etag != null &&
                    this.Etag.Equals(input.Etag))
                ) && 
                (
                    this.Prefix == input.Prefix ||
                    (this.Prefix != null &&
                    this.Prefix.Equals(input.Prefix))
                ) && 
                (
                    this.TunerName == input.TunerName ||
                    (this.TunerName != null &&
                    this.TunerName.Equals(input.TunerName))
                ) && 
                (
                    this.PlaylistItemId == input.PlaylistItemId ||
                    (this.PlaylistItemId != null &&
                    this.PlaylistItemId.Equals(input.PlaylistItemId))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.DateModified == input.DateModified ||
                    (this.DateModified != null &&
                    this.DateModified.Equals(input.DateModified))
                ) && 
                (
                    this.VideoCodec == input.VideoCodec ||
                    (this.VideoCodec != null &&
                    this.VideoCodec.Equals(input.VideoCodec))
                ) && 
                (
                    this.AudioCodec == input.AudioCodec ||
                    (this.AudioCodec != null &&
                    this.AudioCodec.Equals(input.AudioCodec))
                ) && 
                (
                    this.AverageFrameRate == input.AverageFrameRate ||
                    (this.AverageFrameRate != null &&
                    this.AverageFrameRate.Equals(input.AverageFrameRate))
                ) && 
                (
                    this.RealFrameRate == input.RealFrameRate ||
                    (this.RealFrameRate != null &&
                    this.RealFrameRate.Equals(input.RealFrameRate))
                ) && 
                (
                    this.ExtraType == input.ExtraType ||
                    (this.ExtraType != null &&
                    this.ExtraType.Equals(input.ExtraType))
                ) && 
                (
                    this.SortIndexNumber == input.SortIndexNumber ||
                    (this.SortIndexNumber != null &&
                    this.SortIndexNumber.Equals(input.SortIndexNumber))
                ) && 
                (
                    this.SortParentIndexNumber == input.SortParentIndexNumber ||
                    (this.SortParentIndexNumber != null &&
                    this.SortParentIndexNumber.Equals(input.SortParentIndexNumber))
                ) && 
                (
                    this.CanDelete == input.CanDelete ||
                    (this.CanDelete != null &&
                    this.CanDelete.Equals(input.CanDelete))
                ) && 
                (
                    this.CanDownload == input.CanDownload ||
                    (this.CanDownload != null &&
                    this.CanDownload.Equals(input.CanDownload))
                ) && 
                (
                    this.CanEditItems == input.CanEditItems ||
                    (this.CanEditItems != null &&
                    this.CanEditItems.Equals(input.CanEditItems))
                ) && 
                (
                    this.SupportsResume == input.SupportsResume ||
                    (this.SupportsResume != null &&
                    this.SupportsResume.Equals(input.SupportsResume))
                ) && 
                (
                    this.PresentationUniqueKey == input.PresentationUniqueKey ||
                    (this.PresentationUniqueKey != null &&
                    this.PresentationUniqueKey.Equals(input.PresentationUniqueKey))
                ) && 
                (
                    this.PreferredMetadataLanguage == input.PreferredMetadataLanguage ||
                    (this.PreferredMetadataLanguage != null &&
                    this.PreferredMetadataLanguage.Equals(input.PreferredMetadataLanguage))
                ) && 
                (
                    this.PreferredMetadataCountryCode == input.PreferredMetadataCountryCode ||
                    (this.PreferredMetadataCountryCode != null &&
                    this.PreferredMetadataCountryCode.Equals(input.PreferredMetadataCountryCode))
                ) && 
                (
                    this.SupportsSync == input.SupportsSync ||
                    (this.SupportsSync != null &&
                    this.SupportsSync.Equals(input.SupportsSync))
                ) && 
                (
                    this.SyncStatus == input.SyncStatus ||
                    (this.SyncStatus != null &&
                    this.SyncStatus.Equals(input.SyncStatus))
                ) && 
                (
                    this.CanManageAccess == input.CanManageAccess ||
                    (this.CanManageAccess != null &&
                    this.CanManageAccess.Equals(input.CanManageAccess))
                ) && 
                (
                    this.CanLeaveContent == input.CanLeaveContent ||
                    (this.CanLeaveContent != null &&
                    this.CanLeaveContent.Equals(input.CanLeaveContent))
                ) && 
                (
                    this.CanMakePublic == input.CanMakePublic ||
                    (this.CanMakePublic != null &&
                    this.CanMakePublic.Equals(input.CanMakePublic))
                ) && 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.SortName == input.SortName ||
                    (this.SortName != null &&
                    this.SortName.Equals(input.SortName))
                ) && 
                (
                    this.ForcedSortName == input.ForcedSortName ||
                    (this.ForcedSortName != null &&
                    this.ForcedSortName.Equals(input.ForcedSortName))
                ) && 
                (
                    this.Video3DFormat == input.Video3DFormat ||
                    (this.Video3DFormat != null &&
                    this.Video3DFormat.Equals(input.Video3DFormat))
                ) && 
                (
                    this.PremiereDate == input.PremiereDate ||
                    (this.PremiereDate != null &&
                    this.PremiereDate.Equals(input.PremiereDate))
                ) && 
                (
                    this.ExternalUrls == input.ExternalUrls ||
                    this.ExternalUrls != null &&
                    input.ExternalUrls != null &&
                    this.ExternalUrls.SequenceEqual(input.ExternalUrls)
                ) && 
                (
                    this.MediaSources == input.MediaSources ||
                    this.MediaSources != null &&
                    input.MediaSources != null &&
                    this.MediaSources.SequenceEqual(input.MediaSources)
                ) && 
                (
                    this.CriticRating == input.CriticRating ||
                    (this.CriticRating != null &&
                    this.CriticRating.Equals(input.CriticRating))
                ) && 
                (
                    this.GameSystemId == input.GameSystemId ||
                    (this.GameSystemId != null &&
                    this.GameSystemId.Equals(input.GameSystemId))
                ) && 
                (
                    this.AsSeries == input.AsSeries ||
                    (this.AsSeries != null &&
                    this.AsSeries.Equals(input.AsSeries))
                ) && 
                (
                    this.GameSystem == input.GameSystem ||
                    (this.GameSystem != null &&
                    this.GameSystem.Equals(input.GameSystem))
                ) && 
                (
                    this.ProductionLocations == input.ProductionLocations ||
                    this.ProductionLocations != null &&
                    input.ProductionLocations != null &&
                    this.ProductionLocations.SequenceEqual(input.ProductionLocations)
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.OfficialRating == input.OfficialRating ||
                    (this.OfficialRating != null &&
                    this.OfficialRating.Equals(input.OfficialRating))
                ) && 
                (
                    this.CustomRating == input.CustomRating ||
                    (this.CustomRating != null &&
                    this.CustomRating.Equals(input.CustomRating))
                ) && 
                (
                    this.ChannelId == input.ChannelId ||
                    (this.ChannelId != null &&
                    this.ChannelId.Equals(input.ChannelId))
                ) && 
                (
                    this.ChannelName == input.ChannelName ||
                    (this.ChannelName != null &&
                    this.ChannelName.Equals(input.ChannelName))
                ) && 
                (
                    this.Overview == input.Overview ||
                    (this.Overview != null &&
                    this.Overview.Equals(input.Overview))
                ) && 
                (
                    this.Taglines == input.Taglines ||
                    this.Taglines != null &&
                    input.Taglines != null &&
                    this.Taglines.SequenceEqual(input.Taglines)
                ) && 
                (
                    this.Genres == input.Genres ||
                    this.Genres != null &&
                    input.Genres != null &&
                    this.Genres.SequenceEqual(input.Genres)
                ) && 
                (
                    this.CommunityRating == input.CommunityRating ||
                    (this.CommunityRating != null &&
                    this.CommunityRating.Equals(input.CommunityRating))
                ) && 
                (
                    this.RunTimeTicks == input.RunTimeTicks ||
                    (this.RunTimeTicks != null &&
                    this.RunTimeTicks.Equals(input.RunTimeTicks))
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
                ) && 
                (
                    this.FileName == input.FileName ||
                    (this.FileName != null &&
                    this.FileName.Equals(input.FileName))
                ) && 
                (
                    this.Bitrate == input.Bitrate ||
                    (this.Bitrate != null &&
                    this.Bitrate.Equals(input.Bitrate))
                ) && 
                (
                    this.ProductionYear == input.ProductionYear ||
                    (this.ProductionYear != null &&
                    this.ProductionYear.Equals(input.ProductionYear))
                ) && 
                (
                    this.Number == input.Number ||
                    (this.Number != null &&
                    this.Number.Equals(input.Number))
                ) && 
                (
                    this.ChannelNumber == input.ChannelNumber ||
                    (this.ChannelNumber != null &&
                    this.ChannelNumber.Equals(input.ChannelNumber))
                ) && 
                (
                    this.IndexNumber == input.IndexNumber ||
                    (this.IndexNumber != null &&
                    this.IndexNumber.Equals(input.IndexNumber))
                ) && 
                (
                    this.IndexNumberEnd == input.IndexNumberEnd ||
                    (this.IndexNumberEnd != null &&
                    this.IndexNumberEnd.Equals(input.IndexNumberEnd))
                ) && 
                (
                    this.ParentIndexNumber == input.ParentIndexNumber ||
                    (this.ParentIndexNumber != null &&
                    this.ParentIndexNumber.Equals(input.ParentIndexNumber))
                ) && 
                (
                    this.RemoteTrailers == input.RemoteTrailers ||
                    this.RemoteTrailers != null &&
                    input.RemoteTrailers != null &&
                    this.RemoteTrailers.SequenceEqual(input.RemoteTrailers)
                ) && 
                (
                    this.ProviderIds == input.ProviderIds ||
                    (this.ProviderIds != null &&
                    this.ProviderIds.Equals(input.ProviderIds))
                ) && 
                (
                    this.IsFolder == input.IsFolder ||
                    (this.IsFolder != null &&
                    this.IsFolder.Equals(input.IsFolder))
                ) && 
                (
                    this.ParentId == input.ParentId ||
                    (this.ParentId != null &&
                    this.ParentId.Equals(input.ParentId))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.People == input.People ||
                    this.People != null &&
                    input.People != null &&
                    this.People.SequenceEqual(input.People)
                ) && 
                (
                    this.Studios == input.Studios ||
                    this.Studios != null &&
                    input.Studios != null &&
                    this.Studios.SequenceEqual(input.Studios)
                ) && 
                (
                    this.GenreItems == input.GenreItems ||
                    this.GenreItems != null &&
                    input.GenreItems != null &&
                    this.GenreItems.SequenceEqual(input.GenreItems)
                ) && 
                (
                    this.TagItems == input.TagItems ||
                    this.TagItems != null &&
                    input.TagItems != null &&
                    this.TagItems.SequenceEqual(input.TagItems)
                ) && 
                (
                    this.ParentLogoItemId == input.ParentLogoItemId ||
                    (this.ParentLogoItemId != null &&
                    this.ParentLogoItemId.Equals(input.ParentLogoItemId))
                ) && 
                (
                    this.ParentBackdropItemId == input.ParentBackdropItemId ||
                    (this.ParentBackdropItemId != null &&
                    this.ParentBackdropItemId.Equals(input.ParentBackdropItemId))
                ) && 
                (
                    this.ParentBackdropImageTags == input.ParentBackdropImageTags ||
                    this.ParentBackdropImageTags != null &&
                    input.ParentBackdropImageTags != null &&
                    this.ParentBackdropImageTags.SequenceEqual(input.ParentBackdropImageTags)
                ) && 
                (
                    this.LocalTrailerCount == input.LocalTrailerCount ||
                    (this.LocalTrailerCount != null &&
                    this.LocalTrailerCount.Equals(input.LocalTrailerCount))
                ) && 
                (
                    this.UserData == input.UserData ||
                    (this.UserData != null &&
                    this.UserData.Equals(input.UserData))
                ) && 
                (
                    this.RecursiveItemCount == input.RecursiveItemCount ||
                    (this.RecursiveItemCount != null &&
                    this.RecursiveItemCount.Equals(input.RecursiveItemCount))
                ) && 
                (
                    this.ChildCount == input.ChildCount ||
                    (this.ChildCount != null &&
                    this.ChildCount.Equals(input.ChildCount))
                ) && 
                (
                    this.SeasonCount == input.SeasonCount ||
                    (this.SeasonCount != null &&
                    this.SeasonCount.Equals(input.SeasonCount))
                ) && 
                (
                    this.SeriesName == input.SeriesName ||
                    (this.SeriesName != null &&
                    this.SeriesName.Equals(input.SeriesName))
                ) && 
                (
                    this.SeriesId == input.SeriesId ||
                    (this.SeriesId != null &&
                    this.SeriesId.Equals(input.SeriesId))
                ) && 
                (
                    this.SeasonId == input.SeasonId ||
                    (this.SeasonId != null &&
                    this.SeasonId.Equals(input.SeasonId))
                ) && 
                (
                    this.SpecialFeatureCount == input.SpecialFeatureCount ||
                    (this.SpecialFeatureCount != null &&
                    this.SpecialFeatureCount.Equals(input.SpecialFeatureCount))
                ) && 
                (
                    this.DisplayPreferencesId == input.DisplayPreferencesId ||
                    (this.DisplayPreferencesId != null &&
                    this.DisplayPreferencesId.Equals(input.DisplayPreferencesId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.AirDays == input.AirDays ||
                    this.AirDays != null &&
                    input.AirDays != null &&
                    this.AirDays.SequenceEqual(input.AirDays)
                ) && 
                (
                    this.Tags == input.Tags ||
                    this.Tags != null &&
                    input.Tags != null &&
                    this.Tags.SequenceEqual(input.Tags)
                ) && 
                (
                    this.PrimaryImageAspectRatio == input.PrimaryImageAspectRatio ||
                    (this.PrimaryImageAspectRatio != null &&
                    this.PrimaryImageAspectRatio.Equals(input.PrimaryImageAspectRatio))
                ) && 
                (
                    this.Artists == input.Artists ||
                    this.Artists != null &&
                    input.Artists != null &&
                    this.Artists.SequenceEqual(input.Artists)
                ) && 
                (
                    this.ArtistItems == input.ArtistItems ||
                    this.ArtistItems != null &&
                    input.ArtistItems != null &&
                    this.ArtistItems.SequenceEqual(input.ArtistItems)
                ) && 
                (
                    this.Composers == input.Composers ||
                    this.Composers != null &&
                    input.Composers != null &&
                    this.Composers.SequenceEqual(input.Composers)
                ) && 
                (
                    this.Album == input.Album ||
                    (this.Album != null &&
                    this.Album.Equals(input.Album))
                ) && 
                (
                    this.CollectionType == input.CollectionType ||
                    (this.CollectionType != null &&
                    this.CollectionType.Equals(input.CollectionType))
                ) && 
                (
                    this.DisplayOrder == input.DisplayOrder ||
                    (this.DisplayOrder != null &&
                    this.DisplayOrder.Equals(input.DisplayOrder))
                ) && 
                (
                    this.AlbumId == input.AlbumId ||
                    (this.AlbumId != null &&
                    this.AlbumId.Equals(input.AlbumId))
                ) && 
                (
                    this.AlbumPrimaryImageTag == input.AlbumPrimaryImageTag ||
                    (this.AlbumPrimaryImageTag != null &&
                    this.AlbumPrimaryImageTag.Equals(input.AlbumPrimaryImageTag))
                ) && 
                (
                    this.SeriesPrimaryImageTag == input.SeriesPrimaryImageTag ||
                    (this.SeriesPrimaryImageTag != null &&
                    this.SeriesPrimaryImageTag.Equals(input.SeriesPrimaryImageTag))
                ) && 
                (
                    this.AlbumArtist == input.AlbumArtist ||
                    (this.AlbumArtist != null &&
                    this.AlbumArtist.Equals(input.AlbumArtist))
                ) && 
                (
                    this.AlbumArtists == input.AlbumArtists ||
                    this.AlbumArtists != null &&
                    input.AlbumArtists != null &&
                    this.AlbumArtists.SequenceEqual(input.AlbumArtists)
                ) && 
                (
                    this.SeasonName == input.SeasonName ||
                    (this.SeasonName != null &&
                    this.SeasonName.Equals(input.SeasonName))
                ) && 
                (
                    this.MediaStreams == input.MediaStreams ||
                    this.MediaStreams != null &&
                    input.MediaStreams != null &&
                    this.MediaStreams.SequenceEqual(input.MediaStreams)
                ) && 
                (
                    this.PartCount == input.PartCount ||
                    (this.PartCount != null &&
                    this.PartCount.Equals(input.PartCount))
                ) && 
                (
                    this.ImageTags == input.ImageTags ||
                    this.ImageTags != null &&
                    input.ImageTags != null &&
                    this.ImageTags.SequenceEqual(input.ImageTags)
                ) && 
                (
                    this.BackdropImageTags == input.BackdropImageTags ||
                    this.BackdropImageTags != null &&
                    input.BackdropImageTags != null &&
                    this.BackdropImageTags.SequenceEqual(input.BackdropImageTags)
                ) && 
                (
                    this.ParentLogoImageTag == input.ParentLogoImageTag ||
                    (this.ParentLogoImageTag != null &&
                    this.ParentLogoImageTag.Equals(input.ParentLogoImageTag))
                ) && 
                (
                    this.SeriesStudio == input.SeriesStudio ||
                    (this.SeriesStudio != null &&
                    this.SeriesStudio.Equals(input.SeriesStudio))
                ) && 
                (
                    this.PrimaryImageItemId == input.PrimaryImageItemId ||
                    (this.PrimaryImageItemId != null &&
                    this.PrimaryImageItemId.Equals(input.PrimaryImageItemId))
                ) && 
                (
                    this.PrimaryImageTag == input.PrimaryImageTag ||
                    (this.PrimaryImageTag != null &&
                    this.PrimaryImageTag.Equals(input.PrimaryImageTag))
                ) && 
                (
                    this.ParentThumbItemId == input.ParentThumbItemId ||
                    (this.ParentThumbItemId != null &&
                    this.ParentThumbItemId.Equals(input.ParentThumbItemId))
                ) && 
                (
                    this.ParentThumbImageTag == input.ParentThumbImageTag ||
                    (this.ParentThumbImageTag != null &&
                    this.ParentThumbImageTag.Equals(input.ParentThumbImageTag))
                ) && 
                (
                    this.Chapters == input.Chapters ||
                    this.Chapters != null &&
                    input.Chapters != null &&
                    this.Chapters.SequenceEqual(input.Chapters)
                ) && 
                (
                    this.LocationType == input.LocationType ||
                    (this.LocationType != null &&
                    this.LocationType.Equals(input.LocationType))
                ) && 
                (
                    this.MediaType == input.MediaType ||
                    (this.MediaType != null &&
                    this.MediaType.Equals(input.MediaType))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.LockedFields == input.LockedFields ||
                    this.LockedFields != null &&
                    input.LockedFields != null &&
                    this.LockedFields.SequenceEqual(input.LockedFields)
                ) && 
                (
                    this.LockData == input.LockData ||
                    (this.LockData != null &&
                    this.LockData.Equals(input.LockData))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.CameraMake == input.CameraMake ||
                    (this.CameraMake != null &&
                    this.CameraMake.Equals(input.CameraMake))
                ) && 
                (
                    this.CameraModel == input.CameraModel ||
                    (this.CameraModel != null &&
                    this.CameraModel.Equals(input.CameraModel))
                ) && 
                (
                    this.Software == input.Software ||
                    (this.Software != null &&
                    this.Software.Equals(input.Software))
                ) && 
                (
                    this.ExposureTime == input.ExposureTime ||
                    (this.ExposureTime != null &&
                    this.ExposureTime.Equals(input.ExposureTime))
                ) && 
                (
                    this.FocalLength == input.FocalLength ||
                    (this.FocalLength != null &&
                    this.FocalLength.Equals(input.FocalLength))
                ) && 
                (
                    this.ImageOrientation == input.ImageOrientation ||
                    (this.ImageOrientation != null &&
                    this.ImageOrientation.Equals(input.ImageOrientation))
                ) && 
                (
                    this.Aperture == input.Aperture ||
                    (this.Aperture != null &&
                    this.Aperture.Equals(input.Aperture))
                ) && 
                (
                    this.ShutterSpeed == input.ShutterSpeed ||
                    (this.ShutterSpeed != null &&
                    this.ShutterSpeed.Equals(input.ShutterSpeed))
                ) && 
                (
                    this.Latitude == input.Latitude ||
                    (this.Latitude != null &&
                    this.Latitude.Equals(input.Latitude))
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    (this.Longitude != null &&
                    this.Longitude.Equals(input.Longitude))
                ) && 
                (
                    this.Altitude == input.Altitude ||
                    (this.Altitude != null &&
                    this.Altitude.Equals(input.Altitude))
                ) && 
                (
                    this.IsoSpeedRating == input.IsoSpeedRating ||
                    (this.IsoSpeedRating != null &&
                    this.IsoSpeedRating.Equals(input.IsoSpeedRating))
                ) && 
                (
                    this.SeriesTimerId == input.SeriesTimerId ||
                    (this.SeriesTimerId != null &&
                    this.SeriesTimerId.Equals(input.SeriesTimerId))
                ) && 
                (
                    this.ChannelPrimaryImageTag == input.ChannelPrimaryImageTag ||
                    (this.ChannelPrimaryImageTag != null &&
                    this.ChannelPrimaryImageTag.Equals(input.ChannelPrimaryImageTag))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.CompletionPercentage == input.CompletionPercentage ||
                    (this.CompletionPercentage != null &&
                    this.CompletionPercentage.Equals(input.CompletionPercentage))
                ) && 
                (
                    this.IsRepeat == input.IsRepeat ||
                    (this.IsRepeat != null &&
                    this.IsRepeat.Equals(input.IsRepeat))
                ) && 
                (
                    this.IsNew == input.IsNew ||
                    (this.IsNew != null &&
                    this.IsNew.Equals(input.IsNew))
                ) && 
                (
                    this.EpisodeTitle == input.EpisodeTitle ||
                    (this.EpisodeTitle != null &&
                    this.EpisodeTitle.Equals(input.EpisodeTitle))
                ) && 
                (
                    this.IsMovie == input.IsMovie ||
                    (this.IsMovie != null &&
                    this.IsMovie.Equals(input.IsMovie))
                ) && 
                (
                    this.IsSports == input.IsSports ||
                    (this.IsSports != null &&
                    this.IsSports.Equals(input.IsSports))
                ) && 
                (
                    this.IsSeries == input.IsSeries ||
                    (this.IsSeries != null &&
                    this.IsSeries.Equals(input.IsSeries))
                ) && 
                (
                    this.IsLive == input.IsLive ||
                    (this.IsLive != null &&
                    this.IsLive.Equals(input.IsLive))
                ) && 
                (
                    this.IsNews == input.IsNews ||
                    (this.IsNews != null &&
                    this.IsNews.Equals(input.IsNews))
                ) && 
                (
                    this.IsKids == input.IsKids ||
                    (this.IsKids != null &&
                    this.IsKids.Equals(input.IsKids))
                ) && 
                (
                    this.IsPremiere == input.IsPremiere ||
                    (this.IsPremiere != null &&
                    this.IsPremiere.Equals(input.IsPremiere))
                ) && 
                (
                    this.TimerType == input.TimerType ||
                    (this.TimerType != null &&
                    this.TimerType.Equals(input.TimerType))
                ) && 
                (
                    this.Disabled == input.Disabled ||
                    (this.Disabled != null &&
                    this.Disabled.Equals(input.Disabled))
                ) && 
                (
                    this.ManagementId == input.ManagementId ||
                    (this.ManagementId != null &&
                    this.ManagementId.Equals(input.ManagementId))
                ) && 
                (
                    this.TimerId == input.TimerId ||
                    (this.TimerId != null &&
                    this.TimerId.Equals(input.TimerId))
                ) && 
                (
                    this.CurrentProgram == input.CurrentProgram ||
                    (this.CurrentProgram != null &&
                    this.CurrentProgram.Equals(input.CurrentProgram))
                ) && 
                (
                    this.MovieCount == input.MovieCount ||
                    (this.MovieCount != null &&
                    this.MovieCount.Equals(input.MovieCount))
                ) && 
                (
                    this.SeriesCount == input.SeriesCount ||
                    (this.SeriesCount != null &&
                    this.SeriesCount.Equals(input.SeriesCount))
                ) && 
                (
                    this.AlbumCount == input.AlbumCount ||
                    (this.AlbumCount != null &&
                    this.AlbumCount.Equals(input.AlbumCount))
                ) && 
                (
                    this.SongCount == input.SongCount ||
                    (this.SongCount != null &&
                    this.SongCount.Equals(input.SongCount))
                ) && 
                (
                    this.MusicVideoCount == input.MusicVideoCount ||
                    (this.MusicVideoCount != null &&
                    this.MusicVideoCount.Equals(input.MusicVideoCount))
                ) && 
                (
                    this.Subviews == input.Subviews ||
                    this.Subviews != null &&
                    input.Subviews != null &&
                    this.Subviews.SequenceEqual(input.Subviews)
                ) && 
                (
                    this.ListingsProviderId == input.ListingsProviderId ||
                    (this.ListingsProviderId != null &&
                    this.ListingsProviderId.Equals(input.ListingsProviderId))
                ) && 
                (
                    this.ListingsChannelId == input.ListingsChannelId ||
                    (this.ListingsChannelId != null &&
                    this.ListingsChannelId.Equals(input.ListingsChannelId))
                ) && 
                (
                    this.ListingsPath == input.ListingsPath ||
                    (this.ListingsPath != null &&
                    this.ListingsPath.Equals(input.ListingsPath))
                ) && 
                (
                    this.ListingsId == input.ListingsId ||
                    (this.ListingsId != null &&
                    this.ListingsId.Equals(input.ListingsId))
                ) && 
                (
                    this.ListingsChannelName == input.ListingsChannelName ||
                    (this.ListingsChannelName != null &&
                    this.ListingsChannelName.Equals(input.ListingsChannelName))
                ) && 
                (
                    this.ListingsChannelNumber == input.ListingsChannelNumber ||
                    (this.ListingsChannelNumber != null &&
                    this.ListingsChannelNumber.Equals(input.ListingsChannelNumber))
                ) && 
                (
                    this.AffiliateCallSign == input.AffiliateCallSign ||
                    (this.AffiliateCallSign != null &&
                    this.AffiliateCallSign.Equals(input.AffiliateCallSign))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.OriginalTitle != null)
                    hashCode = hashCode * 59 + this.OriginalTitle.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Guid != null)
                    hashCode = hashCode * 59 + this.Guid.GetHashCode();
                if (this.Etag != null)
                    hashCode = hashCode * 59 + this.Etag.GetHashCode();
                if (this.Prefix != null)
                    hashCode = hashCode * 59 + this.Prefix.GetHashCode();
                if (this.TunerName != null)
                    hashCode = hashCode * 59 + this.TunerName.GetHashCode();
                if (this.PlaylistItemId != null)
                    hashCode = hashCode * 59 + this.PlaylistItemId.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.DateModified != null)
                    hashCode = hashCode * 59 + this.DateModified.GetHashCode();
                if (this.VideoCodec != null)
                    hashCode = hashCode * 59 + this.VideoCodec.GetHashCode();
                if (this.AudioCodec != null)
                    hashCode = hashCode * 59 + this.AudioCodec.GetHashCode();
                if (this.AverageFrameRate != null)
                    hashCode = hashCode * 59 + this.AverageFrameRate.GetHashCode();
                if (this.RealFrameRate != null)
                    hashCode = hashCode * 59 + this.RealFrameRate.GetHashCode();
                if (this.ExtraType != null)
                    hashCode = hashCode * 59 + this.ExtraType.GetHashCode();
                if (this.SortIndexNumber != null)
                    hashCode = hashCode * 59 + this.SortIndexNumber.GetHashCode();
                if (this.SortParentIndexNumber != null)
                    hashCode = hashCode * 59 + this.SortParentIndexNumber.GetHashCode();
                if (this.CanDelete != null)
                    hashCode = hashCode * 59 + this.CanDelete.GetHashCode();
                if (this.CanDownload != null)
                    hashCode = hashCode * 59 + this.CanDownload.GetHashCode();
                if (this.CanEditItems != null)
                    hashCode = hashCode * 59 + this.CanEditItems.GetHashCode();
                if (this.SupportsResume != null)
                    hashCode = hashCode * 59 + this.SupportsResume.GetHashCode();
                if (this.PresentationUniqueKey != null)
                    hashCode = hashCode * 59 + this.PresentationUniqueKey.GetHashCode();
                if (this.PreferredMetadataLanguage != null)
                    hashCode = hashCode * 59 + this.PreferredMetadataLanguage.GetHashCode();
                if (this.PreferredMetadataCountryCode != null)
                    hashCode = hashCode * 59 + this.PreferredMetadataCountryCode.GetHashCode();
                if (this.SupportsSync != null)
                    hashCode = hashCode * 59 + this.SupportsSync.GetHashCode();
                if (this.SyncStatus != null)
                    hashCode = hashCode * 59 + this.SyncStatus.GetHashCode();
                if (this.CanManageAccess != null)
                    hashCode = hashCode * 59 + this.CanManageAccess.GetHashCode();
                if (this.CanLeaveContent != null)
                    hashCode = hashCode * 59 + this.CanLeaveContent.GetHashCode();
                if (this.CanMakePublic != null)
                    hashCode = hashCode * 59 + this.CanMakePublic.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.SortName != null)
                    hashCode = hashCode * 59 + this.SortName.GetHashCode();
                if (this.ForcedSortName != null)
                    hashCode = hashCode * 59 + this.ForcedSortName.GetHashCode();
                if (this.Video3DFormat != null)
                    hashCode = hashCode * 59 + this.Video3DFormat.GetHashCode();
                if (this.PremiereDate != null)
                    hashCode = hashCode * 59 + this.PremiereDate.GetHashCode();
                if (this.ExternalUrls != null)
                    hashCode = hashCode * 59 + this.ExternalUrls.GetHashCode();
                if (this.MediaSources != null)
                    hashCode = hashCode * 59 + this.MediaSources.GetHashCode();
                if (this.CriticRating != null)
                    hashCode = hashCode * 59 + this.CriticRating.GetHashCode();
                if (this.GameSystemId != null)
                    hashCode = hashCode * 59 + this.GameSystemId.GetHashCode();
                if (this.AsSeries != null)
                    hashCode = hashCode * 59 + this.AsSeries.GetHashCode();
                if (this.GameSystem != null)
                    hashCode = hashCode * 59 + this.GameSystem.GetHashCode();
                if (this.ProductionLocations != null)
                    hashCode = hashCode * 59 + this.ProductionLocations.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.OfficialRating != null)
                    hashCode = hashCode * 59 + this.OfficialRating.GetHashCode();
                if (this.CustomRating != null)
                    hashCode = hashCode * 59 + this.CustomRating.GetHashCode();
                if (this.ChannelId != null)
                    hashCode = hashCode * 59 + this.ChannelId.GetHashCode();
                if (this.ChannelName != null)
                    hashCode = hashCode * 59 + this.ChannelName.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.Taglines != null)
                    hashCode = hashCode * 59 + this.Taglines.GetHashCode();
                if (this.Genres != null)
                    hashCode = hashCode * 59 + this.Genres.GetHashCode();
                if (this.CommunityRating != null)
                    hashCode = hashCode * 59 + this.CommunityRating.GetHashCode();
                if (this.RunTimeTicks != null)
                    hashCode = hashCode * 59 + this.RunTimeTicks.GetHashCode();
                if (this.Size != null)
                    hashCode = hashCode * 59 + this.Size.GetHashCode();
                if (this.FileName != null)
                    hashCode = hashCode * 59 + this.FileName.GetHashCode();
                if (this.Bitrate != null)
                    hashCode = hashCode * 59 + this.Bitrate.GetHashCode();
                if (this.ProductionYear != null)
                    hashCode = hashCode * 59 + this.ProductionYear.GetHashCode();
                if (this.Number != null)
                    hashCode = hashCode * 59 + this.Number.GetHashCode();
                if (this.ChannelNumber != null)
                    hashCode = hashCode * 59 + this.ChannelNumber.GetHashCode();
                if (this.IndexNumber != null)
                    hashCode = hashCode * 59 + this.IndexNumber.GetHashCode();
                if (this.IndexNumberEnd != null)
                    hashCode = hashCode * 59 + this.IndexNumberEnd.GetHashCode();
                if (this.ParentIndexNumber != null)
                    hashCode = hashCode * 59 + this.ParentIndexNumber.GetHashCode();
                if (this.RemoteTrailers != null)
                    hashCode = hashCode * 59 + this.RemoteTrailers.GetHashCode();
                if (this.ProviderIds != null)
                    hashCode = hashCode * 59 + this.ProviderIds.GetHashCode();
                if (this.IsFolder != null)
                    hashCode = hashCode * 59 + this.IsFolder.GetHashCode();
                if (this.ParentId != null)
                    hashCode = hashCode * 59 + this.ParentId.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.People != null)
                    hashCode = hashCode * 59 + this.People.GetHashCode();
                if (this.Studios != null)
                    hashCode = hashCode * 59 + this.Studios.GetHashCode();
                if (this.GenreItems != null)
                    hashCode = hashCode * 59 + this.GenreItems.GetHashCode();
                if (this.TagItems != null)
                    hashCode = hashCode * 59 + this.TagItems.GetHashCode();
                if (this.ParentLogoItemId != null)
                    hashCode = hashCode * 59 + this.ParentLogoItemId.GetHashCode();
                if (this.ParentBackdropItemId != null)
                    hashCode = hashCode * 59 + this.ParentBackdropItemId.GetHashCode();
                if (this.ParentBackdropImageTags != null)
                    hashCode = hashCode * 59 + this.ParentBackdropImageTags.GetHashCode();
                if (this.LocalTrailerCount != null)
                    hashCode = hashCode * 59 + this.LocalTrailerCount.GetHashCode();
                if (this.UserData != null)
                    hashCode = hashCode * 59 + this.UserData.GetHashCode();
                if (this.RecursiveItemCount != null)
                    hashCode = hashCode * 59 + this.RecursiveItemCount.GetHashCode();
                if (this.ChildCount != null)
                    hashCode = hashCode * 59 + this.ChildCount.GetHashCode();
                if (this.SeasonCount != null)
                    hashCode = hashCode * 59 + this.SeasonCount.GetHashCode();
                if (this.SeriesName != null)
                    hashCode = hashCode * 59 + this.SeriesName.GetHashCode();
                if (this.SeriesId != null)
                    hashCode = hashCode * 59 + this.SeriesId.GetHashCode();
                if (this.SeasonId != null)
                    hashCode = hashCode * 59 + this.SeasonId.GetHashCode();
                if (this.SpecialFeatureCount != null)
                    hashCode = hashCode * 59 + this.SpecialFeatureCount.GetHashCode();
                if (this.DisplayPreferencesId != null)
                    hashCode = hashCode * 59 + this.DisplayPreferencesId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.AirDays != null)
                    hashCode = hashCode * 59 + this.AirDays.GetHashCode();
                if (this.Tags != null)
                    hashCode = hashCode * 59 + this.Tags.GetHashCode();
                if (this.PrimaryImageAspectRatio != null)
                    hashCode = hashCode * 59 + this.PrimaryImageAspectRatio.GetHashCode();
                if (this.Artists != null)
                    hashCode = hashCode * 59 + this.Artists.GetHashCode();
                if (this.ArtistItems != null)
                    hashCode = hashCode * 59 + this.ArtistItems.GetHashCode();
                if (this.Composers != null)
                    hashCode = hashCode * 59 + this.Composers.GetHashCode();
                if (this.Album != null)
                    hashCode = hashCode * 59 + this.Album.GetHashCode();
                if (this.CollectionType != null)
                    hashCode = hashCode * 59 + this.CollectionType.GetHashCode();
                if (this.DisplayOrder != null)
                    hashCode = hashCode * 59 + this.DisplayOrder.GetHashCode();
                if (this.AlbumId != null)
                    hashCode = hashCode * 59 + this.AlbumId.GetHashCode();
                if (this.AlbumPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.AlbumPrimaryImageTag.GetHashCode();
                if (this.SeriesPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.SeriesPrimaryImageTag.GetHashCode();
                if (this.AlbumArtist != null)
                    hashCode = hashCode * 59 + this.AlbumArtist.GetHashCode();
                if (this.AlbumArtists != null)
                    hashCode = hashCode * 59 + this.AlbumArtists.GetHashCode();
                if (this.SeasonName != null)
                    hashCode = hashCode * 59 + this.SeasonName.GetHashCode();
                if (this.MediaStreams != null)
                    hashCode = hashCode * 59 + this.MediaStreams.GetHashCode();
                if (this.PartCount != null)
                    hashCode = hashCode * 59 + this.PartCount.GetHashCode();
                if (this.ImageTags != null)
                    hashCode = hashCode * 59 + this.ImageTags.GetHashCode();
                if (this.BackdropImageTags != null)
                    hashCode = hashCode * 59 + this.BackdropImageTags.GetHashCode();
                if (this.ParentLogoImageTag != null)
                    hashCode = hashCode * 59 + this.ParentLogoImageTag.GetHashCode();
                if (this.SeriesStudio != null)
                    hashCode = hashCode * 59 + this.SeriesStudio.GetHashCode();
                if (this.PrimaryImageItemId != null)
                    hashCode = hashCode * 59 + this.PrimaryImageItemId.GetHashCode();
                if (this.PrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.PrimaryImageTag.GetHashCode();
                if (this.ParentThumbItemId != null)
                    hashCode = hashCode * 59 + this.ParentThumbItemId.GetHashCode();
                if (this.ParentThumbImageTag != null)
                    hashCode = hashCode * 59 + this.ParentThumbImageTag.GetHashCode();
                if (this.Chapters != null)
                    hashCode = hashCode * 59 + this.Chapters.GetHashCode();
                if (this.LocationType != null)
                    hashCode = hashCode * 59 + this.LocationType.GetHashCode();
                if (this.MediaType != null)
                    hashCode = hashCode * 59 + this.MediaType.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.LockedFields != null)
                    hashCode = hashCode * 59 + this.LockedFields.GetHashCode();
                if (this.LockData != null)
                    hashCode = hashCode * 59 + this.LockData.GetHashCode();
                if (this.Width != null)
                    hashCode = hashCode * 59 + this.Width.GetHashCode();
                if (this.Height != null)
                    hashCode = hashCode * 59 + this.Height.GetHashCode();
                if (this.CameraMake != null)
                    hashCode = hashCode * 59 + this.CameraMake.GetHashCode();
                if (this.CameraModel != null)
                    hashCode = hashCode * 59 + this.CameraModel.GetHashCode();
                if (this.Software != null)
                    hashCode = hashCode * 59 + this.Software.GetHashCode();
                if (this.ExposureTime != null)
                    hashCode = hashCode * 59 + this.ExposureTime.GetHashCode();
                if (this.FocalLength != null)
                    hashCode = hashCode * 59 + this.FocalLength.GetHashCode();
                if (this.ImageOrientation != null)
                    hashCode = hashCode * 59 + this.ImageOrientation.GetHashCode();
                if (this.Aperture != null)
                    hashCode = hashCode * 59 + this.Aperture.GetHashCode();
                if (this.ShutterSpeed != null)
                    hashCode = hashCode * 59 + this.ShutterSpeed.GetHashCode();
                if (this.Latitude != null)
                    hashCode = hashCode * 59 + this.Latitude.GetHashCode();
                if (this.Longitude != null)
                    hashCode = hashCode * 59 + this.Longitude.GetHashCode();
                if (this.Altitude != null)
                    hashCode = hashCode * 59 + this.Altitude.GetHashCode();
                if (this.IsoSpeedRating != null)
                    hashCode = hashCode * 59 + this.IsoSpeedRating.GetHashCode();
                if (this.SeriesTimerId != null)
                    hashCode = hashCode * 59 + this.SeriesTimerId.GetHashCode();
                if (this.ChannelPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.ChannelPrimaryImageTag.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.CompletionPercentage != null)
                    hashCode = hashCode * 59 + this.CompletionPercentage.GetHashCode();
                if (this.IsRepeat != null)
                    hashCode = hashCode * 59 + this.IsRepeat.GetHashCode();
                if (this.IsNew != null)
                    hashCode = hashCode * 59 + this.IsNew.GetHashCode();
                if (this.EpisodeTitle != null)
                    hashCode = hashCode * 59 + this.EpisodeTitle.GetHashCode();
                if (this.IsMovie != null)
                    hashCode = hashCode * 59 + this.IsMovie.GetHashCode();
                if (this.IsSports != null)
                    hashCode = hashCode * 59 + this.IsSports.GetHashCode();
                if (this.IsSeries != null)
                    hashCode = hashCode * 59 + this.IsSeries.GetHashCode();
                if (this.IsLive != null)
                    hashCode = hashCode * 59 + this.IsLive.GetHashCode();
                if (this.IsNews != null)
                    hashCode = hashCode * 59 + this.IsNews.GetHashCode();
                if (this.IsKids != null)
                    hashCode = hashCode * 59 + this.IsKids.GetHashCode();
                if (this.IsPremiere != null)
                    hashCode = hashCode * 59 + this.IsPremiere.GetHashCode();
                if (this.TimerType != null)
                    hashCode = hashCode * 59 + this.TimerType.GetHashCode();
                if (this.Disabled != null)
                    hashCode = hashCode * 59 + this.Disabled.GetHashCode();
                if (this.ManagementId != null)
                    hashCode = hashCode * 59 + this.ManagementId.GetHashCode();
                if (this.TimerId != null)
                    hashCode = hashCode * 59 + this.TimerId.GetHashCode();
                if (this.CurrentProgram != null)
                    hashCode = hashCode * 59 + this.CurrentProgram.GetHashCode();
                if (this.MovieCount != null)
                    hashCode = hashCode * 59 + this.MovieCount.GetHashCode();
                if (this.SeriesCount != null)
                    hashCode = hashCode * 59 + this.SeriesCount.GetHashCode();
                if (this.AlbumCount != null)
                    hashCode = hashCode * 59 + this.AlbumCount.GetHashCode();
                if (this.SongCount != null)
                    hashCode = hashCode * 59 + this.SongCount.GetHashCode();
                if (this.MusicVideoCount != null)
                    hashCode = hashCode * 59 + this.MusicVideoCount.GetHashCode();
                if (this.Subviews != null)
                    hashCode = hashCode * 59 + this.Subviews.GetHashCode();
                if (this.ListingsProviderId != null)
                    hashCode = hashCode * 59 + this.ListingsProviderId.GetHashCode();
                if (this.ListingsChannelId != null)
                    hashCode = hashCode * 59 + this.ListingsChannelId.GetHashCode();
                if (this.ListingsPath != null)
                    hashCode = hashCode * 59 + this.ListingsPath.GetHashCode();
                if (this.ListingsId != null)
                    hashCode = hashCode * 59 + this.ListingsId.GetHashCode();
                if (this.ListingsChannelName != null)
                    hashCode = hashCode * 59 + this.ListingsChannelName.GetHashCode();
                if (this.ListingsChannelNumber != null)
                    hashCode = hashCode * 59 + this.ListingsChannelNumber.GetHashCode();
                if (this.AffiliateCallSign != null)
                    hashCode = hashCode * 59 + this.AffiliateCallSign.GetHashCode();
                return hashCode;
            }
        }

    }
}
