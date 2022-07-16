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
import io.swagger.client.model.ConfigurationMetadataFeatures;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryLibraryOptionInfo
 */


public class LibraryLibraryOptionInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("DefaultEnabled")
  private Boolean defaultEnabled = null;

  @SerializedName("Features")
  private List<ConfigurationMetadataFeatures> features = null;

  public LibraryLibraryOptionInfo name(String name) {
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

  public LibraryLibraryOptionInfo defaultEnabled(Boolean defaultEnabled) {
    this.defaultEnabled = defaultEnabled;
    return this;
  }

   /**
   * Get defaultEnabled
   * @return defaultEnabled
  **/
  @Schema(description = "")
  public Boolean isDefaultEnabled() {
    return defaultEnabled;
  }

  public void setDefaultEnabled(Boolean defaultEnabled) {
    this.defaultEnabled = defaultEnabled;
  }

  public LibraryLibraryOptionInfo features(List<ConfigurationMetadataFeatures> features) {
    this.features = features;
    return this;
  }

  public LibraryLibraryOptionInfo addFeaturesItem(ConfigurationMetadataFeatures featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<ConfigurationMetadataFeatures>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @Schema(description = "")
  public List<ConfigurationMetadataFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<ConfigurationMetadataFeatures> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryLibraryOptionInfo libraryLibraryOptionInfo = (LibraryLibraryOptionInfo) o;
    return Objects.equals(this.name, libraryLibraryOptionInfo.name) &&
        Objects.equals(this.defaultEnabled, libraryLibraryOptionInfo.defaultEnabled) &&
        Objects.equals(this.features, libraryLibraryOptionInfo.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultEnabled, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryLibraryOptionInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultEnabled: ").append(toIndentedString(defaultEnabled)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
