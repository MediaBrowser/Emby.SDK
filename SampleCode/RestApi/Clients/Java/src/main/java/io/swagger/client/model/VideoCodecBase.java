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
import io.swagger.client.model.BitRate;
import io.swagger.client.model.CodecDirections;
import io.swagger.client.model.CodecKinds;
import io.swagger.client.model.ColorFormats;
import io.swagger.client.model.CommonInterfacesICodecDeviceInfo;
import io.swagger.client.model.ProfileLevelInformation;
import io.swagger.client.model.SecondaryFrameworks;
import io.swagger.client.model.VideoMediaTypes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VideoCodecBase
 */


public class VideoCodecBase {
  @SerializedName("CodecDeviceInfo")
  private CommonInterfacesICodecDeviceInfo codecDeviceInfo = null;

  @SerializedName("CodecKind")
  private CodecKinds codecKind = null;

  @SerializedName("MediaTypeName")
  private String mediaTypeName = null;

  @SerializedName("VideoMediaType")
  private VideoMediaTypes videoMediaType = null;

  @SerializedName("MinWidth")
  private Integer minWidth = null;

  @SerializedName("MaxWidth")
  private Integer maxWidth = null;

  @SerializedName("MinHeight")
  private Integer minHeight = null;

  @SerializedName("MaxHeight")
  private Integer maxHeight = null;

  @SerializedName("WidthAlignment")
  private Integer widthAlignment = null;

  @SerializedName("HeightAlignment")
  private Integer heightAlignment = null;

  @SerializedName("MaxBitRate")
  private BitRate maxBitRate = null;

  @SerializedName("SupportedColorFormats")
  private List<ColorFormats> supportedColorFormats = null;

  @SerializedName("SupportedColorFormatStrings")
  private List<String> supportedColorFormatStrings = null;

  @SerializedName("ProfileAndLevelInformation")
  private List<ProfileLevelInformation> profileAndLevelInformation = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Direction")
  private CodecDirections direction = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FrameworkCodec")
  private String frameworkCodec = null;

  @SerializedName("IsHardwareCodec")
  private Boolean isHardwareCodec = null;

  @SerializedName("SecondaryFramework")
  private SecondaryFrameworks secondaryFramework = null;

  @SerializedName("SecondaryFrameworkCodec")
  private String secondaryFrameworkCodec = null;

  @SerializedName("MaxInstanceCount")
  private Integer maxInstanceCount = null;

  @SerializedName("IsEnabledByDefault")
  private Boolean isEnabledByDefault = null;

  @SerializedName("DefaultPriority")
  private Integer defaultPriority = null;

  public VideoCodecBase codecDeviceInfo(CommonInterfacesICodecDeviceInfo codecDeviceInfo) {
    this.codecDeviceInfo = codecDeviceInfo;
    return this;
  }

   /**
   * Get codecDeviceInfo
   * @return codecDeviceInfo
  **/
  @Schema(description = "")
  public CommonInterfacesICodecDeviceInfo getCodecDeviceInfo() {
    return codecDeviceInfo;
  }

  public void setCodecDeviceInfo(CommonInterfacesICodecDeviceInfo codecDeviceInfo) {
    this.codecDeviceInfo = codecDeviceInfo;
  }

  public VideoCodecBase codecKind(CodecKinds codecKind) {
    this.codecKind = codecKind;
    return this;
  }

   /**
   * Get codecKind
   * @return codecKind
  **/
  @Schema(description = "")
  public CodecKinds getCodecKind() {
    return codecKind;
  }

  public void setCodecKind(CodecKinds codecKind) {
    this.codecKind = codecKind;
  }

  public VideoCodecBase mediaTypeName(String mediaTypeName) {
    this.mediaTypeName = mediaTypeName;
    return this;
  }

   /**
   * Get mediaTypeName
   * @return mediaTypeName
  **/
  @Schema(description = "")
  public String getMediaTypeName() {
    return mediaTypeName;
  }

  public void setMediaTypeName(String mediaTypeName) {
    this.mediaTypeName = mediaTypeName;
  }

  public VideoCodecBase videoMediaType(VideoMediaTypes videoMediaType) {
    this.videoMediaType = videoMediaType;
    return this;
  }

   /**
   * Get videoMediaType
   * @return videoMediaType
  **/
  @Schema(description = "")
  public VideoMediaTypes getVideoMediaType() {
    return videoMediaType;
  }

