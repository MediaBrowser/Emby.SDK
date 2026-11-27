/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// MediaEncodingSettingsHwaProjectionNodesUiNodeRoot
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsHwaProjectionNodesUiNodeRoot :  IEquatable<MediaEncodingSettingsHwaProjectionNodesUiNodeRoot>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsHwaProjectionNodesUiNodeRoot" /> class.
        /// </summary>
        /// <param name="nodeType">nodeType.</param>
        /// <param name="direction">direction.</param>
        /// <param name="nodes">nodes.</param>
        /// <param name="operationConditions">operationConditions.</param>
        /// <param name="advancedConditions">advancedConditions.</param>
        /// <param name="conditionsSummary">conditionsSummary.</param>
        /// <param name="id">id.</param>
        /// <param name="displayId">displayId.</param>
        /// <param name="primaryText">primaryText.</param>
        /// <param name="secondaryText">secondaryText.</param>
        /// <param name="icon">icon.</param>
        /// <param name="state">state.</param>
        /// <param name="isFocusable">isFocusable.</param>
        /// <param name="stateReason">stateReason.</param>
        /// <param name="canMove">canMove.</param>
        /// <param name="insertAt">insertAt.</param>
        /// <param name="commands">commands.</param>
        public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot(MediaEncodingSettingsHwaProjectionEnumsUiNodeType nodeType = default(MediaEncodingSettingsHwaProjectionEnumsUiNodeType), MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection direction = default(MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection), List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase> nodes = default(List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase>), MediaEncodingHwaConditionsConfigOperationConditions operationConditions = default(MediaEncodingHwaConditionsConfigOperationConditions), MediaEncodingHwaConditionsConfigAdvancedConditions advancedConditions = default(MediaEncodingHwaConditionsConfigAdvancedConditions), string conditionsSummary = default(string), string id = default(string), string displayId = default(string), string primaryText = default(string), string secondaryText = default(string), ElementsIconNames icon = default(ElementsIconNames), MediaEncodingSettingsHwaProjectionEnumsUiNodeState state = default(MediaEncodingSettingsHwaProjectionEnumsUiNodeState), bool? isFocusable = default(bool?), string stateReason = default(string), MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets canMove = default(MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets), string insertAt = default(string), List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> commands = default(List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand>))
        {
            this.NodeType = nodeType;
            this.Direction = direction;
            this.Nodes = nodes;
            this.OperationConditions = operationConditions;
            this.AdvancedConditions = advancedConditions;
            this.ConditionsSummary = conditionsSummary;
            this.Id = id;
            this.DisplayId = displayId;
            this.PrimaryText = primaryText;
            this.SecondaryText = secondaryText;
            this.Icon = icon;
            this.State = state;
            this.IsFocusable = isFocusable;
            this.StateReason = stateReason;
            this.CanMove = canMove;
            this.InsertAt = insertAt;
            this.Commands = commands;
        }
        
        /// <summary>
        /// Gets or Sets NodeType
        /// </summary>
        [DataMember(Name="NodeType", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionEnumsUiNodeType NodeType { get; set; }

        /// <summary>
        /// Gets or Sets Direction
        /// </summary>
        [DataMember(Name="Direction", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection Direction { get; set; }

        /// <summary>
        /// Gets or Sets Nodes
        /// </summary>
        [DataMember(Name="Nodes", EmitDefaultValue=false)]
        public List<MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase> Nodes { get; set; }

        /// <summary>
        /// Gets or Sets OperationConditions
        /// </summary>
        [DataMember(Name="OperationConditions", EmitDefaultValue=false)]
        public MediaEncodingHwaConditionsConfigOperationConditions OperationConditions { get; set; }

        /// <summary>
        /// Gets or Sets AdvancedConditions
        /// </summary>
        [DataMember(Name="AdvancedConditions", EmitDefaultValue=false)]
        public MediaEncodingHwaConditionsConfigAdvancedConditions AdvancedConditions { get; set; }

        /// <summary>
        /// Gets or Sets ConditionsSummary
        /// </summary>
        [DataMember(Name="ConditionsSummary", EmitDefaultValue=false)]
        public string ConditionsSummary { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets DisplayId
        /// </summary>
        [DataMember(Name="DisplayId", EmitDefaultValue=false)]
        public string DisplayId { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryText
        /// </summary>
        [DataMember(Name="PrimaryText", EmitDefaultValue=false)]
        public string PrimaryText { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryText
        /// </summary>
        [DataMember(Name="SecondaryText", EmitDefaultValue=false)]
        public string SecondaryText { get; set; }

        /// <summary>
        /// Gets or Sets Icon
        /// </summary>
        [DataMember(Name="Icon", EmitDefaultValue=false)]
        public ElementsIconNames Icon { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="State", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionEnumsUiNodeState State { get; set; }

        /// <summary>
        /// Gets or Sets IsFocusable
        /// </summary>
        [DataMember(Name="IsFocusable", EmitDefaultValue=false)]
        public bool? IsFocusable { get; set; }

        /// <summary>
        /// Gets or Sets StateReason
        /// </summary>
        [DataMember(Name="StateReason", EmitDefaultValue=false)]
        public string StateReason { get; set; }

        /// <summary>
        /// Gets or Sets CanMove
        /// </summary>
        [DataMember(Name="CanMove", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets CanMove { get; set; }

        /// <summary>
        /// Gets or Sets InsertAt
        /// </summary>
        [DataMember(Name="InsertAt", EmitDefaultValue=false)]
        public string InsertAt { get; set; }

        /// <summary>
        /// Gets or Sets Commands
        /// </summary>
        [DataMember(Name="Commands", EmitDefaultValue=false)]
        public List<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand> Commands { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsHwaProjectionNodesUiNodeRoot {\n");
            sb.Append("  NodeType: ").Append(NodeType).Append("\n");
            sb.Append("  Direction: ").Append(Direction).Append("\n");
            sb.Append("  Nodes: ").Append(Nodes).Append("\n");
            sb.Append("  OperationConditions: ").Append(OperationConditions).Append("\n");
            sb.Append("  AdvancedConditions: ").Append(AdvancedConditions).Append("\n");
            sb.Append("  ConditionsSummary: ").Append(ConditionsSummary).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  DisplayId: ").Append(DisplayId).Append("\n");
            sb.Append("  PrimaryText: ").Append(PrimaryText).Append("\n");
            sb.Append("  SecondaryText: ").Append(SecondaryText).Append("\n");
            sb.Append("  Icon: ").Append(Icon).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  IsFocusable: ").Append(IsFocusable).Append("\n");
            sb.Append("  StateReason: ").Append(StateReason).Append("\n");
            sb.Append("  CanMove: ").Append(CanMove).Append("\n");
            sb.Append("  InsertAt: ").Append(InsertAt).Append("\n");
            sb.Append("  Commands: ").Append(Commands).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as MediaEncodingSettingsHwaProjectionNodesUiNodeRoot);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsHwaProjectionNodesUiNodeRoot instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsHwaProjectionNodesUiNodeRoot to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsHwaProjectionNodesUiNodeRoot input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NodeType == input.NodeType ||
                    (this.NodeType != null &&
                    this.NodeType.Equals(input.NodeType))
                ) && 
                (
                    this.Direction == input.Direction ||
                    (this.Direction != null &&
                    this.Direction.Equals(input.Direction))
                ) && 
                (
                    this.Nodes == input.Nodes ||
                    this.Nodes != null &&
                    input.Nodes != null &&
                    this.Nodes.SequenceEqual(input.Nodes)
                ) && 
                (
                    this.OperationConditions == input.OperationConditions ||
                    (this.OperationConditions != null &&
                    this.OperationConditions.Equals(input.OperationConditions))
                ) && 
                (
                    this.AdvancedConditions == input.AdvancedConditions ||
                    (this.AdvancedConditions != null &&
                    this.AdvancedConditions.Equals(input.AdvancedConditions))
                ) && 
                (
                    this.ConditionsSummary == input.ConditionsSummary ||
                    (this.ConditionsSummary != null &&
                    this.ConditionsSummary.Equals(input.ConditionsSummary))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.DisplayId == input.DisplayId ||
                    (this.DisplayId != null &&
                    this.DisplayId.Equals(input.DisplayId))
                ) && 
                (
                    this.PrimaryText == input.PrimaryText ||
                    (this.PrimaryText != null &&
                    this.PrimaryText.Equals(input.PrimaryText))
                ) && 
                (
                    this.SecondaryText == input.SecondaryText ||
                    (this.SecondaryText != null &&
                    this.SecondaryText.Equals(input.SecondaryText))
                ) && 
                (
                    this.Icon == input.Icon ||
                    (this.Icon != null &&
                    this.Icon.Equals(input.Icon))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.IsFocusable == input.IsFocusable ||
                    (this.IsFocusable != null &&
                    this.IsFocusable.Equals(input.IsFocusable))
                ) && 
                (
                    this.StateReason == input.StateReason ||
                    (this.StateReason != null &&
                    this.StateReason.Equals(input.StateReason))
                ) && 
                (
                    this.CanMove == input.CanMove ||
                    (this.CanMove != null &&
                    this.CanMove.Equals(input.CanMove))
                ) && 
                (
                    this.InsertAt == input.InsertAt ||
                    (this.InsertAt != null &&
                    this.InsertAt.Equals(input.InsertAt))
                ) && 
                (
                    this.Commands == input.Commands ||
                    this.Commands != null &&
                    input.Commands != null &&
                    this.Commands.SequenceEqual(input.Commands)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.NodeType != null)
                    hashCode = hashCode * 59 + this.NodeType.GetHashCode();
                if (this.Direction != null)
                    hashCode = hashCode * 59 + this.Direction.GetHashCode();
                if (this.Nodes != null)
                    hashCode = hashCode * 59 + this.Nodes.GetHashCode();
                if (this.OperationConditions != null)
                    hashCode = hashCode * 59 + this.OperationConditions.GetHashCode();
                if (this.AdvancedConditions != null)
                    hashCode = hashCode * 59 + this.AdvancedConditions.GetHashCode();
                if (this.ConditionsSummary != null)
                    hashCode = hashCode * 59 + this.ConditionsSummary.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.DisplayId != null)
                    hashCode = hashCode * 59 + this.DisplayId.GetHashCode();
                if (this.PrimaryText != null)
                    hashCode = hashCode * 59 + this.PrimaryText.GetHashCode();
                if (this.SecondaryText != null)
                    hashCode = hashCode * 59 + this.SecondaryText.GetHashCode();
                if (this.Icon != null)
                    hashCode = hashCode * 59 + this.Icon.GetHashCode();
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
                if (this.IsFocusable != null)
                    hashCode = hashCode * 59 + this.IsFocusable.GetHashCode();
                if (this.StateReason != null)
                    hashCode = hashCode * 59 + this.StateReason.GetHashCode();
                if (this.CanMove != null)
                    hashCode = hashCode * 59 + this.CanMove.GetHashCode();
                if (this.InsertAt != null)
                    hashCode = hashCode * 59 + this.InsertAt.GetHashCode();
                if (this.Commands != null)
                    hashCode = hashCode * 59 + this.Commands.GetHashCode();
                return hashCode;
            }
        }

    }
}
