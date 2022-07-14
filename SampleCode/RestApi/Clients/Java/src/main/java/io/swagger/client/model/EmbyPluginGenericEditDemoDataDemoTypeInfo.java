/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
/**
 * EmbyPluginGenericEditDemoDataDemoTypeInfo
 */


public class EmbyPluginGenericEditDemoDataDemoTypeInfo {
  @SerializedName("DemoType")
  private Integer demoType = null;

  @SerializedName("Name")
  private String name = null;

  public EmbyPluginGenericEditDemoDataDemoTypeInfo demoType(Integer demoType) {
    this.demoType = demoType;
    return this;
  }

   /**
   * Get demoType
   * @return demoType
  **/
  @Schema(description = "")
  public Integer getDemoType() {
    return demoType;
  }

  public void setDemoType(Integer demoType) {
    this.demoType = demoType;
  }

  public EmbyPluginGenericEditDemoDataDemoTypeInfo name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyPluginGenericEditDemoDataDemoTypeInfo embyPluginGenericEditDemoDataDemoTypeInfo = (EmbyPluginGenericEditDemoDataDemoTypeInfo) o;
    return Objects.equals(this.demoType, embyPluginGenericEditDemoDataDemoTypeInfo.demoType) &&
        Objects.equals(this.name, embyPluginGenericEditDemoDataDemoTypeInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demoType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyPluginGenericEditDemoDataDemoTypeInfo {\n");
    
    sb.append("    demoType: ").append(toIndentedString(demoType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
