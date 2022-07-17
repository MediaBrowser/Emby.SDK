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
    /// LibraryLibraryOptionsResult
    /// </summary>
    [DataContract]
        public partial class LibraryLibraryOptionsResult :  IEquatable<LibraryLibraryOptionsResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryLibraryOptionsResult" /> class.
        /// </summary>
        /// <param name="metadataSavers">metadataSavers.</param>
        /// <param name="metadataReaders">metadataReaders.</param>
        /// <param name="subtitleFetchers">subtitleFetchers.</param>
        /// <param name="lyricsFetchers">lyricsFetchers.</param>
        /// <param name="typeOptions">typeOptions.</param>
        public LibraryLibraryOptionsResult(List<LibraryLibraryOptionInfo> metadataSavers = default(List<LibraryLibraryOptionInfo>), List<LibraryLibraryOptionInfo> metadataReaders = default(List<LibraryLibraryOptionInfo>), List<LibraryLibraryOptionInfo> subtitleFetchers = default(List<LibraryLibraryOptionInfo>), List<LibraryLibraryOptionInfo> lyricsFetchers = default(List<LibraryLibraryOptionInfo>), List<LibraryLibraryTypeOptions> typeOptions = default(List<LibraryLibraryTypeOptions>))
        {
            this.MetadataSavers = metadataSavers;
            this.MetadataReaders = metadataReaders;
            this.SubtitleFetchers = subtitleFetchers;
            this.LyricsFetchers = lyricsFetchers;
            this.TypeOptions = typeOptions;
        }
        
        /// <summary>
        /// Gets or Sets MetadataSavers
        /// </summary>
        [DataMember(Name="MetadataSavers", EmitDefaultValue=false)]
        public List<LibraryLibraryOptionInfo> MetadataSavers { get; set; }

        /// <summary>
        /// Gets or Sets MetadataReaders
        /// </summary>
        [DataMember(Name="MetadataReaders", EmitDefaultValue=false)]
        public List<LibraryLibraryOptionInfo> MetadataReaders { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleFetchers
        /// </summary>
        [DataMember(Name="SubtitleFetchers", EmitDefaultValue=false)]
        public List<LibraryLibraryOptionInfo> SubtitleFetchers { get; set; }

        /// <summary>
        /// Gets or Sets LyricsFetchers
        /// </summary>
        [DataMember(Name="LyricsFetchers", EmitDefaultValue=false)]
        public List<LibraryLibraryOptionInfo> LyricsFetchers { get; set; }

        /// <summary>
        /// Gets or Sets TypeOptions
        /// </summary>
        [DataMember(Name="TypeOptions", EmitDefaultValue=false)]
        public List<LibraryLibraryTypeOptions> TypeOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryLibraryOptionsResult {\n");
            sb.Append("  MetadataSavers: ").Append(MetadataSavers).Append("\n");
            sb.Append("  MetadataReaders: ").Append(MetadataReaders).Append("\n");
            sb.Append("  SubtitleFetchers: ").Append(SubtitleFetchers).Append("\n");
            sb.Append("  LyricsFetchers: ").Append(LyricsFetchers).Append("\n");
            sb.Append("  TypeOptions: ").Append(TypeOptions).Append("\n");
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
            return this.Equals(input as LibraryLibraryOptionsResult);
        }

        /// <summary>
        /// Returns true if LibraryLibraryOptionsResult instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryLibraryOptionsResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryLibraryOptionsResult input)
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
                return hashCode;
            }
        }

    }
}
