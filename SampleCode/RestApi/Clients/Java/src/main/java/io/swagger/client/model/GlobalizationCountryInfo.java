/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * GlobalizationCountryInfo
 */


public class GlobalizationCountryInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("EnglishName")
  private String englishName = null;

  @SerializedName("TwoLetterISORegionName")
  private String twoLetterISORegionName = null;

  @SerializedName("ThreeLetterISORegionName")
  private String threeLetterISORegionName = null;

  public GlobalizationCountryInfo name(String name) {
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

  public GlobalizationCountryInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GlobalizationCountryInfo englishName(String englishName) {
    this.englishName = englishName;
    return this;
  }

   /**
   * Get englishName
   * @return englishName
  **/
  @Schema(description = "")
  public String getEnglishName() {
    return englishName;
  }

  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }

  public GlobalizationCountryInfo twoLetterISORegionName(String twoLetterISORegionName) {
    this.twoLetterISORegionName = twoLetterISORegionName;
    return this;
  }

   /**
   * Get twoLetterISORegionName
   * @return twoLetterISORegionName
  **/
  @Schema(description = "")
  public String getTwoLetterISORegionName() {
    return twoLetterISORegionName;
  }

  public void setTwoLetterISORegionName(String twoLetterISORegionName) {
    this.twoLetterISORegionName = twoLetterISORegionName;
  }

  public GlobalizationCountryInfo threeLetterISORegionName(String threeLetterISORegionName) {
    this.threeLetterISORegionName = threeLetterISORegionName;
    return this;
  }

   /**
   * Get threeLetterISORegionName
   * @return threeLetterISORegionName
  **/
  @Schema(description = "")
  public String getThreeLetterISORegionName() {
    return threeLetterISORegionName;
  }

  public void setThreeLetterISORegionName(String threeLetterISORegionName) {
    this.threeLetterISORegionName = threeLetterISORegionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalizationCountryInfo globalizationCountryInfo = (GlobalizationCountryInfo) o;
    return Objects.equals(this.name, globalizationCountryInfo.name) &&
        Objects.equals(this.displayName, globalizationCountryInfo.displayName) &&
        Objects.equals(this.englishName, globalizationCountryInfo.englishName) &&
        Objects.equals(this.twoLetterISORegionName, globalizationCountryInfo.twoLetterISORegionName) &&
        Objects.equals(this.threeLetterISORegionName, globalizationCountryInfo.threeLetterISORegionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, englishName, twoLetterISORegionName, threeLetterISORegionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalizationCountryInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    twoLetterISORegionName: ").append(toIndentedString(twoLetterISORegionName)).append("\n");
    sb.append("    threeLetterISORegionName: ").append(toIndentedString(threeLetterISORegionName)).append("\n");
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
