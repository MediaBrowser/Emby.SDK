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
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * ProvidersSongInfo
 */


public class ProvidersSongInfo {
  @SerializedName("AlbumArtists")
  private List<String> albumArtists = null;

  @SerializedName("Album")
  private String album = null;

  @SerializedName("Artists")
  private List<String> artists = null;

  @SerializedName("Composers")
  private List<String> composers = null;

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

  public ProvidersSongInfo albumArtists(List<String> albumArtists) {
    this.albumArtists = albumArtists;
    return this;
  }

  public ProvidersSongInfo addAlbumArtistsItem(String albumArtistsItem) {
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

  public ProvidersSongInfo album(String album) {
    this.album = album;
    return this;
  }

   /**
   * Get album
   * @return album
  **/
  @Schema(description = "")
  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public ProvidersSongInfo artists(List<String> artists) {
    this.artists = artists;
    return this;
  }

  public ProvidersSongInfo addArtistsItem(String artistsItem) {
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

  public ProvidersSongInfo composers(List<String> composers) {
    this.composers = composers;
    return this;
  }

  public ProvidersSongInfo addComposersItem(String composersItem) {
    if (this.composers == null) {
      this.composers = new ArrayList<String>();
    }
    this.composers.add(composersItem);
    return this;
  }

   /**
   * Get composers
   * @return composers
  **/
  @Schema(description = "")
  public List<String> getComposers() {
    return composers;
  }

  public void setComposers(List<String> composers) {
    this.composers = composers;
  }

  public ProvidersSongInfo name(String name) {
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

  public ProvidersSongInfo metadataLanguage(String metadataLanguage) {
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

  public ProvidersSongInfo metadataCountryCode(String metadataCountryCode) {
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

  public ProvidersSongInfo providerIds(ProviderIdDictionary providerIds) {
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

  public ProvidersSongInfo year(Integer year) {
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

  public ProvidersSongInfo indexNumber(Integer indexNumber) {
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

  public ProvidersSongInfo parentIndexNumber(Integer parentIndexNumber) {
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

  public ProvidersSongInfo premiereDate(OffsetDateTime premiereDate) {
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

  public ProvidersSongInfo isAutomated(Boolean isAutomated) {
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

  public ProvidersSongInfo enableAdultMetadata(Boolean enableAdultMetadata) {
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
    ProvidersSongInfo providersSongInfo = (ProvidersSongInfo) o;
    return Objects.equals(this.albumArtists, providersSongInfo.albumArtists) &&
        Objects.equals(this.album, providersSongInfo.album) &&
        Objects.equals(this.artists, providersSongInfo.artists) &&
        Objects.equals(this.composers, providersSongInfo.composers) &&
        Objects.equals(this.name, providersSongInfo.name) &&
        Objects.equals(this.metadataLanguage, providersSongInfo.metadataLanguage) &&
        Objects.equals(this.metadataCountryCode, providersSongInfo.metadataCountryCode) &&
        Objects.equals(this.providerIds, providersSongInfo.providerIds) &&
        Objects.equals(this.year, providersSongInfo.year) &&
        Objects.equals(this.indexNumber, providersSongInfo.indexNumber) &&
        Objects.equals(this.parentIndexNumber, providersSongInfo.parentIndexNumber) &&
        Objects.equals(this.premiereDate, providersSongInfo.premiereDate) &&
        Objects.equals(this.isAutomated, providersSongInfo.isAutomated) &&
        Objects.equals(this.enableAdultMetadata, providersSongInfo.enableAdultMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumArtists, album, artists, composers, name, metadataLanguage, metadataCountryCode, providerIds, year, indexNumber, parentIndexNumber, premiereDate, isAutomated, enableAdultMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersSongInfo {\n");
    
    sb.append("    albumArtists: ").append(toIndentedString(albumArtists)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    composers: ").append(toIndentedString(composers)).append("\n");
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
