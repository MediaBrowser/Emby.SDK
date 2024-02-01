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
import io.swagger.client.model.TranscodingVpStepTypes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TranscodingVpStepInfo
 */


public class TranscodingVpStepInfo {
  @SerializedName("StepType")
  private TranscodingVpStepTypes stepType = null;

  @SerializedName("StepTypeName")
  private String stepTypeName = null;

  @SerializedName("HardwareContextName")
  private String hardwareContextName = null;

  @SerializedName("IsHardwareContext")
  private Boolean isHardwareContext = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Short")
  private String _short = null;

  @SerializedName("FfmpegName")
  private String ffmpegName = null;

  @SerializedName("FfmpegDescription")
  private String ffmpegDescription = null;

  @SerializedName("FfmpegOptions")
  private String ffmpegOptions = null;

  @SerializedName("Param")
  private String param = null;

  @SerializedName("ParamShort")
  private String paramShort = null;

  public TranscodingVpStepInfo stepType(TranscodingVpStepTypes stepType) {
    this.stepType = stepType;
    return this;
  }

   /**
   * Get stepType
   * @return stepType
  **/
  @Schema(description = "")
  public TranscodingVpStepTypes getStepType() {
    return stepType;
  }

  public void setStepType(TranscodingVpStepTypes stepType) {
    this.stepType = stepType;
  }

  public TranscodingVpStepInfo stepTypeName(String stepTypeName) {
    this.stepTypeName = stepTypeName;
    return this;
  }

   /**
   * Get stepTypeName
   * @return stepTypeName
  **/
  @Schema(description = "")
  public String getStepTypeName() {
    return stepTypeName;
  }

  public void setStepTypeName(String stepTypeName) {
    this.stepTypeName = stepTypeName;
  }

  public TranscodingVpStepInfo hardwareContextName(String hardwareContextName) {
    this.hardwareContextName = hardwareContextName;
    return this;
  }

   /**
   * Get hardwareContextName
   * @return hardwareContextName
  **/
  @Schema(description = "")
  public String getHardwareContextName() {
    return hardwareContextName;
  }

  public void setHardwareContextName(String hardwareContextName) {
    this.hardwareContextName = hardwareContextName;
  }

  public TranscodingVpStepInfo isHardwareContext(Boolean isHardwareContext) {
    this.isHardwareContext = isHardwareContext;
    return this;
  }

   /**
   * Get isHardwareContext
   * @return isHardwareContext
  **/
  @Schema(description = "")
  public Boolean isIsHardwareContext() {
    return isHardwareContext;
  }

  public void setIsHardwareContext(Boolean isHardwareContext) {
    this.isHardwareContext = isHardwareContext;
  }

  public TranscodingVpStepInfo name(String name) {
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

  public TranscodingVpStepInfo _short(String _short) {
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @Schema(description = "")
  public String getShort() {
    return _short;
  }

  public void setShort(String _short) {
    this._short = _short;
  }

  public TranscodingVpStepInfo ffmpegName(String ffmpegName) {
    this.ffmpegName = ffmpegName;
    return this;
  }

   /**
   * Get ffmpegName
   * @return ffmpegName
  **/
  @Schema(description = "")
  public String getFfmpegName() {
    return ffmpegName;
  }

  public void setFfmpegName(String ffmpegName) {
    this.ffmpegName = ffmpegName;
  }

  public TranscodingVpStepInfo ffmpegDescription(String ffmpegDescription) {
    this.ffmpegDescription = ffmpegDescription;
    return this;
  }

   /**
   * Get ffmpegDescription
   * @return ffmpegDescription
  **/
  @Schema(description = "")
  public String getFfmpegDescription() {
    return ffmpegDescription;
  }

  public void setFfmpegDescription(String ffmpegDescription) {
    this.ffmpegDescription = ffmpegDescription;
  }

  public TranscodingVpStepInfo ffmpegOptions(String ffmpegOptions) {
    this.ffmpegOptions = ffmpegOptions;
    return this;
  }

   /**
   * Get ffmpegOptions
   * @return ffmpegOptions
  **/
  @Schema(description = "")
  public String getFfmpegOptions() {
    return ffmpegOptions;
  }

  public void setFfmpegOptions(String ffmpegOptions) {
    this.ffmpegOptions = ffmpegOptions;
  }

  public TranscodingVpStepInfo param(String param) {
    this.param = param;
    return this;
  }

   /**
   * Get param
   * @return param
  **/
  @Schema(description = "")
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public TranscodingVpStepInfo paramShort(String paramShort) {
    this.paramShort = paramShort;
    return this;
  }

   /**
   * Get paramShort
   * @return paramShort
  **/
  @Schema(description = "")
  public String getParamShort() {
    return paramShort;
  }

  public void setParamShort(String paramShort) {
    this.paramShort = paramShort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscodingVpStepInfo transcodingVpStepInfo = (TranscodingVpStepInfo) o;
    return Objects.equals(this.stepType, transcodingVpStepInfo.stepType) &&
        Objects.equals(this.stepTypeName, transcodingVpStepInfo.stepTypeName) &&
        Objects.equals(this.hardwareContextName, transcodingVpStepInfo.hardwareContextName) &&
        Objects.equals(this.isHardwareContext, transcodingVpStepInfo.isHardwareContext) &&
        Objects.equals(this.name, transcodingVpStepInfo.name) &&
        Objects.equals(this._short, transcodingVpStepInfo._short) &&
        Objects.equals(this.ffmpegName, transcodingVpStepInfo.ffmpegName) &&
        Objects.equals(this.ffmpegDescription, transcodingVpStepInfo.ffmpegDescription) &&
        Objects.equals(this.ffmpegOptions, transcodingVpStepInfo.ffmpegOptions) &&
        Objects.equals(this.param, transcodingVpStepInfo.param) &&
        Objects.equals(this.paramShort, transcodingVpStepInfo.paramShort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepType, stepTypeName, hardwareContextName, isHardwareContext, name, _short, ffmpegName, ffmpegDescription, ffmpegOptions, param, paramShort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscodingVpStepInfo {\n");
    
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    stepTypeName: ").append(toIndentedString(stepTypeName)).append("\n");
    sb.append("    hardwareContextName: ").append(toIndentedString(hardwareContextName)).append("\n");
    sb.append("    isHardwareContext: ").append(toIndentedString(isHardwareContext)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    ffmpegName: ").append(toIndentedString(ffmpegName)).append("\n");
    sb.append("    ffmpegDescription: ").append(toIndentedString(ffmpegDescription)).append("\n");
    sb.append("    ffmpegOptions: ").append(toIndentedString(ffmpegOptions)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    paramShort: ").append(toIndentedString(paramShort)).append("\n");
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
