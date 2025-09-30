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
    /// ApiEpgRow
    /// </summary>
    [DataContract]
        public partial class ApiEpgRow :  IEquatable<ApiEpgRow>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiEpgRow" /> class.
        /// </summary>
        /// <param name="channel">channel.</param>
        /// <param name="programs">programs.</param>
        public ApiEpgRow(BaseItemDto channel = default(BaseItemDto), List<BaseItemDto> programs = default(List<BaseItemDto>))
        {
            this.Channel = channel;
            this.Programs = programs;
        }
        
        /// <summary>
        /// Gets or Sets Channel
        /// </summary>
        [DataMember(Name="Channel", EmitDefaultValue=false)]
        public BaseItemDto Channel { get; set; }

        /// <summary>
        /// Gets or Sets Programs
        /// </summary>
        [DataMember(Name="Programs", EmitDefaultValue=false)]
        public List<BaseItemDto> Programs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiEpgRow {\n");
            sb.Append("  Channel: ").Append(Channel).Append("\n");
            sb.Append("  Programs: ").Append(Programs).Append("\n");
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
            return this.Equals(input as ApiEpgRow);
        }

        /// <summary>
        /// Returns true if ApiEpgRow instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiEpgRow to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiEpgRow input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Channel == input.Channel ||
                    (this.Channel != null &&
                    this.Channel.Equals(input.Channel))
                ) && 
                (
                    this.Programs == input.Programs ||
                    this.Programs != null &&
                    input.Programs != null &&
                    this.Programs.SequenceEqual(input.Programs)
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
                if (this.Channel != null)
                    hashCode = hashCode * 59 + this.Channel.GetHashCode();
                if (this.Programs != null)
                    hashCode = hashCode * 59 + this.Programs.GetHashCode();
                return hashCode;
            }
        }

    }
}
