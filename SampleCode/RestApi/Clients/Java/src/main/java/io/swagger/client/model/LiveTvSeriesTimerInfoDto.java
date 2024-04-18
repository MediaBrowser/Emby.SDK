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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Class SeriesTimerInfoDto.  
 */
@Schema(description = "Class SeriesTimerInfoDto.  ")

public class LiveTvSeriesTimerInfoDto {
  @SerializedName("RecordAnyTime")
  private Boolean recordAnyTime = null;

  @SerializedName("SkipEpisodesInLibrary")
  private Boolean skipEpisodesInLibrary = null;

  @SerializedName("MatchExistingItemsWithAnyLibrary")
  private Boolean matchExistingItemsWithAnyLibrary = null;

  @SerializedName("RecordAnyChannel")
  private Boolean recordAnyChannel = null;

  @SerializedName("KeepUpTo")
  private Integer keepUpTo = null;

  @SerializedName("MaxRecordingSeconds")
  private Integer maxRecordingSeconds = null;

  @SerializedName("RecordNewOnly")
  private Boolean recordNewOnly = null;

  @SerializedName("ChannelIds")
  private List<String> channelIds = null;

  @SerializedName("Days")
  private List<DayOfWeek> days = null;

  @SerializedName("ImageTags")
  private Map<String, String> imageTags = null;

  @SerializedName("ParentThumbItemId")
  private String parentThumbItemId = null;

  @SerializedName("ParentThumbImageTag")
  private String parentThumbImageTag = null;

  @SerializedName("ParentPrimaryImageItemId")
  private String parentPrimaryImageItemId = null;

  @SerializedName("ParentPrimaryImageTag")
  private String parentPrimaryImageTag = null;

  @SerializedName("SeriesId")
  private String seriesId = null;

  @SerializedName("Keywords")
  private List<LiveTvKeywordInfo> keywords = null;

  @SerializedName("TimerType")
  private LiveTvTimerType timerType = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("ChannelId")
  private String channelId = null;

  @SerializedName("ChannelName")
  private String channelName = null;

  @SerializedName("ChannelNumber")
  private String channelNumber = null;

  @SerializedName("ChannelPrimaryImageTag")
  private String channelPrimaryImageTag = null;

  @SerializedName("ProgramId")
  private String programId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Overview")
  private String overview = null;

  @SerializedName("ParentFolderId")
  private String parentFolderId = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("PrePaddingSeconds")
  private Integer prePaddingSeconds = null;

  @SerializedName("PostPaddingSeconds")
  private Integer postPaddingSeconds = null;

  @SerializedName("IsPrePaddingRequired")
  private Boolean isPrePaddingRequired = null;

  @SerializedName("ParentBackdropItemId")
  private String parentBackdropItemId = null;

  @SerializedName("ParentBackdropImageTags")
  private List<String> parentBackdropImageTags = null;

  @SerializedName("IsPostPaddingRequired")
  private Boolean isPostPaddingRequired = null;

  @SerializedName("KeepUntil")
  private LiveTvKeepUntil keepUntil = null;

