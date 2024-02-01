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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProcessRunMetricsProcessMetricPoint
 */


public class ProcessRunMetricsProcessMetricPoint {
  @SerializedName("Time")
  private String time = null;

  @SerializedName("CpuPercent")
  private Double cpuPercent = null;

  @SerializedName("VirtualMemory")
  private Double virtualMemory = null;

  @SerializedName("WorkingSet")
  private Double workingSet = null;

  public ProcessRunMetricsProcessMetricPoint time(String time) {
    this.time = time;
    return this;
  }

   /**
   * The time.
   * @return time
  **/
  @Schema(description = "The time.")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public ProcessRunMetricsProcessMetricPoint cpuPercent(Double cpuPercent) {
    this.cpuPercent = cpuPercent;
    return this;
  }

   /**
   * The cpu percent.
   * @return cpuPercent
  **/
  @Schema(description = "The cpu percent.")
  public Double getCpuPercent() {
    return cpuPercent;
  }

  public void setCpuPercent(Double cpuPercent) {
    this.cpuPercent = cpuPercent;
  }

  public ProcessRunMetricsProcessMetricPoint virtualMemory(Double virtualMemory) {
    this.virtualMemory = virtualMemory;
    return this;
  }

   /**
   * The virtual memory.
   * @return virtualMemory
  **/
  @Schema(description = "The virtual memory.")
  public Double getVirtualMemory() {
    return virtualMemory;
  }

  public void setVirtualMemory(Double virtualMemory) {
    this.virtualMemory = virtualMemory;
  }

  public ProcessRunMetricsProcessMetricPoint workingSet(Double workingSet) {
    this.workingSet = workingSet;
    return this;
  }

   /**
   * The working set.
   * @return workingSet
  **/
  @Schema(description = "The working set.")
  public Double getWorkingSet() {
    return workingSet;
  }

  public void setWorkingSet(Double workingSet) {
    this.workingSet = workingSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRunMetricsProcessMetricPoint processRunMetricsProcessMetricPoint = (ProcessRunMetricsProcessMetricPoint) o;
    return Objects.equals(this.time, processRunMetricsProcessMetricPoint.time) &&
        Objects.equals(this.cpuPercent, processRunMetricsProcessMetricPoint.cpuPercent) &&
        Objects.equals(this.virtualMemory, processRunMetricsProcessMetricPoint.virtualMemory) &&
        Objects.equals(this.workingSet, processRunMetricsProcessMetricPoint.workingSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, cpuPercent, virtualMemory, workingSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRunMetricsProcessMetricPoint {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
    sb.append("    virtualMemory: ").append(toIndentedString(virtualMemory)).append("\n");
    sb.append("    workingSet: ").append(toIndentedString(workingSet)).append("\n");
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
