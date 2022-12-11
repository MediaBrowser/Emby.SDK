/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.EmbyFeaturesFeatureType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyFeaturesFeatureInfo
 */


public class EmbyFeaturesFeatureInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("FeatureType")
  private EmbyFeaturesFeatureType featureType = null;

  public EmbyFeaturesFeatureInfo name(String name) {
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

  public EmbyFeaturesFeatureInfo id(String id) {
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

  public EmbyFeaturesFeatureInfo featureType(EmbyFeaturesFeatureType featureType) {
    this.featureType = featureType;
    return this;
  }

   /**
   * Get featureType
   * @return featureType
  **/
  @Schema(description = "")
  public EmbyFeaturesFeatureType getFeatureType() {
    return featureType;
  }

  public void setFeatureType(EmbyFeaturesFeatureType featureType) {
    this.featureType = featureType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyFeaturesFeatureInfo embyFeaturesFeatureInfo = (EmbyFeaturesFeatureInfo) o;
    return Objects.equals(this.name, embyFeaturesFeatureInfo.name) &&
        Objects.equals(this.id, embyFeaturesFeatureInfo.id) &&
        Objects.equals(this.featureType, embyFeaturesFeatureInfo.featureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, featureType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyFeaturesFeatureInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
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
