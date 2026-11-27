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
import embyclient.model.ElementsIconNames;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeState;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeType;
import embyclient.model.MediaEncodingSettingsHwaProjectionNodesUiNodeCommand;
import embyclient.model.MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase
 */


public class MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("NodeType")
  private MediaEncodingSettingsHwaProjectionEnumsUiNodeType nodeType = null;

  @SerializedName("DisplayId")
  private String displayId = null;

  @SerializedName("PrimaryText")
  private String primaryText = null;

  @SerializedName("SecondaryText")
  private String secondaryText = null;

  @SerializedName("Icon")
  private ElementsIconNames icon = null;

  @SerializedName("State")
  private MediaEncodingSettingsHwaProjectionEnumsUiNodeState state = null;

  @SerializedName("IsFocusable")
  private Boolean isFocusable = null;

  @SerializedName("StateReason")
  private String stateReason = null;

  @SerializedName("CanMove")
  private MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets canMove = null;

  @SerializedName("InsertAt")
  private String insertAt = null;

  @SerializedName("Commands")
  private List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> commands = null;

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase nodeType(MediaEncodingSettingsHwaProjectionEnumsUiNodeType nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionEnumsUiNodeType getNodeType() {
    return nodeType;
  }

  public void setNodeType(MediaEncodingSettingsHwaProjectionEnumsUiNodeType nodeType) {
    this.nodeType = nodeType;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase displayId(String displayId) {
    this.displayId = displayId;
    return this;
  }

   /**
   * Get displayId
   * @return displayId
  **/
  @Schema(description = "")
  public String getDisplayId() {
    return displayId;
  }

  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase primaryText(String primaryText) {
    this.primaryText = primaryText;
    return this;
  }

   /**
   * Get primaryText
   * @return primaryText
  **/
  @Schema(description = "")
  public String getPrimaryText() {
    return primaryText;
  }

  public void setPrimaryText(String primaryText) {
    this.primaryText = primaryText;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase secondaryText(String secondaryText) {
    this.secondaryText = secondaryText;
    return this;
  }

   /**
   * Get secondaryText
   * @return secondaryText
  **/
  @Schema(description = "")
  public String getSecondaryText() {
    return secondaryText;
  }

  public void setSecondaryText(String secondaryText) {
    this.secondaryText = secondaryText;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase icon(ElementsIconNames icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @Schema(description = "")
  public ElementsIconNames getIcon() {
    return icon;
  }

  public void setIcon(ElementsIconNames icon) {
    this.icon = icon;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase state(MediaEncodingSettingsHwaProjectionEnumsUiNodeState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionEnumsUiNodeState getState() {
    return state;
  }

  public void setState(MediaEncodingSettingsHwaProjectionEnumsUiNodeState state) {
    this.state = state;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase isFocusable(Boolean isFocusable) {
    this.isFocusable = isFocusable;
    return this;
  }

   /**
   * Get isFocusable
   * @return isFocusable
  **/
  @Schema(description = "")
  public Boolean isIsFocusable() {
    return isFocusable;
  }

  public void setIsFocusable(Boolean isFocusable) {
    this.isFocusable = isFocusable;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase stateReason(String stateReason) {
    this.stateReason = stateReason;
    return this;
  }

   /**
   * Get stateReason
   * @return stateReason
  **/
  @Schema(description = "")
  public String getStateReason() {
    return stateReason;
  }

  public void setStateReason(String stateReason) {
    this.stateReason = stateReason;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase canMove(MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets canMove) {
    this.canMove = canMove;
    return this;
  }

   /**
   * Get canMove
   * @return canMove
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets getCanMove() {
    return canMove;
  }

  public void setCanMove(MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets canMove) {
    this.canMove = canMove;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase insertAt(String insertAt) {
    this.insertAt = insertAt;
    return this;
  }

   /**
   * Get insertAt
   * @return insertAt
  **/
  @Schema(description = "")
  public String getInsertAt() {
    return insertAt;
  }

  public void setInsertAt(String insertAt) {
    this.insertAt = insertAt;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase commands(List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> commands) {
    this.commands = commands;
    return this;
  }

  public MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase addCommandsItem(MediaEncodingSettingsHwaProjectionNodesUiNodeCommand commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Get commands
   * @return commands
  **/
  @Schema(description = "")
  public List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> getCommands() {
    return commands;
  }

  public void setCommands(List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> commands) {
    this.commands = commands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase = (MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase) o;
    return Objects.equals(this.id, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.id) &&
        Objects.equals(this.nodeType, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.nodeType) &&
        Objects.equals(this.displayId, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.displayId) &&
        Objects.equals(this.primaryText, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.primaryText) &&
        Objects.equals(this.secondaryText, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.secondaryText) &&
        Objects.equals(this.icon, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.icon) &&
        Objects.equals(this.state, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.state) &&
        Objects.equals(this.isFocusable, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.isFocusable) &&
        Objects.equals(this.stateReason, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.stateReason) &&
        Objects.equals(this.canMove, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.canMove) &&
        Objects.equals(this.insertAt, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.insertAt) &&
        Objects.equals(this.commands, mediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeType, displayId, primaryText, secondaryText, icon, state, isFocusable, stateReason, canMove, insertAt, commands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    primaryText: ").append(toIndentedString(primaryText)).append("\n");
    sb.append("    secondaryText: ").append(toIndentedString(secondaryText)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    isFocusable: ").append(toIndentedString(isFocusable)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
    sb.append("    canMove: ").append(toIndentedString(canMove)).append("\n");
    sb.append("    insertAt: ").append(toIndentedString(insertAt)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
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
