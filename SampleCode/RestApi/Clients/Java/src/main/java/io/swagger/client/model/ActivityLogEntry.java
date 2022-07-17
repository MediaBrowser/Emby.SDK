/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.LoggingLogSeverity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ActivityLogEntry
 */


public class ActivityLogEntry {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Overview")
  private String overview = null;

  @SerializedName("ShortOverview")
  private String shortOverview = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("UserPrimaryImageTag")
  private String userPrimaryImageTag = null;

  @SerializedName("Severity")
  private LoggingLogSeverity severity = null;

  public ActivityLogEntry id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ActivityLogEntry name(String name) {
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

  public ActivityLogEntry overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public ActivityLogEntry shortOverview(String shortOverview) {
    this.shortOverview = shortOverview;
    return this;
  }

   /**
   * Get shortOverview
   * @return shortOverview
  **/
  @Schema(description = "")
  public String getShortOverview() {
    return shortOverview;
  }

  public void setShortOverview(String shortOverview) {
    this.shortOverview = shortOverview;
  }

  public ActivityLogEntry type(String type) {
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

  public ActivityLogEntry itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ActivityLogEntry date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ActivityLogEntry userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ActivityLogEntry userPrimaryImageTag(String userPrimaryImageTag) {
    this.userPrimaryImageTag = userPrimaryImageTag;
    return this;
  }

   /**
   * Get userPrimaryImageTag
   * @return userPrimaryImageTag
  **/
  @Schema(description = "")
  public String getUserPrimaryImageTag() {
    return userPrimaryImageTag;
  }

  public void setUserPrimaryImageTag(String userPrimaryImageTag) {
    this.userPrimaryImageTag = userPrimaryImageTag;
  }

  public ActivityLogEntry severity(LoggingLogSeverity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @Schema(description = "")
  public LoggingLogSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(LoggingLogSeverity severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityLogEntry activityLogEntry = (ActivityLogEntry) o;
    return Objects.equals(this.id, activityLogEntry.id) &&
        Objects.equals(this.name, activityLogEntry.name) &&
        Objects.equals(this.overview, activityLogEntry.overview) &&
        Objects.equals(this.shortOverview, activityLogEntry.shortOverview) &&
        Objects.equals(this.type, activityLogEntry.type) &&
        Objects.equals(this.itemId, activityLogEntry.itemId) &&
        Objects.equals(this.date, activityLogEntry.date) &&
        Objects.equals(this.userId, activityLogEntry.userId) &&
        Objects.equals(this.userPrimaryImageTag, activityLogEntry.userPrimaryImageTag) &&
        Objects.equals(this.severity, activityLogEntry.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, overview, shortOverview, type, itemId, date, userId, userPrimaryImageTag, severity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityLogEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    shortOverview: ").append(toIndentedString(shortOverview)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPrimaryImageTag: ").append(toIndentedString(userPrimaryImageTag)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
