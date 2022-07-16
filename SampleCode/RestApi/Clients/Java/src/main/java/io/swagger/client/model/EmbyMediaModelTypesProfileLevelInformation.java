/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EmbyMediaModelTypesLevelInformation;
import io.swagger.client.model.EmbyMediaModelTypesProfileInformation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyMediaModelTypesProfileLevelInformation
 */


public class EmbyMediaModelTypesProfileLevelInformation {
  @SerializedName("Profile")
  private EmbyMediaModelTypesProfileInformation profile = null;

  @SerializedName("Level")
  private EmbyMediaModelTypesLevelInformation level = null;

  public EmbyMediaModelTypesProfileLevelInformation profile(EmbyMediaModelTypesProfileInformation profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(description = "")
  public EmbyMediaModelTypesProfileInformation getProfile() {
    return profile;
  }

  public void setProfile(EmbyMediaModelTypesProfileInformation profile) {
    this.profile = profile;
  }

  public EmbyMediaModelTypesProfileLevelInformation level(EmbyMediaModelTypesLevelInformation level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public EmbyMediaModelTypesLevelInformation getLevel() {
    return level;
  }

  public void setLevel(EmbyMediaModelTypesLevelInformation level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyMediaModelTypesProfileLevelInformation embyMediaModelTypesProfileLevelInformation = (EmbyMediaModelTypesProfileLevelInformation) o;
    return Objects.equals(this.profile, embyMediaModelTypesProfileLevelInformation.profile) &&
        Objects.equals(this.level, embyMediaModelTypesProfileLevelInformation.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyMediaModelTypesProfileLevelInformation {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
