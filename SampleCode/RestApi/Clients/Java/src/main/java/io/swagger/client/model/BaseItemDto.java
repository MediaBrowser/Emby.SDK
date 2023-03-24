/*
 * Emby Server REST API (BETA)
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.BaseItemPerson;
import io.swagger.client.model.ChapterInfo;
import io.swagger.client.model.DayOfWeek;
import io.swagger.client.model.DrawingImageOrientation;
import io.swagger.client.model.ExternalUrl;
import io.swagger.client.model.LiveTvTimerType;
import io.swagger.client.model.LocationType;
import io.swagger.client.model.MediaSourceInfo;
import io.swagger.client.model.MediaStream;
import io.swagger.client.model.MediaUrl;
import io.swagger.client.model.MetadataFields;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.NameLongIdPair;
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.client.model.UserItemDataDto;
import io.swagger.client.model.Video3DFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * BaseItemDto
 */


public class BaseItemDto {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("OriginalTitle")
  private String originalTitle = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("Etag")
  private String etag = null;

  @SerializedName("Prefix")
  private String prefix = null;

  @SerializedName("PlaylistItemId")
  private String playlistItemId = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("ExtraType")
  private String extraType = null;

  @SerializedName("SortIndexNumber")
  private Integer sortIndexNumber = null;

  @SerializedName("SortParentIndexNumber")
  private Integer sortParentIndexNumber = null;

  @SerializedName("CanDelete")
  private Boolean canDelete = null;

  @SerializedName("CanDownload")
  private Boolean canDownload = null;

  @SerializedName("SupportsResume")
  private Boolean supportsResume = null;

  @SerializedName("PresentationUniqueKey")
  private String presentationUniqueKey = null;

  @SerializedName("PreferredMetadataLanguage")
  private String preferredMetadataLanguage = null;

  @SerializedName("PreferredMetadataCountryCode")
  private String preferredMetadataCountryCode = null;

  @SerializedName("SupportsSync")
  private Boolean supportsSync = null;

  @SerializedName("CanManageAccess")
  private Boolean canManageAccess = null;

  @SerializedName("CanMakePrivate")
  private Boolean canMakePrivate = null;

  @SerializedName("CanMakePublic")
  private Boolean canMakePublic = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("SortName")
  private String sortName = null;

  @SerializedName("ForcedSortName")
  private String forcedSortName = null;

  @SerializedName("Video3DFormat")
  private Video3DFormat video3DFormat = null;

  @SerializedName("PremiereDate")
  private OffsetDateTime premiereDate = null;

  @SerializedName("ExternalUrls")
  private List<ExternalUrl> externalUrls = null;

  @SerializedName("MediaSources")
  private List<MediaSourceInfo> mediaSources = null;

  @SerializedName("CriticRating")
  private Float criticRating = null;

  @SerializedName("GameSystemId")
  private Long gameSystemId = null;

  @SerializedName("AsSeries")
  private Boolean asSeries = null;

  @SerializedName("GameSystem")
  private String gameSystem = null;

  @SerializedName("ProductionLocations")
  private List<String> productionLocations = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("OfficialRating")
  private String officialRating = null;

  @SerializedName("CustomRating")
  private String customRating = null;

  @SerializedName("ChannelId")
  private String channelId = null;

  @SerializedName("ChannelName")
  private String channelName = null;

  @SerializedName("Overview")
  private String overview = null;

  @SerializedName("Taglines")
  private List<String> taglines = null;

  @SerializedName("Genres")
  private List<String> genres = null;

  @SerializedName("CommunityRating")
  private Float communityRating = null;

  @SerializedName("RunTimeTicks")
  private Long runTimeTicks = null;

  @SerializedName("Size")
  private Long size = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("Bitrate")
  private Integer bitrate = null;

  @SerializedName("ProductionYear")
  private Integer productionYear = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("ChannelNumber")
  private String channelNumber = null;

  @SerializedName("IndexNumber")
  private Integer indexNumber = null;

  @SerializedName("IndexNumberEnd")
  private Integer indexNumberEnd = null;

  @SerializedName("ParentIndexNumber")
  private Integer parentIndexNumber = null;

  @SerializedName("RemoteTrailers")
  private List<MediaUrl> remoteTrailers = null;

  @SerializedName("ProviderIds")
  private ProviderIdDictionary providerIds = null;

  @SerializedName("IsFolder")
  private Boolean isFolder = null;

  @SerializedName("ParentId")
  private String parentId = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("People")
  private List<BaseItemPerson> people = null;

  @SerializedName("Studios")
  private List<NameLongIdPair> studios = null;

  @SerializedName("GenreItems")
  private List<NameLongIdPair> genreItems = null;

  @SerializedName("TagItems")
  private List<NameLongIdPair> tagItems = null;

  @SerializedName("ParentLogoItemId")
  private String parentLogoItemId = null;

  @SerializedName("ParentBackdropItemId")
  private String parentBackdropItemId = null;

  @SerializedName("ParentBackdropImageTags")
  private List<String> parentBackdropImageTags = null;

  @SerializedName("LocalTrailerCount")
  private Integer localTrailerCount = null;

  @SerializedName("UserData")
  private UserItemDataDto userData = null;

  @SerializedName("RecursiveItemCount")
  private Integer recursiveItemCount = null;

  @SerializedName("ChildCount")
  private Integer childCount = null;

  @SerializedName("SeriesName")
  private String seriesName = null;

  @SerializedName("SeriesId")
  private String seriesId = null;

  @SerializedName("SeasonId")
  private String seasonId = null;

  @SerializedName("SpecialFeatureCount")
  private Integer specialFeatureCount = null;

  @SerializedName("DisplayPreferencesId")
  private String displayPreferencesId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("AirDays")
  private List<DayOfWeek> airDays = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  @SerializedName("PrimaryImageAspectRatio")
  private Double primaryImageAspectRatio = null;

  @SerializedName("Artists")
  private List<String> artists = null;

  @SerializedName("ArtistItems")
  private List<NameIdPair> artistItems = null;

  @SerializedName("Composers")
  private List<NameIdPair> composers = null;

  @SerializedName("Album")
  private String album = null;

  @SerializedName("CollectionType")
  private String collectionType = null;

  @SerializedName("DisplayOrder")
  private String displayOrder = null;

  @SerializedName("AlbumId")
  private String albumId = null;

  @SerializedName("AlbumPrimaryImageTag")
  private String albumPrimaryImageTag = null;

  @SerializedName("SeriesPrimaryImageTag")
  private String seriesPrimaryImageTag = null;

  @SerializedName("AlbumArtist")
  private String albumArtist = null;

  @SerializedName("AlbumArtists")
  private List<NameIdPair> albumArtists = null;

  @SerializedName("SeasonName")
  private String seasonName = null;

  @SerializedName("MediaStreams")
  private List<MediaStream> mediaStreams = null;

  @SerializedName("PartCount")
  private Integer partCount = null;

  @SerializedName("ImageTags")
  private Map<String, String> imageTags = null;

  @SerializedName("BackdropImageTags")
  private List<String> backdropImageTags = null;

  @SerializedName("ParentLogoImageTag")
  private String parentLogoImageTag = null;

  @SerializedName("SeriesStudio")
  private String seriesStudio = null;

  @SerializedName("ParentThumbItemId")
  private String parentThumbItemId = null;

  @SerializedName("ParentThumbImageTag")
  private String parentThumbImageTag = null;

  @SerializedName("Chapters")
  private List<ChapterInfo> chapters = null;

  @SerializedName("LocationType")
  private LocationType locationType = null;

  @SerializedName("MediaType")
  private String mediaType = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("LockedFields")
  private List<MetadataFields> lockedFields = null;

  @SerializedName("LockData")
  private Boolean lockData = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("CameraMake")
  private String cameraMake = null;

  @SerializedName("CameraModel")
  private String cameraModel = null;

  @SerializedName("Software")
  private String software = null;

  @SerializedName("ExposureTime")
  private Double exposureTime = null;

  @SerializedName("FocalLength")
  private Double focalLength = null;

  @SerializedName("ImageOrientation")
  private DrawingImageOrientation imageOrientation = null;

  @SerializedName("Aperture")
  private Double aperture = null;

  @SerializedName("ShutterSpeed")
  private Double shutterSpeed = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  @SerializedName("Altitude")
  private Double altitude = null;

  @SerializedName("IsoSpeedRating")
  private Integer isoSpeedRating = null;

  @SerializedName("SeriesTimerId")
  private String seriesTimerId = null;

  @SerializedName("ChannelPrimaryImageTag")
  private String channelPrimaryImageTag = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("CompletionPercentage")
  private Double completionPercentage = null;

  @SerializedName("IsRepeat")
  private Boolean isRepeat = null;

  @SerializedName("IsNew")
  private Boolean isNew = null;

  @SerializedName("EpisodeTitle")
  private String episodeTitle = null;

  @SerializedName("IsMovie")
  private Boolean isMovie = null;

  @SerializedName("IsSports")
  private Boolean isSports = null;

  @SerializedName("IsSeries")
  private Boolean isSeries = null;

  @SerializedName("IsLive")
  private Boolean isLive = null;

  @SerializedName("IsNews")
  private Boolean isNews = null;

  @SerializedName("IsKids")
  private Boolean isKids = null;

  @SerializedName("IsPremiere")
  private Boolean isPremiere = null;

  @SerializedName("TimerType")
  private LiveTvTimerType timerType = null;

  @SerializedName("Disabled")
  private Boolean disabled = null;

  @SerializedName("ManagementId")
  private String managementId = null;

  @SerializedName("TimerId")
  private String timerId = null;

  @SerializedName("CurrentProgram")
  private BaseItemDto currentProgram = null;

  @SerializedName("MovieCount")
  private Integer movieCount = null;

  @SerializedName("SeriesCount")
  private Integer seriesCount = null;

  @SerializedName("AlbumCount")
  private Integer albumCount = null;

  @SerializedName("SongCount")
  private Integer songCount = null;

  @SerializedName("MusicVideoCount")
  private Integer musicVideoCount = null;

  @SerializedName("Subviews")
  private List<String> subviews = null;

  @SerializedName("ListingsProviderId")
  private String listingsProviderId = null;

