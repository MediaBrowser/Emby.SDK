/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.GlobalizationCultureDto;
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.client.model.SeriesDisplayOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * ProvidersSeriesInfo
 */


public class ProvidersSeriesInfo {
  @SerializedName("EpisodeAirDate")
  private OffsetDateTime episodeAirDate = null;

  @SerializedName("DisplayOrder")
  private SeriesDisplayOrder displayOrder = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("MetadataLanguage")
  private String metadataLanguage = null;

  @SerializedName("MetadataCountryCode")
  private String metadataCountryCode = null;

  @SerializedName("MetadataLanguages")
  private List<GlobalizationCultureDto> metadataLanguages = null;

  @SerializedName("ProviderIds")
  private ProviderIdDictionary providerIds = null;

  @SerializedName("Year")
  private Integer year = null;

  @SerializedName("IndexNumber")
  private Integer indexNumber = null;

  @SerializedName("ParentIndexNumber")
  private Integer parentIndexNumber = null;

  @SerializedName("PremiereDate")
  private OffsetDateTime premiereDate = null;

  @SerializedName("IsAutomated")
  private Boolean isAutomated = null;

  @SerializedName("EnableAdultMetadata")
  private Boolean enableAdultMetadata = null;

  public ProvidersSeriesInfo episodeAirDate(OffsetDateTime episodeAirDate) {
    this.episodeAirDate = episodeAirDate;
    return this;
  }

   /**
   * Get episodeAirDate
   * @return episodeAirDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEpisodeAirDate() {
    return episodeAirDate;
  }

  public void setEpisodeAirDate(OffsetDateTime episodeAirDate) {
    this.episodeAirDate = episodeAirDate;
  }

  public ProvidersSeriesInfo displayOrder(SeriesDisplayOrder displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @Schema(description = "")
  public SeriesDisplayOrder getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(SeriesDisplayOrder displayOrder) {
    this.displayOrder = displayOrder;
  }

  public ProvidersSeriesInfo name(String name) {
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

  public ProvidersSeriesInfo metadataLanguage(String metadataLanguage) {
    this.metadataLanguage = metadataLanguage;
    return this;
  }

   /**
   * Get metadataLanguage
   * @return metadataLanguage
  **/
  @Schema(description = "")
  public String getMetadataLanguage() {
    return metadataLanguage;
  }

  public void setMetadataLanguage(String metadataLanguage) {
    this.metadataLanguage = metadataLanguage;
  }

  public ProvidersSeriesInfo metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
    return this;
  }

   /**
   * Get metadataCountryCode
   * @return metadataCountryCode
  **/
  @Schema(description = "")
  public String getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public ProvidersSeriesInfo metadataLanguages(List<GlobalizationCultureDto> metadataLanguages) {
    this.metadataLanguages = metadataLanguages;
    return this;
  }

  public ProvidersSeriesInfo addMetadataLanguagesItem(GlobalizationCultureDto metadataLanguagesItem) {
    if (this.metadataLanguages == null) {
      this.metadataLanguages = new ArrayList<GlobalizationCultureDto>();
    }
    this.metadataLanguages.add(metadataLanguagesItem);
    return this;
  }

   /**
   * Get metadataLanguages
   * @return metadataLanguages
  **/
  @Schema(description = "")
  public List<GlobalizationCultureDto> getMetadataLanguages() {
    return metadataLanguages;
  }

  public void setMetadataLanguages(List<GlobalizationCultureDto> metadataLanguages) {
    this.metadataLanguages = metadataLanguages;
  }

  public ProvidersSeriesInfo providerIds(ProviderIdDictionary providerIds) {
    this.providerIds = providerIds;
    return this;
  }

   /**
   * Get providerIds
   * @return providerIds
  **/
  @Schema(description = "")
  public ProviderIdDictionary getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(ProviderIdDictionary providerIds) {
    this.providerIds = providerIds;
  }

  public ProvidersSeriesInfo year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @Schema(description = "")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public ProvidersSeriesInfo indexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

   /**
   * Get indexNumber
   * @return indexNumber
  **/
  @Schema(description = "")
  public Integer getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
  }

  public ProvidersSeriesInfo parentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
    return this;
  }

   /**
   * Get parentIndexNumber
   * @return parentIndexNumber
  **/
  @Schema(description = "")
  public Integer getParentIndexNumber() {
    return parentIndexNumber;
  }

  public void setParentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
  }

  public ProvidersSeriesInfo premiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = premiereDate;
    return this;
  }

   /**
   * Get premiereDate
   * @return premiereDate
  **/
  @Schema(description = "")
  public OffsetDateTime getPremiereDate() {
    return premiereDate;
  }

  public void setPremiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = premiereDate;
  }

  public ProvidersSeriesInfo isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @Schema(description = "")
  public Boolean isIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  public ProvidersSeriesInfo enableAdultMetadata(Boolean enableAdultMetadata) {
    this.enableAdultMetadata = enableAdultMetadata;
    return this;
  }

   /**
   * Get enableAdultMetadata
   * @return enableAdultMetadata
  **/
  @Schema(description = "")
  public Boolean isEnableAdultMetadata() {
    return enableAdultMetadata;
  }

  public void setEnableAdultMetadata(Boolean enableAdultMetadata) {
    this.enableAdultMetadata = enableAdultMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersSeriesInfo providersSeriesInfo = (ProvidersSeriesInfo) o;
    return Objects.equals(this.episodeAirDate, providersSeriesInfo.episodeAirDate) &&
        Objects.equals(this.displayOrder, providersSeriesInfo.displayOrder) &&
        Objects.equals(this.name, providersSeriesInfo.name) &&
        Objects.equals(this.metadataLanguage, providersSeriesInfo.metadataLanguage) &&
        Objects.equals(this.metadataCountryCode, providersSeriesInfo.metadataCountryCode) &&
        Objects.equals(this.metadataLanguages, providersSeriesInfo.metadataLanguages) &&
        Objects.equals(this.providerIds, providersSeriesInfo.providerIds) &&
        Objects.equals(this.year, providersSeriesInfo.year) &&
        Objects.equals(this.indexNumber, providersSeriesInfo.indexNumber) &&
        Objects.equals(this.parentIndexNumber, providersSeriesInfo.parentIndexNumber) &&
        Objects.equals(this.premiereDate, providersSeriesInfo.premiereDate) &&
        Objects.equals(this.isAutomated, providersSeriesInfo.isAutomated) &&
        Objects.equals(this.enableAdultMetadata, providersSeriesInfo.enableAdultMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(episodeAirDate, displayOrder, name, metadataLanguage, metadataCountryCode, metadataLanguages, providerIds, year, indexNumber, parentIndexNumber, premiereDate, isAutomated, enableAdultMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersSeriesInfo {\n");
    
    sb.append("    episodeAirDate: ").append(toIndentedString(episodeAirDate)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadataLanguage: ").append(toIndentedString(metadataLanguage)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    metadataLanguages: ").append(toIndentedString(metadataLanguages)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    enableAdultMetadata: ").append(toIndentedString(enableAdultMetadata)).append("\n");
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
