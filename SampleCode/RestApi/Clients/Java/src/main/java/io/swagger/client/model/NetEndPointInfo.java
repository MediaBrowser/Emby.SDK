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
 * NetEndPointInfo
 */


public class NetEndPointInfo {
  @SerializedName("IsLocal")
  private Boolean isLocal = null;

  @SerializedName("IsInNetwork")
  private Boolean isInNetwork = null;

  public NetEndPointInfo isLocal(Boolean isLocal) {
    this.isLocal = isLocal;
    return this;
  }

   /**
   * Get isLocal
   * @return isLocal
  **/
  @Schema(description = "")
  public Boolean isIsLocal() {
    return isLocal;
  }

  public void setIsLocal(Boolean isLocal) {
    this.isLocal = isLocal;
  }

  public NetEndPointInfo isInNetwork(Boolean isInNetwork) {
    this.isInNetwork = isInNetwork;
    return this;
  }

   /**
   * Get isInNetwork
   * @return isInNetwork
  **/
  @Schema(description = "")
  public Boolean isIsInNetwork() {
    return isInNetwork;
  }

  public void setIsInNetwork(Boolean isInNetwork) {
    this.isInNetwork = isInNetwork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetEndPointInfo netEndPointInfo = (NetEndPointInfo) o;
    return Objects.equals(this.isLocal, netEndPointInfo.isLocal) &&
        Objects.equals(this.isInNetwork, netEndPointInfo.isInNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLocal, isInNetwork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetEndPointInfo {\n");
    
    sb.append("    isLocal: ").append(toIndentedString(isLocal)).append("\n");
    sb.append("    isInNetwork: ").append(toIndentedString(isInNetwork)).append("\n");
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
