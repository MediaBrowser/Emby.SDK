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
    /// DlnaProfileCondition
    /// </summary>
    [DataContract]
        public partial class DlnaProfileCondition :  IEquatable<DlnaProfileCondition>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaProfileCondition" /> class.
        /// </summary>
        /// <param name="condition">condition.</param>
        /// <param name="property">property.</param>
        /// <param name="value">value.</param>
        /// <param name="isRequired">isRequired.</param>
        public DlnaProfileCondition(DlnaProfileConditionType condition = default(DlnaProfileConditionType), DlnaProfileConditionValue property = default(DlnaProfileConditionValue), string value = default(string), bool? isRequired = default(bool?))
        {
            this.Condition = condition;
            this.Property = property;
            this.Value = value;
            this.IsRequired = isRequired;
        }
        
        /// <summary>
        /// Gets or Sets Condition
        /// </summary>
        [DataMember(Name="Condition", EmitDefaultValue=false)]
        public DlnaProfileConditionType Condition { get; set; }

        /// <summary>
        /// Gets or Sets Property
        /// </summary>
        [DataMember(Name="Property", EmitDefaultValue=false)]
        public DlnaProfileConditionValue Property { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name="Value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets IsRequired
        /// </summary>
        [DataMember(Name="IsRequired", EmitDefaultValue=false)]
        public bool? IsRequired { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DlnaProfileCondition {\n");
            sb.Append("  Condition: ").Append(Condition).Append("\n");
            sb.Append("  Property: ").Append(Property).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  IsRequired: ").Append(IsRequired).Append("\n");
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
            return this.Equals(input as DlnaProfileCondition);
        }

        /// <summary>
        /// Returns true if DlnaProfileCondition instances are equal
        /// </summary>
        /// <param name="input">Instance of DlnaProfileCondition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DlnaProfileCondition input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Condition == input.Condition ||
                    (this.Condition != null &&
                    this.Condition.Equals(input.Condition))
                ) && 
                (
                    this.Property == input.Property ||
                    (this.Property != null &&
                    this.Property.Equals(input.Property))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.IsRequired == input.IsRequired ||
                    (this.IsRequired != null &&
                    this.IsRequired.Equals(input.IsRequired))
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
                if (this.Condition != null)
                    hashCode = hashCode * 59 + this.Condition.GetHashCode();
                if (this.Property != null)
                    hashCode = hashCode * 59 + this.Property.GetHashCode();
                if (this.Value != null)
                    hashCode = hashCode * 59 + this.Value.GetHashCode();
                if (this.IsRequired != null)
                    hashCode = hashCode * 59 + this.IsRequired.GetHashCode();
                return hashCode;
            }
        }

    }
}
