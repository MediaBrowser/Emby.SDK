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
    /// AuthenticationAuthenticationResult
    /// </summary>
    [DataContract]
        public partial class AuthenticationAuthenticationResult :  IEquatable<AuthenticationAuthenticationResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AuthenticationAuthenticationResult" /> class.
        /// </summary>
        /// <param name="user">user.</param>
        /// <param name="sessionInfo">sessionInfo.</param>
        /// <param name="accessToken">The authentication token..</param>
        /// <param name="serverId">The server identifier..</param>
        public AuthenticationAuthenticationResult(UserDto user = default(UserDto), SessionSessionInfo sessionInfo = default(SessionSessionInfo), string accessToken = default(string), string serverId = default(string))
        {
            this.User = user;
            this.SessionInfo = sessionInfo;
            this.AccessToken = accessToken;
            this.ServerId = serverId;
        }
        
        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="User", EmitDefaultValue=false)]
        public UserDto User { get; set; }

        /// <summary>
        /// Gets or Sets SessionInfo
        /// </summary>
        [DataMember(Name="SessionInfo", EmitDefaultValue=false)]
        public SessionSessionInfo SessionInfo { get; set; }

        /// <summary>
        /// The authentication token.
        /// </summary>
        /// <value>The authentication token.</value>
        [DataMember(Name="AccessToken", EmitDefaultValue=false)]
        public string AccessToken { get; set; }

        /// <summary>
        /// The server identifier.
        /// </summary>
        /// <value>The server identifier.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AuthenticationAuthenticationResult {\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  SessionInfo: ").Append(SessionInfo).Append("\n");
            sb.Append("  AccessToken: ").Append(AccessToken).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
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
            return this.Equals(input as AuthenticationAuthenticationResult);
        }

        /// <summary>
        /// Returns true if AuthenticationAuthenticationResult instances are equal
        /// </summary>
        /// <param name="input">Instance of AuthenticationAuthenticationResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AuthenticationAuthenticationResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.SessionInfo == input.SessionInfo ||
                    (this.SessionInfo != null &&
                    this.SessionInfo.Equals(input.SessionInfo))
                ) && 
                (
                    this.AccessToken == input.AccessToken ||
                    (this.AccessToken != null &&
                    this.AccessToken.Equals(input.AccessToken))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
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
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                if (this.SessionInfo != null)
                    hashCode = hashCode * 59 + this.SessionInfo.GetHashCode();
                if (this.AccessToken != null)
                    hashCode = hashCode * 59 + this.AccessToken.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                return hashCode;
            }
        }

    }
}
