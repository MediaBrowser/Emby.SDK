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
import io.swagger.client.model.SyncJobOption;
import io.swagger.client.model.SyncProfileOption;
import io.swagger.client.model.SyncQualityOption;
import io.swagger.client.model.SyncTarget;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncDialogOptions
 */


public class SyncDialogOptions {
  @SerializedName("Targets")
  private List<SyncTarget> targets = null;

  @SerializedName("Options")
  private List<SyncJobOption> options = null;

  @SerializedName("QualityOptions")
  private List<SyncQualityOption> qualityOptions = null;

  @SerializedName("ProfileOptions")
  private List<SyncProfileOption> profileOptions = null;

  public SyncDialogOptions targets(List<SyncTarget> targets) {
    this.targets = targets;
    return this;
  }

  public SyncDialogOptions addTargetsItem(SyncTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<SyncTarget>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Schema(description = "")
  public List<SyncTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<SyncTarget> targets) {
    this.targets = targets;
  }

  public SyncDialogOptions options(List<SyncJobOption> options) {
    this.options = options;
    return this;
  }

  public SyncDialogOptions addOptionsItem(SyncJobOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<SyncJobOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public List<SyncJobOption> getOptions() {
    return options;
  }

  public void setOptions(List<SyncJobOption> options) {
    this.options = options;
  }

  public SyncDialogOptions qualityOptions(List<SyncQualityOption> qualityOptions) {
    this.qualityOptions = qualityOptions;
    return this;
  }

  public SyncDialogOptions addQualityOptionsItem(SyncQualityOption qualityOptionsItem) {
    if (this.qualityOptions == null) {
      this.qualityOptions = new ArrayList<SyncQualityOption>();
    }
    this.qualityOptions.add(qualityOptionsItem);
    return this;
  }

   /**
   * Get qualityOptions
   * @return qualityOptions
  **/
  @Schema(description = "")
  public List<SyncQualityOption> getQualityOptions() {
    return qualityOptions;
  }

  public void setQualityOptions(List<SyncQualityOption> qualityOptions) {
    this.qualityOptions = qualityOptions;
  }

  public SyncDialogOptions profileOptions(List<SyncProfileOption> profileOptions) {
    this.profileOptions = profileOptions;
    return this;
  }

  public SyncDialogOptions addProfileOptionsItem(SyncProfileOption profileOptionsItem) {
    if (this.profileOptions == null) {
      this.profileOptions = new ArrayList<SyncProfileOption>();
    }
    this.profileOptions.add(profileOptionsItem);
    return this;
  }

   /**
   * Get profileOptions
   * @return profileOptions
  **/
  @Schema(description = "")
  public List<SyncProfileOption> getProfileOptions() {
    return profileOptions;
  }

  public void setProfileOptions(List<SyncProfileOption> profileOptions) {
    this.profileOptions = profileOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncDialogOptions syncDialogOptions = (SyncDialogOptions) o;
    return Objects.equals(this.targets, syncDialogOptions.targets) &&
        Objects.equals(this.options, syncDialogOptions.options) &&
        Objects.equals(this.qualityOptions, syncDialogOptions.qualityOptions) &&
        Objects.equals(this.profileOptions, syncDialogOptions.profileOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, options, qualityOptions, profileOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncDialogOptions {\n");
    
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    qualityOptions: ").append(toIndentedString(qualityOptions)).append("\n");
    sb.append("    profileOptions: ").append(toIndentedString(profileOptions)).append("\n");
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
