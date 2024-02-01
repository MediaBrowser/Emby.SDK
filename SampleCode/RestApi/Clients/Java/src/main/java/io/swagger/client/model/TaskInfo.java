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
import io.swagger.client.model.TaskResult;
import io.swagger.client.model.TaskState;
import io.swagger.client.model.TaskTriggerInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class TaskInfo  
 */
@Schema(description = "Class TaskInfo  ")

public class TaskInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("State")
  private TaskState state = null;

  @SerializedName("CurrentProgressPercentage")
  private Double currentProgressPercentage = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("LastExecutionResult")
  private TaskResult lastExecutionResult = null;

  @SerializedName("Triggers")
  private List<TaskTriggerInfo> triggers = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Category")
  private String category = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("Key")
  private String key = null;

  public TaskInfo name(String name) {
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

  public TaskInfo state(TaskState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }

  public TaskInfo currentProgressPercentage(Double currentProgressPercentage) {
    this.currentProgressPercentage = currentProgressPercentage;
    return this;
  }

   /**
   * The progress.
   * @return currentProgressPercentage
  **/
  @Schema(description = "The progress.")
  public Double getCurrentProgressPercentage() {
    return currentProgressPercentage;
  }

  public void setCurrentProgressPercentage(Double currentProgressPercentage) {
    this.currentProgressPercentage = currentProgressPercentage;
  }

  public TaskInfo id(String id) {
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

  public TaskInfo lastExecutionResult(TaskResult lastExecutionResult) {
    this.lastExecutionResult = lastExecutionResult;
    return this;
  }

   /**
   * Get lastExecutionResult
   * @return lastExecutionResult
  **/
  @Schema(description = "")
  public TaskResult getLastExecutionResult() {
    return lastExecutionResult;
  }

  public void setLastExecutionResult(TaskResult lastExecutionResult) {
    this.lastExecutionResult = lastExecutionResult;
  }

  public TaskInfo triggers(List<TaskTriggerInfo> triggers) {
    this.triggers = triggers;
    return this;
  }

  public TaskInfo addTriggersItem(TaskTriggerInfo triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<TaskTriggerInfo>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * The triggers.
   * @return triggers
  **/
  @Schema(description = "The triggers.")
  public List<TaskTriggerInfo> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<TaskTriggerInfo> triggers) {
    this.triggers = triggers;
  }

  public TaskInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description.
   * @return description
  **/
  @Schema(description = "The description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskInfo category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category.
   * @return category
  **/
  @Schema(description = "The category.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TaskInfo isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * A value indicating whether this instance is hidden.
   * @return isHidden
  **/
  @Schema(description = "A value indicating whether this instance is hidden.")
  public Boolean isIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public TaskInfo key(String key) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInfo taskInfo = (TaskInfo) o;
    return Objects.equals(this.name, taskInfo.name) &&
        Objects.equals(this.state, taskInfo.state) &&
        Objects.equals(this.currentProgressPercentage, taskInfo.currentProgressPercentage) &&
        Objects.equals(this.id, taskInfo.id) &&
        Objects.equals(this.lastExecutionResult, taskInfo.lastExecutionResult) &&
        Objects.equals(this.triggers, taskInfo.triggers) &&
        Objects.equals(this.description, taskInfo.description) &&
        Objects.equals(this.category, taskInfo.category) &&
        Objects.equals(this.isHidden, taskInfo.isHidden) &&
        Objects.equals(this.key, taskInfo.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, currentProgressPercentage, id, lastExecutionResult, triggers, description, category, isHidden, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    currentProgressPercentage: ").append(toIndentedString(currentProgressPercentage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastExecutionResult: ").append(toIndentedString(lastExecutionResult)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
