/*
 * EmbyClient.Dotnet.Beta
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// DlnaCodecProfile
    /// </summary>
    [DataContract]
        public partial class DlnaCodecProfile :  IEquatable<DlnaCodecProfile>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaCodecProfile" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="conditions">conditions.</param>
        /// <param name="applyConditions">applyConditions.</param>
        /// <param name="codec">codec.</param>
        /// <param name="container">container.</param>
        public DlnaCodecProfile(DlnaCodecType type = default(DlnaCodecType), List<DlnaProfileCondition> conditions = default(List<DlnaProfileCondition>), List<DlnaProfileCondition> applyConditions = default(List<DlnaProfileCondition>), string codec = default(string), string container = default(string))
        {
            this.Type = type;
            this.Conditions = conditions;
            this.ApplyConditions = applyConditions;
            this.Codec = codec;
            this.Container = container;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public DlnaCodecType Type { get; set; }

        /// <summary>
        /// Gets or Sets Conditions
        /// </summary>
        [DataMember(Name="Conditions", EmitDefaultValue=false)]
        public List<DlnaProfileCondition> Conditions { get; set; }

        /// <summary>
        /// Gets or Sets ApplyConditions
        /// </summary>
        [DataMember(Name="ApplyConditions", EmitDefaultValue=false)]
        public List<DlnaProfileCondition> ApplyConditions { get; set; }

        /// <summary>
        /// Gets or Sets Codec
        /// </summary>
        [DataMember(Name="Codec", EmitDefaultValue=false)]
        public string Codec { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DlnaCodecProfile {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
            sb.Append("  ApplyConditions: ").Append(ApplyConditions).Append("\n");
            sb.Append("  Codec: ").Append(Codec).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
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
            return this.Equals(input as DlnaCodecProfile);
        }

        /// <summary>
        /// Returns true if DlnaCodecProfile instances are equal
        /// </summary>
        /// <param name="input">Instance of DlnaCodecProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DlnaCodecProfile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Conditions == input.Conditions ||
                    this.Conditions != null &&
                    input.Conditions != null &&
                    this.Conditions.SequenceEqual(input.Conditions)
                ) && 
                (
                    this.ApplyConditions == input.ApplyConditions ||
                    this.ApplyConditions != null &&
                    input.ApplyConditions != null &&
                    this.ApplyConditions.SequenceEqual(input.ApplyConditions)
                ) && 
                (
                    this.Codec == input.Codec ||
                    (this.Codec != null &&
                    this.Codec.Equals(input.Codec))
                ) && 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Conditions != null)
                    hashCode = hashCode * 59 + this.Conditions.GetHashCode();
                if (this.ApplyConditions != null)
                    hashCode = hashCode * 59 + this.ApplyConditions.GetHashCode();
                if (this.Codec != null)
                    hashCode = hashCode * 59 + this.Codec.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                return hashCode;
            }
        }

    }
}