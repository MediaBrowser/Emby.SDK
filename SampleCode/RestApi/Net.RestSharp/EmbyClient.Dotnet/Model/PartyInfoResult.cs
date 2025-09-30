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
    /// PartyInfoResult
    /// </summary>
    [DataContract]
        public partial class PartyInfoResult :  IEquatable<PartyInfoResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartyInfoResult" /> class.
        /// </summary>
        /// <param name="partyInfo">partyInfo.</param>
        public PartyInfoResult(PartyInfo partyInfo = default(PartyInfo))
        {
            this.PartyInfo = partyInfo;
        }
        
        /// <summary>
        /// Gets or Sets PartyInfo
        /// </summary>
        [DataMember(Name="PartyInfo", EmitDefaultValue=false)]
        public PartyInfo PartyInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PartyInfoResult {\n");
            sb.Append("  PartyInfo: ").Append(PartyInfo).Append("\n");
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
            return this.Equals(input as PartyInfoResult);
        }

        /// <summary>
        /// Returns true if PartyInfoResult instances are equal
        /// </summary>
        /// <param name="input">Instance of PartyInfoResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartyInfoResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PartyInfo == input.PartyInfo ||
                    (this.PartyInfo != null &&
                    this.PartyInfo.Equals(input.PartyInfo))
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
                if (this.PartyInfo != null)
                    hashCode = hashCode * 59 + this.PartyInfo.GetHashCode();
                return hashCode;
            }
        }

    }
}
