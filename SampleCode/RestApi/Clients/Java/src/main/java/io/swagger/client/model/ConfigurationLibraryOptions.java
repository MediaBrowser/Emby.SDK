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
import io.swagger.client.model.ConfigurationMediaPathInfo;
import io.swagger.client.model.ConfigurationTypeOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConfigurationLibraryOptions
 */


public class ConfigurationLibraryOptions {
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

  @SerializedName("PathInfos")
  private List<ConfigurationMediaPathInfo> pathInfos = null;

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

  @SerializedName("ImportMissingEpisodes")
  private Boolean importMissingEpisodes = null;

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

  @SerializedName("Name")
  private String name = null;

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
  private List<ConfigurationTypeOptions> typeOptions = null;

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

  public ConfigurationLibraryOptions enableArchiveMediaFiles(Boolean enableArchiveMediaFiles) {
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

  public ConfigurationLibraryOptions enablePhotos(Boolean enablePhotos) {
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

  public ConfigurationLibraryOptions enableRealtimeMonitor(Boolean enableRealtimeMonitor) {
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

  public ConfigurationLibraryOptions enableMarkerDetection(Boolean enableMarkerDetection) {
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

  public ConfigurationLibraryOptions enableMarkerDetectionDuringLibraryScan(Boolean enableMarkerDetectionDuringLibraryScan) {
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

  public ConfigurationLibraryOptions introDetectionFingerprintLength(Integer introDetectionFingerprintLength) {
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

  public ConfigurationLibraryOptions enableChapterImageExtraction(Boolean enableChapterImageExtraction) {
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

  public ConfigurationLibraryOptions extractChapterImagesDuringLibraryScan(Boolean extractChapterImagesDuringLibraryScan) {
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

  public ConfigurationLibraryOptions downloadImagesInAdvance(Boolean downloadImagesInAdvance) {
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

  public ConfigurationLibraryOptions pathInfos(List<ConfigurationMediaPathInfo> pathInfos) {
    this.pathInfos = pathInfos;
    return this;
  }

  public ConfigurationLibraryOptions addPathInfosItem(ConfigurationMediaPathInfo pathInfosItem) {
    if (this.pathInfos == null) {
      this.pathInfos = new ArrayList<ConfigurationMediaPathInfo>();
    }
    this.pathInfos.add(pathInfosItem);
    return this;
  }

   /**
   * Get pathInfos
   * @return pathInfos
  **/
  @Schema(description = "")
  public List<ConfigurationMediaPathInfo> getPathInfos() {
    return pathInfos;
  }

  public void setPathInfos(List<ConfigurationMediaPathInfo> pathInfos) {
    this.pathInfos = pathInfos;
  }

  public ConfigurationLibraryOptions ignoreHiddenFiles(Boolean ignoreHiddenFiles) {
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

  public ConfigurationLibraryOptions ignoreFileExtensions(List<String> ignoreFileExtensions) {
    this.ignoreFileExtensions = ignoreFileExtensions;
    return this;
  }

  public ConfigurationLibraryOptions addIgnoreFileExtensionsItem(String ignoreFileExtensionsItem) {
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

  public ConfigurationLibraryOptions saveLocalMetadata(Boolean saveLocalMetadata) {
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

  public ConfigurationLibraryOptions saveMetadataHidden(Boolean saveMetadataHidden) {
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

  public ConfigurationLibraryOptions saveLocalThumbnailSets(Boolean saveLocalThumbnailSets) {
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

  public ConfigurationLibraryOptions importMissingEpisodes(Boolean importMissingEpisodes) {
    this.importMissingEpisodes = importMissingEpisodes;
    return this;
  }

   /**
   * Get importMissingEpisodes
   * @return importMissingEpisodes
  **/
  @Schema(description = "")
  public Boolean isImportMissingEpisodes() {
    return importMissingEpisodes;
  }

  public void setImportMissingEpisodes(Boolean importMissingEpisodes) {
    this.importMissingEpisodes = importMissingEpisodes;
  }

  public ConfigurationLibraryOptions importPlaylists(Boolean importPlaylists) {
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

  public ConfigurationLibraryOptions enableAutomaticSeriesGrouping(Boolean enableAutomaticSeriesGrouping) {
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

  public ConfigurationLibraryOptions shareEmbeddedMusicAlbumImages(Boolean shareEmbeddedMusicAlbumImages) {
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

  public ConfigurationLibraryOptions enableEmbeddedTitles(Boolean enableEmbeddedTitles) {
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

  public ConfigurationLibraryOptions enableAudioResume(Boolean enableAudioResume) {
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

  public ConfigurationLibraryOptions automaticRefreshIntervalDays(Integer automaticRefreshIntervalDays) {
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

  public ConfigurationLibraryOptions placeholderMetadataRefreshIntervalDays(Integer placeholderMetadataRefreshIntervalDays) {
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

  public ConfigurationLibraryOptions preferredMetadataLanguage(String preferredMetadataLanguage) {
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

  public ConfigurationLibraryOptions preferredImageLanguage(String preferredImageLanguage) {
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

  public ConfigurationLibraryOptions contentType(String contentType) {
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

  public ConfigurationLibraryOptions metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
    return this;
  }

   /**
   * Get metadataCountryCode
   * @return metadataCountryCode
  **/
  @Schema(description = "")
  public String getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public ConfigurationLibraryOptions name(String name) {
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

  public ConfigurationLibraryOptions metadataSavers(List<String> metadataSavers) {
    this.metadataSavers = metadataSavers;
    return this;
  }

  public ConfigurationLibraryOptions addMetadataSaversItem(String metadataSaversItem) {
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

  public ConfigurationLibraryOptions disabledLocalMetadataReaders(List<String> disabledLocalMetadataReaders) {
    this.disabledLocalMetadataReaders = disabledLocalMetadataReaders;
    return this;
  }

  public ConfigurationLibraryOptions addDisabledLocalMetadataReadersItem(String disabledLocalMetadataReadersItem) {
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

  public ConfigurationLibraryOptions localMetadataReaderOrder(List<String> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = localMetadataReaderOrder;
    return this;
  }

  public ConfigurationLibraryOptions addLocalMetadataReaderOrderItem(String localMetadataReaderOrderItem) {
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

  public ConfigurationLibraryOptions disabledLyricsFetchers(List<String> disabledLyricsFetchers) {
    this.disabledLyricsFetchers = disabledLyricsFetchers;
    return this;
  }

  public ConfigurationLibraryOptions addDisabledLyricsFetchersItem(String disabledLyricsFetchersItem) {
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

  public ConfigurationLibraryOptions saveLyricsWithMedia(Boolean saveLyricsWithMedia) {
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

  public ConfigurationLibraryOptions lyricsDownloadMaxAgeDays(Integer lyricsDownloadMaxAgeDays) {
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

  public ConfigurationLibraryOptions lyricsFetcherOrder(List<String> lyricsFetcherOrder) {
    this.lyricsFetcherOrder = lyricsFetcherOrder;
    return this;
  }

  public ConfigurationLibraryOptions addLyricsFetcherOrderItem(String lyricsFetcherOrderItem) {
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

  public ConfigurationLibraryOptions lyricsDownloadLanguages(List<String> lyricsDownloadLanguages) {
    this.lyricsDownloadLanguages = lyricsDownloadLanguages;
    return this;
  }

  public ConfigurationLibraryOptions addLyricsDownloadLanguagesItem(String lyricsDownloadLanguagesItem) {
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

  public ConfigurationLibraryOptions disabledSubtitleFetchers(List<String> disabledSubtitleFetchers) {
    this.disabledSubtitleFetchers = disabledSubtitleFetchers;
    return this;
  }

  public ConfigurationLibraryOptions addDisabledSubtitleFetchersItem(String disabledSubtitleFetchersItem) {
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

  public ConfigurationLibraryOptions subtitleFetcherOrder(List<String> subtitleFetcherOrder) {
    this.subtitleFetcherOrder = subtitleFetcherOrder;
    return this;
  }

  public ConfigurationLibraryOptions addSubtitleFetcherOrderItem(String subtitleFetcherOrderItem) {
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

  public ConfigurationLibraryOptions skipSubtitlesIfEmbeddedSubtitlesPresent(Boolean skipSubtitlesIfEmbeddedSubtitlesPresent) {
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

  public ConfigurationLibraryOptions skipSubtitlesIfAudioTrackMatches(Boolean skipSubtitlesIfAudioTrackMatches) {
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

  public ConfigurationLibraryOptions subtitleDownloadLanguages(List<String> subtitleDownloadLanguages) {
    this.subtitleDownloadLanguages = subtitleDownloadLanguages;
    return this;
  }

  public ConfigurationLibraryOptions addSubtitleDownloadLanguagesItem(String subtitleDownloadLanguagesItem) {
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

  public ConfigurationLibraryOptions subtitleDownloadMaxAgeDays(Integer subtitleDownloadMaxAgeDays) {
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

  public ConfigurationLibraryOptions requirePerfectSubtitleMatch(Boolean requirePerfectSubtitleMatch) {
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

  public ConfigurationLibraryOptions saveSubtitlesWithMedia(Boolean saveSubtitlesWithMedia) {
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

  public ConfigurationLibraryOptions forcedSubtitlesOnly(Boolean forcedSubtitlesOnly) {
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

  public ConfigurationLibraryOptions hearingImpairedSubtitlesOnly(Boolean hearingImpairedSubtitlesOnly) {
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

  public ConfigurationLibraryOptions typeOptions(List<ConfigurationTypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
    return this;
  }

  public ConfigurationLibraryOptions addTypeOptionsItem(ConfigurationTypeOptions typeOptionsItem) {
    if (this.typeOptions == null) {
      this.typeOptions = new ArrayList<ConfigurationTypeOptions>();
    }
    this.typeOptions.add(typeOptionsItem);
    return this;
  }

   /**
   * Get typeOptions
   * @return typeOptions
  **/
  @Schema(description = "")
  public List<ConfigurationTypeOptions> getTypeOptions() {
    return typeOptions;
  }

  public void setTypeOptions(List<ConfigurationTypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
  }

  public ConfigurationLibraryOptions collapseSingleItemFolders(Boolean collapseSingleItemFolders) {
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

  public ConfigurationLibraryOptions enableAdultMetadata(Boolean enableAdultMetadata) {
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

  public ConfigurationLibraryOptions importCollections(Boolean importCollections) {
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

  public ConfigurationLibraryOptions minCollectionItems(Integer minCollectionItems) {
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

  public ConfigurationLibraryOptions musicFolderStructure(String musicFolderStructure) {
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

  public ConfigurationLibraryOptions minResumePct(Integer minResumePct) {
    this.minResumePct = minResumePct;
    return this;
  }

   /**
   * Get minResumePct
   * @return minResumePct
  **/
  @Schema(description = "")
  public Integer getMinResumePct() {
    return minResumePct;
  }

  public void setMinResumePct(Integer minResumePct) {
    this.minResumePct = minResumePct;
  }

  public ConfigurationLibraryOptions maxResumePct(Integer maxResumePct) {
    this.maxResumePct = maxResumePct;
    return this;
  }

   /**
   * Get maxResumePct
   * @return maxResumePct
  **/
  @Schema(description = "")
  public Integer getMaxResumePct() {
    return maxResumePct;
  }

  public void setMaxResumePct(Integer maxResumePct) {
    this.maxResumePct = maxResumePct;
  }

  public ConfigurationLibraryOptions minResumeDurationSeconds(Integer minResumeDurationSeconds) {
    this.minResumeDurationSeconds = minResumeDurationSeconds;
    return this;
  }

   /**
   * Get minResumeDurationSeconds
   * @return minResumeDurationSeconds
  **/
  @Schema(description = "")
  public Integer getMinResumeDurationSeconds() {
    return minResumeDurationSeconds;
  }

  public void setMinResumeDurationSeconds(Integer minResumeDurationSeconds) {
    this.minResumeDurationSeconds = minResumeDurationSeconds;
  }

  public ConfigurationLibraryOptions thumbnailImagesIntervalSeconds(Integer thumbnailImagesIntervalSeconds) {
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

  public ConfigurationLibraryOptions sampleIgnoreSize(Integer sampleIgnoreSize) {
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
    ConfigurationLibraryOptions configurationLibraryOptions = (ConfigurationLibraryOptions) o;
    return Objects.equals(this.enableArchiveMediaFiles, configurationLibraryOptions.enableArchiveMediaFiles) &&
        Objects.equals(this.enablePhotos, configurationLibraryOptions.enablePhotos) &&
        Objects.equals(this.enableRealtimeMonitor, configurationLibraryOptions.enableRealtimeMonitor) &&
        Objects.equals(this.enableMarkerDetection, configurationLibraryOptions.enableMarkerDetection) &&
        Objects.equals(this.enableMarkerDetectionDuringLibraryScan, configurationLibraryOptions.enableMarkerDetectionDuringLibraryScan) &&
        Objects.equals(this.introDetectionFingerprintLength, configurationLibraryOptions.introDetectionFingerprintLength) &&
        Objects.equals(this.enableChapterImageExtraction, configurationLibraryOptions.enableChapterImageExtraction) &&
        Objects.equals(this.extractChapterImagesDuringLibraryScan, configurationLibraryOptions.extractChapterImagesDuringLibraryScan) &&
        Objects.equals(this.downloadImagesInAdvance, configurationLibraryOptions.downloadImagesInAdvance) &&
        Objects.equals(this.pathInfos, configurationLibraryOptions.pathInfos) &&
        Objects.equals(this.ignoreHiddenFiles, configurationLibraryOptions.ignoreHiddenFiles) &&
        Objects.equals(this.ignoreFileExtensions, configurationLibraryOptions.ignoreFileExtensions) &&
        Objects.equals(this.saveLocalMetadata, configurationLibraryOptions.saveLocalMetadata) &&
        Objects.equals(this.saveMetadataHidden, configurationLibraryOptions.saveMetadataHidden) &&
        Objects.equals(this.saveLocalThumbnailSets, configurationLibraryOptions.saveLocalThumbnailSets) &&
        Objects.equals(this.importMissingEpisodes, configurationLibraryOptions.importMissingEpisodes) &&
        Objects.equals(this.importPlaylists, configurationLibraryOptions.importPlaylists) &&
        Objects.equals(this.enableAutomaticSeriesGrouping, configurationLibraryOptions.enableAutomaticSeriesGrouping) &&
        Objects.equals(this.shareEmbeddedMusicAlbumImages, configurationLibraryOptions.shareEmbeddedMusicAlbumImages) &&
        Objects.equals(this.enableEmbeddedTitles, configurationLibraryOptions.enableEmbeddedTitles) &&
        Objects.equals(this.enableAudioResume, configurationLibraryOptions.enableAudioResume) &&
        Objects.equals(this.automaticRefreshIntervalDays, configurationLibraryOptions.automaticRefreshIntervalDays) &&
        Objects.equals(this.placeholderMetadataRefreshIntervalDays, configurationLibraryOptions.placeholderMetadataRefreshIntervalDays) &&
        Objects.equals(this.preferredMetadataLanguage, configurationLibraryOptions.preferredMetadataLanguage) &&
        Objects.equals(this.preferredImageLanguage, configurationLibraryOptions.preferredImageLanguage) &&
        Objects.equals(this.contentType, configurationLibraryOptions.contentType) &&
        Objects.equals(this.metadataCountryCode, configurationLibraryOptions.metadataCountryCode) &&
        Objects.equals(this.name, configurationLibraryOptions.name) &&
        Objects.equals(this.metadataSavers, configurationLibraryOptions.metadataSavers) &&
        Objects.equals(this.disabledLocalMetadataReaders, configurationLibraryOptions.disabledLocalMetadataReaders) &&
        Objects.equals(this.localMetadataReaderOrder, configurationLibraryOptions.localMetadataReaderOrder) &&
        Objects.equals(this.disabledLyricsFetchers, configurationLibraryOptions.disabledLyricsFetchers) &&
        Objects.equals(this.saveLyricsWithMedia, configurationLibraryOptions.saveLyricsWithMedia) &&
        Objects.equals(this.lyricsDownloadMaxAgeDays, configurationLibraryOptions.lyricsDownloadMaxAgeDays) &&
        Objects.equals(this.lyricsFetcherOrder, configurationLibraryOptions.lyricsFetcherOrder) &&
        Objects.equals(this.lyricsDownloadLanguages, configurationLibraryOptions.lyricsDownloadLanguages) &&
        Objects.equals(this.disabledSubtitleFetchers, configurationLibraryOptions.disabledSubtitleFetchers) &&
        Objects.equals(this.subtitleFetcherOrder, configurationLibraryOptions.subtitleFetcherOrder) &&
        Objects.equals(this.skipSubtitlesIfEmbeddedSubtitlesPresent, configurationLibraryOptions.skipSubtitlesIfEmbeddedSubtitlesPresent) &&
        Objects.equals(this.skipSubtitlesIfAudioTrackMatches, configurationLibraryOptions.skipSubtitlesIfAudioTrackMatches) &&
        Objects.equals(this.subtitleDownloadLanguages, configurationLibraryOptions.subtitleDownloadLanguages) &&
        Objects.equals(this.subtitleDownloadMaxAgeDays, configurationLibraryOptions.subtitleDownloadMaxAgeDays) &&
        Objects.equals(this.requirePerfectSubtitleMatch, configurationLibraryOptions.requirePerfectSubtitleMatch) &&
        Objects.equals(this.saveSubtitlesWithMedia, configurationLibraryOptions.saveSubtitlesWithMedia) &&
        Objects.equals(this.forcedSubtitlesOnly, configurationLibraryOptions.forcedSubtitlesOnly) &&
        Objects.equals(this.hearingImpairedSubtitlesOnly, configurationLibraryOptions.hearingImpairedSubtitlesOnly) &&
        Objects.equals(this.typeOptions, configurationLibraryOptions.typeOptions) &&
        Objects.equals(this.collapseSingleItemFolders, configurationLibraryOptions.collapseSingleItemFolders) &&
        Objects.equals(this.enableAdultMetadata, configurationLibraryOptions.enableAdultMetadata) &&
        Objects.equals(this.importCollections, configurationLibraryOptions.importCollections) &&
        Objects.equals(this.minCollectionItems, configurationLibraryOptions.minCollectionItems) &&
        Objects.equals(this.musicFolderStructure, configurationLibraryOptions.musicFolderStructure) &&
        Objects.equals(this.minResumePct, configurationLibraryOptions.minResumePct) &&
        Objects.equals(this.maxResumePct, configurationLibraryOptions.maxResumePct) &&
        Objects.equals(this.minResumeDurationSeconds, configurationLibraryOptions.minResumeDurationSeconds) &&
        Objects.equals(this.thumbnailImagesIntervalSeconds, configurationLibraryOptions.thumbnailImagesIntervalSeconds) &&
        Objects.equals(this.sampleIgnoreSize, configurationLibraryOptions.sampleIgnoreSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableArchiveMediaFiles, enablePhotos, enableRealtimeMonitor, enableMarkerDetection, enableMarkerDetectionDuringLibraryScan, introDetectionFingerprintLength, enableChapterImageExtraction, extractChapterImagesDuringLibraryScan, downloadImagesInAdvance, pathInfos, ignoreHiddenFiles, ignoreFileExtensions, saveLocalMetadata, saveMetadataHidden, saveLocalThumbnailSets, importMissingEpisodes, importPlaylists, enableAutomaticSeriesGrouping, shareEmbeddedMusicAlbumImages, enableEmbeddedTitles, enableAudioResume, automaticRefreshIntervalDays, placeholderMetadataRefreshIntervalDays, preferredMetadataLanguage, preferredImageLanguage, contentType, metadataCountryCode, name, metadataSavers, disabledLocalMetadataReaders, localMetadataReaderOrder, disabledLyricsFetchers, saveLyricsWithMedia, lyricsDownloadMaxAgeDays, lyricsFetcherOrder, lyricsDownloadLanguages, disabledSubtitleFetchers, subtitleFetcherOrder, skipSubtitlesIfEmbeddedSubtitlesPresent, skipSubtitlesIfAudioTrackMatches, subtitleDownloadLanguages, subtitleDownloadMaxAgeDays, requirePerfectSubtitleMatch, saveSubtitlesWithMedia, forcedSubtitlesOnly, hearingImpairedSubtitlesOnly, typeOptions, collapseSingleItemFolders, enableAdultMetadata, importCollections, minCollectionItems, musicFolderStructure, minResumePct, maxResumePct, minResumeDurationSeconds, thumbnailImagesIntervalSeconds, sampleIgnoreSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationLibraryOptions {\n");
    
    sb.append("    enableArchiveMediaFiles: ").append(toIndentedString(enableArchiveMediaFiles)).append("\n");
    sb.append("    enablePhotos: ").append(toIndentedString(enablePhotos)).append("\n");
    sb.append("    enableRealtimeMonitor: ").append(toIndentedString(enableRealtimeMonitor)).append("\n");
    sb.append("    enableMarkerDetection: ").append(toIndentedString(enableMarkerDetection)).append("\n");
    sb.append("    enableMarkerDetectionDuringLibraryScan: ").append(toIndentedString(enableMarkerDetectionDuringLibraryScan)).append("\n");
    sb.append("    introDetectionFingerprintLength: ").append(toIndentedString(introDetectionFingerprintLength)).append("\n");
    sb.append("    enableChapterImageExtraction: ").append(toIndentedString(enableChapterImageExtraction)).append("\n");
    sb.append("    extractChapterImagesDuringLibraryScan: ").append(toIndentedString(extractChapterImagesDuringLibraryScan)).append("\n");
    sb.append("    downloadImagesInAdvance: ").append(toIndentedString(downloadImagesInAdvance)).append("\n");
    sb.append("    pathInfos: ").append(toIndentedString(pathInfos)).append("\n");
    sb.append("    ignoreHiddenFiles: ").append(toIndentedString(ignoreHiddenFiles)).append("\n");
    sb.append("    ignoreFileExtensions: ").append(toIndentedString(ignoreFileExtensions)).append("\n");
    sb.append("    saveLocalMetadata: ").append(toIndentedString(saveLocalMetadata)).append("\n");
    sb.append("    saveMetadataHidden: ").append(toIndentedString(saveMetadataHidden)).append("\n");
    sb.append("    saveLocalThumbnailSets: ").append(toIndentedString(saveLocalThumbnailSets)).append("\n");
    sb.append("    importMissingEpisodes: ").append(toIndentedString(importMissingEpisodes)).append("\n");
    sb.append("    importPlaylists: ").append(toIndentedString(importPlaylists)).append("\n");
    sb.append("    enableAutomaticSeriesGrouping: ").append(toIndentedString(enableAutomaticSeriesGrouping)).append("\n");
    sb.append("    shareEmbeddedMusicAlbumImages: ").append(toIndentedString(shareEmbeddedMusicAlbumImages)).append("\n");
    sb.append("    enableEmbeddedTitles: ").append(toIndentedString(enableEmbeddedTitles)).append("\n");
    sb.append("    enableAudioResume: ").append(toIndentedString(enableAudioResume)).append("\n");
    sb.append("    automaticRefreshIntervalDays: ").append(toIndentedString(automaticRefreshIntervalDays)).append("\n");
    sb.append("    placeholderMetadataRefreshIntervalDays: ").append(toIndentedString(placeholderMetadataRefreshIntervalDays)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    preferredImageLanguage: ").append(toIndentedString(preferredImageLanguage)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
