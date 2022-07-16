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
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.client.model.ProvidersSongInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * ProvidersAlbumInfo
 */


public class ProvidersAlbumInfo {
  @SerializedName("AlbumArtists")
  private List<String> albumArtists = null;

  @SerializedName("SongInfos")
  private List<ProvidersSongInfo> songInfos = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("MetadataLanguage")
  private String metadataLanguage = null;

  @SerializedName("MetadataCountryCode")
  private String metadataCountryCode = null;

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

  public ProvidersAlbumInfo albumArtists(List<String> albumArtists) {
    this.albumArtists = albumArtists;
    return this;
  }

  public ProvidersAlbumInfo addAlbumArtistsItem(String albumArtistsItem) {
    if (this.albumArtists == null) {
      this.albumArtists = new ArrayList<String>();
    }
    this.albumArtists.add(albumArtistsItem);
    return this;
  }

   /**
   * Get albumArtists
   * @return albumArtists
  **/
  @Schema(description = "")
  public List<String> getAlbumArtists() {
    return albumArtists;
  }

  public void setAlbumArtists(List<String> albumArtists) {
    this.albumArtists = albumArtists;
  }

  public ProvidersAlbumInfo songInfos(List<ProvidersSongInfo> songInfos) {
    this.songInfos = songInfos;
    return this;
  }

  public ProvidersAlbumInfo addSongInfosItem(ProvidersSongInfo songInfosItem) {
    if (this.songInfos == null) {
      this.songInfos = new ArrayList<ProvidersSongInfo>();
    }
    this.songInfos.add(songInfosItem);
    return this;
  }

   /**
   * Get songInfos
   * @return songInfos
  **/
  @Schema(description = "")
  public List<ProvidersSongInfo> getSongInfos() {
    return songInfos;
  }

  public void setSongInfos(List<ProvidersSongInfo> songInfos) {
    this.songInfos = songInfos;
  }

  public ProvidersAlbumInfo name(String name) {
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

  public ProvidersAlbumInfo metadataLanguage(String metadataLanguage) {
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

  public ProvidersAlbumInfo metadataCountryCode(String metadataCountryCode) {
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

  public ProvidersAlbumInfo providerIds(ProviderIdDictionary providerIds) {
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

  public ProvidersAlbumInfo year(Integer year) {
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

  public ProvidersAlbumInfo indexNumber(Integer indexNumber) {
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

  public ProvidersAlbumInfo parentIndexNumber(Integer parentIndexNumber) {
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

  public ProvidersAlbumInfo premiereDate(OffsetDateTime premiereDate) {
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

  public ProvidersAlbumInfo isAutomated(Boolean isAutomated) {
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

  public ProvidersAlbumInfo enableAdultMetadata(Boolean enableAdultMetadata) {
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
    ProvidersAlbumInfo providersAlbumInfo = (ProvidersAlbumInfo) o;
    return Objects.equals(this.albumArtists, providersAlbumInfo.albumArtists) &&
        Objects.equals(this.songInfos, providersAlbumInfo.songInfos) &&
        Objects.equals(this.name, providersAlbumInfo.name) &&
        Objects.equals(this.metadataLanguage, providersAlbumInfo.metadataLanguage) &&
        Objects.equals(this.metadataCountryCode, providersAlbumInfo.metadataCountryCode) &&
        Objects.equals(this.providerIds, providersAlbumInfo.providerIds) &&
        Objects.equals(this.year, providersAlbumInfo.year) &&
        Objects.equals(this.indexNumber, providersAlbumInfo.indexNumber) &&
        Objects.equals(this.parentIndexNumber, providersAlbumInfo.parentIndexNumber) &&
        Objects.equals(this.premiereDate, providersAlbumInfo.premiereDate) &&
        Objects.equals(this.isAutomated, providersAlbumInfo.isAutomated) &&
        Objects.equals(this.enableAdultMetadata, providersAlbumInfo.enableAdultMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumArtists, songInfos, name, metadataLanguage, metadataCountryCode, providerIds, year, indexNumber, parentIndexNumber, premiereDate, isAutomated, enableAdultMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersAlbumInfo {\n");
    
    sb.append("    albumArtists: ").append(toIndentedString(albumArtists)).append("\n");
    sb.append("    songInfos: ").append(toIndentedString(songInfos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadataLanguage: ").append(toIndentedString(metadataLanguage)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
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
