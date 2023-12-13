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
    /// UserLibraryUpdateUserItemAccess
    /// </summary>
    [DataContract]
        public partial class UserLibraryUpdateUserItemAccess :  IEquatable<UserLibraryUpdateUserItemAccess>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryUpdateUserItemAccess" /> class.
        /// </summary>
        /// <param name="itemIds">itemIds.</param>
        /// <param name="userIds">userIds.</param>
        /// <param name="itemAccess">itemAccess.</param>
        public UserLibraryUpdateUserItemAccess(List<string> itemIds = default(List<string>), List<string> userIds = default(List<string>), UserItemShareLevel itemAccess = default(UserItemShareLevel))
        {
            this.ItemIds = itemIds;
            this.UserIds = userIds;
            this.ItemAccess = itemAccess;
        }
        
        /// <summary>
        /// Gets or Sets ItemIds
        /// </summary>
        [DataMember(Name="ItemIds", EmitDefaultValue=false)]
        public List<string> ItemIds { get; set; }

        /// <summary>
        /// Gets or Sets UserIds
        /// </summary>
        [DataMember(Name="UserIds", EmitDefaultValue=false)]
        public List<string> UserIds { get; set; }

        /// <summary>
        /// Gets or Sets ItemAccess
        /// </summary>
        [DataMember(Name="ItemAccess", EmitDefaultValue=false)]
        public UserItemShareLevel ItemAccess { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserLibraryUpdateUserItemAccess {\n");
            sb.Append("  ItemIds: ").Append(ItemIds).Append("\n");
            sb.Append("  UserIds: ").Append(UserIds).Append("\n");
            sb.Append("  ItemAccess: ").Append(ItemAccess).Append("\n");
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
            return this.Equals(input as UserLibraryUpdateUserItemAccess);
        }

        /// <summary>
        /// Returns true if UserLibraryUpdateUserItemAccess instances are equal
        /// </summary>
        /// <param name="input">Instance of UserLibraryUpdateUserItemAccess to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserLibraryUpdateUserItemAccess input)
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
                    this.UserIds == input.UserIds ||
                    this.UserIds != null &&
                    input.UserIds != null &&
                    this.UserIds.SequenceEqual(input.UserIds)
                ) && 
                (
                    this.ItemAccess == input.ItemAccess ||
                    (this.ItemAccess != null &&
                    this.ItemAccess.Equals(input.ItemAccess))
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
                if (this.UserIds != null)
                    hashCode = hashCode * 59 + this.UserIds.GetHashCode();
                if (this.ItemAccess != null)
                    hashCode = hashCode * 59 + this.ItemAccess.GetHashCode();
                return hashCode;
            }
        }

    }
}
