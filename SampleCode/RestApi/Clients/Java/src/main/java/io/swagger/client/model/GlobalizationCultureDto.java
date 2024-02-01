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
 * Class CultureDto  
 */
@Schema(description = "Class CultureDto  ")

public class GlobalizationCultureDto {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("TwoLetterISOLanguageName")
  private String twoLetterISOLanguageName = null;

  @SerializedName("ThreeLetterISOLanguageName")
  private String threeLetterISOLanguageName = null;

  @SerializedName("ThreeLetterISOLanguageNames")
  private List<String> threeLetterISOLanguageNames = null;

  @SerializedName("TwoLetterISOLanguageNames")
  private List<String> twoLetterISOLanguageNames = null;

  public GlobalizationCultureDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GlobalizationCultureDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name.
   * @return displayName
  **/
  @Schema(description = "The display name.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GlobalizationCultureDto twoLetterISOLanguageName(String twoLetterISOLanguageName) {
    this.twoLetterISOLanguageName = twoLetterISOLanguageName;
    return this;
  }

   /**
   * The name of the two letter ISO language.
   * @return twoLetterISOLanguageName
  **/
  @Schema(description = "The name of the two letter ISO language.")
  public String getTwoLetterISOLanguageName() {
    return twoLetterISOLanguageName;
  }

  public void setTwoLetterISOLanguageName(String twoLetterISOLanguageName) {
    this.twoLetterISOLanguageName = twoLetterISOLanguageName;
  }

  public GlobalizationCultureDto threeLetterISOLanguageName(String threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = threeLetterISOLanguageName;
    return this;
  }

   /**
   * The name of the three letter ISO language.
   * @return threeLetterISOLanguageName
  **/
  @Schema(description = "The name of the three letter ISO language.")
  public String getThreeLetterISOLanguageName() {
    return threeLetterISOLanguageName;
  }

  public void setThreeLetterISOLanguageName(String threeLetterISOLanguageName) {
    this.threeLetterISOLanguageName = threeLetterISOLanguageName;
  }

  public GlobalizationCultureDto threeLetterISOLanguageNames(List<String> threeLetterISOLanguageNames) {
    this.threeLetterISOLanguageNames = threeLetterISOLanguageNames;
    return this;
  }

  public GlobalizationCultureDto addThreeLetterISOLanguageNamesItem(String threeLetterISOLanguageNamesItem) {
    if (this.threeLetterISOLanguageNames == null) {
      this.threeLetterISOLanguageNames = new ArrayList<String>();
    }
    this.threeLetterISOLanguageNames.add(threeLetterISOLanguageNamesItem);
    return this;
  }

   /**
   * Get threeLetterISOLanguageNames
   * @return threeLetterISOLanguageNames
  **/
  @Schema(description = "")
  public List<String> getThreeLetterISOLanguageNames() {
    return threeLetterISOLanguageNames;
  }

  public void setThreeLetterISOLanguageNames(List<String> threeLetterISOLanguageNames) {
    this.threeLetterISOLanguageNames = threeLetterISOLanguageNames;
  }

  public GlobalizationCultureDto twoLetterISOLanguageNames(List<String> twoLetterISOLanguageNames) {
    this.twoLetterISOLanguageNames = twoLetterISOLanguageNames;
    return this;
  }

  public GlobalizationCultureDto addTwoLetterISOLanguageNamesItem(String twoLetterISOLanguageNamesItem) {
    if (this.twoLetterISOLanguageNames == null) {
      this.twoLetterISOLanguageNames = new ArrayList<String>();
    }
    this.twoLetterISOLanguageNames.add(twoLetterISOLanguageNamesItem);
    return this;
  }

   /**
   * Get twoLetterISOLanguageNames
   * @return twoLetterISOLanguageNames
  **/
  @Schema(description = "")
  public List<String> getTwoLetterISOLanguageNames() {
    return twoLetterISOLanguageNames;
  }

  public void setTwoLetterISOLanguageNames(List<String> twoLetterISOLanguageNames) {
    this.twoLetterISOLanguageNames = twoLetterISOLanguageNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalizationCultureDto globalizationCultureDto = (GlobalizationCultureDto) o;
    return Objects.equals(this.name, globalizationCultureDto.name) &&
        Objects.equals(this.displayName, globalizationCultureDto.displayName) &&
        Objects.equals(this.twoLetterISOLanguageName, globalizationCultureDto.twoLetterISOLanguageName) &&
        Objects.equals(this.threeLetterISOLanguageName, globalizationCultureDto.threeLetterISOLanguageName) &&
        Objects.equals(this.threeLetterISOLanguageNames, globalizationCultureDto.threeLetterISOLanguageNames) &&
        Objects.equals(this.twoLetterISOLanguageNames, globalizationCultureDto.twoLetterISOLanguageNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, twoLetterISOLanguageName, threeLetterISOLanguageName, threeLetterISOLanguageNames, twoLetterISOLanguageNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalizationCultureDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    twoLetterISOLanguageName: ").append(toIndentedString(twoLetterISOLanguageName)).append("\n");
    sb.append("    threeLetterISOLanguageName: ").append(toIndentedString(threeLetterISOLanguageName)).append("\n");
    sb.append("    threeLetterISOLanguageNames: ").append(toIndentedString(threeLetterISOLanguageNames)).append("\n");
    sb.append("    twoLetterISOLanguageNames: ").append(toIndentedString(twoLetterISOLanguageNames)).append("\n");
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
