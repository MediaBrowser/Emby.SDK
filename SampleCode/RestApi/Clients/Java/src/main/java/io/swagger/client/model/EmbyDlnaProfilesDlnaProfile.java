/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DlnaCodecProfile;
import io.swagger.client.model.DlnaContainerProfile;
import io.swagger.client.model.DlnaDirectPlayProfile;
import io.swagger.client.model.DlnaResponseProfile;
import io.swagger.client.model.DlnaSubtitleProfile;
import io.swagger.client.model.DlnaTranscodingProfile;
import io.swagger.client.model.EmbyDlnaProfilesDeviceIdentification;
import io.swagger.client.model.EmbyDlnaProfilesDeviceProfileType;
import io.swagger.client.model.EmbyDlnaProfilesProtocolInfoDetection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyDlnaProfilesDlnaProfile
 */


public class EmbyDlnaProfilesDlnaProfile {
  @SerializedName("Type")
  private EmbyDlnaProfilesDeviceProfileType type = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("AlbumArtPn")
  private String albumArtPn = null;

  @SerializedName("MaxAlbumArtWidth")
  private Integer maxAlbumArtWidth = null;

  @SerializedName("MaxAlbumArtHeight")
  private Integer maxAlbumArtHeight = null;

  @SerializedName("MaxIconWidth")
  private Integer maxIconWidth = null;

  @SerializedName("MaxIconHeight")
  private Integer maxIconHeight = null;

  @SerializedName("FriendlyName")
  private String friendlyName = null;

  @SerializedName("Manufacturer")
  private String manufacturer = null;

  @SerializedName("ManufacturerUrl")
  private String manufacturerUrl = null;

  @SerializedName("ModelName")
  private String modelName = null;

  @SerializedName("ModelDescription")
  private String modelDescription = null;

  @SerializedName("ModelNumber")
  private String modelNumber = null;

  @SerializedName("ModelUrl")
  private String modelUrl = null;

  @SerializedName("SerialNumber")
  private String serialNumber = null;

  @SerializedName("EnableAlbumArtInDidl")
  private Boolean enableAlbumArtInDidl = null;

  @SerializedName("EnableSingleAlbumArtLimit")
  private Boolean enableSingleAlbumArtLimit = null;

  @SerializedName("EnableSingleSubtitleLimit")
  private Boolean enableSingleSubtitleLimit = null;

  @SerializedName("ProtocolInfo")
  private String protocolInfo = null;

  @SerializedName("TimelineOffsetSeconds")
  private Integer timelineOffsetSeconds = null;

  @SerializedName("RequiresPlainVideoItems")
  private Boolean requiresPlainVideoItems = null;

  @SerializedName("RequiresPlainFolders")
  private Boolean requiresPlainFolders = null;

  @SerializedName("IgnoreTranscodeByteRangeRequests")
  private Boolean ignoreTranscodeByteRangeRequests = null;

  @SerializedName("SupportsSamsungBookmark")
  private Boolean supportsSamsungBookmark = null;

  @SerializedName("Identification")
  private EmbyDlnaProfilesDeviceIdentification identification = null;

  @SerializedName("ProtocolInfoDetection")
  private EmbyDlnaProfilesProtocolInfoDetection protocolInfoDetection = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("SupportedMediaTypes")
  private String supportedMediaTypes = null;

  @SerializedName("MaxStreamingBitrate")
  private Long maxStreamingBitrate = null;

  @SerializedName("MusicStreamingTranscodingBitrate")
  private Integer musicStreamingTranscodingBitrate = null;

  @SerializedName("MaxStaticMusicBitrate")
  private Integer maxStaticMusicBitrate = null;

  @SerializedName("DirectPlayProfiles")
  private List<DlnaDirectPlayProfile> directPlayProfiles = null;

  @SerializedName("TranscodingProfiles")
  private List<DlnaTranscodingProfile> transcodingProfiles = null;

  @SerializedName("ContainerProfiles")
  private List<DlnaContainerProfile> containerProfiles = null;

