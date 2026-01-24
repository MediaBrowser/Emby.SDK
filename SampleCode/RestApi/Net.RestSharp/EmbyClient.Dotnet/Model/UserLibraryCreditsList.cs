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
    /// UserLibraryCreditsList
    /// </summary>
    [DataContract]
        public partial class UserLibraryCreditsList :  IEquatable<UserLibraryCreditsList>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserLibraryCreditsList" /> class.
        /// </summary>
        /// <param name="personType">personType.</param>
        /// <param name="items">items.</param>
        public UserLibraryCreditsList(PersonType personType = default(PersonType), List<RemoteSearchResult> items = default(List<RemoteSearchResult>))
        {
            this.PersonType = personType;
            this.Items = items;
        }
        
        /// <summary>
        /// Gets or Sets PersonType
        /// </summary>
        [DataMember(Name="PersonType", EmitDefaultValue=false)]
        public PersonType PersonType { get; set; }

        /// <summary>
        /// Gets or Sets Items
        /// </summary>
        [DataMember(Name="Items", EmitDefaultValue=false)]
        public List<RemoteSearchResult> Items { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserLibraryCreditsList {\n");
            sb.Append("  PersonType: ").Append(PersonType).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
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
            return this.Equals(input as UserLibraryCreditsList);
        }

        /// <summary>
        /// Returns true if UserLibraryCreditsList instances are equal
        /// </summary>
        /// <param name="input">Instance of UserLibraryCreditsList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserLibraryCreditsList input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PersonType == input.PersonType ||
                    (this.PersonType != null &&
                    this.PersonType.Equals(input.PersonType))
                ) && 
                (
                    this.Items == input.Items ||
                    this.Items != null &&
                    input.Items != null &&
                    this.Items.SequenceEqual(input.Items)
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
                if (this.PersonType != null)
                    hashCode = hashCode * 59 + this.PersonType.GetHashCode();
                if (this.Items != null)
                    hashCode = hashCode * 59 + this.Items.GetHashCode();
                return hashCode;
            }
        }

    }
}
