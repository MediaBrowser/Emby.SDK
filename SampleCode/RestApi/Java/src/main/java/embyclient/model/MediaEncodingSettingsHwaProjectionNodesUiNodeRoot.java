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
import embyclient.model.MediaEncodingHwaConditionsConfigAdvancedConditions;
import embyclient.model.MediaEncodingHwaConditionsConfigOperationConditions;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeState;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeType;
import embyclient.model.MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase;
import embyclient.model.MediaEncodingSettingsHwaProjectionNodesUiNodeCommand;
import embyclient.model.MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MediaEncodingSettingsHwaProjectionNodesUiNodeRoot
 */


public class MediaEncodingSettingsHwaProjectionNodesUiNodeRoot {
  @SerializedName("NodeType")
  private MediaEncodingSettingsHwaProjectionEnumsUiNodeType nodeType = null;

  @SerializedName("Direction")
  private MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection direction = null;

  @SerializedName("Nodes")
  private List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase> nodes = null;

  @SerializedName("OperationConditions")
  private MediaEncodingHwaConditionsConfigOperationConditions operationConditions = null;

  @SerializedName("AdvancedConditions")
  private MediaEncodingHwaConditionsConfigAdvancedConditions advancedConditions = null;

  @SerializedName("ConditionsSummary")
  private String conditionsSummary = null;

  @SerializedName("Id")
  private String id = null;

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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot nodeType(MediaEncodingSettingsHwaProjectionEnumsUiNodeType nodeType) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot direction(MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")
  public MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection getDirection() {
    return direction;
  }

  public void setDirection(MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection direction) {
    this.direction = direction;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot nodes(List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase> nodes) {
    this.nodes = nodes;
    return this;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot addNodesItem(MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Schema(description = "")
  public List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase> getNodes() {
    return nodes;
  }

  public void setNodes(List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase> nodes) {
    this.nodes = nodes;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot operationConditions(MediaEncodingHwaConditionsConfigOperationConditions operationConditions) {
    this.operationConditions = operationConditions;
    return this;
  }

   /**
   * Get operationConditions
   * @return operationConditions
  **/
  @Schema(description = "")
  public MediaEncodingHwaConditionsConfigOperationConditions getOperationConditions() {
    return operationConditions;
  }

  public void setOperationConditions(MediaEncodingHwaConditionsConfigOperationConditions operationConditions) {
    this.operationConditions = operationConditions;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot advancedConditions(MediaEncodingHwaConditionsConfigAdvancedConditions advancedConditions) {
    this.advancedConditions = advancedConditions;
    return this;
  }

   /**
   * Get advancedConditions
   * @return advancedConditions
  **/
  @Schema(description = "")
  public MediaEncodingHwaConditionsConfigAdvancedConditions getAdvancedConditions() {
    return advancedConditions;
  }

  public void setAdvancedConditions(MediaEncodingHwaConditionsConfigAdvancedConditions advancedConditions) {
    this.advancedConditions = advancedConditions;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot conditionsSummary(String conditionsSummary) {
    this.conditionsSummary = conditionsSummary;
    return this;
  }

   /**
   * Get conditionsSummary
   * @return conditionsSummary
  **/
  @Schema(description = "")
  public String getConditionsSummary() {
    return conditionsSummary;
  }

  public void setConditionsSummary(String conditionsSummary) {
    this.conditionsSummary = conditionsSummary;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot id(String id) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot displayId(String displayId) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot primaryText(String primaryText) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot secondaryText(String secondaryText) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot icon(ElementsIconNames icon) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot state(MediaEncodingSettingsHwaProjectionEnumsUiNodeState state) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot isFocusable(Boolean isFocusable) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot stateReason(String stateReason) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot canMove(MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets canMove) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot insertAt(String insertAt) {
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

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot commands(List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> commands) {
    this.commands = commands;
    return this;
  }

  public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot addCommandsItem(MediaEncodingSettingsHwaProjectionNodesUiNodeCommand commandsItem) {
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
    MediaEncodingSettingsHwaProjectionNodesUiNodeRoot mediaEncodingSettingsHwaProjectionNodesUiNodeRoot = (MediaEncodingSettingsHwaProjectionNodesUiNodeRoot) o;
    return Objects.equals(this.nodeType, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.nodeType) &&
        Objects.equals(this.direction, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.direction) &&
        Objects.equals(this.nodes, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.nodes) &&
        Objects.equals(this.operationConditions, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.operationConditions) &&
        Objects.equals(this.advancedConditions, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.advancedConditions) &&
        Objects.equals(this.conditionsSummary, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.conditionsSummary) &&
        Objects.equals(this.id, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.id) &&
        Objects.equals(this.displayId, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.displayId) &&
        Objects.equals(this.primaryText, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.primaryText) &&
        Objects.equals(this.secondaryText, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.secondaryText) &&
        Objects.equals(this.icon, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.icon) &&
        Objects.equals(this.state, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.state) &&
        Objects.equals(this.isFocusable, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.isFocusable) &&
        Objects.equals(this.stateReason, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.stateReason) &&
        Objects.equals(this.canMove, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.canMove) &&
        Objects.equals(this.insertAt, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.insertAt) &&
        Objects.equals(this.commands, mediaEncodingSettingsHwaProjectionNodesUiNodeRoot.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, direction, nodes, operationConditions, advancedConditions, conditionsSummary, id, displayId, primaryText, secondaryText, icon, state, isFocusable, stateReason, canMove, insertAt, commands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingSettingsHwaProjectionNodesUiNodeRoot {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    operationConditions: ").append(toIndentedString(operationConditions)).append("\n");
    sb.append("    advancedConditions: ").append(toIndentedString(advancedConditions)).append("\n");
    sb.append("    conditionsSummary: ").append(toIndentedString(conditionsSummary)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
