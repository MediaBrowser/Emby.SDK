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
import io.swagger.client.model.EnumsUICommandType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UICommand
 */


public class UICommand {
  @SerializedName("CommandType")
  private EnumsUICommandType commandType = null;

  @SerializedName("CommandId")
  private String commandId = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Caption")
  private String caption = null;

  @SerializedName("SetFocus")
  private Boolean setFocus = null;

  @SerializedName("ConfirmationPrompt")
  private String confirmationPrompt = null;

  public UICommand commandType(EnumsUICommandType commandType) {
    this.commandType = commandType;
    return this;
  }

   /**
   * Get commandType
   * @return commandType
  **/
  @Schema(description = "")
  public EnumsUICommandType getCommandType() {
    return commandType;
  }

  public void setCommandType(EnumsUICommandType commandType) {
    this.commandType = commandType;
  }

  public UICommand commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Get commandId
   * @return commandId
  **/
  @Schema(description = "")
  public String getCommandId() {
    return commandId;
  }

  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }

  public UICommand isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @Schema(description = "")
  public Boolean isIsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public UICommand isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public UICommand caption(String caption) {
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

  public UICommand setFocus(Boolean setFocus) {
    this.setFocus = setFocus;
    return this;
  }

   /**
   * Get setFocus
   * @return setFocus
  **/
  @Schema(description = "")
  public Boolean isSetFocus() {
    return setFocus;
  }

  public void setSetFocus(Boolean setFocus) {
    this.setFocus = setFocus;
  }

  public UICommand confirmationPrompt(String confirmationPrompt) {
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
    UICommand uiCommand = (UICommand) o;
    return Objects.equals(this.commandType, uiCommand.commandType) &&
        Objects.equals(this.commandId, uiCommand.commandId) &&
        Objects.equals(this.isVisible, uiCommand.isVisible) &&
        Objects.equals(this.isEnabled, uiCommand.isEnabled) &&
        Objects.equals(this.caption, uiCommand.caption) &&
        Objects.equals(this.setFocus, uiCommand.setFocus) &&
        Objects.equals(this.confirmationPrompt, uiCommand.confirmationPrompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandType, commandId, isVisible, isEnabled, caption, setFocus, confirmationPrompt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UICommand {\n");
    
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    setFocus: ").append(toIndentedString(setFocus)).append("\n");
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
