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
    /// Class ImageInfo  
    /// </summary>
    [DataContract]
        public partial class ImageInfo :  IEquatable<ImageInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImageInfo" /> class.
        /// </summary>
        /// <param name="imageType">imageType.</param>
        /// <param name="imageIndex">The index of the image..</param>
        /// <param name="path">The path..</param>
        /// <param name="filename">filename.</param>
        /// <param name="height">The height..</param>
        /// <param name="width">The width..</param>
        /// <param name="size">The size..</param>
        public ImageInfo(ImageType imageType = default(ImageType), int? imageIndex = default(int?), string path = default(string), string filename = default(string), int? height = default(int?), int? width = default(int?), long? size = default(long?))
        {
            this.ImageType = imageType;
            this.ImageIndex = imageIndex;
            this.Path = path;
            this.Filename = filename;
            this.Height = height;
            this.Width = width;
            this.Size = size;
        }
        
        /// <summary>
        /// Gets or Sets ImageType
        /// </summary>
        [DataMember(Name="ImageType", EmitDefaultValue=false)]
        public ImageType ImageType { get; set; }

        /// <summary>
        /// The index of the image.
        /// </summary>
        /// <value>The index of the image.</value>
        [DataMember(Name="ImageIndex", EmitDefaultValue=false)]
        public int? ImageIndex { get; set; }

        /// <summary>
        /// The path.
        /// </summary>
        /// <value>The path.</value>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets Filename
        /// </summary>
        [DataMember(Name="Filename", EmitDefaultValue=false)]
        public string Filename { get; set; }

        /// <summary>
        /// The height.
        /// </summary>
        /// <value>The height.</value>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// The width.
        /// </summary>
        /// <value>The width.</value>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// The size.
        /// </summary>
        /// <value>The size.</value>
        [DataMember(Name="Size", EmitDefaultValue=false)]
        public long? Size { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ImageInfo {\n");
            sb.Append("  ImageType: ").Append(ImageType).Append("\n");
            sb.Append("  ImageIndex: ").Append(ImageIndex).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
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
            return this.Equals(input as ImageInfo);
        }

        /// <summary>
        /// Returns true if ImageInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ImageInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImageInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ImageType == input.ImageType ||
                    (this.ImageType != null &&
                    this.ImageType.Equals(input.ImageType))
                ) && 
                (
                    this.ImageIndex == input.ImageIndex ||
                    (this.ImageIndex != null &&
                    this.ImageIndex.Equals(input.ImageIndex))
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.Filename == input.Filename ||
                    (this.Filename != null &&
                    this.Filename.Equals(input.Filename))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
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
                if (this.ImageType != null)
                    hashCode = hashCode * 59 + this.ImageType.GetHashCode();
                if (this.ImageIndex != null)
                    hashCode = hashCode * 59 + this.ImageIndex.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.Filename != null)
                    hashCode = hashCode * 59 + this.Filename.GetHashCode();
                if (this.Height != null)
                    hashCode = hashCode * 59 + this.Height.GetHashCode();
                if (this.Width != null)
                    hashCode = hashCode * 59 + this.Width.GetHashCode();
                if (this.Size != null)
                    hashCode = hashCode * 59 + this.Size.GetHashCode();
                return hashCode;
            }
        }

    }
}
