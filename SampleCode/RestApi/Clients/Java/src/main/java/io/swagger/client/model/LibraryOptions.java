/*
 * Emby Server REST API
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
import io.swagger.client.model.MediaPathInfo;
import io.swagger.client.model.TypeOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryOptions
 */


public class LibraryOptions {
  @SerializedName("EnableArchiveMediaFiles")
  private Boolean enableArchiveMediaFiles = null;

  @SerializedName("EnablePhotos")
  private Boolean enablePhotos = null;

  @SerializedName("EnableRealtimeMonitor")
  private Boolean enableRealtimeMonitor = null;

  @SerializedName("EnableMarkerDetection")
  private Boolean enableMarkerDetection = null;

  @SerializedName("EnableMarkerDetectionDuringLibraryScan")
  private Boolean enableMarkerDetectionDuringLibraryScan = null;

  @SerializedName("IntroDetectionFingerprintLength")
  private Integer introDetectionFingerprintLength = null;

  @SerializedName("EnableChapterImageExtraction")
  private Boolean enableChapterImageExtraction = null;

  @SerializedName("ExtractChapterImagesDuringLibraryScan")
  private Boolean extractChapterImagesDuringLibraryScan = null;

  @SerializedName("DownloadImagesInAdvance")
  private Boolean downloadImagesInAdvance = null;

  @SerializedName("CacheImages")
  private Boolean cacheImages = null;

  @SerializedName("PathInfos")
  private List<MediaPathInfo> pathInfos = null;

  @SerializedName("IgnoreHiddenFiles")
  private Boolean ignoreHiddenFiles = null;

  @SerializedName("IgnoreFileExtensions")
  private List<String> ignoreFileExtensions = null;

  @SerializedName("SaveLocalMetadata")
  private Boolean saveLocalMetadata = null;

  @SerializedName("SaveMetadataHidden")
  private Boolean saveMetadataHidden = null;

  @SerializedName("SaveLocalThumbnailSets")
  private Boolean saveLocalThumbnailSets = null;

  @SerializedName("ImportPlaylists")
  private Boolean importPlaylists = null;

  @SerializedName("EnableAutomaticSeriesGrouping")
  private Boolean enableAutomaticSeriesGrouping = null;

  @SerializedName("ShareEmbeddedMusicAlbumImages")
  private Boolean shareEmbeddedMusicAlbumImages = null;

  @SerializedName("EnableEmbeddedTitles")
  private Boolean enableEmbeddedTitles = null;

  @SerializedName("EnableAudioResume")
  private Boolean enableAudioResume = null;

  @SerializedName("AutoGenerateChapters")
  private Boolean autoGenerateChapters = null;

  @SerializedName("AutomaticRefreshIntervalDays")
  private Integer automaticRefreshIntervalDays = null;

  @SerializedName("PlaceholderMetadataRefreshIntervalDays")
  private Integer placeholderMetadataRefreshIntervalDays = null;

  @SerializedName("PreferredMetadataLanguage")
  private String preferredMetadataLanguage = null;

  @SerializedName("PreferredImageLanguage")
  private String preferredImageLanguage = null;

  @SerializedName("ContentType")
  private String contentType = null;

  @SerializedName("MetadataCountryCode")
  private String metadataCountryCode = null;

  @SerializedName("MetadataSavers")
  private List<String> metadataSavers = null;

  @SerializedName("DisabledLocalMetadataReaders")
  private List<String> disabledLocalMetadataReaders = null;

  @SerializedName("LocalMetadataReaderOrder")
  private List<String> localMetadataReaderOrder = null;

  @SerializedName("DisabledLyricsFetchers")
  private List<String> disabledLyricsFetchers = null;

  @SerializedName("SaveLyricsWithMedia")
  private Boolean saveLyricsWithMedia = null;

  @SerializedName("LyricsDownloadMaxAgeDays")
  private Integer lyricsDownloadMaxAgeDays = null;

  @SerializedName("LyricsFetcherOrder")
  private List<String> lyricsFetcherOrder = null;

  @SerializedName("LyricsDownloadLanguages")
  private List<String> lyricsDownloadLanguages = null;

  @SerializedName("DisabledSubtitleFetchers")
  private List<String> disabledSubtitleFetchers = null;

  @SerializedName("SubtitleFetcherOrder")
  private List<String> subtitleFetcherOrder = null;

  @SerializedName("SkipSubtitlesIfEmbeddedSubtitlesPresent")
  private Boolean skipSubtitlesIfEmbeddedSubtitlesPresent = null;

  @SerializedName("SkipSubtitlesIfAudioTrackMatches")
  private Boolean skipSubtitlesIfAudioTrackMatches = null;

  @SerializedName("SubtitleDownloadLanguages")
  private List<String> subtitleDownloadLanguages = null;

  @SerializedName("SubtitleDownloadMaxAgeDays")
  private Integer subtitleDownloadMaxAgeDays = null;

  @SerializedName("RequirePerfectSubtitleMatch")
  private Boolean requirePerfectSubtitleMatch = null;

  @SerializedName("SaveSubtitlesWithMedia")
  private Boolean saveSubtitlesWithMedia = null;

  @SerializedName("ForcedSubtitlesOnly")
  private Boolean forcedSubtitlesOnly = null;

  @SerializedName("HearingImpairedSubtitlesOnly")
  private Boolean hearingImpairedSubtitlesOnly = null;

  @SerializedName("TypeOptions")
  private List<TypeOptions> typeOptions = null;

  @SerializedName("CollapseSingleItemFolders")
  private Boolean collapseSingleItemFolders = null;

  @SerializedName("EnableAdultMetadata")
  private Boolean enableAdultMetadata = null;

  @SerializedName("ImportCollections")
  private Boolean importCollections = null;

  @SerializedName("MinCollectionItems")
  private Integer minCollectionItems = null;

  @SerializedName("MusicFolderStructure")
  private String musicFolderStructure = null;

  @SerializedName("MinResumePct")
  private Integer minResumePct = null;

  @SerializedName("MaxResumePct")
  private Integer maxResumePct = null;

  @SerializedName("MinResumeDurationSeconds")
  private Integer minResumeDurationSeconds = null;

  @SerializedName("ThumbnailImagesIntervalSeconds")
  private Integer thumbnailImagesIntervalSeconds = null;

  @SerializedName("SampleIgnoreSize")
  private Integer sampleIgnoreSize = null;

  public LibraryOptions enableArchiveMediaFiles(Boolean enableArchiveMediaFiles) {
    this.enableArchiveMediaFiles = enableArchiveMediaFiles;
    return this;
  }

   /**
   * Get enableArchiveMediaFiles
   * @return enableArchiveMediaFiles
  **/
  @Schema(description = "")
  public Boolean isEnableArchiveMediaFiles() {
    return enableArchiveMediaFiles;
  }

  public void setEnableArchiveMediaFiles(Boolean enableArchiveMediaFiles) {
    this.enableArchiveMediaFiles = enableArchiveMediaFiles;
  }

  public LibraryOptions enablePhotos(Boolean enablePhotos) {
    this.enablePhotos = enablePhotos;
    return this;
  }

