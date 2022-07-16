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
import io.swagger.client.model.ScrollDirection;
import io.swagger.client.model.SortOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * DisplayPreferences
 */


public class DisplayPreferences {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ViewType")
  private String viewType = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("IndexBy")
  private String indexBy = null;

  @SerializedName("RememberIndexing")
  private Boolean rememberIndexing = null;

  @SerializedName("PrimaryImageHeight")
  private Integer primaryImageHeight = null;

  @SerializedName("PrimaryImageWidth")
  private Integer primaryImageWidth = null;

  @SerializedName("CustomPrefs")
  private Map<String, String> customPrefs = null;

  @SerializedName("ScrollDirection")
  private ScrollDirection scrollDirection = null;

  @SerializedName("ShowBackdrop")
  private Boolean showBackdrop = null;

  @SerializedName("RememberSorting")
  private Boolean rememberSorting = null;

  @SerializedName("SortOrder")
  private SortOrder sortOrder = null;

  @SerializedName("Client")
  private String client = null;

  public DisplayPreferences id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DisplayPreferences viewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

   /**
   * Get viewType
   * @return viewType
  **/
  @Schema(description = "")
  public String getViewType() {
    return viewType;
  }

  public void setViewType(String viewType) {
    this.viewType = viewType;
  }

  public DisplayPreferences sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @Schema(description = "")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public DisplayPreferences indexBy(String indexBy) {
    this.indexBy = indexBy;
    return this;
  }

   /**
   * Get indexBy
   * @return indexBy
  **/
  @Schema(description = "")
  public String getIndexBy() {
    return indexBy;
  }

  public void setIndexBy(String indexBy) {
    this.indexBy = indexBy;
  }

  public DisplayPreferences rememberIndexing(Boolean rememberIndexing) {
    this.rememberIndexing = rememberIndexing;
    return this;
  }

   /**
   * Get rememberIndexing
   * @return rememberIndexing
  **/
  @Schema(description = "")
  public Boolean isRememberIndexing() {
    return rememberIndexing;
  }

  public void setRememberIndexing(Boolean rememberIndexing) {
    this.rememberIndexing = rememberIndexing;
  }

  public DisplayPreferences primaryImageHeight(Integer primaryImageHeight) {
    this.primaryImageHeight = primaryImageHeight;
    return this;
  }

   /**
   * Get primaryImageHeight
   * @return primaryImageHeight
  **/
  @Schema(description = "")
  public Integer getPrimaryImageHeight() {
    return primaryImageHeight;
  }

  public void setPrimaryImageHeight(Integer primaryImageHeight) {
    this.primaryImageHeight = primaryImageHeight;
  }

  public DisplayPreferences primaryImageWidth(Integer primaryImageWidth) {
    this.primaryImageWidth = primaryImageWidth;
    return this;
  }

   /**
   * Get primaryImageWidth
   * @return primaryImageWidth
  **/
  @Schema(description = "")
  public Integer getPrimaryImageWidth() {
    return primaryImageWidth;
  }

  public void setPrimaryImageWidth(Integer primaryImageWidth) {
    this.primaryImageWidth = primaryImageWidth;
  }

  public DisplayPreferences customPrefs(Map<String, String> customPrefs) {
    this.customPrefs = customPrefs;
    return this;
  }

  public DisplayPreferences putCustomPrefsItem(String key, String customPrefsItem) {
    if (this.customPrefs == null) {
      this.customPrefs = new HashMap<String, String>();
    }
    this.customPrefs.put(key, customPrefsItem);
    return this;
  }

   /**
   * Get customPrefs
   * @return customPrefs
  **/
  @Schema(description = "")
  public Map<String, String> getCustomPrefs() {
    return customPrefs;
  }

  public void setCustomPrefs(Map<String, String> customPrefs) {
    this.customPrefs = customPrefs;
  }

  public DisplayPreferences scrollDirection(ScrollDirection scrollDirection) {
    this.scrollDirection = scrollDirection;
    return this;
  }

   /**
   * Get scrollDirection
   * @return scrollDirection
  **/
  @Schema(description = "")
  public ScrollDirection getScrollDirection() {
    return scrollDirection;
  }

  public void setScrollDirection(ScrollDirection scrollDirection) {
    this.scrollDirection = scrollDirection;
  }

  public DisplayPreferences showBackdrop(Boolean showBackdrop) {
    this.showBackdrop = showBackdrop;
    return this;
  }

   /**
   * Get showBackdrop
   * @return showBackdrop
  **/
  @Schema(description = "")
  public Boolean isShowBackdrop() {
    return showBackdrop;
  }

  public void setShowBackdrop(Boolean showBackdrop) {
    this.showBackdrop = showBackdrop;
  }

  public DisplayPreferences rememberSorting(Boolean rememberSorting) {
    this.rememberSorting = rememberSorting;
    return this;
  }

   /**
   * Get rememberSorting
   * @return rememberSorting
  **/
  @Schema(description = "")
  public Boolean isRememberSorting() {
    return rememberSorting;
  }

  public void setRememberSorting(Boolean rememberSorting) {
    this.rememberSorting = rememberSorting;
  }

  public DisplayPreferences sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @Schema(description = "")
  public SortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  public DisplayPreferences client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @Schema(description = "")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayPreferences displayPreferences = (DisplayPreferences) o;
    return Objects.equals(this.id, displayPreferences.id) &&
        Objects.equals(this.viewType, displayPreferences.viewType) &&
        Objects.equals(this.sortBy, displayPreferences.sortBy) &&
        Objects.equals(this.indexBy, displayPreferences.indexBy) &&
        Objects.equals(this.rememberIndexing, displayPreferences.rememberIndexing) &&
        Objects.equals(this.primaryImageHeight, displayPreferences.primaryImageHeight) &&
        Objects.equals(this.primaryImageWidth, displayPreferences.primaryImageWidth) &&
        Objects.equals(this.customPrefs, displayPreferences.customPrefs) &&
        Objects.equals(this.scrollDirection, displayPreferences.scrollDirection) &&
        Objects.equals(this.showBackdrop, displayPreferences.showBackdrop) &&
        Objects.equals(this.rememberSorting, displayPreferences.rememberSorting) &&
        Objects.equals(this.sortOrder, displayPreferences.sortOrder) &&
        Objects.equals(this.client, displayPreferences.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, viewType, sortBy, indexBy, rememberIndexing, primaryImageHeight, primaryImageWidth, customPrefs, scrollDirection, showBackdrop, rememberSorting, sortOrder, client);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayPreferences {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    indexBy: ").append(toIndentedString(indexBy)).append("\n");
    sb.append("    rememberIndexing: ").append(toIndentedString(rememberIndexing)).append("\n");
    sb.append("    primaryImageHeight: ").append(toIndentedString(primaryImageHeight)).append("\n");
    sb.append("    primaryImageWidth: ").append(toIndentedString(primaryImageWidth)).append("\n");
    sb.append("    customPrefs: ").append(toIndentedString(customPrefs)).append("\n");
    sb.append("    scrollDirection: ").append(toIndentedString(scrollDirection)).append("\n");
    sb.append("    showBackdrop: ").append(toIndentedString(showBackdrop)).append("\n");
    sb.append("    rememberSorting: ").append(toIndentedString(rememberSorting)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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
