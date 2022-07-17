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
    /// ConnectUserLinkResult
    /// </summary>
    [DataContract]
        public partial class ConnectUserLinkResult :  IEquatable<ConnectUserLinkResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConnectUserLinkResult" /> class.
        /// </summary>
        /// <param name="isPending">isPending.</param>
        /// <param name="isNewUserInvitation">isNewUserInvitation.</param>
        /// <param name="guestDisplayName">guestDisplayName.</param>
        public ConnectUserLinkResult(bool? isPending = default(bool?), bool? isNewUserInvitation = default(bool?), string guestDisplayName = default(string))
        {
            this.IsPending = isPending;
            this.IsNewUserInvitation = isNewUserInvitation;
            this.GuestDisplayName = guestDisplayName;
        }
        
        /// <summary>
        /// Gets or Sets IsPending
        /// </summary>
        [DataMember(Name="IsPending", EmitDefaultValue=false)]
        public bool? IsPending { get; set; }

        /// <summary>
        /// Gets or Sets IsNewUserInvitation
        /// </summary>
        [DataMember(Name="IsNewUserInvitation", EmitDefaultValue=false)]
        public bool? IsNewUserInvitation { get; set; }

        /// <summary>
        /// Gets or Sets GuestDisplayName
        /// </summary>
        [DataMember(Name="GuestDisplayName", EmitDefaultValue=false)]
        public string GuestDisplayName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConnectUserLinkResult {\n");
            sb.Append("  IsPending: ").Append(IsPending).Append("\n");
            sb.Append("  IsNewUserInvitation: ").Append(IsNewUserInvitation).Append("\n");
            sb.Append("  GuestDisplayName: ").Append(GuestDisplayName).Append("\n");
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
            return this.Equals(input as ConnectUserLinkResult);
        }

        /// <summary>
        /// Returns true if ConnectUserLinkResult instances are equal
        /// </summary>
        /// <param name="input">Instance of ConnectUserLinkResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConnectUserLinkResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsPending == input.IsPending ||
                    (this.IsPending != null &&
                    this.IsPending.Equals(input.IsPending))
                ) && 
                (
                    this.IsNewUserInvitation == input.IsNewUserInvitation ||
                    (this.IsNewUserInvitation != null &&
                    this.IsNewUserInvitation.Equals(input.IsNewUserInvitation))
                ) && 
                (
                    this.GuestDisplayName == input.GuestDisplayName ||
                    (this.GuestDisplayName != null &&
                    this.GuestDisplayName.Equals(input.GuestDisplayName))
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
                if (this.IsPending != null)
                    hashCode = hashCode * 59 + this.IsPending.GetHashCode();
                if (this.IsNewUserInvitation != null)
                    hashCode = hashCode * 59 + this.IsNewUserInvitation.GetHashCode();
                if (this.GuestDisplayName != null)
                    hashCode = hashCode * 59 + this.GuestDisplayName.GetHashCode();
                return hashCode;
            }
        }

    }
}
