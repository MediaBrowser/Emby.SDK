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
import io.swagger.client.model.ExternalIdInfo;
import io.swagger.client.model.GlobalizationCountryInfo;
import io.swagger.client.model.GlobalizationCultureDto;
import io.swagger.client.model.ParentalRating;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MetadataEditorInfo
 */


public class MetadataEditorInfo {
  @SerializedName("ParentalRatingOptions")
  private List<ParentalRating> parentalRatingOptions = null;

  @SerializedName("Countries")
  private List<GlobalizationCountryInfo> countries = null;

  @SerializedName("Cultures")
  private List<GlobalizationCultureDto> cultures = null;

  @SerializedName("ExternalIdInfos")
  private List<ExternalIdInfo> externalIdInfos = null;

  public MetadataEditorInfo parentalRatingOptions(List<ParentalRating> parentalRatingOptions) {
    this.parentalRatingOptions = parentalRatingOptions;
    return this;
  }

  public MetadataEditorInfo addParentalRatingOptionsItem(ParentalRating parentalRatingOptionsItem) {
    if (this.parentalRatingOptions == null) {
      this.parentalRatingOptions = new ArrayList<ParentalRating>();
    }
    this.parentalRatingOptions.add(parentalRatingOptionsItem);
    return this;
  }

   /**
   * Get parentalRatingOptions
   * @return parentalRatingOptions
  **/
  @Schema(description = "")
  public List<ParentalRating> getParentalRatingOptions() {
    return parentalRatingOptions;
  }

  public void setParentalRatingOptions(List<ParentalRating> parentalRatingOptions) {
    this.parentalRatingOptions = parentalRatingOptions;
  }

  public MetadataEditorInfo countries(List<GlobalizationCountryInfo> countries) {
    this.countries = countries;
    return this;
  }

  public MetadataEditorInfo addCountriesItem(GlobalizationCountryInfo countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<GlobalizationCountryInfo>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @Schema(description = "")
  public List<GlobalizationCountryInfo> getCountries() {
    return countries;
  }

  public void setCountries(List<GlobalizationCountryInfo> countries) {
    this.countries = countries;
  }

  public MetadataEditorInfo cultures(List<GlobalizationCultureDto> cultures) {
    this.cultures = cultures;
    return this;
  }

  public MetadataEditorInfo addCulturesItem(GlobalizationCultureDto culturesItem) {
    if (this.cultures == null) {
      this.cultures = new ArrayList<GlobalizationCultureDto>();
    }
    this.cultures.add(culturesItem);
    return this;
  }

   /**
   * Get cultures
   * @return cultures
  **/
  @Schema(description = "")
  public List<GlobalizationCultureDto> getCultures() {
    return cultures;
  }

  public void setCultures(List<GlobalizationCultureDto> cultures) {
    this.cultures = cultures;
  }

  public MetadataEditorInfo externalIdInfos(List<ExternalIdInfo> externalIdInfos) {
    this.externalIdInfos = externalIdInfos;
    return this;
  }

  public MetadataEditorInfo addExternalIdInfosItem(ExternalIdInfo externalIdInfosItem) {
    if (this.externalIdInfos == null) {
      this.externalIdInfos = new ArrayList<ExternalIdInfo>();
    }
    this.externalIdInfos.add(externalIdInfosItem);
    return this;
  }

   /**
   * Get externalIdInfos
   * @return externalIdInfos
  **/
  @Schema(description = "")
  public List<ExternalIdInfo> getExternalIdInfos() {
    return externalIdInfos;
  }

  public void setExternalIdInfos(List<ExternalIdInfo> externalIdInfos) {
    this.externalIdInfos = externalIdInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataEditorInfo metadataEditorInfo = (MetadataEditorInfo) o;
    return Objects.equals(this.parentalRatingOptions, metadataEditorInfo.parentalRatingOptions) &&
        Objects.equals(this.countries, metadataEditorInfo.countries) &&
        Objects.equals(this.cultures, metadataEditorInfo.cultures) &&
        Objects.equals(this.externalIdInfos, metadataEditorInfo.externalIdInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentalRatingOptions, countries, cultures, externalIdInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataEditorInfo {\n");
    
    sb.append("    parentalRatingOptions: ").append(toIndentedString(parentalRatingOptions)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    cultures: ").append(toIndentedString(cultures)).append("\n");
    sb.append("    externalIdInfos: ").append(toIndentedString(externalIdInfos)).append("\n");
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
