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
import io.swagger.client.model.DayOfWeek;
import io.swagger.client.model.LibraryItemLinkType;
import io.swagger.client.model.LiveTvKeywordType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApiBaseItemsRequest
 */


public class ApiBaseItemsRequest {
  @SerializedName("Is4K")
  private Boolean is4K = null;

  @SerializedName("EnableTotalRecordCount")
  private Boolean enableTotalRecordCount = null;

  @SerializedName("RecordingKeyword")
  private String recordingKeyword = null;

  @SerializedName("RecordingKeywordType")
  private LiveTvKeywordType recordingKeywordType = null;

  @SerializedName("RandomSeed")
  private Integer randomSeed = null;

  @SerializedName("GenreIds")
  private String genreIds = null;

  @SerializedName("CollectionIds")
  private String collectionIds = null;

  @SerializedName("TagIds")
  private String tagIds = null;

  @SerializedName("ExcludeTagIds")
  private String excludeTagIds = null;

  @SerializedName("ExcludeArtistIds")
  private String excludeArtistIds = null;

  @SerializedName("AlbumArtistIds")
  private String albumArtistIds = null;

  @SerializedName("ContributingArtistIds")
  private String contributingArtistIds = null;

  @SerializedName("AlbumIds")
  private String albumIds = null;

  @SerializedName("OuterIds")
  private String outerIds = null;

  @SerializedName("ListItemIds")
  private String listItemIds = null;

  @SerializedName("AudioLanguages")
  private String audioLanguages = null;

  @SerializedName("SubtitleLanguages")
  private String subtitleLanguages = null;

  @SerializedName("CanEditItems")
  private Boolean canEditItems = null;

  @SerializedName("GroupItemsInto")
  private LibraryItemLinkType groupItemsInto = null;

  @SerializedName("MinWidth")
  private Integer minWidth = null;

  @SerializedName("MinHeight")
  private Integer minHeight = null;

  @SerializedName("MaxWidth")
  private Integer maxWidth = null;

  @SerializedName("MaxHeight")
  private Integer maxHeight = null;

  @SerializedName("GroupProgramsBySeries")
  private Boolean groupProgramsBySeries = null;

  @SerializedName("AirDays")
  private List<DayOfWeek> airDays = null;

  @SerializedName("IsAiring")
  private Boolean isAiring = null;

  @SerializedName("HasAired")
  private Boolean hasAired = null;

  public ApiBaseItemsRequest is4K(Boolean is4K) {
    this.is4K = is4K;
    return this;
  }

   /**
   * Get is4K
   * @return is4K
  **/
  @Schema(description = "")
  public Boolean isIs4K() {
    return is4K;
  }

  public void setIs4K(Boolean is4K) {
    this.is4K = is4K;
  }

