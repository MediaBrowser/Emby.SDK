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
import io.swagger.client.model.ConfigurationLibraryOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VirtualFolderInfo
 */


public class VirtualFolderInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Locations")
  private List<String> locations = null;

  @SerializedName("CollectionType")
  private String collectionType = null;

  @SerializedName("LibraryOptions")
  private ConfigurationLibraryOptions libraryOptions = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("PrimaryImageItemId")
  private String primaryImageItemId = null;

  @SerializedName("RefreshProgress")
  private Double refreshProgress = null;

  @SerializedName("RefreshStatus")
  private String refreshStatus = null;

  public VirtualFolderInfo name(String name) {
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

  public VirtualFolderInfo locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public VirtualFolderInfo addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<String>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @Schema(description = "")
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public VirtualFolderInfo collectionType(String collectionType) {
    this.collectionType = collectionType;
    return this;
  }

   /**
   * Get collectionType
   * @return collectionType
  **/
  @Schema(description = "")
  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public VirtualFolderInfo libraryOptions(ConfigurationLibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
    return this;
  }

   /**
   * Get libraryOptions
   * @return libraryOptions
  **/
  @Schema(description = "")
  public ConfigurationLibraryOptions getLibraryOptions() {
    return libraryOptions;
  }

  public void setLibraryOptions(ConfigurationLibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
  }

  public VirtualFolderInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public VirtualFolderInfo primaryImageItemId(String primaryImageItemId) {
    this.primaryImageItemId = primaryImageItemId;
    return this;
  }

   /**
   * Get primaryImageItemId
   * @return primaryImageItemId
  **/
  @Schema(description = "")
  public String getPrimaryImageItemId() {
    return primaryImageItemId;
  }

  public void setPrimaryImageItemId(String primaryImageItemId) {
    this.primaryImageItemId = primaryImageItemId;
  }

  public VirtualFolderInfo refreshProgress(Double refreshProgress) {
    this.refreshProgress = refreshProgress;
    return this;
  }

   /**
   * Get refreshProgress
   * @return refreshProgress
  **/
  @Schema(description = "")
  public Double getRefreshProgress() {
    return refreshProgress;
  }

  public void setRefreshProgress(Double refreshProgress) {
    this.refreshProgress = refreshProgress;
  }

  public VirtualFolderInfo refreshStatus(String refreshStatus) {
    this.refreshStatus = refreshStatus;
    return this;
  }

   /**
   * Get refreshStatus
   * @return refreshStatus
  **/
  @Schema(description = "")
  public String getRefreshStatus() {
    return refreshStatus;
  }

  public void setRefreshStatus(String refreshStatus) {
    this.refreshStatus = refreshStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualFolderInfo virtualFolderInfo = (VirtualFolderInfo) o;
    return Objects.equals(this.name, virtualFolderInfo.name) &&
        Objects.equals(this.locations, virtualFolderInfo.locations) &&
        Objects.equals(this.collectionType, virtualFolderInfo.collectionType) &&
        Objects.equals(this.libraryOptions, virtualFolderInfo.libraryOptions) &&
        Objects.equals(this.itemId, virtualFolderInfo.itemId) &&
        Objects.equals(this.primaryImageItemId, virtualFolderInfo.primaryImageItemId) &&
        Objects.equals(this.refreshProgress, virtualFolderInfo.refreshProgress) &&
        Objects.equals(this.refreshStatus, virtualFolderInfo.refreshStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locations, collectionType, libraryOptions, itemId, primaryImageItemId, refreshProgress, refreshStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualFolderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    libraryOptions: ").append(toIndentedString(libraryOptions)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    primaryImageItemId: ").append(toIndentedString(primaryImageItemId)).append("\n");
    sb.append("    refreshProgress: ").append(toIndentedString(refreshProgress)).append("\n");
    sb.append("    refreshStatus: ").append(toIndentedString(refreshStatus)).append("\n");
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