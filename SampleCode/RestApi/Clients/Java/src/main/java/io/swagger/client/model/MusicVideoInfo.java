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
import io.swagger.client.model.GlobalizationCultureDto;
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * MusicVideoInfo
 */


public class MusicVideoInfo {
  @SerializedName("Artists")
  private List<String> artists = null;

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

  public MusicVideoInfo artists(List<String> artists) {
    this.artists = artists;
    return this;
  }

  public MusicVideoInfo addArtistsItem(String artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<String>();
    }
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * Get artists
   * @return artists
  **/
  @Schema(description = "")
  public List<String> getArtists() {
    return artists;
  }

  public void setArtists(List<String> artists) {
    this.artists = artists;
  }

  public MusicVideoInfo name(String name) {
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

  public MusicVideoInfo metadataLanguage(String metadataLanguage) {
    this.metadataLanguage = metadataLanguage;
    return this;
  }

   /**
   * The metadata language.
   * @return metadataLanguage
  **/
  @Schema(description = "The metadata language.")
  public String getMetadataLanguage() {
    return metadataLanguage;
  }

  public void setMetadataLanguage(String metadataLanguage) {
    this.metadataLanguage = metadataLanguage;
  }

  public MusicVideoInfo metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
    return this;
  }

   /**
   * The metadata country code.
   * @return metadataCountryCode
  **/
  @Schema(description = "The metadata country code.")
  public String getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public MusicVideoInfo metadataLanguages(List<GlobalizationCultureDto> metadataLanguages) {
    this.metadataLanguages = metadataLanguages;
    return this;
  }

  public MusicVideoInfo addMetadataLanguagesItem(GlobalizationCultureDto metadataLanguagesItem) {
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

  public MusicVideoInfo providerIds(ProviderIdDictionary providerIds) {
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

  public MusicVideoInfo year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * The year.
   * @return year
  **/
  @Schema(description = "The year.")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public MusicVideoInfo indexNumber(Integer indexNumber) {
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

  public MusicVideoInfo parentIndexNumber(Integer parentIndexNumber) {
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

  public MusicVideoInfo premiereDate(OffsetDateTime premiereDate) {
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

  public MusicVideoInfo isAutomated(Boolean isAutomated) {
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

  public MusicVideoInfo enableAdultMetadata(Boolean enableAdultMetadata) {
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
    MusicVideoInfo musicVideoInfo = (MusicVideoInfo) o;
    return Objects.equals(this.artists, musicVideoInfo.artists) &&
        Objects.equals(this.name, musicVideoInfo.name) &&
        Objects.equals(this.metadataLanguage, musicVideoInfo.metadataLanguage) &&
        Objects.equals(this.metadataCountryCode, musicVideoInfo.metadataCountryCode) &&
        Objects.equals(this.metadataLanguages, musicVideoInfo.metadataLanguages) &&
        Objects.equals(this.providerIds, musicVideoInfo.providerIds) &&
        Objects.equals(this.year, musicVideoInfo.year) &&
        Objects.equals(this.indexNumber, musicVideoInfo.indexNumber) &&
        Objects.equals(this.parentIndexNumber, musicVideoInfo.parentIndexNumber) &&
        Objects.equals(this.premiereDate, musicVideoInfo.premiereDate) &&
        Objects.equals(this.isAutomated, musicVideoInfo.isAutomated) &&
        Objects.equals(this.enableAdultMetadata, musicVideoInfo.enableAdultMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artists, name, metadataLanguage, metadataCountryCode, metadataLanguages, providerIds, year, indexNumber, parentIndexNumber, premiereDate, isAutomated, enableAdultMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicVideoInfo {\n");
    
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
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