   /**
   * Get enablePhotos
   * @return enablePhotos
  **/
  @Schema(description = "")
  public Boolean isEnablePhotos() {
    return enablePhotos;
  }

  public void setEnablePhotos(Boolean enablePhotos) {
    this.enablePhotos = enablePhotos;
  }

  public LibraryOptions enableRealtimeMonitor(Boolean enableRealtimeMonitor) {
    this.enableRealtimeMonitor = enableRealtimeMonitor;
    return this;
  }

   /**
   * Get enableRealtimeMonitor
   * @return enableRealtimeMonitor
  **/
  @Schema(description = "")
  public Boolean isEnableRealtimeMonitor() {
    return enableRealtimeMonitor;
  }

  public void setEnableRealtimeMonitor(Boolean enableRealtimeMonitor) {
    this.enableRealtimeMonitor = enableRealtimeMonitor;
  }

  public LibraryOptions enableMarkerDetection(Boolean enableMarkerDetection) {
    this.enableMarkerDetection = enableMarkerDetection;
    return this;
  }

   /**
   * Get enableMarkerDetection
   * @return enableMarkerDetection
  **/
  @Schema(description = "")
  public Boolean isEnableMarkerDetection() {
    return enableMarkerDetection;
  }

  public void setEnableMarkerDetection(Boolean enableMarkerDetection) {
    this.enableMarkerDetection = enableMarkerDetection;
  }

  public LibraryOptions enableMarkerDetectionDuringLibraryScan(Boolean enableMarkerDetectionDuringLibraryScan) {
    this.enableMarkerDetectionDuringLibraryScan = enableMarkerDetectionDuringLibraryScan;
    return this;
  }

   /**
   * Get enableMarkerDetectionDuringLibraryScan
   * @return enableMarkerDetectionDuringLibraryScan
  **/
  @Schema(description = "")
  public Boolean isEnableMarkerDetectionDuringLibraryScan() {
    return enableMarkerDetectionDuringLibraryScan;
  }

  public void setEnableMarkerDetectionDuringLibraryScan(Boolean enableMarkerDetectionDuringLibraryScan) {
    this.enableMarkerDetectionDuringLibraryScan = enableMarkerDetectionDuringLibraryScan;
  }

  public LibraryOptions introDetectionFingerprintLength(Integer introDetectionFingerprintLength) {
    this.introDetectionFingerprintLength = introDetectionFingerprintLength;
    return this;
  }

   /**
   * Get introDetectionFingerprintLength
   * @return introDetectionFingerprintLength
  **/
  @Schema(description = "")
  public Integer getIntroDetectionFingerprintLength() {
    return introDetectionFingerprintLength;
  }

  public void setIntroDetectionFingerprintLength(Integer introDetectionFingerprintLength) {
    this.introDetectionFingerprintLength = introDetectionFingerprintLength;
  }

  public LibraryOptions enableChapterImageExtraction(Boolean enableChapterImageExtraction) {
    this.enableChapterImageExtraction = enableChapterImageExtraction;
    return this;
  }

   /**
   * Get enableChapterImageExtraction
   * @return enableChapterImageExtraction
  **/
  @Schema(description = "")
  public Boolean isEnableChapterImageExtraction() {
    return enableChapterImageExtraction;
  }

  public void setEnableChapterImageExtraction(Boolean enableChapterImageExtraction) {
    this.enableChapterImageExtraction = enableChapterImageExtraction;
  }

  public LibraryOptions extractChapterImagesDuringLibraryScan(Boolean extractChapterImagesDuringLibraryScan) {
    this.extractChapterImagesDuringLibraryScan = extractChapterImagesDuringLibraryScan;
    return this;
  }

   /**
   * Get extractChapterImagesDuringLibraryScan
   * @return extractChapterImagesDuringLibraryScan
  **/
  @Schema(description = "")
  public Boolean isExtractChapterImagesDuringLibraryScan() {
    return extractChapterImagesDuringLibraryScan;
  }

  public void setExtractChapterImagesDuringLibraryScan(Boolean extractChapterImagesDuringLibraryScan) {
    this.extractChapterImagesDuringLibraryScan = extractChapterImagesDuringLibraryScan;
  }

  public LibraryOptions downloadImagesInAdvance(Boolean downloadImagesInAdvance) {
    this.downloadImagesInAdvance = downloadImagesInAdvance;
    return this;
  }

   /**
   * Get downloadImagesInAdvance
   * @return downloadImagesInAdvance
  **/
  @Schema(description = "")
  public Boolean isDownloadImagesInAdvance() {
    return downloadImagesInAdvance;
  }

  public void setDownloadImagesInAdvance(Boolean downloadImagesInAdvance) {
    this.downloadImagesInAdvance = downloadImagesInAdvance;
  }

  public LibraryOptions cacheImages(Boolean cacheImages) {
    this.cacheImages = cacheImages;
    return this;
  }

   /**
   * Get cacheImages
   * @return cacheImages
  **/
  @Schema(description = "")
  public Boolean isCacheImages() {
    return cacheImages;
  }

  public void setCacheImages(Boolean cacheImages) {
    this.cacheImages = cacheImages;
  }

  public LibraryOptions pathInfos(List<MediaPathInfo> pathInfos) {
    this.pathInfos = pathInfos;
    return this;
  }

  public LibraryOptions addPathInfosItem(MediaPathInfo pathInfosItem) {
    if (this.pathInfos == null) {
      this.pathInfos = new ArrayList<MediaPathInfo>();
    }
    this.pathInfos.add(pathInfosItem);
    return this;
  }

   /**
   * Get pathInfos
   * @return pathInfos
  **/
  @Schema(description = "")
  public List<MediaPathInfo> getPathInfos() {
    return pathInfos;
  }

  public void setPathInfos(List<MediaPathInfo> pathInfos) {
    this.pathInfos = pathInfos;
  }

  public LibraryOptions ignoreHiddenFiles(Boolean ignoreHiddenFiles) {
    this.ignoreHiddenFiles = ignoreHiddenFiles;
    return this;
  }

   /**
   * Get ignoreHiddenFiles
   * @return ignoreHiddenFiles
  **/
  @Schema(description = "")
  public Boolean isIgnoreHiddenFiles() {
    return ignoreHiddenFiles;
  }

  public void setIgnoreHiddenFiles(Boolean ignoreHiddenFiles) {
    this.ignoreHiddenFiles = ignoreHiddenFiles;
  }

  public LibraryOptions ignoreFileExtensions(List<String> ignoreFileExtensions) {
    this.ignoreFileExtensions = ignoreFileExtensions;
    return this;
  }

  public LibraryOptions addIgnoreFileExtensionsItem(String ignoreFileExtensionsItem) {
    if (this.ignoreFileExtensions == null) {
      this.ignoreFileExtensions = new ArrayList<String>();
    }
    this.ignoreFileExtensions.add(ignoreFileExtensionsItem);
    return this;
  }

   /**
   * Get ignoreFileExtensions
   * @return ignoreFileExtensions
  **/
  @Schema(description = "")
  public List<String> getIgnoreFileExtensions() {
    return ignoreFileExtensions;
  }