  @SerializedName("ListingsChannelId")
  private String listingsChannelId = null;

  @SerializedName("ListingsPath")
  private String listingsPath = null;

  @SerializedName("ListingsId")
  private String listingsId = null;

  @SerializedName("ListingsChannelName")
  private String listingsChannelName = null;

  @SerializedName("ListingsChannelNumber")
  private String listingsChannelNumber = null;

  @SerializedName("AffiliateCallSign")
  private String affiliateCallSign = null;

  public BaseItemDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BaseItemDto originalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
    return this;
  }

   /**
   * Get originalTitle
   * @return originalTitle
  **/
  @Schema(description = "")
  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public BaseItemDto serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public BaseItemDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BaseItemDto guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @Schema(description = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public BaseItemDto etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @Schema(description = "")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public BaseItemDto prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public BaseItemDto playlistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

   /**
   * Get playlistItemId
   * @return playlistItemId
  **/
  @Schema(description = "")
  public String getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public BaseItemDto dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BaseItemDto extraType(String extraType) {
    this.extraType = extraType;
    return this;
  }

   /**
   * Get extraType
   * @return extraType
  **/
  @Schema(description = "")
  public String getExtraType() {
    return extraType;
  }

  public void setExtraType(String extraType) {
    this.extraType = extraType;
  }

  public BaseItemDto sortIndexNumber(Integer sortIndexNumber) {
    this.sortIndexNumber = sortIndexNumber;
    return this;
  }

   /**
   * Get sortIndexNumber
   * @return sortIndexNumber
  **/
  @Schema(description = "")
  public Integer getSortIndexNumber() {
    return sortIndexNumber;
  }

  public void setSortIndexNumber(Integer sortIndexNumber) {
    this.sortIndexNumber = sortIndexNumber;
  }

  public BaseItemDto sortParentIndexNumber(Integer sortParentIndexNumber) {
    this.sortParentIndexNumber = sortParentIndexNumber;
    return this;
  }

   /**
   * Get sortParentIndexNumber
   * @return sortParentIndexNumber
  **/
  @Schema(description = "")
  public Integer getSortParentIndexNumber() {
    return sortParentIndexNumber;
  }

  public void setSortParentIndexNumber(Integer sortParentIndexNumber) {
    this.sortParentIndexNumber = sortParentIndexNumber;
  }

  public BaseItemDto canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @Schema(description = "")
  public Boolean isCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public BaseItemDto canDownload(Boolean canDownload) {
    this.canDownload = canDownload;
    return this;
  }

   /**
   * Get canDownload
   * @return canDownload
  **/
  @Schema(description = "")
  public Boolean isCanDownload() {
    return canDownload;
  }

  public void setCanDownload(Boolean canDownload) {
    this.canDownload = canDownload;
  }

  public BaseItemDto supportsResume(Boolean supportsResume) {
    this.supportsResume = supportsResume;
    return this;
  }

   /**
   * Get supportsResume
   * @return supportsResume
  **/
  @Schema(description = "")
  public Boolean isSupportsResume() {
    return supportsResume;
  }

  public void setSupportsResume(Boolean supportsResume) {
    this.supportsResume = supportsResume;
  }

  public BaseItemDto presentationUniqueKey(String presentationUniqueKey) {
    this.presentationUniqueKey = presentationUniqueKey;
    return this;
  }

   /**
   * Get presentationUniqueKey
   * @return presentationUniqueKey
  **/
  @Schema(description = "")
  public String getPresentationUniqueKey() {
    return presentationUniqueKey;
  }

  public void setPresentationUniqueKey(String presentationUniqueKey) {
    this.presentationUniqueKey = presentationUniqueKey;
  }

  public BaseItemDto preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
    return this;
  }

   /**
   * Get preferredMetadataLanguage
   * @return preferredMetadataLanguage
  **/
  @Schema(description = "")
  public String getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public BaseItemDto preferredMetadataCountryCode(String preferredMetadataCountryCode) {
    this.preferredMetadataCountryCode = preferredMetadataCountryCode;
    return this;
  }

   /**
   * Get preferredMetadataCountryCode
   * @return preferredMetadataCountryCode
  **/
  @Schema(description = "")
  public String getPreferredMetadataCountryCode() {
    return preferredMetadataCountryCode;
  }

  public void setPreferredMetadataCountryCode(String preferredMetadataCountryCode) {
    this.preferredMetadataCountryCode = preferredMetadataCountryCode;
  }

  public BaseItemDto supportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
    return this;
  }

   /**
   * Get supportsSync
   * @return supportsSync
  **/
  @Schema(description = "")
  public Boolean isSupportsSync() {
    return supportsSync;
  }

  public void setSupportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
  }

  public BaseItemDto canManageAccess(Boolean canManageAccess) {
    this.canManageAccess = canManageAccess;
    return this;
  }

   /**
   * Get canManageAccess
   * @return canManageAccess
  **/
  @Schema(description = "")
  public Boolean isCanManageAccess() {
    return canManageAccess;
  }

  public void setCanManageAccess(Boolean canManageAccess) {
    this.canManageAccess = canManageAccess;
  }

  public BaseItemDto canMakePrivate(Boolean canMakePrivate) {
    this.canMakePrivate = canMakePrivate;
    return this;
  }

   /**
   * Get canMakePrivate
   * @return canMakePrivate
  **/
  @Schema(description = "")
  public Boolean isCanMakePrivate() {
    return canMakePrivate;
  }

  public void setCanMakePrivate(Boolean canMakePrivate) {
    this.canMakePrivate = canMakePrivate;
  }

  public BaseItemDto canMakePublic(Boolean canMakePublic) {
    this.canMakePublic = canMakePublic;
    return this;
  }

   /**
   * Get canMakePublic
   * @return canMakePublic
  **/
  @Schema(description = "")
  public Boolean isCanMakePublic() {
    return canMakePublic;
  }

  public void setCanMakePublic(Boolean canMakePublic) {
    this.canMakePublic = canMakePublic;
  }

  public BaseItemDto container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public BaseItemDto sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

   /**
   * Get sortName
   * @return sortName
  **/
  @Schema(description = "")
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public BaseItemDto forcedSortName(String forcedSortName) {
    this.forcedSortName = forcedSortName;
    return this;
  }

   /**
   * Get forcedSortName
   * @return forcedSortName
  **/
  @Schema(description = "")
  public String getForcedSortName() {
    return forcedSortName;
  }

  public void setForcedSortName(String forcedSortName) {
    this.forcedSortName = forcedSortName;
  }

  public BaseItemDto video3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
    return this;
  }

   /**
   * Get video3DFormat
   * @return video3DFormat
  **/
  @Schema(description = "")
  public Video3DFormat getVideo3DFormat() {
    return video3DFormat;
  }

  public void setVideo3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
  }

  public BaseItemDto premiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = premiereDate;
    return this;
  }

   /**
   * Get premiereDate
   * @return premiereDate
  **/
  @Schema(description = "")
  public OffsetDateTime getPremiereDate() {
    return premiereDate;
  }

  public void setPremiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = premiereDate;
  }

  public BaseItemDto externalUrls(List<ExternalUrl> externalUrls) {
    this.externalUrls = externalUrls;
    return this;
  }

  public BaseItemDto addExternalUrlsItem(ExternalUrl externalUrlsItem) {
    if (this.externalUrls == null) {
      this.externalUrls = new ArrayList<ExternalUrl>();
    }
    this.externalUrls.add(externalUrlsItem);
    return this;
  }

   /**
   * Get externalUrls
   * @return externalUrls
  **/
  @Schema(description = "")
  public List<ExternalUrl> getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(List<ExternalUrl> externalUrls) {
    this.externalUrls = externalUrls;
  }

  public BaseItemDto mediaSources(List<MediaSourceInfo> mediaSources) {
    this.mediaSources = mediaSources;
    return this;
  }

  public BaseItemDto addMediaSourcesItem(MediaSourceInfo mediaSourcesItem) {
    if (this.mediaSources == null) {
      this.mediaSources = new ArrayList<MediaSourceInfo>();
    }
    this.mediaSources.add(mediaSourcesItem);
    return this;
  }

   /**
   * Get mediaSources
   * @return mediaSources
  **/
  @Schema(description = "")
  public List<MediaSourceInfo> getMediaSources() {
    return mediaSources;
  }

  public void setMediaSources(List<MediaSourceInfo> mediaSources) {
    this.mediaSources = mediaSources;
  }

  public BaseItemDto criticRating(Float criticRating) {
    this.criticRating = criticRating;
    return this;
  }

   /**
   * Get criticRating
   * @return criticRating
  **/
  @Schema(description = "")
  public Float getCriticRating() {
    return criticRating;
  }

  public void setCriticRating(Float criticRating) {
    this.criticRating = criticRating;
  }

  public BaseItemDto gameSystemId(Long gameSystemId) {
    this.gameSystemId = gameSystemId;
    return this;
  }

   /**
   * Get gameSystemId
   * @return gameSystemId
  **/
  @Schema(description = "")
  public Long getGameSystemId() {
    return gameSystemId;
  }

  public void setGameSystemId(Long gameSystemId) {
    this.gameSystemId = gameSystemId;
  }

  public BaseItemDto asSeries(Boolean asSeries) {
    this.asSeries = asSeries;
    return this;
  }

   /**
   * Get asSeries
   * @return asSeries
  **/
  @Schema(description = "")
  public Boolean isAsSeries() {
    return asSeries;
  }

  public void setAsSeries(Boolean asSeries) {
    this.asSeries = asSeries;
  }

  public BaseItemDto gameSystem(String gameSystem) {
    this.gameSystem = gameSystem;
    return this;
  }

   /**
   * Get gameSystem
   * @return gameSystem
  **/
  @Schema(description = "")
  public String getGameSystem() {
    return gameSystem;
  }

  public void setGameSystem(String gameSystem) {
    this.gameSystem = gameSystem;
  }

  public BaseItemDto productionLocations(List<String> productionLocations) {
    this.productionLocations = productionLocations;
    return this;
  }

  public BaseItemDto addProductionLocationsItem(String productionLocationsItem) {
    if (this.productionLocations == null) {
      this.productionLocations = new ArrayList<String>();
    }
    this.productionLocations.add(productionLocationsItem);
    return this;
  }

   /**
   * Get productionLocations
   * @return productionLocations
  **/
  @Schema(description = "")
  public List<String> getProductionLocations() {
    return productionLocations;
  }

  public void setProductionLocations(List<String> productionLocations) {
    this.productionLocations = productionLocations;
  }

  public BaseItemDto path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public BaseItemDto officialRating(String officialRating) {
    this.officialRating = officialRating;
    return this;
  }

   /**
   * Get officialRating
   * @return officialRating
  **/
  @Schema(description = "")
  public String getOfficialRating() {
    return officialRating;
  }

  public void setOfficialRating(String officialRating) {
    this.officialRating = officialRating;
  }

  public BaseItemDto customRating(String customRating) {
    this.customRating = customRating;
    return this;
  }

   /**
   * Get customRating
   * @return customRating
  **/
  @Schema(description = "")
  public String getCustomRating() {
    return customRating;
  }

  public void setCustomRating(String customRating) {
    this.customRating = customRating;
  }

  public BaseItemDto channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @Schema(description = "")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public BaseItemDto channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @Schema(description = "")
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public BaseItemDto overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public BaseItemDto taglines(List<String> taglines) {
    this.taglines = taglines;
    return this;
  }

  public BaseItemDto addTaglinesItem(String taglinesItem) {
    if (this.taglines == null) {
      this.taglines = new ArrayList<String>();
    }
    this.taglines.add(taglinesItem);
    return this;
  }

   /**
   * Get taglines
   * @return taglines
  **/
  @Schema(description = "")
  public List<String> getTaglines() {
    return taglines;
  }

  public void setTaglines(List<String> taglines) {
    this.taglines = taglines;
  }

  public BaseItemDto genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public BaseItemDto addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<String>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * Get genres
   * @return genres
  **/
  @Schema(description = "")
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public BaseItemDto communityRating(Float communityRating) {
    this.communityRating = communityRating;
    return this;
  }

   /**
   * Get communityRating
   * @return communityRating
  **/
  @Schema(description = "")
  public Float getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(Float communityRating) {
    this.communityRating = communityRating;
  }

  public BaseItemDto runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
    return this;
  }

   /**
   * Get runTimeTicks
   * @return runTimeTicks
  **/
  @Schema(description = "")
  public Long getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public BaseItemDto size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public BaseItemDto fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public BaseItemDto bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * Get bitrate
   * @return bitrate
  **/
  @Schema(description = "")
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public BaseItemDto productionYear(Integer productionYear) {
    this.productionYear = productionYear;
    return this;
  }

   /**
   * Get productionYear
   * @return productionYear
  **/
  @Schema(description = "")
  public Integer getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(Integer productionYear) {
    this.productionYear = productionYear;
  }

  public BaseItemDto number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BaseItemDto channelNumber(String channelNumber) {
    this.channelNumber = channelNumber;
    return this;
  }

   /**
   * Get channelNumber
   * @return channelNumber
  **/
  @Schema(description = "")
  public String getChannelNumber() {
    return channelNumber;
  }

  public void setChannelNumber(String channelNumber) {
    this.channelNumber = channelNumber;
  }

  public BaseItemDto indexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

   /**
   * Get indexNumber
   * @return indexNumber
  **/
  @Schema(description = "")
  public Integer getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
  }

  public BaseItemDto indexNumberEnd(Integer indexNumberEnd) {
    this.indexNumberEnd = indexNumberEnd;
    return this;
  }

   /**
   * Get indexNumberEnd
   * @return indexNumberEnd
  **/
  @Schema(description = "")
  public Integer getIndexNumberEnd() {
    return indexNumberEnd;
  }

  public void setIndexNumberEnd(Integer indexNumberEnd) {
    this.indexNumberEnd = indexNumberEnd;
  }

  public BaseItemDto parentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
    return this;
  }

   /**
   * Get parentIndexNumber
   * @return parentIndexNumber
  **/
  @Schema(description = "")
  public Integer getParentIndexNumber() {
    return parentIndexNumber;
  }

  public void setParentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
  }

  public BaseItemDto remoteTrailers(List<MediaUrl> remoteTrailers) {
    this.remoteTrailers = remoteTrailers;
    return this;
  }

  public BaseItemDto addRemoteTrailersItem(MediaUrl remoteTrailersItem) {
    if (this.remoteTrailers == null) {
      this.remoteTrailers = new ArrayList<MediaUrl>();
    }
    this.remoteTrailers.add(remoteTrailersItem);
    return this;
  }

   /**
   * Get remoteTrailers
   * @return remoteTrailers
  **/
  @Schema(description = "")
  public List<MediaUrl> getRemoteTrailers() {
    return remoteTrailers;
  }

  public void setRemoteTrailers(List<MediaUrl> remoteTrailers) {
    this.remoteTrailers = remoteTrailers;
  }

  public BaseItemDto providerIds(ProviderIdDictionary providerIds) {
    this.providerIds = providerIds;
    return this;
  }

   /**
   * Get providerIds
   * @return providerIds
  **/
  @Schema(description = "")
  public ProviderIdDictionary getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(ProviderIdDictionary providerIds) {
    this.providerIds = providerIds;
  }

  public BaseItemDto isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

   /**
   * Get isFolder
   * @return isFolder
  **/
  @Schema(description = "")
  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public BaseItemDto parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public BaseItemDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BaseItemDto people(List<BaseItemPerson> people) {
    this.people = people;
    return this;
  }

  public BaseItemDto addPeopleItem(BaseItemPerson peopleItem) {
    if (this.people == null) {
      this.people = new ArrayList<BaseItemPerson>();
    }
    this.people.add(peopleItem);
    return this;
  }

   /**
   * Get people
   * @return people
  **/
  @Schema(description = "")
  public List<BaseItemPerson> getPeople() {
    return people;
  }

  public void setPeople(List<BaseItemPerson> people) {
    this.people = people;
  }

  public BaseItemDto studios(List<NameLongIdPair> studios) {
    this.studios = studios;
    return this;
  }

  public BaseItemDto addStudiosItem(NameLongIdPair studiosItem) {
    if (this.studios == null) {
      this.studios = new ArrayList<NameLongIdPair>();
    }
    this.studios.add(studiosItem);
    return this;
  }

   /**
   * Get studios
   * @return studios
  **/
  @Schema(description = "")
  public List<NameLongIdPair> getStudios() {
    return studios;
  }

  public void setStudios(List<NameLongIdPair> studios) {
    this.studios = studios;
  }

  public BaseItemDto genreItems(List<NameLongIdPair> genreItems) {
    this.genreItems = genreItems;
    return this;
  }

  public BaseItemDto addGenreItemsItem(NameLongIdPair genreItemsItem) {
    if (this.genreItems == null) {
      this.genreItems = new ArrayList<NameLongIdPair>();
    }
    this.genreItems.add(genreItemsItem);
    return this;
  }

   /**
   * Get genreItems
   * @return genreItems
  **/
  @Schema(description = "")
  public List<NameLongIdPair> getGenreItems() {
    return genreItems;
  }

  public void setGenreItems(List<NameLongIdPair> genreItems) {
    this.genreItems = genreItems;
  }

  public BaseItemDto tagItems(List<NameLongIdPair> tagItems) {
    this.tagItems = tagItems;
    return this;
  }

  public BaseItemDto addTagItemsItem(NameLongIdPair tagItemsItem) {
    if (this.tagItems == null) {
      this.tagItems = new ArrayList<NameLongIdPair>();
    }
    this.tagItems.add(tagItemsItem);
    return this;
  }

   /**
   * Get tagItems
   * @return tagItems
  **/
  @Schema(description = "")
  public List<NameLongIdPair> getTagItems() {
    return tagItems;
  }

  public void setTagItems(List<NameLongIdPair> tagItems) {
    this.tagItems = tagItems;
  }

  public BaseItemDto parentLogoItemId(String parentLogoItemId) {
    this.parentLogoItemId = parentLogoItemId;
    return this;
  }

   /**
   * Get parentLogoItemId
   * @return parentLogoItemId
  **/
  @Schema(description = "")
  public String getParentLogoItemId() {
    return parentLogoItemId;
  }

  public void setParentLogoItemId(String parentLogoItemId) {
    this.parentLogoItemId = parentLogoItemId;
  }

  public BaseItemDto parentBackdropItemId(String parentBackdropItemId) {
    this.parentBackdropItemId = parentBackdropItemId;
    return this;
  }

   /**
   * Get parentBackdropItemId
   * @return parentBackdropItemId
  **/
  @Schema(description = "")
  public String getParentBackdropItemId() {
    return parentBackdropItemId;
  }

  public void setParentBackdropItemId(String parentBackdropItemId) {
    this.parentBackdropItemId = parentBackdropItemId;
  }

  public BaseItemDto parentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
    return this;
  }

  public BaseItemDto addParentBackdropImageTagsItem(String parentBackdropImageTagsItem) {
    if (this.parentBackdropImageTags == null) {
      this.parentBackdropImageTags = new ArrayList<String>();
    }
    this.parentBackdropImageTags.add(parentBackdropImageTagsItem);
    return this;
  }

   /**
   * Get parentBackdropImageTags
   * @return parentBackdropImageTags
  **/
  @Schema(description = "")
  public List<String> getParentBackdropImageTags() {
    return parentBackdropImageTags;
  }

  public void setParentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
  }

  public BaseItemDto localTrailerCount(Integer localTrailerCount) {
    this.localTrailerCount = localTrailerCount;
    return this;
  }

   /**
   * Get localTrailerCount
   * @return localTrailerCount
  **/
  @Schema(description = "")
  public Integer getLocalTrailerCount() {
    return localTrailerCount;
  }

  public void setLocalTrailerCount(Integer localTrailerCount) {
    this.localTrailerCount = localTrailerCount;
  }

  public BaseItemDto userData(UserItemDataDto userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @Schema(description = "")
  public UserItemDataDto getUserData() {
    return userData;
  }

  public void setUserData(UserItemDataDto userData) {
    this.userData = userData;
  }

  public BaseItemDto recursiveItemCount(Integer recursiveItemCount) {
    this.recursiveItemCount = recursiveItemCount;
    return this;
  }

   /**
   * Get recursiveItemCount
   * @return recursiveItemCount
  **/
  @Schema(description = "")
  public Integer getRecursiveItemCount() {
    return recursiveItemCount;
  }

  public void setRecursiveItemCount(Integer recursiveItemCount) {
    this.recursiveItemCount = recursiveItemCount;
  }

  public BaseItemDto childCount(Integer childCount) {
    this.childCount = childCount;
    return this;
  }

   /**
   * Get childCount
   * @return childCount
  **/
  @Schema(description = "")
  public Integer getChildCount() {
    return childCount;
  }

  public void setChildCount(Integer childCount) {
    this.childCount = childCount;
  }

  public BaseItemDto seriesName(String seriesName) {
    this.seriesName = seriesName;
    return this;
  }

   /**
   * Get seriesName
   * @return seriesName
  **/
  @Schema(description = "")
  public String getSeriesName() {
    return seriesName;
  }

  public void setSeriesName(String seriesName) {
    this.seriesName = seriesName;
  }

  public BaseItemDto seriesId(String seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @Schema(description = "")
  public String getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(String seriesId) {
    this.seriesId = seriesId;
  }

  public BaseItemDto seasonId(String seasonId) {
    this.seasonId = seasonId;
    return this;
  }

   /**
   * Get seasonId
   * @return seasonId
  **/
  @Schema(description = "")
  public String getSeasonId() {
    return seasonId;
  }

  public void setSeasonId(String seasonId) {
    this.seasonId = seasonId;
  }

  public BaseItemDto specialFeatureCount(Integer specialFeatureCount) {
    this.specialFeatureCount = specialFeatureCount;
    return this;
  }

   /**
   * Get specialFeatureCount
   * @return specialFeatureCount
  **/
  @Schema(description = "")
  public Integer getSpecialFeatureCount() {
    return specialFeatureCount;
  }

  public void setSpecialFeatureCount(Integer specialFeatureCount) {
    this.specialFeatureCount = specialFeatureCount;
  }

  public BaseItemDto displayPreferencesId(String displayPreferencesId) {
    this.displayPreferencesId = displayPreferencesId;
    return this;
  }

   /**
   * Get displayPreferencesId
   * @return displayPreferencesId
  **/
  @Schema(description = "")
  public String getDisplayPreferencesId() {
    return displayPreferencesId;
  }

  public void setDisplayPreferencesId(String displayPreferencesId) {
    this.displayPreferencesId = displayPreferencesId;
  }

  public BaseItemDto status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BaseItemDto airDays(List<DayOfWeek> airDays) {
    this.airDays = airDays;
    return this;
  }

  public BaseItemDto addAirDaysItem(DayOfWeek airDaysItem) {
    if (this.airDays == null) {
      this.airDays = new ArrayList<DayOfWeek>();
    }
    this.airDays.add(airDaysItem);
    return this;
  }

   /**
   * Get airDays
   * @return airDays
  **/
  @Schema(description = "")
  public List<DayOfWeek> getAirDays() {
    return airDays;
  }

  public void setAirDays(List<DayOfWeek> airDays) {
    this.airDays = airDays;
  }

  public BaseItemDto tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BaseItemDto addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public BaseItemDto primaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
    return this;
  }

   /**
   * Get primaryImageAspectRatio
   * @return primaryImageAspectRatio
  **/
  @Schema(description = "")
  public Double getPrimaryImageAspectRatio() {
    return primaryImageAspectRatio;
  }

  public void setPrimaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
  }

  public BaseItemDto artists(List<String> artists) {
    this.artists = artists;
    return this;
  }

  public BaseItemDto addArtistsItem(String artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<String>();
    }
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * Get artists
   * @return artists
  **/
  @Schema(description = "")
  public List<String> getArtists() {
    return artists;
  }

  public void setArtists(List<String> artists) {
    this.artists = artists;
  }

  public BaseItemDto artistItems(List<NameIdPair> artistItems) {
    this.artistItems = artistItems;
    return this;
  }

  public BaseItemDto addArtistItemsItem(NameIdPair artistItemsItem) {
    if (this.artistItems == null) {
      this.artistItems = new ArrayList<NameIdPair>();
    }
    this.artistItems.add(artistItemsItem);
    return this;
  }

   /**
   * Get artistItems
   * @return artistItems
  **/
  @Schema(description = "")
  public List<NameIdPair> getArtistItems() {
    return artistItems;
  }

  public void setArtistItems(List<NameIdPair> artistItems) {
    this.artistItems = artistItems;
  }

  public BaseItemDto composers(List<NameIdPair> composers) {
    this.composers = composers;
    return this;
  }

  public BaseItemDto addComposersItem(NameIdPair composersItem) {
    if (this.composers == null) {
      this.composers = new ArrayList<NameIdPair>();
    }
    this.composers.add(composersItem);
    return this;
  }

   /**
   * Get composers
   * @return composers
  **/
  @Schema(description = "")
  public List<NameIdPair> getComposers() {
    return composers;
  }

  public void setComposers(List<NameIdPair> composers) {
    this.composers = composers;
  }

  public BaseItemDto album(String album) {
    this.album = album;
    return this;
  }

   /**
   * Get album
   * @return album
  **/
  @Schema(description = "")
  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public BaseItemDto collectionType(String collectionType) {
    this.collectionType = collectionType;
    return this;
  }

   /**
   * Get collectionType
   * @return collectionType
  **/
  @Schema(description = "")
  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public BaseItemDto displayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @Schema(description = "")
  public String getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
  }

  public BaseItemDto albumId(String albumId) {
    this.albumId = albumId;
    return this;
  }

   /**
   * Get albumId
   * @return albumId
  **/
  @Schema(description = "")
  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public BaseItemDto albumPrimaryImageTag(String albumPrimaryImageTag) {
    this.albumPrimaryImageTag = albumPrimaryImageTag;
    return this;
  }

   /**
   * Get albumPrimaryImageTag
   * @return albumPrimaryImageTag
  **/
  @Schema(description = "")
  public String getAlbumPrimaryImageTag() {
    return albumPrimaryImageTag;
  }

  public void setAlbumPrimaryImageTag(String albumPrimaryImageTag) {
    this.albumPrimaryImageTag = albumPrimaryImageTag;
  }

  public BaseItemDto seriesPrimaryImageTag(String seriesPrimaryImageTag) {
    this.seriesPrimaryImageTag = seriesPrimaryImageTag;
    return this;
  }

   /**
   * Get seriesPrimaryImageTag
   * @return seriesPrimaryImageTag
  **/
  @Schema(description = "")
  public String getSeriesPrimaryImageTag() {
    return seriesPrimaryImageTag;
  }

  public void setSeriesPrimaryImageTag(String seriesPrimaryImageTag) {
    this.seriesPrimaryImageTag = seriesPrimaryImageTag;
  }

  public BaseItemDto albumArtist(String albumArtist) {
    this.albumArtist = albumArtist;
    return this;
  }

   /**
   * Get albumArtist
   * @return albumArtist
  **/
  @Schema(description = "")
  public String getAlbumArtist() {
    return albumArtist;
  }

  public void setAlbumArtist(String albumArtist) {
    this.albumArtist = albumArtist;
  }

  public BaseItemDto albumArtists(List<NameIdPair> albumArtists) {
    this.albumArtists = albumArtists;
    return this;
  }

  public BaseItemDto addAlbumArtistsItem(NameIdPair albumArtistsItem) {
    if (this.albumArtists == null) {
      this.albumArtists = new ArrayList<NameIdPair>();
    }
    this.albumArtists.add(albumArtistsItem);
    return this;
  }

   /**
   * Get albumArtists
   * @return albumArtists
  **/
  @Schema(description = "")
  public List<NameIdPair> getAlbumArtists() {
    return albumArtists;
  }

  public void setAlbumArtists(List<NameIdPair> albumArtists) {
    this.albumArtists = albumArtists;
  }

  public BaseItemDto seasonName(String seasonName) {
    this.seasonName = seasonName;
    return this;
  }

   /**
   * Get seasonName
   * @return seasonName
  **/
  @Schema(description = "")
  public String getSeasonName() {
    return seasonName;
  }

  public void setSeasonName(String seasonName) {
    this.seasonName = seasonName;
  }

  public BaseItemDto mediaStreams(List<MediaStream> mediaStreams) {
    this.mediaStreams = mediaStreams;
    return this;
  }

  public BaseItemDto addMediaStreamsItem(MediaStream mediaStreamsItem) {
    if (this.mediaStreams == null) {
      this.mediaStreams = new ArrayList<MediaStream>();
    }
    this.mediaStreams.add(mediaStreamsItem);
    return this;
  }

   /**
   * Get mediaStreams
   * @return mediaStreams
  **/
  @Schema(description = "")
  public List<MediaStream> getMediaStreams() {
    return mediaStreams;
  }

  public void setMediaStreams(List<MediaStream> mediaStreams) {
    this.mediaStreams = mediaStreams;
  }

  public BaseItemDto partCount(Integer partCount) {
    this.partCount = partCount;
    return this;
  }

   /**
   * Get partCount
   * @return partCount
  **/
  @Schema(description = "")
  public Integer getPartCount() {
    return partCount;
  }

  public void setPartCount(Integer partCount) {
    this.partCount = partCount;
  }

  public BaseItemDto imageTags(Map<String, String> imageTags) {
    this.imageTags = imageTags;
    return this;
  }

  public BaseItemDto putImageTagsItem(String key, String imageTagsItem) {
    if (this.imageTags == null) {
      this.imageTags = new HashMap<String, String>();
    }
    this.imageTags.put(key, imageTagsItem);
    return this;
  }

   /**
   * Get imageTags
   * @return imageTags
  **/
  @Schema(description = "")
  public Map<String, String> getImageTags() {
    return imageTags;
  }

  public void setImageTags(Map<String, String> imageTags) {
    this.imageTags = imageTags;
  }

  public BaseItemDto backdropImageTags(List<String> backdropImageTags) {
    this.backdropImageTags = backdropImageTags;
    return this;
  }

  public BaseItemDto addBackdropImageTagsItem(String backdropImageTagsItem) {
    if (this.backdropImageTags == null) {
      this.backdropImageTags = new ArrayList<String>();
    }
    this.backdropImageTags.add(backdropImageTagsItem);
    return this;
  }

   /**
   * Get backdropImageTags
   * @return backdropImageTags
  **/
  @Schema(description = "")
  public List<String> getBackdropImageTags() {
    return backdropImageTags;
  }

  public void setBackdropImageTags(List<String> backdropImageTags) {
    this.backdropImageTags = backdropImageTags;
  }

  public BaseItemDto parentLogoImageTag(String parentLogoImageTag) {
    this.parentLogoImageTag = parentLogoImageTag;
    return this;
  }

   /**
   * Get parentLogoImageTag
   * @return parentLogoImageTag
  **/
  @Schema(description = "")
  public String getParentLogoImageTag() {
    return parentLogoImageTag;
  }

  public void setParentLogoImageTag(String parentLogoImageTag) {
    this.parentLogoImageTag = parentLogoImageTag;
  }

  public BaseItemDto seriesStudio(String seriesStudio) {
    this.seriesStudio = seriesStudio;
    return this;
  }

   /**
   * Get seriesStudio
   * @return seriesStudio
  **/
  @Schema(description = "")
  public String getSeriesStudio() {
    return seriesStudio;
  }

  public void setSeriesStudio(String seriesStudio) {
    this.seriesStudio = seriesStudio;
  }

  public BaseItemDto parentThumbItemId(String parentThumbItemId) {
    this.parentThumbItemId = parentThumbItemId;
    return this;
  }

   /**
   * Get parentThumbItemId
   * @return parentThumbItemId
  **/
  @Schema(description = "")
  public String getParentThumbItemId() {
    return parentThumbItemId;
  }

  public void setParentThumbItemId(String parentThumbItemId) {
    this.parentThumbItemId = parentThumbItemId;
  }

  public BaseItemDto parentThumbImageTag(String parentThumbImageTag) {
    this.parentThumbImageTag = parentThumbImageTag;
    return this;
  }

   /**
   * Get parentThumbImageTag
   * @return parentThumbImageTag
  **/
  @Schema(description = "")
  public String getParentThumbImageTag() {
    return parentThumbImageTag;
  }

  public void setParentThumbImageTag(String parentThumbImageTag) {
    this.parentThumbImageTag = parentThumbImageTag;
  }

  public BaseItemDto chapters(List<ChapterInfo> chapters) {
    this.chapters = chapters;
    return this;
  }

  public BaseItemDto addChaptersItem(ChapterInfo chaptersItem) {
    if (this.chapters == null) {
      this.chapters = new ArrayList<ChapterInfo>();
    }
    this.chapters.add(chaptersItem);
    return this;
  }

   /**
   * Get chapters
   * @return chapters
  **/
  @Schema(description = "")
  public List<ChapterInfo> getChapters() {
    return chapters;
  }

  public void setChapters(List<ChapterInfo> chapters) {
    this.chapters = chapters;
  }

  public BaseItemDto locationType(LocationType locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @Schema(description = "")
  public LocationType getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationType locationType) {
    this.locationType = locationType;
  }

  public BaseItemDto mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @Schema(description = "")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public BaseItemDto endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public BaseItemDto lockedFields(List<MetadataFields> lockedFields) {
    this.lockedFields = lockedFields;
    return this;
  }

  public BaseItemDto addLockedFieldsItem(MetadataFields lockedFieldsItem) {
    if (this.lockedFields == null) {
      this.lockedFields = new ArrayList<MetadataFields>();
    }
    this.lockedFields.add(lockedFieldsItem);
    return this;
  }

   /**
   * Get lockedFields
   * @return lockedFields
  **/
  @Schema(description = "")
  public List<MetadataFields> getLockedFields() {
    return lockedFields;
  }

  public void setLockedFields(List<MetadataFields> lockedFields) {
    this.lockedFields = lockedFields;
  }

  public BaseItemDto lockData(Boolean lockData) {
    this.lockData = lockData;
    return this;
  }

   /**
   * Get lockData
   * @return lockData
  **/
  @Schema(description = "")
  public Boolean isLockData() {
    return lockData;
  }

  public void setLockData(Boolean lockData) {
    this.lockData = lockData;
  }

  public BaseItemDto width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public BaseItemDto height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public BaseItemDto cameraMake(String cameraMake) {
    this.cameraMake = cameraMake;
    return this;
  }

   /**
   * Get cameraMake
   * @return cameraMake
  **/
  @Schema(description = "")
  public String getCameraMake() {
    return cameraMake;
  }

  public void setCameraMake(String cameraMake) {
    this.cameraMake = cameraMake;
  }

  public BaseItemDto cameraModel(String cameraModel) {
    this.cameraModel = cameraModel;
    return this;
  }

   /**
   * Get cameraModel
   * @return cameraModel
  **/
  @Schema(description = "")
  public String getCameraModel() {
    return cameraModel;
  }

  public void setCameraModel(String cameraModel) {
    this.cameraModel = cameraModel;
  }

  public BaseItemDto software(String software) {
    this.software = software;
    return this;
  }

   /**
   * Get software
   * @return software
  **/
  @Schema(description = "")
  public String getSoftware() {
    return software;
  }

  public void setSoftware(String software) {
    this.software = software;
  }

  public BaseItemDto exposureTime(Double exposureTime) {
    this.exposureTime = exposureTime;
    return this;
  }

   /**
   * Get exposureTime
   * @return exposureTime
  **/
  @Schema(description = "")
  public Double getExposureTime() {
    return exposureTime;
  }

  public void setExposureTime(Double exposureTime) {
    this.exposureTime = exposureTime;
  }

  public BaseItemDto focalLength(Double focalLength) {
    this.focalLength = focalLength;
    return this;
  }

   /**
   * Get focalLength
   * @return focalLength
  **/
  @Schema(description = "")
  public Double getFocalLength() {
    return focalLength;
  }

  public void setFocalLength(Double focalLength) {
    this.focalLength = focalLength;
  }

  public BaseItemDto imageOrientation(DrawingImageOrientation imageOrientation) {
    this.imageOrientation = imageOrientation;
    return this;
  }

   /**
   * Get imageOrientation
   * @return imageOrientation
  **/
  @Schema(description = "")
  public DrawingImageOrientation getImageOrientation() {
    return imageOrientation;
  }

  public void setImageOrientation(DrawingImageOrientation imageOrientation) {
    this.imageOrientation = imageOrientation;
  }

  public BaseItemDto aperture(Double aperture) {
    this.aperture = aperture;
    return this;
  }

   /**
   * Get aperture
   * @return aperture
  **/
  @Schema(description = "")
  public Double getAperture() {
    return aperture;
  }

  public void setAperture(Double aperture) {
    this.aperture = aperture;
  }

  public BaseItemDto shutterSpeed(Double shutterSpeed) {
    this.shutterSpeed = shutterSpeed;
    return this;
  }

   /**
   * Get shutterSpeed
   * @return shutterSpeed
  **/
  @Schema(description = "")
  public Double getShutterSpeed() {
    return shutterSpeed;
  }

  public void setShutterSpeed(Double shutterSpeed) {
    this.shutterSpeed = shutterSpeed;
  }

  public BaseItemDto latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(description = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public BaseItemDto longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(description = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public BaseItemDto altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Get altitude
   * @return altitude
  **/
  @Schema(description = "")
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public BaseItemDto isoSpeedRating(Integer isoSpeedRating) {
    this.isoSpeedRating = isoSpeedRating;
    return this;
  }

   /**
   * Get isoSpeedRating
   * @return isoSpeedRating
  **/
  @Schema(description = "")
  public Integer getIsoSpeedRating() {
    return isoSpeedRating;
  }

  public void setIsoSpeedRating(Integer isoSpeedRating) {
    this.isoSpeedRating = isoSpeedRating;
  }

  public BaseItemDto seriesTimerId(String seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
    return this;
  }

   /**
   * Get seriesTimerId
   * @return seriesTimerId
  **/
  @Schema(description = "")
  public String getSeriesTimerId() {
    return seriesTimerId;
  }

  public void setSeriesTimerId(String seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
  }

  public BaseItemDto channelPrimaryImageTag(String channelPrimaryImageTag) {
    this.channelPrimaryImageTag = channelPrimaryImageTag;
    return this;
  }

   /**
   * Get channelPrimaryImageTag
   * @return channelPrimaryImageTag
  **/
  @Schema(description = "")
  public String getChannelPrimaryImageTag() {
    return channelPrimaryImageTag;
  }

  public void setChannelPrimaryImageTag(String channelPrimaryImageTag) {
    this.channelPrimaryImageTag = channelPrimaryImageTag;
  }

  public BaseItemDto startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public BaseItemDto completionPercentage(Double completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }

   /**
   * Get completionPercentage
   * @return completionPercentage
  **/
  @Schema(description = "")
  public Double getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(Double completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public BaseItemDto isRepeat(Boolean isRepeat) {
    this.isRepeat = isRepeat;
    return this;
  }

   /**
   * Get isRepeat
   * @return isRepeat
  **/
  @Schema(description = "")
  public Boolean isIsRepeat() {
    return isRepeat;
  }

  public void setIsRepeat(Boolean isRepeat) {
    this.isRepeat = isRepeat;
  }

  public BaseItemDto isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

   /**
   * Get isNew
   * @return isNew
  **/
  @Schema(description = "")
  public Boolean isIsNew() {
    return isNew;
  }

  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  public BaseItemDto episodeTitle(String episodeTitle) {
    this.episodeTitle = episodeTitle;
    return this;
  }

   /**
   * Get episodeTitle
   * @return episodeTitle
  **/
  @Schema(description = "")
  public String getEpisodeTitle() {
    return episodeTitle;
  }

  public void setEpisodeTitle(String episodeTitle) {
    this.episodeTitle = episodeTitle;
  }

  public BaseItemDto isMovie(Boolean isMovie) {
    this.isMovie = isMovie;
    return this;
  }

   /**
   * Get isMovie
   * @return isMovie
  **/
  @Schema(description = "")
  public Boolean isIsMovie() {
    return isMovie;
  }

  public void setIsMovie(Boolean isMovie) {
    this.isMovie = isMovie;
  }

  public BaseItemDto isSports(Boolean isSports) {
    this.isSports = isSports;
    return this;
  }

   /**
   * Get isSports
   * @return isSports
  **/
  @Schema(description = "")
  public Boolean isIsSports() {
    return isSports;
  }

  public void setIsSports(Boolean isSports) {
    this.isSports = isSports;
  }

  public BaseItemDto isSeries(Boolean isSeries) {
    this.isSeries = isSeries;
    return this;
  }

   /**
   * Get isSeries
   * @return isSeries
  **/
  @Schema(description = "")
  public Boolean isIsSeries() {
    return isSeries;
  }

  public void setIsSeries(Boolean isSeries) {
    this.isSeries = isSeries;
  }

  public BaseItemDto isLive(Boolean isLive) {
    this.isLive = isLive;
    return this;
  }

   /**
   * Get isLive
   * @return isLive
  **/
  @Schema(description = "")
  public Boolean isIsLive() {
    return isLive;
  }

  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }

  public BaseItemDto isNews(Boolean isNews) {
    this.isNews = isNews;
    return this;
  }

   /**
   * Get isNews
   * @return isNews
  **/
  @Schema(description = "")
  public Boolean isIsNews() {
    return isNews;
  }

  public void setIsNews(Boolean isNews) {
    this.isNews = isNews;
  }

  public BaseItemDto isKids(Boolean isKids) {
    this.isKids = isKids;
    return this;
  }

   /**
   * Get isKids
   * @return isKids
  **/
  @Schema(description = "")
  public Boolean isIsKids() {
    return isKids;
  }

  public void setIsKids(Boolean isKids) {
    this.isKids = isKids;
  }

  public BaseItemDto isPremiere(Boolean isPremiere) {
    this.isPremiere = isPremiere;
    return this;
  }

   /**
   * Get isPremiere
   * @return isPremiere
  **/
  @Schema(description = "")
  public Boolean isIsPremiere() {
    return isPremiere;
  }

  public void setIsPremiere(Boolean isPremiere) {
    this.isPremiere = isPremiere;
  }

  public BaseItemDto timerType(LiveTvTimerType timerType) {
    this.timerType = timerType;
    return this;
  }

   /**
   * Get timerType
   * @return timerType
  **/
  @Schema(description = "")
  public LiveTvTimerType getTimerType() {
    return timerType;
  }

  public void setTimerType(LiveTvTimerType timerType) {
    this.timerType = timerType;
  }

  public BaseItemDto disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Schema(description = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public BaseItemDto managementId(String managementId) {
    this.managementId = managementId;
    return this;
  }

   /**
   * Get managementId
   * @return managementId
  **/
  @Schema(description = "")
  public String getManagementId() {
    return managementId;
  }

  public void setManagementId(String managementId) {
    this.managementId = managementId;
  }

  public BaseItemDto timerId(String timerId) {
    this.timerId = timerId;
    return this;
  }

   /**
   * Get timerId
   * @return timerId
  **/
  @Schema(description = "")
  public String getTimerId() {
    return timerId;
  }

  public void setTimerId(String timerId) {
    this.timerId = timerId;
  }

  public BaseItemDto currentProgram(BaseItemDto currentProgram) {
    this.currentProgram = currentProgram;
    return this;
  }

   /**
   * Get currentProgram
   * @return currentProgram
  **/
  @Schema(description = "")
  public BaseItemDto getCurrentProgram() {
    return currentProgram;
  }

  public void setCurrentProgram(BaseItemDto currentProgram) {
    this.currentProgram = currentProgram;
  }

  public BaseItemDto movieCount(Integer movieCount) {
    this.movieCount = movieCount;
    return this;
  }

   /**
   * Get movieCount
   * @return movieCount
  **/
  @Schema(description = "")
  public Integer getMovieCount() {
    return movieCount;
  }

  public void setMovieCount(Integer movieCount) {
    this.movieCount = movieCount;
  }

  public BaseItemDto seriesCount(Integer seriesCount) {
    this.seriesCount = seriesCount;
    return this;
  }

   /**
   * Get seriesCount
   * @return seriesCount
  **/
  @Schema(description = "")
  public Integer getSeriesCount() {
    return seriesCount;
  }

  public void setSeriesCount(Integer seriesCount) {
    this.seriesCount = seriesCount;
  }

  public BaseItemDto albumCount(Integer albumCount) {
    this.albumCount = albumCount;
    return this;
  }

   /**
   * Get albumCount
   * @return albumCount
  **/
  @Schema(description = "")
  public Integer getAlbumCount() {
    return albumCount;
  }

  public void setAlbumCount(Integer albumCount) {
    this.albumCount = albumCount;
  }

  public BaseItemDto songCount(Integer songCount) {
    this.songCount = songCount;
    return this;
  }

   /**
   * Get songCount
   * @return songCount
  **/
  @Schema(description = "")
  public Integer getSongCount() {
    return songCount;
  }

  public void setSongCount(Integer songCount) {
    this.songCount = songCount;
  }

  public BaseItemDto musicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
    return this;
  }

   /**
   * Get musicVideoCount
   * @return musicVideoCount
  **/
  @Schema(description = "")
  public Integer getMusicVideoCount() {
    return musicVideoCount;
  }

  public void setMusicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
  }

  public BaseItemDto subviews(List<String> subviews) {
    this.subviews = subviews;
    return this;
  }

  public BaseItemDto addSubviewsItem(String subviewsItem) {
    if (this.subviews == null) {
      this.subviews = new ArrayList<String>();
    }
    this.subviews.add(subviewsItem);
    return this;
  }

   /**
   * Get subviews
   * @return subviews
  **/
  @Schema(description = "")
  public List<String> getSubviews() {
    return subviews;
  }

  public void setSubviews(List<String> subviews) {
    this.subviews = subviews;
  }

  public BaseItemDto listingsProviderId(String listingsProviderId) {
    this.listingsProviderId = listingsProviderId;
    return this;
  }

   /**
   * Get listingsProviderId
   * @return listingsProviderId
  **/
  @Schema(description = "")
  public String getListingsProviderId() {
    return listingsProviderId;
  }

  public void setListingsProviderId(String listingsProviderId) {
    this.listingsProviderId = listingsProviderId;
  }

  public BaseItemDto listingsChannelId(String listingsChannelId) {
    this.listingsChannelId = listingsChannelId;
    return this;
  }

   /**
   * Get listingsChannelId
   * @return listingsChannelId
  **/
  @Schema(description = "")
  public String getListingsChannelId() {
    return listingsChannelId;
  }

  public void setListingsChannelId(String listingsChannelId) {
    this.listingsChannelId = listingsChannelId;
  }

  public BaseItemDto listingsPath(String listingsPath) {
    this.listingsPath = listingsPath;
    return this;
  }

   /**
   * Get listingsPath
   * @return listingsPath
  **/
  @Schema(description = "")
  public String getListingsPath() {
    return listingsPath;
  }

  public void setListingsPath(String listingsPath) {
    this.listingsPath = listingsPath;
  }

  public BaseItemDto listingsId(String listingsId) {
    this.listingsId = listingsId;
    return this;
  }

   /**
   * Get listingsId
   * @return listingsId
  **/
  @Schema(description = "")
  public String getListingsId() {
    return listingsId;
  }

  public void setListingsId(String listingsId) {
    this.listingsId = listingsId;
  }

  public BaseItemDto listingsChannelName(String listingsChannelName) {
    this.listingsChannelName = listingsChannelName;
    return this;
  }

   /**
   * Get listingsChannelName
   * @return listingsChannelName
  **/
  @Schema(description = "")
  public String getListingsChannelName() {
    return listingsChannelName;
  }

  public void setListingsChannelName(String listingsChannelName) {
    this.listingsChannelName = listingsChannelName;
  }

  public BaseItemDto listingsChannelNumber(String listingsChannelNumber) {
    this.listingsChannelNumber = listingsChannelNumber;
    return this;
  }

   /**
   * Get listingsChannelNumber
   * @return listingsChannelNumber
  **/
  @Schema(description = "")
  public String getListingsChannelNumber() {
    return listingsChannelNumber;
  }

  public void setListingsChannelNumber(String listingsChannelNumber) {
    this.listingsChannelNumber = listingsChannelNumber;
  }

  public BaseItemDto affiliateCallSign(String affiliateCallSign) {
    this.affiliateCallSign = affiliateCallSign;
    return this;
  }

   /**
   * Get affiliateCallSign
   * @return affiliateCallSign
  **/
  @Schema(description = "")
  public String getAffiliateCallSign() {
    return affiliateCallSign;
  }

  public void setAffiliateCallSign(String affiliateCallSign) {
    this.affiliateCallSign = affiliateCallSign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseItemDto baseItemDto = (BaseItemDto) o;
    return Objects.equals(this.name, baseItemDto.name) &&
        Objects.equals(this.originalTitle, baseItemDto.originalTitle) &&
        Objects.equals(this.serverId, baseItemDto.serverId) &&
        Objects.equals(this.id, baseItemDto.id) &&
        Objects.equals(this.guid, baseItemDto.guid) &&
        Objects.equals(this.etag, baseItemDto.etag) &&
        Objects.equals(this.prefix, baseItemDto.prefix) &&
        Objects.equals(this.playlistItemId, baseItemDto.playlistItemId) &&
        Objects.equals(this.dateCreated, baseItemDto.dateCreated) &&
        Objects.equals(this.extraType, baseItemDto.extraType) &&
        Objects.equals(this.sortIndexNumber, baseItemDto.sortIndexNumber) &&
        Objects.equals(this.sortParentIndexNumber, baseItemDto.sortParentIndexNumber) &&
        Objects.equals(this.canDelete, baseItemDto.canDelete) &&
        Objects.equals(this.canDownload, baseItemDto.canDownload) &&
        Objects.equals(this.supportsResume, baseItemDto.supportsResume) &&
        Objects.equals(this.presentationUniqueKey, baseItemDto.presentationUniqueKey) &&
        Objects.equals(this.preferredMetadataLanguage, baseItemDto.preferredMetadataLanguage) &&
        Objects.equals(this.preferredMetadataCountryCode, baseItemDto.preferredMetadataCountryCode) &&
        Objects.equals(this.supportsSync, baseItemDto.supportsSync) &&
        Objects.equals(this.canManageAccess, baseItemDto.canManageAccess) &&
        Objects.equals(this.canMakePrivate, baseItemDto.canMakePrivate) &&
        Objects.equals(this.canMakePublic, baseItemDto.canMakePublic) &&
        Objects.equals(this.container, baseItemDto.container) &&
        Objects.equals(this.sortName, baseItemDto.sortName) &&
        Objects.equals(this.forcedSortName, baseItemDto.forcedSortName) &&
        Objects.equals(this.video3DFormat, baseItemDto.video3DFormat) &&
        Objects.equals(this.premiereDate, baseItemDto.premiereDate) &&
        Objects.equals(this.externalUrls, baseItemDto.externalUrls) &&
        Objects.equals(this.mediaSources, baseItemDto.mediaSources) &&
        Objects.equals(this.criticRating, baseItemDto.criticRating) &&
        Objects.equals(this.gameSystemId, baseItemDto.gameSystemId) &&
        Objects.equals(this.asSeries, baseItemDto.asSeries) &&
        Objects.equals(this.gameSystem, baseItemDto.gameSystem) &&
        Objects.equals(this.productionLocations, baseItemDto.productionLocations) &&
        Objects.equals(this.path, baseItemDto.path) &&
        Objects.equals(this.officialRating, baseItemDto.officialRating) &&
        Objects.equals(this.customRating, baseItemDto.customRating) &&
        Objects.equals(this.channelId, baseItemDto.channelId) &&
        Objects.equals(this.channelName, baseItemDto.channelName) &&
        Objects.equals(this.overview, baseItemDto.overview) &&
        Objects.equals(this.taglines, baseItemDto.taglines) &&
        Objects.equals(this.genres, baseItemDto.genres) &&
        Objects.equals(this.communityRating, baseItemDto.communityRating) &&
        Objects.equals(this.runTimeTicks, baseItemDto.runTimeTicks) &&
        Objects.equals(this.size, baseItemDto.size) &&
        Objects.equals(this.fileName, baseItemDto.fileName) &&
        Objects.equals(this.bitrate, baseItemDto.bitrate) &&
        Objects.equals(this.productionYear, baseItemDto.productionYear) &&
        Objects.equals(this.number, baseItemDto.number) &&
        Objects.equals(this.channelNumber, baseItemDto.channelNumber) &&
        Objects.equals(this.indexNumber, baseItemDto.indexNumber) &&
        Objects.equals(this.indexNumberEnd, baseItemDto.indexNumberEnd) &&
        Objects.equals(this.parentIndexNumber, baseItemDto.parentIndexNumber) &&
        Objects.equals(this.remoteTrailers, baseItemDto.remoteTrailers) &&
        Objects.equals(this.providerIds, baseItemDto.providerIds) &&
        Objects.equals(this.isFolder, baseItemDto.isFolder) &&
        Objects.equals(this.parentId, baseItemDto.parentId) &&
        Objects.equals(this.type, baseItemDto.type) &&
        Objects.equals(this.people, baseItemDto.people) &&
        Objects.equals(this.studios, baseItemDto.studios) &&
        Objects.equals(this.genreItems, baseItemDto.genreItems) &&
        Objects.equals(this.tagItems, baseItemDto.tagItems) &&
        Objects.equals(this.parentLogoItemId, baseItemDto.parentLogoItemId) &&
        Objects.equals(this.parentBackdropItemId, baseItemDto.parentBackdropItemId) &&
        Objects.equals(this.parentBackdropImageTags, baseItemDto.parentBackdropImageTags) &&
        Objects.equals(this.localTrailerCount, baseItemDto.localTrailerCount) &&
        Objects.equals(this.userData, baseItemDto.userData) &&
        Objects.equals(this.recursiveItemCount, baseItemDto.recursiveItemCount) &&
        Objects.equals(this.childCount, baseItemDto.childCount) &&
        Objects.equals(this.seriesName, baseItemDto.seriesName) &&
        Objects.equals(this.seriesId, baseItemDto.seriesId) &&
        Objects.equals(this.seasonId, baseItemDto.seasonId) &&
        Objects.equals(this.specialFeatureCount, baseItemDto.specialFeatureCount) &&
        Objects.equals(this.displayPreferencesId, baseItemDto.displayPreferencesId) &&
        Objects.equals(this.status, baseItemDto.status) &&
        Objects.equals(this.airDays, baseItemDto.airDays) &&
        Objects.equals(this.tags, baseItemDto.tags) &&
        Objects.equals(this.primaryImageAspectRatio, baseItemDto.primaryImageAspectRatio) &&
        Objects.equals(this.artists, baseItemDto.artists) &&
        Objects.equals(this.artistItems, baseItemDto.artistItems) &&
        Objects.equals(this.composers, baseItemDto.composers) &&
        Objects.equals(this.album, baseItemDto.album) &&
        Objects.equals(this.collectionType, baseItemDto.collectionType) &&
        Objects.equals(this.displayOrder, baseItemDto.displayOrder) &&
        Objects.equals(this.albumId, baseItemDto.albumId) &&
        Objects.equals(this.albumPrimaryImageTag, baseItemDto.albumPrimaryImageTag) &&
        Objects.equals(this.seriesPrimaryImageTag, baseItemDto.seriesPrimaryImageTag) &&
        Objects.equals(this.albumArtist, baseItemDto.albumArtist) &&
        Objects.equals(this.albumArtists, baseItemDto.albumArtists) &&
        Objects.equals(this.seasonName, baseItemDto.seasonName) &&
        Objects.equals(this.mediaStreams, baseItemDto.mediaStreams) &&
        Objects.equals(this.partCount, baseItemDto.partCount) &&
        Objects.equals(this.imageTags, baseItemDto.imageTags) &&
        Objects.equals(this.backdropImageTags, baseItemDto.backdropImageTags) &&
        Objects.equals(this.parentLogoImageTag, baseItemDto.parentLogoImageTag) &&
        Objects.equals(this.seriesStudio, baseItemDto.seriesStudio) &&
        Objects.equals(this.parentThumbItemId, baseItemDto.parentThumbItemId) &&
        Objects.equals(this.parentThumbImageTag, baseItemDto.parentThumbImageTag) &&
        Objects.equals(this.chapters, baseItemDto.chapters) &&
        Objects.equals(this.locationType, baseItemDto.locationType) &&
        Objects.equals(this.mediaType, baseItemDto.mediaType) &&
        Objects.equals(this.endDate, baseItemDto.endDate) &&
        Objects.equals(this.lockedFields, baseItemDto.lockedFields) &&
        Objects.equals(this.lockData, baseItemDto.lockData) &&
        Objects.equals(this.width, baseItemDto.width) &&
        Objects.equals(this.height, baseItemDto.height) &&
        Objects.equals(this.cameraMake, baseItemDto.cameraMake) &&
        Objects.equals(this.cameraModel, baseItemDto.cameraModel) &&
        Objects.equals(this.software, baseItemDto.software) &&
        Objects.equals(this.exposureTime, baseItemDto.exposureTime) &&
        Objects.equals(this.focalLength, baseItemDto.focalLength) &&
        Objects.equals(this.imageOrientation, baseItemDto.imageOrientation) &&
        Objects.equals(this.aperture, baseItemDto.aperture) &&
        Objects.equals(this.shutterSpeed, baseItemDto.shutterSpeed) &&
        Objects.equals(this.latitude, baseItemDto.latitude) &&
        Objects.equals(this.longitude, baseItemDto.longitude) &&
        Objects.equals(this.altitude, baseItemDto.altitude) &&
        Objects.equals(this.isoSpeedRating, baseItemDto.isoSpeedRating) &&
        Objects.equals(this.seriesTimerId, baseItemDto.seriesTimerId) &&
        Objects.equals(this.channelPrimaryImageTag, baseItemDto.channelPrimaryImageTag) &&
        Objects.equals(this.startDate, baseItemDto.startDate) &&
        Objects.equals(this.completionPercentage, baseItemDto.completionPercentage) &&
        Objects.equals(this.isRepeat, baseItemDto.isRepeat) &&
        Objects.equals(this.isNew, baseItemDto.isNew) &&
        Objects.equals(this.episodeTitle, baseItemDto.episodeTitle) &&
        Objects.equals(this.isMovie, baseItemDto.isMovie) &&
        Objects.equals(this.isSports, baseItemDto.isSports) &&
        Objects.equals(this.isSeries, baseItemDto.isSeries) &&
        Objects.equals(this.isLive, baseItemDto.isLive) &&
        Objects.equals(this.isNews, baseItemDto.isNews) &&
        Objects.equals(this.isKids, baseItemDto.isKids) &&
        Objects.equals(this.isPremiere, baseItemDto.isPremiere) &&
        Objects.equals(this.timerType, baseItemDto.timerType) &&
        Objects.equals(this.disabled, baseItemDto.disabled) &&
        Objects.equals(this.managementId, baseItemDto.managementId) &&
        Objects.equals(this.timerId, baseItemDto.timerId) &&
        Objects.equals(this.currentProgram, baseItemDto.currentProgram) &&
        Objects.equals(this.movieCount, baseItemDto.movieCount) &&
        Objects.equals(this.seriesCount, baseItemDto.seriesCount) &&
        Objects.equals(this.albumCount, baseItemDto.albumCount) &&
        Objects.equals(this.songCount, baseItemDto.songCount) &&
        Objects.equals(this.musicVideoCount, baseItemDto.musicVideoCount) &&
        Objects.equals(this.subviews, baseItemDto.subviews) &&
        Objects.equals(this.listingsProviderId, baseItemDto.listingsProviderId) &&
        Objects.equals(this.listingsChannelId, baseItemDto.listingsChannelId) &&
        Objects.equals(this.listingsPath, baseItemDto.listingsPath) &&
        Objects.equals(this.listingsId, baseItemDto.listingsId) &&
        Objects.equals(this.listingsChannelName, baseItemDto.listingsChannelName) &&
        Objects.equals(this.listingsChannelNumber, baseItemDto.listingsChannelNumber) &&
        Objects.equals(this.affiliateCallSign, baseItemDto.affiliateCallSign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, originalTitle, serverId, id, guid, etag, prefix, playlistItemId, dateCreated, extraType, sortIndexNumber, sortParentIndexNumber, canDelete, canDownload, supportsResume, presentationUniqueKey, preferredMetadataLanguage, preferredMetadataCountryCode, supportsSync, canManageAccess, canMakePrivate, canMakePublic, container, sortName, forcedSortName, video3DFormat, premiereDate, externalUrls, mediaSources, criticRating, gameSystemId, asSeries, gameSystem, productionLocations, path, officialRating, customRating, channelId, channelName, overview, taglines, genres, communityRating, runTimeTicks, size, fileName, bitrate, productionYear, number, channelNumber, indexNumber, indexNumberEnd, parentIndexNumber, remoteTrailers, providerIds, isFolder, parentId, type, people, studios, genreItems, tagItems, parentLogoItemId, parentBackdropItemId, parentBackdropImageTags, localTrailerCount, userData, recursiveItemCount, childCount, seriesName, seriesId, seasonId, specialFeatureCount, displayPreferencesId, status, airDays, tags, primaryImageAspectRatio, artists, artistItems, composers, album, collectionType, displayOrder, albumId, albumPrimaryImageTag, seriesPrimaryImageTag, albumArtist, albumArtists, seasonName, mediaStreams, partCount, imageTags, backdropImageTags, parentLogoImageTag, seriesStudio, parentThumbItemId, parentThumbImageTag, chapters, locationType, mediaType, endDate, lockedFields, lockData, width, height, cameraMake, cameraModel, software, exposureTime, focalLength, imageOrientation, aperture, shutterSpeed, latitude, longitude, altitude, isoSpeedRating, seriesTimerId, channelPrimaryImageTag, startDate, completionPercentage, isRepeat, isNew, episodeTitle, isMovie, isSports, isSeries, isLive, isNews, isKids, isPremiere, timerType, disabled, managementId, timerId, currentProgram, movieCount, seriesCount, albumCount, songCount, musicVideoCount, subviews, listingsProviderId, listingsChannelId, listingsPath, listingsId, listingsChannelName, listingsChannelNumber, affiliateCallSign);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseItemDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    extraType: ").append(toIndentedString(extraType)).append("\n");
    sb.append("    sortIndexNumber: ").append(toIndentedString(sortIndexNumber)).append("\n");
    sb.append("    sortParentIndexNumber: ").append(toIndentedString(sortParentIndexNumber)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
    sb.append("    supportsResume: ").append(toIndentedString(supportsResume)).append("\n");
    sb.append("    presentationUniqueKey: ").append(toIndentedString(presentationUniqueKey)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    preferredMetadataCountryCode: ").append(toIndentedString(preferredMetadataCountryCode)).append("\n");
    sb.append("    supportsSync: ").append(toIndentedString(supportsSync)).append("\n");
    sb.append("    canManageAccess: ").append(toIndentedString(canManageAccess)).append("\n");
    sb.append("    canMakePrivate: ").append(toIndentedString(canMakePrivate)).append("\n");
    sb.append("    canMakePublic: ").append(toIndentedString(canMakePublic)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
    sb.append("    forcedSortName: ").append(toIndentedString(forcedSortName)).append("\n");
    sb.append("    video3DFormat: ").append(toIndentedString(video3DFormat)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    mediaSources: ").append(toIndentedString(mediaSources)).append("\n");
    sb.append("    criticRating: ").append(toIndentedString(criticRating)).append("\n");
    sb.append("    gameSystemId: ").append(toIndentedString(gameSystemId)).append("\n");
    sb.append("    asSeries: ").append(toIndentedString(asSeries)).append("\n");
    sb.append("    gameSystem: ").append(toIndentedString(gameSystem)).append("\n");
    sb.append("    productionLocations: ").append(toIndentedString(productionLocations)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    officialRating: ").append(toIndentedString(officialRating)).append("\n");
    sb.append("    customRating: ").append(toIndentedString(customRating)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    taglines: ").append(toIndentedString(taglines)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    channelNumber: ").append(toIndentedString(channelNumber)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    indexNumberEnd: ").append(toIndentedString(indexNumberEnd)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    remoteTrailers: ").append(toIndentedString(remoteTrailers)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    studios: ").append(toIndentedString(studios)).append("\n");
    sb.append("    genreItems: ").append(toIndentedString(genreItems)).append("\n");
    sb.append("    tagItems: ").append(toIndentedString(tagItems)).append("\n");
    sb.append("    parentLogoItemId: ").append(toIndentedString(parentLogoItemId)).append("\n");
    sb.append("    parentBackdropItemId: ").append(toIndentedString(parentBackdropItemId)).append("\n");
    sb.append("    parentBackdropImageTags: ").append(toIndentedString(parentBackdropImageTags)).append("\n");
    sb.append("    localTrailerCount: ").append(toIndentedString(localTrailerCount)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    recursiveItemCount: ").append(toIndentedString(recursiveItemCount)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    seriesName: ").append(toIndentedString(seriesName)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    seasonId: ").append(toIndentedString(seasonId)).append("\n");
    sb.append("    specialFeatureCount: ").append(toIndentedString(specialFeatureCount)).append("\n");
    sb.append("    displayPreferencesId: ").append(toIndentedString(displayPreferencesId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    airDays: ").append(toIndentedString(airDays)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    primaryImageAspectRatio: ").append(toIndentedString(primaryImageAspectRatio)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    artistItems: ").append(toIndentedString(artistItems)).append("\n");
    sb.append("    composers: ").append(toIndentedString(composers)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
    sb.append("    albumPrimaryImageTag: ").append(toIndentedString(albumPrimaryImageTag)).append("\n");
    sb.append("    seriesPrimaryImageTag: ").append(toIndentedString(seriesPrimaryImageTag)).append("\n");
    sb.append("    albumArtist: ").append(toIndentedString(albumArtist)).append("\n");
    sb.append("    albumArtists: ").append(toIndentedString(albumArtists)).append("\n");
    sb.append("    seasonName: ").append(toIndentedString(seasonName)).append("\n");
    sb.append("    mediaStreams: ").append(toIndentedString(mediaStreams)).append("\n");
    sb.append("    partCount: ").append(toIndentedString(partCount)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    backdropImageTags: ").append(toIndentedString(backdropImageTags)).append("\n");
    sb.append("    parentLogoImageTag: ").append(toIndentedString(parentLogoImageTag)).append("\n");
    sb.append("    seriesStudio: ").append(toIndentedString(seriesStudio)).append("\n");
    sb.append("    parentThumbItemId: ").append(toIndentedString(parentThumbItemId)).append("\n");
    sb.append("    parentThumbImageTag: ").append(toIndentedString(parentThumbImageTag)).append("\n");
    sb.append("    chapters: ").append(toIndentedString(chapters)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    lockedFields: ").append(toIndentedString(lockedFields)).append("\n");
    sb.append("    lockData: ").append(toIndentedString(lockData)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    cameraMake: ").append(toIndentedString(cameraMake)).append("\n");
    sb.append("    cameraModel: ").append(toIndentedString(cameraModel)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    exposureTime: ").append(toIndentedString(exposureTime)).append("\n");
    sb.append("    focalLength: ").append(toIndentedString(focalLength)).append("\n");
    sb.append("    imageOrientation: ").append(toIndentedString(imageOrientation)).append("\n");
    sb.append("    aperture: ").append(toIndentedString(aperture)).append("\n");
    sb.append("    shutterSpeed: ").append(toIndentedString(shutterSpeed)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    isoSpeedRating: ").append(toIndentedString(isoSpeedRating)).append("\n");
    sb.append("    seriesTimerId: ").append(toIndentedString(seriesTimerId)).append("\n");
    sb.append("    channelPrimaryImageTag: ").append(toIndentedString(channelPrimaryImageTag)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    isRepeat: ").append(toIndentedString(isRepeat)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    episodeTitle: ").append(toIndentedString(episodeTitle)).append("\n");
    sb.append("    isMovie: ").append(toIndentedString(isMovie)).append("\n");
    sb.append("    isSports: ").append(toIndentedString(isSports)).append("\n");
    sb.append("    isSeries: ").append(toIndentedString(isSeries)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    isNews: ").append(toIndentedString(isNews)).append("\n");
    sb.append("    isKids: ").append(toIndentedString(isKids)).append("\n");
    sb.append("    isPremiere: ").append(toIndentedString(isPremiere)).append("\n");
    sb.append("    timerType: ").append(toIndentedString(timerType)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    managementId: ").append(toIndentedString(managementId)).append("\n");
    sb.append("    timerId: ").append(toIndentedString(timerId)).append("\n");
    sb.append("    currentProgram: ").append(toIndentedString(currentProgram)).append("\n");
    sb.append("    movieCount: ").append(toIndentedString(movieCount)).append("\n");
    sb.append("    seriesCount: ").append(toIndentedString(seriesCount)).append("\n");
    sb.append("    albumCount: ").append(toIndentedString(albumCount)).append("\n");
    sb.append("    songCount: ").append(toIndentedString(songCount)).append("\n");
    sb.append("    musicVideoCount: ").append(toIndentedString(musicVideoCount)).append("\n");
    sb.append("    subviews: ").append(toIndentedString(subviews)).append("\n");
    sb.append("    listingsProviderId: ").append(toIndentedString(listingsProviderId)).append("\n");
    sb.append("    listingsChannelId: ").append(toIndentedString(listingsChannelId)).append("\n");
    sb.append("    listingsPath: ").append(toIndentedString(listingsPath)).append("\n");
    sb.append("    listingsId: ").append(toIndentedString(listingsId)).append("\n");
    sb.append("    listingsChannelName: ").append(toIndentedString(listingsChannelName)).append("\n");
    sb.append("    listingsChannelNumber: ").append(toIndentedString(listingsChannelNumber)).append("\n");
    sb.append("    affiliateCallSign: ").append(toIndentedString(affiliateCallSign)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
