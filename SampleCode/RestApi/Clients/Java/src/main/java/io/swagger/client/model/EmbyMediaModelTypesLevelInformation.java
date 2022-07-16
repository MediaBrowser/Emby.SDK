/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EmbyMediaModelTypesBitRate;
import io.swagger.client.model.EmbyMediaModelTypesResolutionWithRate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyMediaModelTypesLevelInformation
 */


public class EmbyMediaModelTypesLevelInformation {
  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Ordinal")
  private Integer ordinal = null;

  @SerializedName("MaxBitRate")
  private EmbyMediaModelTypesBitRate maxBitRate = null;

  @SerializedName("MaxBitRateDisplay")
  private String maxBitRateDisplay = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ResolutionRates")
  private List<EmbyMediaModelTypesResolutionWithRate> resolutionRates = null;

  @SerializedName("ResolutionRateStrings")
  private List<String> resolutionRateStrings = null;

  @SerializedName("ResolutionRatesDisplay")
  private String resolutionRatesDisplay = null;

  public EmbyMediaModelTypesLevelInformation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @Schema(description = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public EmbyMediaModelTypesLevelInformation description(String description) {
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

  public EmbyMediaModelTypesLevelInformation ordinal(Integer ordinal) {
    this.ordinal = ordinal;
    return this;
  }

   /**
   * Get ordinal
   * @return ordinal
  **/
  @Schema(description = "")
  public Integer getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  public EmbyMediaModelTypesLevelInformation maxBitRate(EmbyMediaModelTypesBitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
    return this;
  }

   /**
   * Get maxBitRate
   * @return maxBitRate
  **/
  @Schema(description = "")
  public EmbyMediaModelTypesBitRate getMaxBitRate() {
    return maxBitRate;
  }

  public void setMaxBitRate(EmbyMediaModelTypesBitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
  }

  public EmbyMediaModelTypesLevelInformation maxBitRateDisplay(String maxBitRateDisplay) {
    this.maxBitRateDisplay = maxBitRateDisplay;
    return this;
  }

   /**
   * Get maxBitRateDisplay
   * @return maxBitRateDisplay
  **/
  @Schema(description = "")
  public String getMaxBitRateDisplay() {
    return maxBitRateDisplay;
  }

  public void setMaxBitRateDisplay(String maxBitRateDisplay) {
    this.maxBitRateDisplay = maxBitRateDisplay;
  }

  public EmbyMediaModelTypesLevelInformation id(String id) {
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

  public EmbyMediaModelTypesLevelInformation resolutionRates(List<EmbyMediaModelTypesResolutionWithRate> resolutionRates) {
    this.resolutionRates = resolutionRates;
    return this;
  }

  public EmbyMediaModelTypesLevelInformation addResolutionRatesItem(EmbyMediaModelTypesResolutionWithRate resolutionRatesItem) {
    if (this.resolutionRates == null) {
      this.resolutionRates = new ArrayList<EmbyMediaModelTypesResolutionWithRate>();
    }
    this.resolutionRates.add(resolutionRatesItem);
    return this;
  }

   /**
   * Get resolutionRates
   * @return resolutionRates
  **/
  @Schema(description = "")
  public List<EmbyMediaModelTypesResolutionWithRate> getResolutionRates() {
    return resolutionRates;
  }

  public void setResolutionRates(List<EmbyMediaModelTypesResolutionWithRate> resolutionRates) {
    this.resolutionRates = resolutionRates;
  }

  public EmbyMediaModelTypesLevelInformation resolutionRateStrings(List<String> resolutionRateStrings) {
    this.resolutionRateStrings = resolutionRateStrings;
    return this;
  }

  public EmbyMediaModelTypesLevelInformation addResolutionRateStringsItem(String resolutionRateStringsItem) {
    if (this.resolutionRateStrings == null) {
      this.resolutionRateStrings = new ArrayList<String>();
    }
    this.resolutionRateStrings.add(resolutionRateStringsItem);
    return this;
  }

   /**
   * Get resolutionRateStrings
   * @return resolutionRateStrings
  **/
  @Schema(description = "")
  public List<String> getResolutionRateStrings() {
    return resolutionRateStrings;
  }

  public void setResolutionRateStrings(List<String> resolutionRateStrings) {
    this.resolutionRateStrings = resolutionRateStrings;
  }

  public EmbyMediaModelTypesLevelInformation resolutionRatesDisplay(String resolutionRatesDisplay) {
    this.resolutionRatesDisplay = resolutionRatesDisplay;
    return this;
  }

   /**
   * Get resolutionRatesDisplay
   * @return resolutionRatesDisplay
  **/
  @Schema(description = "")
  public String getResolutionRatesDisplay() {
    return resolutionRatesDisplay;
  }

  public void setResolutionRatesDisplay(String resolutionRatesDisplay) {
    this.resolutionRatesDisplay = resolutionRatesDisplay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyMediaModelTypesLevelInformation embyMediaModelTypesLevelInformation = (EmbyMediaModelTypesLevelInformation) o;
    return Objects.equals(this.shortName, embyMediaModelTypesLevelInformation.shortName) &&
        Objects.equals(this.description, embyMediaModelTypesLevelInformation.description) &&
        Objects.equals(this.ordinal, embyMediaModelTypesLevelInformation.ordinal) &&
        Objects.equals(this.maxBitRate, embyMediaModelTypesLevelInformation.maxBitRate) &&
        Objects.equals(this.maxBitRateDisplay, embyMediaModelTypesLevelInformation.maxBitRateDisplay) &&
        Objects.equals(this.id, embyMediaModelTypesLevelInformation.id) &&
        Objects.equals(this.resolutionRates, embyMediaModelTypesLevelInformation.resolutionRates) &&
        Objects.equals(this.resolutionRateStrings, embyMediaModelTypesLevelInformation.resolutionRateStrings) &&
        Objects.equals(this.resolutionRatesDisplay, embyMediaModelTypesLevelInformation.resolutionRatesDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortName, description, ordinal, maxBitRate, maxBitRateDisplay, id, resolutionRates, resolutionRateStrings, resolutionRatesDisplay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyMediaModelTypesLevelInformation {\n");
    
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    maxBitRate: ").append(toIndentedString(maxBitRate)).append("\n");
    sb.append("    maxBitRateDisplay: ").append(toIndentedString(maxBitRateDisplay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resolutionRates: ").append(toIndentedString(resolutionRates)).append("\n");
    sb.append("    resolutionRateStrings: ").append(toIndentedString(resolutionRateStrings)).append("\n");
    sb.append("    resolutionRatesDisplay: ").append(toIndentedString(resolutionRatesDisplay)).append("\n");
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
