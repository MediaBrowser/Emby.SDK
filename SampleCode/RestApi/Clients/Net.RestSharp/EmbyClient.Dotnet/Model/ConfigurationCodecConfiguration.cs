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
    /// ConfigurationCodecConfiguration
    /// </summary>
    [DataContract]
        public partial class ConfigurationCodecConfiguration :  IEquatable<ConfigurationCodecConfiguration>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationCodecConfiguration" /> class.
        /// </summary>
        /// <param name="isEnabled">isEnabled.</param>
        /// <param name="priority">priority.</param>
        /// <param name="codecId">codecId.</param>
        public ConfigurationCodecConfiguration(bool? isEnabled = default(bool?), int? priority = default(int?), string codecId = default(string))
        {
            this.IsEnabled = isEnabled;
            this.Priority = priority;
            this.CodecId = codecId;
        }
        
        /// <summary>
        /// Gets or Sets IsEnabled
        /// </summary>
        [DataMember(Name="IsEnabled", EmitDefaultValue=false)]
        public bool? IsEnabled { get; set; }

        /// <summary>
        /// Gets or Sets Priority
        /// </summary>
        [DataMember(Name="Priority", EmitDefaultValue=false)]
        public int? Priority { get; set; }

        /// <summary>
        /// Gets or Sets CodecId
        /// </summary>
        [DataMember(Name="CodecId", EmitDefaultValue=false)]
        public string CodecId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConfigurationCodecConfiguration {\n");
            sb.Append("  IsEnabled: ").Append(IsEnabled).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("  CodecId: ").Append(CodecId).Append("\n");
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
            return this.Equals(input as ConfigurationCodecConfiguration);
        }

        /// <summary>
        /// Returns true if ConfigurationCodecConfiguration instances are equal
        /// </summary>
        /// <param name="input">Instance of ConfigurationCodecConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConfigurationCodecConfiguration input)
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
                    this.Priority == input.Priority ||
                    (this.Priority != null &&
                    this.Priority.Equals(input.Priority))
                ) && 
                (
                    this.CodecId == input.CodecId ||
                    (this.CodecId != null &&
                    this.CodecId.Equals(input.CodecId))
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
                if (this.Priority != null)
                    hashCode = hashCode * 59 + this.Priority.GetHashCode();
                if (this.CodecId != null)
                    hashCode = hashCode * 59 + this.CodecId.GetHashCode();
                return hashCode;
            }
        }

    }
}
