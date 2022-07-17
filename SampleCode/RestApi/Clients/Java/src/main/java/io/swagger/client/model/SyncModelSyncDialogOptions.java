/*
 * Emby REST API
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
import io.swagger.client.model.SyncModelSyncJobOption;
import io.swagger.client.model.SyncModelSyncProfileOption;
import io.swagger.client.model.SyncModelSyncQualityOption;
import io.swagger.client.model.SyncSyncTarget;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncModelSyncDialogOptions
 */


public class SyncModelSyncDialogOptions {
  @SerializedName("Targets")
  private List<SyncSyncTarget> targets = null;

  @SerializedName("Options")
  private List<SyncModelSyncJobOption> options = null;

  @SerializedName("QualityOptions")
  private List<SyncModelSyncQualityOption> qualityOptions = null;

  @SerializedName("ProfileOptions")
  private List<SyncModelSyncProfileOption> profileOptions = null;

  public SyncModelSyncDialogOptions targets(List<SyncSyncTarget> targets) {
    this.targets = targets;
    return this;
  }

  public SyncModelSyncDialogOptions addTargetsItem(SyncSyncTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<SyncSyncTarget>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Schema(description = "")
  public List<SyncSyncTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<SyncSyncTarget> targets) {
    this.targets = targets;
  }

  public SyncModelSyncDialogOptions options(List<SyncModelSyncJobOption> options) {
    this.options = options;
    return this;
  }

  public SyncModelSyncDialogOptions addOptionsItem(SyncModelSyncJobOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<SyncModelSyncJobOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public List<SyncModelSyncJobOption> getOptions() {
    return options;
  }

  public void setOptions(List<SyncModelSyncJobOption> options) {
    this.options = options;
  }

  public SyncModelSyncDialogOptions qualityOptions(List<SyncModelSyncQualityOption> qualityOptions) {
    this.qualityOptions = qualityOptions;
    return this;
  }

  public SyncModelSyncDialogOptions addQualityOptionsItem(SyncModelSyncQualityOption qualityOptionsItem) {
    if (this.qualityOptions == null) {
      this.qualityOptions = new ArrayList<SyncModelSyncQualityOption>();
    }
    this.qualityOptions.add(qualityOptionsItem);
    return this;
  }

   /**
   * Get qualityOptions
   * @return qualityOptions
  **/
  @Schema(description = "")
  public List<SyncModelSyncQualityOption> getQualityOptions() {
    return qualityOptions;
  }

  public void setQualityOptions(List<SyncModelSyncQualityOption> qualityOptions) {
    this.qualityOptions = qualityOptions;
  }

  public SyncModelSyncDialogOptions profileOptions(List<SyncModelSyncProfileOption> profileOptions) {
    this.profileOptions = profileOptions;
    return this;
  }

  public SyncModelSyncDialogOptions addProfileOptionsItem(SyncModelSyncProfileOption profileOptionsItem) {
    if (this.profileOptions == null) {
      this.profileOptions = new ArrayList<SyncModelSyncProfileOption>();
    }
    this.profileOptions.add(profileOptionsItem);
    return this;
  }

   /**
   * Get profileOptions
   * @return profileOptions
  **/
  @Schema(description = "")
  public List<SyncModelSyncProfileOption> getProfileOptions() {
    return profileOptions;
  }

  public void setProfileOptions(List<SyncModelSyncProfileOption> profileOptions) {
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
    SyncModelSyncDialogOptions syncModelSyncDialogOptions = (SyncModelSyncDialogOptions) o;
    return Objects.equals(this.targets, syncModelSyncDialogOptions.targets) &&
        Objects.equals(this.options, syncModelSyncDialogOptions.options) &&
        Objects.equals(this.qualityOptions, syncModelSyncDialogOptions.qualityOptions) &&
        Objects.equals(this.profileOptions, syncModelSyncDialogOptions.profileOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, options, qualityOptions, profileOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncDialogOptions {\n");
    
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
