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
import io.swagger.client.model.ImageType;
import io.swagger.client.model.RatingType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Class RemoteImageInfo  
 */
@Schema(description = "Class RemoteImageInfo  ")

public class RemoteImageInfo {
  @SerializedName("ProviderName")
  private String providerName = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("ThumbnailUrl")
  private String thumbnailUrl = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("CommunityRating")
  private Double communityRating = null;

  @SerializedName("VoteCount")
  private Integer voteCount = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("DisplayLanguage")
  private String displayLanguage = null;

  @SerializedName("Type")
  private ImageType type = null;

  @SerializedName("RatingType")
  private RatingType ratingType = null;

  public RemoteImageInfo providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the provider.
   * @return providerName
  **/
  @Schema(description = "The name of the provider.")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public RemoteImageInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL.
   * @return url
  **/
  @Schema(description = "The URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RemoteImageInfo thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * A url used for previewing a smaller version
   * @return thumbnailUrl
  **/
  @Schema(description = "A url used for previewing a smaller version")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public RemoteImageInfo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height.
   * @return height
  **/
  @Schema(description = "The height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public RemoteImageInfo width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width.
   * @return width
  **/
  @Schema(description = "The width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public RemoteImageInfo communityRating(Double communityRating) {
    this.communityRating = communityRating;
    return this;
  }

   /**
   * The community rating.
   * @return communityRating
  **/
  @Schema(description = "The community rating.")
  public Double getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(Double communityRating) {
    this.communityRating = communityRating;
  }

  public RemoteImageInfo voteCount(Integer voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * The vote count.
   * @return voteCount
  **/
  @Schema(description = "The vote count.")
  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }

  public RemoteImageInfo language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language.
   * @return language
  **/
  @Schema(description = "The language.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public RemoteImageInfo displayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
    return this;
  }

   /**
   * Get displayLanguage
   * @return displayLanguage
  **/
  @Schema(description = "")
  public String getDisplayLanguage() {
    return displayLanguage;
  }

  public void setDisplayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
  }

  public RemoteImageInfo type(ImageType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
    this.type = type;
  }

  public RemoteImageInfo ratingType(RatingType ratingType) {
    this.ratingType = ratingType;
    return this;
  }

   /**
   * Get ratingType
   * @return ratingType
  **/
  @Schema(description = "")
  public RatingType getRatingType() {
    return ratingType;
  }

  public void setRatingType(RatingType ratingType) {
    this.ratingType = ratingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteImageInfo remoteImageInfo = (RemoteImageInfo) o;
    return Objects.equals(this.providerName, remoteImageInfo.providerName) &&
        Objects.equals(this.url, remoteImageInfo.url) &&
        Objects.equals(this.thumbnailUrl, remoteImageInfo.thumbnailUrl) &&
        Objects.equals(this.height, remoteImageInfo.height) &&
        Objects.equals(this.width, remoteImageInfo.width) &&
        Objects.equals(this.communityRating, remoteImageInfo.communityRating) &&
        Objects.equals(this.voteCount, remoteImageInfo.voteCount) &&
        Objects.equals(this.language, remoteImageInfo.language) &&
        Objects.equals(this.displayLanguage, remoteImageInfo.displayLanguage) &&
        Objects.equals(this.type, remoteImageInfo.type) &&
        Objects.equals(this.ratingType, remoteImageInfo.ratingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, url, thumbnailUrl, height, width, communityRating, voteCount, language, displayLanguage, type, ratingType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteImageInfo {\n");
    
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    displayLanguage: ").append(toIndentedString(displayLanguage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ratingType: ").append(toIndentedString(ratingType)).append("\n");
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
