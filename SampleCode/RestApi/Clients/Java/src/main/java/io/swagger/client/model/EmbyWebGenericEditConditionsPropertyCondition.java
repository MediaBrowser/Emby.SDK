/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.AttributesSimpleCondition;
import io.swagger.client.model.AttributesValueCondition;
import io.swagger.client.model.EmbyWebGenericEditConditionsPropertyConditionType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyWebGenericEditConditionsPropertyCondition
 */


public class EmbyWebGenericEditConditionsPropertyCondition {
  @SerializedName("AffectedPropertyId")
  private String affectedPropertyId = null;

  @SerializedName("ConditionType")
  private EmbyWebGenericEditConditionsPropertyConditionType conditionType = null;

  @SerializedName("TargetPropertyId")
  private String targetPropertyId = null;

  @SerializedName("SimpleCondition")
  private AttributesSimpleCondition simpleCondition = null;

  @SerializedName("ValueCondition")
  private AttributesValueCondition valueCondition = null;

  @SerializedName("Value")
  private Object value = null;

  public EmbyWebGenericEditConditionsPropertyCondition affectedPropertyId(String affectedPropertyId) {
    this.affectedPropertyId = affectedPropertyId;
    return this;
  }

   /**
   * Get affectedPropertyId
   * @return affectedPropertyId
  **/
  @Schema(description = "")
  public String getAffectedPropertyId() {
    return affectedPropertyId;
  }

  public void setAffectedPropertyId(String affectedPropertyId) {
    this.affectedPropertyId = affectedPropertyId;
  }

  public EmbyWebGenericEditConditionsPropertyCondition conditionType(EmbyWebGenericEditConditionsPropertyConditionType conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Get conditionType
   * @return conditionType
  **/
  @Schema(description = "")
  public EmbyWebGenericEditConditionsPropertyConditionType getConditionType() {
    return conditionType;
  }

  public void setConditionType(EmbyWebGenericEditConditionsPropertyConditionType conditionType) {
    this.conditionType = conditionType;
  }

  public EmbyWebGenericEditConditionsPropertyCondition targetPropertyId(String targetPropertyId) {
    this.targetPropertyId = targetPropertyId;
    return this;
  }

   /**
   * Get targetPropertyId
   * @return targetPropertyId
  **/
  @Schema(description = "")
  public String getTargetPropertyId() {
    return targetPropertyId;
  }

  public void setTargetPropertyId(String targetPropertyId) {
    this.targetPropertyId = targetPropertyId;
  }

  public EmbyWebGenericEditConditionsPropertyCondition simpleCondition(AttributesSimpleCondition simpleCondition) {
    this.simpleCondition = simpleCondition;
    return this;
  }

   /**
   * Get simpleCondition
   * @return simpleCondition
  **/
  @Schema(description = "")
  public AttributesSimpleCondition getSimpleCondition() {
    return simpleCondition;
  }

  public void setSimpleCondition(AttributesSimpleCondition simpleCondition) {
    this.simpleCondition = simpleCondition;
  }

  public EmbyWebGenericEditConditionsPropertyCondition valueCondition(AttributesValueCondition valueCondition) {
    this.valueCondition = valueCondition;
    return this;
  }

   /**
   * Get valueCondition
   * @return valueCondition
  **/
  @Schema(description = "")
  public AttributesValueCondition getValueCondition() {
    return valueCondition;
  }

  public void setValueCondition(AttributesValueCondition valueCondition) {
    this.valueCondition = valueCondition;
  }

  public EmbyWebGenericEditConditionsPropertyCondition value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyWebGenericEditConditionsPropertyCondition embyWebGenericEditConditionsPropertyCondition = (EmbyWebGenericEditConditionsPropertyCondition) o;
    return Objects.equals(this.affectedPropertyId, embyWebGenericEditConditionsPropertyCondition.affectedPropertyId) &&
        Objects.equals(this.conditionType, embyWebGenericEditConditionsPropertyCondition.conditionType) &&
        Objects.equals(this.targetPropertyId, embyWebGenericEditConditionsPropertyCondition.targetPropertyId) &&
        Objects.equals(this.simpleCondition, embyWebGenericEditConditionsPropertyCondition.simpleCondition) &&
        Objects.equals(this.valueCondition, embyWebGenericEditConditionsPropertyCondition.valueCondition) &&
        Objects.equals(this.value, embyWebGenericEditConditionsPropertyCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedPropertyId, conditionType, targetPropertyId, simpleCondition, valueCondition, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebGenericEditConditionsPropertyCondition {\n");
    
    sb.append("    affectedPropertyId: ").append(toIndentedString(affectedPropertyId)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    targetPropertyId: ").append(toIndentedString(targetPropertyId)).append("\n");
    sb.append("    simpleCondition: ").append(toIndentedString(simpleCondition)).append("\n");
    sb.append("    valueCondition: ").append(toIndentedString(valueCondition)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
