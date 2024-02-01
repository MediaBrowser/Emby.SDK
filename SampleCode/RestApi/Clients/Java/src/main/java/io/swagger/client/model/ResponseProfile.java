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
import io.swagger.client.model.DlnaProfileType;
import io.swagger.client.model.ProfileCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseProfile
 */


public class ResponseProfile {
  @SerializedName("Container")
  private String container = null;

  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("Type")
  private DlnaProfileType type = null;

  @SerializedName("OrgPn")
  private String orgPn = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  @SerializedName("Conditions")
  private List<ProfileCondition> conditions = null;

  public ResponseProfile container(String container) {
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

  public ResponseProfile audioCodec(String audioCodec) {
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

  public ResponseProfile videoCodec(String videoCodec) {
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

  public ResponseProfile type(DlnaProfileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaProfileType type) {
    this.type = type;
  }

  public ResponseProfile orgPn(String orgPn) {
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

  public ResponseProfile mimeType(String mimeType) {
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

  public ResponseProfile conditions(List<ProfileCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ResponseProfile addConditionsItem(ProfileCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ProfileCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public List<ProfileCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ProfileCondition> conditions) {
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
    ResponseProfile responseProfile = (ResponseProfile) o;
    return Objects.equals(this.container, responseProfile.container) &&
        Objects.equals(this.audioCodec, responseProfile.audioCodec) &&
        Objects.equals(this.videoCodec, responseProfile.videoCodec) &&
        Objects.equals(this.type, responseProfile.type) &&
        Objects.equals(this.orgPn, responseProfile.orgPn) &&
        Objects.equals(this.mimeType, responseProfile.mimeType) &&
        Objects.equals(this.conditions, responseProfile.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, audioCodec, videoCodec, type, orgPn, mimeType, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProfile {\n");
    
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
