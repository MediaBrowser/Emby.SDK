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
import io.swagger.client.model.ProviderIdDictionary;
import io.swagger.client.model.RemoteSearchResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * RemoteSearchResult
 */


public class RemoteSearchResult {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("OriginalTitle")
  private String originalTitle = null;

  @SerializedName("ProviderIds")
  private ProviderIdDictionary providerIds = null;

  @SerializedName("ProductionYear")
  private Integer productionYear = null;

  @SerializedName("IndexNumber")
  private Integer indexNumber = null;

  @SerializedName("IndexNumberEnd")
  private Integer indexNumberEnd = null;

  @SerializedName("ParentIndexNumber")
  private Integer parentIndexNumber = null;

  @SerializedName("SortIndexNumber")
  private Integer sortIndexNumber = null;

  @SerializedName("SortParentIndexNumber")
  private Integer sortParentIndexNumber = null;

  @SerializedName("PremiereDate")
  private OffsetDateTime premiereDate = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("SearchProviderName")
  private String searchProviderName = null;

  @SerializedName("GameSystem")
  private String gameSystem = null;

  @SerializedName("Overview")
  private String overview = null;

  @SerializedName("DisambiguationComment")
  private String disambiguationComment = null;

  @SerializedName("AlbumArtist")
  private RemoteSearchResult albumArtist = null;

  @SerializedName("Artists")
  private List<RemoteSearchResult> artists = null;

  public RemoteSearchResult name(String name) {
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

  public RemoteSearchResult originalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
    return this;
  }

