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
import io.swagger.client.model.EnumsUIViewType;
import io.swagger.client.model.GenericEditIEditObjectContainer;
import io.swagger.client.model.UICommand;
import io.swagger.client.model.UITabPageInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UIViewInfo
 */


public class UIViewInfo {
  @SerializedName("ViewId")
  private String viewId = null;

  @SerializedName("PageId")
  private String pageId = null;

  @SerializedName("Caption")
  private String caption = null;

  @SerializedName("SubCaption")
  private String subCaption = null;

  @SerializedName("PluginId")
  private String pluginId = null;

  @SerializedName("ViewType")
  private EnumsUIViewType viewType = null;

  @SerializedName("ShowDialogFullScreen")
  private Boolean showDialogFullScreen = null;

  @SerializedName("IsInSequence")
  private Boolean isInSequence = null;

  @SerializedName("RedirectViewUrl")
  private String redirectViewUrl = null;

  @SerializedName("EditObjectContainer")
  private GenericEditIEditObjectContainer editObjectContainer = null;

  @SerializedName("Commands")
  private List<UICommand> commands = null;

  @SerializedName("TabPageInfos")
  private List<UITabPageInfo> tabPageInfos = null;

  @SerializedName("IsPageChangeInfo")
  private Boolean isPageChangeInfo = null;

  public UIViewInfo viewId(String viewId) {
    this.viewId = viewId;
    return this;
  }

