/*
 * Emby REST API
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
import io.swagger.client.model.UpdatesPackageVersionClass;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdatesPackageVersionInfo
 */


public class UpdatesPackageVersionInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("versionStr")
  private String versionStr = null;

  @SerializedName("classification")
  private UpdatesPackageVersionClass classification = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("requiredVersionStr")
  private String requiredVersionStr = null;

  @SerializedName("sourceUrl")
  private String sourceUrl = null;

  @SerializedName("checksum")
  private String checksum = null;

  @SerializedName("targetFilename")
  private String targetFilename = null;

  @SerializedName("infoUrl")
  private String infoUrl = null;

  @SerializedName("runtimes")
  private String runtimes = null;

  public UpdatesPackageVersionInfo name(String name) {
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

  public UpdatesPackageVersionInfo guid(String guid) {
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

  public UpdatesPackageVersionInfo versionStr(String versionStr) {
    this.versionStr = versionStr;
    return this;
  }

   /**
   * Get versionStr
   * @return versionStr
  **/
  @Schema(description = "")
  public String getVersionStr() {
    return versionStr;
  }

  public void setVersionStr(String versionStr) {
    this.versionStr = versionStr;
  }

  public UpdatesPackageVersionInfo classification(UpdatesPackageVersionClass classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @Schema(description = "")
  public UpdatesPackageVersionClass getClassification() {
    return classification;
  }

  public void setClassification(UpdatesPackageVersionClass classification) {
    this.classification = classification;
  }

  public UpdatesPackageVersionInfo description(String description) {
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

  public UpdatesPackageVersionInfo requiredVersionStr(String requiredVersionStr) {
    this.requiredVersionStr = requiredVersionStr;
    return this;
  }

   /**
   * Get requiredVersionStr
   * @return requiredVersionStr
  **/
  @Schema(description = "")
  public String getRequiredVersionStr() {
    return requiredVersionStr;
  }

  public void setRequiredVersionStr(String requiredVersionStr) {
    this.requiredVersionStr = requiredVersionStr;
  }

  public UpdatesPackageVersionInfo sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @Schema(description = "")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public UpdatesPackageVersionInfo checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * Get checksum
   * @return checksum
  **/
  @Schema(description = "")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public UpdatesPackageVersionInfo targetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
    return this;
  }

   /**
   * Get targetFilename
   * @return targetFilename
  **/
  @Schema(description = "")
  public String getTargetFilename() {
    return targetFilename;
  }

  public void setTargetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
  }

  public UpdatesPackageVersionInfo infoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
    return this;
  }

   /**
   * Get infoUrl
   * @return infoUrl
  **/
  @Schema(description = "")
  public String getInfoUrl() {
    return infoUrl;
  }

  public void setInfoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
  }

  public UpdatesPackageVersionInfo runtimes(String runtimes) {
    this.runtimes = runtimes;
    return this;
  }

   /**
   * Get runtimes
   * @return runtimes
  **/
  @Schema(description = "")
  public String getRuntimes() {
    return runtimes;
  }

  public void setRuntimes(String runtimes) {
    this.runtimes = runtimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatesPackageVersionInfo updatesPackageVersionInfo = (UpdatesPackageVersionInfo) o;
    return Objects.equals(this.name, updatesPackageVersionInfo.name) &&
        Objects.equals(this.guid, updatesPackageVersionInfo.guid) &&
        Objects.equals(this.versionStr, updatesPackageVersionInfo.versionStr) &&
        Objects.equals(this.classification, updatesPackageVersionInfo.classification) &&
        Objects.equals(this.description, updatesPackageVersionInfo.description) &&
        Objects.equals(this.requiredVersionStr, updatesPackageVersionInfo.requiredVersionStr) &&
        Objects.equals(this.sourceUrl, updatesPackageVersionInfo.sourceUrl) &&
        Objects.equals(this.checksum, updatesPackageVersionInfo.checksum) &&
        Objects.equals(this.targetFilename, updatesPackageVersionInfo.targetFilename) &&
        Objects.equals(this.infoUrl, updatesPackageVersionInfo.infoUrl) &&
        Objects.equals(this.runtimes, updatesPackageVersionInfo.runtimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, guid, versionStr, classification, description, requiredVersionStr, sourceUrl, checksum, targetFilename, infoUrl, runtimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatesPackageVersionInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    versionStr: ").append(toIndentedString(versionStr)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requiredVersionStr: ").append(toIndentedString(requiredVersionStr)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    targetFilename: ").append(toIndentedString(targetFilename)).append("\n");
    sb.append("    infoUrl: ").append(toIndentedString(infoUrl)).append("\n");
    sb.append("    runtimes: ").append(toIndentedString(runtimes)).append("\n");
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
