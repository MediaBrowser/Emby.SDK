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
    /// PlaylistsAddToPlaylistResult
    /// </summary>
    [DataContract]
        public partial class PlaylistsAddToPlaylistResult :  IEquatable<PlaylistsAddToPlaylistResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaylistsAddToPlaylistResult" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="itemAddedCount">itemAddedCount.</param>
        public PlaylistsAddToPlaylistResult(string id = default(string), int? itemAddedCount = default(int?))
        {
            this.Id = id;
            this.ItemAddedCount = itemAddedCount;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ItemAddedCount
        /// </summary>
        [DataMember(Name="ItemAddedCount", EmitDefaultValue=false)]
        public int? ItemAddedCount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlaylistsAddToPlaylistResult {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ItemAddedCount: ").Append(ItemAddedCount).Append("\n");
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
            return this.Equals(input as PlaylistsAddToPlaylistResult);
        }

        /// <summary>
        /// Returns true if PlaylistsAddToPlaylistResult instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaylistsAddToPlaylistResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaylistsAddToPlaylistResult input)
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
                    this.ItemAddedCount == input.ItemAddedCount ||
                    (this.ItemAddedCount != null &&
                    this.ItemAddedCount.Equals(input.ItemAddedCount))
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
                if (this.ItemAddedCount != null)
                    hashCode = hashCode * 59 + this.ItemAddedCount.GetHashCode();
                return hashCode;
            }
        }

    }
}
