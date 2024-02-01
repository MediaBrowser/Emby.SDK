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
import io.swagger.client.model.OperatingSystem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ConfigurationToneMappingToneMapOptionsVisibility
 */


public class ConfigurationToneMappingToneMapOptionsVisibility {
  @SerializedName("ShowAdvanced")
  private Boolean showAdvanced = null;

  @SerializedName("IsSoftwareToneMappingAvailable")
  private Boolean isSoftwareToneMappingAvailable = null;

  @SerializedName("IsAnyHardwareToneMappingAvailable")
  private Boolean isAnyHardwareToneMappingAvailable = null;

  @SerializedName("ShowNvidiaOptions")
  private Boolean showNvidiaOptions = null;

  @SerializedName("ShowQuickSyncOptions")
  private Boolean showQuickSyncOptions = null;

  @SerializedName("ShowVaapiOptions")
  private Boolean showVaapiOptions = null;

  @SerializedName("IsOpenClAvailable")
  private Boolean isOpenClAvailable = null;

  @SerializedName("IsOpenClSuperTAvailable")
  private Boolean isOpenClSuperTAvailable = null;

  @SerializedName("IsVaapiNativeAvailable")
  private Boolean isVaapiNativeAvailable = null;

  @SerializedName("IsQuickSyncNativeAvailable")
  private Boolean isQuickSyncNativeAvailable = null;

  @SerializedName("OperatingSystem")
  private OperatingSystem operatingSystem = null;

  public ConfigurationToneMappingToneMapOptionsVisibility showAdvanced(Boolean showAdvanced) {
    this.showAdvanced = showAdvanced;
    return this;
  }

   /**
   * Get showAdvanced
   * @return showAdvanced
  **/
  @Schema(description = "")
  public Boolean isShowAdvanced() {
    return showAdvanced;
  }

