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
    /// DlnaProfilesDeviceIdentification
    /// </summary>
    [DataContract]
        public partial class DlnaProfilesDeviceIdentification :  IEquatable<DlnaProfilesDeviceIdentification>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaProfilesDeviceIdentification" /> class.
        /// </summary>
        /// <param name="friendlyName">friendlyName.</param>
        /// <param name="modelNumber">modelNumber.</param>
        /// <param name="serialNumber">serialNumber.</param>
        /// <param name="modelName">modelName.</param>
        /// <param name="modelDescription">modelDescription.</param>
        /// <param name="deviceDescription">deviceDescription.</param>
        /// <param name="modelUrl">modelUrl.</param>
        /// <param name="manufacturer">manufacturer.</param>
        /// <param name="manufacturerUrl">manufacturerUrl.</param>
        /// <param name="headers">headers.</param>
        public DlnaProfilesDeviceIdentification(string friendlyName = default(string), string modelNumber = default(string), string serialNumber = default(string), string modelName = default(string), string modelDescription = default(string), string deviceDescription = default(string), string modelUrl = default(string), string manufacturer = default(string), string manufacturerUrl = default(string), List<DlnaProfilesHttpHeaderInfo> headers = default(List<DlnaProfilesHttpHeaderInfo>))
        {
            this.FriendlyName = friendlyName;
            this.ModelNumber = modelNumber;
            this.SerialNumber = serialNumber;
            this.ModelName = modelName;
            this.ModelDescription = modelDescription;
            this.DeviceDescription = deviceDescription;
            this.ModelUrl = modelUrl;
            this.Manufacturer = manufacturer;
            this.ManufacturerUrl = manufacturerUrl;
            this.Headers = headers;
        }
        
        /// <summary>
        /// Gets or Sets FriendlyName
        /// </summary>
        [DataMember(Name="FriendlyName", EmitDefaultValue=false)]
        public string FriendlyName { get; set; }

        /// <summary>
        /// Gets or Sets ModelNumber
        /// </summary>
        [DataMember(Name="ModelNumber", EmitDefaultValue=false)]
        public string ModelNumber { get; set; }

        /// <summary>
        /// Gets or Sets SerialNumber
        /// </summary>
        [DataMember(Name="SerialNumber", EmitDefaultValue=false)]
        public string SerialNumber { get; set; }

        /// <summary>
        /// Gets or Sets ModelName
        /// </summary>
        [DataMember(Name="ModelName", EmitDefaultValue=false)]
        public string ModelName { get; set; }

        /// <summary>
        /// Gets or Sets ModelDescription
        /// </summary>
        [DataMember(Name="ModelDescription", EmitDefaultValue=false)]
        public string ModelDescription { get; set; }

        /// <summary>
        /// Gets or Sets DeviceDescription
        /// </summary>
        [DataMember(Name="DeviceDescription", EmitDefaultValue=false)]
        public string DeviceDescription { get; set; }

        /// <summary>
        /// Gets or Sets ModelUrl
        /// </summary>
        [DataMember(Name="ModelUrl", EmitDefaultValue=false)]
        public string ModelUrl { get; set; }

        /// <summary>
        /// Gets or Sets Manufacturer
        /// </summary>
        [DataMember(Name="Manufacturer", EmitDefaultValue=false)]
        public string Manufacturer { get; set; }

        /// <summary>
        /// Gets or Sets ManufacturerUrl
        /// </summary>
        [DataMember(Name="ManufacturerUrl", EmitDefaultValue=false)]
        public string ManufacturerUrl { get; set; }

        /// <summary>
        /// Gets or Sets Headers
        /// </summary>
        [DataMember(Name="Headers", EmitDefaultValue=false)]
        public List<DlnaProfilesHttpHeaderInfo> Headers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DlnaProfilesDeviceIdentification {\n");
            sb.Append("  FriendlyName: ").Append(FriendlyName).Append("\n");
            sb.Append("  ModelNumber: ").Append(ModelNumber).Append("\n");
            sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
            sb.Append("  ModelName: ").Append(ModelName).Append("\n");
            sb.Append("  ModelDescription: ").Append(ModelDescription).Append("\n");
            sb.Append("  DeviceDescription: ").Append(DeviceDescription).Append("\n");
            sb.Append("  ModelUrl: ").Append(ModelUrl).Append("\n");
            sb.Append("  Manufacturer: ").Append(Manufacturer).Append("\n");
            sb.Append("  ManufacturerUrl: ").Append(ManufacturerUrl).Append("\n");
            sb.Append("  Headers: ").Append(Headers).Append("\n");
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
            return this.Equals(input as DlnaProfilesDeviceIdentification);
        }

        /// <summary>
        /// Returns true if DlnaProfilesDeviceIdentification instances are equal
        /// </summary>
        /// <param name="input">Instance of DlnaProfilesDeviceIdentification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DlnaProfilesDeviceIdentification input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FriendlyName == input.FriendlyName ||
                    (this.FriendlyName != null &&
                    this.FriendlyName.Equals(input.FriendlyName))
                ) && 
                (
                    this.ModelNumber == input.ModelNumber ||
                    (this.ModelNumber != null &&
                    this.ModelNumber.Equals(input.ModelNumber))
                ) && 
                (
                    this.SerialNumber == input.SerialNumber ||
                    (this.SerialNumber != null &&
                    this.SerialNumber.Equals(input.SerialNumber))
                ) && 
                (
                    this.ModelName == input.ModelName ||
                    (this.ModelName != null &&
                    this.ModelName.Equals(input.ModelName))
                ) && 
                (
                    this.ModelDescription == input.ModelDescription ||
                    (this.ModelDescription != null &&
                    this.ModelDescription.Equals(input.ModelDescription))
                ) && 
                (
                    this.DeviceDescription == input.DeviceDescription ||
                    (this.DeviceDescription != null &&
                    this.DeviceDescription.Equals(input.DeviceDescription))
                ) && 
                (
                    this.ModelUrl == input.ModelUrl ||
                    (this.ModelUrl != null &&
                    this.ModelUrl.Equals(input.ModelUrl))
                ) && 
                (
                    this.Manufacturer == input.Manufacturer ||
                    (this.Manufacturer != null &&
                    this.Manufacturer.Equals(input.Manufacturer))
                ) && 
                (
                    this.ManufacturerUrl == input.ManufacturerUrl ||
                    (this.ManufacturerUrl != null &&
                    this.ManufacturerUrl.Equals(input.ManufacturerUrl))
                ) && 
                (
                    this.Headers == input.Headers ||
                    this.Headers != null &&
                    input.Headers != null &&
                    this.Headers.SequenceEqual(input.Headers)
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
                if (this.FriendlyName != null)
                    hashCode = hashCode * 59 + this.FriendlyName.GetHashCode();
                if (this.ModelNumber != null)
                    hashCode = hashCode * 59 + this.ModelNumber.GetHashCode();
                if (this.SerialNumber != null)
                    hashCode = hashCode * 59 + this.SerialNumber.GetHashCode();
                if (this.ModelName != null)
                    hashCode = hashCode * 59 + this.ModelName.GetHashCode();
                if (this.ModelDescription != null)
                    hashCode = hashCode * 59 + this.ModelDescription.GetHashCode();
                if (this.DeviceDescription != null)
                    hashCode = hashCode * 59 + this.DeviceDescription.GetHashCode();
                if (this.ModelUrl != null)
                    hashCode = hashCode * 59 + this.ModelUrl.GetHashCode();
                if (this.Manufacturer != null)
                    hashCode = hashCode * 59 + this.Manufacturer.GetHashCode();
                if (this.ManufacturerUrl != null)
                    hashCode = hashCode * 59 + this.ManufacturerUrl.GetHashCode();
                if (this.Headers != null)
                    hashCode = hashCode * 59 + this.Headers.GetHashCode();
                return hashCode;
            }
        }

    }
}
