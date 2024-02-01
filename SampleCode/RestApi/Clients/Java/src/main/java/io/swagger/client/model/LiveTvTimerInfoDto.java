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
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.LiveTvKeepUntil;
import io.swagger.client.model.LiveTvRecordingStatus;
import io.swagger.client.model.LiveTvTimerType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * LiveTvTimerInfoDto
 */


public class LiveTvTimerInfoDto {
  @SerializedName("Status")
  private LiveTvRecordingStatus status = null;

  @SerializedName("SeriesTimerId")
  private String seriesTimerId = null;

  @SerializedName("RunTimeTicks")
  private Long runTimeTicks = null;

  @SerializedName("ProgramInfo")
  private BaseItemDto programInfo = null;

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

  public LiveTvTimerInfoDto status(LiveTvRecordingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public LiveTvRecordingStatus getStatus() {
    return status;
  }

  public void setStatus(LiveTvRecordingStatus status) {
    this.status = status;
  }

  public LiveTvTimerInfoDto seriesTimerId(String seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
    return this;
  }

   /**
   * The series timer identifier.
   * @return seriesTimerId
  **/
  @Schema(description = "The series timer identifier.")
  public String getSeriesTimerId() {
    return seriesTimerId;
  }

  public void setSeriesTimerId(String seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
  }

  public LiveTvTimerInfoDto runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
    return this;
  }

   /**
   * The run time ticks.
   * @return runTimeTicks
  **/
  @Schema(description = "The run time ticks.")
  public Long getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public LiveTvTimerInfoDto programInfo(BaseItemDto programInfo) {
    this.programInfo = programInfo;
    return this;
  }

   /**
   * Get programInfo
   * @return programInfo
  **/
  @Schema(description = "")
  public BaseItemDto getProgramInfo() {
    return programInfo;
  }

  public void setProgramInfo(BaseItemDto programInfo) {
    this.programInfo = programInfo;
  }

  public LiveTvTimerInfoDto timerType(LiveTvTimerType timerType) {
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

  public LiveTvTimerInfoDto id(String id) {
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

  public LiveTvTimerInfoDto type(String type) {
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

  public LiveTvTimerInfoDto serverId(String serverId) {
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

  public LiveTvTimerInfoDto channelId(String channelId) {
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

  public LiveTvTimerInfoDto channelName(String channelName) {
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

  public LiveTvTimerInfoDto channelNumber(String channelNumber) {
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

  public LiveTvTimerInfoDto channelPrimaryImageTag(String channelPrimaryImageTag) {
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

  public LiveTvTimerInfoDto programId(String programId) {
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

  public LiveTvTimerInfoDto name(String name) {
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

  public LiveTvTimerInfoDto overview(String overview) {
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

  public LiveTvTimerInfoDto parentFolderId(String parentFolderId) {
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

  public LiveTvTimerInfoDto startDate(OffsetDateTime startDate) {
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

  public LiveTvTimerInfoDto endDate(OffsetDateTime endDate) {
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

  public LiveTvTimerInfoDto priority(Integer priority) {
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

  public LiveTvTimerInfoDto prePaddingSeconds(Integer prePaddingSeconds) {
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

  public LiveTvTimerInfoDto postPaddingSeconds(Integer postPaddingSeconds) {
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

  public LiveTvTimerInfoDto isPrePaddingRequired(Boolean isPrePaddingRequired) {
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

  public LiveTvTimerInfoDto parentBackdropItemId(String parentBackdropItemId) {
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

  public LiveTvTimerInfoDto parentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
    return this;
  }

  public LiveTvTimerInfoDto addParentBackdropImageTagsItem(String parentBackdropImageTagsItem) {
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

  public LiveTvTimerInfoDto isPostPaddingRequired(Boolean isPostPaddingRequired) {
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

  public LiveTvTimerInfoDto keepUntil(LiveTvKeepUntil keepUntil) {
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
    LiveTvTimerInfoDto liveTvTimerInfoDto = (LiveTvTimerInfoDto) o;
    return Objects.equals(this.status, liveTvTimerInfoDto.status) &&
        Objects.equals(this.seriesTimerId, liveTvTimerInfoDto.seriesTimerId) &&
        Objects.equals(this.runTimeTicks, liveTvTimerInfoDto.runTimeTicks) &&
        Objects.equals(this.programInfo, liveTvTimerInfoDto.programInfo) &&
        Objects.equals(this.timerType, liveTvTimerInfoDto.timerType) &&
        Objects.equals(this.id, liveTvTimerInfoDto.id) &&
        Objects.equals(this.type, liveTvTimerInfoDto.type) &&
        Objects.equals(this.serverId, liveTvTimerInfoDto.serverId) &&
        Objects.equals(this.channelId, liveTvTimerInfoDto.channelId) &&
        Objects.equals(this.channelName, liveTvTimerInfoDto.channelName) &&
        Objects.equals(this.channelNumber, liveTvTimerInfoDto.channelNumber) &&
        Objects.equals(this.channelPrimaryImageTag, liveTvTimerInfoDto.channelPrimaryImageTag) &&
        Objects.equals(this.programId, liveTvTimerInfoDto.programId) &&
        Objects.equals(this.name, liveTvTimerInfoDto.name) &&
        Objects.equals(this.overview, liveTvTimerInfoDto.overview) &&
        Objects.equals(this.parentFolderId, liveTvTimerInfoDto.parentFolderId) &&
        Objects.equals(this.startDate, liveTvTimerInfoDto.startDate) &&
        Objects.equals(this.endDate, liveTvTimerInfoDto.endDate) &&
        Objects.equals(this.priority, liveTvTimerInfoDto.priority) &&
        Objects.equals(this.prePaddingSeconds, liveTvTimerInfoDto.prePaddingSeconds) &&
        Objects.equals(this.postPaddingSeconds, liveTvTimerInfoDto.postPaddingSeconds) &&
        Objects.equals(this.isPrePaddingRequired, liveTvTimerInfoDto.isPrePaddingRequired) &&
        Objects.equals(this.parentBackdropItemId, liveTvTimerInfoDto.parentBackdropItemId) &&
        Objects.equals(this.parentBackdropImageTags, liveTvTimerInfoDto.parentBackdropImageTags) &&
        Objects.equals(this.isPostPaddingRequired, liveTvTimerInfoDto.isPostPaddingRequired) &&
        Objects.equals(this.keepUntil, liveTvTimerInfoDto.keepUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, seriesTimerId, runTimeTicks, programInfo, timerType, id, type, serverId, channelId, channelName, channelNumber, channelPrimaryImageTag, programId, name, overview, parentFolderId, startDate, endDate, priority, prePaddingSeconds, postPaddingSeconds, isPrePaddingRequired, parentBackdropItemId, parentBackdropImageTags, isPostPaddingRequired, keepUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvTimerInfoDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    seriesTimerId: ").append(toIndentedString(seriesTimerId)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    programInfo: ").append(toIndentedString(programInfo)).append("\n");
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
