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
    /// ImagesBaseDownloadRemoteImage
    /// </summary>
    [DataContract]
        public partial class ImagesBaseDownloadRemoteImage :  IEquatable<ImagesBaseDownloadRemoteImage>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImagesBaseDownloadRemoteImage" /> class.
        /// </summary>
        /// <param name="imageIndex">imageIndex.</param>
        public ImagesBaseDownloadRemoteImage(int? imageIndex = default(int?))
        {
            this.ImageIndex = imageIndex;
        }
        
        /// <summary>
        /// Gets or Sets ImageIndex
        /// </summary>
        [DataMember(Name="ImageIndex", EmitDefaultValue=false)]
        public int? ImageIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ImagesBaseDownloadRemoteImage {\n");
            sb.Append("  ImageIndex: ").Append(ImageIndex).Append("\n");
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
            return this.Equals(input as ImagesBaseDownloadRemoteImage);
        }

        /// <summary>
        /// Returns true if ImagesBaseDownloadRemoteImage instances are equal
        /// </summary>
        /// <param name="input">Instance of ImagesBaseDownloadRemoteImage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImagesBaseDownloadRemoteImage input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ImageIndex == input.ImageIndex ||
                    (this.ImageIndex != null &&
                    this.ImageIndex.Equals(input.ImageIndex))
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
                if (this.ImageIndex != null)
                    hashCode = hashCode * 59 + this.ImageIndex.GetHashCode();
                return hashCode;
            }
        }

    }
}
