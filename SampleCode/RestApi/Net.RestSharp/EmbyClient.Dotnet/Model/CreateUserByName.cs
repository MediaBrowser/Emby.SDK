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
    /// CreateUserByName
    /// </summary>
    [DataContract]
        public partial class CreateUserByName :  IEquatable<CreateUserByName>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateUserByName" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="copyFromUserId">copyFromUserId.</param>
        /// <param name="userCopyOptions">userCopyOptions.</param>
        public CreateUserByName(string name = default(string), string copyFromUserId = default(string), List<LibraryUserCopyOptions> userCopyOptions = default(List<LibraryUserCopyOptions>))
        {
            this.Name = name;
            this.CopyFromUserId = copyFromUserId;
            this.UserCopyOptions = userCopyOptions;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CopyFromUserId
        /// </summary>
        [DataMember(Name="CopyFromUserId", EmitDefaultValue=false)]
        public string CopyFromUserId { get; set; }

        /// <summary>
        /// Gets or Sets UserCopyOptions
        /// </summary>
        [DataMember(Name="UserCopyOptions", EmitDefaultValue=false)]
        public List<LibraryUserCopyOptions> UserCopyOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateUserByName {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CopyFromUserId: ").Append(CopyFromUserId).Append("\n");
            sb.Append("  UserCopyOptions: ").Append(UserCopyOptions).Append("\n");
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
            return this.Equals(input as CreateUserByName);
        }

        /// <summary>
        /// Returns true if CreateUserByName instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateUserByName to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateUserByName input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CopyFromUserId == input.CopyFromUserId ||
                    (this.CopyFromUserId != null &&
                    this.CopyFromUserId.Equals(input.CopyFromUserId))
                ) && 
                (
                    this.UserCopyOptions == input.UserCopyOptions ||
                    this.UserCopyOptions != null &&
                    input.UserCopyOptions != null &&
                    this.UserCopyOptions.SequenceEqual(input.UserCopyOptions)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.CopyFromUserId != null)
                    hashCode = hashCode * 59 + this.CopyFromUserId.GetHashCode();
                if (this.UserCopyOptions != null)
                    hashCode = hashCode * 59 + this.UserCopyOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