   /**
   * Get originalTitle
   * @return originalTitle
  **/
  @Schema(description = "")
  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public RemoteSearchResult providerIds(ProviderIdDictionary providerIds) {
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

  public RemoteSearchResult productionYear(Integer productionYear) {
    this.productionYear = productionYear;
    return this;
  }

   /**
   * The year.
   * @return productionYear
  **/
  @Schema(description = "The year.")
  public Integer getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(Integer productionYear) {
    this.productionYear = productionYear;
  }

  public RemoteSearchResult indexNumber(Integer indexNumber) {
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

  public RemoteSearchResult indexNumberEnd(Integer indexNumberEnd) {
    this.indexNumberEnd = indexNumberEnd;
    return this;
  }

   /**
   * Get indexNumberEnd
   * @return indexNumberEnd
  **/
  @Schema(description = "")
  public Integer getIndexNumberEnd() {
    return indexNumberEnd;
  }

  public void setIndexNumberEnd(Integer indexNumberEnd) {
    this.indexNumberEnd = indexNumberEnd;
  }

  public RemoteSearchResult parentIndexNumber(Integer parentIndexNumber) {
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

  public RemoteSearchResult sortIndexNumber(Integer sortIndexNumber) {
    this.sortIndexNumber = sortIndexNumber;
    return this;
  }

   /**
   * Get sortIndexNumber
   * @return sortIndexNumber
  **/
  @Schema(description = "")
  public Integer getSortIndexNumber() {
    return sortIndexNumber;
  }

  public void setSortIndexNumber(Integer sortIndexNumber) {
    this.sortIndexNumber = sortIndexNumber;
  }

  public RemoteSearchResult sortParentIndexNumber(Integer sortParentIndexNumber) {
    this.sortParentIndexNumber = sortParentIndexNumber;
    return this;
  }

   /**
   * Get sortParentIndexNumber
   * @return sortParentIndexNumber
  **/
  @Schema(description = "")
  public Integer getSortParentIndexNumber() {
    return sortParentIndexNumber;
  }

  public void setSortParentIndexNumber(Integer sortParentIndexNumber) {
    this.sortParentIndexNumber = sortParentIndexNumber;
  }

  public RemoteSearchResult premiereDate(OffsetDateTime premiereDate) {
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

  public RemoteSearchResult imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @Schema(description = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public RemoteSearchResult searchProviderName(String searchProviderName) {
    this.searchProviderName = searchProviderName;
    return this;
  }

   /**
   * Get searchProviderName
   * @return searchProviderName
  **/
  @Schema(description = "")
  public String getSearchProviderName() {
    return searchProviderName;
  }

  public void setSearchProviderName(String searchProviderName) {
    this.searchProviderName = searchProviderName;
  }

  public RemoteSearchResult gameSystem(String gameSystem) {
    this.gameSystem = gameSystem;
    return this;
  }

   /**
   * Get gameSystem
   * @return gameSystem
  **/
  @Schema(description = "")
  public String getGameSystem() {
    return gameSystem;
  }

  public void setGameSystem(String gameSystem) {
    this.gameSystem = gameSystem;
  }

  public RemoteSearchResult overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public RemoteSearchResult disambiguationComment(String disambiguationComment) {
    this.disambiguationComment = disambiguationComment;
    return this;
  }

   /**
   * Get disambiguationComment
   * @return disambiguationComment
  **/
  @Schema(description = "")
  public String getDisambiguationComment() {
    return disambiguationComment;
  }

  public void setDisambiguationComment(String disambiguationComment) {
    this.disambiguationComment = disambiguationComment;
  }

  public RemoteSearchResult albumArtist(RemoteSearchResult albumArtist) {
    this.albumArtist = albumArtist;
    return this;
  }

   /**
   * Get albumArtist
   * @return albumArtist
  **/
  @Schema(description = "")
  public RemoteSearchResult getAlbumArtist() {
    return albumArtist;
  }

  public void setAlbumArtist(RemoteSearchResult albumArtist) {
    this.albumArtist = albumArtist;
  }

  public RemoteSearchResult artists(List<RemoteSearchResult> artists) {
    this.artists = artists;
    return this;
  }

  public RemoteSearchResult addArtistsItem(RemoteSearchResult artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<RemoteSearchResult>();
    }
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * Get artists
   * @return artists
  **/
  @Schema(description = "")
  public List<RemoteSearchResult> getArtists() {
    return artists;
  }

  public void setArtists(List<RemoteSearchResult> artists) {
    this.artists = artists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSearchResult remoteSearchResult = (RemoteSearchResult) o;
    return Objects.equals(this.name, remoteSearchResult.name) &&
        Objects.equals(this.originalTitle, remoteSearchResult.originalTitle) &&
        Objects.equals(this.providerIds, remoteSearchResult.providerIds) &&
        Objects.equals(this.productionYear, remoteSearchResult.productionYear) &&
        Objects.equals(this.indexNumber, remoteSearchResult.indexNumber) &&
        Objects.equals(this.indexNumberEnd, remoteSearchResult.indexNumberEnd) &&
        Objects.equals(this.parentIndexNumber, remoteSearchResult.parentIndexNumber) &&
        Objects.equals(this.sortIndexNumber, remoteSearchResult.sortIndexNumber) &&
        Objects.equals(this.sortParentIndexNumber, remoteSearchResult.sortParentIndexNumber) &&
        Objects.equals(this.premiereDate, remoteSearchResult.premiereDate) &&
        Objects.equals(this.imageUrl, remoteSearchResult.imageUrl) &&
        Objects.equals(this.searchProviderName, remoteSearchResult.searchProviderName) &&
        Objects.equals(this.gameSystem, remoteSearchResult.gameSystem) &&
        Objects.equals(this.overview, remoteSearchResult.overview) &&
        Objects.equals(this.disambiguationComment, remoteSearchResult.disambiguationComment) &&
        Objects.equals(this.albumArtist, remoteSearchResult.albumArtist) &&
        Objects.equals(this.artists, remoteSearchResult.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, originalTitle, providerIds, productionYear, indexNumber, indexNumberEnd, parentIndexNumber, sortIndexNumber, sortParentIndexNumber, premiereDate, imageUrl, searchProviderName, gameSystem, overview, disambiguationComment, albumArtist, artists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteSearchResult {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    indexNumberEnd: ").append(toIndentedString(indexNumberEnd)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    sortIndexNumber: ").append(toIndentedString(sortIndexNumber)).append("\n");
    sb.append("    sortParentIndexNumber: ").append(toIndentedString(sortParentIndexNumber)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    searchProviderName: ").append(toIndentedString(searchProviderName)).append("\n");
    sb.append("    gameSystem: ").append(toIndentedString(gameSystem)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    disambiguationComment: ").append(toIndentedString(disambiguationComment)).append("\n");
    sb.append("    albumArtist: ").append(toIndentedString(albumArtist)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
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
