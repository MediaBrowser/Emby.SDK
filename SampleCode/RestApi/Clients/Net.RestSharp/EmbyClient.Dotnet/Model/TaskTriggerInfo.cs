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
    /// Class TaskTriggerInfo  
    /// </summary>
    [DataContract]
        public partial class TaskTriggerInfo :  IEquatable<TaskTriggerInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaskTriggerInfo" /> class.
        /// </summary>
        /// <param name="type">The type..</param>
        /// <param name="timeOfDayTicks">The time of day..</param>
        /// <param name="intervalTicks">The interval..</param>
        /// <param name="systemEvent">systemEvent.</param>
        /// <param name="dayOfWeek">dayOfWeek.</param>
        /// <param name="maxRuntimeTicks">The maximum runtime ticks..</param>
        public TaskTriggerInfo(string type = default(string), long? timeOfDayTicks = default(long?), long? intervalTicks = default(long?), SystemEvent systemEvent = default(SystemEvent), DayOfWeek dayOfWeek = default(DayOfWeek), long? maxRuntimeTicks = default(long?))
        {
            this.Type = type;
            this.TimeOfDayTicks = timeOfDayTicks;
            this.IntervalTicks = intervalTicks;
            this.SystemEvent = systemEvent;
            this.DayOfWeek = dayOfWeek;
            this.MaxRuntimeTicks = maxRuntimeTicks;
        }
        
        /// <summary>
        /// The type.
        /// </summary>
        /// <value>The type.</value>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The time of day.
        /// </summary>
        /// <value>The time of day.</value>
        [DataMember(Name="TimeOfDayTicks", EmitDefaultValue=false)]
        public long? TimeOfDayTicks { get; set; }

        /// <summary>
        /// The interval.
        /// </summary>
        /// <value>The interval.</value>
        [DataMember(Name="IntervalTicks", EmitDefaultValue=false)]
        public long? IntervalTicks { get; set; }

        /// <summary>
        /// Gets or Sets SystemEvent
        /// </summary>
        [DataMember(Name="SystemEvent", EmitDefaultValue=false)]
        public SystemEvent SystemEvent { get; set; }

        /// <summary>
        /// Gets or Sets DayOfWeek
        /// </summary>
        [DataMember(Name="DayOfWeek", EmitDefaultValue=false)]
        public DayOfWeek DayOfWeek { get; set; }

        /// <summary>
        /// The maximum runtime ticks.
        /// </summary>
        /// <value>The maximum runtime ticks.</value>
        [DataMember(Name="MaxRuntimeTicks", EmitDefaultValue=false)]
        public long? MaxRuntimeTicks { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TaskTriggerInfo {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  TimeOfDayTicks: ").Append(TimeOfDayTicks).Append("\n");
            sb.Append("  IntervalTicks: ").Append(IntervalTicks).Append("\n");
            sb.Append("  SystemEvent: ").Append(SystemEvent).Append("\n");
            sb.Append("  DayOfWeek: ").Append(DayOfWeek).Append("\n");
            sb.Append("  MaxRuntimeTicks: ").Append(MaxRuntimeTicks).Append("\n");
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
            return this.Equals(input as TaskTriggerInfo);
        }

        /// <summary>
        /// Returns true if TaskTriggerInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of TaskTriggerInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TaskTriggerInfo input)
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
                    this.TimeOfDayTicks == input.TimeOfDayTicks ||
                    (this.TimeOfDayTicks != null &&
                    this.TimeOfDayTicks.Equals(input.TimeOfDayTicks))
                ) && 
                (
                    this.IntervalTicks == input.IntervalTicks ||
                    (this.IntervalTicks != null &&
                    this.IntervalTicks.Equals(input.IntervalTicks))
                ) && 
                (
                    this.SystemEvent == input.SystemEvent ||
                    (this.SystemEvent != null &&
                    this.SystemEvent.Equals(input.SystemEvent))
                ) && 
                (
                    this.DayOfWeek == input.DayOfWeek ||
                    (this.DayOfWeek != null &&
                    this.DayOfWeek.Equals(input.DayOfWeek))
                ) && 
                (
                    this.MaxRuntimeTicks == input.MaxRuntimeTicks ||
                    (this.MaxRuntimeTicks != null &&
                    this.MaxRuntimeTicks.Equals(input.MaxRuntimeTicks))
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
                if (this.TimeOfDayTicks != null)
                    hashCode = hashCode * 59 + this.TimeOfDayTicks.GetHashCode();
                if (this.IntervalTicks != null)
                    hashCode = hashCode * 59 + this.IntervalTicks.GetHashCode();
                if (this.SystemEvent != null)
                    hashCode = hashCode * 59 + this.SystemEvent.GetHashCode();
                if (this.DayOfWeek != null)
                    hashCode = hashCode * 59 + this.DayOfWeek.GetHashCode();
                if (this.MaxRuntimeTicks != null)
                    hashCode = hashCode * 59 + this.MaxRuntimeTicks.GetHashCode();
                return hashCode;
            }
        }

    }
}
