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
import io.swagger.client.model.MetadataFeatures;
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

  @SerializedName("SetupUrl")
  private String setupUrl = null;

  @SerializedName("DefaultEnabled")
  private Boolean defaultEnabled = null;

  @SerializedName("Features")
  private List<MetadataFeatures> features = null;

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

  public LibraryLibraryOptionInfo setupUrl(String setupUrl) {
    this.setupUrl = setupUrl;
    return this;
  }

   /**
   * Get setupUrl
   * @return setupUrl
  **/
  @Schema(description = "")
  public String getSetupUrl() {
    return setupUrl;
  }

  public void setSetupUrl(String setupUrl) {
    this.setupUrl = setupUrl;
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

  public LibraryLibraryOptionInfo features(List<MetadataFeatures> features) {
    this.features = features;
    return this;
  }

  public LibraryLibraryOptionInfo addFeaturesItem(MetadataFeatures featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<MetadataFeatures>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @Schema(description = "")
  public List<MetadataFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<MetadataFeatures> features) {
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
        Objects.equals(this.setupUrl, libraryLibraryOptionInfo.setupUrl) &&
        Objects.equals(this.defaultEnabled, libraryLibraryOptionInfo.defaultEnabled) &&
        Objects.equals(this.features, libraryLibraryOptionInfo.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, setupUrl, defaultEnabled, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryLibraryOptionInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    setupUrl: ").append(toIndentedString(setupUrl)).append("\n");
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
