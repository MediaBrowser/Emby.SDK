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
/**
 * ApiNameIdDescriptionPair
 */


public class ApiNameIdDescriptionPair {
  @SerializedName("ShortOverview")
  private String shortOverview = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  public ApiNameIdDescriptionPair shortOverview(String shortOverview) {
    this.shortOverview = shortOverview;
    return this;
  }

   /**
   * Get shortOverview
   * @return shortOverview
  **/
  @Schema(description = "")
  public String getShortOverview() {
    return shortOverview;
  }

  public void setShortOverview(String shortOverview) {
    this.shortOverview = shortOverview;
  }

  public ApiNameIdDescriptionPair name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiNameIdDescriptionPair id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier.
   * @return id
  **/
  @Schema(description = "The identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNameIdDescriptionPair apiNameIdDescriptionPair = (ApiNameIdDescriptionPair) o;
    return Objects.equals(this.shortOverview, apiNameIdDescriptionPair.shortOverview) &&
        Objects.equals(this.name, apiNameIdDescriptionPair.name) &&
        Objects.equals(this.id, apiNameIdDescriptionPair.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortOverview, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNameIdDescriptionPair {\n");
    
    sb.append("    shortOverview: ").append(toIndentedString(shortOverview)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
