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
import io.swagger.client.model.PackageVersionClass;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Class PackageVersionInfo  
 */
@Schema(description = "Class PackageVersionInfo  ")

public class PackageVersionInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("versionStr")
  private String versionStr = null;

  @SerializedName("classification")
  private PackageVersionClass classification = null;

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

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  public PackageVersionInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageVersionInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * The guid.
   * @return guid
  **/
  @Schema(description = "The guid.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public PackageVersionInfo versionStr(String versionStr) {
    this.versionStr = versionStr;
    return this;
  }

   /**
   * The version STR.
   * @return versionStr
  **/
  @Schema(description = "The version STR.")
  public String getVersionStr() {
    return versionStr;
  }

  public void setVersionStr(String versionStr) {
    this.versionStr = versionStr;
  }

  public PackageVersionInfo classification(PackageVersionClass classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @Schema(description = "")
  public PackageVersionClass getClassification() {
    return classification;
  }

  public void setClassification(PackageVersionClass classification) {
    this.classification = classification;
  }

  public PackageVersionInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description.
   * @return description
  **/
  @Schema(description = "The description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PackageVersionInfo requiredVersionStr(String requiredVersionStr) {
    this.requiredVersionStr = requiredVersionStr;
    return this;
  }

   /**
   * The required version STR.
   * @return requiredVersionStr
  **/
  @Schema(description = "The required version STR.")
  public String getRequiredVersionStr() {
    return requiredVersionStr;
  }

  public void setRequiredVersionStr(String requiredVersionStr) {
    this.requiredVersionStr = requiredVersionStr;
  }

  public PackageVersionInfo sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * The source URL.
   * @return sourceUrl
  **/
  @Schema(description = "The source URL.")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public PackageVersionInfo checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * The source URL.
   * @return checksum
  **/
  @Schema(description = "The source URL.")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public PackageVersionInfo targetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
    return this;
  }

   /**
   * The target filename.
   * @return targetFilename
  **/
  @Schema(description = "The target filename.")
  public String getTargetFilename() {
    return targetFilename;
  }

  public void setTargetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
  }

  public PackageVersionInfo infoUrl(String infoUrl) {
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

  public PackageVersionInfo runtimes(String runtimes) {
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

  public PackageVersionInfo timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageVersionInfo packageVersionInfo = (PackageVersionInfo) o;
    return Objects.equals(this.name, packageVersionInfo.name) &&
        Objects.equals(this.guid, packageVersionInfo.guid) &&
        Objects.equals(this.versionStr, packageVersionInfo.versionStr) &&
        Objects.equals(this.classification, packageVersionInfo.classification) &&
        Objects.equals(this.description, packageVersionInfo.description) &&
        Objects.equals(this.requiredVersionStr, packageVersionInfo.requiredVersionStr) &&
        Objects.equals(this.sourceUrl, packageVersionInfo.sourceUrl) &&
        Objects.equals(this.checksum, packageVersionInfo.checksum) &&
        Objects.equals(this.targetFilename, packageVersionInfo.targetFilename) &&
        Objects.equals(this.infoUrl, packageVersionInfo.infoUrl) &&
        Objects.equals(this.runtimes, packageVersionInfo.runtimes) &&
        Objects.equals(this.timestamp, packageVersionInfo.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, guid, versionStr, classification, description, requiredVersionStr, sourceUrl, checksum, targetFilename, infoUrl, runtimes, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageVersionInfo {\n");
    
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
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
