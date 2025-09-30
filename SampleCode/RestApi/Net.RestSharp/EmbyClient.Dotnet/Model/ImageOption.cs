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
    /// ImageOption
    /// </summary>
    [DataContract]
        public partial class ImageOption :  IEquatable<ImageOption>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImageOption" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="limit">The limit..</param>
        /// <param name="minWidth">The minimum width..</param>
        public ImageOption(ImageType type = default(ImageType), int? limit = default(int?), int? minWidth = default(int?))
        {
            this.Type = type;
            this.Limit = limit;
            this.MinWidth = minWidth;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public ImageType Type { get; set; }

        /// <summary>
        /// The limit.
        /// </summary>
        /// <value>The limit.</value>
        [DataMember(Name="Limit", EmitDefaultValue=false)]
        public int? Limit { get; set; }

        /// <summary>
        /// The minimum width.
        /// </summary>
        /// <value>The minimum width.</value>
        [DataMember(Name="MinWidth", EmitDefaultValue=false)]
        public int? MinWidth { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ImageOption {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  MinWidth: ").Append(MinWidth).Append("\n");
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
            return this.Equals(input as ImageOption);
        }

        /// <summary>
        /// Returns true if ImageOption instances are equal
        /// </summary>
        /// <param name="input">Instance of ImageOption to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImageOption input)
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
                    this.Limit == input.Limit ||
                    (this.Limit != null &&
                    this.Limit.Equals(input.Limit))
                ) && 
                (
                    this.MinWidth == input.MinWidth ||
                    (this.MinWidth != null &&
                    this.MinWidth.Equals(input.MinWidth))
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
                if (this.Limit != null)
                    hashCode = hashCode * 59 + this.Limit.GetHashCode();
                if (this.MinWidth != null)
                    hashCode = hashCode * 59 + this.MinWidth.GetHashCode();
                return hashCode;
            }
        }

    }
}
