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
import io.swagger.client.model.DynamicDayOfWeek;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AccessSchedule
 */


public class AccessSchedule {
  @SerializedName("DayOfWeek")
  private DynamicDayOfWeek dayOfWeek = null;

  @SerializedName("StartHour")
  private Double startHour = null;

  @SerializedName("EndHour")
  private Double endHour = null;

  public AccessSchedule dayOfWeek(DynamicDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @Schema(description = "")
  public DynamicDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DynamicDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public AccessSchedule startHour(Double startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * The start hour.
   * @return startHour
  **/
  @Schema(description = "The start hour.")
  public Double getStartHour() {
    return startHour;
  }

  public void setStartHour(Double startHour) {
    this.startHour = startHour;
  }

  public AccessSchedule endHour(Double endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * The end hour.
   * @return endHour
  **/
  @Schema(description = "The end hour.")
  public Double getEndHour() {
    return endHour;
  }

  public void setEndHour(Double endHour) {
    this.endHour = endHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchedule accessSchedule = (AccessSchedule) o;
    return Objects.equals(this.dayOfWeek, accessSchedule.dayOfWeek) &&
        Objects.equals(this.startHour, accessSchedule.startHour) &&
        Objects.equals(this.endHour, accessSchedule.endHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, startHour, endHour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchedule {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
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
