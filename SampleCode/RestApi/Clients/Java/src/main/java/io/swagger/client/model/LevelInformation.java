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
import io.swagger.client.model.BitRate;
import io.swagger.client.model.ResolutionWithRate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class for unified presentation of all information associated with a specific codec level.  
 */
@Schema(description = "Class for unified presentation of all information associated with a specific codec level.  ")

public class LevelInformation {
  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Ordinal")
  private Integer ordinal = null;

  @SerializedName("MaxBitRate")
  private BitRate maxBitRate = null;

  @SerializedName("MaxBitRateDisplay")
  private String maxBitRateDisplay = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ResolutionRates")
  private List<ResolutionWithRate> resolutionRates = null;

  @SerializedName("ResolutionRateStrings")
  private List<String> resolutionRateStrings = null;

  @SerializedName("ResolutionRatesDisplay")
  private String resolutionRatesDisplay = null;

  public LevelInformation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * The enum member name of the level.
   * @return shortName
  **/
  @Schema(description = "The enum member name of the level.")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public LevelInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The common name of the level.
   * @return description
  **/
  @Schema(description = "The common name of the level.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LevelInformation ordinal(Integer ordinal) {
    this.ordinal = ordinal;
    return this;
  }

   /**
   * A value indicating the level&#x27;s ranking relative to other levels.
   * @return ordinal
  **/
  @Schema(description = "A value indicating the level's ranking relative to other levels.")
  public Integer getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  public LevelInformation maxBitRate(BitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
    return this;
  }

   /**
   * Get maxBitRate
   * @return maxBitRate
  **/
  @Schema(description = "")
  public BitRate getMaxBitRate() {
    return maxBitRate;
  }

  public void setMaxBitRate(BitRate maxBitRate) {
    this.maxBitRate = maxBitRate;
  }

  public LevelInformation maxBitRateDisplay(String maxBitRateDisplay) {
    this.maxBitRateDisplay = maxBitRateDisplay;
    return this;
  }

   /**
   * A display value of the &#x60;Emby.Media.Model.Types.LevelInformation.MaxBitRate&#x60; property.
   * @return maxBitRateDisplay
  **/
  @Schema(description = "A display value of the `Emby.Media.Model.Types.LevelInformation.MaxBitRate` property.")
  public String getMaxBitRateDisplay() {
    return maxBitRateDisplay;
  }

  public void setMaxBitRateDisplay(String maxBitRateDisplay) {
    this.maxBitRateDisplay = maxBitRateDisplay;
  }

  public LevelInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier.
   * @return id
  **/
  @Schema(description = "A unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LevelInformation resolutionRates(List<ResolutionWithRate> resolutionRates) {
    this.resolutionRates = resolutionRates;
    return this;
  }

  public LevelInformation addResolutionRatesItem(ResolutionWithRate resolutionRatesItem) {
    if (this.resolutionRates == null) {
      this.resolutionRates = new ArrayList<ResolutionWithRate>();
    }
    this.resolutionRates.add(resolutionRatesItem);
    return this;
  }

   /**
   * Examples for the maximum supported combinations of resolution and rate for this level.
   * @return resolutionRates
  **/
  @Schema(description = "Examples for the maximum supported combinations of resolution and rate for this level.")
  public List<ResolutionWithRate> getResolutionRates() {
    return resolutionRates;
  }

  public void setResolutionRates(List<ResolutionWithRate> resolutionRates) {
    this.resolutionRates = resolutionRates;
  }

  public LevelInformation resolutionRateStrings(List<String> resolutionRateStrings) {
    this.resolutionRateStrings = resolutionRateStrings;
    return this;
  }

  public LevelInformation addResolutionRateStringsItem(String resolutionRateStringsItem) {
    if (this.resolutionRateStrings == null) {
      this.resolutionRateStrings = new ArrayList<String>();
    }
    this.resolutionRateStrings.add(resolutionRateStringsItem);
    return this;
  }

   /**
   * Examples for the maximum supported combinations of resolution and rate for this level as string values.
   * @return resolutionRateStrings
  **/
  @Schema(description = "Examples for the maximum supported combinations of resolution and rate for this level as string values.")
  public List<String> getResolutionRateStrings() {
    return resolutionRateStrings;
  }

  public void setResolutionRateStrings(List<String> resolutionRateStrings) {
    this.resolutionRateStrings = resolutionRateStrings;
  }

  public LevelInformation resolutionRatesDisplay(String resolutionRatesDisplay) {
    this.resolutionRatesDisplay = resolutionRatesDisplay;
    return this;
  }

   /**
   * A single string from the &#x60;Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings&#x60; list.
   * @return resolutionRatesDisplay
  **/
  @Schema(description = "A single string from the `Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings` list.")
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
    LevelInformation levelInformation = (LevelInformation) o;
    return Objects.equals(this.shortName, levelInformation.shortName) &&
        Objects.equals(this.description, levelInformation.description) &&
        Objects.equals(this.ordinal, levelInformation.ordinal) &&
        Objects.equals(this.maxBitRate, levelInformation.maxBitRate) &&
        Objects.equals(this.maxBitRateDisplay, levelInformation.maxBitRateDisplay) &&
        Objects.equals(this.id, levelInformation.id) &&
        Objects.equals(this.resolutionRates, levelInformation.resolutionRates) &&
        Objects.equals(this.resolutionRateStrings, levelInformation.resolutionRateStrings) &&
        Objects.equals(this.resolutionRatesDisplay, levelInformation.resolutionRatesDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortName, description, ordinal, maxBitRate, maxBitRateDisplay, id, resolutionRates, resolutionRateStrings, resolutionRatesDisplay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LevelInformation {\n");
    
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
