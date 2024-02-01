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
 * DevicesDeviceOptions
 */


public class DevicesDeviceOptions {
  @SerializedName("CustomName")
  private String customName = null;

  public DevicesDeviceOptions customName(String customName) {
    this.customName = customName;
    return this;
  }

   /**
   * Get customName
   * @return customName
  **/
  @Schema(description = "")
  public String getCustomName() {
    return customName;
  }

  public void setCustomName(String customName) {
    this.customName = customName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesDeviceOptions devicesDeviceOptions = (DevicesDeviceOptions) o;
    return Objects.equals(this.customName, devicesDeviceOptions.customName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesDeviceOptions {\n");
    
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
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
