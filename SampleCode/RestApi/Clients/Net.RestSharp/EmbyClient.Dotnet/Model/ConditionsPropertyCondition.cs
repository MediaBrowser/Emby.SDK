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
    /// ConditionsPropertyCondition
    /// </summary>
    [DataContract]
        public partial class ConditionsPropertyCondition :  IEquatable<ConditionsPropertyCondition>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConditionsPropertyCondition" /> class.
        /// </summary>
        /// <param name="affectedPropertyId">affectedPropertyId.</param>
        /// <param name="conditionType">conditionType.</param>
        /// <param name="targetPropertyId">The target property name or path..</param>
        /// <param name="simpleCondition">simpleCondition.</param>
        /// <param name="valueCondition">valueCondition.</param>
        /// <param name="value">The value..</param>
        public ConditionsPropertyCondition(string affectedPropertyId = default(string), ConditionsPropertyConditionType conditionType = default(ConditionsPropertyConditionType), string targetPropertyId = default(string), AttributesSimpleCondition simpleCondition = default(AttributesSimpleCondition), AttributesValueCondition valueCondition = default(AttributesValueCondition), Object value = default(Object))
        {
            this.AffectedPropertyId = affectedPropertyId;
            this.ConditionType = conditionType;
            this.TargetPropertyId = targetPropertyId;
            this.SimpleCondition = simpleCondition;
            this.ValueCondition = valueCondition;
            this.Value = value;
        }
        
        /// <summary>
        /// Gets or Sets AffectedPropertyId
        /// </summary>
        [DataMember(Name="AffectedPropertyId", EmitDefaultValue=false)]
        public string AffectedPropertyId { get; set; }

        /// <summary>
        /// Gets or Sets ConditionType
        /// </summary>
        [DataMember(Name="ConditionType", EmitDefaultValue=false)]
        public ConditionsPropertyConditionType ConditionType { get; set; }

        /// <summary>
        /// The target property name or path.
        /// </summary>
        /// <value>The target property name or path.</value>
        [DataMember(Name="TargetPropertyId", EmitDefaultValue=false)]
        public string TargetPropertyId { get; set; }

        /// <summary>
        /// Gets or Sets SimpleCondition
        /// </summary>
        [DataMember(Name="SimpleCondition", EmitDefaultValue=false)]
        public AttributesSimpleCondition SimpleCondition { get; set; }

        /// <summary>
        /// Gets or Sets ValueCondition
        /// </summary>
        [DataMember(Name="ValueCondition", EmitDefaultValue=false)]
        public AttributesValueCondition ValueCondition { get; set; }

        /// <summary>
        /// The value.
        /// </summary>
        /// <value>The value.</value>
        [DataMember(Name="Value", EmitDefaultValue=false)]
        public Object Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConditionsPropertyCondition {\n");
            sb.Append("  AffectedPropertyId: ").Append(AffectedPropertyId).Append("\n");
            sb.Append("  ConditionType: ").Append(ConditionType).Append("\n");
            sb.Append("  TargetPropertyId: ").Append(TargetPropertyId).Append("\n");
            sb.Append("  SimpleCondition: ").Append(SimpleCondition).Append("\n");
            sb.Append("  ValueCondition: ").Append(ValueCondition).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as ConditionsPropertyCondition);
        }

        /// <summary>
        /// Returns true if ConditionsPropertyCondition instances are equal
        /// </summary>
        /// <param name="input">Instance of ConditionsPropertyCondition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConditionsPropertyCondition input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AffectedPropertyId == input.AffectedPropertyId ||
                    (this.AffectedPropertyId != null &&
                    this.AffectedPropertyId.Equals(input.AffectedPropertyId))
                ) && 
                (
                    this.ConditionType == input.ConditionType ||
                    (this.ConditionType != null &&
                    this.ConditionType.Equals(input.ConditionType))
                ) && 
                (
                    this.TargetPropertyId == input.TargetPropertyId ||
                    (this.TargetPropertyId != null &&
                    this.TargetPropertyId.Equals(input.TargetPropertyId))
                ) && 
                (
                    this.SimpleCondition == input.SimpleCondition ||
                    (this.SimpleCondition != null &&
                    this.SimpleCondition.Equals(input.SimpleCondition))
                ) && 
                (
                    this.ValueCondition == input.ValueCondition ||
                    (this.ValueCondition != null &&
                    this.ValueCondition.Equals(input.ValueCondition))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.AffectedPropertyId != null)
                    hashCode = hashCode * 59 + this.AffectedPropertyId.GetHashCode();
                if (this.ConditionType != null)
                    hashCode = hashCode * 59 + this.ConditionType.GetHashCode();
                if (this.TargetPropertyId != null)
                    hashCode = hashCode * 59 + this.TargetPropertyId.GetHashCode();
                if (this.SimpleCondition != null)
                    hashCode = hashCode * 59 + this.SimpleCondition.GetHashCode();
                if (this.ValueCondition != null)
                    hashCode = hashCode * 59 + this.ValueCondition.GetHashCode();
                if (this.Value != null)
                    hashCode = hashCode * 59 + this.Value.GetHashCode();
                return hashCode;
            }
        }

    }
}
