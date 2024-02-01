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
import io.swagger.client.model.ProfileConditionType;
import io.swagger.client.model.ProfileConditionValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProfileCondition
 */


public class ProfileCondition {
  @SerializedName("Condition")
  private ProfileConditionType condition = null;

  @SerializedName("Property")
  private ProfileConditionValue property = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("IsRequired")
  private Boolean isRequired = null;

  public ProfileCondition condition(ProfileConditionType condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Schema(description = "")
  public ProfileConditionType getCondition() {
    return condition;
  }

  public void setCondition(ProfileConditionType condition) {
    this.condition = condition;
  }

  public ProfileCondition property(ProfileConditionValue property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @Schema(description = "")
  public ProfileConditionValue getProperty() {
    return property;
  }

  public void setProperty(ProfileConditionValue property) {
    this.property = property;
  }

  public ProfileCondition value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ProfileCondition isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @Schema(description = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileCondition profileCondition = (ProfileCondition) o;
    return Objects.equals(this.condition, profileCondition.condition) &&
        Objects.equals(this.property, profileCondition.property) &&
        Objects.equals(this.value, profileCondition.value) &&
        Objects.equals(this.isRequired, profileCondition.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, property, value, isRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileCondition {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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
