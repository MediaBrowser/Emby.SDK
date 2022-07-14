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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyMediaModelTypesProfileInformation
 */


public class EmbyMediaModelTypesProfileInformation {
  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Details")
  private String details = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("BitDepths")
  private List<Integer> bitDepths = null;

  public EmbyMediaModelTypesProfileInformation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @Schema(description = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public EmbyMediaModelTypesProfileInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmbyMediaModelTypesProfileInformation details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public EmbyMediaModelTypesProfileInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmbyMediaModelTypesProfileInformation bitDepths(List<Integer> bitDepths) {
    this.bitDepths = bitDepths;
    return this;
  }

  public EmbyMediaModelTypesProfileInformation addBitDepthsItem(Integer bitDepthsItem) {
    if (this.bitDepths == null) {
      this.bitDepths = new ArrayList<Integer>();
    }
    this.bitDepths.add(bitDepthsItem);
    return this;
  }

   /**
   * Get bitDepths
   * @return bitDepths
  **/
  @Schema(description = "")
  public List<Integer> getBitDepths() {
    return bitDepths;
  }

  public void setBitDepths(List<Integer> bitDepths) {
    this.bitDepths = bitDepths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyMediaModelTypesProfileInformation embyMediaModelTypesProfileInformation = (EmbyMediaModelTypesProfileInformation) o;
    return Objects.equals(this.shortName, embyMediaModelTypesProfileInformation.shortName) &&
        Objects.equals(this.description, embyMediaModelTypesProfileInformation.description) &&
        Objects.equals(this.details, embyMediaModelTypesProfileInformation.details) &&
        Objects.equals(this.id, embyMediaModelTypesProfileInformation.id) &&
        Objects.equals(this.bitDepths, embyMediaModelTypesProfileInformation.bitDepths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortName, description, details, id, bitDepths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyMediaModelTypesProfileInformation {\n");
    
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bitDepths: ").append(toIndentedString(bitDepths)).append("\n");
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