  public LiveTvSeriesTimerInfoDto recordAnyTime(Boolean recordAnyTime) {
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

  public LiveTvSeriesTimerInfoDto skipEpisodesInLibrary(Boolean skipEpisodesInLibrary) {
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

  public LiveTvSeriesTimerInfoDto matchExistingItemsWithAnyLibrary(Boolean matchExistingItemsWithAnyLibrary) {
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

  public LiveTvSeriesTimerInfoDto recordAnyChannel(Boolean recordAnyChannel) {
    this.recordAnyChannel = recordAnyChannel;
    return this;
  }

   /**
   * A value indicating whether \\[record any channel\\].
   * @return recordAnyChannel
  **/
  @Schema(description = "A value indicating whether \\[record any channel\\].")
  public Boolean isRecordAnyChannel() {
    return recordAnyChannel;
  }

  public void setRecordAnyChannel(Boolean recordAnyChannel) {
    this.recordAnyChannel = recordAnyChannel;
  }

  public LiveTvSeriesTimerInfoDto keepUpTo(Integer keepUpTo) {
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

  public LiveTvSeriesTimerInfoDto maxRecordingSeconds(Integer maxRecordingSeconds) {
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

  public LiveTvSeriesTimerInfoDto recordNewOnly(Boolean recordNewOnly) {
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

  public LiveTvSeriesTimerInfoDto channelIds(List<String> channelIds) {
    this.channelIds = channelIds;
    return this;
  }

  public LiveTvSeriesTimerInfoDto addChannelIdsItem(String channelIdsItem) {
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

  public LiveTvSeriesTimerInfoDto days(List<DayOfWeek> days) {
    this.days = days;
    return this;
  }

  public LiveTvSeriesTimerInfoDto addDaysItem(DayOfWeek daysItem) {
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

  public LiveTvSeriesTimerInfoDto imageTags(Map<String, String> imageTags) {
    this.imageTags = imageTags;
    return this;
  }

  public LiveTvSeriesTimerInfoDto putImageTagsItem(String key, String imageTagsItem) {
    if (this.imageTags == null) {
      this.imageTags = new HashMap<String, String>();
    }
    this.imageTags.put(key, imageTagsItem);
    return this;
  }

   /**
   * The image tags.
   * @return imageTags
  **/
  @Schema(description = "The image tags.")
  public Map<String, String> getImageTags() {
    return imageTags;
  }

  public void setImageTags(Map<String, String> imageTags) {
    this.imageTags = imageTags;
  }

  public LiveTvSeriesTimerInfoDto parentThumbItemId(String parentThumbItemId) {
    this.parentThumbItemId = parentThumbItemId;
    return this;
  }

   /**
   * The parent thumb item id.
   * @return parentThumbItemId
  **/
  @Schema(description = "The parent thumb item id.")
  public String getParentThumbItemId() {
    return parentThumbItemId;
  }

  public void setParentThumbItemId(String parentThumbItemId) {
    this.parentThumbItemId = parentThumbItemId;
  }

  public LiveTvSeriesTimerInfoDto parentThumbImageTag(String parentThumbImageTag) {
    this.parentThumbImageTag = parentThumbImageTag;
    return this;
  }

   /**
   * The parent thumb image tag.
   * @return parentThumbImageTag
  **/
  @Schema(description = "The parent thumb image tag.")
  public String getParentThumbImageTag() {
    return parentThumbImageTag;
  }

  public void setParentThumbImageTag(String parentThumbImageTag) {
    this.parentThumbImageTag = parentThumbImageTag;
  }

  public LiveTvSeriesTimerInfoDto parentPrimaryImageItemId(String parentPrimaryImageItemId) {
    this.parentPrimaryImageItemId = parentPrimaryImageItemId;
    return this;
  }

   /**
   * The parent primary image item identifier.
   * @return parentPrimaryImageItemId
  **/
  @Schema(description = "The parent primary image item identifier.")
  public String getParentPrimaryImageItemId() {
    return parentPrimaryImageItemId;
  }

  public void setParentPrimaryImageItemId(String parentPrimaryImageItemId) {
    this.parentPrimaryImageItemId = parentPrimaryImageItemId;
  }

  public LiveTvSeriesTimerInfoDto parentPrimaryImageTag(String parentPrimaryImageTag) {
    this.parentPrimaryImageTag = parentPrimaryImageTag;
    return this;
  }

   /**
   * The parent primary image tag.
   * @return parentPrimaryImageTag
  **/
  @Schema(description = "The parent primary image tag.")
  public String getParentPrimaryImageTag() {
    return parentPrimaryImageTag;
  }

  public void setParentPrimaryImageTag(String parentPrimaryImageTag) {
    this.parentPrimaryImageTag = parentPrimaryImageTag;
  }

  public LiveTvSeriesTimerInfoDto seriesId(String seriesId) {
    this.seriesId = seriesId;
    return this;
  }

   /**
   * Get seriesId
   * @return seriesId
  **/
  @Schema(description = "")
  public String getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(String seriesId) {
    this.seriesId = seriesId;
  }

  public LiveTvSeriesTimerInfoDto keywords(List<LiveTvKeywordInfo> keywords) {
    this.keywords = keywords;
    return this;
  }

  public LiveTvSeriesTimerInfoDto addKeywordsItem(LiveTvKeywordInfo keywordsItem) {
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

  public LiveTvSeriesTimerInfoDto timerType(LiveTvTimerType timerType) {
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

  public LiveTvSeriesTimerInfoDto id(String id) {
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

  public LiveTvSeriesTimerInfoDto type(String type) {
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

  public LiveTvSeriesTimerInfoDto serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * The server identifier.
   * @return serverId
  **/
  @Schema(description = "The server identifier.")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public LiveTvSeriesTimerInfoDto channelId(String channelId) {
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

  public LiveTvSeriesTimerInfoDto channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * ChannelName of the recording.
   * @return channelName
  **/
  @Schema(description = "ChannelName of the recording.")
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public LiveTvSeriesTimerInfoDto channelNumber(String channelNumber) {
    this.channelNumber = channelNumber;
    return this;
  }

   /**
   * Get channelNumber
   * @return channelNumber
  **/
  @Schema(description = "")
  public String getChannelNumber() {
    return channelNumber;
  }

  public void setChannelNumber(String channelNumber) {
    this.channelNumber = channelNumber;
  }

  public LiveTvSeriesTimerInfoDto channelPrimaryImageTag(String channelPrimaryImageTag) {
    this.channelPrimaryImageTag = channelPrimaryImageTag;
    return this;
  }

   /**
   * Get channelPrimaryImageTag
   * @return channelPrimaryImageTag
  **/
  @Schema(description = "")
  public String getChannelPrimaryImageTag() {
    return channelPrimaryImageTag;
  }

  public void setChannelPrimaryImageTag(String channelPrimaryImageTag) {
    this.channelPrimaryImageTag = channelPrimaryImageTag;
  }

  public LiveTvSeriesTimerInfoDto programId(String programId) {
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

  public LiveTvSeriesTimerInfoDto name(String name) {
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

  public LiveTvSeriesTimerInfoDto overview(String overview) {
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

  public LiveTvSeriesTimerInfoDto parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

   /**
   * Get parentFolderId
   * @return parentFolderId
  **/
  @Schema(description = "")
  public String getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public LiveTvSeriesTimerInfoDto startDate(OffsetDateTime startDate) {
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

  public LiveTvSeriesTimerInfoDto endDate(OffsetDateTime endDate) {
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

  public LiveTvSeriesTimerInfoDto priority(Integer priority) {
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

  public LiveTvSeriesTimerInfoDto prePaddingSeconds(Integer prePaddingSeconds) {
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

  public LiveTvSeriesTimerInfoDto postPaddingSeconds(Integer postPaddingSeconds) {
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

  public LiveTvSeriesTimerInfoDto isPrePaddingRequired(Boolean isPrePaddingRequired) {
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

  public LiveTvSeriesTimerInfoDto parentBackdropItemId(String parentBackdropItemId) {
    this.parentBackdropItemId = parentBackdropItemId;
    return this;
  }

   /**
   * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
   * @return parentBackdropItemId
  **/
  @Schema(description = "If the item does not have any backdrops, this will hold the Id of the Parent that has one.")
  public String getParentBackdropItemId() {
    return parentBackdropItemId;
  }

  public void setParentBackdropItemId(String parentBackdropItemId) {
    this.parentBackdropItemId = parentBackdropItemId;
  }

  public LiveTvSeriesTimerInfoDto parentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
    return this;
  }

  public LiveTvSeriesTimerInfoDto addParentBackdropImageTagsItem(String parentBackdropImageTagsItem) {
    if (this.parentBackdropImageTags == null) {
      this.parentBackdropImageTags = new ArrayList<String>();
    }
    this.parentBackdropImageTags.add(parentBackdropImageTagsItem);
    return this;
  }

   /**
   * The parent backdrop image tags.
   * @return parentBackdropImageTags
  **/
  @Schema(description = "The parent backdrop image tags.")
  public List<String> getParentBackdropImageTags() {
    return parentBackdropImageTags;
  }

  public void setParentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
  }

  public LiveTvSeriesTimerInfoDto isPostPaddingRequired(Boolean isPostPaddingRequired) {
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

  public LiveTvSeriesTimerInfoDto keepUntil(LiveTvKeepUntil keepUntil) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvSeriesTimerInfoDto liveTvSeriesTimerInfoDto = (LiveTvSeriesTimerInfoDto) o;
    return Objects.equals(this.recordAnyTime, liveTvSeriesTimerInfoDto.recordAnyTime) &&
        Objects.equals(this.skipEpisodesInLibrary, liveTvSeriesTimerInfoDto.skipEpisodesInLibrary) &&
        Objects.equals(this.matchExistingItemsWithAnyLibrary, liveTvSeriesTimerInfoDto.matchExistingItemsWithAnyLibrary) &&
        Objects.equals(this.recordAnyChannel, liveTvSeriesTimerInfoDto.recordAnyChannel) &&
        Objects.equals(this.keepUpTo, liveTvSeriesTimerInfoDto.keepUpTo) &&
        Objects.equals(this.maxRecordingSeconds, liveTvSeriesTimerInfoDto.maxRecordingSeconds) &&
        Objects.equals(this.recordNewOnly, liveTvSeriesTimerInfoDto.recordNewOnly) &&
        Objects.equals(this.channelIds, liveTvSeriesTimerInfoDto.channelIds) &&
        Objects.equals(this.days, liveTvSeriesTimerInfoDto.days) &&
        Objects.equals(this.imageTags, liveTvSeriesTimerInfoDto.imageTags) &&
        Objects.equals(this.parentThumbItemId, liveTvSeriesTimerInfoDto.parentThumbItemId) &&
        Objects.equals(this.parentThumbImageTag, liveTvSeriesTimerInfoDto.parentThumbImageTag) &&
        Objects.equals(this.parentPrimaryImageItemId, liveTvSeriesTimerInfoDto.parentPrimaryImageItemId) &&
        Objects.equals(this.parentPrimaryImageTag, liveTvSeriesTimerInfoDto.parentPrimaryImageTag) &&
        Objects.equals(this.seriesId, liveTvSeriesTimerInfoDto.seriesId) &&
        Objects.equals(this.keywords, liveTvSeriesTimerInfoDto.keywords) &&
        Objects.equals(this.timerType, liveTvSeriesTimerInfoDto.timerType) &&
        Objects.equals(this.id, liveTvSeriesTimerInfoDto.id) &&
        Objects.equals(this.type, liveTvSeriesTimerInfoDto.type) &&
        Objects.equals(this.serverId, liveTvSeriesTimerInfoDto.serverId) &&
        Objects.equals(this.channelId, liveTvSeriesTimerInfoDto.channelId) &&
        Objects.equals(this.channelName, liveTvSeriesTimerInfoDto.channelName) &&
        Objects.equals(this.channelNumber, liveTvSeriesTimerInfoDto.channelNumber) &&
        Objects.equals(this.channelPrimaryImageTag, liveTvSeriesTimerInfoDto.channelPrimaryImageTag) &&
        Objects.equals(this.programId, liveTvSeriesTimerInfoDto.programId) &&
        Objects.equals(this.name, liveTvSeriesTimerInfoDto.name) &&
        Objects.equals(this.overview, liveTvSeriesTimerInfoDto.overview) &&
        Objects.equals(this.parentFolderId, liveTvSeriesTimerInfoDto.parentFolderId) &&
        Objects.equals(this.startDate, liveTvSeriesTimerInfoDto.startDate) &&
        Objects.equals(this.endDate, liveTvSeriesTimerInfoDto.endDate) &&
        Objects.equals(this.priority, liveTvSeriesTimerInfoDto.priority) &&
        Objects.equals(this.prePaddingSeconds, liveTvSeriesTimerInfoDto.prePaddingSeconds) &&
        Objects.equals(this.postPaddingSeconds, liveTvSeriesTimerInfoDto.postPaddingSeconds) &&
        Objects.equals(this.isPrePaddingRequired, liveTvSeriesTimerInfoDto.isPrePaddingRequired) &&
        Objects.equals(this.parentBackdropItemId, liveTvSeriesTimerInfoDto.parentBackdropItemId) &&
        Objects.equals(this.parentBackdropImageTags, liveTvSeriesTimerInfoDto.parentBackdropImageTags) &&
        Objects.equals(this.isPostPaddingRequired, liveTvSeriesTimerInfoDto.isPostPaddingRequired) &&
        Objects.equals(this.keepUntil, liveTvSeriesTimerInfoDto.keepUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordAnyTime, skipEpisodesInLibrary, matchExistingItemsWithAnyLibrary, recordAnyChannel, keepUpTo, maxRecordingSeconds, recordNewOnly, channelIds, days, imageTags, parentThumbItemId, parentThumbImageTag, parentPrimaryImageItemId, parentPrimaryImageTag, seriesId, keywords, timerType, id, type, serverId, channelId, channelName, channelNumber, channelPrimaryImageTag, programId, name, overview, parentFolderId, startDate, endDate, priority, prePaddingSeconds, postPaddingSeconds, isPrePaddingRequired, parentBackdropItemId, parentBackdropImageTags, isPostPaddingRequired, keepUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvSeriesTimerInfoDto {\n");
    
    sb.append("    recordAnyTime: ").append(toIndentedString(recordAnyTime)).append("\n");
    sb.append("    skipEpisodesInLibrary: ").append(toIndentedString(skipEpisodesInLibrary)).append("\n");
    sb.append("    matchExistingItemsWithAnyLibrary: ").append(toIndentedString(matchExistingItemsWithAnyLibrary)).append("\n");
    sb.append("    recordAnyChannel: ").append(toIndentedString(recordAnyChannel)).append("\n");
    sb.append("    keepUpTo: ").append(toIndentedString(keepUpTo)).append("\n");
    sb.append("    maxRecordingSeconds: ").append(toIndentedString(maxRecordingSeconds)).append("\n");
    sb.append("    recordNewOnly: ").append(toIndentedString(recordNewOnly)).append("\n");
    sb.append("    channelIds: ").append(toIndentedString(channelIds)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    parentThumbItemId: ").append(toIndentedString(parentThumbItemId)).append("\n");
    sb.append("    parentThumbImageTag: ").append(toIndentedString(parentThumbImageTag)).append("\n");
    sb.append("    parentPrimaryImageItemId: ").append(toIndentedString(parentPrimaryImageItemId)).append("\n");
    sb.append("    parentPrimaryImageTag: ").append(toIndentedString(parentPrimaryImageTag)).append("\n");
    sb.append("    seriesId: ").append(toIndentedString(seriesId)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    timerType: ").append(toIndentedString(timerType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelNumber: ").append(toIndentedString(channelNumber)).append("\n");
    sb.append("    channelPrimaryImageTag: ").append(toIndentedString(channelPrimaryImageTag)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    prePaddingSeconds: ").append(toIndentedString(prePaddingSeconds)).append("\n");
    sb.append("    postPaddingSeconds: ").append(toIndentedString(postPaddingSeconds)).append("\n");
    sb.append("    isPrePaddingRequired: ").append(toIndentedString(isPrePaddingRequired)).append("\n");
    sb.append("    parentBackdropItemId: ").append(toIndentedString(parentBackdropItemId)).append("\n");
    sb.append("    parentBackdropImageTags: ").append(toIndentedString(parentBackdropImageTags)).append("\n");
    sb.append("    isPostPaddingRequired: ").append(toIndentedString(isPostPaddingRequired)).append("\n");
    sb.append("    keepUntil: ").append(toIndentedString(keepUntil)).append("\n");
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
