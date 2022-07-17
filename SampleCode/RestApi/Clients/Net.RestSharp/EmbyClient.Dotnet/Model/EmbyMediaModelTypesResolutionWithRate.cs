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
    /// EmbyMediaModelTypesResolutionWithRate
    /// </summary>
    [DataContract]
        public partial class EmbyMediaModelTypesResolutionWithRate :  IEquatable<EmbyMediaModelTypesResolutionWithRate>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyMediaModelTypesResolutionWithRate" /> class.
        /// </summary>
        /// <param name="width">width.</param>
        /// <param name="height">height.</param>
        /// <param name="frameRate">frameRate.</param>
        /// <param name="resolution">resolution.</param>
        public EmbyMediaModelTypesResolutionWithRate(int? width = default(int?), int? height = default(int?), double? frameRate = default(double?), EmbyMediaModelTypesResolution resolution = default(EmbyMediaModelTypesResolution))
        {
            this.Width = width;
            this.Height = height;
            this.FrameRate = frameRate;
            this.Resolution = resolution;
        }
        
        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// Gets or Sets FrameRate
        /// </summary>
        [DataMember(Name="FrameRate", EmitDefaultValue=false)]
        public double? FrameRate { get; set; }

        /// <summary>
        /// Gets or Sets Resolution
        /// </summary>
        [DataMember(Name="Resolution", EmitDefaultValue=false)]
        public EmbyMediaModelTypesResolution Resolution { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyMediaModelTypesResolutionWithRate {\n");
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
            return this.Equals(input as EmbyMediaModelTypesResolutionWithRate);
        }

        /// <summary>
        /// Returns true if EmbyMediaModelTypesResolutionWithRate instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyMediaModelTypesResolutionWithRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyMediaModelTypesResolutionWithRate input)
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
