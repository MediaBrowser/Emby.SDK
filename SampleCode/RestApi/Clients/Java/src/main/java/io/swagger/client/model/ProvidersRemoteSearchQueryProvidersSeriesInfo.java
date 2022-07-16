/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ProvidersSeriesInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProvidersRemoteSearchQueryProvidersSeriesInfo
 */


public class ProvidersRemoteSearchQueryProvidersSeriesInfo {
  @SerializedName("SearchInfo")
  private ProvidersSeriesInfo searchInfo = null;

  @SerializedName("ItemId")
  private Long itemId = null;

  @SerializedName("SearchProviderName")
  private String searchProviderName = null;

  @SerializedName("Providers")
  private List<String> providers = null;

  @SerializedName("IncludeDisabledProviders")
  private Boolean includeDisabledProviders = null;

  public ProvidersRemoteSearchQueryProvidersSeriesInfo searchInfo(ProvidersSeriesInfo searchInfo) {
    this.searchInfo = searchInfo;
    return this;
  }

   /**
   * Get searchInfo
   * @return searchInfo
  **/
  @Schema(description = "")
  public ProvidersSeriesInfo getSearchInfo() {
    return searchInfo;
  }

  public void setSearchInfo(ProvidersSeriesInfo searchInfo) {
    this.searchInfo = searchInfo;
  }

  public ProvidersRemoteSearchQueryProvidersSeriesInfo itemId(Long itemId) {
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

  public ProvidersRemoteSearchQueryProvidersSeriesInfo searchProviderName(String searchProviderName) {
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

  public ProvidersRemoteSearchQueryProvidersSeriesInfo providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public ProvidersRemoteSearchQueryProvidersSeriesInfo addProvidersItem(String providersItem) {
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

  public ProvidersRemoteSearchQueryProvidersSeriesInfo includeDisabledProviders(Boolean includeDisabledProviders) {
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
    ProvidersRemoteSearchQueryProvidersSeriesInfo providersRemoteSearchQueryProvidersSeriesInfo = (ProvidersRemoteSearchQueryProvidersSeriesInfo) o;
    return Objects.equals(this.searchInfo, providersRemoteSearchQueryProvidersSeriesInfo.searchInfo) &&
        Objects.equals(this.itemId, providersRemoteSearchQueryProvidersSeriesInfo.itemId) &&
        Objects.equals(this.searchProviderName, providersRemoteSearchQueryProvidersSeriesInfo.searchProviderName) &&
        Objects.equals(this.providers, providersRemoteSearchQueryProvidersSeriesInfo.providers) &&
        Objects.equals(this.includeDisabledProviders, providersRemoteSearchQueryProvidersSeriesInfo.includeDisabledProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchInfo, itemId, searchProviderName, providers, includeDisabledProviders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersRemoteSearchQueryProvidersSeriesInfo {\n");
    
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
