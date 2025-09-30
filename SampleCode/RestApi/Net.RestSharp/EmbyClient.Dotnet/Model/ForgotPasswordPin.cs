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
    /// ForgotPasswordPin
    /// </summary>
    [DataContract]
        public partial class ForgotPasswordPin :  IEquatable<ForgotPasswordPin>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ForgotPasswordPin" /> class.
        /// </summary>
        /// <param name="pin">pin.</param>
        public ForgotPasswordPin(string pin = default(string))
        {
            this.Pin = pin;
        }
        
        /// <summary>
        /// Gets or Sets Pin
        /// </summary>
        [DataMember(Name="Pin", EmitDefaultValue=false)]
        public string Pin { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ForgotPasswordPin {\n");
            sb.Append("  Pin: ").Append(Pin).Append("\n");
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
            return this.Equals(input as ForgotPasswordPin);
        }

        /// <summary>
        /// Returns true if ForgotPasswordPin instances are equal
        /// </summary>
        /// <param name="input">Instance of ForgotPasswordPin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ForgotPasswordPin input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Pin == input.Pin ||
                    (this.Pin != null &&
                    this.Pin.Equals(input.Pin))
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
                if (this.Pin != null)
                    hashCode = hashCode * 59 + this.Pin.GetHashCode();
                return hashCode;
            }
        }

    }
}
