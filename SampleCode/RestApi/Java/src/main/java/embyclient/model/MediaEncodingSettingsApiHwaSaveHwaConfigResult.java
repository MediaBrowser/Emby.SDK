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
import embyclient.model.MediaEncodingSettingsHwaProjectionHwaConfigView;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaEncodingSettingsApiHwaSaveHwaConfigResult
 */


public class MediaEncodingSettingsApiHwaSaveHwaConfigResult {
  @SerializedName("WasSaved")
  private Boolean wasSaved = null;

  @SerializedName("GraphView")
  private MediaEncodingSettingsHwaProjectionHwaConfigView graphView = null;

  public MediaEncodingSettingsApiHwaSaveHwaConfigResult wasSaved(Boolean wasSaved) {
    this.wasSaved = wasSaved;
    return this;
  }

   /**
   * Get wasSaved
   * @return wasSaved
  **/
  @Schema(description = "")
  public Boolean isWasSaved() {
    return wasSaved;
  }

  public void setWasSaved(Boolean wasSaved) {
    this.wasSaved = wasSaved;
  }

  public MediaEncodingSettingsApiHwaSaveHwaConfigResult graphView(MediaEncodingSettingsHwaProjectionHwaConfigView graphView) {
    this.graphView = graphView;
    return this;
  }

   /**
   * Get graphView
   * @return graphView
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionHwaConfigView getGraphView() {
    return graphView;
  }

  public void setGraphView(MediaEncodingSettingsHwaProjectionHwaConfigView graphView) {
    this.graphView = graphView;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsApiHwaSaveHwaConfigResult mediaEncodingSettingsApiHwaSaveHwaConfigResult = (MediaEncodingSettingsApiHwaSaveHwaConfigResult) o;
    return Objects.equals(this.wasSaved, mediaEncodingSettingsApiHwaSaveHwaConfigResult.wasSaved) &&
        Objects.equals(this.graphView, mediaEncodingSettingsApiHwaSaveHwaConfigResult.graphView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wasSaved, graphView);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsApiHwaSaveHwaConfigResult {\n");
    
    sb.append("    wasSaved: ").append(toIndentedString(wasSaved)).append("\n");
    sb.append("    graphView: ").append(toIndentedString(graphView)).append("\n");
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
