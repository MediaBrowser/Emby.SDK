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
import io.swagger.client.model.AlbumInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RemoteSearchQueryAlbumInfo
 */


public class RemoteSearchQueryAlbumInfo {
  @SerializedName("SearchInfo")
  private AlbumInfo searchInfo = null;

  @SerializedName("ItemId")
  private Long itemId = null;

  @SerializedName("SearchProviderName")
  private String searchProviderName = null;

  @SerializedName("Providers")
  private List<String> providers = null;

  @SerializedName("IncludeDisabledProviders")
  private Boolean includeDisabledProviders = null;

  public RemoteSearchQueryAlbumInfo searchInfo(AlbumInfo searchInfo) {
    this.searchInfo = searchInfo;
    return this;
  }

   /**
   * Get searchInfo
   * @return searchInfo
  **/
  @Schema(description = "")
  public AlbumInfo getSearchInfo() {
    return searchInfo;
  }

  public void setSearchInfo(AlbumInfo searchInfo) {
    this.searchInfo = searchInfo;
  }

  public RemoteSearchQueryAlbumInfo itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public RemoteSearchQueryAlbumInfo searchProviderName(String searchProviderName) {
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

  public RemoteSearchQueryAlbumInfo providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public RemoteSearchQueryAlbumInfo addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<String>();
    }
    this.providers.add(providersItem);
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @Schema(description = "")
  public List<String> getProviders() {
    return providers;
  }

  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  public RemoteSearchQueryAlbumInfo includeDisabledProviders(Boolean includeDisabledProviders) {
    this.includeDisabledProviders = includeDisabledProviders;
    return this;
  }

   /**
   * Get includeDisabledProviders
   * @return includeDisabledProviders
  **/
  @Schema(description = "")
  public Boolean isIncludeDisabledProviders() {
    return includeDisabledProviders;
  }

  public void setIncludeDisabledProviders(Boolean includeDisabledProviders) {
    this.includeDisabledProviders = includeDisabledProviders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSearchQueryAlbumInfo remoteSearchQueryAlbumInfo = (RemoteSearchQueryAlbumInfo) o;
    return Objects.equals(this.searchInfo, remoteSearchQueryAlbumInfo.searchInfo) &&
        Objects.equals(this.itemId, remoteSearchQueryAlbumInfo.itemId) &&
        Objects.equals(this.searchProviderName, remoteSearchQueryAlbumInfo.searchProviderName) &&
        Objects.equals(this.providers, remoteSearchQueryAlbumInfo.providers) &&
        Objects.equals(this.includeDisabledProviders, remoteSearchQueryAlbumInfo.includeDisabledProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchInfo, itemId, searchProviderName, providers, includeDisabledProviders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteSearchQueryAlbumInfo {\n");
    
    sb.append("    searchInfo: ").append(toIndentedString(searchInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    searchProviderName: ").append(toIndentedString(searchProviderName)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    includeDisabledProviders: ").append(toIndentedString(includeDisabledProviders)).append("\n");
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
