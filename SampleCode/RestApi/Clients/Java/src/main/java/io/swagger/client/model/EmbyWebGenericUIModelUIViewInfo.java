/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.EmbyWebGenericUIModelEnumsUIViewType;
import io.swagger.client.model.EmbyWebGenericUIModelUICommand;
import io.swagger.client.model.EmbyWebGenericUIModelUITabPageInfo;
import io.swagger.client.model.GenericEditIEditObjectContainer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyWebGenericUIModelUIViewInfo
 */


public class EmbyWebGenericUIModelUIViewInfo {
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
  private EmbyWebGenericUIModelEnumsUIViewType viewType = null;

  @SerializedName("ShowDialogFullScreen")
  private Boolean showDialogFullScreen = null;

  @SerializedName("IsInSequence")
  private Boolean isInSequence = null;

  @SerializedName("RedirectViewUrl")
  private String redirectViewUrl = null;

  @SerializedName("EditObjectContainer")
  private GenericEditIEditObjectContainer editObjectContainer = null;

  @SerializedName("Commands")
  private List<EmbyWebGenericUIModelUICommand> commands = null;

  @SerializedName("TabPageInfos")
  private List<EmbyWebGenericUIModelUITabPageInfo> tabPageInfos = null;

  @SerializedName("IsPageChangeInfo")
  private Boolean isPageChangeInfo = null;

  public EmbyWebGenericUIModelUIViewInfo viewId(String viewId) {
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

  public EmbyWebGenericUIModelUIViewInfo pageId(String pageId) {
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

  public EmbyWebGenericUIModelUIViewInfo caption(String caption) {
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

  public EmbyWebGenericUIModelUIViewInfo subCaption(String subCaption) {
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

  public EmbyWebGenericUIModelUIViewInfo pluginId(String pluginId) {
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

  public EmbyWebGenericUIModelUIViewInfo viewType(EmbyWebGenericUIModelEnumsUIViewType viewType) {
    this.viewType = viewType;
    return this;
  }

   /**
   * Get viewType
   * @return viewType
  **/
  @Schema(description = "")
  public EmbyWebGenericUIModelEnumsUIViewType getViewType() {
    return viewType;
  }

  public void setViewType(EmbyWebGenericUIModelEnumsUIViewType viewType) {
    this.viewType = viewType;
  }

  public EmbyWebGenericUIModelUIViewInfo showDialogFullScreen(Boolean showDialogFullScreen) {
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

  public EmbyWebGenericUIModelUIViewInfo isInSequence(Boolean isInSequence) {
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

  public EmbyWebGenericUIModelUIViewInfo redirectViewUrl(String redirectViewUrl) {
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

  public EmbyWebGenericUIModelUIViewInfo editObjectContainer(GenericEditIEditObjectContainer editObjectContainer) {
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

  public EmbyWebGenericUIModelUIViewInfo commands(List<EmbyWebGenericUIModelUICommand> commands) {
    this.commands = commands;
    return this;
  }

  public EmbyWebGenericUIModelUIViewInfo addCommandsItem(EmbyWebGenericUIModelUICommand commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<EmbyWebGenericUIModelUICommand>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Get commands
   * @return commands
  **/
  @Schema(description = "")
  public List<EmbyWebGenericUIModelUICommand> getCommands() {
    return commands;
  }

  public void setCommands(List<EmbyWebGenericUIModelUICommand> commands) {
    this.commands = commands;
  }

  public EmbyWebGenericUIModelUIViewInfo tabPageInfos(List<EmbyWebGenericUIModelUITabPageInfo> tabPageInfos) {
    this.tabPageInfos = tabPageInfos;
    return this;
  }

  public EmbyWebGenericUIModelUIViewInfo addTabPageInfosItem(EmbyWebGenericUIModelUITabPageInfo tabPageInfosItem) {
    if (this.tabPageInfos == null) {
      this.tabPageInfos = new ArrayList<EmbyWebGenericUIModelUITabPageInfo>();
    }
    this.tabPageInfos.add(tabPageInfosItem);
    return this;
  }

   /**
   * Get tabPageInfos
   * @return tabPageInfos
  **/
  @Schema(description = "")
  public List<EmbyWebGenericUIModelUITabPageInfo> getTabPageInfos() {
    return tabPageInfos;
  }

  public void setTabPageInfos(List<EmbyWebGenericUIModelUITabPageInfo> tabPageInfos) {
    this.tabPageInfos = tabPageInfos;
  }

  public EmbyWebGenericUIModelUIViewInfo isPageChangeInfo(Boolean isPageChangeInfo) {
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
    EmbyWebGenericUIModelUIViewInfo embyWebGenericUIModelUIViewInfo = (EmbyWebGenericUIModelUIViewInfo) o;
    return Objects.equals(this.viewId, embyWebGenericUIModelUIViewInfo.viewId) &&
        Objects.equals(this.pageId, embyWebGenericUIModelUIViewInfo.pageId) &&
        Objects.equals(this.caption, embyWebGenericUIModelUIViewInfo.caption) &&
        Objects.equals(this.subCaption, embyWebGenericUIModelUIViewInfo.subCaption) &&
        Objects.equals(this.pluginId, embyWebGenericUIModelUIViewInfo.pluginId) &&
        Objects.equals(this.viewType, embyWebGenericUIModelUIViewInfo.viewType) &&
        Objects.equals(this.showDialogFullScreen, embyWebGenericUIModelUIViewInfo.showDialogFullScreen) &&
        Objects.equals(this.isInSequence, embyWebGenericUIModelUIViewInfo.isInSequence) &&
        Objects.equals(this.redirectViewUrl, embyWebGenericUIModelUIViewInfo.redirectViewUrl) &&
        Objects.equals(this.editObjectContainer, embyWebGenericUIModelUIViewInfo.editObjectContainer) &&
        Objects.equals(this.commands, embyWebGenericUIModelUIViewInfo.commands) &&
        Objects.equals(this.tabPageInfos, embyWebGenericUIModelUIViewInfo.tabPageInfos) &&
        Objects.equals(this.isPageChangeInfo, embyWebGenericUIModelUIViewInfo.isPageChangeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewId, pageId, caption, subCaption, pluginId, viewType, showDialogFullScreen, isInSequence, redirectViewUrl, editObjectContainer, commands, tabPageInfos, isPageChangeInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebGenericUIModelUIViewInfo {\n");
    
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
