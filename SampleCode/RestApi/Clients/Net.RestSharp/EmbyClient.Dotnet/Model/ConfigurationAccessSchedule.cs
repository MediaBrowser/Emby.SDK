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
    /// ConfigurationAccessSchedule
    /// </summary>
    [DataContract]
        public partial class ConfigurationAccessSchedule :  IEquatable<ConfigurationAccessSchedule>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationAccessSchedule" /> class.
        /// </summary>
        /// <param name="dayOfWeek">dayOfWeek.</param>
        /// <param name="startHour">startHour.</param>
        /// <param name="endHour">endHour.</param>
        public ConfigurationAccessSchedule(ConfigurationDynamicDayOfWeek dayOfWeek = default(ConfigurationDynamicDayOfWeek), double? startHour = default(double?), double? endHour = default(double?))
        {
            this.DayOfWeek = dayOfWeek;
            this.StartHour = startHour;
            this.EndHour = endHour;
        }
        
        /// <summary>
        /// Gets or Sets DayOfWeek
        /// </summary>
        [DataMember(Name="DayOfWeek", EmitDefaultValue=false)]
        public ConfigurationDynamicDayOfWeek DayOfWeek { get; set; }

        /// <summary>
        /// Gets or Sets StartHour
        /// </summary>
        [DataMember(Name="StartHour", EmitDefaultValue=false)]
        public double? StartHour { get; set; }

        /// <summary>
        /// Gets or Sets EndHour
        /// </summary>
        [DataMember(Name="EndHour", EmitDefaultValue=false)]
        public double? EndHour { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConfigurationAccessSchedule {\n");
            sb.Append("  DayOfWeek: ").Append(DayOfWeek).Append("\n");
            sb.Append("  StartHour: ").Append(StartHour).Append("\n");
            sb.Append("  EndHour: ").Append(EndHour).Append("\n");
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
            return this.Equals(input as ConfigurationAccessSchedule);
        }

        /// <summary>
        /// Returns true if ConfigurationAccessSchedule instances are equal
        /// </summary>
        /// <param name="input">Instance of ConfigurationAccessSchedule to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConfigurationAccessSchedule input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DayOfWeek == input.DayOfWeek ||
                    (this.DayOfWeek != null &&
                    this.DayOfWeek.Equals(input.DayOfWeek))
                ) && 
                (
                    this.StartHour == input.StartHour ||
                    (this.StartHour != null &&
                    this.StartHour.Equals(input.StartHour))
                ) && 
                (
                    this.EndHour == input.EndHour ||
                    (this.EndHour != null &&
                    this.EndHour.Equals(input.EndHour))
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
                if (this.DayOfWeek != null)
                    hashCode = hashCode * 59 + this.DayOfWeek.GetHashCode();
                if (this.StartHour != null)
                    hashCode = hashCode * 59 + this.StartHour.GetHashCode();
                if (this.EndHour != null)
                    hashCode = hashCode * 59 + this.EndHour.GetHashCode();
                return hashCode;
            }
        }

    }
}
