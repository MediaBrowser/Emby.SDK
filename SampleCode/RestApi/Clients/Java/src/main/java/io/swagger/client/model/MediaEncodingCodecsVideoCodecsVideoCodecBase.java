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
import io.swagger.client.model.EmbyMediaModelEnumsCodecDirections;
import io.swagger.client.model.EmbyMediaModelEnumsCodecKinds;
import io.swagger.client.model.EmbyMediaModelEnumsColorFormats;
import io.swagger.client.model.EmbyMediaModelEnumsSecondaryFrameworks;
import io.swagger.client.model.EmbyMediaModelEnumsVideoMediaTypes;
import io.swagger.client.model.EmbyMediaModelTypesBitRate;
import io.swagger.client.model.EmbyMediaModelTypesProfileLevelInformation;
import io.swagger.client.model.MediaEncodingCodecsCommonInterfacesICodecDeviceInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MediaEncodingCodecsVideoCodecsVideoCodecBase
 */


public class MediaEncodingCodecsVideoCodecsVideoCodecBase {
  @SerializedName("CodecDeviceInfo")
  private MediaEncodingCodecsCommonInterfacesICodecDeviceInfo codecDeviceInfo = null;

  @SerializedName("CodecKind")
  private EmbyMediaModelEnumsCodecKinds codecKind = null;

  @SerializedName("MediaTypeName")
  private String mediaTypeName = null;

  @SerializedName("VideoMediaType")
  private EmbyMediaModelEnumsVideoMediaTypes videoMediaType = null;

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
  private EmbyMediaModelTypesBitRate maxBitRate = null;

  @SerializedName("SupportedColorFormats")
  private List<EmbyMediaModelEnumsColorFormats> supportedColorFormats = null;

  @SerializedName("SupportedColorFormatStrings")
  private List<String> supportedColorFormatStrings = null;

  @SerializedName("ProfileAndLevelInformation")
  private List<EmbyMediaModelTypesProfileLevelInformation> profileAndLevelInformation = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Direction")
  private EmbyMediaModelEnumsCodecDirections direction = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FrameworkCodec")
  private String frameworkCodec = null;

  @SerializedName("IsHardwareCodec")
  private Boolean isHardwareCodec = null;

  @SerializedName("SecondaryFramework")
  private EmbyMediaModelEnumsSecondaryFrameworks secondaryFramework = null;

  @SerializedName("SecondaryFrameworkCodec")
  private String secondaryFrameworkCodec = null;

  @SerializedName("MaxInstanceCount")
  private Integer maxInstanceCount = null;

  @SerializedName("IsEnabledByDefault")
  private Boolean isEnabledByDefault = null;

  @SerializedName("DefaultPriority")
  private Integer defaultPriority = null;

  public MediaEncodingCodecsVideoCodecsVideoCodecBase codecDeviceInfo(MediaEncodingCodecsCommonInterfacesICodecDeviceInfo codecDeviceInfo) {
    this.codecDeviceInfo = codecDeviceInfo;
    return this;
  }

   /**
   * Get codecDeviceInfo
   * @return codecDeviceInfo
  **/
  @Schema(description = "")
  public MediaEncodingCodecsCommonInterfacesICodecDeviceInfo getCodecDeviceInfo() {
    return codecDeviceInfo;
  }

