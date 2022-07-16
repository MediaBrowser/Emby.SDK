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
import io.swagger.client.model.DlnaCodecType;
import io.swagger.client.model.DlnaProfileCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DlnaCodecProfile
 */


public class DlnaCodecProfile {
  @SerializedName("Type")
  private DlnaCodecType type = null;

  @SerializedName("Conditions")
  private List<DlnaProfileCondition> conditions = null;

  @SerializedName("ApplyConditions")
  private List<DlnaProfileCondition> applyConditions = null;

  @SerializedName("Codec")
  private String codec = null;

  @SerializedName("Container")
  private String container = null;

  public DlnaCodecProfile type(DlnaCodecType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DlnaCodecType getType() {
    return type;
  }

  public void setType(DlnaCodecType type) {
    this.type = type;
  }

  public DlnaCodecProfile conditions(List<DlnaProfileCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public DlnaCodecProfile addConditionsItem(DlnaProfileCondition conditionsItem) {
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

  public DlnaCodecProfile applyConditions(List<DlnaProfileCondition> applyConditions) {
    this.applyConditions = applyConditions;
    return this;
  }

  public DlnaCodecProfile addApplyConditionsItem(DlnaProfileCondition applyConditionsItem) {
    if (this.applyConditions == null) {
      this.applyConditions = new ArrayList<DlnaProfileCondition>();
    }
    this.applyConditions.add(applyConditionsItem);
    return this;
  }

   /**
   * Get applyConditions
   * @return applyConditions
  **/
  @Schema(description = "")
  public List<DlnaProfileCondition> getApplyConditions() {
    return applyConditions;
  }

  public void setApplyConditions(List<DlnaProfileCondition> applyConditions) {
    this.applyConditions = applyConditions;
  }

  public DlnaCodecProfile codec(String codec) {
    this.codec = codec;
    return this;
  }

   /**
   * Get codec
   * @return codec
  **/
  @Schema(description = "")
  public String getCodec() {
    return codec;
  }

  public void setCodec(String codec) {
    this.codec = codec;
  }

  public DlnaCodecProfile container(String container) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlnaCodecProfile dlnaCodecProfile = (DlnaCodecProfile) o;
    return Objects.equals(this.type, dlnaCodecProfile.type) &&
        Objects.equals(this.conditions, dlnaCodecProfile.conditions) &&
        Objects.equals(this.applyConditions, dlnaCodecProfile.applyConditions) &&
        Objects.equals(this.codec, dlnaCodecProfile.codec) &&
        Objects.equals(this.container, dlnaCodecProfile.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, conditions, applyConditions, codec, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaCodecProfile {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    applyConditions: ").append(toIndentedString(applyConditions)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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
