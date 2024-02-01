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
import org.threeten.bp.OffsetDateTime;
/**
 * RemoteSubtitleInfo
 */


public class RemoteSubtitleInfo {
  @SerializedName("ThreeLetterISOLanguageName")
  private String threeLetterISOLanguageName = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ProviderName")
  private String providerName = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Format")
  private String format = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("CommunityRating")
  private Float communityRating = null;

  @SerializedName("DownloadCount")
  private Integer downloadCount = null;

  @SerializedName("IsHashMatch")
  private Boolean isHashMatch = null;

  @SerializedName("IsForced")
  private Boolean isForced = null;

  @SerializedName("IsHearingImpaired")
  private Boolean isHearingImpaired = null;

  @SerializedName("Language")
  private String language = null;

  public RemoteSubtitleInfo threeLetterISOLanguageName(String threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = threeLetterISOLanguageName;
    return this;
  }

   /**
   * Use language instead to return the language specified by the subtitle provider
   * @return threeLetterISOLanguageName
  **/
  @Schema(description = "Use language instead to return the language specified by the subtitle provider")
  public String getThreeLetterISOLanguageName() {
    return threeLetterISOLanguageName;
  }

  public void setThreeLetterISOLanguageName(String threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = threeLetterISOLanguageName;
  }

  public RemoteSubtitleInfo id(String id) {
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

  public RemoteSubtitleInfo providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @Schema(description = "")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public RemoteSubtitleInfo name(String name) {
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

  public RemoteSubtitleInfo format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public RemoteSubtitleInfo author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public RemoteSubtitleInfo comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public RemoteSubtitleInfo dateCreated(OffsetDateTime dateCreated) {
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

  public RemoteSubtitleInfo communityRating(Float communityRating) {
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

  public RemoteSubtitleInfo downloadCount(Integer downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

   /**
   * Get downloadCount
   * @return downloadCount
  **/
  @Schema(description = "")
  public Integer getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(Integer downloadCount) {
    this.downloadCount = downloadCount;
  }

  public RemoteSubtitleInfo isHashMatch(Boolean isHashMatch) {
    this.isHashMatch = isHashMatch;
    return this;
  }

   /**
   * Get isHashMatch
   * @return isHashMatch
  **/
  @Schema(description = "")
  public Boolean isIsHashMatch() {
    return isHashMatch;
  }

  public void setIsHashMatch(Boolean isHashMatch) {
    this.isHashMatch = isHashMatch;
  }

  public RemoteSubtitleInfo isForced(Boolean isForced) {
    this.isForced = isForced;
    return this;
  }

   /**
   * Get isForced
   * @return isForced
  **/
  @Schema(description = "")
  public Boolean isIsForced() {
    return isForced;
  }

  public void setIsForced(Boolean isForced) {
    this.isForced = isForced;
  }

  public RemoteSubtitleInfo isHearingImpaired(Boolean isHearingImpaired) {
    this.isHearingImpaired = isHearingImpaired;
    return this;
  }

   /**
   * Get isHearingImpaired
   * @return isHearingImpaired
  **/
  @Schema(description = "")
  public Boolean isIsHearingImpaired() {
    return isHearingImpaired;
  }

  public void setIsHearingImpaired(Boolean isHearingImpaired) {
    this.isHearingImpaired = isHearingImpaired;
  }

  public RemoteSubtitleInfo language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSubtitleInfo remoteSubtitleInfo = (RemoteSubtitleInfo) o;
    return Objects.equals(this.threeLetterISOLanguageName, remoteSubtitleInfo.threeLetterISOLanguageName) &&
        Objects.equals(this.id, remoteSubtitleInfo.id) &&
        Objects.equals(this.providerName, remoteSubtitleInfo.providerName) &&
        Objects.equals(this.name, remoteSubtitleInfo.name) &&
        Objects.equals(this.format, remoteSubtitleInfo.format) &&
        Objects.equals(this.author, remoteSubtitleInfo.author) &&
        Objects.equals(this.comment, remoteSubtitleInfo.comment) &&
        Objects.equals(this.dateCreated, remoteSubtitleInfo.dateCreated) &&
        Objects.equals(this.communityRating, remoteSubtitleInfo.communityRating) &&
        Objects.equals(this.downloadCount, remoteSubtitleInfo.downloadCount) &&
        Objects.equals(this.isHashMatch, remoteSubtitleInfo.isHashMatch) &&
        Objects.equals(this.isForced, remoteSubtitleInfo.isForced) &&
        Objects.equals(this.isHearingImpaired, remoteSubtitleInfo.isHearingImpaired) &&
        Objects.equals(this.language, remoteSubtitleInfo.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeLetterISOLanguageName, id, providerName, name, format, author, comment, dateCreated, communityRating, downloadCount, isHashMatch, isForced, isHearingImpaired, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteSubtitleInfo {\n");
    
    sb.append("    threeLetterISOLanguageName: ").append(toIndentedString(threeLetterISOLanguageName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
    sb.append("    isHashMatch: ").append(toIndentedString(isHashMatch)).append("\n");
    sb.append("    isForced: ").append(toIndentedString(isForced)).append("\n");
    sb.append("    isHearingImpaired: ").append(toIndentedString(isHearingImpaired)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
