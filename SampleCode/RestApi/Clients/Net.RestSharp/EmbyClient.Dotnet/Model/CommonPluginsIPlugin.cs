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
    /// Interface IPlugin  
    /// </summary>
    [DataContract]
        public partial class CommonPluginsIPlugin :  IEquatable<CommonPluginsIPlugin>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CommonPluginsIPlugin" /> class.
        /// </summary>
        /// <param name="name">The name of the plugin.</param>
        /// <param name="description">The description..</param>
        /// <param name="id">The unique id..</param>
        /// <param name="version">version.</param>
        /// <param name="assemblyFilePath">The path to the assembly file.</param>
        /// <param name="dataFolderPath">The full path to the data folder, where the plugin can store any miscellaneous files needed.</param>
        public CommonPluginsIPlugin(string name = default(string), string description = default(string), string id = default(string), Version version = default(Version), string assemblyFilePath = default(string), string dataFolderPath = default(string))
        {
            this.Name = name;
            this.Description = description;
            this.Id = id;
            this.Version = version;
            this.AssemblyFilePath = assemblyFilePath;
            this.DataFolderPath = dataFolderPath;
        }
        
        /// <summary>
        /// The name of the plugin
        /// </summary>
        /// <value>The name of the plugin</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The description.
        /// </summary>
        /// <value>The description.</value>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The unique id.
        /// </summary>
        /// <value>The unique id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Version
        /// </summary>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public Version Version { get; set; }

        /// <summary>
        /// The path to the assembly file
        /// </summary>
        /// <value>The path to the assembly file</value>
        [DataMember(Name="AssemblyFilePath", EmitDefaultValue=false)]
        public string AssemblyFilePath { get; set; }

        /// <summary>
        /// The full path to the data folder, where the plugin can store any miscellaneous files needed
        /// </summary>
        /// <value>The full path to the data folder, where the plugin can store any miscellaneous files needed</value>
        [DataMember(Name="DataFolderPath", EmitDefaultValue=false)]
        public string DataFolderPath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CommonPluginsIPlugin {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  AssemblyFilePath: ").Append(AssemblyFilePath).Append("\n");
            sb.Append("  DataFolderPath: ").Append(DataFolderPath).Append("\n");
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
            return this.Equals(input as CommonPluginsIPlugin);
        }

        /// <summary>
        /// Returns true if CommonPluginsIPlugin instances are equal
        /// </summary>
        /// <param name="input">Instance of CommonPluginsIPlugin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CommonPluginsIPlugin input)
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
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                ) && 
                (
                    this.AssemblyFilePath == input.AssemblyFilePath ||
                    (this.AssemblyFilePath != null &&
                    this.AssemblyFilePath.Equals(input.AssemblyFilePath))
                ) && 
                (
                    this.DataFolderPath == input.DataFolderPath ||
                    (this.DataFolderPath != null &&
                    this.DataFolderPath.Equals(input.DataFolderPath))
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
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.AssemblyFilePath != null)
                    hashCode = hashCode * 59 + this.AssemblyFilePath.GetHashCode();
                if (this.DataFolderPath != null)
                    hashCode = hashCode * 59 + this.DataFolderPath.GetHashCode();
                return hashCode;
            }
        }

    }
}
