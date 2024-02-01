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
import java.util.ArrayList;
import java.util.List;
/**
 * PublicSystemInfo
 */


public class PublicSystemInfo {
  @SerializedName("LocalAddress")
  private String localAddress = null;

  @SerializedName("LocalAddresses")
  private List<String> localAddresses = null;

  @SerializedName("WanAddress")
  private String wanAddress = null;

  @SerializedName("RemoteAddresses")
  private List<String> remoteAddresses = null;

  @SerializedName("ServerName")
  private String serverName = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("Id")
  private String id = null;

  public PublicSystemInfo localAddress(String localAddress) {
    this.localAddress = localAddress;
    return this;
  }

   /**
   * The local address.
   * @return localAddress
  **/
  @Schema(description = "The local address.")
  public String getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(String localAddress) {
    this.localAddress = localAddress;
  }

  public PublicSystemInfo localAddresses(List<String> localAddresses) {
    this.localAddresses = localAddresses;
    return this;
  }

  public PublicSystemInfo addLocalAddressesItem(String localAddressesItem) {
    if (this.localAddresses == null) {
      this.localAddresses = new ArrayList<String>();
    }
    this.localAddresses.add(localAddressesItem);
    return this;
  }

   /**
   * Get localAddresses
   * @return localAddresses
  **/
  @Schema(description = "")
  public List<String> getLocalAddresses() {
    return localAddresses;
  }

  public void setLocalAddresses(List<String> localAddresses) {
    this.localAddresses = localAddresses;
  }

  public PublicSystemInfo wanAddress(String wanAddress) {
    this.wanAddress = wanAddress;
    return this;
  }

   /**
   * The wan address.
   * @return wanAddress
  **/
  @Schema(description = "The wan address.")
  public String getWanAddress() {
    return wanAddress;
  }

  public void setWanAddress(String wanAddress) {
    this.wanAddress = wanAddress;
  }

  public PublicSystemInfo remoteAddresses(List<String> remoteAddresses) {
    this.remoteAddresses = remoteAddresses;
    return this;
  }

  public PublicSystemInfo addRemoteAddressesItem(String remoteAddressesItem) {
    if (this.remoteAddresses == null) {
      this.remoteAddresses = new ArrayList<String>();
    }
    this.remoteAddresses.add(remoteAddressesItem);
    return this;
  }

   /**
   * Get remoteAddresses
   * @return remoteAddresses
  **/
  @Schema(description = "")
  public List<String> getRemoteAddresses() {
    return remoteAddresses;
  }

  public void setRemoteAddresses(List<String> remoteAddresses) {
    this.remoteAddresses = remoteAddresses;
  }

  public PublicSystemInfo serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * The name of the server.
   * @return serverName
  **/
  @Schema(description = "The name of the server.")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public PublicSystemInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version.
   * @return version
  **/
  @Schema(description = "The version.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PublicSystemInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id.
   * @return id
  **/
  @Schema(description = "The id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicSystemInfo publicSystemInfo = (PublicSystemInfo) o;
    return Objects.equals(this.localAddress, publicSystemInfo.localAddress) &&
        Objects.equals(this.localAddresses, publicSystemInfo.localAddresses) &&
        Objects.equals(this.wanAddress, publicSystemInfo.wanAddress) &&
        Objects.equals(this.remoteAddresses, publicSystemInfo.remoteAddresses) &&
        Objects.equals(this.serverName, publicSystemInfo.serverName) &&
        Objects.equals(this.version, publicSystemInfo.version) &&
        Objects.equals(this.id, publicSystemInfo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localAddress, localAddresses, wanAddress, remoteAddresses, serverName, version, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicSystemInfo {\n");
    
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    localAddresses: ").append(toIndentedString(localAddresses)).append("\n");
    sb.append("    wanAddress: ").append(toIndentedString(wanAddress)).append("\n");
    sb.append("    remoteAddresses: ").append(toIndentedString(remoteAddresses)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