  public ApiBaseItemsRequest enableTotalRecordCount(Boolean enableTotalRecordCount) {
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

  public ApiBaseItemsRequest recordingKeyword(String recordingKeyword) {
    this.recordingKeyword = recordingKeyword;
    return this;
  }

   /**
   * Get recordingKeyword
   * @return recordingKeyword
  **/
  @Schema(description = "")
  public String getRecordingKeyword() {
    return recordingKeyword;
  }

  public void setRecordingKeyword(String recordingKeyword) {
    this.recordingKeyword = recordingKeyword;
  }

  public ApiBaseItemsRequest recordingKeywordType(LiveTvKeywordType recordingKeywordType) {
    this.recordingKeywordType = recordingKeywordType;
    return this;
  }

   /**
   * Get recordingKeywordType
   * @return recordingKeywordType
  **/
  @Schema(description = "")
  public LiveTvKeywordType getRecordingKeywordType() {
    return recordingKeywordType;
  }

  public void setRecordingKeywordType(LiveTvKeywordType recordingKeywordType) {
    this.recordingKeywordType = recordingKeywordType;
  }

  public ApiBaseItemsRequest randomSeed(Integer randomSeed) {
    this.randomSeed = randomSeed;
    return this;
  }

   /**
   * Get randomSeed
   * @return randomSeed
  **/
  @Schema(description = "")
  public Integer getRandomSeed() {
    return randomSeed;
  }

  public void setRandomSeed(Integer randomSeed) {
    this.randomSeed = randomSeed;
  }

  public ApiBaseItemsRequest genreIds(String genreIds) {
    this.genreIds = genreIds;
    return this;
  }

   /**
   * Get genreIds
   * @return genreIds
  **/
  @Schema(description = "")
  public String getGenreIds() {
    return genreIds;
  }

  public void setGenreIds(String genreIds) {
    this.genreIds = genreIds;
  }

  public ApiBaseItemsRequest collectionIds(String collectionIds) {
    this.collectionIds = collectionIds;
    return this;
  }

   /**
   * Get collectionIds
   * @return collectionIds
  **/
  @Schema(description = "")
  public String getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(String collectionIds) {
    this.collectionIds = collectionIds;
  }

  public ApiBaseItemsRequest tagIds(String tagIds) {
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

  public ApiBaseItemsRequest excludeTagIds(String excludeTagIds) {
    this.excludeTagIds = excludeTagIds;
    return this;
  }

   /**
   * Get excludeTagIds
   * @return excludeTagIds
  **/
  @Schema(description = "")
  public String getExcludeTagIds() {
    return excludeTagIds;
  }

  public void setExcludeTagIds(String excludeTagIds) {
    this.excludeTagIds = excludeTagIds;
  }

  public ApiBaseItemsRequest excludeArtistIds(String excludeArtistIds) {
    this.excludeArtistIds = excludeArtistIds;
    return this;
  }

   /**
   * Get excludeArtistIds
   * @return excludeArtistIds
  **/
  @Schema(description = "")
  public String getExcludeArtistIds() {
    return excludeArtistIds;
  }

  public void setExcludeArtistIds(String excludeArtistIds) {
    this.excludeArtistIds = excludeArtistIds;
  }

  public ApiBaseItemsRequest albumArtistIds(String albumArtistIds) {
    this.albumArtistIds = albumArtistIds;
    return this;
  }

   /**
   * Get albumArtistIds
   * @return albumArtistIds
  **/
  @Schema(description = "")
  public String getAlbumArtistIds() {
    return albumArtistIds;
  }

  public void setAlbumArtistIds(String albumArtistIds) {
    this.albumArtistIds = albumArtistIds;
  }

  public ApiBaseItemsRequest contributingArtistIds(String contributingArtistIds) {
    this.contributingArtistIds = contributingArtistIds;
    return this;
  }

   /**
   * Get contributingArtistIds
   * @return contributingArtistIds
  **/
  @Schema(description = "")
  public String getContributingArtistIds() {
    return contributingArtistIds;
  }

  public void setContributingArtistIds(String contributingArtistIds) {
    this.contributingArtistIds = contributingArtistIds;
  }

  public ApiBaseItemsRequest albumIds(String albumIds) {
    this.albumIds = albumIds;
    return this;
  }

   /**
   * Get albumIds
   * @return albumIds
  **/
  @Schema(description = "")
  public String getAlbumIds() {
    return albumIds;
  }

  public void setAlbumIds(String albumIds) {
    this.albumIds = albumIds;
  }

  public ApiBaseItemsRequest outerIds(String outerIds) {
    this.outerIds = outerIds;
    return this;
  }

   /**
   * Get outerIds
   * @return outerIds
  **/
  @Schema(description = "")
  public String getOuterIds() {
    return outerIds;
  }

  public void setOuterIds(String outerIds) {
    this.outerIds = outerIds;
  }

  public ApiBaseItemsRequest listItemIds(String listItemIds) {
    this.listItemIds = listItemIds;
    return this;
  }

   /**
   * Get listItemIds
   * @return listItemIds
  **/
  @Schema(description = "")
  public String getListItemIds() {
    return listItemIds;
  }

  public void setListItemIds(String listItemIds) {
    this.listItemIds = listItemIds;
  }

  public ApiBaseItemsRequest audioLanguages(String audioLanguages) {
    this.audioLanguages = audioLanguages;
    return this;
  }

   /**
   * Get audioLanguages
   * @return audioLanguages
  **/
  @Schema(description = "")
  public String getAudioLanguages() {
    return audioLanguages;
  }

  public void setAudioLanguages(String audioLanguages) {
    this.audioLanguages = audioLanguages;
  }

  public ApiBaseItemsRequest subtitleLanguages(String subtitleLanguages) {
    this.subtitleLanguages = subtitleLanguages;
    return this;
  }

   /**
   * Get subtitleLanguages
   * @return subtitleLanguages
  **/
  @Schema(description = "")
  public String getSubtitleLanguages() {
    return subtitleLanguages;
  }

  public void setSubtitleLanguages(String subtitleLanguages) {
    this.subtitleLanguages = subtitleLanguages;
  }

  public ApiBaseItemsRequest canEditItems(Boolean canEditItems) {
    this.canEditItems = canEditItems;
    return this;
  }

   /**
   * Get canEditItems
   * @return canEditItems
  **/
  @Schema(description = "")
  public Boolean isCanEditItems() {
    return canEditItems;
  }

  public void setCanEditItems(Boolean canEditItems) {
    this.canEditItems = canEditItems;
  }

  public ApiBaseItemsRequest groupItemsInto(LibraryItemLinkType groupItemsInto) {
    this.groupItemsInto = groupItemsInto;
    return this;
  }

   /**
   * Get groupItemsInto
   * @return groupItemsInto
  **/
  @Schema(description = "")
  public LibraryItemLinkType getGroupItemsInto() {
    return groupItemsInto;
  }

  public void setGroupItemsInto(LibraryItemLinkType groupItemsInto) {
    this.groupItemsInto = groupItemsInto;
  }

  public ApiBaseItemsRequest minWidth(Integer minWidth) {
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

  public ApiBaseItemsRequest minHeight(Integer minHeight) {
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

  public ApiBaseItemsRequest maxWidth(Integer maxWidth) {
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

  public ApiBaseItemsRequest maxHeight(Integer maxHeight) {
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

  public ApiBaseItemsRequest groupProgramsBySeries(Boolean groupProgramsBySeries) {
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

  public ApiBaseItemsRequest airDays(List<DayOfWeek> airDays) {
    this.airDays = airDays;
    return this;
  }

  public ApiBaseItemsRequest addAirDaysItem(DayOfWeek airDaysItem) {
    if (this.airDays == null) {
      this.airDays = new ArrayList<DayOfWeek>();
    }
    this.airDays.add(airDaysItem);
    return this;
  }

   /**
   * Get airDays
   * @return airDays
  **/
  @Schema(description = "")
  public List<DayOfWeek> getAirDays() {
    return airDays;
  }

  public void setAirDays(List<DayOfWeek> airDays) {
    this.airDays = airDays;
  }

  public ApiBaseItemsRequest isAiring(Boolean isAiring) {
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

  public ApiBaseItemsRequest hasAired(Boolean hasAired) {
    this.hasAired = hasAired;
    return this;
  }

   /**
   * Get hasAired
   * @return hasAired
  **/
  @Schema(description = "")
  public Boolean isHasAired() {
    return hasAired;
  }

  public void setHasAired(Boolean hasAired) {
    this.hasAired = hasAired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiBaseItemsRequest apiBaseItemsRequest = (ApiBaseItemsRequest) o;
    return Objects.equals(this.is4K, apiBaseItemsRequest.is4K) &&
        Objects.equals(this.enableTotalRecordCount, apiBaseItemsRequest.enableTotalRecordCount) &&
        Objects.equals(this.recordingKeyword, apiBaseItemsRequest.recordingKeyword) &&
        Objects.equals(this.recordingKeywordType, apiBaseItemsRequest.recordingKeywordType) &&
        Objects.equals(this.randomSeed, apiBaseItemsRequest.randomSeed) &&
        Objects.equals(this.genreIds, apiBaseItemsRequest.genreIds) &&
        Objects.equals(this.collectionIds, apiBaseItemsRequest.collectionIds) &&
        Objects.equals(this.tagIds, apiBaseItemsRequest.tagIds) &&
        Objects.equals(this.excludeTagIds, apiBaseItemsRequest.excludeTagIds) &&
        Objects.equals(this.excludeArtistIds, apiBaseItemsRequest.excludeArtistIds) &&
        Objects.equals(this.albumArtistIds, apiBaseItemsRequest.albumArtistIds) &&
        Objects.equals(this.contributingArtistIds, apiBaseItemsRequest.contributingArtistIds) &&
        Objects.equals(this.albumIds, apiBaseItemsRequest.albumIds) &&
        Objects.equals(this.outerIds, apiBaseItemsRequest.outerIds) &&
        Objects.equals(this.listItemIds, apiBaseItemsRequest.listItemIds) &&
        Objects.equals(this.audioLanguages, apiBaseItemsRequest.audioLanguages) &&
        Objects.equals(this.subtitleLanguages, apiBaseItemsRequest.subtitleLanguages) &&
        Objects.equals(this.canEditItems, apiBaseItemsRequest.canEditItems) &&
        Objects.equals(this.groupItemsInto, apiBaseItemsRequest.groupItemsInto) &&
        Objects.equals(this.minWidth, apiBaseItemsRequest.minWidth) &&
        Objects.equals(this.minHeight, apiBaseItemsRequest.minHeight) &&
        Objects.equals(this.maxWidth, apiBaseItemsRequest.maxWidth) &&
        Objects.equals(this.maxHeight, apiBaseItemsRequest.maxHeight) &&
        Objects.equals(this.groupProgramsBySeries, apiBaseItemsRequest.groupProgramsBySeries) &&
        Objects.equals(this.airDays, apiBaseItemsRequest.airDays) &&
        Objects.equals(this.isAiring, apiBaseItemsRequest.isAiring) &&
        Objects.equals(this.hasAired, apiBaseItemsRequest.hasAired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(is4K, enableTotalRecordCount, recordingKeyword, recordingKeywordType, randomSeed, genreIds, collectionIds, tagIds, excludeTagIds, excludeArtistIds, albumArtistIds, contributingArtistIds, albumIds, outerIds, listItemIds, audioLanguages, subtitleLanguages, canEditItems, groupItemsInto, minWidth, minHeight, maxWidth, maxHeight, groupProgramsBySeries, airDays, isAiring, hasAired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiBaseItemsRequest {\n");
    
    sb.append("    is4K: ").append(toIndentedString(is4K)).append("\n");
    sb.append("    enableTotalRecordCount: ").append(toIndentedString(enableTotalRecordCount)).append("\n");
    sb.append("    recordingKeyword: ").append(toIndentedString(recordingKeyword)).append("\n");
    sb.append("    recordingKeywordType: ").append(toIndentedString(recordingKeywordType)).append("\n");
    sb.append("    randomSeed: ").append(toIndentedString(randomSeed)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    collectionIds: ").append(toIndentedString(collectionIds)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    excludeTagIds: ").append(toIndentedString(excludeTagIds)).append("\n");
    sb.append("    excludeArtistIds: ").append(toIndentedString(excludeArtistIds)).append("\n");
    sb.append("    albumArtistIds: ").append(toIndentedString(albumArtistIds)).append("\n");
    sb.append("    contributingArtistIds: ").append(toIndentedString(contributingArtistIds)).append("\n");
    sb.append("    albumIds: ").append(toIndentedString(albumIds)).append("\n");
    sb.append("    outerIds: ").append(toIndentedString(outerIds)).append("\n");
    sb.append("    listItemIds: ").append(toIndentedString(listItemIds)).append("\n");
    sb.append("    audioLanguages: ").append(toIndentedString(audioLanguages)).append("\n");
    sb.append("    subtitleLanguages: ").append(toIndentedString(subtitleLanguages)).append("\n");
    sb.append("    canEditItems: ").append(toIndentedString(canEditItems)).append("\n");
    sb.append("    groupItemsInto: ").append(toIndentedString(groupItemsInto)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    groupProgramsBySeries: ").append(toIndentedString(groupProgramsBySeries)).append("\n");
    sb.append("    airDays: ").append(toIndentedString(airDays)).append("\n");
    sb.append("    isAiring: ").append(toIndentedString(isAiring)).append("\n");
    sb.append("    hasAired: ").append(toIndentedString(hasAired)).append("\n");
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
