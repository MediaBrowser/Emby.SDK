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
    /// ConnectConnectAuthenticationExchangeResult
    /// </summary>
    [DataContract]
        public partial class ConnectConnectAuthenticationExchangeResult :  IEquatable<ConnectConnectAuthenticationExchangeResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectConnectAuthenticationExchangeResult" /> class.
        /// </summary>
        /// <param name="localUserId">localUserId.</param>
        /// <param name="accessToken">accessToken.</param>
        public ConnectConnectAuthenticationExchangeResult(string localUserId = default(string), string accessToken = default(string))
        {
            this.LocalUserId = localUserId;
            this.AccessToken = accessToken;
        }
        
        /// <summary>
        /// Gets or Sets LocalUserId
        /// </summary>
        [DataMember(Name="LocalUserId", EmitDefaultValue=false)]
        public string LocalUserId { get; set; }

        /// <summary>
        /// Gets or Sets AccessToken
        /// </summary>
        [DataMember(Name="AccessToken", EmitDefaultValue=false)]
        public string AccessToken { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConnectConnectAuthenticationExchangeResult {\n");
            sb.Append("  LocalUserId: ").Append(LocalUserId).Append("\n");
            sb.Append("  AccessToken: ").Append(AccessToken).Append("\n");
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
            return this.Equals(input as ConnectConnectAuthenticationExchangeResult);
        }

        /// <summary>
        /// Returns true if ConnectConnectAuthenticationExchangeResult instances are equal
        /// </summary>
        /// <param name="input">Instance of ConnectConnectAuthenticationExchangeResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConnectConnectAuthenticationExchangeResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.LocalUserId == input.LocalUserId ||
                    (this.LocalUserId != null &&
                    this.LocalUserId.Equals(input.LocalUserId))
                ) && 
                (
                    this.AccessToken == input.AccessToken ||
                    (this.AccessToken != null &&
                    this.AccessToken.Equals(input.AccessToken))
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
                if (this.LocalUserId != null)
                    hashCode = hashCode * 59 + this.LocalUserId.GetHashCode();
                if (this.AccessToken != null)
                    hashCode = hashCode * 59 + this.AccessToken.GetHashCode();
                return hashCode;
            }
        }

    }
}
