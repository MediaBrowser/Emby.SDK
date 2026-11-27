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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaEncodingSettingsHwaProjectionBasicModeOption
 */


public class MediaEncodingSettingsHwaProjectionBasicModeOption {
  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("Text")
  private String text = null;

  public MediaEncodingSettingsHwaProjectionBasicModeOption nodeId(String nodeId) {
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

  public MediaEncodingSettingsHwaProjectionBasicModeOption text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsHwaProjectionBasicModeOption mediaEncodingSettingsHwaProjectionBasicModeOption = (MediaEncodingSettingsHwaProjectionBasicModeOption) o;
    return Objects.equals(this.nodeId, mediaEncodingSettingsHwaProjectionBasicModeOption.nodeId) &&
        Objects.equals(this.text, mediaEncodingSettingsHwaProjectionBasicModeOption.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsHwaProjectionBasicModeOption {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
