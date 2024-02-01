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
 * A type for handling bit rates.      The purpose of this type is to avoid manual calculations and conversions in code,             unified handling and conversion as well as presentation through its various To\\*\\*\\*String methods.      &#x60;System.IComparable&#x60;      &#x60;System.IEquatable&#x60;1&#x60;  
 */
@Schema(description = "A type for handling bit rates.      The purpose of this type is to avoid manual calculations and conversions in code,             unified handling and conversion as well as presentation through its various To\\*\\*\\*String methods.      `System.IComparable`      `System.IEquatable`1`  ")

public class BitRate {
  @SerializedName("bps")
  private Long bps = null;

  @SerializedName("kbps")
  private Double kbps = null;

  @SerializedName("Mbps")
  private Double mbps = null;

  public BitRate bps(Long bps) {
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

  public BitRate kbps(Double kbps) {
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

  public BitRate mbps(Double mbps) {
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
    BitRate bitRate = (BitRate) o;
    return Objects.equals(this.bps, bitRate.bps) &&
        Objects.equals(this.kbps, bitRate.kbps) &&
        Objects.equals(this.mbps, bitRate.mbps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bps, kbps, mbps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitRate {\n");
    
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
