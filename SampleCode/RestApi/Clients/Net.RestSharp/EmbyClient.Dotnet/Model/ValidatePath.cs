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
    /// ValidatePath
    /// </summary>
    [DataContract]
        public partial class ValidatePath :  IEquatable<ValidatePath>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ValidatePath" /> class.
        /// </summary>
        /// <param name="validateWriteable">validateWriteable.</param>
        /// <param name="isFile">isFile.</param>
        public ValidatePath(bool? validateWriteable = default(bool?), bool? isFile = default(bool?))
        {
            this.ValidateWriteable = validateWriteable;
            this.IsFile = isFile;
        }
        
        /// <summary>
        /// Gets or Sets ValidateWriteable
        /// </summary>
        [DataMember(Name="ValidateWriteable", EmitDefaultValue=false)]
        public bool? ValidateWriteable { get; set; }

        /// <summary>
        /// Gets or Sets IsFile
        /// </summary>
        [DataMember(Name="IsFile", EmitDefaultValue=false)]
        public bool? IsFile { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ValidatePath {\n");
            sb.Append("  ValidateWriteable: ").Append(ValidateWriteable).Append("\n");
            sb.Append("  IsFile: ").Append(IsFile).Append("\n");
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
            return this.Equals(input as ValidatePath);
        }

        /// <summary>
        /// Returns true if ValidatePath instances are equal
        /// </summary>
        /// <param name="input">Instance of ValidatePath to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ValidatePath input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ValidateWriteable == input.ValidateWriteable ||
                    (this.ValidateWriteable != null &&
                    this.ValidateWriteable.Equals(input.ValidateWriteable))
                ) && 
                (
                    this.IsFile == input.IsFile ||
                    (this.IsFile != null &&
                    this.IsFile.Equals(input.IsFile))
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
                if (this.ValidateWriteable != null)
                    hashCode = hashCode * 59 + this.ValidateWriteable.GetHashCode();
                if (this.IsFile != null)
                    hashCode = hashCode * 59 + this.IsFile.GetHashCode();
                return hashCode;
            }
        }

    }
}
