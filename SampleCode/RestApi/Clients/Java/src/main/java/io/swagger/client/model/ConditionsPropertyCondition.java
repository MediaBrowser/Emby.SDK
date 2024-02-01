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
import io.swagger.client.model.AttributesSimpleCondition;
import io.swagger.client.model.AttributesValueCondition;
import io.swagger.client.model.ConditionsPropertyConditionType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ConditionsPropertyCondition
 */


public class ConditionsPropertyCondition {
  @SerializedName("AffectedPropertyId")
  private String affectedPropertyId = null;

  @SerializedName("ConditionType")
  private ConditionsPropertyConditionType conditionType = null;

  @SerializedName("TargetPropertyId")
  private String targetPropertyId = null;

  @SerializedName("SimpleCondition")
  private AttributesSimpleCondition simpleCondition = null;

  @SerializedName("ValueCondition")
  private AttributesValueCondition valueCondition = null;

  @SerializedName("Value")
  private Object value = null;

  public ConditionsPropertyCondition affectedPropertyId(String affectedPropertyId) {
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

  public ConditionsPropertyCondition conditionType(ConditionsPropertyConditionType conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Get conditionType
   * @return conditionType
  **/
  @Schema(description = "")
  public ConditionsPropertyConditionType getConditionType() {
    return conditionType;
  }

  public void setConditionType(ConditionsPropertyConditionType conditionType) {
    this.conditionType = conditionType;
  }

  public ConditionsPropertyCondition targetPropertyId(String targetPropertyId) {
    this.targetPropertyId = targetPropertyId;
    return this;
  }

   /**
   * The target property name or path.
   * @return targetPropertyId
  **/
  @Schema(description = "The target property name or path.")
  public String getTargetPropertyId() {
    return targetPropertyId;
  }

  public void setTargetPropertyId(String targetPropertyId) {
    this.targetPropertyId = targetPropertyId;
  }

  public ConditionsPropertyCondition simpleCondition(AttributesSimpleCondition simpleCondition) {
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

  public ConditionsPropertyCondition valueCondition(AttributesValueCondition valueCondition) {
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

  public ConditionsPropertyCondition value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value.
   * @return value
  **/
  @Schema(description = "The value.")
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
    ConditionsPropertyCondition conditionsPropertyCondition = (ConditionsPropertyCondition) o;
    return Objects.equals(this.affectedPropertyId, conditionsPropertyCondition.affectedPropertyId) &&
        Objects.equals(this.conditionType, conditionsPropertyCondition.conditionType) &&
        Objects.equals(this.targetPropertyId, conditionsPropertyCondition.targetPropertyId) &&
        Objects.equals(this.simpleCondition, conditionsPropertyCondition.simpleCondition) &&
        Objects.equals(this.valueCondition, conditionsPropertyCondition.valueCondition) &&
        Objects.equals(this.value, conditionsPropertyCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedPropertyId, conditionType, targetPropertyId, simpleCondition, valueCondition, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionsPropertyCondition {\n");
    
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
