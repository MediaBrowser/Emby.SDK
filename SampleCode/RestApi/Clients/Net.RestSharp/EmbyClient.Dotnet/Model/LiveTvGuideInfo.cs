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
    /// LiveTvGuideInfo
    /// </summary>
    [DataContract]
        public partial class LiveTvGuideInfo :  IEquatable<LiveTvGuideInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvGuideInfo" /> class.
        /// </summary>
        /// <param name="startDate">The start date..</param>
        /// <param name="endDate">The end date..</param>
        public LiveTvGuideInfo(DateTimeOffset? startDate = default(DateTimeOffset?), DateTimeOffset? endDate = default(DateTimeOffset?))
        {
            this.StartDate = startDate;
            this.EndDate = endDate;
        }
        
        /// <summary>
        /// The start date.
        /// </summary>
        /// <value>The start date.</value>
        [DataMember(Name="StartDate", EmitDefaultValue=false)]
        public DateTimeOffset? StartDate { get; set; }

        /// <summary>
        /// The end date.
        /// </summary>
        /// <value>The end date.</value>
        [DataMember(Name="EndDate", EmitDefaultValue=false)]
        public DateTimeOffset? EndDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvGuideInfo {\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
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
            return this.Equals(input as LiveTvGuideInfo);
        }

        /// <summary>
        /// Returns true if LiveTvGuideInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvGuideInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvGuideInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
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
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                return hashCode;
            }
        }

    }
}
