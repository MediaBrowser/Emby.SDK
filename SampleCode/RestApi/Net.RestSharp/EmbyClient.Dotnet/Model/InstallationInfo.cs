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
    /// Class InstallationInfo  
    /// </summary>
    [DataContract]
        public partial class InstallationInfo :  IEquatable<InstallationInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallationInfo" /> class.
        /// </summary>
        /// <param name="id">The id..</param>
        /// <param name="name">The name..</param>
        /// <param name="assemblyGuid">The assembly guid..</param>
        /// <param name="version">The version..</param>
        /// <param name="updateClass">updateClass.</param>
        /// <param name="percentComplete">The percent complete..</param>
        public InstallationInfo(string id = default(string), string name = default(string), string assemblyGuid = default(string), string version = default(string), PackageVersionClass updateClass = default(PackageVersionClass), double? percentComplete = default(double?))
        {
            this.Id = id;
            this.Name = name;
            this.AssemblyGuid = assemblyGuid;
            this.Version = version;
            this.UpdateClass = updateClass;
            this.PercentComplete = percentComplete;
        }
        
        /// <summary>
        /// The id.
        /// </summary>
        /// <value>The id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The assembly guid.
        /// </summary>
        /// <value>The assembly guid.</value>
        [DataMember(Name="AssemblyGuid", EmitDefaultValue=false)]
        public string AssemblyGuid { get; set; }

        /// <summary>
        /// The version.
        /// </summary>
        /// <value>The version.</value>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// Gets or Sets UpdateClass
        /// </summary>
        [DataMember(Name="UpdateClass", EmitDefaultValue=false)]
        public PackageVersionClass UpdateClass { get; set; }

        /// <summary>
        /// The percent complete.
        /// </summary>
        /// <value>The percent complete.</value>
        [DataMember(Name="PercentComplete", EmitDefaultValue=false)]
        public double? PercentComplete { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InstallationInfo {\n");
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
            return this.Equals(input as InstallationInfo);
        }

        /// <summary>
        /// Returns true if InstallationInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of InstallationInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstallationInfo input)
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