  public void setIgnoreFileExtensions(List<String> ignoreFileExtensions) {
    this.ignoreFileExtensions = ignoreFileExtensions;
  }

  public LibraryOptions saveLocalMetadata(Boolean saveLocalMetadata) {
    this.saveLocalMetadata = saveLocalMetadata;
    return this;
  }

   /**
   * Get saveLocalMetadata
   * @return saveLocalMetadata
  **/
  @Schema(description = "")
  public Boolean isSaveLocalMetadata() {
    return saveLocalMetadata;
  }

  public void setSaveLocalMetadata(Boolean saveLocalMetadata) {
    this.saveLocalMetadata = saveLocalMetadata;
  }

  public LibraryOptions saveMetadataHidden(Boolean saveMetadataHidden) {
    this.saveMetadataHidden = saveMetadataHidden;
    return this;
  }

   /**
   * Get saveMetadataHidden
   * @return saveMetadataHidden
  **/
  @Schema(description = "")
  public Boolean isSaveMetadataHidden() {
    return saveMetadataHidden;
  }

  public void setSaveMetadataHidden(Boolean saveMetadataHidden) {
    this.saveMetadataHidden = saveMetadataHidden;
  }

  public LibraryOptions saveLocalThumbnailSets(Boolean saveLocalThumbnailSets) {
    this.saveLocalThumbnailSets = saveLocalThumbnailSets;
    return this;
  }

   /**
   * Get saveLocalThumbnailSets
   * @return saveLocalThumbnailSets
  **/
  @Schema(description = "")
  public Boolean isSaveLocalThumbnailSets() {
    return saveLocalThumbnailSets;
  }

  public void setSaveLocalThumbnailSets(Boolean saveLocalThumbnailSets) {
    this.saveLocalThumbnailSets = saveLocalThumbnailSets;
  }

  public LibraryOptions importPlaylists(Boolean importPlaylists) {
    this.importPlaylists = importPlaylists;
    return this;
  }

   /**
   * Get importPlaylists
   * @return importPlaylists
  **/
  @Schema(description = "")
  public Boolean isImportPlaylists() {
    return importPlaylists;
  }

  public void setImportPlaylists(Boolean importPlaylists) {
    this.importPlaylists = importPlaylists;
  }

  public LibraryOptions enableAutomaticSeriesGrouping(Boolean enableAutomaticSeriesGrouping) {
    this.enableAutomaticSeriesGrouping = enableAutomaticSeriesGrouping;
    return this;
  }

   /**
   * Get enableAutomaticSeriesGrouping
   * @return enableAutomaticSeriesGrouping
  **/
  @Schema(description = "")
  public Boolean isEnableAutomaticSeriesGrouping() {
    return enableAutomaticSeriesGrouping;
  }

  public void setEnableAutomaticSeriesGrouping(Boolean enableAutomaticSeriesGrouping) {
    this.enableAutomaticSeriesGrouping = enableAutomaticSeriesGrouping;
  }

  public LibraryOptions shareEmbeddedMusicAlbumImages(Boolean shareEmbeddedMusicAlbumImages) {
    this.shareEmbeddedMusicAlbumImages = shareEmbeddedMusicAlbumImages;
    return this;
  }

   /**
   * Get shareEmbeddedMusicAlbumImages
   * @return shareEmbeddedMusicAlbumImages
  **/
  @Schema(description = "")
  public Boolean isShareEmbeddedMusicAlbumImages() {
    return shareEmbeddedMusicAlbumImages;
  }

  public void setShareEmbeddedMusicAlbumImages(Boolean shareEmbeddedMusicAlbumImages) {
    this.shareEmbeddedMusicAlbumImages = shareEmbeddedMusicAlbumImages;
  }

  public LibraryOptions enableEmbeddedTitles(Boolean enableEmbeddedTitles) {
    this.enableEmbeddedTitles = enableEmbeddedTitles;
    return this;
  }

   /**
   * Get enableEmbeddedTitles
   * @return enableEmbeddedTitles
  **/
  @Schema(description = "")
  public Boolean isEnableEmbeddedTitles() {
    return enableEmbeddedTitles;
  }

  public void setEnableEmbeddedTitles(Boolean enableEmbeddedTitles) {
    this.enableEmbeddedTitles = enableEmbeddedTitles;
  }

  public LibraryOptions enableAudioResume(Boolean enableAudioResume) {
    this.enableAudioResume = enableAudioResume;
    return this;
  }

   /**
   * Get enableAudioResume
   * @return enableAudioResume
  **/
  @Schema(description = "")
  public Boolean isEnableAudioResume() {
    return enableAudioResume;
  }

  public void setEnableAudioResume(Boolean enableAudioResume) {
    this.enableAudioResume = enableAudioResume;
  }

  public LibraryOptions autoGenerateChapters(Boolean autoGenerateChapters) {
    this.autoGenerateChapters = autoGenerateChapters;
    return this;
  }

   /**
   * Get autoGenerateChapters
   * @return autoGenerateChapters
  **/
  @Schema(description = "")
  public Boolean isAutoGenerateChapters() {
    return autoGenerateChapters;
  }

  public void setAutoGenerateChapters(Boolean autoGenerateChapters) {
    this.autoGenerateChapters = autoGenerateChapters;
  }

  public LibraryOptions automaticRefreshIntervalDays(Integer automaticRefreshIntervalDays) {
    this.automaticRefreshIntervalDays = automaticRefreshIntervalDays;
    return this;
  }

   /**
   * Get automaticRefreshIntervalDays
   * @return automaticRefreshIntervalDays
  **/
  @Schema(description = "")
  public Integer getAutomaticRefreshIntervalDays() {
    return automaticRefreshIntervalDays;
  }

  public void setAutomaticRefreshIntervalDays(Integer automaticRefreshIntervalDays) {
    this.automaticRefreshIntervalDays = automaticRefreshIntervalDays;
  }

  public LibraryOptions placeholderMetadataRefreshIntervalDays(Integer placeholderMetadataRefreshIntervalDays) {
    this.placeholderMetadataRefreshIntervalDays = placeholderMetadataRefreshIntervalDays;
    return this;
  }

   /**
   * Get placeholderMetadataRefreshIntervalDays
   * @return placeholderMetadataRefreshIntervalDays
  **/
  @Schema(description = "")
  public Integer getPlaceholderMetadataRefreshIntervalDays() {
    return placeholderMetadataRefreshIntervalDays;
  }

  public void setPlaceholderMetadataRefreshIntervalDays(Integer placeholderMetadataRefreshIntervalDays) {
    this.placeholderMetadataRefreshIntervalDays = placeholderMetadataRefreshIntervalDays;
  }

