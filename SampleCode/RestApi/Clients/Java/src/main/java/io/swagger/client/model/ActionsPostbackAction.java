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
 * ActionsPostbackAction
 */


public class ActionsPostbackAction {
  @SerializedName("TargetEditorId")
  private String targetEditorId = null;

  @SerializedName("PostbackCommandId")
  private String postbackCommandId = null;

  @SerializedName("CommandParameterPropertyId")
  private String commandParameterPropertyId = null;

  public ActionsPostbackAction targetEditorId(String targetEditorId) {
    this.targetEditorId = targetEditorId;
    return this;
  }

   /**
   * Get targetEditorId
   * @return targetEditorId
  **/
  @Schema(description = "")
  public String getTargetEditorId() {
    return targetEditorId;
  }

  public void setTargetEditorId(String targetEditorId) {
    this.targetEditorId = targetEditorId;
  }

  public ActionsPostbackAction postbackCommandId(String postbackCommandId) {
    this.postbackCommandId = postbackCommandId;
    return this;
  }

   /**
   * Get postbackCommandId
   * @return postbackCommandId
  **/
  @Schema(description = "")
  public String getPostbackCommandId() {
    return postbackCommandId;
  }

  public void setPostbackCommandId(String postbackCommandId) {
    this.postbackCommandId = postbackCommandId;
  }

  public ActionsPostbackAction commandParameterPropertyId(String commandParameterPropertyId) {
    this.commandParameterPropertyId = commandParameterPropertyId;
    return this;
  }

   /**
   * Get commandParameterPropertyId
   * @return commandParameterPropertyId
  **/
  @Schema(description = "")
  public String getCommandParameterPropertyId() {
    return commandParameterPropertyId;
  }

  public void setCommandParameterPropertyId(String commandParameterPropertyId) {
    this.commandParameterPropertyId = commandParameterPropertyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsPostbackAction actionsPostbackAction = (ActionsPostbackAction) o;
    return Objects.equals(this.targetEditorId, actionsPostbackAction.targetEditorId) &&
        Objects.equals(this.postbackCommandId, actionsPostbackAction.postbackCommandId) &&
        Objects.equals(this.commandParameterPropertyId, actionsPostbackAction.commandParameterPropertyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetEditorId, postbackCommandId, commandParameterPropertyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsPostbackAction {\n");
    
    sb.append("    targetEditorId: ").append(toIndentedString(targetEditorId)).append("\n");
    sb.append("    postbackCommandId: ").append(toIndentedString(postbackCommandId)).append("\n");
    sb.append("    commandParameterPropertyId: ").append(toIndentedString(commandParameterPropertyId)).append("\n");
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
