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
import io.swagger.client.model.SystemEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Class TaskTriggerInfo  
 */
@Schema(description = "Class TaskTriggerInfo  ")

public class TaskTriggerInfo {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("TimeOfDayTicks")
  private Long timeOfDayTicks = null;

  @SerializedName("IntervalTicks")
  private Long intervalTicks = null;

  @SerializedName("SystemEvent")
  private SystemEvent systemEvent = null;

  @SerializedName("DayOfWeek")
  private DayOfWeek dayOfWeek = null;

  @SerializedName("MaxRuntimeTicks")
  private Long maxRuntimeTicks = null;

  public TaskTriggerInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type.
   * @return type
  **/
  @Schema(description = "The type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TaskTriggerInfo timeOfDayTicks(Long timeOfDayTicks) {
    this.timeOfDayTicks = timeOfDayTicks;
    return this;
  }

   /**
   * The time of day.
   * @return timeOfDayTicks
  **/
  @Schema(description = "The time of day.")
  public Long getTimeOfDayTicks() {
    return timeOfDayTicks;
  }

  public void setTimeOfDayTicks(Long timeOfDayTicks) {
    this.timeOfDayTicks = timeOfDayTicks;
  }

  public TaskTriggerInfo intervalTicks(Long intervalTicks) {
    this.intervalTicks = intervalTicks;
    return this;
  }

   /**
   * The interval.
   * @return intervalTicks
  **/
  @Schema(description = "The interval.")
  public Long getIntervalTicks() {
    return intervalTicks;
  }

  public void setIntervalTicks(Long intervalTicks) {
    this.intervalTicks = intervalTicks;
  }

  public TaskTriggerInfo systemEvent(SystemEvent systemEvent) {
    this.systemEvent = systemEvent;
    return this;
  }

   /**
   * Get systemEvent
   * @return systemEvent
  **/
  @Schema(description = "")
  public SystemEvent getSystemEvent() {
    return systemEvent;
  }

  public void setSystemEvent(SystemEvent systemEvent) {
    this.systemEvent = systemEvent;
  }

  public TaskTriggerInfo dayOfWeek(DayOfWeek dayOfWeek) {
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

  public TaskTriggerInfo maxRuntimeTicks(Long maxRuntimeTicks) {
    this.maxRuntimeTicks = maxRuntimeTicks;
    return this;
  }

   /**
   * The maximum runtime ticks.
   * @return maxRuntimeTicks
  **/
  @Schema(description = "The maximum runtime ticks.")
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
    TaskTriggerInfo taskTriggerInfo = (TaskTriggerInfo) o;
    return Objects.equals(this.type, taskTriggerInfo.type) &&
        Objects.equals(this.timeOfDayTicks, taskTriggerInfo.timeOfDayTicks) &&
        Objects.equals(this.intervalTicks, taskTriggerInfo.intervalTicks) &&
        Objects.equals(this.systemEvent, taskTriggerInfo.systemEvent) &&
        Objects.equals(this.dayOfWeek, taskTriggerInfo.dayOfWeek) &&
        Objects.equals(this.maxRuntimeTicks, taskTriggerInfo.maxRuntimeTicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, timeOfDayTicks, intervalTicks, systemEvent, dayOfWeek, maxRuntimeTicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskTriggerInfo {\n");
    
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
