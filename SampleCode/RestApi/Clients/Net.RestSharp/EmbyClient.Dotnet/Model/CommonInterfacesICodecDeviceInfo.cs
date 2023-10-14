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
    /// CommonInterfacesICodecDeviceInfo
    /// </summary>
    [DataContract]
        public partial class CommonInterfacesICodecDeviceInfo :  IEquatable<CommonInterfacesICodecDeviceInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CommonInterfacesICodecDeviceInfo" /> class.
        /// </summary>
        /// <param name="capabilities">capabilities.</param>
        /// <param name="adapter">adapter.</param>
        /// <param name="name">name.</param>
        /// <param name="desription">desription.</param>
        /// <param name="driver">driver.</param>
        /// <param name="driverVersion">driverVersion.</param>
        /// <param name="apiVersion">apiVersion.</param>
        /// <param name="vendorId">vendorId.</param>
        /// <param name="deviceId">deviceId.</param>
        /// <param name="deviceIdentifier">deviceIdentifier.</param>
        /// <param name="hardwareContextFramework">hardwareContextFramework.</param>
        /// <param name="devPath">devPath.</param>
        /// <param name="drmNode">drmNode.</param>
        /// <param name="vendorName">vendorName.</param>
        /// <param name="deviceName">deviceName.</param>
        public CommonInterfacesICodecDeviceInfo(CommonInterfacesICodecDeviceCapabilities capabilities = default(CommonInterfacesICodecDeviceCapabilities), int? adapter = default(int?), string name = default(string), string desription = default(string), string driver = default(string), Version driverVersion = default(Version), Version apiVersion = default(Version), int? vendorId = default(int?), int? deviceId = default(int?), string deviceIdentifier = default(string), SecondaryFrameworks hardwareContextFramework = default(SecondaryFrameworks), string devPath = default(string), string drmNode = default(string), string vendorName = default(string), string deviceName = default(string))
        {
            this.Capabilities = capabilities;
            this.Adapter = adapter;
            this.Name = name;
            this.Desription = desription;
            this.Driver = driver;
            this.DriverVersion = driverVersion;
            this.ApiVersion = apiVersion;
            this.VendorId = vendorId;
            this.DeviceId = deviceId;
            this.DeviceIdentifier = deviceIdentifier;
            this.HardwareContextFramework = hardwareContextFramework;
            this.DevPath = devPath;
            this.DrmNode = drmNode;
            this.VendorName = vendorName;
            this.DeviceName = deviceName;
        }
        
        /// <summary>
        /// Gets or Sets Capabilities
        /// </summary>
        [DataMember(Name="Capabilities", EmitDefaultValue=false)]
        public CommonInterfacesICodecDeviceCapabilities Capabilities { get; set; }

        /// <summary>
        /// Gets or Sets Adapter
        /// </summary>
        [DataMember(Name="Adapter", EmitDefaultValue=false)]
        public int? Adapter { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Desription
        /// </summary>
        [DataMember(Name="Desription", EmitDefaultValue=false)]
        public string Desription { get; set; }

        /// <summary>
        /// Gets or Sets Driver
        /// </summary>
        [DataMember(Name="Driver", EmitDefaultValue=false)]
        public string Driver { get; set; }

        /// <summary>
        /// Gets or Sets DriverVersion
        /// </summary>
        [DataMember(Name="DriverVersion", EmitDefaultValue=false)]
        public Version DriverVersion { get; set; }

        /// <summary>
        /// Gets or Sets ApiVersion
        /// </summary>
        [DataMember(Name="ApiVersion", EmitDefaultValue=false)]
        public Version ApiVersion { get; set; }

        /// <summary>
        /// Gets or Sets VendorId
        /// </summary>
        [DataMember(Name="VendorId", EmitDefaultValue=false)]
        public int? VendorId { get; set; }

        /// <summary>
        /// Gets or Sets DeviceId
        /// </summary>
        [DataMember(Name="DeviceId", EmitDefaultValue=false)]
        public int? DeviceId { get; set; }

        /// <summary>
        /// Gets or Sets DeviceIdentifier
        /// </summary>
        [DataMember(Name="DeviceIdentifier", EmitDefaultValue=false)]
        public string DeviceIdentifier { get; set; }

        /// <summary>
        /// Gets or Sets HardwareContextFramework
        /// </summary>
        [DataMember(Name="HardwareContextFramework", EmitDefaultValue=false)]
        public SecondaryFrameworks HardwareContextFramework { get; set; }

        /// <summary>
        /// Gets or Sets DevPath
        /// </summary>
        [DataMember(Name="DevPath", EmitDefaultValue=false)]
        public string DevPath { get; set; }

        /// <summary>
        /// Gets or Sets DrmNode
        /// </summary>
        [DataMember(Name="DrmNode", EmitDefaultValue=false)]
        public string DrmNode { get; set; }

        /// <summary>
        /// Gets or Sets VendorName
        /// </summary>
        [DataMember(Name="VendorName", EmitDefaultValue=false)]
        public string VendorName { get; set; }

        /// <summary>
        /// Gets or Sets DeviceName
        /// </summary>
        [DataMember(Name="DeviceName", EmitDefaultValue=false)]
        public string DeviceName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CommonInterfacesICodecDeviceInfo {\n");
            sb.Append("  Capabilities: ").Append(Capabilities).Append("\n");
            sb.Append("  Adapter: ").Append(Adapter).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Desription: ").Append(Desription).Append("\n");
            sb.Append("  Driver: ").Append(Driver).Append("\n");
            sb.Append("  DriverVersion: ").Append(DriverVersion).Append("\n");
            sb.Append("  ApiVersion: ").Append(ApiVersion).Append("\n");
            sb.Append("  VendorId: ").Append(VendorId).Append("\n");
            sb.Append("  DeviceId: ").Append(DeviceId).Append("\n");
            sb.Append("  DeviceIdentifier: ").Append(DeviceIdentifier).Append("\n");
            sb.Append("  HardwareContextFramework: ").Append(HardwareContextFramework).Append("\n");
            sb.Append("  DevPath: ").Append(DevPath).Append("\n");
            sb.Append("  DrmNode: ").Append(DrmNode).Append("\n");
            sb.Append("  VendorName: ").Append(VendorName).Append("\n");
            sb.Append("  DeviceName: ").Append(DeviceName).Append("\n");
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
            return this.Equals(input as CommonInterfacesICodecDeviceInfo);
        }

        /// <summary>
        /// Returns true if CommonInterfacesICodecDeviceInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of CommonInterfacesICodecDeviceInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CommonInterfacesICodecDeviceInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Capabilities == input.Capabilities ||
                    (this.Capabilities != null &&
                    this.Capabilities.Equals(input.Capabilities))
                ) && 
                (
                    this.Adapter == input.Adapter ||
                    (this.Adapter != null &&
                    this.Adapter.Equals(input.Adapter))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Desription == input.Desription ||
                    (this.Desription != null &&
                    this.Desription.Equals(input.Desription))
                ) && 
                (
                    this.Driver == input.Driver ||
                    (this.Driver != null &&
                    this.Driver.Equals(input.Driver))
                ) && 
                (
                    this.DriverVersion == input.DriverVersion ||
                    (this.DriverVersion != null &&
                    this.DriverVersion.Equals(input.DriverVersion))
                ) && 
                (
                    this.ApiVersion == input.ApiVersion ||
                    (this.ApiVersion != null &&
                    this.ApiVersion.Equals(input.ApiVersion))
                ) && 
                (
                    this.VendorId == input.VendorId ||
                    (this.VendorId != null &&
                    this.VendorId.Equals(input.VendorId))
                ) && 
                (
                    this.DeviceId == input.DeviceId ||
                    (this.DeviceId != null &&
                    this.DeviceId.Equals(input.DeviceId))
                ) && 
                (
                    this.DeviceIdentifier == input.DeviceIdentifier ||
                    (this.DeviceIdentifier != null &&
                    this.DeviceIdentifier.Equals(input.DeviceIdentifier))
                ) && 
                (
                    this.HardwareContextFramework == input.HardwareContextFramework ||
                    (this.HardwareContextFramework != null &&
                    this.HardwareContextFramework.Equals(input.HardwareContextFramework))
                ) && 
                (
                    this.DevPath == input.DevPath ||
                    (this.DevPath != null &&
                    this.DevPath.Equals(input.DevPath))
                ) && 
                (
                    this.DrmNode == input.DrmNode ||
                    (this.DrmNode != null &&
                    this.DrmNode.Equals(input.DrmNode))
                ) && 
                (
                    this.VendorName == input.VendorName ||
                    (this.VendorName != null &&
                    this.VendorName.Equals(input.VendorName))
                ) && 
                (
                    this.DeviceName == input.DeviceName ||
                    (this.DeviceName != null &&
                    this.DeviceName.Equals(input.DeviceName))
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
                if (this.Capabilities != null)
                    hashCode = hashCode * 59 + this.Capabilities.GetHashCode();
                if (this.Adapter != null)
                    hashCode = hashCode * 59 + this.Adapter.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Desription != null)
                    hashCode = hashCode * 59 + this.Desription.GetHashCode();
                if (this.Driver != null)
                    hashCode = hashCode * 59 + this.Driver.GetHashCode();
                if (this.DriverVersion != null)
                    hashCode = hashCode * 59 + this.DriverVersion.GetHashCode();
                if (this.ApiVersion != null)
                    hashCode = hashCode * 59 + this.ApiVersion.GetHashCode();
                if (this.VendorId != null)
                    hashCode = hashCode * 59 + this.VendorId.GetHashCode();
                if (this.DeviceId != null)
                    hashCode = hashCode * 59 + this.DeviceId.GetHashCode();
                if (this.DeviceIdentifier != null)
                    hashCode = hashCode * 59 + this.DeviceIdentifier.GetHashCode();
                if (this.HardwareContextFramework != null)
                    hashCode = hashCode * 59 + this.HardwareContextFramework.GetHashCode();
                if (this.DevPath != null)
                    hashCode = hashCode * 59 + this.DevPath.GetHashCode();
                if (this.DrmNode != null)
                    hashCode = hashCode * 59 + this.DrmNode.GetHashCode();
                if (this.VendorName != null)
                    hashCode = hashCode * 59 + this.VendorName.GetHashCode();
                if (this.DeviceName != null)
                    hashCode = hashCode * 59 + this.DeviceName.GetHashCode();
                return hashCode;
            }
        }

    }
}
