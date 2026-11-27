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
 * MediaEncodingSettingsApiHwaSelectHwaBasicDevice
 */


public class MediaEncodingSettingsApiHwaSelectHwaBasicDevice {
  @SerializedName("NodeId")
  private String nodeId = null;

  public MediaEncodingSettingsApiHwaSelectHwaBasicDevice nodeId(String nodeId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsApiHwaSelectHwaBasicDevice mediaEncodingSettingsApiHwaSelectHwaBasicDevice = (MediaEncodingSettingsApiHwaSelectHwaBasicDevice) o;
    return Objects.equals(this.nodeId, mediaEncodingSettingsApiHwaSelectHwaBasicDevice.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsApiHwaSelectHwaBasicDevice {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
