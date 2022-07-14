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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LiveTVApiGetPrograms
 */


public class LiveTVApiGetPrograms {
  @SerializedName("IsAiring")
  private Boolean isAiring = null;

  @SerializedName("TagIds")
  private String tagIds = null;

  @SerializedName("ExcludeItemIds")
  private String excludeItemIds = null;

  @SerializedName("EnableTotalRecordCount")
  private Boolean enableTotalRecordCount = null;

  @SerializedName("SeriesTimerId")
  private String seriesTimerId = null;

  @SerializedName("LibrarySeriesId")
  private String librarySeriesId = null;

  @SerializedName("SeriesFromProgramId")
  private String seriesFromProgramId = null;

  @SerializedName("ShowingsFromProgramId")
  private String showingsFromProgramId = null;

  @SerializedName("GroupProgramsBySeries")
  private Boolean groupProgramsBySeries = null;

  public LiveTVApiGetPrograms isAiring(Boolean isAiring) {
    this.isAiring = isAiring;
    return this;
  }

   /**
   * Get isAiring
   * @return isAiring
  **/
  @Schema(description = "")
  public Boolean isIsAiring() {
    return isAiring;
  }

  public void setIsAiring(Boolean isAiring) {
    this.isAiring = isAiring;
  }

  public LiveTVApiGetPrograms tagIds(String tagIds) {
    this.tagIds = tagIds;
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @Schema(description = "")
  public String getTagIds() {
    return tagIds;
  }

  public void setTagIds(String tagIds) {
    this.tagIds = tagIds;
  }

  public LiveTVApiGetPrograms excludeItemIds(String excludeItemIds) {
    this.excludeItemIds = excludeItemIds;
    return this;
  }

   /**
   * Get excludeItemIds
   * @return excludeItemIds
  **/
  @Schema(description = "")
  public String getExcludeItemIds() {
    return excludeItemIds;
  }

  public void setExcludeItemIds(String excludeItemIds) {
    this.excludeItemIds = excludeItemIds;
  }

  public LiveTVApiGetPrograms enableTotalRecordCount(Boolean enableTotalRecordCount) {
    this.enableTotalRecordCount = enableTotalRecordCount;
    return this;
  }

   /**
   * Get enableTotalRecordCount
   * @return enableTotalRecordCount
  **/
  @Schema(description = "")
  public Boolean isEnableTotalRecordCount() {
    return enableTotalRecordCount;
  }

  public void setEnableTotalRecordCount(Boolean enableTotalRecordCount) {
    this.enableTotalRecordCount = enableTotalRecordCount;
  }

  public LiveTVApiGetPrograms seriesTimerId(String seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
    return this;
  }

   /**
   * Get seriesTimerId
   * @return seriesTimerId
  **/
  @Schema(description = "")
  public String getSeriesTimerId() {
    return seriesTimerId;
  }

  public void setSeriesTimerId(String seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
  }

  public LiveTVApiGetPrograms librarySeriesId(String librarySeriesId) {
    this.librarySeriesId = librarySeriesId;
    return this;
  }

   /**
   * Get librarySeriesId
   * @return librarySeriesId
  **/
  @Schema(description = "")
  public String getLibrarySeriesId() {
    return librarySeriesId;
  }

  public void setLibrarySeriesId(String librarySeriesId) {
    this.librarySeriesId = librarySeriesId;
  }

  public LiveTVApiGetPrograms seriesFromProgramId(String seriesFromProgramId) {
    this.seriesFromProgramId = seriesFromProgramId;
    return this;
  }

   /**
   * Get seriesFromProgramId
   * @return seriesFromProgramId
  **/
  @Schema(description = "")
  public String getSeriesFromProgramId() {
    return seriesFromProgramId;
  }

  public void setSeriesFromProgramId(String seriesFromProgramId) {
    this.seriesFromProgramId = seriesFromProgramId;
  }

  public LiveTVApiGetPrograms showingsFromProgramId(String showingsFromProgramId) {
    this.showingsFromProgramId = showingsFromProgramId;
    return this;
  }

   /**
   * Get showingsFromProgramId
   * @return showingsFromProgramId
  **/
  @Schema(description = "")
  public String getShowingsFromProgramId() {
    return showingsFromProgramId;
  }

  public void setShowingsFromProgramId(String showingsFromProgramId) {
    this.showingsFromProgramId = showingsFromProgramId;
  }

  public LiveTVApiGetPrograms groupProgramsBySeries(Boolean groupProgramsBySeries) {
    this.groupProgramsBySeries = groupProgramsBySeries;
    return this;
  }

   /**
   * Get groupProgramsBySeries
   * @return groupProgramsBySeries
  **/
  @Schema(description = "")
  public Boolean isGroupProgramsBySeries() {
    return groupProgramsBySeries;
  }

  public void setGroupProgramsBySeries(Boolean groupProgramsBySeries) {
    this.groupProgramsBySeries = groupProgramsBySeries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTVApiGetPrograms liveTVApiGetPrograms = (LiveTVApiGetPrograms) o;
    return Objects.equals(this.isAiring, liveTVApiGetPrograms.isAiring) &&
        Objects.equals(this.tagIds, liveTVApiGetPrograms.tagIds) &&
        Objects.equals(this.excludeItemIds, liveTVApiGetPrograms.excludeItemIds) &&
        Objects.equals(this.enableTotalRecordCount, liveTVApiGetPrograms.enableTotalRecordCount) &&
        Objects.equals(this.seriesTimerId, liveTVApiGetPrograms.seriesTimerId) &&
        Objects.equals(this.librarySeriesId, liveTVApiGetPrograms.librarySeriesId) &&
        Objects.equals(this.seriesFromProgramId, liveTVApiGetPrograms.seriesFromProgramId) &&
        Objects.equals(this.showingsFromProgramId, liveTVApiGetPrograms.showingsFromProgramId) &&
        Objects.equals(this.groupProgramsBySeries, liveTVApiGetPrograms.groupProgramsBySeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAiring, tagIds, excludeItemIds, enableTotalRecordCount, seriesTimerId, librarySeriesId, seriesFromProgramId, showingsFromProgramId, groupProgramsBySeries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTVApiGetPrograms {\n");
    
    sb.append("    isAiring: ").append(toIndentedString(isAiring)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    excludeItemIds: ").append(toIndentedString(excludeItemIds)).append("\n");
    sb.append("    enableTotalRecordCount: ").append(toIndentedString(enableTotalRecordCount)).append("\n");
    sb.append("    seriesTimerId: ").append(toIndentedString(seriesTimerId)).append("\n");
    sb.append("    librarySeriesId: ").append(toIndentedString(librarySeriesId)).append("\n");
    sb.append("    seriesFromProgramId: ").append(toIndentedString(seriesFromProgramId)).append("\n");
    sb.append("    showingsFromProgramId: ").append(toIndentedString(showingsFromProgramId)).append("\n");
    sb.append("    groupProgramsBySeries: ").append(toIndentedString(groupProgramsBySeries)).append("\n");
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