  public void setCodecDeviceInfo(MediaEncodingCodecsCommonInterfacesICodecDeviceInfo codecDeviceInfo) {
    this.codecDeviceInfo = codecDeviceInfo;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase codecKind(EmbyMediaModelEnumsCodecKinds codecKind) {
    this.codecKind = codecKind;
    return this;
  }

   /**
   * Get codecKind
   * @return codecKind
  **/
  @Schema(description = "")
  public EmbyMediaModelEnumsCodecKinds getCodecKind() {
    return codecKind;
  }

  public void setCodecKind(EmbyMediaModelEnumsCodecKinds codecKind) {
    this.codecKind = codecKind;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase mediaTypeName(String mediaTypeName) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase videoMediaType(EmbyMediaModelEnumsVideoMediaTypes videoMediaType) {
    this.videoMediaType = videoMediaType;
    return this;
  }

   /**
   * Get videoMediaType
   * @return videoMediaType
  **/
  @Schema(description = "")
  public EmbyMediaModelEnumsVideoMediaTypes getVideoMediaType() {
    return videoMediaType;
  }

  public void setVideoMediaType(EmbyMediaModelEnumsVideoMediaTypes videoMediaType) {
    this.videoMediaType = videoMediaType;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase minWidth(Integer minWidth) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase maxWidth(Integer maxWidth) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase minHeight(Integer minHeight) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase maxHeight(Integer maxHeight) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase widthAlignment(Integer widthAlignment) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase heightAlignment(Integer heightAlignment) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase maxBitRate(EmbyMediaModelTypesBitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
    return this;
  }

   /**
   * Get maxBitRate
   * @return maxBitRate
  **/
  @Schema(description = "")
  public EmbyMediaModelTypesBitRate getMaxBitRate() {
    return maxBitRate;
  }

  public void setMaxBitRate(EmbyMediaModelTypesBitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase supportedColorFormats(List<EmbyMediaModelEnumsColorFormats> supportedColorFormats) {
    this.supportedColorFormats = supportedColorFormats;
    return this;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase addSupportedColorFormatsItem(EmbyMediaModelEnumsColorFormats supportedColorFormatsItem) {
    if (this.supportedColorFormats == null) {
      this.supportedColorFormats = new ArrayList<EmbyMediaModelEnumsColorFormats>();
    }
    this.supportedColorFormats.add(supportedColorFormatsItem);
    return this;
  }

   /**
   * Get supportedColorFormats
   * @return supportedColorFormats
  **/
  @Schema(description = "")
  public List<EmbyMediaModelEnumsColorFormats> getSupportedColorFormats() {
    return supportedColorFormats;
  }

  public void setSupportedColorFormats(List<EmbyMediaModelEnumsColorFormats> supportedColorFormats) {
    this.supportedColorFormats = supportedColorFormats;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase supportedColorFormatStrings(List<String> supportedColorFormatStrings) {
    this.supportedColorFormatStrings = supportedColorFormatStrings;
    return this;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase addSupportedColorFormatStringsItem(String supportedColorFormatStringsItem) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase profileAndLevelInformation(List<EmbyMediaModelTypesProfileLevelInformation> profileAndLevelInformation) {
    this.profileAndLevelInformation = profileAndLevelInformation;
    return this;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase addProfileAndLevelInformationItem(EmbyMediaModelTypesProfileLevelInformation profileAndLevelInformationItem) {
    if (this.profileAndLevelInformation == null) {
      this.profileAndLevelInformation = new ArrayList<EmbyMediaModelTypesProfileLevelInformation>();
    }
    this.profileAndLevelInformation.add(profileAndLevelInformationItem);
    return this;
  }

   /**
   * Get profileAndLevelInformation
   * @return profileAndLevelInformation
  **/
  @Schema(description = "")
  public List<EmbyMediaModelTypesProfileLevelInformation> getProfileAndLevelInformation() {
    return profileAndLevelInformation;
  }

  public void setProfileAndLevelInformation(List<EmbyMediaModelTypesProfileLevelInformation> profileAndLevelInformation) {
    this.profileAndLevelInformation = profileAndLevelInformation;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase id(String id) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase direction(EmbyMediaModelEnumsCodecDirections direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")
  public EmbyMediaModelEnumsCodecDirections getDirection() {
    return direction;
  }

  public void setDirection(EmbyMediaModelEnumsCodecDirections direction) {
    this.direction = direction;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase name(String name) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase description(String description) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase frameworkCodec(String frameworkCodec) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase isHardwareCodec(Boolean isHardwareCodec) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase secondaryFramework(EmbyMediaModelEnumsSecondaryFrameworks secondaryFramework) {
    this.secondaryFramework = secondaryFramework;
    return this;
  }

   /**
   * Get secondaryFramework
   * @return secondaryFramework
  **/
  @Schema(description = "")
  public EmbyMediaModelEnumsSecondaryFrameworks getSecondaryFramework() {
    return secondaryFramework;
  }

  public void setSecondaryFramework(EmbyMediaModelEnumsSecondaryFrameworks secondaryFramework) {
    this.secondaryFramework = secondaryFramework;
  }

  public MediaEncodingCodecsVideoCodecsVideoCodecBase secondaryFrameworkCodec(String secondaryFrameworkCodec) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase maxInstanceCount(Integer maxInstanceCount) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase isEnabledByDefault(Boolean isEnabledByDefault) {
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

  public MediaEncodingCodecsVideoCodecsVideoCodecBase defaultPriority(Integer defaultPriority) {
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
    MediaEncodingCodecsVideoCodecsVideoCodecBase mediaEncodingCodecsVideoCodecsVideoCodecBase = (MediaEncodingCodecsVideoCodecsVideoCodecBase) o;
    return Objects.equals(this.codecDeviceInfo, mediaEncodingCodecsVideoCodecsVideoCodecBase.codecDeviceInfo) &&
        Objects.equals(this.codecKind, mediaEncodingCodecsVideoCodecsVideoCodecBase.codecKind) &&
        Objects.equals(this.mediaTypeName, mediaEncodingCodecsVideoCodecsVideoCodecBase.mediaTypeName) &&
        Objects.equals(this.videoMediaType, mediaEncodingCodecsVideoCodecsVideoCodecBase.videoMediaType) &&
        Objects.equals(this.minWidth, mediaEncodingCodecsVideoCodecsVideoCodecBase.minWidth) &&
        Objects.equals(this.maxWidth, mediaEncodingCodecsVideoCodecsVideoCodecBase.maxWidth) &&
        Objects.equals(this.minHeight, mediaEncodingCodecsVideoCodecsVideoCodecBase.minHeight) &&
        Objects.equals(this.maxHeight, mediaEncodingCodecsVideoCodecsVideoCodecBase.maxHeight) &&
        Objects.equals(this.widthAlignment, mediaEncodingCodecsVideoCodecsVideoCodecBase.widthAlignment) &&
        Objects.equals(this.heightAlignment, mediaEncodingCodecsVideoCodecsVideoCodecBase.heightAlignment) &&
        Objects.equals(this.maxBitRate, mediaEncodingCodecsVideoCodecsVideoCodecBase.maxBitRate) &&
        Objects.equals(this.supportedColorFormats, mediaEncodingCodecsVideoCodecsVideoCodecBase.supportedColorFormats) &&
        Objects.equals(this.supportedColorFormatStrings, mediaEncodingCodecsVideoCodecsVideoCodecBase.supportedColorFormatStrings) &&
        Objects.equals(this.profileAndLevelInformation, mediaEncodingCodecsVideoCodecsVideoCodecBase.profileAndLevelInformation) &&
        Objects.equals(this.id, mediaEncodingCodecsVideoCodecsVideoCodecBase.id) &&
        Objects.equals(this.direction, mediaEncodingCodecsVideoCodecsVideoCodecBase.direction) &&
        Objects.equals(this.name, mediaEncodingCodecsVideoCodecsVideoCodecBase.name) &&
        Objects.equals(this.description, mediaEncodingCodecsVideoCodecsVideoCodecBase.description) &&
        Objects.equals(this.frameworkCodec, mediaEncodingCodecsVideoCodecsVideoCodecBase.frameworkCodec) &&
        Objects.equals(this.isHardwareCodec, mediaEncodingCodecsVideoCodecsVideoCodecBase.isHardwareCodec) &&
        Objects.equals(this.secondaryFramework, mediaEncodingCodecsVideoCodecsVideoCodecBase.secondaryFramework) &&
        Objects.equals(this.secondaryFrameworkCodec, mediaEncodingCodecsVideoCodecsVideoCodecBase.secondaryFrameworkCodec) &&
        Objects.equals(this.maxInstanceCount, mediaEncodingCodecsVideoCodecsVideoCodecBase.maxInstanceCount) &&
        Objects.equals(this.isEnabledByDefault, mediaEncodingCodecsVideoCodecsVideoCodecBase.isEnabledByDefault) &&
        Objects.equals(this.defaultPriority, mediaEncodingCodecsVideoCodecsVideoCodecBase.defaultPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codecDeviceInfo, codecKind, mediaTypeName, videoMediaType, minWidth, maxWidth, minHeight, maxHeight, widthAlignment, heightAlignment, maxBitRate, supportedColorFormats, supportedColorFormatStrings, profileAndLevelInformation, id, direction, name, description, frameworkCodec, isHardwareCodec, secondaryFramework, secondaryFrameworkCodec, maxInstanceCount, isEnabledByDefault, defaultPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingCodecsVideoCodecsVideoCodecBase {\n");
    
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
