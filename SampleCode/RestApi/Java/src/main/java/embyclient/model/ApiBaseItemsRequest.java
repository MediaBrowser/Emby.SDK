/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.DayOfWeek;
import embyclient.model.LibraryItemLinkType;
import embyclient.model.LiveTvKeywordType;
import embyclient.model.PersonType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * ApiBaseItemsRequest
 */


public class ApiBaseItemsRequest {
  @SerializedName("IsSpecialEpisode")
  private Boolean isSpecialEpisode = null;

  @SerializedName("Is4K")
  private Boolean is4K = null;

  @SerializedName("MinDateCreated")
  private OffsetDateTime minDateCreated = null;

  @SerializedName("MaxDateCreated")
  private OffsetDateTime maxDateCreated = null;

  @SerializedName("EnableTotalRecordCount")
  private Boolean enableTotalRecordCount = null;

  @SerializedName("MatchAnyWord")
  private Boolean matchAnyWord = null;

  @SerializedName("IsDuplicate")
  private Boolean isDuplicate = null;

  @SerializedName("Name")
  private String name = null;

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

  @SerializedName("ItemPersonTypes")
  private List<PersonType> itemPersonTypes = null;

  @SerializedName("ExcludeArtistIds")
  private String excludeArtistIds = null;

  @SerializedName("AlbumArtistIds")
  private String albumArtistIds = null;

  @SerializedName("ComposerArtistIds")
  private String composerArtistIds = null;

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

  @SerializedName("IsStandaloneSpecial")
  private Boolean isStandaloneSpecial = null;

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

  @SerializedName("CollectionTypes")
  private String collectionTypes = null;

  @SerializedName("ExcludeSources")
  private List<String> excludeSources = null;

  public ApiBaseItemsRequest isSpecialEpisode(Boolean isSpecialEpisode) {
    this.isSpecialEpisode = isSpecialEpisode;
    return this;
  }

   /**
   * Get isSpecialEpisode
   * @return isSpecialEpisode
  **/
  @Schema(description = "")
  public Boolean isIsSpecialEpisode() {
    return isSpecialEpisode;
  }

  public void setIsSpecialEpisode(Boolean isSpecialEpisode) {
    this.isSpecialEpisode = isSpecialEpisode;
  }

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

  public ApiBaseItemsRequest minDateCreated(OffsetDateTime minDateCreated) {
    this.minDateCreated = minDateCreated;
    return this;
  }

   /**
   * Get minDateCreated
   * @return minDateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getMinDateCreated() {
    return minDateCreated;
  }

  public void setMinDateCreated(OffsetDateTime minDateCreated) {
    this.minDateCreated = minDateCreated;
  }

  public ApiBaseItemsRequest maxDateCreated(OffsetDateTime maxDateCreated) {
    this.maxDateCreated = maxDateCreated;
    return this;
  }

   /**
   * Get maxDateCreated
   * @return maxDateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getMaxDateCreated() {
    return maxDateCreated;
  }

  public void setMaxDateCreated(OffsetDateTime maxDateCreated) {
    this.maxDateCreated = maxDateCreated;
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

  public ApiBaseItemsRequest matchAnyWord(Boolean matchAnyWord) {
    this.matchAnyWord = matchAnyWord;
    return this;
  }

   /**
   * Get matchAnyWord
   * @return matchAnyWord
  **/
  @Schema(description = "")
  public Boolean isMatchAnyWord() {
    return matchAnyWord;
  }

  public void setMatchAnyWord(Boolean matchAnyWord) {
    this.matchAnyWord = matchAnyWord;
  }

  public ApiBaseItemsRequest isDuplicate(Boolean isDuplicate) {
    this.isDuplicate = isDuplicate;
    return this;
  }

   /**
   * Get isDuplicate
   * @return isDuplicate
  **/
  @Schema(description = "")
  public Boolean isIsDuplicate() {
    return isDuplicate;
  }

  public void setIsDuplicate(Boolean isDuplicate) {
    this.isDuplicate = isDuplicate;
  }

