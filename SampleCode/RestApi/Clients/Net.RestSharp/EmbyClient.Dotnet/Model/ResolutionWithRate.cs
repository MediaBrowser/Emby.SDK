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
    /// Struct representing a combination of video resolution and frame rate.      &#x60;System.IEquatable&#x60;1&#x60;  
    /// </summary>
    [DataContract]
        public partial class ResolutionWithRate :  IEquatable<ResolutionWithRate>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResolutionWithRate" /> class.
        /// </summary>
        /// <param name="width">The resolution width..</param>
        /// <param name="height">The resolution height..</param>
        /// <param name="frameRate">The frame rate in frames/second (fps)..</param>
        /// <param name="resolution">resolution.</param>
        public ResolutionWithRate(int? width = default(int?), int? height = default(int?), double? frameRate = default(double?), Resolution resolution = default(Resolution))
        {
            this.Width = width;
            this.Height = height;
            this.FrameRate = frameRate;
            this.Resolution = resolution;
        }
        
        /// <summary>
        /// The resolution width.
        /// </summary>
        /// <value>The resolution width.</value>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// The resolution height.
        /// </summary>
        /// <value>The resolution height.</value>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// The frame rate in frames/second (fps).
        /// </summary>
        /// <value>The frame rate in frames/second (fps).</value>
        [DataMember(Name="FrameRate", EmitDefaultValue=false)]
        public double? FrameRate { get; set; }

        /// <summary>
        /// Gets or Sets Resolution
        /// </summary>
        [DataMember(Name="Resolution", EmitDefaultValue=false)]
        public Resolution Resolution { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ResolutionWithRate {\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  FrameRate: ").Append(FrameRate).Append("\n");
            sb.Append("  Resolution: ").Append(Resolution).Append("\n");
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
            return this.Equals(input as ResolutionWithRate);
        }

        /// <summary>
        /// Returns true if ResolutionWithRate instances are equal
        /// </summary>
        /// <param name="input">Instance of ResolutionWithRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResolutionWithRate input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.FrameRate == input.FrameRate ||
                    (this.FrameRate != null &&
                    this.FrameRate.Equals(input.FrameRate))
                ) && 
                (
                    this.Resolution == input.Resolution ||
                    (this.Resolution != null &&
                    this.Resolution.Equals(input.Resolution))
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
                if (this.Width != null)
                    hashCode = hashCode * 59 + this.Width.GetHashCode();
                if (this.Height != null)
                    hashCode = hashCode * 59 + this.Height.GetHashCode();
                if (this.FrameRate != null)
                    hashCode = hashCode * 59 + this.FrameRate.GetHashCode();
                if (this.Resolution != null)
                    hashCode = hashCode * 59 + this.Resolution.GetHashCode();
                return hashCode;
            }
        }

    }
}
