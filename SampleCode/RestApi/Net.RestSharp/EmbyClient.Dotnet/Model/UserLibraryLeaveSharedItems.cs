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
    /// UserLibraryLeaveSharedItems
    /// </summary>
    [DataContract]
        public partial class UserLibraryLeaveSharedItems :  IEquatable<UserLibraryLeaveSharedItems>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryLeaveSharedItems" /> class.
        /// </summary>
        /// <param name="itemIds">itemIds.</param>
        /// <param name="userId">userId.</param>
        public UserLibraryLeaveSharedItems(List<string> itemIds = default(List<string>), string userId = default(string))
        {
            this.ItemIds = itemIds;
            this.UserId = userId;
        }
        
        /// <summary>
        /// Gets or Sets ItemIds
        /// </summary>
        [DataMember(Name="ItemIds", EmitDefaultValue=false)]
        public List<string> ItemIds { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserLibraryLeaveSharedItems {\n");
            sb.Append("  ItemIds: ").Append(ItemIds).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
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
            return this.Equals(input as UserLibraryLeaveSharedItems);
        }

        /// <summary>
        /// Returns true if UserLibraryLeaveSharedItems instances are equal
        /// </summary>
        /// <param name="input">Instance of UserLibraryLeaveSharedItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserLibraryLeaveSharedItems input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ItemIds == input.ItemIds ||
                    this.ItemIds != null &&
                    input.ItemIds != null &&
                    this.ItemIds.SequenceEqual(input.ItemIds)
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
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
                if (this.ItemIds != null)
                    hashCode = hashCode * 59 + this.ItemIds.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                return hashCode;
            }
        }

    }
}
