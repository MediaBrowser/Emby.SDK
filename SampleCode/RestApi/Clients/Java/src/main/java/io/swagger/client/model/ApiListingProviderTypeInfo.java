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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiListingProviderTypeInfo
 */


public class ApiListingProviderTypeInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("SetupUrl")
  private String setupUrl = null;

  public ApiListingProviderTypeInfo name(String name) {
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

  public ApiListingProviderTypeInfo id(String id) {
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

  public ApiListingProviderTypeInfo setupUrl(String setupUrl) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiListingProviderTypeInfo apiListingProviderTypeInfo = (ApiListingProviderTypeInfo) o;
    return Objects.equals(this.name, apiListingProviderTypeInfo.name) &&
        Objects.equals(this.id, apiListingProviderTypeInfo.id) &&
        Objects.equals(this.setupUrl, apiListingProviderTypeInfo.setupUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, setupUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiListingProviderTypeInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    setupUrl: ").append(toIndentedString(setupUrl)).append("\n");
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
