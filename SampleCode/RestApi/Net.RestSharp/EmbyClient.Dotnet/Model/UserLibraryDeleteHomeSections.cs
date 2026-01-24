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
    /// UserLibraryDeleteHomeSections
    /// </summary>
    [DataContract]
        public partial class UserLibraryDeleteHomeSections :  IEquatable<UserLibraryDeleteHomeSections>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryDeleteHomeSections" /> class.
        /// </summary>
        /// <param name="ids">ids.</param>
        public UserLibraryDeleteHomeSections(List<string> ids = default(List<string>))
        {
            this.Ids = ids;
        }
        
        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [DataMember(Name="Ids", EmitDefaultValue=false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserLibraryDeleteHomeSections {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
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
            return this.Equals(input as UserLibraryDeleteHomeSections);
        }

        /// <summary>
        /// Returns true if UserLibraryDeleteHomeSections instances are equal
        /// </summary>
        /// <param name="input">Instance of UserLibraryDeleteHomeSections to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserLibraryDeleteHomeSections input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
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
                if (this.Ids != null)
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
                return hashCode;
            }
        }

    }
}