  @SerializedName("CodecProfiles")
  private List<DlnaCodecProfile> codecProfiles = null;

  @SerializedName("ResponseProfiles")
  private List<DlnaResponseProfile> responseProfiles = null;

  @SerializedName("SubtitleProfiles")
  private List<DlnaSubtitleProfile> subtitleProfiles = null;

  public EmbyDlnaProfilesDlnaProfile type(EmbyDlnaProfilesDeviceProfileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public EmbyDlnaProfilesDeviceProfileType getType() {
    return type;
  }

  public void setType(EmbyDlnaProfilesDeviceProfileType type) {
    this.type = type;
  }

  public EmbyDlnaProfilesDlnaProfile path(String path) {
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

  public EmbyDlnaProfilesDlnaProfile userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EmbyDlnaProfilesDlnaProfile albumArtPn(String albumArtPn) {
    this.albumArtPn = albumArtPn;
    return this;
  }

   /**
   * Get albumArtPn
   * @return albumArtPn
  **/
  @Schema(description = "")
  public String getAlbumArtPn() {
    return albumArtPn;
  }

  public void setAlbumArtPn(String albumArtPn) {
    this.albumArtPn = albumArtPn;
  }

  public EmbyDlnaProfilesDlnaProfile maxAlbumArtWidth(Integer maxAlbumArtWidth) {
    this.maxAlbumArtWidth = maxAlbumArtWidth;
    return this;
  }

   /**
   * Get maxAlbumArtWidth
   * @return maxAlbumArtWidth
  **/
  @Schema(description = "")
  public Integer getMaxAlbumArtWidth() {
    return maxAlbumArtWidth;
  }

  public void setMaxAlbumArtWidth(Integer maxAlbumArtWidth) {
    this.maxAlbumArtWidth = maxAlbumArtWidth;
  }

  public EmbyDlnaProfilesDlnaProfile maxAlbumArtHeight(Integer maxAlbumArtHeight) {
    this.maxAlbumArtHeight = maxAlbumArtHeight;
    return this;
  }

   /**
   * Get maxAlbumArtHeight
   * @return maxAlbumArtHeight
  **/
  @Schema(description = "")
  public Integer getMaxAlbumArtHeight() {
    return maxAlbumArtHeight;
  }

  public void setMaxAlbumArtHeight(Integer maxAlbumArtHeight) {
    this.maxAlbumArtHeight = maxAlbumArtHeight;
  }

  public EmbyDlnaProfilesDlnaProfile maxIconWidth(Integer maxIconWidth) {
    this.maxIconWidth = maxIconWidth;
    return this;
  }

   /**
   * Get maxIconWidth
   * @return maxIconWidth
  **/
  @Schema(description = "")
  public Integer getMaxIconWidth() {
    return maxIconWidth;
  }

  public void setMaxIconWidth(Integer maxIconWidth) {
    this.maxIconWidth = maxIconWidth;
  }

  public EmbyDlnaProfilesDlnaProfile maxIconHeight(Integer maxIconHeight) {
    this.maxIconHeight = maxIconHeight;
    return this;
  }

   /**
   * Get maxIconHeight
   * @return maxIconHeight
  **/
  @Schema(description = "")
  public Integer getMaxIconHeight() {
    return maxIconHeight;
  }

  public void setMaxIconHeight(Integer maxIconHeight) {
    this.maxIconHeight = maxIconHeight;
  }

  public EmbyDlnaProfilesDlnaProfile friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Get friendlyName
   * @return friendlyName
  **/
  @Schema(description = "")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public EmbyDlnaProfilesDlnaProfile manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @Schema(description = "")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public EmbyDlnaProfilesDlnaProfile manufacturerUrl(String manufacturerUrl) {
    this.manufacturerUrl = manufacturerUrl;
    return this;
  }

   /**
   * Get manufacturerUrl
   * @return manufacturerUrl
  **/
  @Schema(description = "")
  public String getManufacturerUrl() {
    return manufacturerUrl;
  }

  public void setManufacturerUrl(String manufacturerUrl) {
    this.manufacturerUrl = manufacturerUrl;
  }

  public EmbyDlnaProfilesDlnaProfile modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @Schema(description = "")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public EmbyDlnaProfilesDlnaProfile modelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
    return this;
  }

   /**
   * Get modelDescription
   * @return modelDescription
  **/
  @Schema(description = "")
  public String getModelDescription() {
    return modelDescription;
  }

  public void setModelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
  }

