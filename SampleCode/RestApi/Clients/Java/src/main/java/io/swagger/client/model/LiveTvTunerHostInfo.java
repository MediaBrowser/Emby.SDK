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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LiveTvTunerHostInfo
 */


public class LiveTvTunerHostInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("FriendlyName")
  private String friendlyName = null;

  @SerializedName("SetupUrl")
  private String setupUrl = null;

  @SerializedName("ImportFavoritesOnly")
  private Boolean importFavoritesOnly = null;

  @SerializedName("PreferEpgChannelImages")
  private Boolean preferEpgChannelImages = null;

  @SerializedName("PreferEpgChannelNumbers")
  private Boolean preferEpgChannelNumbers = null;

  @SerializedName("AllowHWTranscoding")
  private Boolean allowHWTranscoding = null;

  @SerializedName("AllowMappingByNumber")
  private Boolean allowMappingByNumber = null;

  @SerializedName("ImportGuideData")
  private Boolean importGuideData = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("TunerCount")
  private Integer tunerCount = null;

  @SerializedName("UserAgent")
  private String userAgent = null;

  @SerializedName("Referrer")
  private String referrer = null;

  @SerializedName("ProviderOptions")
  private String providerOptions = null;

  @SerializedName("DataVersion")
  private Integer dataVersion = null;

  public LiveTvTunerHostInfo id(String id) {
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

  public LiveTvTunerHostInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LiveTvTunerHostInfo type(String type) {
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

  public LiveTvTunerHostInfo deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @Schema(description = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public LiveTvTunerHostInfo friendlyName(String friendlyName) {
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

  public LiveTvTunerHostInfo setupUrl(String setupUrl) {
    this.setupUrl = setupUrl;
    return this;
  }

   /**
   * Get setupUrl
   * @return setupUrl
  **/
  @Schema(description = "")
  public String getSetupUrl() {
    return setupUrl;
  }

  public void setSetupUrl(String setupUrl) {
    this.setupUrl = setupUrl;
  }

  public LiveTvTunerHostInfo importFavoritesOnly(Boolean importFavoritesOnly) {
    this.importFavoritesOnly = importFavoritesOnly;
    return this;
  }

   /**
   * Get importFavoritesOnly
   * @return importFavoritesOnly
  **/
  @Schema(description = "")
  public Boolean isImportFavoritesOnly() {
    return importFavoritesOnly;
  }

  public void setImportFavoritesOnly(Boolean importFavoritesOnly) {
    this.importFavoritesOnly = importFavoritesOnly;
  }

  public LiveTvTunerHostInfo preferEpgChannelImages(Boolean preferEpgChannelImages) {
    this.preferEpgChannelImages = preferEpgChannelImages;
    return this;
  }

   /**
   * Get preferEpgChannelImages
   * @return preferEpgChannelImages
  **/
  @Schema(description = "")
  public Boolean isPreferEpgChannelImages() {
    return preferEpgChannelImages;
  }

  public void setPreferEpgChannelImages(Boolean preferEpgChannelImages) {
    this.preferEpgChannelImages = preferEpgChannelImages;
  }

  public LiveTvTunerHostInfo preferEpgChannelNumbers(Boolean preferEpgChannelNumbers) {
    this.preferEpgChannelNumbers = preferEpgChannelNumbers;
    return this;
  }

   /**
   * Get preferEpgChannelNumbers
   * @return preferEpgChannelNumbers
  **/
  @Schema(description = "")
  public Boolean isPreferEpgChannelNumbers() {
    return preferEpgChannelNumbers;
  }

  public void setPreferEpgChannelNumbers(Boolean preferEpgChannelNumbers) {
    this.preferEpgChannelNumbers = preferEpgChannelNumbers;
  }

  public LiveTvTunerHostInfo allowHWTranscoding(Boolean allowHWTranscoding) {
    this.allowHWTranscoding = allowHWTranscoding;
    return this;
  }

   /**
   * Get allowHWTranscoding
   * @return allowHWTranscoding
  **/
  @Schema(description = "")
  public Boolean isAllowHWTranscoding() {
    return allowHWTranscoding;
  }

  public void setAllowHWTranscoding(Boolean allowHWTranscoding) {
    this.allowHWTranscoding = allowHWTranscoding;
  }

  public LiveTvTunerHostInfo allowMappingByNumber(Boolean allowMappingByNumber) {
    this.allowMappingByNumber = allowMappingByNumber;
    return this;
  }

   /**
   * Get allowMappingByNumber
   * @return allowMappingByNumber
  **/
  @Schema(description = "")
  public Boolean isAllowMappingByNumber() {
    return allowMappingByNumber;
  }

  public void setAllowMappingByNumber(Boolean allowMappingByNumber) {
    this.allowMappingByNumber = allowMappingByNumber;
  }

  public LiveTvTunerHostInfo importGuideData(Boolean importGuideData) {
    this.importGuideData = importGuideData;
    return this;
  }

   /**
   * Get importGuideData
   * @return importGuideData
  **/
  @Schema(description = "")
  public Boolean isImportGuideData() {
    return importGuideData;
  }

  public void setImportGuideData(Boolean importGuideData) {
    this.importGuideData = importGuideData;
  }

  public LiveTvTunerHostInfo source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public LiveTvTunerHostInfo tunerCount(Integer tunerCount) {
    this.tunerCount = tunerCount;
    return this;
  }

   /**
   * Get tunerCount
   * @return tunerCount
  **/
  @Schema(description = "")
  public Integer getTunerCount() {
    return tunerCount;
  }

  public void setTunerCount(Integer tunerCount) {
    this.tunerCount = tunerCount;
  }

  public LiveTvTunerHostInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @Schema(description = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public LiveTvTunerHostInfo referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @Schema(description = "")
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public LiveTvTunerHostInfo providerOptions(String providerOptions) {
    this.providerOptions = providerOptions;
    return this;
  }

   /**
   * Get providerOptions
   * @return providerOptions
  **/
  @Schema(description = "")
  public String getProviderOptions() {
    return providerOptions;
  }

  public void setProviderOptions(String providerOptions) {
    this.providerOptions = providerOptions;
  }

  public LiveTvTunerHostInfo dataVersion(Integer dataVersion) {
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @Schema(description = "")
  public Integer getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(Integer dataVersion) {
    this.dataVersion = dataVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvTunerHostInfo liveTvTunerHostInfo = (LiveTvTunerHostInfo) o;
    return Objects.equals(this.id, liveTvTunerHostInfo.id) &&
        Objects.equals(this.url, liveTvTunerHostInfo.url) &&
        Objects.equals(this.type, liveTvTunerHostInfo.type) &&
        Objects.equals(this.deviceId, liveTvTunerHostInfo.deviceId) &&
        Objects.equals(this.friendlyName, liveTvTunerHostInfo.friendlyName) &&
        Objects.equals(this.setupUrl, liveTvTunerHostInfo.setupUrl) &&
        Objects.equals(this.importFavoritesOnly, liveTvTunerHostInfo.importFavoritesOnly) &&
        Objects.equals(this.preferEpgChannelImages, liveTvTunerHostInfo.preferEpgChannelImages) &&
        Objects.equals(this.preferEpgChannelNumbers, liveTvTunerHostInfo.preferEpgChannelNumbers) &&
        Objects.equals(this.allowHWTranscoding, liveTvTunerHostInfo.allowHWTranscoding) &&
        Objects.equals(this.allowMappingByNumber, liveTvTunerHostInfo.allowMappingByNumber) &&
        Objects.equals(this.importGuideData, liveTvTunerHostInfo.importGuideData) &&
        Objects.equals(this.source, liveTvTunerHostInfo.source) &&
        Objects.equals(this.tunerCount, liveTvTunerHostInfo.tunerCount) &&
        Objects.equals(this.userAgent, liveTvTunerHostInfo.userAgent) &&
        Objects.equals(this.referrer, liveTvTunerHostInfo.referrer) &&
        Objects.equals(this.providerOptions, liveTvTunerHostInfo.providerOptions) &&
        Objects.equals(this.dataVersion, liveTvTunerHostInfo.dataVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, type, deviceId, friendlyName, setupUrl, importFavoritesOnly, preferEpgChannelImages, preferEpgChannelNumbers, allowHWTranscoding, allowMappingByNumber, importGuideData, source, tunerCount, userAgent, referrer, providerOptions, dataVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvTunerHostInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    setupUrl: ").append(toIndentedString(setupUrl)).append("\n");
    sb.append("    importFavoritesOnly: ").append(toIndentedString(importFavoritesOnly)).append("\n");
    sb.append("    preferEpgChannelImages: ").append(toIndentedString(preferEpgChannelImages)).append("\n");
    sb.append("    preferEpgChannelNumbers: ").append(toIndentedString(preferEpgChannelNumbers)).append("\n");
    sb.append("    allowHWTranscoding: ").append(toIndentedString(allowHWTranscoding)).append("\n");
    sb.append("    allowMappingByNumber: ").append(toIndentedString(allowMappingByNumber)).append("\n");
    sb.append("    importGuideData: ").append(toIndentedString(importGuideData)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tunerCount: ").append(toIndentedString(tunerCount)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    providerOptions: ").append(toIndentedString(providerOptions)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
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
