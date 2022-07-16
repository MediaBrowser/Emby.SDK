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
import io.swagger.client.model.ConfigurationDynamicDayOfWeek;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ConfigurationAccessSchedule
 */


public class ConfigurationAccessSchedule {
  @SerializedName("DayOfWeek")
  private ConfigurationDynamicDayOfWeek dayOfWeek = null;

  @SerializedName("StartHour")
  private Double startHour = null;

  @SerializedName("EndHour")
  private Double endHour = null;

  public ConfigurationAccessSchedule dayOfWeek(ConfigurationDynamicDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @Schema(description = "")
  public ConfigurationDynamicDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(ConfigurationDynamicDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public ConfigurationAccessSchedule startHour(Double startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @Schema(description = "")
  public Double getStartHour() {
    return startHour;
  }

  public void setStartHour(Double startHour) {
    this.startHour = startHour;
  }

  public ConfigurationAccessSchedule endHour(Double endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @Schema(description = "")
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
    ConfigurationAccessSchedule configurationAccessSchedule = (ConfigurationAccessSchedule) o;
    return Objects.equals(this.dayOfWeek, configurationAccessSchedule.dayOfWeek) &&
        Objects.equals(this.startHour, configurationAccessSchedule.startHour) &&
        Objects.equals(this.endHour, configurationAccessSchedule.endHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, startHour, endHour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationAccessSchedule {\n");
    
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