  public ApiBaseItemsRequest name(String name) {
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

  public ApiBaseItemsRequest itemPersonTypes(List<PersonType> itemPersonTypes) {
    this.itemPersonTypes = itemPersonTypes;
    return this;
  }

  public ApiBaseItemsRequest addItemPersonTypesItem(PersonType itemPersonTypesItem) {
    if (this.itemPersonTypes == null) {
      this.itemPersonTypes = new ArrayList<>();
    }
    this.itemPersonTypes.add(itemPersonTypesItem);
    return this;
  }

   /**
   * Get itemPersonTypes
   * @return itemPersonTypes
  **/
  @Schema(description = "")
  public List<PersonType> getItemPersonTypes() {
    return itemPersonTypes;
  }

  public void setItemPersonTypes(List<PersonType> itemPersonTypes) {
    this.itemPersonTypes = itemPersonTypes;
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

  public ApiBaseItemsRequest composerArtistIds(String composerArtistIds) {
    this.composerArtistIds = composerArtistIds;
    return this;
  }

   /**
   * Get composerArtistIds
   * @return composerArtistIds
  **/
  @Schema(description = "")
  public String getComposerArtistIds() {
    return composerArtistIds;
  }

  public void setComposerArtistIds(String composerArtistIds) {
    this.composerArtistIds = composerArtistIds;
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

  public ApiBaseItemsRequest isStandaloneSpecial(Boolean isStandaloneSpecial) {
    this.isStandaloneSpecial = isStandaloneSpecial;
    return this;
  }

   /**
   * Get isStandaloneSpecial
   * @return isStandaloneSpecial
  **/
  @Schema(description = "")
  public Boolean isIsStandaloneSpecial() {
    return isStandaloneSpecial;
  }

  public void setIsStandaloneSpecial(Boolean isStandaloneSpecial) {
    this.isStandaloneSpecial = isStandaloneSpecial;
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
      this.airDays = new ArrayList<>();
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

  public ApiBaseItemsRequest collectionTypes(String collectionTypes) {
    this.collectionTypes = collectionTypes;
    return this;
  }

   /**
   * Get collectionTypes
   * @return collectionTypes
  **/
  @Schema(description = "")
  public String getCollectionTypes() {
    return collectionTypes;
  }

  public void setCollectionTypes(String collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  public ApiBaseItemsRequest excludeSources(List<String> excludeSources) {
    this.excludeSources = excludeSources;
    return this;
  }

  public ApiBaseItemsRequest addExcludeSourcesItem(String excludeSourcesItem) {
    if (this.excludeSources == null) {
      this.excludeSources = new ArrayList<>();
    }
    this.excludeSources.add(excludeSourcesItem);
    return this;
  }

   /**
   * Get excludeSources
   * @return excludeSources
  **/
  @Schema(description = "")
  public List<String> getExcludeSources() {
    return excludeSources;
  }

  public void setExcludeSources(List<String> excludeSources) {
    this.excludeSources = excludeSources;
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
    return Objects.equals(this.isSpecialEpisode, apiBaseItemsRequest.isSpecialEpisode) &&
        Objects.equals(this.is4K, apiBaseItemsRequest.is4K) &&
        Objects.equals(this.minDateCreated, apiBaseItemsRequest.minDateCreated) &&
        Objects.equals(this.maxDateCreated, apiBaseItemsRequest.maxDateCreated) &&
        Objects.equals(this.enableTotalRecordCount, apiBaseItemsRequest.enableTotalRecordCount) &&
        Objects.equals(this.matchAnyWord, apiBaseItemsRequest.matchAnyWord) &&
        Objects.equals(this.isDuplicate, apiBaseItemsRequest.isDuplicate) &&
        Objects.equals(this.name, apiBaseItemsRequest.name) &&
        Objects.equals(this.recordingKeyword, apiBaseItemsRequest.recordingKeyword) &&
        Objects.equals(this.recordingKeywordType, apiBaseItemsRequest.recordingKeywordType) &&
        Objects.equals(this.randomSeed, apiBaseItemsRequest.randomSeed) &&
        Objects.equals(this.genreIds, apiBaseItemsRequest.genreIds) &&
        Objects.equals(this.collectionIds, apiBaseItemsRequest.collectionIds) &&
        Objects.equals(this.tagIds, apiBaseItemsRequest.tagIds) &&
        Objects.equals(this.excludeTagIds, apiBaseItemsRequest.excludeTagIds) &&
        Objects.equals(this.itemPersonTypes, apiBaseItemsRequest.itemPersonTypes) &&
        Objects.equals(this.excludeArtistIds, apiBaseItemsRequest.excludeArtistIds) &&
        Objects.equals(this.albumArtistIds, apiBaseItemsRequest.albumArtistIds) &&
        Objects.equals(this.composerArtistIds, apiBaseItemsRequest.composerArtistIds) &&
        Objects.equals(this.contributingArtistIds, apiBaseItemsRequest.contributingArtistIds) &&
        Objects.equals(this.albumIds, apiBaseItemsRequest.albumIds) &&
        Objects.equals(this.outerIds, apiBaseItemsRequest.outerIds) &&
        Objects.equals(this.listItemIds, apiBaseItemsRequest.listItemIds) &&
        Objects.equals(this.audioLanguages, apiBaseItemsRequest.audioLanguages) &&
        Objects.equals(this.subtitleLanguages, apiBaseItemsRequest.subtitleLanguages) &&
        Objects.equals(this.canEditItems, apiBaseItemsRequest.canEditItems) &&
        Objects.equals(this.groupItemsInto, apiBaseItemsRequest.groupItemsInto) &&
        Objects.equals(this.isStandaloneSpecial, apiBaseItemsRequest.isStandaloneSpecial) &&
        Objects.equals(this.minWidth, apiBaseItemsRequest.minWidth) &&
        Objects.equals(this.minHeight, apiBaseItemsRequest.minHeight) &&
        Objects.equals(this.maxWidth, apiBaseItemsRequest.maxWidth) &&
        Objects.equals(this.maxHeight, apiBaseItemsRequest.maxHeight) &&
        Objects.equals(this.groupProgramsBySeries, apiBaseItemsRequest.groupProgramsBySeries) &&
        Objects.equals(this.airDays, apiBaseItemsRequest.airDays) &&
        Objects.equals(this.isAiring, apiBaseItemsRequest.isAiring) &&
        Objects.equals(this.hasAired, apiBaseItemsRequest.hasAired) &&
        Objects.equals(this.collectionTypes, apiBaseItemsRequest.collectionTypes) &&
        Objects.equals(this.excludeSources, apiBaseItemsRequest.excludeSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpecialEpisode, is4K, minDateCreated, maxDateCreated, enableTotalRecordCount, matchAnyWord, isDuplicate, name, recordingKeyword, recordingKeywordType, randomSeed, genreIds, collectionIds, tagIds, excludeTagIds, itemPersonTypes, excludeArtistIds, albumArtistIds, composerArtistIds, contributingArtistIds, albumIds, outerIds, listItemIds, audioLanguages, subtitleLanguages, canEditItems, groupItemsInto, isStandaloneSpecial, minWidth, minHeight, maxWidth, maxHeight, groupProgramsBySeries, airDays, isAiring, hasAired, collectionTypes, excludeSources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiBaseItemsRequest {\n");
    
    sb.append("    isSpecialEpisode: ").append(toIndentedString(isSpecialEpisode)).append("\n");
    sb.append("    is4K: ").append(toIndentedString(is4K)).append("\n");
    sb.append("    minDateCreated: ").append(toIndentedString(minDateCreated)).append("\n");
    sb.append("    maxDateCreated: ").append(toIndentedString(maxDateCreated)).append("\n");
    sb.append("    enableTotalRecordCount: ").append(toIndentedString(enableTotalRecordCount)).append("\n");
    sb.append("    matchAnyWord: ").append(toIndentedString(matchAnyWord)).append("\n");
    sb.append("    isDuplicate: ").append(toIndentedString(isDuplicate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordingKeyword: ").append(toIndentedString(recordingKeyword)).append("\n");
    sb.append("    recordingKeywordType: ").append(toIndentedString(recordingKeywordType)).append("\n");
    sb.append("    randomSeed: ").append(toIndentedString(randomSeed)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    collectionIds: ").append(toIndentedString(collectionIds)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    excludeTagIds: ").append(toIndentedString(excludeTagIds)).append("\n");
    sb.append("    itemPersonTypes: ").append(toIndentedString(itemPersonTypes)).append("\n");
    sb.append("    excludeArtistIds: ").append(toIndentedString(excludeArtistIds)).append("\n");
    sb.append("    albumArtistIds: ").append(toIndentedString(albumArtistIds)).append("\n");
    sb.append("    composerArtistIds: ").append(toIndentedString(composerArtistIds)).append("\n");
    sb.append("    contributingArtistIds: ").append(toIndentedString(contributingArtistIds)).append("\n");
    sb.append("    albumIds: ").append(toIndentedString(albumIds)).append("\n");
    sb.append("    outerIds: ").append(toIndentedString(outerIds)).append("\n");
    sb.append("    listItemIds: ").append(toIndentedString(listItemIds)).append("\n");
    sb.append("    audioLanguages: ").append(toIndentedString(audioLanguages)).append("\n");
    sb.append("    subtitleLanguages: ").append(toIndentedString(subtitleLanguages)).append("\n");
    sb.append("    canEditItems: ").append(toIndentedString(canEditItems)).append("\n");
    sb.append("    groupItemsInto: ").append(toIndentedString(groupItemsInto)).append("\n");
    sb.append("    isStandaloneSpecial: ").append(toIndentedString(isStandaloneSpecial)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    groupProgramsBySeries: ").append(toIndentedString(groupProgramsBySeries)).append("\n");
    sb.append("    airDays: ").append(toIndentedString(airDays)).append("\n");
    sb.append("    isAiring: ").append(toIndentedString(isAiring)).append("\n");
    sb.append("    hasAired: ").append(toIndentedString(hasAired)).append("\n");
    sb.append("    collectionTypes: ").append(toIndentedString(collectionTypes)).append("\n");
    sb.append("    excludeSources: ").append(toIndentedString(excludeSources)).append("\n");
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
