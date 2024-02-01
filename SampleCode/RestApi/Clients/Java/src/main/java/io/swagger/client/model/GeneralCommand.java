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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * GeneralCommand
 */


public class GeneralCommand {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("ControllingUserId")
  private String controllingUserId = null;

  @SerializedName("Arguments")
  private Map<String, String> arguments = null;

  public GeneralCommand name(String name) {
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

  public GeneralCommand controllingUserId(String controllingUserId) {
    this.controllingUserId = controllingUserId;
    return this;
  }

   /**
   * Get controllingUserId
   * @return controllingUserId
  **/
  @Schema(description = "")
  public String getControllingUserId() {
    return controllingUserId;
  }

  public void setControllingUserId(String controllingUserId) {
    this.controllingUserId = controllingUserId;
  }

  public GeneralCommand arguments(Map<String, String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public GeneralCommand putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<String, String>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @Schema(description = "")
  public Map<String, String> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralCommand generalCommand = (GeneralCommand) o;
    return Objects.equals(this.name, generalCommand.name) &&
        Objects.equals(this.controllingUserId, generalCommand.controllingUserId) &&
        Objects.equals(this.arguments, generalCommand.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, controllingUserId, arguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralCommand {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    controllingUserId: ").append(toIndentedString(controllingUserId)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
