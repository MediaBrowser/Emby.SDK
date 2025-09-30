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
    /// LibraryTypeOptions
    /// </summary>
    [DataContract]
        public partial class LibraryTypeOptions :  IEquatable<LibraryTypeOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryTypeOptions" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="metadataFetchers">metadataFetchers.</param>
        /// <param name="imageFetchers">imageFetchers.</param>
        /// <param name="supportedImageTypes">supportedImageTypes.</param>
        /// <param name="defaultImageOptions">defaultImageOptions.</param>
        public LibraryTypeOptions(string type = default(string), List<LibraryOptionInfo> metadataFetchers = default(List<LibraryOptionInfo>), List<LibraryOptionInfo> imageFetchers = default(List<LibraryOptionInfo>), List<ImageType> supportedImageTypes = default(List<ImageType>), List<ImageOption> defaultImageOptions = default(List<ImageOption>))
        {
            this.Type = type;
            this.MetadataFetchers = metadataFetchers;
            this.ImageFetchers = imageFetchers;
            this.SupportedImageTypes = supportedImageTypes;
            this.DefaultImageOptions = defaultImageOptions;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets MetadataFetchers
        /// </summary>
        [DataMember(Name="MetadataFetchers", EmitDefaultValue=false)]
        public List<LibraryOptionInfo> MetadataFetchers { get; set; }

        /// <summary>
        /// Gets or Sets ImageFetchers
        /// </summary>
        [DataMember(Name="ImageFetchers", EmitDefaultValue=false)]
        public List<LibraryOptionInfo> ImageFetchers { get; set; }

        /// <summary>
        /// Gets or Sets SupportedImageTypes
        /// </summary>
        [DataMember(Name="SupportedImageTypes", EmitDefaultValue=false)]
        public List<ImageType> SupportedImageTypes { get; set; }

        /// <summary>
        /// Gets or Sets DefaultImageOptions
        /// </summary>
        [DataMember(Name="DefaultImageOptions", EmitDefaultValue=false)]
        public List<ImageOption> DefaultImageOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryTypeOptions {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  MetadataFetchers: ").Append(MetadataFetchers).Append("\n");
            sb.Append("  ImageFetchers: ").Append(ImageFetchers).Append("\n");
            sb.Append("  SupportedImageTypes: ").Append(SupportedImageTypes).Append("\n");
            sb.Append("  DefaultImageOptions: ").Append(DefaultImageOptions).Append("\n");
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
            return this.Equals(input as LibraryTypeOptions);
        }

        /// <summary>
        /// Returns true if LibraryTypeOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryTypeOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryTypeOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.MetadataFetchers == input.MetadataFetchers ||
                    this.MetadataFetchers != null &&
                    input.MetadataFetchers != null &&
                    this.MetadataFetchers.SequenceEqual(input.MetadataFetchers)
                ) && 
                (
                    this.ImageFetchers == input.ImageFetchers ||
                    this.ImageFetchers != null &&
                    input.ImageFetchers != null &&
                    this.ImageFetchers.SequenceEqual(input.ImageFetchers)
                ) && 
                (
                    this.SupportedImageTypes == input.SupportedImageTypes ||
                    this.SupportedImageTypes != null &&
                    input.SupportedImageTypes != null &&
                    this.SupportedImageTypes.SequenceEqual(input.SupportedImageTypes)
                ) && 
                (
                    this.DefaultImageOptions == input.DefaultImageOptions ||
                    this.DefaultImageOptions != null &&
                    input.DefaultImageOptions != null &&
                    this.DefaultImageOptions.SequenceEqual(input.DefaultImageOptions)
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.MetadataFetchers != null)
                    hashCode = hashCode * 59 + this.MetadataFetchers.GetHashCode();
                if (this.ImageFetchers != null)
                    hashCode = hashCode * 59 + this.ImageFetchers.GetHashCode();
                if (this.SupportedImageTypes != null)
                    hashCode = hashCode * 59 + this.SupportedImageTypes.GetHashCode();
                if (this.DefaultImageOptions != null)
                    hashCode = hashCode * 59 + this.DefaultImageOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
