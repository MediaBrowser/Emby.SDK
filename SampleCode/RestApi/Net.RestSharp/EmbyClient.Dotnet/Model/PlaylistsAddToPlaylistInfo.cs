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
    /// PlaylistsAddToPlaylistInfo
    /// </summary>
    [DataContract]
        public partial class PlaylistsAddToPlaylistInfo :  IEquatable<PlaylistsAddToPlaylistInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaylistsAddToPlaylistInfo" /> class.
        /// </summary>
        /// <param name="itemCount">itemCount.</param>
        /// <param name="containsDuplicates">containsDuplicates.</param>
        public PlaylistsAddToPlaylistInfo(int? itemCount = default(int?), bool? containsDuplicates = default(bool?))
        {
            this.ItemCount = itemCount;
            this.ContainsDuplicates = containsDuplicates;
        }
        
        /// <summary>
        /// Gets or Sets ItemCount
        /// </summary>
        [DataMember(Name="ItemCount", EmitDefaultValue=false)]
        public int? ItemCount { get; set; }

        /// <summary>
        /// Gets or Sets ContainsDuplicates
        /// </summary>
        [DataMember(Name="ContainsDuplicates", EmitDefaultValue=false)]
        public bool? ContainsDuplicates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlaylistsAddToPlaylistInfo {\n");
            sb.Append("  ItemCount: ").Append(ItemCount).Append("\n");
            sb.Append("  ContainsDuplicates: ").Append(ContainsDuplicates).Append("\n");
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
            return this.Equals(input as PlaylistsAddToPlaylistInfo);
        }

        /// <summary>
        /// Returns true if PlaylistsAddToPlaylistInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaylistsAddToPlaylistInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaylistsAddToPlaylistInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ItemCount == input.ItemCount ||
                    (this.ItemCount != null &&
                    this.ItemCount.Equals(input.ItemCount))
                ) && 
                (
                    this.ContainsDuplicates == input.ContainsDuplicates ||
                    (this.ContainsDuplicates != null &&
                    this.ContainsDuplicates.Equals(input.ContainsDuplicates))
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
                if (this.ItemCount != null)
                    hashCode = hashCode * 59 + this.ItemCount.GetHashCode();
                if (this.ContainsDuplicates != null)
                    hashCode = hashCode * 59 + this.ContainsDuplicates.GetHashCode();
                return hashCode;
            }
        }

    }
}
