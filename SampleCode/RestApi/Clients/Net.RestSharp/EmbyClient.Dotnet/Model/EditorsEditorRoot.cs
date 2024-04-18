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
    /// EditorsEditorRoot
    /// </summary>
    [DataContract]
        public partial class EditorsEditorRoot :  IEquatable<EditorsEditorRoot>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EditorsEditorRoot" /> class.
        /// </summary>
        /// <param name="propertyConditions">propertyConditions.</param>
        /// <param name="postbackActions">postbackActions.</param>
        /// <param name="titleButton">titleButton.</param>
        /// <param name="editorItems">editorItems.</param>
        /// <param name="editorType">editorType.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="allowEmpty">allowEmpty.</param>
        /// <param name="isReadOnly">isReadOnly.</param>
        /// <param name="isAdvanced">isAdvanced.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="description">description.</param>
        /// <param name="featureRequiresPremiere">featureRequiresPremiere.</param>
        /// <param name="parentId">parentId.</param>
        public EditorsEditorRoot(List<ConditionsPropertyCondition> propertyConditions = default(List<ConditionsPropertyCondition>), List<ActionsPostbackAction> postbackActions = default(List<ActionsPostbackAction>), EditorsEditorButtonItem titleButton = default(EditorsEditorButtonItem), List<EditorsEditorBase> editorItems = default(List<EditorsEditorBase>), CommonEditorTypes editorType = default(CommonEditorTypes), string name = default(string), string id = default(string), bool? allowEmpty = default(bool?), bool? isReadOnly = default(bool?), bool? isAdvanced = default(bool?), string displayName = default(string), string description = default(string), bool? featureRequiresPremiere = default(bool?), string parentId = default(string))
        {
            this.PropertyConditions = propertyConditions;
            this.PostbackActions = postbackActions;
            this.TitleButton = titleButton;
            this.EditorItems = editorItems;
            this.EditorType = editorType;
            this.Name = name;
            this.Id = id;
            this.AllowEmpty = allowEmpty;
            this.IsReadOnly = isReadOnly;
            this.IsAdvanced = isAdvanced;
            this.DisplayName = displayName;
            this.Description = description;
            this.FeatureRequiresPremiere = featureRequiresPremiere;
            this.ParentId = parentId;
        }
        
        /// <summary>
        /// Gets or Sets PropertyConditions
        /// </summary>
        [DataMember(Name="PropertyConditions", EmitDefaultValue=false)]
        public List<ConditionsPropertyCondition> PropertyConditions { get; set; }

        /// <summary>
        /// Gets or Sets PostbackActions
        /// </summary>
        [DataMember(Name="PostbackActions", EmitDefaultValue=false)]
        public List<ActionsPostbackAction> PostbackActions { get; set; }

        /// <summary>
        /// Gets or Sets TitleButton
        /// </summary>
        [DataMember(Name="TitleButton", EmitDefaultValue=false)]
        public EditorsEditorButtonItem TitleButton { get; set; }

        /// <summary>
        /// Gets or Sets EditorItems
        /// </summary>
        [DataMember(Name="EditorItems", EmitDefaultValue=false)]
        public List<EditorsEditorBase> EditorItems { get; set; }

        /// <summary>
        /// Gets or Sets EditorType
        /// </summary>
        [DataMember(Name="EditorType", EmitDefaultValue=false)]
        public CommonEditorTypes EditorType { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets AllowEmpty
        /// </summary>
        [DataMember(Name="AllowEmpty", EmitDefaultValue=false)]
        public bool? AllowEmpty { get; set; }

        /// <summary>
        /// Gets or Sets IsReadOnly
        /// </summary>
        [DataMember(Name="IsReadOnly", EmitDefaultValue=false)]
        public bool? IsReadOnly { get; set; }

        /// <summary>
        /// Gets or Sets IsAdvanced
        /// </summary>
        [DataMember(Name="IsAdvanced", EmitDefaultValue=false)]
        public bool? IsAdvanced { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name="DisplayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets FeatureRequiresPremiere
        /// </summary>
        [DataMember(Name="FeatureRequiresPremiere", EmitDefaultValue=false)]
        public bool? FeatureRequiresPremiere { get; set; }

        /// <summary>
        /// Gets or Sets ParentId
        /// </summary>
        [DataMember(Name="ParentId", EmitDefaultValue=false)]
        public string ParentId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EditorsEditorRoot {\n");
            sb.Append("  PropertyConditions: ").Append(PropertyConditions).Append("\n");
            sb.Append("  PostbackActions: ").Append(PostbackActions).Append("\n");
            sb.Append("  TitleButton: ").Append(TitleButton).Append("\n");
            sb.Append("  EditorItems: ").Append(EditorItems).Append("\n");
            sb.Append("  EditorType: ").Append(EditorType).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  AllowEmpty: ").Append(AllowEmpty).Append("\n");
            sb.Append("  IsReadOnly: ").Append(IsReadOnly).Append("\n");
            sb.Append("  IsAdvanced: ").Append(IsAdvanced).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  FeatureRequiresPremiere: ").Append(FeatureRequiresPremiere).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
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
            return this.Equals(input as EditorsEditorRoot);
        }

        /// <summary>
        /// Returns true if EditorsEditorRoot instances are equal
        /// </summary>
        /// <param name="input">Instance of EditorsEditorRoot to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EditorsEditorRoot input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PropertyConditions == input.PropertyConditions ||
                    this.PropertyConditions != null &&
                    input.PropertyConditions != null &&
                    this.PropertyConditions.SequenceEqual(input.PropertyConditions)
                ) && 
                (
                    this.PostbackActions == input.PostbackActions ||
                    this.PostbackActions != null &&
                    input.PostbackActions != null &&
                    this.PostbackActions.SequenceEqual(input.PostbackActions)
                ) && 
                (
                    this.TitleButton == input.TitleButton ||
                    (this.TitleButton != null &&
                    this.TitleButton.Equals(input.TitleButton))
                ) && 
                (
                    this.EditorItems == input.EditorItems ||
                    this.EditorItems != null &&
                    input.EditorItems != null &&
                    this.EditorItems.SequenceEqual(input.EditorItems)
                ) && 
                (
                    this.EditorType == input.EditorType ||
                    (this.EditorType != null &&
                    this.EditorType.Equals(input.EditorType))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.AllowEmpty == input.AllowEmpty ||
                    (this.AllowEmpty != null &&
                    this.AllowEmpty.Equals(input.AllowEmpty))
                ) && 
                (
                    this.IsReadOnly == input.IsReadOnly ||
                    (this.IsReadOnly != null &&
                    this.IsReadOnly.Equals(input.IsReadOnly))
                ) && 
                (
                    this.IsAdvanced == input.IsAdvanced ||
                    (this.IsAdvanced != null &&
                    this.IsAdvanced.Equals(input.IsAdvanced))
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.FeatureRequiresPremiere == input.FeatureRequiresPremiere ||
                    (this.FeatureRequiresPremiere != null &&
                    this.FeatureRequiresPremiere.Equals(input.FeatureRequiresPremiere))
                ) && 
                (
                    this.ParentId == input.ParentId ||
                    (this.ParentId != null &&
                    this.ParentId.Equals(input.ParentId))
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
                if (this.PropertyConditions != null)
                    hashCode = hashCode * 59 + this.PropertyConditions.GetHashCode();
                if (this.PostbackActions != null)
                    hashCode = hashCode * 59 + this.PostbackActions.GetHashCode();
                if (this.TitleButton != null)
                    hashCode = hashCode * 59 + this.TitleButton.GetHashCode();
                if (this.EditorItems != null)
                    hashCode = hashCode * 59 + this.EditorItems.GetHashCode();
                if (this.EditorType != null)
                    hashCode = hashCode * 59 + this.EditorType.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.AllowEmpty != null)
                    hashCode = hashCode * 59 + this.AllowEmpty.GetHashCode();
                if (this.IsReadOnly != null)
                    hashCode = hashCode * 59 + this.IsReadOnly.GetHashCode();
                if (this.IsAdvanced != null)
                    hashCode = hashCode * 59 + this.IsAdvanced.GetHashCode();
                if (this.DisplayName != null)
                    hashCode = hashCode * 59 + this.DisplayName.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.FeatureRequiresPremiere != null)
                    hashCode = hashCode * 59 + this.FeatureRequiresPremiere.GetHashCode();
                if (this.ParentId != null)
                    hashCode = hashCode * 59 + this.ParentId.GetHashCode();
                return hashCode;
            }
        }

    }
}
