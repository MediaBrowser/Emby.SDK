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
import io.swagger.client.model.MarkerType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Class ChapterInfo  
 */
@Schema(description = "Class ChapterInfo  ")

public class ChapterInfo {
  @SerializedName("StartPositionTicks")
  private Long startPositionTicks = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ImageTag")
  private String imageTag = null;

  @SerializedName("MarkerType")
  private MarkerType markerType = null;

  @SerializedName("ChapterIndex")
  private Integer chapterIndex = null;

  public ChapterInfo startPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
    return this;
  }

   /**
   * The start position ticks.
   * @return startPositionTicks
  **/
  @Schema(description = "The start position ticks.")
  public Long getStartPositionTicks() {
    return startPositionTicks;
  }

  public void setStartPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
  }

  public ChapterInfo name(String name) {
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

  public ChapterInfo imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Get imageTag
   * @return imageTag
  **/
  @Schema(description = "")
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  public ChapterInfo markerType(MarkerType markerType) {
    this.markerType = markerType;
    return this;
  }

   /**
   * Get markerType
   * @return markerType
  **/
  @Schema(description = "")
  public MarkerType getMarkerType() {
    return markerType;
  }

  public void setMarkerType(MarkerType markerType) {
    this.markerType = markerType;
  }

  public ChapterInfo chapterIndex(Integer chapterIndex) {
    this.chapterIndex = chapterIndex;
    return this;
  }

   /**
   * Get chapterIndex
   * @return chapterIndex
  **/
  @Schema(description = "")
  public Integer getChapterIndex() {
    return chapterIndex;
  }

  public void setChapterIndex(Integer chapterIndex) {
    this.chapterIndex = chapterIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChapterInfo chapterInfo = (ChapterInfo) o;
    return Objects.equals(this.startPositionTicks, chapterInfo.startPositionTicks) &&
        Objects.equals(this.name, chapterInfo.name) &&
        Objects.equals(this.imageTag, chapterInfo.imageTag) &&
        Objects.equals(this.markerType, chapterInfo.markerType) &&
        Objects.equals(this.chapterIndex, chapterInfo.chapterIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPositionTicks, name, imageTag, markerType, chapterIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChapterInfo {\n");
    
    sb.append("    startPositionTicks: ").append(toIndentedString(startPositionTicks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    markerType: ").append(toIndentedString(markerType)).append("\n");
    sb.append("    chapterIndex: ").append(toIndentedString(chapterIndex)).append("\n");
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
