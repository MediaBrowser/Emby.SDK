/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.ElementsIconNames;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaEncodingSettingsHwaProjectionNodesUiNodeCommand
 */


public class MediaEncodingSettingsHwaProjectionNodesUiNodeCommand {
  @SerializedName("CommandType")
  private MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType = null;

  @SerializedName("Caption")
  private String caption = null;

  @SerializedName("Icon")
  private ElementsIconNames icon = null;

  @SerializedName("IsRemote")
  private Boolean isRemote = null;

  @SerializedName("CommandData")
  private String commandData = null;

  @SerializedName("OpensForm")
  private Boolean opensForm = null;

  @SerializedName("ConfirmationPrompt")
  private String confirmationPrompt = null;

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand commandType(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType) {
    this.commandType = commandType;
    return this;
  }

   /**
   * Get commandType
   * @return commandType
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType getCommandType() {
    return commandType;
  }

  public void setCommandType(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType) {
    this.commandType = commandType;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand caption(String caption) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand icon(ElementsIconNames icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @Schema(description = "")
  public ElementsIconNames getIcon() {
    return icon;
  }

  public void setIcon(ElementsIconNames icon) {
    this.icon = icon;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand isRemote(Boolean isRemote) {
    this.isRemote = isRemote;
    return this;
  }

   /**
   * Get isRemote
   * @return isRemote
  **/
  @Schema(description = "")
  public Boolean isIsRemote() {
    return isRemote;
  }

  public void setIsRemote(Boolean isRemote) {
    this.isRemote = isRemote;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand commandData(String commandData) {
    this.commandData = commandData;
    return this;
  }

   /**
   * Get commandData
   * @return commandData
  **/
  @Schema(description = "")
  public String getCommandData() {
    return commandData;
  }

  public void setCommandData(String commandData) {
    this.commandData = commandData;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand opensForm(Boolean opensForm) {
    this.opensForm = opensForm;
    return this;
  }

   /**
   * Get opensForm
   * @return opensForm
  **/
  @Schema(description = "")
  public Boolean isOpensForm() {
    return opensForm;
  }

  public void setOpensForm(Boolean opensForm) {
    this.opensForm = opensForm;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand confirmationPrompt(String confirmationPrompt) {
    this.confirmationPrompt = confirmationPrompt;
    return this;
  }

   /**
   * Get confirmationPrompt
   * @return confirmationPrompt
  **/
  @Schema(description = "")
  public String getConfirmationPrompt() {
    return confirmationPrompt;
  }

  public void setConfirmationPrompt(String confirmationPrompt) {
    this.confirmationPrompt = confirmationPrompt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsHwaProjectionNodesUiNodeCommand mediaEncodingSettingsHwaProjectionNodesUiNodeCommand = (MediaEncodingSettingsHwaProjectionNodesUiNodeCommand) o;
    return Objects.equals(this.commandType, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.commandType) &&
        Objects.equals(this.caption, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.caption) &&
        Objects.equals(this.icon, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.icon) &&
        Objects.equals(this.isRemote, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.isRemote) &&
        Objects.equals(this.commandData, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.commandData) &&
        Objects.equals(this.opensForm, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.opensForm) &&
        Objects.equals(this.confirmationPrompt, mediaEncodingSettingsHwaProjectionNodesUiNodeCommand.confirmationPrompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandType, caption, icon, isRemote, commandData, opensForm, confirmationPrompt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsHwaProjectionNodesUiNodeCommand {\n");
    
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    isRemote: ").append(toIndentedString(isRemote)).append("\n");
    sb.append("    commandData: ").append(toIndentedString(commandData)).append("\n");
    sb.append("    opensForm: ").append(toIndentedString(opensForm)).append("\n");
    sb.append("    confirmationPrompt: ").append(toIndentedString(confirmationPrompt)).append("\n");
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
