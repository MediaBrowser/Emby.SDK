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
import io.swagger.client.model.TasksTaskCompletionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * TasksTaskResult
 */


public class TasksTaskResult {
  @SerializedName("StartTimeUtc")
  private OffsetDateTime startTimeUtc = null;

  @SerializedName("EndTimeUtc")
  private OffsetDateTime endTimeUtc = null;

  @SerializedName("Status")
  private TasksTaskCompletionStatus status = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  @SerializedName("LongErrorMessage")
  private String longErrorMessage = null;

  public TasksTaskResult startTimeUtc(OffsetDateTime startTimeUtc) {
    this.startTimeUtc = startTimeUtc;
    return this;
  }

   /**
   * Get startTimeUtc
   * @return startTimeUtc
  **/
  @Schema(description = "")
  public OffsetDateTime getStartTimeUtc() {
    return startTimeUtc;
  }

  public void setStartTimeUtc(OffsetDateTime startTimeUtc) {
    this.startTimeUtc = startTimeUtc;
  }

  public TasksTaskResult endTimeUtc(OffsetDateTime endTimeUtc) {
    this.endTimeUtc = endTimeUtc;
    return this;
  }

   /**
   * Get endTimeUtc
   * @return endTimeUtc
  **/
  @Schema(description = "")
  public OffsetDateTime getEndTimeUtc() {
    return endTimeUtc;
  }

  public void setEndTimeUtc(OffsetDateTime endTimeUtc) {
    this.endTimeUtc = endTimeUtc;
  }

  public TasksTaskResult status(TasksTaskCompletionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public TasksTaskCompletionStatus getStatus() {
    return status;
  }

  public void setStatus(TasksTaskCompletionStatus status) {
    this.status = status;
  }

  public TasksTaskResult name(String name) {
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

  public TasksTaskResult key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TasksTaskResult id(String id) {
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

  public TasksTaskResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TasksTaskResult longErrorMessage(String longErrorMessage) {
    this.longErrorMessage = longErrorMessage;
    return this;
  }

   /**
   * Get longErrorMessage
   * @return longErrorMessage
  **/
  @Schema(description = "")
  public String getLongErrorMessage() {
    return longErrorMessage;
  }

  public void setLongErrorMessage(String longErrorMessage) {
    this.longErrorMessage = longErrorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TasksTaskResult tasksTaskResult = (TasksTaskResult) o;
    return Objects.equals(this.startTimeUtc, tasksTaskResult.startTimeUtc) &&
        Objects.equals(this.endTimeUtc, tasksTaskResult.endTimeUtc) &&
        Objects.equals(this.status, tasksTaskResult.status) &&
        Objects.equals(this.name, tasksTaskResult.name) &&
        Objects.equals(this.key, tasksTaskResult.key) &&
        Objects.equals(this.id, tasksTaskResult.id) &&
        Objects.equals(this.errorMessage, tasksTaskResult.errorMessage) &&
        Objects.equals(this.longErrorMessage, tasksTaskResult.longErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeUtc, endTimeUtc, status, name, key, id, errorMessage, longErrorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TasksTaskResult {\n");
    
    sb.append("    startTimeUtc: ").append(toIndentedString(startTimeUtc)).append("\n");
    sb.append("    endTimeUtc: ").append(toIndentedString(endTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    longErrorMessage: ").append(toIndentedString(longErrorMessage)).append("\n");
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
