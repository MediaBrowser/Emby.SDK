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
import io.swagger.client.model.CodecType;
import io.swagger.client.model.ProfileCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CodecProfile
 */


public class CodecProfile {
  @SerializedName("Type")
  private CodecType type = null;

  @SerializedName("Conditions")
  private List<ProfileCondition> conditions = null;

  @SerializedName("ApplyConditions")
  private List<ProfileCondition> applyConditions = null;

  @SerializedName("Codec")
  private String codec = null;

  @SerializedName("Container")
  private String container = null;

  public CodecProfile type(CodecType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public CodecType getType() {
    return type;
  }

  public void setType(CodecType type) {
    this.type = type;
  }

  public CodecProfile conditions(List<ProfileCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public CodecProfile addConditionsItem(ProfileCondition conditionsItem) {
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

  public CodecProfile applyConditions(List<ProfileCondition> applyConditions) {
    this.applyConditions = applyConditions;
    return this;
  }

  public CodecProfile addApplyConditionsItem(ProfileCondition applyConditionsItem) {
    if (this.applyConditions == null) {
      this.applyConditions = new ArrayList<ProfileCondition>();
    }
    this.applyConditions.add(applyConditionsItem);
    return this;
  }

   /**
   * Get applyConditions
   * @return applyConditions
  **/
  @Schema(description = "")
  public List<ProfileCondition> getApplyConditions() {
    return applyConditions;
  }

  public void setApplyConditions(List<ProfileCondition> applyConditions) {
    this.applyConditions = applyConditions;
  }

  public CodecProfile codec(String codec) {
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

  public CodecProfile container(String container) {
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
    CodecProfile codecProfile = (CodecProfile) o;
    return Objects.equals(this.type, codecProfile.type) &&
        Objects.equals(this.conditions, codecProfile.conditions) &&
        Objects.equals(this.applyConditions, codecProfile.applyConditions) &&
        Objects.equals(this.codec, codecProfile.codec) &&
        Objects.equals(this.container, codecProfile.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, conditions, applyConditions, codec, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodecProfile {\n");
    
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
