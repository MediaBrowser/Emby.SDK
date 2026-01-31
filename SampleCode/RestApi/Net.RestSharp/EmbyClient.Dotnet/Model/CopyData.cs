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
    /// CopyData
    /// </summary>
    [DataContract]
        public partial class CopyData :  IEquatable<CopyData>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CopyData" /> class.
        /// </summary>
        /// <param name="userId">userId.</param>
        /// <param name="toUserIds">toUserIds.</param>
        /// <param name="copyOptions">copyOptions.</param>
        public CopyData(string userId = default(string), List<string> toUserIds = default(List<string>), List<LibraryUserCopyOptions> copyOptions = default(List<LibraryUserCopyOptions>))
        {
            this.UserId = userId;
            this.ToUserIds = toUserIds;
            this.CopyOptions = copyOptions;
        }
        
        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets ToUserIds
        /// </summary>
        [DataMember(Name="ToUserIds", EmitDefaultValue=false)]
        public List<string> ToUserIds { get; set; }

        /// <summary>
        /// Gets or Sets CopyOptions
        /// </summary>
        [DataMember(Name="CopyOptions", EmitDefaultValue=false)]
        public List<LibraryUserCopyOptions> CopyOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CopyData {\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  ToUserIds: ").Append(ToUserIds).Append("\n");
            sb.Append("  CopyOptions: ").Append(CopyOptions).Append("\n");
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
            return this.Equals(input as CopyData);
        }

        /// <summary>
        /// Returns true if CopyData instances are equal
        /// </summary>
        /// <param name="input">Instance of CopyData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CopyData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.ToUserIds == input.ToUserIds ||
                    this.ToUserIds != null &&
                    input.ToUserIds != null &&
                    this.ToUserIds.SequenceEqual(input.ToUserIds)
                ) && 
                (
                    this.CopyOptions == input.CopyOptions ||
                    this.CopyOptions != null &&
                    input.CopyOptions != null &&
                    this.CopyOptions.SequenceEqual(input.CopyOptions)
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
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.ToUserIds != null)
                    hashCode = hashCode * 59 + this.ToUserIds.GetHashCode();
                if (this.CopyOptions != null)
                    hashCode = hashCode * 59 + this.CopyOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
