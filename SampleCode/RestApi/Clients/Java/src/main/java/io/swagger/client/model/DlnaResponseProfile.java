/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DlnaDlnaProfileType;
import io.swagger.client.model.DlnaProfileCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DlnaResponseProfile
 */


public class DlnaResponseProfile {
  @SerializedName("Container")
  private String container = null;

  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("Type")
  private DlnaDlnaProfileType type = null;

  @SerializedName("OrgPn")
  private String orgPn = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  @SerializedName("Conditions")
  private List<DlnaProfileCondition> conditions = null;

  public DlnaResponseProfile container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public DlnaResponseProfile audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * Get audioCodec
   * @return audioCodec
  **/
  @Schema(description = "")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public DlnaResponseProfile videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * Get videoCodec
   * @return videoCodec
  **/
  @Schema(description = "")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public DlnaResponseProfile type(DlnaDlnaProfileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DlnaDlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaDlnaProfileType type) {
    this.type = type;
  }

  public DlnaResponseProfile orgPn(String orgPn) {
    this.orgPn = orgPn;
    return this;
  }

   /**
   * Get orgPn
   * @return orgPn
  **/
  @Schema(description = "")
  public String getOrgPn() {
    return orgPn;
  }

  public void setOrgPn(String orgPn) {
    this.orgPn = orgPn;
  }

  public DlnaResponseProfile mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public DlnaResponseProfile conditions(List<DlnaProfileCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public DlnaResponseProfile addConditionsItem(DlnaProfileCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<DlnaProfileCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public List<DlnaProfileCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<DlnaProfileCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlnaResponseProfile dlnaResponseProfile = (DlnaResponseProfile) o;
    return Objects.equals(this.container, dlnaResponseProfile.container) &&
        Objects.equals(this.audioCodec, dlnaResponseProfile.audioCodec) &&
        Objects.equals(this.videoCodec, dlnaResponseProfile.videoCodec) &&
        Objects.equals(this.type, dlnaResponseProfile.type) &&
        Objects.equals(this.orgPn, dlnaResponseProfile.orgPn) &&
        Objects.equals(this.mimeType, dlnaResponseProfile.mimeType) &&
        Objects.equals(this.conditions, dlnaResponseProfile.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, audioCodec, videoCodec, type, orgPn, mimeType, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaResponseProfile {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orgPn: ").append(toIndentedString(orgPn)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
