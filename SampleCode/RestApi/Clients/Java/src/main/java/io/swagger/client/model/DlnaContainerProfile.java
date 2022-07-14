/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * DlnaContainerProfile
 */


public class DlnaContainerProfile {
  @SerializedName("Type")
  private DlnaDlnaProfileType type = null;

  @SerializedName("Conditions")
  private List<DlnaProfileCondition> conditions = null;

  @SerializedName("Container")
  private String container = null;

  public DlnaContainerProfile type(DlnaDlnaProfileType type) {
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

  public DlnaContainerProfile conditions(List<DlnaProfileCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public DlnaContainerProfile addConditionsItem(DlnaProfileCondition conditionsItem) {
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

  public DlnaContainerProfile container(String container) {
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
    DlnaContainerProfile dlnaContainerProfile = (DlnaContainerProfile) o;
    return Objects.equals(this.type, dlnaContainerProfile.type) &&
        Objects.equals(this.conditions, dlnaContainerProfile.conditions) &&
        Objects.equals(this.container, dlnaContainerProfile.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, conditions, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaContainerProfile {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
