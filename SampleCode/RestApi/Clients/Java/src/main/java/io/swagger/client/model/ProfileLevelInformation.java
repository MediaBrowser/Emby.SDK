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
import io.swagger.client.model.LevelInformation;
import io.swagger.client.model.ProfileInformation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A class combining both &#x60;Emby.Media.Model.Types.ProfileInformation&#x60; and &#x60;Emby.Media.Model.Types.LevelInformation&#x60;.  
 */
@Schema(description = "A class combining both `Emby.Media.Model.Types.ProfileInformation` and `Emby.Media.Model.Types.LevelInformation`.  ")

public class ProfileLevelInformation {
  @SerializedName("Profile")
  private ProfileInformation profile = null;

  @SerializedName("Level")
  private LevelInformation level = null;

  public ProfileLevelInformation profile(ProfileInformation profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(description = "")
  public ProfileInformation getProfile() {
    return profile;
  }

  public void setProfile(ProfileInformation profile) {
    this.profile = profile;
  }

  public ProfileLevelInformation level(LevelInformation level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public LevelInformation getLevel() {
    return level;
  }

  public void setLevel(LevelInformation level) {
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
    ProfileLevelInformation profileLevelInformation = (ProfileLevelInformation) o;
    return Objects.equals(this.profile, profileLevelInformation.profile) &&
        Objects.equals(this.level, profileLevelInformation.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileLevelInformation {\n");
    
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
