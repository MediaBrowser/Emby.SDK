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
    /// This is a serializable stub class that is used by the api to provide information about installed plugins.  
    /// </summary>
    [DataContract]
        public partial class PluginsPluginInfo :  IEquatable<PluginsPluginInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PluginsPluginInfo" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="version">The version..</param>
        /// <param name="configurationFileName">The name of the configuration file..</param>
        /// <param name="description">The description..</param>
        /// <param name="id">The unique id..</param>
        /// <param name="imageTag">The image URL..</param>
        public PluginsPluginInfo(string name = default(string), string version = default(string), string configurationFileName = default(string), string description = default(string), string id = default(string), string imageTag = default(string))
        {
            this.Name = name;
            this.Version = version;
            this.ConfigurationFileName = configurationFileName;
            this.Description = description;
            this.Id = id;
            this.ImageTag = imageTag;
        }
        
        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The version.
        /// </summary>
        /// <value>The version.</value>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// The name of the configuration file.
        /// </summary>
        /// <value>The name of the configuration file.</value>
        [DataMember(Name="ConfigurationFileName", EmitDefaultValue=false)]
        public string ConfigurationFileName { get; set; }

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
        /// The image URL.
        /// </summary>
        /// <value>The image URL.</value>
        [DataMember(Name="ImageTag", EmitDefaultValue=false)]
        public string ImageTag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PluginsPluginInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  ConfigurationFileName: ").Append(ConfigurationFileName).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ImageTag: ").Append(ImageTag).Append("\n");
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
            return this.Equals(input as PluginsPluginInfo);
        }

        /// <summary>
        /// Returns true if PluginsPluginInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PluginsPluginInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PluginsPluginInfo input)
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
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                ) && 
                (
                    this.ConfigurationFileName == input.ConfigurationFileName ||
                    (this.ConfigurationFileName != null &&
                    this.ConfigurationFileName.Equals(input.ConfigurationFileName))
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
                    this.ImageTag == input.ImageTag ||
                    (this.ImageTag != null &&
                    this.ImageTag.Equals(input.ImageTag))
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
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.ConfigurationFileName != null)
                    hashCode = hashCode * 59 + this.ConfigurationFileName.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ImageTag != null)
                    hashCode = hashCode * 59 + this.ImageTag.GetHashCode();
                return hashCode;
            }
        }

    }
}
