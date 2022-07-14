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
import io.swagger.client.model.DayOfWeek;
import io.swagger.client.model.TasksSystemEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TasksTaskTriggerInfo
 */


public class TasksTaskTriggerInfo {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("TimeOfDayTicks")
  private Long timeOfDayTicks = null;

  @SerializedName("IntervalTicks")
  private Long intervalTicks = null;

  @SerializedName("SystemEvent")
  private TasksSystemEvent systemEvent = null;

  @SerializedName("DayOfWeek")
  private DayOfWeek dayOfWeek = null;

  @SerializedName("MaxRuntimeTicks")
  private Long maxRuntimeTicks = null;

  public TasksTaskTriggerInfo type(String type) {
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

  public TasksTaskTriggerInfo timeOfDayTicks(Long timeOfDayTicks) {
    this.timeOfDayTicks = timeOfDayTicks;
    return this;
  }

   /**
   * Get timeOfDayTicks
   * @return timeOfDayTicks
  **/
  @Schema(description = "")
  public Long getTimeOfDayTicks() {
    return timeOfDayTicks;
  }

  public void setTimeOfDayTicks(Long timeOfDayTicks) {
    this.timeOfDayTicks = timeOfDayTicks;
  }

  public TasksTaskTriggerInfo intervalTicks(Long intervalTicks) {
    this.intervalTicks = intervalTicks;
    return this;
  }

   /**
   * Get intervalTicks
   * @return intervalTicks
  **/
  @Schema(description = "")
  public Long getIntervalTicks() {
    return intervalTicks;
  }

  public void setIntervalTicks(Long intervalTicks) {
    this.intervalTicks = intervalTicks;
  }

  public TasksTaskTriggerInfo systemEvent(TasksSystemEvent systemEvent) {
    this.systemEvent = systemEvent;
    return this;
  }

   /**
   * Get systemEvent
   * @return systemEvent
  **/
  @Schema(description = "")
  public TasksSystemEvent getSystemEvent() {
    return systemEvent;
  }

  public void setSystemEvent(TasksSystemEvent systemEvent) {
    this.systemEvent = systemEvent;
  }

  public TasksTaskTriggerInfo dayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @Schema(description = "")
  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public TasksTaskTriggerInfo maxRuntimeTicks(Long maxRuntimeTicks) {
    this.maxRuntimeTicks = maxRuntimeTicks;
    return this;
  }

   /**
   * Get maxRuntimeTicks
   * @return maxRuntimeTicks
  **/
  @Schema(description = "")
  public Long getMaxRuntimeTicks() {
    return maxRuntimeTicks;
  }

  public void setMaxRuntimeTicks(Long maxRuntimeTicks) {
    this.maxRuntimeTicks = maxRuntimeTicks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TasksTaskTriggerInfo tasksTaskTriggerInfo = (TasksTaskTriggerInfo) o;
    return Objects.equals(this.type, tasksTaskTriggerInfo.type) &&
        Objects.equals(this.timeOfDayTicks, tasksTaskTriggerInfo.timeOfDayTicks) &&
        Objects.equals(this.intervalTicks, tasksTaskTriggerInfo.intervalTicks) &&
        Objects.equals(this.systemEvent, tasksTaskTriggerInfo.systemEvent) &&
        Objects.equals(this.dayOfWeek, tasksTaskTriggerInfo.dayOfWeek) &&
        Objects.equals(this.maxRuntimeTicks, tasksTaskTriggerInfo.maxRuntimeTicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, timeOfDayTicks, intervalTicks, systemEvent, dayOfWeek, maxRuntimeTicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TasksTaskTriggerInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeOfDayTicks: ").append(toIndentedString(timeOfDayTicks)).append("\n");
    sb.append("    intervalTicks: ").append(toIndentedString(intervalTicks)).append("\n");
    sb.append("    systemEvent: ").append(toIndentedString(systemEvent)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    maxRuntimeTicks: ").append(toIndentedString(maxRuntimeTicks)).append("\n");
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
