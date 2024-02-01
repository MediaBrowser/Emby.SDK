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
 * ContainerProfile
 */


public class ContainerProfile {
  @SerializedName("Type")
  private DlnaProfileType type = null;

  @SerializedName("Conditions")
  private List<ProfileCondition> conditions = null;

  @SerializedName("Container")
  private String container = null;

  public ContainerProfile type(DlnaProfileType type) {
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

  public ContainerProfile conditions(List<ProfileCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ContainerProfile addConditionsItem(ProfileCondition conditionsItem) {
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

  public ContainerProfile container(String container) {
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
    ContainerProfile containerProfile = (ContainerProfile) o;
    return Objects.equals(this.type, containerProfile.type) &&
        Objects.equals(this.conditions, containerProfile.conditions) &&
        Objects.equals(this.container, containerProfile.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, conditions, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerProfile {\n");
    
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
