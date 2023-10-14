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
    /// SyncDataResponse
    /// </summary>
    [DataContract]
        public partial class SyncDataResponse :  IEquatable<SyncDataResponse>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncDataResponse" /> class.
        /// </summary>
        /// <param name="itemIdsToRemove">itemIdsToRemove.</param>
        public SyncDataResponse(List<string> itemIdsToRemove = default(List<string>))
        {
            this.ItemIdsToRemove = itemIdsToRemove;
        }
        
        /// <summary>
        /// Gets or Sets ItemIdsToRemove
        /// </summary>
        [DataMember(Name="ItemIdsToRemove", EmitDefaultValue=false)]
        public List<string> ItemIdsToRemove { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncDataResponse {\n");
            sb.Append("  ItemIdsToRemove: ").Append(ItemIdsToRemove).Append("\n");
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
            return this.Equals(input as SyncDataResponse);
        }

        /// <summary>
        /// Returns true if SyncDataResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncDataResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncDataResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ItemIdsToRemove == input.ItemIdsToRemove ||
                    this.ItemIdsToRemove != null &&
                    input.ItemIdsToRemove != null &&
                    this.ItemIdsToRemove.SequenceEqual(input.ItemIdsToRemove)
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
                if (this.ItemIdsToRemove != null)
                    hashCode = hashCode * 59 + this.ItemIdsToRemove.GetHashCode();
                return hashCode;
            }
        }

    }
}
