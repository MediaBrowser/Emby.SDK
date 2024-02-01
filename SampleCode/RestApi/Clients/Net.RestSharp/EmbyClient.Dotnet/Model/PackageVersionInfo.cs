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
    /// Class PackageVersionInfo  
    /// </summary>
    [DataContract]
        public partial class PackageVersionInfo :  IEquatable<PackageVersionInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PackageVersionInfo" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="guid">The guid..</param>
        /// <param name="versionStr">The version STR..</param>
        /// <param name="classification">classification.</param>
        /// <param name="description">The description..</param>
        /// <param name="requiredVersionStr">The required version STR..</param>
        /// <param name="sourceUrl">The source URL..</param>
        /// <param name="checksum">The source URL..</param>
        /// <param name="targetFilename">The target filename..</param>
        /// <param name="infoUrl">infoUrl.</param>
        /// <param name="runtimes">runtimes.</param>
        /// <param name="timestamp">timestamp.</param>
        public PackageVersionInfo(string name = default(string), string guid = default(string), string versionStr = default(string), PackageVersionClass classification = default(PackageVersionClass), string description = default(string), string requiredVersionStr = default(string), string sourceUrl = default(string), string checksum = default(string), string targetFilename = default(string), string infoUrl = default(string), string runtimes = default(string), DateTimeOffset? timestamp = default(DateTimeOffset?))
        {
            this.name = name;
            this.guid = guid;
            this.versionStr = versionStr;
            this.classification = classification;
            this.description = description;
            this.requiredVersionStr = requiredVersionStr;
            this.sourceUrl = sourceUrl;
            this.checksum = checksum;
            this.targetFilename = targetFilename;
            this.infoUrl = infoUrl;
            this.runtimes = runtimes;
            this.timestamp = timestamp;
        }
        
        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string name { get; set; }

        /// <summary>
        /// The guid.
        /// </summary>
        /// <value>The guid.</value>
        [DataMember(Name="guid", EmitDefaultValue=false)]
        public string guid { get; set; }

        /// <summary>
        /// The version STR.
        /// </summary>
        /// <value>The version STR.</value>
        [DataMember(Name="versionStr", EmitDefaultValue=false)]
        public string versionStr { get; set; }

        /// <summary>
        /// Gets or Sets classification
        /// </summary>
        [DataMember(Name="classification", EmitDefaultValue=false)]
        public PackageVersionClass classification { get; set; }

        /// <summary>
        /// The description.
        /// </summary>
        /// <value>The description.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string description { get; set; }

        /// <summary>
        /// The required version STR.
        /// </summary>
        /// <value>The required version STR.</value>
        [DataMember(Name="requiredVersionStr", EmitDefaultValue=false)]
        public string requiredVersionStr { get; set; }

        /// <summary>
        /// The source URL.
        /// </summary>
        /// <value>The source URL.</value>
        [DataMember(Name="sourceUrl", EmitDefaultValue=false)]
        public string sourceUrl { get; set; }

        /// <summary>
        /// The source URL.
        /// </summary>
        /// <value>The source URL.</value>
        [DataMember(Name="checksum", EmitDefaultValue=false)]
        public string checksum { get; set; }

        /// <summary>
        /// The target filename.
        /// </summary>
        /// <value>The target filename.</value>
        [DataMember(Name="targetFilename", EmitDefaultValue=false)]
        public string targetFilename { get; set; }

        /// <summary>
        /// Gets or Sets infoUrl
        /// </summary>
        [DataMember(Name="infoUrl", EmitDefaultValue=false)]
        public string infoUrl { get; set; }

        /// <summary>
        /// Gets or Sets runtimes
        /// </summary>
        [DataMember(Name="runtimes", EmitDefaultValue=false)]
        public string runtimes { get; set; }

        /// <summary>
        /// Gets or Sets timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public DateTimeOffset? timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PackageVersionInfo {\n");
            sb.Append("  name: ").Append(name).Append("\n");
            sb.Append("  guid: ").Append(guid).Append("\n");
            sb.Append("  versionStr: ").Append(versionStr).Append("\n");
            sb.Append("  classification: ").Append(classification).Append("\n");
            sb.Append("  description: ").Append(description).Append("\n");
            sb.Append("  requiredVersionStr: ").Append(requiredVersionStr).Append("\n");
            sb.Append("  sourceUrl: ").Append(sourceUrl).Append("\n");
            sb.Append("  checksum: ").Append(checksum).Append("\n");
            sb.Append("  targetFilename: ").Append(targetFilename).Append("\n");
            sb.Append("  infoUrl: ").Append(infoUrl).Append("\n");
            sb.Append("  runtimes: ").Append(runtimes).Append("\n");
            sb.Append("  timestamp: ").Append(timestamp).Append("\n");
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
            return this.Equals(input as PackageVersionInfo);
        }

        /// <summary>
        /// Returns true if PackageVersionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PackageVersionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PackageVersionInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.name == input.name ||
                    (this.name != null &&
                    this.name.Equals(input.name))
                ) && 
                (
                    this.guid == input.guid ||
                    (this.guid != null &&
                    this.guid.Equals(input.guid))
                ) && 
                (
                    this.versionStr == input.versionStr ||
                    (this.versionStr != null &&
                    this.versionStr.Equals(input.versionStr))
                ) && 
                (
                    this.classification == input.classification ||
                    (this.classification != null &&
                    this.classification.Equals(input.classification))
                ) && 
                (
                    this.description == input.description ||
                    (this.description != null &&
                    this.description.Equals(input.description))
                ) && 
                (
                    this.requiredVersionStr == input.requiredVersionStr ||
                    (this.requiredVersionStr != null &&
                    this.requiredVersionStr.Equals(input.requiredVersionStr))
                ) && 
                (
                    this.sourceUrl == input.sourceUrl ||
                    (this.sourceUrl != null &&
                    this.sourceUrl.Equals(input.sourceUrl))
                ) && 
                (
                    this.checksum == input.checksum ||
                    (this.checksum != null &&
                    this.checksum.Equals(input.checksum))
                ) && 
                (
                    this.targetFilename == input.targetFilename ||
                    (this.targetFilename != null &&
                    this.targetFilename.Equals(input.targetFilename))
                ) && 
                (
                    this.infoUrl == input.infoUrl ||
                    (this.infoUrl != null &&
                    this.infoUrl.Equals(input.infoUrl))
                ) && 
                (
                    this.runtimes == input.runtimes ||
                    (this.runtimes != null &&
                    this.runtimes.Equals(input.runtimes))
                ) && 
                (
                    this.timestamp == input.timestamp ||
                    (this.timestamp != null &&
                    this.timestamp.Equals(input.timestamp))
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
                if (this.name != null)
                    hashCode = hashCode * 59 + this.name.GetHashCode();
                if (this.guid != null)
                    hashCode = hashCode * 59 + this.guid.GetHashCode();
                if (this.versionStr != null)
                    hashCode = hashCode * 59 + this.versionStr.GetHashCode();
                if (this.classification != null)
                    hashCode = hashCode * 59 + this.classification.GetHashCode();
                if (this.description != null)
                    hashCode = hashCode * 59 + this.description.GetHashCode();
                if (this.requiredVersionStr != null)
                    hashCode = hashCode * 59 + this.requiredVersionStr.GetHashCode();
                if (this.sourceUrl != null)
                    hashCode = hashCode * 59 + this.sourceUrl.GetHashCode();
                if (this.checksum != null)
                    hashCode = hashCode * 59 + this.checksum.GetHashCode();
                if (this.targetFilename != null)
                    hashCode = hashCode * 59 + this.targetFilename.GetHashCode();
                if (this.infoUrl != null)
                    hashCode = hashCode * 59 + this.infoUrl.GetHashCode();
                if (this.runtimes != null)
                    hashCode = hashCode * 59 + this.runtimes.GetHashCode();
                if (this.timestamp != null)
                    hashCode = hashCode * 59 + this.timestamp.GetHashCode();
                return hashCode;
            }
        }

    }
}
