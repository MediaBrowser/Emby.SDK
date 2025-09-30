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
    /// TypeOptions
    /// </summary>
    [DataContract]
        public partial class TypeOptions :  IEquatable<TypeOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TypeOptions" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="metadataFetchers">metadataFetchers.</param>
        /// <param name="metadataFetcherOrder">metadataFetcherOrder.</param>
        /// <param name="imageFetchers">imageFetchers.</param>
        /// <param name="imageFetcherOrder">imageFetcherOrder.</param>
        /// <param name="imageOptions">imageOptions.</param>
        public TypeOptions(string type = default(string), List<string> metadataFetchers = default(List<string>), List<string> metadataFetcherOrder = default(List<string>), List<string> imageFetchers = default(List<string>), List<string> imageFetcherOrder = default(List<string>), List<ImageOption> imageOptions = default(List<ImageOption>))
        {
            this.Type = type;
            this.MetadataFetchers = metadataFetchers;
            this.MetadataFetcherOrder = metadataFetcherOrder;
            this.ImageFetchers = imageFetchers;
            this.ImageFetcherOrder = imageFetcherOrder;
            this.ImageOptions = imageOptions;
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
        public List<string> MetadataFetchers { get; set; }

        /// <summary>
        /// Gets or Sets MetadataFetcherOrder
        /// </summary>
        [DataMember(Name="MetadataFetcherOrder", EmitDefaultValue=false)]
        public List<string> MetadataFetcherOrder { get; set; }

        /// <summary>
        /// Gets or Sets ImageFetchers
        /// </summary>
        [DataMember(Name="ImageFetchers", EmitDefaultValue=false)]
        public List<string> ImageFetchers { get; set; }

        /// <summary>
        /// Gets or Sets ImageFetcherOrder
        /// </summary>
        [DataMember(Name="ImageFetcherOrder", EmitDefaultValue=false)]
        public List<string> ImageFetcherOrder { get; set; }

        /// <summary>
        /// Gets or Sets ImageOptions
        /// </summary>
        [DataMember(Name="ImageOptions", EmitDefaultValue=false)]
        public List<ImageOption> ImageOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TypeOptions {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  MetadataFetchers: ").Append(MetadataFetchers).Append("\n");
            sb.Append("  MetadataFetcherOrder: ").Append(MetadataFetcherOrder).Append("\n");
            sb.Append("  ImageFetchers: ").Append(ImageFetchers).Append("\n");
            sb.Append("  ImageFetcherOrder: ").Append(ImageFetcherOrder).Append("\n");
            sb.Append("  ImageOptions: ").Append(ImageOptions).Append("\n");
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
            return this.Equals(input as TypeOptions);
        }

        /// <summary>
        /// Returns true if TypeOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of TypeOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TypeOptions input)
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
                    this.MetadataFetcherOrder == input.MetadataFetcherOrder ||
                    this.MetadataFetcherOrder != null &&
                    input.MetadataFetcherOrder != null &&
                    this.MetadataFetcherOrder.SequenceEqual(input.MetadataFetcherOrder)
                ) && 
                (
                    this.ImageFetchers == input.ImageFetchers ||
                    this.ImageFetchers != null &&
                    input.ImageFetchers != null &&
                    this.ImageFetchers.SequenceEqual(input.ImageFetchers)
                ) && 
                (
                    this.ImageFetcherOrder == input.ImageFetcherOrder ||
                    this.ImageFetcherOrder != null &&
                    input.ImageFetcherOrder != null &&
                    this.ImageFetcherOrder.SequenceEqual(input.ImageFetcherOrder)
                ) && 
                (
                    this.ImageOptions == input.ImageOptions ||
                    this.ImageOptions != null &&
                    input.ImageOptions != null &&
                    this.ImageOptions.SequenceEqual(input.ImageOptions)
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
                if (this.MetadataFetcherOrder != null)
                    hashCode = hashCode * 59 + this.MetadataFetcherOrder.GetHashCode();
                if (this.ImageFetchers != null)
                    hashCode = hashCode * 59 + this.ImageFetchers.GetHashCode();
                if (this.ImageFetcherOrder != null)
                    hashCode = hashCode * 59 + this.ImageFetcherOrder.GetHashCode();
                if (this.ImageOptions != null)
                    hashCode = hashCode * 59 + this.ImageOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
