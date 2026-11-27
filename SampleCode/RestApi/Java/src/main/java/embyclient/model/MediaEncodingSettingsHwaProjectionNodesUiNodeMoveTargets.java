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
 * MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets
 */


public class MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets {
  @SerializedName("Up")
  private String up = null;

  @SerializedName("Down")
  private String down = null;

  @SerializedName("Left")
  private String left = null;

  @SerializedName("Right")
  private String right = null;

  @SerializedName("HasAny")
  private Boolean hasAny = null;

  public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets up(String up) {
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @Schema(description = "")
  public String getUp() {
    return up;
  }

  public void setUp(String up) {
    this.up = up;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets down(String down) {
    this.down = down;
    return this;
  }

   /**
   * Get down
   * @return down
  **/
  @Schema(description = "")
  public String getDown() {
    return down;
  }

  public void setDown(String down) {
    this.down = down;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets left(String left) {
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @Schema(description = "")
  public String getLeft() {
    return left;
  }

  public void setLeft(String left) {
    this.left = left;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets right(String right) {
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @Schema(description = "")
  public String getRight() {
    return right;
  }

  public void setRight(String right) {
    this.right = right;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets hasAny(Boolean hasAny) {
    this.hasAny = hasAny;
    return this;
  }

   /**
   * Get hasAny
   * @return hasAny
  **/
  @Schema(description = "")
  public Boolean isHasAny() {
    return hasAny;
  }

  public void setHasAny(Boolean hasAny) {
    this.hasAny = hasAny;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets mediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets = (MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets) o;
    return Objects.equals(this.up, mediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets.up) &&
        Objects.equals(this.down, mediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets.down) &&
        Objects.equals(this.left, mediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets.left) &&
        Objects.equals(this.right, mediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets.right) &&
        Objects.equals(this.hasAny, mediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets.hasAny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(up, down, left, right, hasAny);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets {\n");
    
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    hasAny: ").append(toIndentedString(hasAny)).append("\n");
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
