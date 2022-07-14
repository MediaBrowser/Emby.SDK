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
import io.swagger.client.model.ProvidersMovieInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProvidersRemoteSearchQueryProvidersMovieInfo
 */


public class ProvidersRemoteSearchQueryProvidersMovieInfo {
  @SerializedName("SearchInfo")
  private ProvidersMovieInfo searchInfo = null;

  @SerializedName("ItemId")
  private Long itemId = null;

  @SerializedName("SearchProviderName")
  private String searchProviderName = null;

  @SerializedName("IncludeDisabledProviders")
  private Boolean includeDisabledProviders = null;

  public ProvidersRemoteSearchQueryProvidersMovieInfo searchInfo(ProvidersMovieInfo searchInfo) {
    this.searchInfo = searchInfo;
    return this;
  }

   /**
   * Get searchInfo
   * @return searchInfo
  **/
  @Schema(description = "")
  public ProvidersMovieInfo getSearchInfo() {
    return searchInfo;
  }

  public void setSearchInfo(ProvidersMovieInfo searchInfo) {
    this.searchInfo = searchInfo;
  }

  public ProvidersRemoteSearchQueryProvidersMovieInfo itemId(Long itemId) {
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

  public ProvidersRemoteSearchQueryProvidersMovieInfo searchProviderName(String searchProviderName) {
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

  public ProvidersRemoteSearchQueryProvidersMovieInfo includeDisabledProviders(Boolean includeDisabledProviders) {
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
    ProvidersRemoteSearchQueryProvidersMovieInfo providersRemoteSearchQueryProvidersMovieInfo = (ProvidersRemoteSearchQueryProvidersMovieInfo) o;
    return Objects.equals(this.searchInfo, providersRemoteSearchQueryProvidersMovieInfo.searchInfo) &&
        Objects.equals(this.itemId, providersRemoteSearchQueryProvidersMovieInfo.itemId) &&
        Objects.equals(this.searchProviderName, providersRemoteSearchQueryProvidersMovieInfo.searchProviderName) &&
        Objects.equals(this.includeDisabledProviders, providersRemoteSearchQueryProvidersMovieInfo.includeDisabledProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchInfo, itemId, searchProviderName, includeDisabledProviders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersRemoteSearchQueryProvidersMovieInfo {\n");
    
    sb.append("    searchInfo: ").append(toIndentedString(searchInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    searchProviderName: ").append(toIndentedString(searchProviderName)).append("\n");
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
