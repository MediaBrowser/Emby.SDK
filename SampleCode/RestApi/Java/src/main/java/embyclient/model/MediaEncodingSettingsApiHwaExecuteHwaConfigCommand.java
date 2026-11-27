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
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaEncodingSettingsApiHwaExecuteHwaConfigCommand
 */


public class MediaEncodingSettingsApiHwaExecuteHwaConfigCommand {
  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("CommandType")
  private MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType = null;

  @SerializedName("TargetId")
  private String targetId = null;

  @SerializedName("Data")
  private String data = null;

  public MediaEncodingSettingsApiHwaExecuteHwaConfigCommand nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public MediaEncodingSettingsApiHwaExecuteHwaConfigCommand commandType(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType) {
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

  public MediaEncodingSettingsApiHwaExecuteHwaConfigCommand targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  @Schema(description = "")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public MediaEncodingSettingsApiHwaExecuteHwaConfigCommand data(String data) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsApiHwaExecuteHwaConfigCommand mediaEncodingSettingsApiHwaExecuteHwaConfigCommand = (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand) o;
    return Objects.equals(this.nodeId, mediaEncodingSettingsApiHwaExecuteHwaConfigCommand.nodeId) &&
        Objects.equals(this.commandType, mediaEncodingSettingsApiHwaExecuteHwaConfigCommand.commandType) &&
        Objects.equals(this.targetId, mediaEncodingSettingsApiHwaExecuteHwaConfigCommand.targetId) &&
        Objects.equals(this.data, mediaEncodingSettingsApiHwaExecuteHwaConfigCommand.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, commandType, targetId, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsApiHwaExecuteHwaConfigCommand {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
