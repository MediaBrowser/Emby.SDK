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
import io.swagger.client.model.LiveTvKeepUntil;
import io.swagger.client.model.LiveTvKeywordInfo;
import io.swagger.client.model.LiveTvTimerType;
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * LiveTvSeriesTimerInfo
 */


public class LiveTvSeriesTimerInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ChannelId")
  private String channelId = null;

  @SerializedName("ChannelIds")
  private List<String> channelIds = null;

  @SerializedName("ParentFolderId")
  private Long parentFolderId = null;

  @SerializedName("ProgramId")
  private String programId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ServiceName")
  private String serviceName = null;

  @SerializedName("Overview")
  private String overview = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("RecordAnyTime")
  private Boolean recordAnyTime = null;

  @SerializedName("KeepUpTo")
  private Integer keepUpTo = null;

  @SerializedName("KeepUntil")
  private LiveTvKeepUntil keepUntil = null;

  @SerializedName("SkipEpisodesInLibrary")
  private Boolean skipEpisodesInLibrary = null;

  @SerializedName("MatchExistingItemsWithAnyLibrary")
  private Boolean matchExistingItemsWithAnyLibrary = null;

  @SerializedName("RecordNewOnly")
  private Boolean recordNewOnly = null;

  @SerializedName("Days")
  private List<DayOfWeek> days = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("PrePaddingSeconds")
  private Integer prePaddingSeconds = null;

  @SerializedName("PostPaddingSeconds")
  private Integer postPaddingSeconds = null;

  @SerializedName("IsPrePaddingRequired")
  private Boolean isPrePaddingRequired = null;

  @SerializedName("IsPostPaddingRequired")
  private Boolean isPostPaddingRequired = null;

  @SerializedName("SeriesId")
  private String seriesId = null;

  @SerializedName("ProviderIds")
  private ProviderIdDictionary providerIds = null;

  @SerializedName("MaxRecordingSeconds")
  private Integer maxRecordingSeconds = null;

  @SerializedName("Keywords")
  private List<LiveTvKeywordInfo> keywords = null;

  @SerializedName("TimerType")
  private LiveTvTimerType timerType = null;

  public LiveTvSeriesTimerInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the recording.
   * @return id
  **/
  @Schema(description = "Id of the recording.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveTvSeriesTimerInfo channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * ChannelId of the recording.
   * @return channelId
  **/
  @Schema(description = "ChannelId of the recording.")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public LiveTvSeriesTimerInfo channelIds(List<String> channelIds) {
    this.channelIds = channelIds;
    return this;
  }

  public LiveTvSeriesTimerInfo addChannelIdsItem(String channelIdsItem) {
    if (this.channelIds == null) {
      this.channelIds = new ArrayList<String>();
    }
    this.channelIds.add(channelIdsItem);
    return this;
  }

   /**
   * Get channelIds
   * @return channelIds
  **/
  @Schema(description = "")
  public List<String> getChannelIds() {
    return channelIds;
  }

  public void setChannelIds(List<String> channelIds) {
    this.channelIds = channelIds;
  }

  public LiveTvSeriesTimerInfo parentFolderId(Long parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

   /**
   * Get parentFolderId
   * @return parentFolderId
  **/
  @Schema(description = "")
  public Long getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(Long parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public LiveTvSeriesTimerInfo programId(String programId) {
    this.programId = programId;
    return this;
  }

   /**
   * The program identifier.
   * @return programId
  **/
  @Schema(description = "The program identifier.")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public LiveTvSeriesTimerInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the recording.
   * @return name
  **/
  @Schema(description = "Name of the recording.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LiveTvSeriesTimerInfo serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Schema(description = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public LiveTvSeriesTimerInfo overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Description of the recording.
   * @return overview
  **/
  @Schema(description = "Description of the recording.")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public LiveTvSeriesTimerInfo startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the recording, in UTC.
   * @return startDate
  **/
  @Schema(description = "The start date of the recording, in UTC.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public LiveTvSeriesTimerInfo endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the recording, in UTC.
   * @return endDate
  **/
  @Schema(description = "The end date of the recording, in UTC.")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public LiveTvSeriesTimerInfo recordAnyTime(Boolean recordAnyTime) {
    this.recordAnyTime = recordAnyTime;
    return this;
  }

   /**
   * A value indicating whether \\[record any time\\].
   * @return recordAnyTime
  **/
  @Schema(description = "A value indicating whether \\[record any time\\].")
  public Boolean isRecordAnyTime() {
    return recordAnyTime;
  }

  public void setRecordAnyTime(Boolean recordAnyTime) {
    this.recordAnyTime = recordAnyTime;
  }

  public LiveTvSeriesTimerInfo keepUpTo(Integer keepUpTo) {
    this.keepUpTo = keepUpTo;
    return this;
  }

   /**
   * Get keepUpTo
   * @return keepUpTo
  **/
  @Schema(description = "")
  public Integer getKeepUpTo() {
    return keepUpTo;
  }

  public void setKeepUpTo(Integer keepUpTo) {
    this.keepUpTo = keepUpTo;
  }

  public LiveTvSeriesTimerInfo keepUntil(LiveTvKeepUntil keepUntil) {
    this.keepUntil = keepUntil;
    return this;
  }

   /**
   * Get keepUntil
   * @return keepUntil
  **/
  @Schema(description = "")
  public LiveTvKeepUntil getKeepUntil() {
    return keepUntil;
  }

  public void setKeepUntil(LiveTvKeepUntil keepUntil) {
    this.keepUntil = keepUntil;
  }

  public LiveTvSeriesTimerInfo skipEpisodesInLibrary(Boolean skipEpisodesInLibrary) {
    this.skipEpisodesInLibrary = skipEpisodesInLibrary;
    return this;
  }

   /**
   * Get skipEpisodesInLibrary
   * @return skipEpisodesInLibrary
  **/
  @Schema(description = "")
  public Boolean isSkipEpisodesInLibrary() {
    return skipEpisodesInLibrary;
  }

  public void setSkipEpisodesInLibrary(Boolean skipEpisodesInLibrary) {
    this.skipEpisodesInLibrary = skipEpisodesInLibrary;
  }

  public LiveTvSeriesTimerInfo matchExistingItemsWithAnyLibrary(Boolean matchExistingItemsWithAnyLibrary) {
    this.matchExistingItemsWithAnyLibrary = matchExistingItemsWithAnyLibrary;
    return this;
  }

   /**
   * Get matchExistingItemsWithAnyLibrary
   * @return matchExistingItemsWithAnyLibrary
  **/
  @Schema(description = "")
  public Boolean isMatchExistingItemsWithAnyLibrary() {
    return matchExistingItemsWithAnyLibrary;
  }

  public void setMatchExistingItemsWithAnyLibrary(Boolean matchExistingItemsWithAnyLibrary) {
    this.matchExistingItemsWithAnyLibrary = matchExistingItemsWithAnyLibrary;
  }

  public LiveTvSeriesTimerInfo recordNewOnly(Boolean recordNewOnly) {
    this.recordNewOnly = recordNewOnly;
    return this;
  }

   /**
   * A value indicating whether \\[record new only\\].
   * @return recordNewOnly
  **/
  @Schema(description = "A value indicating whether \\[record new only\\].")
  public Boolean isRecordNewOnly() {
    return recordNewOnly;
  }

  public void setRecordNewOnly(Boolean recordNewOnly) {
    this.recordNewOnly = recordNewOnly;
  }

  public LiveTvSeriesTimerInfo days(List<DayOfWeek> days) {
    this.days = days;
    return this;
  }

  public LiveTvSeriesTimerInfo addDaysItem(DayOfWeek daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<DayOfWeek>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * The days.
   * @return days
  **/
  @Schema(description = "The days.")
  public List<DayOfWeek> getDays() {
    return days;
  }

  public void setDays(List<DayOfWeek> days) {
    this.days = days;
  }

  public LiveTvSeriesTimerInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority.
   * @return priority
  **/
  @Schema(description = "The priority.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public LiveTvSeriesTimerInfo prePaddingSeconds(Integer prePaddingSeconds) {
    this.prePaddingSeconds = prePaddingSeconds;
    return this;
  }

   /**
   * The pre padding seconds.
   * @return prePaddingSeconds
  **/
  @Schema(description = "The pre padding seconds.")
  public Integer getPrePaddingSeconds() {
    return prePaddingSeconds;
  }

  public void setPrePaddingSeconds(Integer prePaddingSeconds) {
    this.prePaddingSeconds = prePaddingSeconds;
  }

  public LiveTvSeriesTimerInfo postPaddingSeconds(Integer postPaddingSeconds) {
    this.postPaddingSeconds = postPaddingSeconds;
    return this;
  }

   /**
   * The post padding seconds.
   * @return postPaddingSeconds
  **/
  @Schema(description = "The post padding seconds.")
  public Integer getPostPaddingSeconds() {
    return postPaddingSeconds;
  }

  public void setPostPaddingSeconds(Integer postPaddingSeconds) {
    this.postPaddingSeconds = postPaddingSeconds;
  }

  public LiveTvSeriesTimerInfo isPrePaddingRequired(Boolean isPrePaddingRequired) {
    this.isPrePaddingRequired = isPrePaddingRequired;
    return this;
  }

   /**
   * A value indicating whether this instance is pre padding required.
   * @return isPrePaddingRequired
  **/
  @Schema(description = "A value indicating whether this instance is pre padding required.")
  public Boolean isIsPrePaddingRequired() {
    return isPrePaddingRequired;
  }

  public void setIsPrePaddingRequired(Boolean isPrePaddingRequired) {
    this.isPrePaddingRequired = isPrePaddingRequired;
  }

  public LiveTvSeriesTimerInfo isPostPaddingRequired(Boolean isPostPaddingRequired) {
    this.isPostPaddingRequired = isPostPaddingRequired;
    return this;
  }

   /**
   * A value indicating whether this instance is post padding required.
   * @return isPostPaddingRequired
  **/
  @Schema(description = "A value indicating whether this instance is post padding required.")
  public Boolean isIsPostPaddingRequired() {
    return isPostPaddingRequired;
  }

  public void setIsPostPaddingRequired(Boolean isPostPaddingRequired) {
    this.isPostPaddingRequired = isPostPaddingRequired;
  }

  public LiveTvSeriesTimerInfo seriesId(String seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * The series identifier.
   * @return seriesId
  **/
  @Schema(description = "The series identifier.")
  public String getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(String seriesId) {
    this.seriesId = seriesId;
  }

  public LiveTvSeriesTimerInfo providerIds(ProviderIdDictionary providerIds) {
    this.providerIds = providerIds;
    return this;
  }

   /**
   * Get providerIds
   * @return providerIds
  **/
  @Schema(description = "")
  public ProviderIdDictionary getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(ProviderIdDictionary providerIds) {
    this.providerIds = providerIds;
  }

  public LiveTvSeriesTimerInfo maxRecordingSeconds(Integer maxRecordingSeconds) {
    this.maxRecordingSeconds = maxRecordingSeconds;
    return this;
  }

   /**
   * Get maxRecordingSeconds
   * @return maxRecordingSeconds
  **/
  @Schema(description = "")
  public Integer getMaxRecordingSeconds() {
    return maxRecordingSeconds;
  }

  public void setMaxRecordingSeconds(Integer maxRecordingSeconds) {
    this.maxRecordingSeconds = maxRecordingSeconds;
  }

  public LiveTvSeriesTimerInfo keywords(List<LiveTvKeywordInfo> keywords) {
    this.keywords = keywords;
    return this;
  }

  public LiveTvSeriesTimerInfo addKeywordsItem(LiveTvKeywordInfo keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<LiveTvKeywordInfo>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @Schema(description = "")
  public List<LiveTvKeywordInfo> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<LiveTvKeywordInfo> keywords) {
    this.keywords = keywords;
  }

  public LiveTvSeriesTimerInfo timerType(LiveTvTimerType timerType) {
    this.timerType = timerType;
    return this;
  }

   /**
   * Get timerType
   * @return timerType
  **/
  @Schema(description = "")
  public LiveTvTimerType getTimerType() {
    return timerType;
  }

  public void setTimerType(LiveTvTimerType timerType) {
    this.timerType = timerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvSeriesTimerInfo liveTvSeriesTimerInfo = (LiveTvSeriesTimerInfo) o;
    return Objects.equals(this.id, liveTvSeriesTimerInfo.id) &&
        Objects.equals(this.channelId, liveTvSeriesTimerInfo.channelId) &&
        Objects.equals(this.channelIds, liveTvSeriesTimerInfo.channelIds) &&
        Objects.equals(this.parentFolderId, liveTvSeriesTimerInfo.parentFolderId) &&
        Objects.equals(this.programId, liveTvSeriesTimerInfo.programId) &&
        Objects.equals(this.name, liveTvSeriesTimerInfo.name) &&
        Objects.equals(this.serviceName, liveTvSeriesTimerInfo.serviceName) &&
        Objects.equals(this.overview, liveTvSeriesTimerInfo.overview) &&
        Objects.equals(this.startDate, liveTvSeriesTimerInfo.startDate) &&
        Objects.equals(this.endDate, liveTvSeriesTimerInfo.endDate) &&
        Objects.equals(this.recordAnyTime, liveTvSeriesTimerInfo.recordAnyTime) &&
        Objects.equals(this.keepUpTo, liveTvSeriesTimerInfo.keepUpTo) &&
        Objects.equals(this.keepUntil, liveTvSeriesTimerInfo.keepUntil) &&
        Objects.equals(this.skipEpisodesInLibrary, liveTvSeriesTimerInfo.skipEpisodesInLibrary) &&
        Objects.equals(this.matchExistingItemsWithAnyLibrary, liveTvSeriesTimerInfo.matchExistingItemsWithAnyLibrary) &&
        Objects.equals(this.recordNewOnly, liveTvSeriesTimerInfo.recordNewOnly) &&
        Objects.equals(this.days, liveTvSeriesTimerInfo.days) &&
        Objects.equals(this.priority, liveTvSeriesTimerInfo.priority) &&
        Objects.equals(this.prePaddingSeconds, liveTvSeriesTimerInfo.prePaddingSeconds) &&
        Objects.equals(this.postPaddingSeconds, liveTvSeriesTimerInfo.postPaddingSeconds) &&
        Objects.equals(this.isPrePaddingRequired, liveTvSeriesTimerInfo.isPrePaddingRequired) &&
        Objects.equals(this.isPostPaddingRequired, liveTvSeriesTimerInfo.isPostPaddingRequired) &&
        Objects.equals(this.seriesId, liveTvSeriesTimerInfo.seriesId) &&
        Objects.equals(this.providerIds, liveTvSeriesTimerInfo.providerIds) &&
        Objects.equals(this.maxRecordingSeconds, liveTvSeriesTimerInfo.maxRecordingSeconds) &&
        Objects.equals(this.keywords, liveTvSeriesTimerInfo.keywords) &&
        Objects.equals(this.timerType, liveTvSeriesTimerInfo.timerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channelId, channelIds, parentFolderId, programId, name, serviceName, overview, startDate, endDate, recordAnyTime, keepUpTo, keepUntil, skipEpisodesInLibrary, matchExistingItemsWithAnyLibrary, recordNewOnly, days, priority, prePaddingSeconds, postPaddingSeconds, isPrePaddingRequired, isPostPaddingRequired, seriesId, providerIds, maxRecordingSeconds, keywords, timerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvSeriesTimerInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelIds: ").append(toIndentedString(channelIds)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    recordAnyTime: ").append(toIndentedString(recordAnyTime)).append("\n");
    sb.append("    keepUpTo: ").append(toIndentedString(keepUpTo)).append("\n");
    sb.append("    keepUntil: ").append(toIndentedString(keepUntil)).append("\n");
    sb.append("    skipEpisodesInLibrary: ").append(toIndentedString(skipEpisodesInLibrary)).append("\n");
    sb.append("    matchExistingItemsWithAnyLibrary: ").append(toIndentedString(matchExistingItemsWithAnyLibrary)).append("\n");
    sb.append("    recordNewOnly: ").append(toIndentedString(recordNewOnly)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    prePaddingSeconds: ").append(toIndentedString(prePaddingSeconds)).append("\n");
    sb.append("    postPaddingSeconds: ").append(toIndentedString(postPaddingSeconds)).append("\n");
    sb.append("    isPrePaddingRequired: ").append(toIndentedString(isPrePaddingRequired)).append("\n");
    sb.append("    isPostPaddingRequired: ").append(toIndentedString(isPostPaddingRequired)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    maxRecordingSeconds: ").append(toIndentedString(maxRecordingSeconds)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    timerType: ").append(toIndentedString(timerType)).append("\n");
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
