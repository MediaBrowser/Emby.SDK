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
 * MediaEncodingSettingsApiHwaCancelHwaNodeOptions
 */


public class MediaEncodingSettingsApiHwaCancelHwaNodeOptions {
  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("EditorType")
  private MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType = null;

  public MediaEncodingSettingsApiHwaCancelHwaNodeOptions nodeId(String nodeId) {
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

  public MediaEncodingSettingsApiHwaCancelHwaNodeOptions editorType(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType) {
    this.editorType = editorType;
    return this;
  }

   /**
   * Get editorType
   * @return editorType
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType getEditorType() {
    return editorType;
  }

  public void setEditorType(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType) {
    this.editorType = editorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsApiHwaCancelHwaNodeOptions mediaEncodingSettingsApiHwaCancelHwaNodeOptions = (MediaEncodingSettingsApiHwaCancelHwaNodeOptions) o;
    return Objects.equals(this.nodeId, mediaEncodingSettingsApiHwaCancelHwaNodeOptions.nodeId) &&
        Objects.equals(this.editorType, mediaEncodingSettingsApiHwaCancelHwaNodeOptions.editorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, editorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsApiHwaCancelHwaNodeOptions {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
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
