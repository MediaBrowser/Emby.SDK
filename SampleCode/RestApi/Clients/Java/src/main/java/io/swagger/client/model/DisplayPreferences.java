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
import io.swagger.client.model.SortOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Defines the display preferences for any item that supports them (usually Folders)  
 */
@Schema(description = "Defines the display preferences for any item that supports them (usually Folders)  ")

public class DisplayPreferences {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("CustomPrefs")
  private Map<String, String> customPrefs = null;

  @SerializedName("SortOrder")
  private SortOrder sortOrder = null;

  @SerializedName("Client")
  private String client = null;

  public DisplayPreferences id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The user id.
   * @return id
  **/
  @Schema(description = "The user id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DisplayPreferences sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * The sort by.
   * @return sortBy
  **/
  @Schema(description = "The sort by.")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
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
   * The custom prefs.
   * @return customPrefs
  **/
  @Schema(description = "The custom prefs.")
  public Map<String, String> getCustomPrefs() {
    return customPrefs;
  }

  public void setCustomPrefs(Map<String, String> customPrefs) {
    this.customPrefs = customPrefs;
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
   * The client
   * @return client
  **/
  @Schema(description = "The client")
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
        Objects.equals(this.sortBy, displayPreferences.sortBy) &&
        Objects.equals(this.customPrefs, displayPreferences.customPrefs) &&
        Objects.equals(this.sortOrder, displayPreferences.sortOrder) &&
        Objects.equals(this.client, displayPreferences.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sortBy, customPrefs, sortOrder, client);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayPreferences {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    customPrefs: ").append(toIndentedString(customPrefs)).append("\n");
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
