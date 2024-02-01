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
 * RunUICommand
 */


public class RunUICommand {
  @SerializedName("PageId")
  private String pageId = null;

  @SerializedName("CommandId")
  private String commandId = null;

  @SerializedName("Data")
  private String data = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("ClientLocale")
  private String clientLocale = null;

  public RunUICommand pageId(String pageId) {
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

  public RunUICommand commandId(String commandId) {
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

  public RunUICommand data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public RunUICommand itemId(String itemId) {
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

  public RunUICommand clientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @Schema(description = "")
  public String getClientLocale() {
    return clientLocale;
  }

  public void setClientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunUICommand runUICommand = (RunUICommand) o;
    return Objects.equals(this.pageId, runUICommand.pageId) &&
        Objects.equals(this.commandId, runUICommand.commandId) &&
        Objects.equals(this.data, runUICommand.data) &&
        Objects.equals(this.itemId, runUICommand.itemId) &&
        Objects.equals(this.clientLocale, runUICommand.clientLocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, commandId, data, itemId, clientLocale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunUICommand {\n");
    
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
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