  public void setVideoMediaType(VideoMediaTypes videoMediaType) {
    this.videoMediaType = videoMediaType;
  }

  public VideoCodecBase minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

   /**
   * Get minWidth
   * @return minWidth
  **/
  @Schema(description = "")
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }

  public VideoCodecBase maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Get maxWidth
   * @return maxWidth
  **/
  @Schema(description = "")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public VideoCodecBase minHeight(Integer minHeight) {
    this.minHeight = minHeight;
    return this;
  }

   /**
   * Get minHeight
   * @return minHeight
  **/
  @Schema(description = "")
  public Integer getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Integer minHeight) {
    this.minHeight = minHeight;
  }

  public VideoCodecBase maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Get maxHeight
   * @return maxHeight
  **/
  @Schema(description = "")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  public VideoCodecBase widthAlignment(Integer widthAlignment) {
    this.widthAlignment = widthAlignment;
    return this;
  }

   /**
   * Get widthAlignment
   * @return widthAlignment
  **/
  @Schema(description = "")
  public Integer getWidthAlignment() {
    return widthAlignment;
  }

  public void setWidthAlignment(Integer widthAlignment) {
    this.widthAlignment = widthAlignment;
  }

  public VideoCodecBase heightAlignment(Integer heightAlignment) {
    this.heightAlignment = heightAlignment;
    return this;
  }

   /**
   * Get heightAlignment
   * @return heightAlignment
  **/
  @Schema(description = "")
  public Integer getHeightAlignment() {
    return heightAlignment;
  }

  public void setHeightAlignment(Integer heightAlignment) {
    this.heightAlignment = heightAlignment;
  }

  public VideoCodecBase maxBitRate(BitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
    return this;
  }

   /**
   * Get maxBitRate
   * @return maxBitRate
  **/
  @Schema(description = "")
  public BitRate getMaxBitRate() {
    return maxBitRate;
  }

  public void setMaxBitRate(BitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
  }

  public VideoCodecBase supportedColorFormats(List<ColorFormats> supportedColorFormats) {
    this.supportedColorFormats = supportedColorFormats;
    return this;
  }

  public VideoCodecBase addSupportedColorFormatsItem(ColorFormats supportedColorFormatsItem) {
    if (this.supportedColorFormats == null) {
      this.supportedColorFormats = new ArrayList<ColorFormats>();
    }
    this.supportedColorFormats.add(supportedColorFormatsItem);
    return this;
  }

   /**
   * Get supportedColorFormats
   * @return supportedColorFormats
  **/
  @Schema(description = "")
  public List<ColorFormats> getSupportedColorFormats() {
    return supportedColorFormats;
  }

  public void setSupportedColorFormats(List<ColorFormats> supportedColorFormats) {
    this.supportedColorFormats = supportedColorFormats;
  }

  public VideoCodecBase supportedColorFormatStrings(List<String> supportedColorFormatStrings) {
    this.supportedColorFormatStrings = supportedColorFormatStrings;
    return this;
  }

  public VideoCodecBase addSupportedColorFormatStringsItem(String supportedColorFormatStringsItem) {
    if (this.supportedColorFormatStrings == null) {
      this.supportedColorFormatStrings = new ArrayList<String>();
    }
    this.supportedColorFormatStrings.add(supportedColorFormatStringsItem);
    return this;
  }

   /**
   * Get supportedColorFormatStrings
   * @return supportedColorFormatStrings
  **/
  @Schema(description = "")
  public List<String> getSupportedColorFormatStrings() {
    return supportedColorFormatStrings;
  }

  public void setSupportedColorFormatStrings(List<String> supportedColorFormatStrings) {
    this.supportedColorFormatStrings = supportedColorFormatStrings;
  }

  public VideoCodecBase profileAndLevelInformation(List<ProfileLevelInformation> profileAndLevelInformation) {
    this.profileAndLevelInformation = profileAndLevelInformation;
    return this;
  }

  public VideoCodecBase addProfileAndLevelInformationItem(ProfileLevelInformation profileAndLevelInformationItem) {
    if (this.profileAndLevelInformation == null) {
      this.profileAndLevelInformation = new ArrayList<ProfileLevelInformation>();
    }
    this.profileAndLevelInformation.add(profileAndLevelInformationItem);
    return this;
  }

   /**
   * Get profileAndLevelInformation
   * @return profileAndLevelInformation
  **/
  @Schema(description = "")
  public List<ProfileLevelInformation> getProfileAndLevelInformation() {
    return profileAndLevelInformation;
  }

  public void setProfileAndLevelInformation(List<ProfileLevelInformation> profileAndLevelInformation) {
    this.profileAndLevelInformation = profileAndLevelInformation;
  }

  public VideoCodecBase id(String id) {
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

  public VideoCodecBase direction(CodecDirections direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")
  public CodecDirections getDirection() {
    return direction;
  }

  public void setDirection(CodecDirections direction) {
    this.direction = direction;
  }

  public VideoCodecBase name(String name) {
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

  public VideoCodecBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VideoCodecBase frameworkCodec(String frameworkCodec) {
    this.frameworkCodec = frameworkCodec;
    return this;
  }

   /**
   * Get frameworkCodec
   * @return frameworkCodec
  **/
  @Schema(description = "")
  public String getFrameworkCodec() {
    return frameworkCodec;
  }

  public void setFrameworkCodec(String frameworkCodec) {
    this.frameworkCodec = frameworkCodec;
  }

  public VideoCodecBase isHardwareCodec(Boolean isHardwareCodec) {
    this.isHardwareCodec = isHardwareCodec;
    return this;
  }

   /**
   * Get isHardwareCodec
   * @return isHardwareCodec
  **/
  @Schema(description = "")
  public Boolean isIsHardwareCodec() {
    return isHardwareCodec;
  }

  public void setIsHardwareCodec(Boolean isHardwareCodec) {
    this.isHardwareCodec = isHardwareCodec;
  }

  public VideoCodecBase secondaryFramework(SecondaryFrameworks secondaryFramework) {
    this.secondaryFramework = secondaryFramework;
    return this;
  }

   /**
   * Get secondaryFramework
   * @return secondaryFramework
  **/
  @Schema(description = "")
  public SecondaryFrameworks getSecondaryFramework() {
    return secondaryFramework;
  }

  public void setSecondaryFramework(SecondaryFrameworks secondaryFramework) {
    this.secondaryFramework = secondaryFramework;
  }

  public VideoCodecBase secondaryFrameworkCodec(String secondaryFrameworkCodec) {
    this.secondaryFrameworkCodec = secondaryFrameworkCodec;
    return this;
  }

   /**
   * Get secondaryFrameworkCodec
   * @return secondaryFrameworkCodec
  **/
  @Schema(description = "")
  public String getSecondaryFrameworkCodec() {
    return secondaryFrameworkCodec;
  }

  public void setSecondaryFrameworkCodec(String secondaryFrameworkCodec) {
    this.secondaryFrameworkCodec = secondaryFrameworkCodec;
  }

  public VideoCodecBase maxInstanceCount(Integer maxInstanceCount) {
    this.maxInstanceCount = maxInstanceCount;
    return this;
  }

   /**
   * Get maxInstanceCount
   * @return maxInstanceCount
  **/
  @Schema(description = "")
  public Integer getMaxInstanceCount() {
    return maxInstanceCount;
  }

  public void setMaxInstanceCount(Integer maxInstanceCount) {
    this.maxInstanceCount = maxInstanceCount;
  }

  public VideoCodecBase isEnabledByDefault(Boolean isEnabledByDefault) {
    this.isEnabledByDefault = isEnabledByDefault;
    return this;
  }

   /**
   * Get isEnabledByDefault
   * @return isEnabledByDefault
  **/
  @Schema(description = "")
  public Boolean isIsEnabledByDefault() {
    return isEnabledByDefault;
  }

  public void setIsEnabledByDefault(Boolean isEnabledByDefault) {
    this.isEnabledByDefault = isEnabledByDefault;
  }

  public VideoCodecBase defaultPriority(Integer defaultPriority) {
    this.defaultPriority = defaultPriority;
    return this;
  }

   /**
   * Get defaultPriority
   * @return defaultPriority
  **/
  @Schema(description = "")
  public Integer getDefaultPriority() {
    return defaultPriority;
  }

  public void setDefaultPriority(Integer defaultPriority) {
    this.defaultPriority = defaultPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCodecBase videoCodecBase = (VideoCodecBase) o;
    return Objects.equals(this.codecDeviceInfo, videoCodecBase.codecDeviceInfo) &&
        Objects.equals(this.codecKind, videoCodecBase.codecKind) &&
        Objects.equals(this.mediaTypeName, videoCodecBase.mediaTypeName) &&
        Objects.equals(this.videoMediaType, videoCodecBase.videoMediaType) &&
        Objects.equals(this.minWidth, videoCodecBase.minWidth) &&
        Objects.equals(this.maxWidth, videoCodecBase.maxWidth) &&
        Objects.equals(this.minHeight, videoCodecBase.minHeight) &&
        Objects.equals(this.maxHeight, videoCodecBase.maxHeight) &&
        Objects.equals(this.widthAlignment, videoCodecBase.widthAlignment) &&
        Objects.equals(this.heightAlignment, videoCodecBase.heightAlignment) &&
        Objects.equals(this.maxBitRate, videoCodecBase.maxBitRate) &&
        Objects.equals(this.supportedColorFormats, videoCodecBase.supportedColorFormats) &&
        Objects.equals(this.supportedColorFormatStrings, videoCodecBase.supportedColorFormatStrings) &&
        Objects.equals(this.profileAndLevelInformation, videoCodecBase.profileAndLevelInformation) &&
        Objects.equals(this.id, videoCodecBase.id) &&
        Objects.equals(this.direction, videoCodecBase.direction) &&
        Objects.equals(this.name, videoCodecBase.name) &&
        Objects.equals(this.description, videoCodecBase.description) &&
        Objects.equals(this.frameworkCodec, videoCodecBase.frameworkCodec) &&
        Objects.equals(this.isHardwareCodec, videoCodecBase.isHardwareCodec) &&
        Objects.equals(this.secondaryFramework, videoCodecBase.secondaryFramework) &&
        Objects.equals(this.secondaryFrameworkCodec, videoCodecBase.secondaryFrameworkCodec) &&
        Objects.equals(this.maxInstanceCount, videoCodecBase.maxInstanceCount) &&
        Objects.equals(this.isEnabledByDefault, videoCodecBase.isEnabledByDefault) &&
        Objects.equals(this.defaultPriority, videoCodecBase.defaultPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codecDeviceInfo, codecKind, mediaTypeName, videoMediaType, minWidth, maxWidth, minHeight, maxHeight, widthAlignment, heightAlignment, maxBitRate, supportedColorFormats, supportedColorFormatStrings, profileAndLevelInformation, id, direction, name, description, frameworkCodec, isHardwareCodec, secondaryFramework, secondaryFrameworkCodec, maxInstanceCount, isEnabledByDefault, defaultPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCodecBase {\n");
    
    sb.append("    codecDeviceInfo: ").append(toIndentedString(codecDeviceInfo)).append("\n");
    sb.append("    codecKind: ").append(toIndentedString(codecKind)).append("\n");
    sb.append("    mediaTypeName: ").append(toIndentedString(mediaTypeName)).append("\n");
    sb.append("    videoMediaType: ").append(toIndentedString(videoMediaType)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    widthAlignment: ").append(toIndentedString(widthAlignment)).append("\n");
    sb.append("    heightAlignment: ").append(toIndentedString(heightAlignment)).append("\n");
    sb.append("    maxBitRate: ").append(toIndentedString(maxBitRate)).append("\n");
    sb.append("    supportedColorFormats: ").append(toIndentedString(supportedColorFormats)).append("\n");
    sb.append("    supportedColorFormatStrings: ").append(toIndentedString(supportedColorFormatStrings)).append("\n");
    sb.append("    profileAndLevelInformation: ").append(toIndentedString(profileAndLevelInformation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    frameworkCodec: ").append(toIndentedString(frameworkCodec)).append("\n");
    sb.append("    isHardwareCodec: ").append(toIndentedString(isHardwareCodec)).append("\n");
    sb.append("    secondaryFramework: ").append(toIndentedString(secondaryFramework)).append("\n");
    sb.append("    secondaryFrameworkCodec: ").append(toIndentedString(secondaryFrameworkCodec)).append("\n");
    sb.append("    maxInstanceCount: ").append(toIndentedString(maxInstanceCount)).append("\n");
    sb.append("    isEnabledByDefault: ").append(toIndentedString(isEnabledByDefault)).append("\n");
    sb.append("    defaultPriority: ").append(toIndentedString(defaultPriority)).append("\n");
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
