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
 * WakeOnLanInfo
 */


public class WakeOnLanInfo {
  @SerializedName("MacAddress")
  private String macAddress = null;

  @SerializedName("BroadcastAddress")
  private String broadcastAddress = null;

  @SerializedName("Port")
  private Integer port = null;

  public WakeOnLanInfo macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @Schema(description = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public WakeOnLanInfo broadcastAddress(String broadcastAddress) {
    this.broadcastAddress = broadcastAddress;
    return this;
  }

   /**
   * Get broadcastAddress
   * @return broadcastAddress
  **/
  @Schema(description = "")
  public String getBroadcastAddress() {
    return broadcastAddress;
  }

  public void setBroadcastAddress(String broadcastAddress) {
    this.broadcastAddress = broadcastAddress;
  }

  public WakeOnLanInfo port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WakeOnLanInfo wakeOnLanInfo = (WakeOnLanInfo) o;
    return Objects.equals(this.macAddress, wakeOnLanInfo.macAddress) &&
        Objects.equals(this.broadcastAddress, wakeOnLanInfo.broadcastAddress) &&
        Objects.equals(this.port, wakeOnLanInfo.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, broadcastAddress, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WakeOnLanInfo {\n");
    
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    broadcastAddress: ").append(toIndentedString(broadcastAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
