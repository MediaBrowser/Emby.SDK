/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.MetadataFeatures;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryOptionInfo
 */


public class LibraryOptionInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("SetupUrl")
  private String setupUrl = null;

  @SerializedName("DefaultEnabled")
  private Boolean defaultEnabled = null;

  @SerializedName("Features")
  private List<MetadataFeatures> features = null;

  public LibraryOptionInfo name(String name) {
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

  public LibraryOptionInfo setupUrl(String setupUrl) {
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

  public LibraryOptionInfo defaultEnabled(Boolean defaultEnabled) {
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

  public LibraryOptionInfo features(List<MetadataFeatures> features) {
    this.features = features;
    return this;
  }

  public LibraryOptionInfo addFeaturesItem(MetadataFeatures featuresItem) {
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
    LibraryOptionInfo libraryOptionInfo = (LibraryOptionInfo) o;
    return Objects.equals(this.name, libraryOptionInfo.name) &&
        Objects.equals(this.setupUrl, libraryOptionInfo.setupUrl) &&
        Objects.equals(this.defaultEnabled, libraryOptionInfo.defaultEnabled) &&
        Objects.equals(this.features, libraryOptionInfo.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, setupUrl, defaultEnabled, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryOptionInfo {\n");
    
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
