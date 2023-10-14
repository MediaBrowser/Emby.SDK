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
    /// ActionsPostbackAction
    /// </summary>
    [DataContract]
        public partial class ActionsPostbackAction :  IEquatable<ActionsPostbackAction>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ActionsPostbackAction" /> class.
        /// </summary>
        /// <param name="targetEditorId">targetEditorId.</param>
        /// <param name="postbackCommandId">postbackCommandId.</param>
        /// <param name="commandParameterPropertyId">commandParameterPropertyId.</param>
        public ActionsPostbackAction(string targetEditorId = default(string), string postbackCommandId = default(string), string commandParameterPropertyId = default(string))
        {
            this.TargetEditorId = targetEditorId;
            this.PostbackCommandId = postbackCommandId;
            this.CommandParameterPropertyId = commandParameterPropertyId;
        }
        
        /// <summary>
        /// Gets or Sets TargetEditorId
        /// </summary>
        [DataMember(Name="TargetEditorId", EmitDefaultValue=false)]
        public string TargetEditorId { get; set; }

        /// <summary>
        /// Gets or Sets PostbackCommandId
        /// </summary>
        [DataMember(Name="PostbackCommandId", EmitDefaultValue=false)]
        public string PostbackCommandId { get; set; }

        /// <summary>
        /// Gets or Sets CommandParameterPropertyId
        /// </summary>
        [DataMember(Name="CommandParameterPropertyId", EmitDefaultValue=false)]
        public string CommandParameterPropertyId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ActionsPostbackAction {\n");
            sb.Append("  TargetEditorId: ").Append(TargetEditorId).Append("\n");
            sb.Append("  PostbackCommandId: ").Append(PostbackCommandId).Append("\n");
            sb.Append("  CommandParameterPropertyId: ").Append(CommandParameterPropertyId).Append("\n");
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
            return this.Equals(input as ActionsPostbackAction);
        }

        /// <summary>
        /// Returns true if ActionsPostbackAction instances are equal
        /// </summary>
        /// <param name="input">Instance of ActionsPostbackAction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ActionsPostbackAction input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TargetEditorId == input.TargetEditorId ||
                    (this.TargetEditorId != null &&
                    this.TargetEditorId.Equals(input.TargetEditorId))
                ) && 
                (
                    this.PostbackCommandId == input.PostbackCommandId ||
                    (this.PostbackCommandId != null &&
                    this.PostbackCommandId.Equals(input.PostbackCommandId))
                ) && 
                (
                    this.CommandParameterPropertyId == input.CommandParameterPropertyId ||
                    (this.CommandParameterPropertyId != null &&
                    this.CommandParameterPropertyId.Equals(input.CommandParameterPropertyId))
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
                if (this.TargetEditorId != null)
                    hashCode = hashCode * 59 + this.TargetEditorId.GetHashCode();
                if (this.PostbackCommandId != null)
                    hashCode = hashCode * 59 + this.PostbackCommandId.GetHashCode();
                if (this.CommandParameterPropertyId != null)
                    hashCode = hashCode * 59 + this.CommandParameterPropertyId.GetHashCode();
                return hashCode;
            }
        }

    }
}
