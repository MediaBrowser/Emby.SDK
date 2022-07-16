/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
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
 * EmbyMediaModelTypesBitRate
 */


public class EmbyMediaModelTypesBitRate {
  @SerializedName("bps")
  private Long bps = null;

  @SerializedName("kbps")
  private Double kbps = null;

  @SerializedName("Mbps")
  private Double mbps = null;

  public EmbyMediaModelTypesBitRate bps(Long bps) {
    this.bps = bps;
    return this;
  }

   /**
   * Get bps
   * @return bps
  **/
  @Schema(description = "")
  public Long getBps() {
    return bps;
  }

  public void setBps(Long bps) {
    this.bps = bps;
  }

  public EmbyMediaModelTypesBitRate kbps(Double kbps) {
    this.kbps = kbps;
    return this;
  }

   /**
   * Get kbps
   * @return kbps
  **/
  @Schema(description = "")
  public Double getKbps() {
    return kbps;
  }

  public void setKbps(Double kbps) {
    this.kbps = kbps;
  }

  public EmbyMediaModelTypesBitRate mbps(Double mbps) {
    this.mbps = mbps;
    return this;
  }

   /**
   * Get mbps
   * @return mbps
  **/
  @Schema(description = "")
  public Double getMbps() {
    return mbps;
  }

  public void setMbps(Double mbps) {
    this.mbps = mbps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyMediaModelTypesBitRate embyMediaModelTypesBitRate = (EmbyMediaModelTypesBitRate) o;
    return Objects.equals(this.bps, embyMediaModelTypesBitRate.bps) &&
        Objects.equals(this.kbps, embyMediaModelTypesBitRate.kbps) &&
        Objects.equals(this.mbps, embyMediaModelTypesBitRate.mbps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bps, kbps, mbps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyMediaModelTypesBitRate {\n");
    
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    kbps: ").append(toIndentedString(kbps)).append("\n");
    sb.append("    mbps: ").append(toIndentedString(mbps)).append("\n");
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
