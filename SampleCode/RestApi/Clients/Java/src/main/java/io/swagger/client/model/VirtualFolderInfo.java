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
import io.swagger.client.model.LibraryOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Used to hold information about a user&#x27;s list of configured virtual folders  
 */
@Schema(description = "Used to hold information about a user's list of configured virtual folders  ")

public class VirtualFolderInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Locations")
  private List<String> locations = null;

  @SerializedName("CollectionType")
  private String collectionType = null;

  @SerializedName("LibraryOptions")
  private LibraryOptions libraryOptions = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Guid")
  private String guid = null;

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
   * The locations.
   * @return locations
  **/
  @Schema(description = "The locations.")
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
   * The type of the collection.
   * @return collectionType
  **/
  @Schema(description = "The type of the collection.")
  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public VirtualFolderInfo libraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
    return this;
  }

   /**
   * Get libraryOptions
   * @return libraryOptions
  **/
  @Schema(description = "")
  public LibraryOptions getLibraryOptions() {
    return libraryOptions;
  }

  public void setLibraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
  }

  public VirtualFolderInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The item identifier.
   * @return itemId
  **/
  @Schema(description = "The item identifier.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public VirtualFolderInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ItemId came first, so that is left for compatability purposes
   * @return id
  **/
  @Schema(description = "ItemId came first, so that is left for compatability purposes")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VirtualFolderInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @Schema(description = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public VirtualFolderInfo primaryImageItemId(String primaryImageItemId) {
    this.primaryImageItemId = primaryImageItemId;
    return this;
  }

   /**
   * The primary image item identifier.
   * @return primaryImageItemId
  **/
  @Schema(description = "The primary image item identifier.")
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
        Objects.equals(this.id, virtualFolderInfo.id) &&
        Objects.equals(this.guid, virtualFolderInfo.guid) &&
        Objects.equals(this.primaryImageItemId, virtualFolderInfo.primaryImageItemId) &&
        Objects.equals(this.refreshProgress, virtualFolderInfo.refreshProgress) &&
        Objects.equals(this.refreshStatus, virtualFolderInfo.refreshStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locations, collectionType, libraryOptions, itemId, id, guid, primaryImageItemId, refreshProgress, refreshStatus);
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
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
