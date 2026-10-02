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
    /// EntitiesTVSeriesOrderInfo
    /// </summary>
    [DataContract]
        public partial class EntitiesTVSeriesOrderInfo :  IEquatable<EntitiesTVSeriesOrderInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntitiesTVSeriesOrderInfo" /> class.
        /// </summary>
        /// <param name="providerKey">providerKey.</param>
        /// <param name="id">id.</param>
        public EntitiesTVSeriesOrderInfo(string providerKey = default(string), string id = default(string))
        {
            this.ProviderKey = providerKey;
            this.Id = id;
        }
        
        /// <summary>
        /// Gets or Sets ProviderKey
        /// </summary>
        [DataMember(Name="ProviderKey", EmitDefaultValue=false)]
        public string ProviderKey { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntitiesTVSeriesOrderInfo {\n");
            sb.Append("  ProviderKey: ").Append(ProviderKey).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as EntitiesTVSeriesOrderInfo);
        }

        /// <summary>
        /// Returns true if EntitiesTVSeriesOrderInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of EntitiesTVSeriesOrderInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntitiesTVSeriesOrderInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ProviderKey == input.ProviderKey ||
                    (this.ProviderKey != null &&
                    this.ProviderKey.Equals(input.ProviderKey))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                if (this.ProviderKey != null)
                    hashCode = hashCode * 59 + this.ProviderKey.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                return hashCode;
            }
        }

    }
}
