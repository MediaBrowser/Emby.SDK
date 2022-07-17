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
    /// PublicSystemInfo
    /// </summary>
    [DataContract]
        public partial class PublicSystemInfo :  IEquatable<PublicSystemInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PublicSystemInfo" /> class.
        /// </summary>
        /// <param name="localAddress">localAddress.</param>
        /// <param name="localAddresses">localAddresses.</param>
        /// <param name="wanAddress">wanAddress.</param>
        /// <param name="remoteAddresses">remoteAddresses.</param>
        /// <param name="serverName">serverName.</param>
        /// <param name="version">version.</param>
        /// <param name="id">id.</param>
        public PublicSystemInfo(string localAddress = default(string), List<string> localAddresses = default(List<string>), string wanAddress = default(string), List<string> remoteAddresses = default(List<string>), string serverName = default(string), string version = default(string), string id = default(string))
        {
            this.LocalAddress = localAddress;
            this.LocalAddresses = localAddresses;
            this.WanAddress = wanAddress;
            this.RemoteAddresses = remoteAddresses;
            this.ServerName = serverName;
            this.Version = version;
            this.Id = id;
        }
        
        /// <summary>
        /// Gets or Sets LocalAddress
        /// </summary>
        [DataMember(Name="LocalAddress", EmitDefaultValue=false)]
        public string LocalAddress { get; set; }

        /// <summary>
        /// Gets or Sets LocalAddresses
        /// </summary>
        [DataMember(Name="LocalAddresses", EmitDefaultValue=false)]
        public List<string> LocalAddresses { get; set; }

        /// <summary>
        /// Gets or Sets WanAddress
        /// </summary>
        [DataMember(Name="WanAddress", EmitDefaultValue=false)]
        public string WanAddress { get; set; }

        /// <summary>
        /// Gets or Sets RemoteAddresses
        /// </summary>
        [DataMember(Name="RemoteAddresses", EmitDefaultValue=false)]
        public List<string> RemoteAddresses { get; set; }

        /// <summary>
        /// Gets or Sets ServerName
        /// </summary>
        [DataMember(Name="ServerName", EmitDefaultValue=false)]
        public string ServerName { get; set; }

        /// <summary>
        /// Gets or Sets Version
        /// </summary>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PublicSystemInfo {\n");
            sb.Append("  LocalAddress: ").Append(LocalAddress).Append("\n");
            sb.Append("  LocalAddresses: ").Append(LocalAddresses).Append("\n");
            sb.Append("  WanAddress: ").Append(WanAddress).Append("\n");
            sb.Append("  RemoteAddresses: ").Append(RemoteAddresses).Append("\n");
            sb.Append("  ServerName: ").Append(ServerName).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as PublicSystemInfo);
        }

        /// <summary>
        /// Returns true if PublicSystemInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PublicSystemInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PublicSystemInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.LocalAddress == input.LocalAddress ||
                    (this.LocalAddress != null &&
                    this.LocalAddress.Equals(input.LocalAddress))
                ) && 
                (
                    this.LocalAddresses == input.LocalAddresses ||
                    this.LocalAddresses != null &&
                    input.LocalAddresses != null &&
                    this.LocalAddresses.SequenceEqual(input.LocalAddresses)
                ) && 
                (
                    this.WanAddress == input.WanAddress ||
                    (this.WanAddress != null &&
                    this.WanAddress.Equals(input.WanAddress))
                ) && 
                (
                    this.RemoteAddresses == input.RemoteAddresses ||
                    this.RemoteAddresses != null &&
                    input.RemoteAddresses != null &&
                    this.RemoteAddresses.SequenceEqual(input.RemoteAddresses)
                ) && 
                (
                    this.ServerName == input.ServerName ||
                    (this.ServerName != null &&
                    this.ServerName.Equals(input.ServerName))
                ) && 
                (
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                if (this.LocalAddress != null)
                    hashCode = hashCode * 59 + this.LocalAddress.GetHashCode();
                if (this.LocalAddresses != null)
                    hashCode = hashCode * 59 + this.LocalAddresses.GetHashCode();
                if (this.WanAddress != null)
                    hashCode = hashCode * 59 + this.WanAddress.GetHashCode();
                if (this.RemoteAddresses != null)
                    hashCode = hashCode * 59 + this.RemoteAddresses.GetHashCode();
                if (this.ServerName != null)
                    hashCode = hashCode * 59 + this.ServerName.GetHashCode();
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                return hashCode;
            }
        }

    }
}
