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
    /// ForgotPassword
    /// </summary>
    [DataContract]
        public partial class ForgotPassword :  IEquatable<ForgotPassword>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ForgotPassword" /> class.
        /// </summary>
        /// <param name="enteredUsername">enteredUsername.</param>
        public ForgotPassword(string enteredUsername = default(string))
        {
            this.EnteredUsername = enteredUsername;
        }
        
        /// <summary>
        /// Gets or Sets EnteredUsername
        /// </summary>
        [DataMember(Name="EnteredUsername", EmitDefaultValue=false)]
        public string EnteredUsername { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ForgotPassword {\n");
            sb.Append("  EnteredUsername: ").Append(EnteredUsername).Append("\n");
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
            return this.Equals(input as ForgotPassword);
        }

        /// <summary>
        /// Returns true if ForgotPassword instances are equal
        /// </summary>
        /// <param name="input">Instance of ForgotPassword to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ForgotPassword input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EnteredUsername == input.EnteredUsername ||
                    (this.EnteredUsername != null &&
                    this.EnteredUsername.Equals(input.EnteredUsername))
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
                if (this.EnteredUsername != null)
                    hashCode = hashCode * 59 + this.EnteredUsername.GetHashCode();
                return hashCode;
            }
        }

    }
}
