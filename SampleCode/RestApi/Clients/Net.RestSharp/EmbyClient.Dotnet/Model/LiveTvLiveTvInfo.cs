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
    /// LiveTvLiveTvInfo
    /// </summary>
    [DataContract]
        public partial class LiveTvLiveTvInfo :  IEquatable<LiveTvLiveTvInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvLiveTvInfo" /> class.
        /// </summary>
        /// <param name="isEnabled">A value indicating whether this instance is enabled..</param>
        /// <param name="enabledUsers">The enabled users..</param>
        public LiveTvLiveTvInfo(bool? isEnabled = default(bool?), List<string> enabledUsers = default(List<string>))
        {
            this.IsEnabled = isEnabled;
            this.EnabledUsers = enabledUsers;
        }
        
        /// <summary>
        /// A value indicating whether this instance is enabled.
        /// </summary>
        /// <value>A value indicating whether this instance is enabled.</value>
        [DataMember(Name="IsEnabled", EmitDefaultValue=false)]
        public bool? IsEnabled { get; set; }

        /// <summary>
        /// The enabled users.
        /// </summary>
        /// <value>The enabled users.</value>
        [DataMember(Name="EnabledUsers", EmitDefaultValue=false)]
        public List<string> EnabledUsers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvLiveTvInfo {\n");
            sb.Append("  IsEnabled: ").Append(IsEnabled).Append("\n");
            sb.Append("  EnabledUsers: ").Append(EnabledUsers).Append("\n");
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
            return this.Equals(input as LiveTvLiveTvInfo);
        }

        /// <summary>
        /// Returns true if LiveTvLiveTvInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvLiveTvInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvLiveTvInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsEnabled == input.IsEnabled ||
                    (this.IsEnabled != null &&
                    this.IsEnabled.Equals(input.IsEnabled))
                ) && 
                (
                    this.EnabledUsers == input.EnabledUsers ||
                    this.EnabledUsers != null &&
                    input.EnabledUsers != null &&
                    this.EnabledUsers.SequenceEqual(input.EnabledUsers)
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
                if (this.IsEnabled != null)
                    hashCode = hashCode * 59 + this.IsEnabled.GetHashCode();
                if (this.EnabledUsers != null)
                    hashCode = hashCode * 59 + this.EnabledUsers.GetHashCode();
                return hashCode;
            }
        }

    }
}
