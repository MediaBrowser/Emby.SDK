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
    /// ImageByNameInfo
    /// </summary>
    [DataContract]
        public partial class ImageByNameInfo :  IEquatable<ImageByNameInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImageByNameInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="theme">theme.</param>
        /// <param name="context">context.</param>
        /// <param name="fileLength">fileLength.</param>
        /// <param name="format">format.</param>
        public ImageByNameInfo(string name = default(string), string theme = default(string), string context = default(string), long? fileLength = default(long?), string format = default(string))
        {
            this.Name = name;
            this.Theme = theme;
            this.Context = context;
            this.FileLength = fileLength;
            this.Format = format;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Theme
        /// </summary>
        [DataMember(Name="Theme", EmitDefaultValue=false)]
        public string Theme { get; set; }

        /// <summary>
        /// Gets or Sets Context
        /// </summary>
        [DataMember(Name="Context", EmitDefaultValue=false)]
        public string Context { get; set; }

        /// <summary>
        /// Gets or Sets FileLength
        /// </summary>
        [DataMember(Name="FileLength", EmitDefaultValue=false)]
        public long? FileLength { get; set; }

        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name="Format", EmitDefaultValue=false)]
        public string Format { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ImageByNameInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Theme: ").Append(Theme).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  FileLength: ").Append(FileLength).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
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
            return this.Equals(input as ImageByNameInfo);
        }

        /// <summary>
        /// Returns true if ImageByNameInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ImageByNameInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImageByNameInfo input)
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
                    this.Theme == input.Theme ||
                    (this.Theme != null &&
                    this.Theme.Equals(input.Theme))
                ) && 
                (
                    this.Context == input.Context ||
                    (this.Context != null &&
                    this.Context.Equals(input.Context))
                ) && 
                (
                    this.FileLength == input.FileLength ||
                    (this.FileLength != null &&
                    this.FileLength.Equals(input.FileLength))
                ) && 
                (
                    this.Format == input.Format ||
                    (this.Format != null &&
                    this.Format.Equals(input.Format))
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
                if (this.Theme != null)
                    hashCode = hashCode * 59 + this.Theme.GetHashCode();
                if (this.Context != null)
                    hashCode = hashCode * 59 + this.Context.GetHashCode();
                if (this.FileLength != null)
                    hashCode = hashCode * 59 + this.FileLength.GetHashCode();
                if (this.Format != null)
                    hashCode = hashCode * 59 + this.Format.GetHashCode();
                return hashCode;
            }
        }

    }
}
