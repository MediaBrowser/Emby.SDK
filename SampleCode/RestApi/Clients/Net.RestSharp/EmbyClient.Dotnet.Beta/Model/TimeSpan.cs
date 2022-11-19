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
    /// TimeSpan
    /// </summary>
    [DataContract]
        public partial class TimeSpan :  IEquatable<TimeSpan>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSpan" /> class.
        /// </summary>
        /// <param name="ticks">ticks.</param>
        /// <param name="days">days.</param>
        /// <param name="hours">hours.</param>
        /// <param name="milliseconds">milliseconds.</param>
        /// <param name="minutes">minutes.</param>
        /// <param name="seconds">seconds.</param>
        /// <param name="totalDays">totalDays.</param>
        /// <param name="totalHours">totalHours.</param>
        /// <param name="totalMilliseconds">totalMilliseconds.</param>
        /// <param name="totalMinutes">totalMinutes.</param>
        /// <param name="totalSeconds">totalSeconds.</param>
        public TimeSpan(long? ticks = default(long?), int? days = default(int?), int? hours = default(int?), int? milliseconds = default(int?), int? minutes = default(int?), int? seconds = default(int?), double? totalDays = default(double?), double? totalHours = default(double?), double? totalMilliseconds = default(double?), double? totalMinutes = default(double?), double? totalSeconds = default(double?))
        {
            this.Ticks = ticks;
            this.Days = days;
            this.Hours = hours;
            this.Milliseconds = milliseconds;
            this.Minutes = minutes;
            this.Seconds = seconds;
            this.TotalDays = totalDays;
            this.TotalHours = totalHours;
            this.TotalMilliseconds = totalMilliseconds;
            this.TotalMinutes = totalMinutes;
            this.TotalSeconds = totalSeconds;
        }
        
        /// <summary>
        /// Gets or Sets Ticks
        /// </summary>
        [DataMember(Name="Ticks", EmitDefaultValue=false)]
        public long? Ticks { get; set; }

        /// <summary>
        /// Gets or Sets Days
        /// </summary>
        [DataMember(Name="Days", EmitDefaultValue=false)]
        public int? Days { get; set; }

        /// <summary>
        /// Gets or Sets Hours
        /// </summary>
        [DataMember(Name="Hours", EmitDefaultValue=false)]
        public int? Hours { get; set; }

        /// <summary>
        /// Gets or Sets Milliseconds
        /// </summary>
        [DataMember(Name="Milliseconds", EmitDefaultValue=false)]
        public int? Milliseconds { get; set; }

        /// <summary>
        /// Gets or Sets Minutes
        /// </summary>
        [DataMember(Name="Minutes", EmitDefaultValue=false)]
        public int? Minutes { get; set; }

        /// <summary>
        /// Gets or Sets Seconds
        /// </summary>
        [DataMember(Name="Seconds", EmitDefaultValue=false)]
        public int? Seconds { get; set; }

        /// <summary>
        /// Gets or Sets TotalDays
        /// </summary>
        [DataMember(Name="TotalDays", EmitDefaultValue=false)]
        public double? TotalDays { get; set; }

        /// <summary>
        /// Gets or Sets TotalHours
        /// </summary>
        [DataMember(Name="TotalHours", EmitDefaultValue=false)]
        public double? TotalHours { get; set; }

        /// <summary>
        /// Gets or Sets TotalMilliseconds
        /// </summary>
        [DataMember(Name="TotalMilliseconds", EmitDefaultValue=false)]
        public double? TotalMilliseconds { get; set; }

        /// <summary>
        /// Gets or Sets TotalMinutes
        /// </summary>
        [DataMember(Name="TotalMinutes", EmitDefaultValue=false)]
        public double? TotalMinutes { get; set; }

        /// <summary>
        /// Gets or Sets TotalSeconds
        /// </summary>
        [DataMember(Name="TotalSeconds", EmitDefaultValue=false)]
        public double? TotalSeconds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TimeSpan {\n");
            sb.Append("  Ticks: ").Append(Ticks).Append("\n");
            sb.Append("  Days: ").Append(Days).Append("\n");
            sb.Append("  Hours: ").Append(Hours).Append("\n");
            sb.Append("  Milliseconds: ").Append(Milliseconds).Append("\n");
            sb.Append("  Minutes: ").Append(Minutes).Append("\n");
            sb.Append("  Seconds: ").Append(Seconds).Append("\n");
            sb.Append("  TotalDays: ").Append(TotalDays).Append("\n");
            sb.Append("  TotalHours: ").Append(TotalHours).Append("\n");
            sb.Append("  TotalMilliseconds: ").Append(TotalMilliseconds).Append("\n");
            sb.Append("  TotalMinutes: ").Append(TotalMinutes).Append("\n");
            sb.Append("  TotalSeconds: ").Append(TotalSeconds).Append("\n");
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
            return this.Equals(input as TimeSpan);
        }

        /// <summary>
        /// Returns true if TimeSpan instances are equal
        /// </summary>
        /// <param name="input">Instance of TimeSpan to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimeSpan input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ticks == input.Ticks ||
                    (this.Ticks != null &&
                    this.Ticks.Equals(input.Ticks))
                ) && 
                (
                    this.Days == input.Days ||
                    (this.Days != null &&
                    this.Days.Equals(input.Days))
                ) && 
                (
                    this.Hours == input.Hours ||
                    (this.Hours != null &&
                    this.Hours.Equals(input.Hours))
                ) && 
                (
                    this.Milliseconds == input.Milliseconds ||
                    (this.Milliseconds != null &&
                    this.Milliseconds.Equals(input.Milliseconds))
                ) && 
                (
                    this.Minutes == input.Minutes ||
                    (this.Minutes != null &&
                    this.Minutes.Equals(input.Minutes))
                ) && 
                (
                    this.Seconds == input.Seconds ||
                    (this.Seconds != null &&
                    this.Seconds.Equals(input.Seconds))
                ) && 
                (
                    this.TotalDays == input.TotalDays ||
                    (this.TotalDays != null &&
                    this.TotalDays.Equals(input.TotalDays))
                ) && 
                (
                    this.TotalHours == input.TotalHours ||
                    (this.TotalHours != null &&
                    this.TotalHours.Equals(input.TotalHours))
                ) && 
                (
                    this.TotalMilliseconds == input.TotalMilliseconds ||
                    (this.TotalMilliseconds != null &&
                    this.TotalMilliseconds.Equals(input.TotalMilliseconds))
                ) && 
                (
                    this.TotalMinutes == input.TotalMinutes ||
                    (this.TotalMinutes != null &&
                    this.TotalMinutes.Equals(input.TotalMinutes))
                ) && 
                (
                    this.TotalSeconds == input.TotalSeconds ||
                    (this.TotalSeconds != null &&
                    this.TotalSeconds.Equals(input.TotalSeconds))
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
                if (this.Ticks != null)
                    hashCode = hashCode * 59 + this.Ticks.GetHashCode();
                if (this.Days != null)
                    hashCode = hashCode * 59 + this.Days.GetHashCode();
                if (this.Hours != null)
                    hashCode = hashCode * 59 + this.Hours.GetHashCode();
                if (this.Milliseconds != null)
                    hashCode = hashCode * 59 + this.Milliseconds.GetHashCode();
                if (this.Minutes != null)
                    hashCode = hashCode * 59 + this.Minutes.GetHashCode();
                if (this.Seconds != null)
                    hashCode = hashCode * 59 + this.Seconds.GetHashCode();
                if (this.TotalDays != null)
                    hashCode = hashCode * 59 + this.TotalDays.GetHashCode();
                if (this.TotalHours != null)
                    hashCode = hashCode * 59 + this.TotalHours.GetHashCode();
                if (this.TotalMilliseconds != null)
                    hashCode = hashCode * 59 + this.TotalMilliseconds.GetHashCode();
                if (this.TotalMinutes != null)
                    hashCode = hashCode * 59 + this.TotalMinutes.GetHashCode();
                if (this.TotalSeconds != null)
                    hashCode = hashCode * 59 + this.TotalSeconds.GetHashCode();
                return hashCode;
            }
        }

    }
}
