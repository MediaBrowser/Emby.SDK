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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SyncModelSyncProfileOption
 */


public class SyncModelSyncProfileOption {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("IsDefault")
  private Boolean isDefault = null;

  @SerializedName("EnableQualityOptions")
  private Boolean enableQualityOptions = null;

  public SyncModelSyncProfileOption name(String name) {
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

  public SyncModelSyncProfileOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SyncModelSyncProfileOption id(String id) {
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

  public SyncModelSyncProfileOption isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @Schema(description = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SyncModelSyncProfileOption enableQualityOptions(Boolean enableQualityOptions) {
    this.enableQualityOptions = enableQualityOptions;
    return this;
  }

   /**
   * Get enableQualityOptions
   * @return enableQualityOptions
  **/
  @Schema(description = "")
  public Boolean isEnableQualityOptions() {
    return enableQualityOptions;
  }

  public void setEnableQualityOptions(Boolean enableQualityOptions) {
    this.enableQualityOptions = enableQualityOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncProfileOption syncModelSyncProfileOption = (SyncModelSyncProfileOption) o;
    return Objects.equals(this.name, syncModelSyncProfileOption.name) &&
        Objects.equals(this.description, syncModelSyncProfileOption.description) &&
        Objects.equals(this.id, syncModelSyncProfileOption.id) &&
        Objects.equals(this.isDefault, syncModelSyncProfileOption.isDefault) &&
        Objects.equals(this.enableQualityOptions, syncModelSyncProfileOption.enableQualityOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, id, isDefault, enableQualityOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncProfileOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    enableQualityOptions: ").append(toIndentedString(enableQualityOptions)).append("\n");
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