  public LibraryOptions preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
    return this;
  }

   /**
   * The preferred metadata language.
   * @return preferredMetadataLanguage
  **/
  @Schema(description = "The preferred metadata language.")
  public String getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public LibraryOptions preferredImageLanguage(String preferredImageLanguage) {
    this.preferredImageLanguage = preferredImageLanguage;
    return this;
  }

   /**
   * Get preferredImageLanguage
   * @return preferredImageLanguage
  **/
  @Schema(description = "")
  public String getPreferredImageLanguage() {
    return preferredImageLanguage;
  }

  public void setPreferredImageLanguage(String preferredImageLanguage) {
    this.preferredImageLanguage = preferredImageLanguage;
  }

  public LibraryOptions contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @Schema(description = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public LibraryOptions metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
    return this;
  }

   /**
   * The metadata country code.
   * @return metadataCountryCode
  **/
  @Schema(description = "The metadata country code.")
  public String getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public LibraryOptions metadataSavers(List<String> metadataSavers) {
    this.metadataSavers = metadataSavers;
    return this;
  }

  public LibraryOptions addMetadataSaversItem(String metadataSaversItem) {
    if (this.metadataSavers == null) {
      this.metadataSavers = new ArrayList<String>();
    }
    this.metadataSavers.add(metadataSaversItem);
    return this;
  }

   /**
   * Get metadataSavers
   * @return metadataSavers
  **/
  @Schema(description = "")
  public List<String> getMetadataSavers() {
    return metadataSavers;
  }

  public void setMetadataSavers(List<String> metadataSavers) {
    this.metadataSavers = metadataSavers;
  }

  public LibraryOptions disabledLocalMetadataReaders(List<String> disabledLocalMetadataReaders) {
    this.disabledLocalMetadataReaders = disabledLocalMetadataReaders;
    return this;
  }

  public LibraryOptions addDisabledLocalMetadataReadersItem(String disabledLocalMetadataReadersItem) {
    if (this.disabledLocalMetadataReaders == null) {
      this.disabledLocalMetadataReaders = new ArrayList<String>();
    }
    this.disabledLocalMetadataReaders.add(disabledLocalMetadataReadersItem);
    return this;
  }

   /**
   * Get disabledLocalMetadataReaders
   * @return disabledLocalMetadataReaders
  **/
  @Schema(description = "")
  public List<String> getDisabledLocalMetadataReaders() {
    return disabledLocalMetadataReaders;
  }

  public void setDisabledLocalMetadataReaders(List<String> disabledLocalMetadataReaders) {
    this.disabledLocalMetadataReaders = disabledLocalMetadataReaders;
  }

  public LibraryOptions localMetadataReaderOrder(List<String> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = localMetadataReaderOrder;
    return this;
  }

  public LibraryOptions addLocalMetadataReaderOrderItem(String localMetadataReaderOrderItem) {
    if (this.localMetadataReaderOrder == null) {
      this.localMetadataReaderOrder = new ArrayList<String>();
    }
    this.localMetadataReaderOrder.add(localMetadataReaderOrderItem);
    return this;
  }

   /**
   * Get localMetadataReaderOrder
   * @return localMetadataReaderOrder
  **/
  @Schema(description = "")
  public List<String> getLocalMetadataReaderOrder() {
    return localMetadataReaderOrder;
  }

  public void setLocalMetadataReaderOrder(List<String> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = localMetadataReaderOrder;
  }

  public LibraryOptions disabledLyricsFetchers(List<String> disabledLyricsFetchers) {
    this.disabledLyricsFetchers = disabledLyricsFetchers;
    return this;
  }

  public LibraryOptions addDisabledLyricsFetchersItem(String disabledLyricsFetchersItem) {
    if (this.disabledLyricsFetchers == null) {
      this.disabledLyricsFetchers = new ArrayList<String>();
    }
    this.disabledLyricsFetchers.add(disabledLyricsFetchersItem);
    return this;
  }

   /**
   * Get disabledLyricsFetchers
   * @return disabledLyricsFetchers
  **/
  @Schema(description = "")
  public List<String> getDisabledLyricsFetchers() {
    return disabledLyricsFetchers;
  }

  public void setDisabledLyricsFetchers(List<String> disabledLyricsFetchers) {
    this.disabledLyricsFetchers = disabledLyricsFetchers;
  }

  public LibraryOptions saveLyricsWithMedia(Boolean saveLyricsWithMedia) {
    this.saveLyricsWithMedia = saveLyricsWithMedia;
    return this;
  }

   /**
   * Get saveLyricsWithMedia
   * @return saveLyricsWithMedia
  **/
  @Schema(description = "")
  public Boolean isSaveLyricsWithMedia() {
    return saveLyricsWithMedia;
  }

  public void setSaveLyricsWithMedia(Boolean saveLyricsWithMedia) {
    this.saveLyricsWithMedia = saveLyricsWithMedia;
  }

  public LibraryOptions lyricsDownloadMaxAgeDays(Integer lyricsDownloadMaxAgeDays) {
    this.lyricsDownloadMaxAgeDays = lyricsDownloadMaxAgeDays;
    return this;
  }

   /**
   * Get lyricsDownloadMaxAgeDays
   * @return lyricsDownloadMaxAgeDays
  **/
  @Schema(description = "")
  public Integer getLyricsDownloadMaxAgeDays() {
    return lyricsDownloadMaxAgeDays;
  }

  public void setLyricsDownloadMaxAgeDays(Integer lyricsDownloadMaxAgeDays) {
    this.lyricsDownloadMaxAgeDays = lyricsDownloadMaxAgeDays;
  }

  public LibraryOptions lyricsFetcherOrder(List<String> lyricsFetcherOrder) {
    this.lyricsFetcherOrder = lyricsFetcherOrder;
    return this;
  }

  public LibraryOptions addLyricsFetcherOrderItem(String lyricsFetcherOrderItem) {
    if (this.lyricsFetcherOrder == null) {
      this.lyricsFetcherOrder = new ArrayList<String>();
    }
    this.lyricsFetcherOrder.add(lyricsFetcherOrderItem);
    return this;
  }

   /**
   * Get lyricsFetcherOrder
   * @return lyricsFetcherOrder
  **/
  @Schema(description = "")
  public List<String> getLyricsFetcherOrder() {
    return lyricsFetcherOrder;
  }

  public void setLyricsFetcherOrder(List<String> lyricsFetcherOrder) {
    this.lyricsFetcherOrder = lyricsFetcherOrder;
  }

  public LibraryOptions lyricsDownloadLanguages(List<String> lyricsDownloadLanguages) {
    this.lyricsDownloadLanguages = lyricsDownloadLanguages;
    return this;
  }

  public LibraryOptions addLyricsDownloadLanguagesItem(String lyricsDownloadLanguagesItem) {
    if (this.lyricsDownloadLanguages == null) {
      this.lyricsDownloadLanguages = new ArrayList<String>();
    }
    this.lyricsDownloadLanguages.add(lyricsDownloadLanguagesItem);
    return this;
  }

   /**
   * Get lyricsDownloadLanguages
   * @return lyricsDownloadLanguages
  **/
  @Schema(description = "")
  public List<String> getLyricsDownloadLanguages() {
    return lyricsDownloadLanguages;
  }

  public void setLyricsDownloadLanguages(List<String> lyricsDownloadLanguages) {
    this.lyricsDownloadLanguages = lyricsDownloadLanguages;
  }

  public LibraryOptions disabledSubtitleFetchers(List<String> disabledSubtitleFetchers) {
    this.disabledSubtitleFetchers = disabledSubtitleFetchers;
    return this;
  }

  public LibraryOptions addDisabledSubtitleFetchersItem(String disabledSubtitleFetchersItem) {
    if (this.disabledSubtitleFetchers == null) {
      this.disabledSubtitleFetchers = new ArrayList<String>();
    }
    this.disabledSubtitleFetchers.add(disabledSubtitleFetchersItem);
    return this;
  }

   /**
   * Get disabledSubtitleFetchers
   * @return disabledSubtitleFetchers
  **/
  @Schema(description = "")
  public List<String> getDisabledSubtitleFetchers() {
    return disabledSubtitleFetchers;
  }

  public void setDisabledSubtitleFetchers(List<String> disabledSubtitleFetchers) {
    this.disabledSubtitleFetchers = disabledSubtitleFetchers;
  }

  public LibraryOptions subtitleFetcherOrder(List<String> subtitleFetcherOrder) {
    this.subtitleFetcherOrder = subtitleFetcherOrder;
    return this;
  }

  public LibraryOptions addSubtitleFetcherOrderItem(String subtitleFetcherOrderItem) {
    if (this.subtitleFetcherOrder == null) {
      this.subtitleFetcherOrder = new ArrayList<String>();
    }
    this.subtitleFetcherOrder.add(subtitleFetcherOrderItem);
    return this;
  }

   /**
   * Get subtitleFetcherOrder
   * @return subtitleFetcherOrder
  **/
  @Schema(description = "")
  public List<String> getSubtitleFetcherOrder() {
    return subtitleFetcherOrder;
  }

  public void setSubtitleFetcherOrder(List<String> subtitleFetcherOrder) {
    this.subtitleFetcherOrder = subtitleFetcherOrder;
  }

  public LibraryOptions skipSubtitlesIfEmbeddedSubtitlesPresent(Boolean skipSubtitlesIfEmbeddedSubtitlesPresent) {
    this.skipSubtitlesIfEmbeddedSubtitlesPresent = skipSubtitlesIfEmbeddedSubtitlesPresent;
    return this;
  }

   /**
   * Get skipSubtitlesIfEmbeddedSubtitlesPresent
   * @return skipSubtitlesIfEmbeddedSubtitlesPresent
  **/
  @Schema(description = "")
  public Boolean isSkipSubtitlesIfEmbeddedSubtitlesPresent() {
    return skipSubtitlesIfEmbeddedSubtitlesPresent;
  }

  public void setSkipSubtitlesIfEmbeddedSubtitlesPresent(Boolean skipSubtitlesIfEmbeddedSubtitlesPresent) {
    this.skipSubtitlesIfEmbeddedSubtitlesPresent = skipSubtitlesIfEmbeddedSubtitlesPresent;
  }

  public LibraryOptions skipSubtitlesIfAudioTrackMatches(Boolean skipSubtitlesIfAudioTrackMatches) {
    this.skipSubtitlesIfAudioTrackMatches = skipSubtitlesIfAudioTrackMatches;
    return this;
  }

   /**
   * Get skipSubtitlesIfAudioTrackMatches
   * @return skipSubtitlesIfAudioTrackMatches
  **/
  @Schema(description = "")
  public Boolean isSkipSubtitlesIfAudioTrackMatches() {
    return skipSubtitlesIfAudioTrackMatches;
  }

  public void setSkipSubtitlesIfAudioTrackMatches(Boolean skipSubtitlesIfAudioTrackMatches) {
    this.skipSubtitlesIfAudioTrackMatches = skipSubtitlesIfAudioTrackMatches;
  }

  public LibraryOptions subtitleDownloadLanguages(List<String> subtitleDownloadLanguages) {
    this.subtitleDownloadLanguages = subtitleDownloadLanguages;
    return this;
  }

  public LibraryOptions addSubtitleDownloadLanguagesItem(String subtitleDownloadLanguagesItem) {
    if (this.subtitleDownloadLanguages == null) {
      this.subtitleDownloadLanguages = new ArrayList<String>();
    }
    this.subtitleDownloadLanguages.add(subtitleDownloadLanguagesItem);
    return this;
  }

   /**
   * Get subtitleDownloadLanguages
   * @return subtitleDownloadLanguages
  **/
  @Schema(description = "")
  public List<String> getSubtitleDownloadLanguages() {
    return subtitleDownloadLanguages;
  }

  public void setSubtitleDownloadLanguages(List<String> subtitleDownloadLanguages) {
    this.subtitleDownloadLanguages = subtitleDownloadLanguages;
  }

  public LibraryOptions subtitleDownloadMaxAgeDays(Integer subtitleDownloadMaxAgeDays) {
    this.subtitleDownloadMaxAgeDays = subtitleDownloadMaxAgeDays;
    return this;
  }

   /**
   * Get subtitleDownloadMaxAgeDays
   * @return subtitleDownloadMaxAgeDays
  **/
  @Schema(description = "")
  public Integer getSubtitleDownloadMaxAgeDays() {
    return subtitleDownloadMaxAgeDays;
  }

  public void setSubtitleDownloadMaxAgeDays(Integer subtitleDownloadMaxAgeDays) {
    this.subtitleDownloadMaxAgeDays = subtitleDownloadMaxAgeDays;
  }

  public LibraryOptions requirePerfectSubtitleMatch(Boolean requirePerfectSubtitleMatch) {
    this.requirePerfectSubtitleMatch = requirePerfectSubtitleMatch;
    return this;
  }

   /**
   * Get requirePerfectSubtitleMatch
   * @return requirePerfectSubtitleMatch
  **/
  @Schema(description = "")
  public Boolean isRequirePerfectSubtitleMatch() {
    return requirePerfectSubtitleMatch;
  }

  public void setRequirePerfectSubtitleMatch(Boolean requirePerfectSubtitleMatch) {
    this.requirePerfectSubtitleMatch = requirePerfectSubtitleMatch;
  }

  public LibraryOptions saveSubtitlesWithMedia(Boolean saveSubtitlesWithMedia) {
    this.saveSubtitlesWithMedia = saveSubtitlesWithMedia;
    return this;
  }

   /**
   * Get saveSubtitlesWithMedia
   * @return saveSubtitlesWithMedia
  **/
  @Schema(description = "")
  public Boolean isSaveSubtitlesWithMedia() {
    return saveSubtitlesWithMedia;
  }

  public void setSaveSubtitlesWithMedia(Boolean saveSubtitlesWithMedia) {
    this.saveSubtitlesWithMedia = saveSubtitlesWithMedia;
  }

  public LibraryOptions forcedSubtitlesOnly(Boolean forcedSubtitlesOnly) {
    this.forcedSubtitlesOnly = forcedSubtitlesOnly;
    return this;
  }

   /**
   * Get forcedSubtitlesOnly
   * @return forcedSubtitlesOnly
  **/
  @Schema(description = "")
  public Boolean isForcedSubtitlesOnly() {
    return forcedSubtitlesOnly;
  }

  public void setForcedSubtitlesOnly(Boolean forcedSubtitlesOnly) {
    this.forcedSubtitlesOnly = forcedSubtitlesOnly;
  }

  public LibraryOptions hearingImpairedSubtitlesOnly(Boolean hearingImpairedSubtitlesOnly) {
    this.hearingImpairedSubtitlesOnly = hearingImpairedSubtitlesOnly;
    return this;
  }

   /**
   * Get hearingImpairedSubtitlesOnly
   * @return hearingImpairedSubtitlesOnly
  **/
  @Schema(description = "")
  public Boolean isHearingImpairedSubtitlesOnly() {
    return hearingImpairedSubtitlesOnly;
  }

  public void setHearingImpairedSubtitlesOnly(Boolean hearingImpairedSubtitlesOnly) {
    this.hearingImpairedSubtitlesOnly = hearingImpairedSubtitlesOnly;
  }

  public LibraryOptions typeOptions(List<TypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
    return this;
  }

  public LibraryOptions addTypeOptionsItem(TypeOptions typeOptionsItem) {
    if (this.typeOptions == null) {
      this.typeOptions = new ArrayList<TypeOptions>();
    }
    this.typeOptions.add(typeOptionsItem);
    return this;
  }

   /**
   * Get typeOptions
   * @return typeOptions
  **/
  @Schema(description = "")
  public List<TypeOptions> getTypeOptions() {
    return typeOptions;
  }

  public void setTypeOptions(List<TypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
  }

  public LibraryOptions collapseSingleItemFolders(Boolean collapseSingleItemFolders) {
    this.collapseSingleItemFolders = collapseSingleItemFolders;
    return this;
  }

   /**
   * Get collapseSingleItemFolders
   * @return collapseSingleItemFolders
  **/
  @Schema(description = "")
  public Boolean isCollapseSingleItemFolders() {
    return collapseSingleItemFolders;
  }

  public void setCollapseSingleItemFolders(Boolean collapseSingleItemFolders) {
    this.collapseSingleItemFolders = collapseSingleItemFolders;
  }

  public LibraryOptions enableAdultMetadata(Boolean enableAdultMetadata) {
    this.enableAdultMetadata = enableAdultMetadata;
    return this;
  }

   /**
   * Get enableAdultMetadata
   * @return enableAdultMetadata
  **/
  @Schema(description = "")
  public Boolean isEnableAdultMetadata() {
    return enableAdultMetadata;
  }

  public void setEnableAdultMetadata(Boolean enableAdultMetadata) {
    this.enableAdultMetadata = enableAdultMetadata;
  }

  public LibraryOptions importCollections(Boolean importCollections) {
    this.importCollections = importCollections;
    return this;
  }

   /**
   * Get importCollections
   * @return importCollections
  **/
  @Schema(description = "")
  public Boolean isImportCollections() {
    return importCollections;
  }

  public void setImportCollections(Boolean importCollections) {
    this.importCollections = importCollections;
  }

  public LibraryOptions minCollectionItems(Integer minCollectionItems) {
    this.minCollectionItems = minCollectionItems;
    return this;
  }

   /**
   * Get minCollectionItems
   * @return minCollectionItems
  **/
  @Schema(description = "")
  public Integer getMinCollectionItems() {
    return minCollectionItems;
  }

  public void setMinCollectionItems(Integer minCollectionItems) {
    this.minCollectionItems = minCollectionItems;
  }

  public LibraryOptions musicFolderStructure(String musicFolderStructure) {
    this.musicFolderStructure = musicFolderStructure;
    return this;
  }

   /**
   * Get musicFolderStructure
   * @return musicFolderStructure
  **/
  @Schema(description = "")
  public String getMusicFolderStructure() {
    return musicFolderStructure;
  }

  public void setMusicFolderStructure(String musicFolderStructure) {
    this.musicFolderStructure = musicFolderStructure;
  }

  public LibraryOptions minResumePct(Integer minResumePct) {
    this.minResumePct = minResumePct;
    return this;
  }

   /**
   * The minimum percentage of an item that must be played in order for playstate to be updated.
   * @return minResumePct
  **/
  @Schema(description = "The minimum percentage of an item that must be played in order for playstate to be updated.")
  public Integer getMinResumePct() {
    return minResumePct;
  }

  public void setMinResumePct(Integer minResumePct) {
    this.minResumePct = minResumePct;
  }

  public LibraryOptions maxResumePct(Integer maxResumePct) {
    this.maxResumePct = maxResumePct;
    return this;
  }

   /**
   * The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
   * @return maxResumePct
  **/
  @Schema(description = "The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.")
  public Integer getMaxResumePct() {
    return maxResumePct;
  }

  public void setMaxResumePct(Integer maxResumePct) {
    this.maxResumePct = maxResumePct;
  }

  public LibraryOptions minResumeDurationSeconds(Integer minResumeDurationSeconds) {
    this.minResumeDurationSeconds = minResumeDurationSeconds;
    return this;
  }

   /**
   * The minimum duration that an item must have in order to be eligible for playstate updates..
   * @return minResumeDurationSeconds
  **/
  @Schema(description = "The minimum duration that an item must have in order to be eligible for playstate updates..")
  public Integer getMinResumeDurationSeconds() {
    return minResumeDurationSeconds;
  }

  public void setMinResumeDurationSeconds(Integer minResumeDurationSeconds) {
    this.minResumeDurationSeconds = minResumeDurationSeconds;
  }

  public LibraryOptions thumbnailImagesIntervalSeconds(Integer thumbnailImagesIntervalSeconds) {
    this.thumbnailImagesIntervalSeconds = thumbnailImagesIntervalSeconds;
    return this;
  }

   /**
   * Get thumbnailImagesIntervalSeconds
   * @return thumbnailImagesIntervalSeconds
  **/
  @Schema(description = "")
  public Integer getThumbnailImagesIntervalSeconds() {
    return thumbnailImagesIntervalSeconds;
  }

  public void setThumbnailImagesIntervalSeconds(Integer thumbnailImagesIntervalSeconds) {
    this.thumbnailImagesIntervalSeconds = thumbnailImagesIntervalSeconds;
  }

  public LibraryOptions sampleIgnoreSize(Integer sampleIgnoreSize) {
    this.sampleIgnoreSize = sampleIgnoreSize;
    return this;
  }

   /**
   * Get sampleIgnoreSize
   * @return sampleIgnoreSize
  **/
  @Schema(description = "")
  public Integer getSampleIgnoreSize() {
    return sampleIgnoreSize;
  }

  public void setSampleIgnoreSize(Integer sampleIgnoreSize) {
    this.sampleIgnoreSize = sampleIgnoreSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryOptions libraryOptions = (LibraryOptions) o;
    return Objects.equals(this.enableArchiveMediaFiles, libraryOptions.enableArchiveMediaFiles) &&
        Objects.equals(this.enablePhotos, libraryOptions.enablePhotos) &&
        Objects.equals(this.enableRealtimeMonitor, libraryOptions.enableRealtimeMonitor) &&
        Objects.equals(this.enableMarkerDetection, libraryOptions.enableMarkerDetection) &&
        Objects.equals(this.enableMarkerDetectionDuringLibraryScan, libraryOptions.enableMarkerDetectionDuringLibraryScan) &&
        Objects.equals(this.introDetectionFingerprintLength, libraryOptions.introDetectionFingerprintLength) &&
        Objects.equals(this.enableChapterImageExtraction, libraryOptions.enableChapterImageExtraction) &&
        Objects.equals(this.extractChapterImagesDuringLibraryScan, libraryOptions.extractChapterImagesDuringLibraryScan) &&
        Objects.equals(this.downloadImagesInAdvance, libraryOptions.downloadImagesInAdvance) &&
        Objects.equals(this.cacheImages, libraryOptions.cacheImages) &&
        Objects.equals(this.pathInfos, libraryOptions.pathInfos) &&
        Objects.equals(this.ignoreHiddenFiles, libraryOptions.ignoreHiddenFiles) &&
        Objects.equals(this.ignoreFileExtensions, libraryOptions.ignoreFileExtensions) &&
        Objects.equals(this.saveLocalMetadata, libraryOptions.saveLocalMetadata) &&
        Objects.equals(this.saveMetadataHidden, libraryOptions.saveMetadataHidden) &&
        Objects.equals(this.saveLocalThumbnailSets, libraryOptions.saveLocalThumbnailSets) &&
        Objects.equals(this.importPlaylists, libraryOptions.importPlaylists) &&
        Objects.equals(this.enableAutomaticSeriesGrouping, libraryOptions.enableAutomaticSeriesGrouping) &&
        Objects.equals(this.shareEmbeddedMusicAlbumImages, libraryOptions.shareEmbeddedMusicAlbumImages) &&
        Objects.equals(this.enableEmbeddedTitles, libraryOptions.enableEmbeddedTitles) &&
        Objects.equals(this.enableAudioResume, libraryOptions.enableAudioResume) &&
        Objects.equals(this.autoGenerateChapters, libraryOptions.autoGenerateChapters) &&
        Objects.equals(this.automaticRefreshIntervalDays, libraryOptions.automaticRefreshIntervalDays) &&
        Objects.equals(this.placeholderMetadataRefreshIntervalDays, libraryOptions.placeholderMetadataRefreshIntervalDays) &&
        Objects.equals(this.preferredMetadataLanguage, libraryOptions.preferredMetadataLanguage) &&
        Objects.equals(this.preferredImageLanguage, libraryOptions.preferredImageLanguage) &&
        Objects.equals(this.contentType, libraryOptions.contentType) &&
        Objects.equals(this.metadataCountryCode, libraryOptions.metadataCountryCode) &&
        Objects.equals(this.metadataSavers, libraryOptions.metadataSavers) &&
        Objects.equals(this.disabledLocalMetadataReaders, libraryOptions.disabledLocalMetadataReaders) &&
        Objects.equals(this.localMetadataReaderOrder, libraryOptions.localMetadataReaderOrder) &&
        Objects.equals(this.disabledLyricsFetchers, libraryOptions.disabledLyricsFetchers) &&
        Objects.equals(this.saveLyricsWithMedia, libraryOptions.saveLyricsWithMedia) &&
        Objects.equals(this.lyricsDownloadMaxAgeDays, libraryOptions.lyricsDownloadMaxAgeDays) &&
        Objects.equals(this.lyricsFetcherOrder, libraryOptions.lyricsFetcherOrder) &&
        Objects.equals(this.lyricsDownloadLanguages, libraryOptions.lyricsDownloadLanguages) &&
        Objects.equals(this.disabledSubtitleFetchers, libraryOptions.disabledSubtitleFetchers) &&
        Objects.equals(this.subtitleFetcherOrder, libraryOptions.subtitleFetcherOrder) &&
        Objects.equals(this.skipSubtitlesIfEmbeddedSubtitlesPresent, libraryOptions.skipSubtitlesIfEmbeddedSubtitlesPresent) &&
        Objects.equals(this.skipSubtitlesIfAudioTrackMatches, libraryOptions.skipSubtitlesIfAudioTrackMatches) &&
        Objects.equals(this.subtitleDownloadLanguages, libraryOptions.subtitleDownloadLanguages) &&
        Objects.equals(this.subtitleDownloadMaxAgeDays, libraryOptions.subtitleDownloadMaxAgeDays) &&
        Objects.equals(this.requirePerfectSubtitleMatch, libraryOptions.requirePerfectSubtitleMatch) &&
        Objects.equals(this.saveSubtitlesWithMedia, libraryOptions.saveSubtitlesWithMedia) &&
        Objects.equals(this.forcedSubtitlesOnly, libraryOptions.forcedSubtitlesOnly) &&
        Objects.equals(this.hearingImpairedSubtitlesOnly, libraryOptions.hearingImpairedSubtitlesOnly) &&
        Objects.equals(this.typeOptions, libraryOptions.typeOptions) &&
        Objects.equals(this.collapseSingleItemFolders, libraryOptions.collapseSingleItemFolders) &&
        Objects.equals(this.enableAdultMetadata, libraryOptions.enableAdultMetadata) &&
        Objects.equals(this.importCollections, libraryOptions.importCollections) &&
        Objects.equals(this.minCollectionItems, libraryOptions.minCollectionItems) &&
        Objects.equals(this.musicFolderStructure, libraryOptions.musicFolderStructure) &&
        Objects.equals(this.minResumePct, libraryOptions.minResumePct) &&
        Objects.equals(this.maxResumePct, libraryOptions.maxResumePct) &&
        Objects.equals(this.minResumeDurationSeconds, libraryOptions.minResumeDurationSeconds) &&
        Objects.equals(this.thumbnailImagesIntervalSeconds, libraryOptions.thumbnailImagesIntervalSeconds) &&
        Objects.equals(this.sampleIgnoreSize, libraryOptions.sampleIgnoreSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableArchiveMediaFiles, enablePhotos, enableRealtimeMonitor, enableMarkerDetection, enableMarkerDetectionDuringLibraryScan, introDetectionFingerprintLength, enableChapterImageExtraction, extractChapterImagesDuringLibraryScan, downloadImagesInAdvance, cacheImages, pathInfos, ignoreHiddenFiles, ignoreFileExtensions, saveLocalMetadata, saveMetadataHidden, saveLocalThumbnailSets, importPlaylists, enableAutomaticSeriesGrouping, shareEmbeddedMusicAlbumImages, enableEmbeddedTitles, enableAudioResume, autoGenerateChapters, automaticRefreshIntervalDays, placeholderMetadataRefreshIntervalDays, preferredMetadataLanguage, preferredImageLanguage, contentType, metadataCountryCode, metadataSavers, disabledLocalMetadataReaders, localMetadataReaderOrder, disabledLyricsFetchers, saveLyricsWithMedia, lyricsDownloadMaxAgeDays, lyricsFetcherOrder, lyricsDownloadLanguages, disabledSubtitleFetchers, subtitleFetcherOrder, skipSubtitlesIfEmbeddedSubtitlesPresent, skipSubtitlesIfAudioTrackMatches, subtitleDownloadLanguages, subtitleDownloadMaxAgeDays, requirePerfectSubtitleMatch, saveSubtitlesWithMedia, forcedSubtitlesOnly, hearingImpairedSubtitlesOnly, typeOptions, collapseSingleItemFolders, enableAdultMetadata, importCollections, minCollectionItems, musicFolderStructure, minResumePct, maxResumePct, minResumeDurationSeconds, thumbnailImagesIntervalSeconds, sampleIgnoreSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryOptions {\n");
    
    sb.append("    enableArchiveMediaFiles: ").append(toIndentedString(enableArchiveMediaFiles)).append("\n");
    sb.append("    enablePhotos: ").append(toIndentedString(enablePhotos)).append("\n");
    sb.append("    enableRealtimeMonitor: ").append(toIndentedString(enableRealtimeMonitor)).append("\n");
    sb.append("    enableMarkerDetection: ").append(toIndentedString(enableMarkerDetection)).append("\n");
    sb.append("    enableMarkerDetectionDuringLibraryScan: ").append(toIndentedString(enableMarkerDetectionDuringLibraryScan)).append("\n");
    sb.append("    introDetectionFingerprintLength: ").append(toIndentedString(introDetectionFingerprintLength)).append("\n");
    sb.append("    enableChapterImageExtraction: ").append(toIndentedString(enableChapterImageExtraction)).append("\n");
    sb.append("    extractChapterImagesDuringLibraryScan: ").append(toIndentedString(extractChapterImagesDuringLibraryScan)).append("\n");
    sb.append("    downloadImagesInAdvance: ").append(toIndentedString(downloadImagesInAdvance)).append("\n");
    sb.append("    cacheImages: ").append(toIndentedString(cacheImages)).append("\n");
    sb.append("    pathInfos: ").append(toIndentedString(pathInfos)).append("\n");
    sb.append("    ignoreHiddenFiles: ").append(toIndentedString(ignoreHiddenFiles)).append("\n");
    sb.append("    ignoreFileExtensions: ").append(toIndentedString(ignoreFileExtensions)).append("\n");
    sb.append("    saveLocalMetadata: ").append(toIndentedString(saveLocalMetadata)).append("\n");
    sb.append("    saveMetadataHidden: ").append(toIndentedString(saveMetadataHidden)).append("\n");
    sb.append("    saveLocalThumbnailSets: ").append(toIndentedString(saveLocalThumbnailSets)).append("\n");
    sb.append("    importPlaylists: ").append(toIndentedString(importPlaylists)).append("\n");
    sb.append("    enableAutomaticSeriesGrouping: ").append(toIndentedString(enableAutomaticSeriesGrouping)).append("\n");
    sb.append("    shareEmbeddedMusicAlbumImages: ").append(toIndentedString(shareEmbeddedMusicAlbumImages)).append("\n");
    sb.append("    enableEmbeddedTitles: ").append(toIndentedString(enableEmbeddedTitles)).append("\n");
    sb.append("    enableAudioResume: ").append(toIndentedString(enableAudioResume)).append("\n");
    sb.append("    autoGenerateChapters: ").append(toIndentedString(autoGenerateChapters)).append("\n");
    sb.append("    automaticRefreshIntervalDays: ").append(toIndentedString(automaticRefreshIntervalDays)).append("\n");
    sb.append("    placeholderMetadataRefreshIntervalDays: ").append(toIndentedString(placeholderMetadataRefreshIntervalDays)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    preferredImageLanguage: ").append(toIndentedString(preferredImageLanguage)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    metadataSavers: ").append(toIndentedString(metadataSavers)).append("\n");
    sb.append("    disabledLocalMetadataReaders: ").append(toIndentedString(disabledLocalMetadataReaders)).append("\n");
    sb.append("    localMetadataReaderOrder: ").append(toIndentedString(localMetadataReaderOrder)).append("\n");
    sb.append("    disabledLyricsFetchers: ").append(toIndentedString(disabledLyricsFetchers)).append("\n");
    sb.append("    saveLyricsWithMedia: ").append(toIndentedString(saveLyricsWithMedia)).append("\n");
    sb.append("    lyricsDownloadMaxAgeDays: ").append(toIndentedString(lyricsDownloadMaxAgeDays)).append("\n");
    sb.append("    lyricsFetcherOrder: ").append(toIndentedString(lyricsFetcherOrder)).append("\n");
    sb.append("    lyricsDownloadLanguages: ").append(toIndentedString(lyricsDownloadLanguages)).append("\n");
    sb.append("    disabledSubtitleFetchers: ").append(toIndentedString(disabledSubtitleFetchers)).append("\n");
    sb.append("    subtitleFetcherOrder: ").append(toIndentedString(subtitleFetcherOrder)).append("\n");
    sb.append("    skipSubtitlesIfEmbeddedSubtitlesPresent: ").append(toIndentedString(skipSubtitlesIfEmbeddedSubtitlesPresent)).append("\n");
    sb.append("    skipSubtitlesIfAudioTrackMatches: ").append(toIndentedString(skipSubtitlesIfAudioTrackMatches)).append("\n");
    sb.append("    subtitleDownloadLanguages: ").append(toIndentedString(subtitleDownloadLanguages)).append("\n");
    sb.append("    subtitleDownloadMaxAgeDays: ").append(toIndentedString(subtitleDownloadMaxAgeDays)).append("\n");
    sb.append("    requirePerfectSubtitleMatch: ").append(toIndentedString(requirePerfectSubtitleMatch)).append("\n");
    sb.append("    saveSubtitlesWithMedia: ").append(toIndentedString(saveSubtitlesWithMedia)).append("\n");
    sb.append("    forcedSubtitlesOnly: ").append(toIndentedString(forcedSubtitlesOnly)).append("\n");
    sb.append("    hearingImpairedSubtitlesOnly: ").append(toIndentedString(hearingImpairedSubtitlesOnly)).append("\n");
    sb.append("    typeOptions: ").append(toIndentedString(typeOptions)).append("\n");
    sb.append("    collapseSingleItemFolders: ").append(toIndentedString(collapseSingleItemFolders)).append("\n");
    sb.append("    enableAdultMetadata: ").append(toIndentedString(enableAdultMetadata)).append("\n");
    sb.append("    importCollections: ").append(toIndentedString(importCollections)).append("\n");
    sb.append("    minCollectionItems: ").append(toIndentedString(minCollectionItems)).append("\n");
    sb.append("    musicFolderStructure: ").append(toIndentedString(musicFolderStructure)).append("\n");
    sb.append("    minResumePct: ").append(toIndentedString(minResumePct)).append("\n");
    sb.append("    maxResumePct: ").append(toIndentedString(maxResumePct)).append("\n");
    sb.append("    minResumeDurationSeconds: ").append(toIndentedString(minResumeDurationSeconds)).append("\n");
    sb.append("    thumbnailImagesIntervalSeconds: ").append(toIndentedString(thumbnailImagesIntervalSeconds)).append("\n");
    sb.append("    sampleIgnoreSize: ").append(toIndentedString(sampleIgnoreSize)).append("\n");
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
