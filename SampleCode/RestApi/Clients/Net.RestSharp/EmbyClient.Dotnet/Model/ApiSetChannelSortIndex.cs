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
    /// ApiSetChannelSortIndex
    /// </summary>
    [DataContract]
        public partial class ApiSetChannelSortIndex :  IEquatable<ApiSetChannelSortIndex>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiSetChannelSortIndex" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="managementId">managementId.</param>
        /// <param name="newIndex">newIndex.</param>
        public ApiSetChannelSortIndex(string id = default(string), string managementId = default(string), int? newIndex = default(int?))
        {
            this.Id = id;
            this.ManagementId = managementId;
            this.NewIndex = newIndex;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ManagementId
        /// </summary>
        [DataMember(Name="ManagementId", EmitDefaultValue=false)]
        public string ManagementId { get; set; }

        /// <summary>
        /// Gets or Sets NewIndex
        /// </summary>
        [DataMember(Name="NewIndex", EmitDefaultValue=false)]
        public int? NewIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiSetChannelSortIndex {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ManagementId: ").Append(ManagementId).Append("\n");
            sb.Append("  NewIndex: ").Append(NewIndex).Append("\n");
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
            return this.Equals(input as ApiSetChannelSortIndex);
        }

        /// <summary>
        /// Returns true if ApiSetChannelSortIndex instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiSetChannelSortIndex to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiSetChannelSortIndex input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ManagementId == input.ManagementId ||
                    (this.ManagementId != null &&
                    this.ManagementId.Equals(input.ManagementId))
                ) && 
                (
                    this.NewIndex == input.NewIndex ||
                    (this.NewIndex != null &&
                    this.NewIndex.Equals(input.NewIndex))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ManagementId != null)
                    hashCode = hashCode * 59 + this.ManagementId.GetHashCode();
                if (this.NewIndex != null)
                    hashCode = hashCode * 59 + this.NewIndex.GetHashCode();
                return hashCode;
            }
        }

    }
}