   /**
   * Get viewId
   * @return viewId
  **/
  @Schema(description = "")
  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }

  public UIViewInfo pageId(String pageId) {
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

  public UIViewInfo caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @Schema(description = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public UIViewInfo subCaption(String subCaption) {
    this.subCaption = subCaption;
    return this;
  }

   /**
   * Get subCaption
   * @return subCaption
  **/
  @Schema(description = "")
  public String getSubCaption() {
    return subCaption;
  }

  public void setSubCaption(String subCaption) {
    this.subCaption = subCaption;
  }

  public UIViewInfo pluginId(String pluginId) {
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

  public UIViewInfo viewType(EnumsUIViewType viewType) {
    this.viewType = viewType;
    return this;
  }

   /**
   * Get viewType
   * @return viewType
  **/
  @Schema(description = "")
  public EnumsUIViewType getViewType() {
    return viewType;
  }

  public void setViewType(EnumsUIViewType viewType) {
    this.viewType = viewType;
  }

  public UIViewInfo showDialogFullScreen(Boolean showDialogFullScreen) {
    this.showDialogFullScreen = showDialogFullScreen;
    return this;
  }

   /**
   * Get showDialogFullScreen
   * @return showDialogFullScreen
  **/
  @Schema(description = "")
  public Boolean isShowDialogFullScreen() {
    return showDialogFullScreen;
  }

  public void setShowDialogFullScreen(Boolean showDialogFullScreen) {
    this.showDialogFullScreen = showDialogFullScreen;
  }

  public UIViewInfo isInSequence(Boolean isInSequence) {
    this.isInSequence = isInSequence;
    return this;
  }

   /**
   * Get isInSequence
   * @return isInSequence
  **/
  @Schema(description = "")
  public Boolean isIsInSequence() {
    return isInSequence;
  }

  public void setIsInSequence(Boolean isInSequence) {
    this.isInSequence = isInSequence;
  }

  public UIViewInfo redirectViewUrl(String redirectViewUrl) {
    this.redirectViewUrl = redirectViewUrl;
    return this;
  }

   /**
   * Get redirectViewUrl
   * @return redirectViewUrl
  **/
  @Schema(description = "")
  public String getRedirectViewUrl() {
    return redirectViewUrl;
  }

  public void setRedirectViewUrl(String redirectViewUrl) {
    this.redirectViewUrl = redirectViewUrl;
  }

  public UIViewInfo editObjectContainer(GenericEditIEditObjectContainer editObjectContainer) {
    this.editObjectContainer = editObjectContainer;
    return this;
  }

   /**
   * Get editObjectContainer
   * @return editObjectContainer
  **/
  @Schema(description = "")
  public GenericEditIEditObjectContainer getEditObjectContainer() {
    return editObjectContainer;
  }

  public void setEditObjectContainer(GenericEditIEditObjectContainer editObjectContainer) {
    this.editObjectContainer = editObjectContainer;
  }

  public UIViewInfo commands(List<UICommand> commands) {
    this.commands = commands;
    return this;
  }

  public UIViewInfo addCommandsItem(UICommand commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<UICommand>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Get commands
   * @return commands
  **/
  @Schema(description = "")
  public List<UICommand> getCommands() {
    return commands;
  }

  public void setCommands(List<UICommand> commands) {
    this.commands = commands;
  }

  public UIViewInfo tabPageInfos(List<UITabPageInfo> tabPageInfos) {
    this.tabPageInfos = tabPageInfos;
    return this;
  }

  public UIViewInfo addTabPageInfosItem(UITabPageInfo tabPageInfosItem) {
    if (this.tabPageInfos == null) {
      this.tabPageInfos = new ArrayList<UITabPageInfo>();
    }
    this.tabPageInfos.add(tabPageInfosItem);
    return this;
  }

   /**
   * Get tabPageInfos
   * @return tabPageInfos
  **/
  @Schema(description = "")
  public List<UITabPageInfo> getTabPageInfos() {
    return tabPageInfos;
  }

  public void setTabPageInfos(List<UITabPageInfo> tabPageInfos) {
    this.tabPageInfos = tabPageInfos;
  }

  public UIViewInfo isPageChangeInfo(Boolean isPageChangeInfo) {
    this.isPageChangeInfo = isPageChangeInfo;
    return this;
  }

   /**
   * Get isPageChangeInfo
   * @return isPageChangeInfo
  **/
  @Schema(description = "")
  public Boolean isIsPageChangeInfo() {
    return isPageChangeInfo;
  }

  public void setIsPageChangeInfo(Boolean isPageChangeInfo) {
    this.isPageChangeInfo = isPageChangeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UIViewInfo uiViewInfo = (UIViewInfo) o;
    return Objects.equals(this.viewId, uiViewInfo.viewId) &&
        Objects.equals(this.pageId, uiViewInfo.pageId) &&
        Objects.equals(this.caption, uiViewInfo.caption) &&
        Objects.equals(this.subCaption, uiViewInfo.subCaption) &&
        Objects.equals(this.pluginId, uiViewInfo.pluginId) &&
        Objects.equals(this.viewType, uiViewInfo.viewType) &&
        Objects.equals(this.showDialogFullScreen, uiViewInfo.showDialogFullScreen) &&
        Objects.equals(this.isInSequence, uiViewInfo.isInSequence) &&
        Objects.equals(this.redirectViewUrl, uiViewInfo.redirectViewUrl) &&
        Objects.equals(this.editObjectContainer, uiViewInfo.editObjectContainer) &&
        Objects.equals(this.commands, uiViewInfo.commands) &&
        Objects.equals(this.tabPageInfos, uiViewInfo.tabPageInfos) &&
        Objects.equals(this.isPageChangeInfo, uiViewInfo.isPageChangeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewId, pageId, caption, subCaption, pluginId, viewType, showDialogFullScreen, isInSequence, redirectViewUrl, editObjectContainer, commands, tabPageInfos, isPageChangeInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UIViewInfo {\n");
    
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    subCaption: ").append(toIndentedString(subCaption)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    showDialogFullScreen: ").append(toIndentedString(showDialogFullScreen)).append("\n");
    sb.append("    isInSequence: ").append(toIndentedString(isInSequence)).append("\n");
    sb.append("    redirectViewUrl: ").append(toIndentedString(redirectViewUrl)).append("\n");
    sb.append("    editObjectContainer: ").append(toIndentedString(editObjectContainer)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    tabPageInfos: ").append(toIndentedString(tabPageInfos)).append("\n");
    sb.append("    isPageChangeInfo: ").append(toIndentedString(isPageChangeInfo)).append("\n");
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
