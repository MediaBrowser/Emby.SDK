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
    /// PlaylistsPlaylistCreationResult
    /// </summary>
    [DataContract]
        public partial class PlaylistsPlaylistCreationResult :  IEquatable<PlaylistsPlaylistCreationResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaylistsPlaylistCreationResult" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="itemAddedCount">itemAddedCount.</param>
        public PlaylistsPlaylistCreationResult(string id = default(string), string name = default(string), int? itemAddedCount = default(int?))
        {
            this.Id = id;
            this.Name = name;
            this.ItemAddedCount = itemAddedCount;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

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
            sb.Append("class PlaylistsPlaylistCreationResult {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as PlaylistsPlaylistCreationResult);
        }

        /// <summary>
        /// Returns true if PlaylistsPlaylistCreationResult instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaylistsPlaylistCreationResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaylistsPlaylistCreationResult input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ItemAddedCount != null)
                    hashCode = hashCode * 59 + this.ItemAddedCount.GetHashCode();
                return hashCode;
            }
        }

    }
}
