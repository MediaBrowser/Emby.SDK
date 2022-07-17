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
    /// ImageProviderInfo
    /// </summary>
    [DataContract]
        public partial class ImageProviderInfo :  IEquatable<ImageProviderInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImageProviderInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="supportedImages">supportedImages.</param>
        public ImageProviderInfo(string name = default(string), List<ImageType> supportedImages = default(List<ImageType>))
        {
            this.Name = name;
            this.SupportedImages = supportedImages;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets SupportedImages
        /// </summary>
        [DataMember(Name="SupportedImages", EmitDefaultValue=false)]
        public List<ImageType> SupportedImages { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ImageProviderInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SupportedImages: ").Append(SupportedImages).Append("\n");
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
            return this.Equals(input as ImageProviderInfo);
        }

        /// <summary>
        /// Returns true if ImageProviderInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ImageProviderInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImageProviderInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.SupportedImages == input.SupportedImages ||
                    this.SupportedImages != null &&
                    input.SupportedImages != null &&
                    this.SupportedImages.SequenceEqual(input.SupportedImages)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.SupportedImages != null)
                    hashCode = hashCode * 59 + this.SupportedImages.GetHashCode();
                return hashCode;
            }
        }

    }
}
