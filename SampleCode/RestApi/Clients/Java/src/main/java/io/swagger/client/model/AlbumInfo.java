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
import io.swagger.client.model.SongInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * AlbumInfo
 */


public class AlbumInfo {
  @SerializedName("AlbumArtists")
  private List<String> albumArtists = null;

  @SerializedName("SongInfos")
  private List<SongInfo> songInfos = null;

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

  public AlbumInfo albumArtists(List<String> albumArtists) {
    this.albumArtists = albumArtists;
    return this;
  }

  public AlbumInfo addAlbumArtistsItem(String albumArtistsItem) {
    if (this.albumArtists == null) {
      this.albumArtists = new ArrayList<String>();
    }
    this.albumArtists.add(albumArtistsItem);
    return this;
  }

   /**
   * The album artist.
   * @return albumArtists
  **/
  @Schema(description = "The album artist.")
  public List<String> getAlbumArtists() {
    return albumArtists;
  }

  public void setAlbumArtists(List<String> albumArtists) {
    this.albumArtists = albumArtists;
  }

  public AlbumInfo songInfos(List<SongInfo> songInfos) {
    this.songInfos = songInfos;
    return this;
  }

  public AlbumInfo addSongInfosItem(SongInfo songInfosItem) {
    if (this.songInfos == null) {
      this.songInfos = new ArrayList<SongInfo>();
    }
    this.songInfos.add(songInfosItem);
    return this;
  }

   /**
   * Get songInfos
   * @return songInfos
  **/
  @Schema(description = "")
  public List<SongInfo> getSongInfos() {
    return songInfos;
  }

  public void setSongInfos(List<SongInfo> songInfos) {
    this.songInfos = songInfos;
  }

  public AlbumInfo name(String name) {
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

  public AlbumInfo metadataLanguage(String metadataLanguage) {
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

  public AlbumInfo metadataCountryCode(String metadataCountryCode) {
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

  public AlbumInfo metadataLanguages(List<GlobalizationCultureDto> metadataLanguages) {
    this.metadataLanguages = metadataLanguages;
    return this;
  }

  public AlbumInfo addMetadataLanguagesItem(GlobalizationCultureDto metadataLanguagesItem) {
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

  public AlbumInfo providerIds(ProviderIdDictionary providerIds) {
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

  public AlbumInfo year(Integer year) {
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

  public AlbumInfo indexNumber(Integer indexNumber) {
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

  public AlbumInfo parentIndexNumber(Integer parentIndexNumber) {
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

  public AlbumInfo premiereDate(OffsetDateTime premiereDate) {
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

  public AlbumInfo isAutomated(Boolean isAutomated) {
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

  public AlbumInfo enableAdultMetadata(Boolean enableAdultMetadata) {
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
    AlbumInfo albumInfo = (AlbumInfo) o;
    return Objects.equals(this.albumArtists, albumInfo.albumArtists) &&
        Objects.equals(this.songInfos, albumInfo.songInfos) &&
        Objects.equals(this.name, albumInfo.name) &&
        Objects.equals(this.metadataLanguage, albumInfo.metadataLanguage) &&
        Objects.equals(this.metadataCountryCode, albumInfo.metadataCountryCode) &&
        Objects.equals(this.metadataLanguages, albumInfo.metadataLanguages) &&
        Objects.equals(this.providerIds, albumInfo.providerIds) &&
        Objects.equals(this.year, albumInfo.year) &&
        Objects.equals(this.indexNumber, albumInfo.indexNumber) &&
        Objects.equals(this.parentIndexNumber, albumInfo.parentIndexNumber) &&
        Objects.equals(this.premiereDate, albumInfo.premiereDate) &&
        Objects.equals(this.isAutomated, albumInfo.isAutomated) &&
        Objects.equals(this.enableAdultMetadata, albumInfo.enableAdultMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumArtists, songInfos, name, metadataLanguage, metadataCountryCode, metadataLanguages, providerIds, year, indexNumber, parentIndexNumber, premiereDate, isAutomated, enableAdultMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumInfo {\n");
    
    sb.append("    albumArtists: ").append(toIndentedString(albumArtists)).append("\n");
    sb.append("    songInfos: ").append(toIndentedString(songInfos)).append("\n");
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
