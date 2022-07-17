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
    /// SessionUserInfo
    /// </summary>
    [DataContract]
        public partial class SessionUserInfo :  IEquatable<SessionUserInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionUserInfo" /> class.
        /// </summary>
        /// <param name="userId">userId.</param>
        /// <param name="userName">userName.</param>
        /// <param name="userInternalId">userInternalId.</param>
        public SessionUserInfo(string userId = default(string), string userName = default(string), long? userInternalId = default(long?))
        {
            this.UserId = userId;
            this.UserName = userName;
            this.UserInternalId = userInternalId;
        }
        
        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets UserName
        /// </summary>
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets UserInternalId
        /// </summary>
        [DataMember(Name="UserInternalId", EmitDefaultValue=false)]
        public long? UserInternalId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SessionUserInfo {\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  UserInternalId: ").Append(UserInternalId).Append("\n");
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
            return this.Equals(input as SessionUserInfo);
        }

        /// <summary>
        /// Returns true if SessionUserInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of SessionUserInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SessionUserInfo input)
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
                    this.UserName == input.UserName ||
                    (this.UserName != null &&
                    this.UserName.Equals(input.UserName))
                ) && 
                (
                    this.UserInternalId == input.UserInternalId ||
                    (this.UserInternalId != null &&
                    this.UserInternalId.Equals(input.UserInternalId))
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
                if (this.UserName != null)
                    hashCode = hashCode * 59 + this.UserName.GetHashCode();
                if (this.UserInternalId != null)
                    hashCode = hashCode * 59 + this.UserInternalId.GetHashCode();
                return hashCode;
            }
        }

    }
}
