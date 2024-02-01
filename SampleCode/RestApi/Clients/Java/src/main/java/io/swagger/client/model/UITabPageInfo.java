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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UITabPageInfo
 */


public class UITabPageInfo {
  @SerializedName("PageId")
  private String pageId = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("PluginId")
  private String pluginId = null;

  @SerializedName("Href")
  private String href = null;

  @SerializedName("NavKey")
  private String navKey = null;

  @SerializedName("Index")
  private Integer index = null;

  public UITabPageInfo pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * Get pageId
   * @return pageId
  **/
  @Schema(description = "")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public UITabPageInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UITabPageInfo pluginId(String pluginId) {
    this.pluginId = pluginId;
    return this;
  }

   /**
   * Get pluginId
   * @return pluginId
  **/
  @Schema(description = "")
  public String getPluginId() {
    return pluginId;
  }

  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }

  public UITabPageInfo href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @Schema(description = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public UITabPageInfo navKey(String navKey) {
    this.navKey = navKey;
    return this;
  }

   /**
   * Get navKey
   * @return navKey
  **/
  @Schema(description = "")
  public String getNavKey() {
    return navKey;
  }

  public void setNavKey(String navKey) {
    this.navKey = navKey;
  }

  public UITabPageInfo index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UITabPageInfo uiTabPageInfo = (UITabPageInfo) o;
    return Objects.equals(this.pageId, uiTabPageInfo.pageId) &&
        Objects.equals(this.displayName, uiTabPageInfo.displayName) &&
        Objects.equals(this.pluginId, uiTabPageInfo.pluginId) &&
        Objects.equals(this.href, uiTabPageInfo.href) &&
        Objects.equals(this.navKey, uiTabPageInfo.navKey) &&
        Objects.equals(this.index, uiTabPageInfo.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, displayName, pluginId, href, navKey, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UITabPageInfo {\n");
    
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    navKey: ").append(toIndentedString(navKey)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
