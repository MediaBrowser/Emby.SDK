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
    /// LibraryOptionsResult
    /// </summary>
    [DataContract]
        public partial class LibraryOptionsResult :  IEquatable<LibraryOptionsResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryOptionsResult" /> class.
        /// </summary>
        /// <param name="metadataSavers">metadataSavers.</param>
        /// <param name="metadataReaders">metadataReaders.</param>
        /// <param name="subtitleFetchers">subtitleFetchers.</param>
        /// <param name="lyricsFetchers">lyricsFetchers.</param>
        /// <param name="typeOptions">typeOptions.</param>
        /// <param name="defaultLibraryOptions">defaultLibraryOptions.</param>
        public LibraryOptionsResult(List<LibraryOptionInfo> metadataSavers = default(List<LibraryOptionInfo>), List<LibraryOptionInfo> metadataReaders = default(List<LibraryOptionInfo>), List<LibraryOptionInfo> subtitleFetchers = default(List<LibraryOptionInfo>), List<LibraryOptionInfo> lyricsFetchers = default(List<LibraryOptionInfo>), List<LibraryTypeOptions> typeOptions = default(List<LibraryTypeOptions>), LibraryOptions defaultLibraryOptions = default(LibraryOptions))
        {
            this.MetadataSavers = metadataSavers;
            this.MetadataReaders = metadataReaders;
            this.SubtitleFetchers = subtitleFetchers;
            this.LyricsFetchers = lyricsFetchers;
            this.TypeOptions = typeOptions;
            this.DefaultLibraryOptions = defaultLibraryOptions;
        }
        
        /// <summary>
        /// Gets or Sets MetadataSavers
        /// </summary>
        [DataMember(Name="MetadataSavers", EmitDefaultValue=false)]
        public List<LibraryOptionInfo> MetadataSavers { get; set; }

        /// <summary>
        /// Gets or Sets MetadataReaders
        /// </summary>
        [DataMember(Name="MetadataReaders", EmitDefaultValue=false)]
        public List<LibraryOptionInfo> MetadataReaders { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleFetchers
        /// </summary>
        [DataMember(Name="SubtitleFetchers", EmitDefaultValue=false)]
        public List<LibraryOptionInfo> SubtitleFetchers { get; set; }

        /// <summary>
        /// Gets or Sets LyricsFetchers
        /// </summary>
        [DataMember(Name="LyricsFetchers", EmitDefaultValue=false)]
        public List<LibraryOptionInfo> LyricsFetchers { get; set; }

        /// <summary>
        /// Gets or Sets TypeOptions
        /// </summary>
        [DataMember(Name="TypeOptions", EmitDefaultValue=false)]
        public List<LibraryTypeOptions> TypeOptions { get; set; }

        /// <summary>
        /// Gets or Sets DefaultLibraryOptions
        /// </summary>
        [DataMember(Name="DefaultLibraryOptions", EmitDefaultValue=false)]
        public LibraryOptions DefaultLibraryOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryOptionsResult {\n");
            sb.Append("  MetadataSavers: ").Append(MetadataSavers).Append("\n");
            sb.Append("  MetadataReaders: ").Append(MetadataReaders).Append("\n");
            sb.Append("  SubtitleFetchers: ").Append(SubtitleFetchers).Append("\n");
            sb.Append("  LyricsFetchers: ").Append(LyricsFetchers).Append("\n");
            sb.Append("  TypeOptions: ").Append(TypeOptions).Append("\n");
            sb.Append("  DefaultLibraryOptions: ").Append(DefaultLibraryOptions).Append("\n");
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
            return this.Equals(input as LibraryOptionsResult);
        }

        /// <summary>
        /// Returns true if LibraryOptionsResult instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryOptionsResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryOptionsResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MetadataSavers == input.MetadataSavers ||
                    this.MetadataSavers != null &&
                    input.MetadataSavers != null &&
                    this.MetadataSavers.SequenceEqual(input.MetadataSavers)
                ) && 
                (
                    this.MetadataReaders == input.MetadataReaders ||
                    this.MetadataReaders != null &&
                    input.MetadataReaders != null &&
                    this.MetadataReaders.SequenceEqual(input.MetadataReaders)
                ) && 
                (
                    this.SubtitleFetchers == input.SubtitleFetchers ||
                    this.SubtitleFetchers != null &&
                    input.SubtitleFetchers != null &&
                    this.SubtitleFetchers.SequenceEqual(input.SubtitleFetchers)
                ) && 
                (
                    this.LyricsFetchers == input.LyricsFetchers ||
                    this.LyricsFetchers != null &&
                    input.LyricsFetchers != null &&
                    this.LyricsFetchers.SequenceEqual(input.LyricsFetchers)
                ) && 
                (
                    this.TypeOptions == input.TypeOptions ||
                    this.TypeOptions != null &&
                    input.TypeOptions != null &&
                    this.TypeOptions.SequenceEqual(input.TypeOptions)
                ) && 
                (
                    this.DefaultLibraryOptions == input.DefaultLibraryOptions ||
                    (this.DefaultLibraryOptions != null &&
                    this.DefaultLibraryOptions.Equals(input.DefaultLibraryOptions))
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
                if (this.MetadataSavers != null)
                    hashCode = hashCode * 59 + this.MetadataSavers.GetHashCode();
                if (this.MetadataReaders != null)
                    hashCode = hashCode * 59 + this.MetadataReaders.GetHashCode();
                if (this.SubtitleFetchers != null)
                    hashCode = hashCode * 59 + this.SubtitleFetchers.GetHashCode();
                if (this.LyricsFetchers != null)
                    hashCode = hashCode * 59 + this.LyricsFetchers.GetHashCode();
                if (this.TypeOptions != null)
                    hashCode = hashCode * 59 + this.TypeOptions.GetHashCode();
                if (this.DefaultLibraryOptions != null)
                    hashCode = hashCode * 59 + this.DefaultLibraryOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
