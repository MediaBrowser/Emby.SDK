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
    /// UpdatesPackageVersionInfo
    /// </summary>
    [DataContract]
        public partial class UpdatesPackageVersionInfo :  IEquatable<UpdatesPackageVersionInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdatesPackageVersionInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="guid">guid.</param>
        /// <param name="versionStr">versionStr.</param>
        /// <param name="classification">classification.</param>
        /// <param name="description">description.</param>
        /// <param name="requiredVersionStr">requiredVersionStr.</param>
        /// <param name="sourceUrl">sourceUrl.</param>
        /// <param name="checksum">checksum.</param>
        /// <param name="targetFilename">targetFilename.</param>
        /// <param name="infoUrl">infoUrl.</param>
        /// <param name="runtimes">runtimes.</param>
        public UpdatesPackageVersionInfo(string name = default(string), string guid = default(string), string versionStr = default(string), UpdatesPackageVersionClass classification = default(UpdatesPackageVersionClass), string description = default(string), string requiredVersionStr = default(string), string sourceUrl = default(string), string checksum = default(string), string targetFilename = default(string), string infoUrl = default(string), string runtimes = default(string))
        {
            this.Name = name;
            this.Guid = guid;
            this.VersionStr = versionStr;
            this.Classification = classification;
            this.Description = description;
            this.RequiredVersionStr = requiredVersionStr;
            this.SourceUrl = sourceUrl;
            this.Checksum = checksum;
            this.TargetFilename = targetFilename;
            this.InfoUrl = infoUrl;
            this.Runtimes = runtimes;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Guid
        /// </summary>
        [DataMember(Name="guid", EmitDefaultValue=false)]
        public string Guid { get; set; }

        /// <summary>
        /// Gets or Sets VersionStr
        /// </summary>
        [DataMember(Name="versionStr", EmitDefaultValue=false)]
        public string VersionStr { get; set; }

        /// <summary>
        /// Gets or Sets Classification
        /// </summary>
        [DataMember(Name="classification", EmitDefaultValue=false)]
        public UpdatesPackageVersionClass Classification { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets RequiredVersionStr
        /// </summary>
        [DataMember(Name="requiredVersionStr", EmitDefaultValue=false)]
        public string RequiredVersionStr { get; set; }

        /// <summary>
        /// Gets or Sets SourceUrl
        /// </summary>
        [DataMember(Name="sourceUrl", EmitDefaultValue=false)]
        public string SourceUrl { get; set; }

        /// <summary>
        /// Gets or Sets Checksum
        /// </summary>
        [DataMember(Name="checksum", EmitDefaultValue=false)]
        public string Checksum { get; set; }

        /// <summary>
        /// Gets or Sets TargetFilename
        /// </summary>
        [DataMember(Name="targetFilename", EmitDefaultValue=false)]
        public string TargetFilename { get; set; }

        /// <summary>
        /// Gets or Sets InfoUrl
        /// </summary>
        [DataMember(Name="infoUrl", EmitDefaultValue=false)]
        public string InfoUrl { get; set; }

        /// <summary>
        /// Gets or Sets Runtimes
        /// </summary>
        [DataMember(Name="runtimes", EmitDefaultValue=false)]
        public string Runtimes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdatesPackageVersionInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  VersionStr: ").Append(VersionStr).Append("\n");
            sb.Append("  Classification: ").Append(Classification).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  RequiredVersionStr: ").Append(RequiredVersionStr).Append("\n");
            sb.Append("  SourceUrl: ").Append(SourceUrl).Append("\n");
            sb.Append("  Checksum: ").Append(Checksum).Append("\n");
            sb.Append("  TargetFilename: ").Append(TargetFilename).Append("\n");
            sb.Append("  InfoUrl: ").Append(InfoUrl).Append("\n");
            sb.Append("  Runtimes: ").Append(Runtimes).Append("\n");
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
            return this.Equals(input as UpdatesPackageVersionInfo);
        }

        /// <summary>
        /// Returns true if UpdatesPackageVersionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdatesPackageVersionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdatesPackageVersionInfo input)
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
                    this.Guid == input.Guid ||
                    (this.Guid != null &&
                    this.Guid.Equals(input.Guid))
                ) && 
                (
                    this.VersionStr == input.VersionStr ||
                    (this.VersionStr != null &&
                    this.VersionStr.Equals(input.VersionStr))
                ) && 
                (
                    this.Classification == input.Classification ||
                    (this.Classification != null &&
                    this.Classification.Equals(input.Classification))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.RequiredVersionStr == input.RequiredVersionStr ||
                    (this.RequiredVersionStr != null &&
                    this.RequiredVersionStr.Equals(input.RequiredVersionStr))
                ) && 
                (
                    this.SourceUrl == input.SourceUrl ||
                    (this.SourceUrl != null &&
                    this.SourceUrl.Equals(input.SourceUrl))
                ) && 
                (
                    this.Checksum == input.Checksum ||
                    (this.Checksum != null &&
                    this.Checksum.Equals(input.Checksum))
                ) && 
                (
                    this.TargetFilename == input.TargetFilename ||
                    (this.TargetFilename != null &&
                    this.TargetFilename.Equals(input.TargetFilename))
                ) && 
                (
                    this.InfoUrl == input.InfoUrl ||
                    (this.InfoUrl != null &&
                    this.InfoUrl.Equals(input.InfoUrl))
                ) && 
                (
                    this.Runtimes == input.Runtimes ||
                    (this.Runtimes != null &&
                    this.Runtimes.Equals(input.Runtimes))
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
                if (this.Guid != null)
                    hashCode = hashCode * 59 + this.Guid.GetHashCode();
                if (this.VersionStr != null)
                    hashCode = hashCode * 59 + this.VersionStr.GetHashCode();
                if (this.Classification != null)
                    hashCode = hashCode * 59 + this.Classification.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.RequiredVersionStr != null)
                    hashCode = hashCode * 59 + this.RequiredVersionStr.GetHashCode();
                if (this.SourceUrl != null)
                    hashCode = hashCode * 59 + this.SourceUrl.GetHashCode();
                if (this.Checksum != null)
                    hashCode = hashCode * 59 + this.Checksum.GetHashCode();
                if (this.TargetFilename != null)
                    hashCode = hashCode * 59 + this.TargetFilename.GetHashCode();
                if (this.InfoUrl != null)
                    hashCode = hashCode * 59 + this.InfoUrl.GetHashCode();
                if (this.Runtimes != null)
                    hashCode = hashCode * 59 + this.Runtimes.GetHashCode();
                return hashCode;
            }
        }

    }
}
