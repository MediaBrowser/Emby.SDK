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
    /// UpdateUserPassword
    /// </summary>
    [DataContract]
        public partial class UpdateUserPassword :  IEquatable<UpdateUserPassword>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdateUserPassword" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="newPw">newPw.</param>
        /// <param name="resetPassword">resetPassword.</param>
        public UpdateUserPassword(string id = default(string), string newPw = default(string), bool? resetPassword = default(bool?))
        {
            this.Id = id;
            this.NewPw = newPw;
            this.ResetPassword = resetPassword;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets NewPw
        /// </summary>
        [DataMember(Name="NewPw", EmitDefaultValue=false)]
        public string NewPw { get; set; }

        /// <summary>
        /// Gets or Sets ResetPassword
        /// </summary>
        [DataMember(Name="ResetPassword", EmitDefaultValue=false)]
        public bool? ResetPassword { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateUserPassword {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  NewPw: ").Append(NewPw).Append("\n");
            sb.Append("  ResetPassword: ").Append(ResetPassword).Append("\n");
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
            return this.Equals(input as UpdateUserPassword);
        }

        /// <summary>
        /// Returns true if UpdateUserPassword instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdateUserPassword to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateUserPassword input)
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
                    this.NewPw == input.NewPw ||
                    (this.NewPw != null &&
                    this.NewPw.Equals(input.NewPw))
                ) && 
                (
                    this.ResetPassword == input.ResetPassword ||
                    (this.ResetPassword != null &&
                    this.ResetPassword.Equals(input.ResetPassword))
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
                if (this.NewPw != null)
                    hashCode = hashCode * 59 + this.NewPw.GetHashCode();
                if (this.ResetPassword != null)
                    hashCode = hashCode * 59 + this.ResetPassword.GetHashCode();
                return hashCode;
            }
        }

    }
}
