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
import io.swagger.client.model.TaskCompletionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Class TaskExecutionInfo  
 */
@Schema(description = "Class TaskExecutionInfo  ")

public class TaskResult {
  @SerializedName("StartTimeUtc")
  private OffsetDateTime startTimeUtc = null;

  @SerializedName("EndTimeUtc")
  private OffsetDateTime endTimeUtc = null;

  @SerializedName("Status")
  private TaskCompletionStatus status = null;

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

  public TaskResult startTimeUtc(OffsetDateTime startTimeUtc) {
    this.startTimeUtc = startTimeUtc;
    return this;
  }

   /**
   * The start time UTC.
   * @return startTimeUtc
  **/
  @Schema(description = "The start time UTC.")
  public OffsetDateTime getStartTimeUtc() {
    return startTimeUtc;
  }

  public void setStartTimeUtc(OffsetDateTime startTimeUtc) {
    this.startTimeUtc = startTimeUtc;
  }

  public TaskResult endTimeUtc(OffsetDateTime endTimeUtc) {
    this.endTimeUtc = endTimeUtc;
    return this;
  }

   /**
   * The end time UTC.
   * @return endTimeUtc
  **/
  @Schema(description = "The end time UTC.")
  public OffsetDateTime getEndTimeUtc() {
    return endTimeUtc;
  }

  public void setEndTimeUtc(OffsetDateTime endTimeUtc) {
    this.endTimeUtc = endTimeUtc;
  }

  public TaskResult status(TaskCompletionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public TaskCompletionStatus getStatus() {
    return status;
  }

  public void setStatus(TaskCompletionStatus status) {
    this.status = status;
  }

  public TaskResult name(String name) {
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

  public TaskResult key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key.
   * @return key
  **/
  @Schema(description = "The key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TaskResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id.
   * @return id
  **/
  @Schema(description = "The id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaskResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message.
   * @return errorMessage
  **/
  @Schema(description = "The error message.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TaskResult longErrorMessage(String longErrorMessage) {
    this.longErrorMessage = longErrorMessage;
    return this;
  }

   /**
   * The long error message.
   * @return longErrorMessage
  **/
  @Schema(description = "The long error message.")
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
    TaskResult taskResult = (TaskResult) o;
    return Objects.equals(this.startTimeUtc, taskResult.startTimeUtc) &&
        Objects.equals(this.endTimeUtc, taskResult.endTimeUtc) &&
        Objects.equals(this.status, taskResult.status) &&
        Objects.equals(this.name, taskResult.name) &&
        Objects.equals(this.key, taskResult.key) &&
        Objects.equals(this.id, taskResult.id) &&
        Objects.equals(this.errorMessage, taskResult.errorMessage) &&
        Objects.equals(this.longErrorMessage, taskResult.longErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeUtc, endTimeUtc, status, name, key, id, errorMessage, longErrorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResult {\n");
    
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
