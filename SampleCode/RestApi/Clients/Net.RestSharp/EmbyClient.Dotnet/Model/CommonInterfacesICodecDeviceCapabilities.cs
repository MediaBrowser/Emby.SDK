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
    /// CommonInterfacesICodecDeviceCapabilities
    /// </summary>
    [DataContract]
        public partial class CommonInterfacesICodecDeviceCapabilities :  IEquatable<CommonInterfacesICodecDeviceCapabilities>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CommonInterfacesICodecDeviceCapabilities" /> class.
        /// </summary>
        /// <param name="supportsHwUpload">supportsHwUpload.</param>
        /// <param name="supportsHwDownload">supportsHwDownload.</param>
        /// <param name="supportsStandaloneDeviceInit">supportsStandaloneDeviceInit.</param>
        /// <param name="supports10BitProcessing">supports10BitProcessing.</param>
        /// <param name="supportsNativeToneMapping">supportsNativeToneMapping.</param>
        public CommonInterfacesICodecDeviceCapabilities(bool? supportsHwUpload = default(bool?), bool? supportsHwDownload = default(bool?), bool? supportsStandaloneDeviceInit = default(bool?), bool? supports10BitProcessing = default(bool?), bool? supportsNativeToneMapping = default(bool?))
        {
            this.SupportsHwUpload = supportsHwUpload;
            this.SupportsHwDownload = supportsHwDownload;
            this.SupportsStandaloneDeviceInit = supportsStandaloneDeviceInit;
            this.Supports10BitProcessing = supports10BitProcessing;
            this.SupportsNativeToneMapping = supportsNativeToneMapping;
        }
        
        /// <summary>
        /// Gets or Sets SupportsHwUpload
        /// </summary>
        [DataMember(Name="SupportsHwUpload", EmitDefaultValue=false)]
        public bool? SupportsHwUpload { get; set; }

        /// <summary>
        /// Gets or Sets SupportsHwDownload
        /// </summary>
        [DataMember(Name="SupportsHwDownload", EmitDefaultValue=false)]
        public bool? SupportsHwDownload { get; set; }

        /// <summary>
        /// Gets or Sets SupportsStandaloneDeviceInit
        /// </summary>
        [DataMember(Name="SupportsStandaloneDeviceInit", EmitDefaultValue=false)]
        public bool? SupportsStandaloneDeviceInit { get; set; }

        /// <summary>
        /// Gets or Sets Supports10BitProcessing
        /// </summary>
        [DataMember(Name="Supports10BitProcessing", EmitDefaultValue=false)]
        public bool? Supports10BitProcessing { get; set; }

        /// <summary>
        /// Gets or Sets SupportsNativeToneMapping
        /// </summary>
        [DataMember(Name="SupportsNativeToneMapping", EmitDefaultValue=false)]
        public bool? SupportsNativeToneMapping { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CommonInterfacesICodecDeviceCapabilities {\n");
            sb.Append("  SupportsHwUpload: ").Append(SupportsHwUpload).Append("\n");
            sb.Append("  SupportsHwDownload: ").Append(SupportsHwDownload).Append("\n");
            sb.Append("  SupportsStandaloneDeviceInit: ").Append(SupportsStandaloneDeviceInit).Append("\n");
            sb.Append("  Supports10BitProcessing: ").Append(Supports10BitProcessing).Append("\n");
            sb.Append("  SupportsNativeToneMapping: ").Append(SupportsNativeToneMapping).Append("\n");
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
            return this.Equals(input as CommonInterfacesICodecDeviceCapabilities);
        }

        /// <summary>
        /// Returns true if CommonInterfacesICodecDeviceCapabilities instances are equal
        /// </summary>
        /// <param name="input">Instance of CommonInterfacesICodecDeviceCapabilities to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CommonInterfacesICodecDeviceCapabilities input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SupportsHwUpload == input.SupportsHwUpload ||
                    (this.SupportsHwUpload != null &&
                    this.SupportsHwUpload.Equals(input.SupportsHwUpload))
                ) && 
                (
                    this.SupportsHwDownload == input.SupportsHwDownload ||
                    (this.SupportsHwDownload != null &&
                    this.SupportsHwDownload.Equals(input.SupportsHwDownload))
                ) && 
                (
                    this.SupportsStandaloneDeviceInit == input.SupportsStandaloneDeviceInit ||
                    (this.SupportsStandaloneDeviceInit != null &&
                    this.SupportsStandaloneDeviceInit.Equals(input.SupportsStandaloneDeviceInit))
                ) && 
                (
                    this.Supports10BitProcessing == input.Supports10BitProcessing ||
                    (this.Supports10BitProcessing != null &&
                    this.Supports10BitProcessing.Equals(input.Supports10BitProcessing))
                ) && 
                (
                    this.SupportsNativeToneMapping == input.SupportsNativeToneMapping ||
                    (this.SupportsNativeToneMapping != null &&
                    this.SupportsNativeToneMapping.Equals(input.SupportsNativeToneMapping))
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
                if (this.SupportsHwUpload != null)
                    hashCode = hashCode * 59 + this.SupportsHwUpload.GetHashCode();
                if (this.SupportsHwDownload != null)
                    hashCode = hashCode * 59 + this.SupportsHwDownload.GetHashCode();
                if (this.SupportsStandaloneDeviceInit != null)
                    hashCode = hashCode * 59 + this.SupportsStandaloneDeviceInit.GetHashCode();
                if (this.Supports10BitProcessing != null)
                    hashCode = hashCode * 59 + this.Supports10BitProcessing.GetHashCode();
                if (this.SupportsNativeToneMapping != null)
                    hashCode = hashCode * 59 + this.SupportsNativeToneMapping.GetHashCode();
                return hashCode;
            }
        }

    }
}
