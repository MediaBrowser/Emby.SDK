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
    /// UsersForgotPasswordResult
    /// </summary>
    [DataContract]
        public partial class UsersForgotPasswordResult :  IEquatable<UsersForgotPasswordResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UsersForgotPasswordResult" /> class.
        /// </summary>
        /// <param name="action">action.</param>
        /// <param name="pinFile">pinFile.</param>
        /// <param name="pinExpirationDate">pinExpirationDate.</param>
        public UsersForgotPasswordResult(UsersForgotPasswordAction action = default(UsersForgotPasswordAction), string pinFile = default(string), DateTimeOffset? pinExpirationDate = default(DateTimeOffset?))
        {
            this.Action = action;
            this.PinFile = pinFile;
            this.PinExpirationDate = pinExpirationDate;
        }
        
        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name="Action", EmitDefaultValue=false)]
        public UsersForgotPasswordAction Action { get; set; }

        /// <summary>
        /// Gets or Sets PinFile
        /// </summary>
        [DataMember(Name="PinFile", EmitDefaultValue=false)]
        public string PinFile { get; set; }

        /// <summary>
        /// Gets or Sets PinExpirationDate
        /// </summary>
        [DataMember(Name="PinExpirationDate", EmitDefaultValue=false)]
        public DateTimeOffset? PinExpirationDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UsersForgotPasswordResult {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  PinFile: ").Append(PinFile).Append("\n");
            sb.Append("  PinExpirationDate: ").Append(PinExpirationDate).Append("\n");
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
            return this.Equals(input as UsersForgotPasswordResult);
        }

        /// <summary>
        /// Returns true if UsersForgotPasswordResult instances are equal
        /// </summary>
        /// <param name="input">Instance of UsersForgotPasswordResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UsersForgotPasswordResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Action == input.Action ||
                    (this.Action != null &&
                    this.Action.Equals(input.Action))
                ) && 
                (
                    this.PinFile == input.PinFile ||
                    (this.PinFile != null &&
                    this.PinFile.Equals(input.PinFile))
                ) && 
                (
                    this.PinExpirationDate == input.PinExpirationDate ||
                    (this.PinExpirationDate != null &&
                    this.PinExpirationDate.Equals(input.PinExpirationDate))
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
                if (this.Action != null)
                    hashCode = hashCode * 59 + this.Action.GetHashCode();
                if (this.PinFile != null)
                    hashCode = hashCode * 59 + this.PinFile.GetHashCode();
                if (this.PinExpirationDate != null)
                    hashCode = hashCode * 59 + this.PinExpirationDate.GetHashCode();
                return hashCode;
            }
        }

    }
}
