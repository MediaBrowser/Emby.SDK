/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.TasksTaskResult;
import io.swagger.client.model.TasksTaskState;
import io.swagger.client.model.TasksTaskTriggerInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TasksTaskInfo
 */


public class TasksTaskInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("State")
  private TasksTaskState state = null;

  @SerializedName("CurrentProgressPercentage")
  private Double currentProgressPercentage = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("LastExecutionResult")
  private TasksTaskResult lastExecutionResult = null;

  @SerializedName("Triggers")
  private List<TasksTaskTriggerInfo> triggers = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Category")
  private String category = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("Key")
  private String key = null;

  public TasksTaskInfo name(String name) {
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

  public TasksTaskInfo state(TasksTaskState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public TasksTaskState getState() {
    return state;
  }

  public void setState(TasksTaskState state) {
    this.state = state;
  }

  public TasksTaskInfo currentProgressPercentage(Double currentProgressPercentage) {
    this.currentProgressPercentage = currentProgressPercentage;
    return this;
  }

   /**
   * Get currentProgressPercentage
   * @return currentProgressPercentage
  **/
  @Schema(description = "")
  public Double getCurrentProgressPercentage() {
    return currentProgressPercentage;
  }

  public void setCurrentProgressPercentage(Double currentProgressPercentage) {
    this.currentProgressPercentage = currentProgressPercentage;
  }

  public TasksTaskInfo id(String id) {
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

  public TasksTaskInfo lastExecutionResult(TasksTaskResult lastExecutionResult) {
    this.lastExecutionResult = lastExecutionResult;
    return this;
  }

   /**
   * Get lastExecutionResult
   * @return lastExecutionResult
  **/
  @Schema(description = "")
  public TasksTaskResult getLastExecutionResult() {
    return lastExecutionResult;
  }

  public void setLastExecutionResult(TasksTaskResult lastExecutionResult) {
    this.lastExecutionResult = lastExecutionResult;
  }

  public TasksTaskInfo triggers(List<TasksTaskTriggerInfo> triggers) {
    this.triggers = triggers;
    return this;
  }

  public TasksTaskInfo addTriggersItem(TasksTaskTriggerInfo triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<TasksTaskTriggerInfo>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @Schema(description = "")
  public List<TasksTaskTriggerInfo> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<TasksTaskTriggerInfo> triggers) {
    this.triggers = triggers;
  }

  public TasksTaskInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TasksTaskInfo category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TasksTaskInfo isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @Schema(description = "")
  public Boolean isIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public TasksTaskInfo key(String key) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TasksTaskInfo tasksTaskInfo = (TasksTaskInfo) o;
    return Objects.equals(this.name, tasksTaskInfo.name) &&
        Objects.equals(this.state, tasksTaskInfo.state) &&
        Objects.equals(this.currentProgressPercentage, tasksTaskInfo.currentProgressPercentage) &&
        Objects.equals(this.id, tasksTaskInfo.id) &&
        Objects.equals(this.lastExecutionResult, tasksTaskInfo.lastExecutionResult) &&
        Objects.equals(this.triggers, tasksTaskInfo.triggers) &&
        Objects.equals(this.description, tasksTaskInfo.description) &&
        Objects.equals(this.category, tasksTaskInfo.category) &&
        Objects.equals(this.isHidden, tasksTaskInfo.isHidden) &&
        Objects.equals(this.key, tasksTaskInfo.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, currentProgressPercentage, id, lastExecutionResult, triggers, description, category, isHidden, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TasksTaskInfo {\n");
    
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
