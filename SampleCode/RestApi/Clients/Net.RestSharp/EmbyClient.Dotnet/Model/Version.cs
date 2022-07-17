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
    /// Version
    /// </summary>
    [DataContract]
        public partial class Version :  IEquatable<Version>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Version" /> class.
        /// </summary>
        /// <param name="major">major.</param>
        /// <param name="minor">minor.</param>
        /// <param name="build">build.</param>
        /// <param name="revision">revision.</param>
        /// <param name="majorRevision">majorRevision.</param>
        /// <param name="minorRevision">minorRevision.</param>
        public Version(int? major = default(int?), int? minor = default(int?), int? build = default(int?), int? revision = default(int?), int? majorRevision = default(int?), int? minorRevision = default(int?))
        {
            this.Major = major;
            this.Minor = minor;
            this.Build = build;
            this.Revision = revision;
            this.MajorRevision = majorRevision;
            this.MinorRevision = minorRevision;
        }
        
        /// <summary>
        /// Gets or Sets Major
        /// </summary>
        [DataMember(Name="Major", EmitDefaultValue=false)]
        public int? Major { get; set; }

        /// <summary>
        /// Gets or Sets Minor
        /// </summary>
        [DataMember(Name="Minor", EmitDefaultValue=false)]
        public int? Minor { get; set; }

        /// <summary>
        /// Gets or Sets Build
        /// </summary>
        [DataMember(Name="Build", EmitDefaultValue=false)]
        public int? Build { get; set; }

        /// <summary>
        /// Gets or Sets Revision
        /// </summary>
        [DataMember(Name="Revision", EmitDefaultValue=false)]
        public int? Revision { get; set; }

        /// <summary>
        /// Gets or Sets MajorRevision
        /// </summary>
        [DataMember(Name="MajorRevision", EmitDefaultValue=false)]
        public int? MajorRevision { get; set; }

        /// <summary>
        /// Gets or Sets MinorRevision
        /// </summary>
        [DataMember(Name="MinorRevision", EmitDefaultValue=false)]
        public int? MinorRevision { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Version {\n");
            sb.Append("  Major: ").Append(Major).Append("\n");
            sb.Append("  Minor: ").Append(Minor).Append("\n");
            sb.Append("  Build: ").Append(Build).Append("\n");
            sb.Append("  Revision: ").Append(Revision).Append("\n");
            sb.Append("  MajorRevision: ").Append(MajorRevision).Append("\n");
            sb.Append("  MinorRevision: ").Append(MinorRevision).Append("\n");
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
            return this.Equals(input as Version);
        }

        /// <summary>
        /// Returns true if Version instances are equal
        /// </summary>
        /// <param name="input">Instance of Version to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Version input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Major == input.Major ||
                    (this.Major != null &&
                    this.Major.Equals(input.Major))
                ) && 
                (
                    this.Minor == input.Minor ||
                    (this.Minor != null &&
                    this.Minor.Equals(input.Minor))
                ) && 
                (
                    this.Build == input.Build ||
                    (this.Build != null &&
                    this.Build.Equals(input.Build))
                ) && 
                (
                    this.Revision == input.Revision ||
                    (this.Revision != null &&
                    this.Revision.Equals(input.Revision))
                ) && 
                (
                    this.MajorRevision == input.MajorRevision ||
                    (this.MajorRevision != null &&
                    this.MajorRevision.Equals(input.MajorRevision))
                ) && 
                (
                    this.MinorRevision == input.MinorRevision ||
                    (this.MinorRevision != null &&
                    this.MinorRevision.Equals(input.MinorRevision))
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
                if (this.Major != null)
                    hashCode = hashCode * 59 + this.Major.GetHashCode();
                if (this.Minor != null)
                    hashCode = hashCode * 59 + this.Minor.GetHashCode();
                if (this.Build != null)
                    hashCode = hashCode * 59 + this.Build.GetHashCode();
                if (this.Revision != null)
                    hashCode = hashCode * 59 + this.Revision.GetHashCode();
                if (this.MajorRevision != null)
                    hashCode = hashCode * 59 + this.MajorRevision.GetHashCode();
                if (this.MinorRevision != null)
                    hashCode = hashCode * 59 + this.MinorRevision.GetHashCode();
                return hashCode;
            }
        }

    }
}
