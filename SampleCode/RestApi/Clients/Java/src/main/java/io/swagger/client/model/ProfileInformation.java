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
import java.util.ArrayList;
import java.util.List;
/**
 * Class for unified presentation of all information associated with a specific codec profile.  
 */
@Schema(description = "Class for unified presentation of all information associated with a specific codec profile.  ")

public class ProfileInformation {
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

  public ProfileInformation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * The enum member name of the profile.
   * @return shortName
  **/
  @Schema(description = "The enum member name of the profile.")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public ProfileInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The common name of the profile.
   * @return description
  **/
  @Schema(description = "The common name of the profile.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProfileInformation details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Detail information about the profile.
   * @return details
  **/
  @Schema(description = "Detail information about the profile.")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ProfileInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier.
   * @return id
  **/
  @Schema(description = "A unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfileInformation bitDepths(List<Integer> bitDepths) {
    this.bitDepths = bitDepths;
    return this;
  }

  public ProfileInformation addBitDepthsItem(Integer bitDepthsItem) {
    if (this.bitDepths == null) {
      this.bitDepths = new ArrayList<Integer>();
    }
    this.bitDepths.add(bitDepthsItem);
    return this;
  }

   /**
   * The bit depths.
   * @return bitDepths
  **/
  @Schema(description = "The bit depths.")
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
    ProfileInformation profileInformation = (ProfileInformation) o;
    return Objects.equals(this.shortName, profileInformation.shortName) &&
        Objects.equals(this.description, profileInformation.description) &&
        Objects.equals(this.details, profileInformation.details) &&
        Objects.equals(this.id, profileInformation.id) &&
        Objects.equals(this.bitDepths, profileInformation.bitDepths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortName, description, details, id, bitDepths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileInformation {\n");
    
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
