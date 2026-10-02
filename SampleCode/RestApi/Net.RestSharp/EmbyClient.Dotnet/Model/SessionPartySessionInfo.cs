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
    /// SessionPartySessionInfo
    /// </summary>
    [DataContract]
        public partial class SessionPartySessionInfo :  IEquatable<SessionPartySessionInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionPartySessionInfo" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="user">user.</param>
        /// <param name="isHost">isHost.</param>
        public SessionPartySessionInfo(string id = default(string), UserDto user = default(UserDto), bool? isHost = default(bool?))
        {
            this.Id = id;
            this.User = user;
            this.IsHost = isHost;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="User", EmitDefaultValue=false)]
        public UserDto User { get; set; }

        /// <summary>
        /// Gets or Sets IsHost
        /// </summary>
        [DataMember(Name="IsHost", EmitDefaultValue=false)]
        public bool? IsHost { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SessionPartySessionInfo {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  IsHost: ").Append(IsHost).Append("\n");
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
            return this.Equals(input as SessionPartySessionInfo);
        }

        /// <summary>
        /// Returns true if SessionPartySessionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of SessionPartySessionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SessionPartySessionInfo input)
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
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.IsHost == input.IsHost ||
                    (this.IsHost != null &&
                    this.IsHost.Equals(input.IsHost))
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
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                if (this.IsHost != null)
                    hashCode = hashCode * 59 + this.IsHost.GetHashCode();
                return hashCode;
            }
        }

    }
}
