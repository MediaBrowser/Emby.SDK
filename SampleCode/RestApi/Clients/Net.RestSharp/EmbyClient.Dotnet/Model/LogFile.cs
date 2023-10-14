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
    /// LogFile
    /// </summary>
    [DataContract]
        public partial class LogFile :  IEquatable<LogFile>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LogFile" /> class.
        /// </summary>
        /// <param name="dateCreated">The date created..</param>
        /// <param name="dateModified">The date modified..</param>
        /// <param name="size">The size..</param>
        /// <param name="name">The name..</param>
        public LogFile(DateTimeOffset? dateCreated = default(DateTimeOffset?), DateTimeOffset? dateModified = default(DateTimeOffset?), long? size = default(long?), string name = default(string))
        {
            this.DateCreated = dateCreated;
            this.DateModified = dateModified;
            this.Size = size;
            this.Name = name;
        }
        
        /// <summary>
        /// The date created.
        /// </summary>
        /// <value>The date created.</value>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// The date modified.
        /// </summary>
        /// <value>The date modified.</value>
        [DataMember(Name="DateModified", EmitDefaultValue=false)]
        public DateTimeOffset? DateModified { get; set; }

        /// <summary>
        /// The size.
        /// </summary>
        /// <value>The size.</value>
        [DataMember(Name="Size", EmitDefaultValue=false)]
        public long? Size { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LogFile {\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  DateModified: ").Append(DateModified).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as LogFile);
        }

        /// <summary>
        /// Returns true if LogFile instances are equal
        /// </summary>
        /// <param name="input">Instance of LogFile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LogFile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.DateModified == input.DateModified ||
                    (this.DateModified != null &&
                    this.DateModified.Equals(input.DateModified))
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.DateModified != null)
                    hashCode = hashCode * 59 + this.DateModified.GetHashCode();
                if (this.Size != null)
                    hashCode = hashCode * 59 + this.Size.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                return hashCode;
            }
        }

    }
}