  public EmbyDlnaProfilesDlnaProfile modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

   /**
   * Get modelNumber
   * @return modelNumber
  **/
  @Schema(description = "")
  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public EmbyDlnaProfilesDlnaProfile modelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
    return this;
  }

   /**
   * Get modelUrl
   * @return modelUrl
  **/
  @Schema(description = "")
  public String getModelUrl() {
    return modelUrl;
  }

  public void setModelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
  }

  public EmbyDlnaProfilesDlnaProfile serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @Schema(description = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public EmbyDlnaProfilesDlnaProfile enableAlbumArtInDidl(Boolean enableAlbumArtInDidl) {
    this.enableAlbumArtInDidl = enableAlbumArtInDidl;
    return this;
  }

   /**
   * Get enableAlbumArtInDidl
   * @return enableAlbumArtInDidl
  **/
  @Schema(description = "")
  public Boolean isEnableAlbumArtInDidl() {
    return enableAlbumArtInDidl;
  }

  public void setEnableAlbumArtInDidl(Boolean enableAlbumArtInDidl) {
    this.enableAlbumArtInDidl = enableAlbumArtInDidl;
  }

  public EmbyDlnaProfilesDlnaProfile enableSingleAlbumArtLimit(Boolean enableSingleAlbumArtLimit) {
    this.enableSingleAlbumArtLimit = enableSingleAlbumArtLimit;
    return this;
  }

   /**
   * Get enableSingleAlbumArtLimit
   * @return enableSingleAlbumArtLimit
  **/
  @Schema(description = "")
  public Boolean isEnableSingleAlbumArtLimit() {
    return enableSingleAlbumArtLimit;
  }

  public void setEnableSingleAlbumArtLimit(Boolean enableSingleAlbumArtLimit) {
    this.enableSingleAlbumArtLimit = enableSingleAlbumArtLimit;
  }

  public EmbyDlnaProfilesDlnaProfile enableSingleSubtitleLimit(Boolean enableSingleSubtitleLimit) {
    this.enableSingleSubtitleLimit = enableSingleSubtitleLimit;
    return this;
  }

   /**
   * Get enableSingleSubtitleLimit
   * @return enableSingleSubtitleLimit
  **/
  @Schema(description = "")
  public Boolean isEnableSingleSubtitleLimit() {
    return enableSingleSubtitleLimit;
  }

  public void setEnableSingleSubtitleLimit(Boolean enableSingleSubtitleLimit) {
    this.enableSingleSubtitleLimit = enableSingleSubtitleLimit;
  }

  public EmbyDlnaProfilesDlnaProfile protocolInfo(String protocolInfo) {
    this.protocolInfo = protocolInfo;
    return this;
  }

   /**
   * Get protocolInfo
   * @return protocolInfo
  **/
  @Schema(description = "")
  public String getProtocolInfo() {
    return protocolInfo;
  }

  public void setProtocolInfo(String protocolInfo) {
    this.protocolInfo = protocolInfo;
  }

  public EmbyDlnaProfilesDlnaProfile timelineOffsetSeconds(Integer timelineOffsetSeconds) {
    this.timelineOffsetSeconds = timelineOffsetSeconds;
    return this;
  }

   /**
   * Get timelineOffsetSeconds
   * @return timelineOffsetSeconds
  **/
  @Schema(description = "")
  public Integer getTimelineOffsetSeconds() {
    return timelineOffsetSeconds;
  }

  public void setTimelineOffsetSeconds(Integer timelineOffsetSeconds) {
    this.timelineOffsetSeconds = timelineOffsetSeconds;
  }

  public EmbyDlnaProfilesDlnaProfile requiresPlainVideoItems(Boolean requiresPlainVideoItems) {
    this.requiresPlainVideoItems = requiresPlainVideoItems;
    return this;
  }

   /**
   * Get requiresPlainVideoItems
   * @return requiresPlainVideoItems
  **/
  @Schema(description = "")
  public Boolean isRequiresPlainVideoItems() {
    return requiresPlainVideoItems;
  }

  public void setRequiresPlainVideoItems(Boolean requiresPlainVideoItems) {
    this.requiresPlainVideoItems = requiresPlainVideoItems;
  }

  public EmbyDlnaProfilesDlnaProfile requiresPlainFolders(Boolean requiresPlainFolders) {
    this.requiresPlainFolders = requiresPlainFolders;
    return this;
  }

   /**
   * Get requiresPlainFolders
   * @return requiresPlainFolders
  **/
  @Schema(description = "")
  public Boolean isRequiresPlainFolders() {
    return requiresPlainFolders;
  }

  public void setRequiresPlainFolders(Boolean requiresPlainFolders) {
    this.requiresPlainFolders = requiresPlainFolders;
  }

  public EmbyDlnaProfilesDlnaProfile ignoreTranscodeByteRangeRequests(Boolean ignoreTranscodeByteRangeRequests) {
    this.ignoreTranscodeByteRangeRequests = ignoreTranscodeByteRangeRequests;
    return this;
  }

   /**
   * Get ignoreTranscodeByteRangeRequests
   * @return ignoreTranscodeByteRangeRequests
  **/
  @Schema(description = "")
  public Boolean isIgnoreTranscodeByteRangeRequests() {
    return ignoreTranscodeByteRangeRequests;
  }

  public void setIgnoreTranscodeByteRangeRequests(Boolean ignoreTranscodeByteRangeRequests) {
    this.ignoreTranscodeByteRangeRequests = ignoreTranscodeByteRangeRequests;
  }

  public EmbyDlnaProfilesDlnaProfile supportsSamsungBookmark(Boolean supportsSamsungBookmark) {
    this.supportsSamsungBookmark = supportsSamsungBookmark;
    return this;
  }

   /**
   * Get supportsSamsungBookmark
   * @return supportsSamsungBookmark
  **/
  @Schema(description = "")
  public Boolean isSupportsSamsungBookmark() {
    return supportsSamsungBookmark;
  }

  public void setSupportsSamsungBookmark(Boolean supportsSamsungBookmark) {
    this.supportsSamsungBookmark = supportsSamsungBookmark;
  }

  public EmbyDlnaProfilesDlnaProfile identification(EmbyDlnaProfilesDeviceIdentification identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Get identification
   * @return identification
  **/
  @Schema(description = "")
  public EmbyDlnaProfilesDeviceIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(EmbyDlnaProfilesDeviceIdentification identification) {
    this.identification = identification;
  }

  public EmbyDlnaProfilesDlnaProfile protocolInfoDetection(EmbyDlnaProfilesProtocolInfoDetection protocolInfoDetection) {
    this.protocolInfoDetection = protocolInfoDetection;
    return this;
  }

   /**
   * Get protocolInfoDetection
   * @return protocolInfoDetection
  **/
  @Schema(description = "")
  public EmbyDlnaProfilesProtocolInfoDetection getProtocolInfoDetection() {
    return protocolInfoDetection;
  }

  public void setProtocolInfoDetection(EmbyDlnaProfilesProtocolInfoDetection protocolInfoDetection) {
    this.protocolInfoDetection = protocolInfoDetection;
  }

  public EmbyDlnaProfilesDlnaProfile name(String name) {
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

  public EmbyDlnaProfilesDlnaProfile id(String id) {
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

  public EmbyDlnaProfilesDlnaProfile supportedMediaTypes(String supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
    return this;
  }

   /**
   * Get supportedMediaTypes
   * @return supportedMediaTypes
  **/
  @Schema(description = "")
  public String getSupportedMediaTypes() {
    return supportedMediaTypes;
  }

  public void setSupportedMediaTypes(String supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
  }

  public EmbyDlnaProfilesDlnaProfile maxStreamingBitrate(Long maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
    return this;
  }

   /**
   * Get maxStreamingBitrate
   * @return maxStreamingBitrate
  **/
  @Schema(description = "")
  public Long getMaxStreamingBitrate() {
    return maxStreamingBitrate;
  }

  public void setMaxStreamingBitrate(Long maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
  }

  public EmbyDlnaProfilesDlnaProfile musicStreamingTranscodingBitrate(Integer musicStreamingTranscodingBitrate) {
    this.musicStreamingTranscodingBitrate = musicStreamingTranscodingBitrate;
    return this;
  }

   /**
   * Get musicStreamingTranscodingBitrate
   * @return musicStreamingTranscodingBitrate
  **/
  @Schema(description = "")
  public Integer getMusicStreamingTranscodingBitrate() {
    return musicStreamingTranscodingBitrate;
  }

  public void setMusicStreamingTranscodingBitrate(Integer musicStreamingTranscodingBitrate) {
    this.musicStreamingTranscodingBitrate = musicStreamingTranscodingBitrate;
  }

  public EmbyDlnaProfilesDlnaProfile maxStaticMusicBitrate(Integer maxStaticMusicBitrate) {
    this.maxStaticMusicBitrate = maxStaticMusicBitrate;
    return this;
  }

   /**
   * Get maxStaticMusicBitrate
   * @return maxStaticMusicBitrate
  **/
  @Schema(description = "")
  public Integer getMaxStaticMusicBitrate() {
    return maxStaticMusicBitrate;
  }

  public void setMaxStaticMusicBitrate(Integer maxStaticMusicBitrate) {
    this.maxStaticMusicBitrate = maxStaticMusicBitrate;
  }

  public EmbyDlnaProfilesDlnaProfile directPlayProfiles(List<DlnaDirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
    return this;
  }

  public EmbyDlnaProfilesDlnaProfile addDirectPlayProfilesItem(DlnaDirectPlayProfile directPlayProfilesItem) {
    if (this.directPlayProfiles == null) {
      this.directPlayProfiles = new ArrayList<DlnaDirectPlayProfile>();
    }
    this.directPlayProfiles.add(directPlayProfilesItem);
    return this;
  }

   /**
   * Get directPlayProfiles
   * @return directPlayProfiles
  **/
  @Schema(description = "")
  public List<DlnaDirectPlayProfile> getDirectPlayProfiles() {
    return directPlayProfiles;
  }

  public void setDirectPlayProfiles(List<DlnaDirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
  }

  public EmbyDlnaProfilesDlnaProfile transcodingProfiles(List<DlnaTranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
    return this;
  }

  public EmbyDlnaProfilesDlnaProfile addTranscodingProfilesItem(DlnaTranscodingProfile transcodingProfilesItem) {
    if (this.transcodingProfiles == null) {
      this.transcodingProfiles = new ArrayList<DlnaTranscodingProfile>();
    }
    this.transcodingProfiles.add(transcodingProfilesItem);
    return this;
  }

   /**
   * Get transcodingProfiles
   * @return transcodingProfiles
  **/
  @Schema(description = "")
  public List<DlnaTranscodingProfile> getTranscodingProfiles() {
    return transcodingProfiles;
  }

  public void setTranscodingProfiles(List<DlnaTranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
  }

  public EmbyDlnaProfilesDlnaProfile containerProfiles(List<DlnaContainerProfile> containerProfiles) {
    this.containerProfiles = containerProfiles;
    return this;
  }

  public EmbyDlnaProfilesDlnaProfile addContainerProfilesItem(DlnaContainerProfile containerProfilesItem) {
    if (this.containerProfiles == null) {
      this.containerProfiles = new ArrayList<DlnaContainerProfile>();
    }
    this.containerProfiles.add(containerProfilesItem);
    return this;
  }

   /**
   * Get containerProfiles
   * @return containerProfiles
  **/
  @Schema(description = "")
  public List<DlnaContainerProfile> getContainerProfiles() {
    return containerProfiles;
  }

  public void setContainerProfiles(List<DlnaContainerProfile> containerProfiles) {
    this.containerProfiles = containerProfiles;
  }

  public EmbyDlnaProfilesDlnaProfile codecProfiles(List<DlnaCodecProfile> codecProfiles) {
    this.codecProfiles = codecProfiles;
    return this;
  }

  public EmbyDlnaProfilesDlnaProfile addCodecProfilesItem(DlnaCodecProfile codecProfilesItem) {
    if (this.codecProfiles == null) {
      this.codecProfiles = new ArrayList<DlnaCodecProfile>();
    }
    this.codecProfiles.add(codecProfilesItem);
    return this;
  }

   /**
   * Get codecProfiles
   * @return codecProfiles
  **/
  @Schema(description = "")
  public List<DlnaCodecProfile> getCodecProfiles() {
    return codecProfiles;
  }

  public void setCodecProfiles(List<DlnaCodecProfile> codecProfiles) {
    this.codecProfiles = codecProfiles;
  }

  public EmbyDlnaProfilesDlnaProfile responseProfiles(List<DlnaResponseProfile> responseProfiles) {
    this.responseProfiles = responseProfiles;
    return this;
  }

  public EmbyDlnaProfilesDlnaProfile addResponseProfilesItem(DlnaResponseProfile responseProfilesItem) {
    if (this.responseProfiles == null) {
      this.responseProfiles = new ArrayList<DlnaResponseProfile>();
    }
    this.responseProfiles.add(responseProfilesItem);
    return this;
  }

   /**
   * Get responseProfiles
   * @return responseProfiles
  **/
  @Schema(description = "")
  public List<DlnaResponseProfile> getResponseProfiles() {
    return responseProfiles;
  }

  public void setResponseProfiles(List<DlnaResponseProfile> responseProfiles) {
    this.responseProfiles = responseProfiles;
  }

  public EmbyDlnaProfilesDlnaProfile subtitleProfiles(List<DlnaSubtitleProfile> subtitleProfiles) {
    this.subtitleProfiles = subtitleProfiles;
    return this;
  }

  public EmbyDlnaProfilesDlnaProfile addSubtitleProfilesItem(DlnaSubtitleProfile subtitleProfilesItem) {
    if (this.subtitleProfiles == null) {
      this.subtitleProfiles = new ArrayList<DlnaSubtitleProfile>();
    }
    this.subtitleProfiles.add(subtitleProfilesItem);
    return this;
  }

   /**
   * Get subtitleProfiles
   * @return subtitleProfiles
  **/
  @Schema(description = "")
  public List<DlnaSubtitleProfile> getSubtitleProfiles() {
    return subtitleProfiles;
  }

  public void setSubtitleProfiles(List<DlnaSubtitleProfile> subtitleProfiles) {
    this.subtitleProfiles = subtitleProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyDlnaProfilesDlnaProfile embyDlnaProfilesDlnaProfile = (EmbyDlnaProfilesDlnaProfile) o;
    return Objects.equals(this.type, embyDlnaProfilesDlnaProfile.type) &&
        Objects.equals(this.path, embyDlnaProfilesDlnaProfile.path) &&
        Objects.equals(this.userId, embyDlnaProfilesDlnaProfile.userId) &&
        Objects.equals(this.albumArtPn, embyDlnaProfilesDlnaProfile.albumArtPn) &&
        Objects.equals(this.maxAlbumArtWidth, embyDlnaProfilesDlnaProfile.maxAlbumArtWidth) &&
        Objects.equals(this.maxAlbumArtHeight, embyDlnaProfilesDlnaProfile.maxAlbumArtHeight) &&
        Objects.equals(this.maxIconWidth, embyDlnaProfilesDlnaProfile.maxIconWidth) &&
        Objects.equals(this.maxIconHeight, embyDlnaProfilesDlnaProfile.maxIconHeight) &&
        Objects.equals(this.friendlyName, embyDlnaProfilesDlnaProfile.friendlyName) &&
        Objects.equals(this.manufacturer, embyDlnaProfilesDlnaProfile.manufacturer) &&
        Objects.equals(this.manufacturerUrl, embyDlnaProfilesDlnaProfile.manufacturerUrl) &&
        Objects.equals(this.modelName, embyDlnaProfilesDlnaProfile.modelName) &&
        Objects.equals(this.modelDescription, embyDlnaProfilesDlnaProfile.modelDescription) &&
        Objects.equals(this.modelNumber, embyDlnaProfilesDlnaProfile.modelNumber) &&
        Objects.equals(this.modelUrl, embyDlnaProfilesDlnaProfile.modelUrl) &&
        Objects.equals(this.serialNumber, embyDlnaProfilesDlnaProfile.serialNumber) &&
        Objects.equals(this.enableAlbumArtInDidl, embyDlnaProfilesDlnaProfile.enableAlbumArtInDidl) &&
        Objects.equals(this.enableSingleAlbumArtLimit, embyDlnaProfilesDlnaProfile.enableSingleAlbumArtLimit) &&
        Objects.equals(this.enableSingleSubtitleLimit, embyDlnaProfilesDlnaProfile.enableSingleSubtitleLimit) &&
        Objects.equals(this.protocolInfo, embyDlnaProfilesDlnaProfile.protocolInfo) &&
        Objects.equals(this.timelineOffsetSeconds, embyDlnaProfilesDlnaProfile.timelineOffsetSeconds) &&
        Objects.equals(this.requiresPlainVideoItems, embyDlnaProfilesDlnaProfile.requiresPlainVideoItems) &&
        Objects.equals(this.requiresPlainFolders, embyDlnaProfilesDlnaProfile.requiresPlainFolders) &&
        Objects.equals(this.ignoreTranscodeByteRangeRequests, embyDlnaProfilesDlnaProfile.ignoreTranscodeByteRangeRequests) &&
        Objects.equals(this.supportsSamsungBookmark, embyDlnaProfilesDlnaProfile.supportsSamsungBookmark) &&
        Objects.equals(this.identification, embyDlnaProfilesDlnaProfile.identification) &&
        Objects.equals(this.protocolInfoDetection, embyDlnaProfilesDlnaProfile.protocolInfoDetection) &&
        Objects.equals(this.name, embyDlnaProfilesDlnaProfile.name) &&
        Objects.equals(this.id, embyDlnaProfilesDlnaProfile.id) &&
        Objects.equals(this.supportedMediaTypes, embyDlnaProfilesDlnaProfile.supportedMediaTypes) &&
        Objects.equals(this.maxStreamingBitrate, embyDlnaProfilesDlnaProfile.maxStreamingBitrate) &&
        Objects.equals(this.musicStreamingTranscodingBitrate, embyDlnaProfilesDlnaProfile.musicStreamingTranscodingBitrate) &&
        Objects.equals(this.maxStaticMusicBitrate, embyDlnaProfilesDlnaProfile.maxStaticMusicBitrate) &&
        Objects.equals(this.directPlayProfiles, embyDlnaProfilesDlnaProfile.directPlayProfiles) &&
        Objects.equals(this.transcodingProfiles, embyDlnaProfilesDlnaProfile.transcodingProfiles) &&
        Objects.equals(this.containerProfiles, embyDlnaProfilesDlnaProfile.containerProfiles) &&
        Objects.equals(this.codecProfiles, embyDlnaProfilesDlnaProfile.codecProfiles) &&
        Objects.equals(this.responseProfiles, embyDlnaProfilesDlnaProfile.responseProfiles) &&
        Objects.equals(this.subtitleProfiles, embyDlnaProfilesDlnaProfile.subtitleProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, path, userId, albumArtPn, maxAlbumArtWidth, maxAlbumArtHeight, maxIconWidth, maxIconHeight, friendlyName, manufacturer, manufacturerUrl, modelName, modelDescription, modelNumber, modelUrl, serialNumber, enableAlbumArtInDidl, enableSingleAlbumArtLimit, enableSingleSubtitleLimit, protocolInfo, timelineOffsetSeconds, requiresPlainVideoItems, requiresPlainFolders, ignoreTranscodeByteRangeRequests, supportsSamsungBookmark, identification, protocolInfoDetection, name, id, supportedMediaTypes, maxStreamingBitrate, musicStreamingTranscodingBitrate, maxStaticMusicBitrate, directPlayProfiles, transcodingProfiles, containerProfiles, codecProfiles, responseProfiles, subtitleProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyDlnaProfilesDlnaProfile {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    albumArtPn: ").append(toIndentedString(albumArtPn)).append("\n");
    sb.append("    maxAlbumArtWidth: ").append(toIndentedString(maxAlbumArtWidth)).append("\n");
    sb.append("    maxAlbumArtHeight: ").append(toIndentedString(maxAlbumArtHeight)).append("\n");
    sb.append("    maxIconWidth: ").append(toIndentedString(maxIconWidth)).append("\n");
    sb.append("    maxIconHeight: ").append(toIndentedString(maxIconHeight)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerUrl: ").append(toIndentedString(manufacturerUrl)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelDescription: ").append(toIndentedString(modelDescription)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    enableAlbumArtInDidl: ").append(toIndentedString(enableAlbumArtInDidl)).append("\n");
    sb.append("    enableSingleAlbumArtLimit: ").append(toIndentedString(enableSingleAlbumArtLimit)).append("\n");
    sb.append("    enableSingleSubtitleLimit: ").append(toIndentedString(enableSingleSubtitleLimit)).append("\n");
    sb.append("    protocolInfo: ").append(toIndentedString(protocolInfo)).append("\n");
    sb.append("    timelineOffsetSeconds: ").append(toIndentedString(timelineOffsetSeconds)).append("\n");
    sb.append("    requiresPlainVideoItems: ").append(toIndentedString(requiresPlainVideoItems)).append("\n");
    sb.append("    requiresPlainFolders: ").append(toIndentedString(requiresPlainFolders)).append("\n");
    sb.append("    ignoreTranscodeByteRangeRequests: ").append(toIndentedString(ignoreTranscodeByteRangeRequests)).append("\n");
    sb.append("    supportsSamsungBookmark: ").append(toIndentedString(supportsSamsungBookmark)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    protocolInfoDetection: ").append(toIndentedString(protocolInfoDetection)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supportedMediaTypes: ").append(toIndentedString(supportedMediaTypes)).append("\n");
    sb.append("    maxStreamingBitrate: ").append(toIndentedString(maxStreamingBitrate)).append("\n");
    sb.append("    musicStreamingTranscodingBitrate: ").append(toIndentedString(musicStreamingTranscodingBitrate)).append("\n");
    sb.append("    maxStaticMusicBitrate: ").append(toIndentedString(maxStaticMusicBitrate)).append("\n");
    sb.append("    directPlayProfiles: ").append(toIndentedString(directPlayProfiles)).append("\n");
    sb.append("    transcodingProfiles: ").append(toIndentedString(transcodingProfiles)).append("\n");
    sb.append("    containerProfiles: ").append(toIndentedString(containerProfiles)).append("\n");
    sb.append("    codecProfiles: ").append(toIndentedString(codecProfiles)).append("\n");
    sb.append("    responseProfiles: ").append(toIndentedString(responseProfiles)).append("\n");
    sb.append("    subtitleProfiles: ").append(toIndentedString(subtitleProfiles)).append("\n");
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