  public void setShowAdvanced(Boolean showAdvanced) {
    this.showAdvanced = showAdvanced;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility isSoftwareToneMappingAvailable(Boolean isSoftwareToneMappingAvailable) {
    this.isSoftwareToneMappingAvailable = isSoftwareToneMappingAvailable;
    return this;
  }

   /**
   * Get isSoftwareToneMappingAvailable
   * @return isSoftwareToneMappingAvailable
  **/
  @Schema(description = "")
  public Boolean isIsSoftwareToneMappingAvailable() {
    return isSoftwareToneMappingAvailable;
  }

  public void setIsSoftwareToneMappingAvailable(Boolean isSoftwareToneMappingAvailable) {
    this.isSoftwareToneMappingAvailable = isSoftwareToneMappingAvailable;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility isAnyHardwareToneMappingAvailable(Boolean isAnyHardwareToneMappingAvailable) {
    this.isAnyHardwareToneMappingAvailable = isAnyHardwareToneMappingAvailable;
    return this;
  }

   /**
   * Get isAnyHardwareToneMappingAvailable
   * @return isAnyHardwareToneMappingAvailable
  **/
  @Schema(description = "")
  public Boolean isIsAnyHardwareToneMappingAvailable() {
    return isAnyHardwareToneMappingAvailable;
  }

  public void setIsAnyHardwareToneMappingAvailable(Boolean isAnyHardwareToneMappingAvailable) {
    this.isAnyHardwareToneMappingAvailable = isAnyHardwareToneMappingAvailable;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility showNvidiaOptions(Boolean showNvidiaOptions) {
    this.showNvidiaOptions = showNvidiaOptions;
    return this;
  }

   /**
   * Get showNvidiaOptions
   * @return showNvidiaOptions
  **/
  @Schema(description = "")
  public Boolean isShowNvidiaOptions() {
    return showNvidiaOptions;
  }

  public void setShowNvidiaOptions(Boolean showNvidiaOptions) {
    this.showNvidiaOptions = showNvidiaOptions;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility showQuickSyncOptions(Boolean showQuickSyncOptions) {
    this.showQuickSyncOptions = showQuickSyncOptions;
    return this;
  }

   /**
   * Get showQuickSyncOptions
   * @return showQuickSyncOptions
  **/
  @Schema(description = "")
  public Boolean isShowQuickSyncOptions() {
    return showQuickSyncOptions;
  }

  public void setShowQuickSyncOptions(Boolean showQuickSyncOptions) {
    this.showQuickSyncOptions = showQuickSyncOptions;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility showVaapiOptions(Boolean showVaapiOptions) {
    this.showVaapiOptions = showVaapiOptions;
    return this;
  }

   /**
   * Get showVaapiOptions
   * @return showVaapiOptions
  **/
  @Schema(description = "")
  public Boolean isShowVaapiOptions() {
    return showVaapiOptions;
  }

  public void setShowVaapiOptions(Boolean showVaapiOptions) {
    this.showVaapiOptions = showVaapiOptions;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility isOpenClAvailable(Boolean isOpenClAvailable) {
    this.isOpenClAvailable = isOpenClAvailable;
    return this;
  }

   /**
   * Get isOpenClAvailable
   * @return isOpenClAvailable
  **/
  @Schema(description = "")
  public Boolean isIsOpenClAvailable() {
    return isOpenClAvailable;
  }

  public void setIsOpenClAvailable(Boolean isOpenClAvailable) {
    this.isOpenClAvailable = isOpenClAvailable;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility isOpenClSuperTAvailable(Boolean isOpenClSuperTAvailable) {
    this.isOpenClSuperTAvailable = isOpenClSuperTAvailable;
    return this;
  }

   /**
   * Get isOpenClSuperTAvailable
   * @return isOpenClSuperTAvailable
  **/
  @Schema(description = "")
  public Boolean isIsOpenClSuperTAvailable() {
    return isOpenClSuperTAvailable;
  }

  public void setIsOpenClSuperTAvailable(Boolean isOpenClSuperTAvailable) {
    this.isOpenClSuperTAvailable = isOpenClSuperTAvailable;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility isVaapiNativeAvailable(Boolean isVaapiNativeAvailable) {
    this.isVaapiNativeAvailable = isVaapiNativeAvailable;
    return this;
  }

   /**
   * Get isVaapiNativeAvailable
   * @return isVaapiNativeAvailable
  **/
  @Schema(description = "")
  public Boolean isIsVaapiNativeAvailable() {
    return isVaapiNativeAvailable;
  }

  public void setIsVaapiNativeAvailable(Boolean isVaapiNativeAvailable) {
    this.isVaapiNativeAvailable = isVaapiNativeAvailable;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility isQuickSyncNativeAvailable(Boolean isQuickSyncNativeAvailable) {
    this.isQuickSyncNativeAvailable = isQuickSyncNativeAvailable;
    return this;
  }

   /**
   * Get isQuickSyncNativeAvailable
   * @return isQuickSyncNativeAvailable
  **/
  @Schema(description = "")
  public Boolean isIsQuickSyncNativeAvailable() {
    return isQuickSyncNativeAvailable;
  }

  public void setIsQuickSyncNativeAvailable(Boolean isQuickSyncNativeAvailable) {
    this.isQuickSyncNativeAvailable = isQuickSyncNativeAvailable;
  }

  public ConfigurationToneMappingToneMapOptionsVisibility operatingSystem(OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @Schema(description = "")
  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationToneMappingToneMapOptionsVisibility configurationToneMappingToneMapOptionsVisibility = (ConfigurationToneMappingToneMapOptionsVisibility) o;
    return Objects.equals(this.showAdvanced, configurationToneMappingToneMapOptionsVisibility.showAdvanced) &&
        Objects.equals(this.isSoftwareToneMappingAvailable, configurationToneMappingToneMapOptionsVisibility.isSoftwareToneMappingAvailable) &&
        Objects.equals(this.isAnyHardwareToneMappingAvailable, configurationToneMappingToneMapOptionsVisibility.isAnyHardwareToneMappingAvailable) &&
        Objects.equals(this.showNvidiaOptions, configurationToneMappingToneMapOptionsVisibility.showNvidiaOptions) &&
        Objects.equals(this.showQuickSyncOptions, configurationToneMappingToneMapOptionsVisibility.showQuickSyncOptions) &&
        Objects.equals(this.showVaapiOptions, configurationToneMappingToneMapOptionsVisibility.showVaapiOptions) &&
        Objects.equals(this.isOpenClAvailable, configurationToneMappingToneMapOptionsVisibility.isOpenClAvailable) &&
        Objects.equals(this.isOpenClSuperTAvailable, configurationToneMappingToneMapOptionsVisibility.isOpenClSuperTAvailable) &&
        Objects.equals(this.isVaapiNativeAvailable, configurationToneMappingToneMapOptionsVisibility.isVaapiNativeAvailable) &&
        Objects.equals(this.isQuickSyncNativeAvailable, configurationToneMappingToneMapOptionsVisibility.isQuickSyncNativeAvailable) &&
        Objects.equals(this.operatingSystem, configurationToneMappingToneMapOptionsVisibility.operatingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAdvanced, isSoftwareToneMappingAvailable, isAnyHardwareToneMappingAvailable, showNvidiaOptions, showQuickSyncOptions, showVaapiOptions, isOpenClAvailable, isOpenClSuperTAvailable, isVaapiNativeAvailable, isQuickSyncNativeAvailable, operatingSystem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationToneMappingToneMapOptionsVisibility {\n");
    
    sb.append("    showAdvanced: ").append(toIndentedString(showAdvanced)).append("\n");
    sb.append("    isSoftwareToneMappingAvailable: ").append(toIndentedString(isSoftwareToneMappingAvailable)).append("\n");
    sb.append("    isAnyHardwareToneMappingAvailable: ").append(toIndentedString(isAnyHardwareToneMappingAvailable)).append("\n");
    sb.append("    showNvidiaOptions: ").append(toIndentedString(showNvidiaOptions)).append("\n");
    sb.append("    showQuickSyncOptions: ").append(toIndentedString(showQuickSyncOptions)).append("\n");
    sb.append("    showVaapiOptions: ").append(toIndentedString(showVaapiOptions)).append("\n");
    sb.append("    isOpenClAvailable: ").append(toIndentedString(isOpenClAvailable)).append("\n");
    sb.append("    isOpenClSuperTAvailable: ").append(toIndentedString(isOpenClSuperTAvailable)).append("\n");
    sb.append("    isVaapiNativeAvailable: ").append(toIndentedString(isVaapiNativeAvailable)).append("\n");
    sb.append("    isQuickSyncNativeAvailable: ").append(toIndentedString(isQuickSyncNativeAvailable)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
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
