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
import io.swagger.client.model.ProcessRunMetricsProcessMetricPoint;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProcessRunMetricsProcessStatistics
 */


public class ProcessRunMetricsProcessStatistics {
  @SerializedName("CurrentCpu")
  private Double currentCpu = null;

  @SerializedName("AverageCpu")
  private Double averageCpu = null;

  @SerializedName("CurrentVirtualMemory")
  private Double currentVirtualMemory = null;

  @SerializedName("CurrentWorkingSet")
  private Double currentWorkingSet = null;

  @SerializedName("Metrics")
  private List<ProcessRunMetricsProcessMetricPoint> metrics = null;

  public ProcessRunMetricsProcessStatistics currentCpu(Double currentCpu) {
    this.currentCpu = currentCpu;
    return this;
  }

   /**
   * The current cpu.
   * @return currentCpu
  **/
  @Schema(description = "The current cpu.")
  public Double getCurrentCpu() {
    return currentCpu;
  }

  public void setCurrentCpu(Double currentCpu) {
    this.currentCpu = currentCpu;
  }

  public ProcessRunMetricsProcessStatistics averageCpu(Double averageCpu) {
    this.averageCpu = averageCpu;
    return this;
  }

   /**
   * The average cpu.
   * @return averageCpu
  **/
  @Schema(description = "The average cpu.")
  public Double getAverageCpu() {
    return averageCpu;
  }

  public void setAverageCpu(Double averageCpu) {
    this.averageCpu = averageCpu;
  }

  public ProcessRunMetricsProcessStatistics currentVirtualMemory(Double currentVirtualMemory) {
    this.currentVirtualMemory = currentVirtualMemory;
    return this;
  }

   /**
   * The currently allocated virtual memory.
   * @return currentVirtualMemory
  **/
  @Schema(description = "The currently allocated virtual memory.")
  public Double getCurrentVirtualMemory() {
    return currentVirtualMemory;
  }

  public void setCurrentVirtualMemory(Double currentVirtualMemory) {
    this.currentVirtualMemory = currentVirtualMemory;
  }

  public ProcessRunMetricsProcessStatistics currentWorkingSet(Double currentWorkingSet) {
    this.currentWorkingSet = currentWorkingSet;
    return this;
  }

   /**
   * The currently allocated working set.
   * @return currentWorkingSet
  **/
  @Schema(description = "The currently allocated working set.")
  public Double getCurrentWorkingSet() {
    return currentWorkingSet;
  }

  public void setCurrentWorkingSet(Double currentWorkingSet) {
    this.currentWorkingSet = currentWorkingSet;
  }

  public ProcessRunMetricsProcessStatistics metrics(List<ProcessRunMetricsProcessMetricPoint> metrics) {
    this.metrics = metrics;
    return this;
  }

  public ProcessRunMetricsProcessStatistics addMetricsItem(ProcessRunMetricsProcessMetricPoint metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<ProcessRunMetricsProcessMetricPoint>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * The metrics.
   * @return metrics
  **/
  @Schema(description = "The metrics.")
  public List<ProcessRunMetricsProcessMetricPoint> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<ProcessRunMetricsProcessMetricPoint> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRunMetricsProcessStatistics processRunMetricsProcessStatistics = (ProcessRunMetricsProcessStatistics) o;
    return Objects.equals(this.currentCpu, processRunMetricsProcessStatistics.currentCpu) &&
        Objects.equals(this.averageCpu, processRunMetricsProcessStatistics.averageCpu) &&
        Objects.equals(this.currentVirtualMemory, processRunMetricsProcessStatistics.currentVirtualMemory) &&
        Objects.equals(this.currentWorkingSet, processRunMetricsProcessStatistics.currentWorkingSet) &&
        Objects.equals(this.metrics, processRunMetricsProcessStatistics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentCpu, averageCpu, currentVirtualMemory, currentWorkingSet, metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRunMetricsProcessStatistics {\n");
    
    sb.append("    currentCpu: ").append(toIndentedString(currentCpu)).append("\n");
    sb.append("    averageCpu: ").append(toIndentedString(averageCpu)).append("\n");
    sb.append("    currentVirtualMemory: ").append(toIndentedString(currentVirtualMemory)).append("\n");
    sb.append("    currentWorkingSet: ").append(toIndentedString(currentWorkingSet)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
