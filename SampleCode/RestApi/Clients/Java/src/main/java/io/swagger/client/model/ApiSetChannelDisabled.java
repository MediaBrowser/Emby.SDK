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
 * ApiSetChannelDisabled
 */


public class ApiSetChannelDisabled {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ManagementId")
  private String managementId = null;

  @SerializedName("Disabled")
  private Boolean disabled = null;

  public ApiSetChannelDisabled id(String id) {
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

  public ApiSetChannelDisabled managementId(String managementId) {
    this.managementId = managementId;
    return this;
  }

   /**
   * Get managementId
   * @return managementId
  **/
  @Schema(description = "")
  public String getManagementId() {
    return managementId;
  }

  public void setManagementId(String managementId) {
    this.managementId = managementId;
  }

  public ApiSetChannelDisabled disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Schema(description = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSetChannelDisabled apiSetChannelDisabled = (ApiSetChannelDisabled) o;
    return Objects.equals(this.id, apiSetChannelDisabled.id) &&
        Objects.equals(this.managementId, apiSetChannelDisabled.managementId) &&
        Objects.equals(this.disabled, apiSetChannelDisabled.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementId, disabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSetChannelDisabled {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managementId: ").append(toIndentedString(managementId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
