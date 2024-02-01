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
    /// PinRedeemResult
    /// </summary>
    [DataContract]
        public partial class PinRedeemResult :  IEquatable<PinRedeemResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PinRedeemResult" /> class.
        /// </summary>
        /// <param name="success">A value indicating whether this &#x60;MediaBrowser.Model.Users.PinRedeemResult&#x60; is success..</param>
        /// <param name="usersReset">The users reset..</param>
        public PinRedeemResult(bool? success = default(bool?), List<string> usersReset = default(List<string>))
        {
            this.Success = success;
            this.UsersReset = usersReset;
        }
        
        /// <summary>
        /// A value indicating whether this &#x60;MediaBrowser.Model.Users.PinRedeemResult&#x60; is success.
        /// </summary>
        /// <value>A value indicating whether this &#x60;MediaBrowser.Model.Users.PinRedeemResult&#x60; is success.</value>
        [DataMember(Name="Success", EmitDefaultValue=false)]
        public bool? Success { get; set; }

        /// <summary>
        /// The users reset.
        /// </summary>
        /// <value>The users reset.</value>
        [DataMember(Name="UsersReset", EmitDefaultValue=false)]
        public List<string> UsersReset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PinRedeemResult {\n");
            sb.Append("  Success: ").Append(Success).Append("\n");
            sb.Append("  UsersReset: ").Append(UsersReset).Append("\n");
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
            return this.Equals(input as PinRedeemResult);
        }

        /// <summary>
        /// Returns true if PinRedeemResult instances are equal
        /// </summary>
        /// <param name="input">Instance of PinRedeemResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PinRedeemResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Success == input.Success ||
                    (this.Success != null &&
                    this.Success.Equals(input.Success))
                ) && 
                (
                    this.UsersReset == input.UsersReset ||
                    this.UsersReset != null &&
                    input.UsersReset != null &&
                    this.UsersReset.SequenceEqual(input.UsersReset)
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
                if (this.Success != null)
                    hashCode = hashCode * 59 + this.Success.GetHashCode();
                if (this.UsersReset != null)
                    hashCode = hashCode * 59 + this.UsersReset.GetHashCode();
                return hashCode;
            }
        }

    }
}
