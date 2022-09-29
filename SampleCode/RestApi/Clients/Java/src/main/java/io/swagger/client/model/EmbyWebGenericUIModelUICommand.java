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
import io.swagger.client.model.EmbyWebGenericUIModelEnumsUICommandType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyWebGenericUIModelUICommand
 */


public class EmbyWebGenericUIModelUICommand {
  @SerializedName("CommandType")
  private EmbyWebGenericUIModelEnumsUICommandType commandType = null;

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

  @SerializedName("ConfirmationMessage")
  private String confirmationMessage = null;

  public EmbyWebGenericUIModelUICommand commandType(EmbyWebGenericUIModelEnumsUICommandType commandType) {
    this.commandType = commandType;
    return this;
  }

   /**
   * Get commandType
   * @return commandType
  **/
  @Schema(description = "")
  public EmbyWebGenericUIModelEnumsUICommandType getCommandType() {
    return commandType;
  }

  public void setCommandType(EmbyWebGenericUIModelEnumsUICommandType commandType) {
    this.commandType = commandType;
  }

  public EmbyWebGenericUIModelUICommand commandId(String commandId) {
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

  public EmbyWebGenericUIModelUICommand isVisible(Boolean isVisible) {
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

  public EmbyWebGenericUIModelUICommand isEnabled(Boolean isEnabled) {
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

  public EmbyWebGenericUIModelUICommand caption(String caption) {
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

  public EmbyWebGenericUIModelUICommand setFocus(Boolean setFocus) {
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

  public EmbyWebGenericUIModelUICommand confirmationMessage(String confirmationMessage) {
    this.confirmationMessage = confirmationMessage;
    return this;
  }

   /**
   * Get confirmationMessage
   * @return confirmationMessage
  **/
  @Schema(description = "")
  public String getConfirmationMessage() {
    return confirmationMessage;
  }

  public void setConfirmationMessage(String confirmationMessage) {
    this.confirmationMessage = confirmationMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyWebGenericUIModelUICommand embyWebGenericUIModelUICommand = (EmbyWebGenericUIModelUICommand) o;
    return Objects.equals(this.commandType, embyWebGenericUIModelUICommand.commandType) &&
        Objects.equals(this.commandId, embyWebGenericUIModelUICommand.commandId) &&
        Objects.equals(this.isVisible, embyWebGenericUIModelUICommand.isVisible) &&
        Objects.equals(this.isEnabled, embyWebGenericUIModelUICommand.isEnabled) &&
        Objects.equals(this.caption, embyWebGenericUIModelUICommand.caption) &&
        Objects.equals(this.setFocus, embyWebGenericUIModelUICommand.setFocus) &&
        Objects.equals(this.confirmationMessage, embyWebGenericUIModelUICommand.confirmationMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandType, commandId, isVisible, isEnabled, caption, setFocus, confirmationMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebGenericUIModelUICommand {\n");
    
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    setFocus: ").append(toIndentedString(setFocus)).append("\n");
    sb.append("    confirmationMessage: ").append(toIndentedString(confirmationMessage)).append("\n");
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
