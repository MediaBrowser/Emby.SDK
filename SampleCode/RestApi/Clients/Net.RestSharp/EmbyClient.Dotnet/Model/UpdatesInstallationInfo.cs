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
    /// UpdatesInstallationInfo
    /// </summary>
    [DataContract]
        public partial class UpdatesInstallationInfo :  IEquatable<UpdatesInstallationInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdatesInstallationInfo" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="assemblyGuid">assemblyGuid.</param>
        /// <param name="version">version.</param>
        /// <param name="updateClass">updateClass.</param>
        /// <param name="percentComplete">percentComplete.</param>
        public UpdatesInstallationInfo(string id = default(string), string name = default(string), string assemblyGuid = default(string), string version = default(string), UpdatesPackageVersionClass updateClass = default(UpdatesPackageVersionClass), double? percentComplete = default(double?))
        {
            this.Id = id;
            this.Name = name;
            this.AssemblyGuid = assemblyGuid;
            this.Version = version;
            this.UpdateClass = updateClass;
            this.PercentComplete = percentComplete;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets AssemblyGuid
        /// </summary>
        [DataMember(Name="AssemblyGuid", EmitDefaultValue=false)]
        public string AssemblyGuid { get; set; }

        /// <summary>
        /// Gets or Sets Version
        /// </summary>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// Gets or Sets UpdateClass
        /// </summary>
        [DataMember(Name="UpdateClass", EmitDefaultValue=false)]
        public UpdatesPackageVersionClass UpdateClass { get; set; }

        /// <summary>
        /// Gets or Sets PercentComplete
        /// </summary>
        [DataMember(Name="PercentComplete", EmitDefaultValue=false)]
        public double? PercentComplete { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdatesInstallationInfo {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  AssemblyGuid: ").Append(AssemblyGuid).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  UpdateClass: ").Append(UpdateClass).Append("\n");
            sb.Append("  PercentComplete: ").Append(PercentComplete).Append("\n");
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
            return this.Equals(input as UpdatesInstallationInfo);
        }

        /// <summary>
        /// Returns true if UpdatesInstallationInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdatesInstallationInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdatesInstallationInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.AssemblyGuid == input.AssemblyGuid ||
                    (this.AssemblyGuid != null &&
                    this.AssemblyGuid.Equals(input.AssemblyGuid))
                ) && 
                (
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                ) && 
                (
                    this.UpdateClass == input.UpdateClass ||
                    (this.UpdateClass != null &&
                    this.UpdateClass.Equals(input.UpdateClass))
                ) && 
                (
                    this.PercentComplete == input.PercentComplete ||
                    (this.PercentComplete != null &&
                    this.PercentComplete.Equals(input.PercentComplete))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.AssemblyGuid != null)
                    hashCode = hashCode * 59 + this.AssemblyGuid.GetHashCode();
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.UpdateClass != null)
                    hashCode = hashCode * 59 + this.UpdateClass.GetHashCode();
                if (this.PercentComplete != null)
                    hashCode = hashCode * 59 + this.PercentComplete.GetHashCode();
                return hashCode;
            }
        }

    }
}
