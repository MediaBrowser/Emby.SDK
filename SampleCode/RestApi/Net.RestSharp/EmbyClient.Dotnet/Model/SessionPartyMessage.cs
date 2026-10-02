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
    /// SessionPartyMessage
    /// </summary>
    [DataContract]
        public partial class SessionPartyMessage :  IEquatable<SessionPartyMessage>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionPartyMessage" /> class.
        /// </summary>
        /// <param name="dateTime">dateTime.</param>
        /// <param name="message">message.</param>
        /// <param name="userId">userId.</param>
        /// <param name="user">user.</param>
        public SessionPartyMessage(DateTimeOffset? dateTime = default(DateTimeOffset?), string message = default(string), long? userId = default(long?), UserDto user = default(UserDto))
        {
            this.DateTime = dateTime;
            this.Message = message;
            this.UserId = userId;
            this.User = user;
        }
        
        /// <summary>
        /// Gets or Sets DateTime
        /// </summary>
        [DataMember(Name="DateTime", EmitDefaultValue=false)]
        public DateTimeOffset? DateTime { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="Message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public long? UserId { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="User", EmitDefaultValue=false)]
        public UserDto User { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SessionPartyMessage {\n");
            sb.Append("  DateTime: ").Append(DateTime).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
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
            return this.Equals(input as SessionPartyMessage);
        }

        /// <summary>
        /// Returns true if SessionPartyMessage instances are equal
        /// </summary>
        /// <param name="input">Instance of SessionPartyMessage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SessionPartyMessage input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DateTime == input.DateTime ||
                    (this.DateTime != null &&
                    this.DateTime.Equals(input.DateTime))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
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
                if (this.DateTime != null)
                    hashCode = hashCode * 59 + this.DateTime.GetHashCode();
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                return hashCode;
            }
        }

    }
}
