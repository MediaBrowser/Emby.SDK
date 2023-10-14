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
    /// GeneralCommand
    /// </summary>
    [DataContract]
        public partial class GeneralCommand :  IEquatable<GeneralCommand>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GeneralCommand" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="controllingUserId">controllingUserId.</param>
        /// <param name="arguments">arguments.</param>
        public GeneralCommand(string name = default(string), string controllingUserId = default(string), Dictionary<string, string> arguments = default(Dictionary<string, string>))
        {
            this.Name = name;
            this.ControllingUserId = controllingUserId;
            this.Arguments = arguments;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ControllingUserId
        /// </summary>
        [DataMember(Name="ControllingUserId", EmitDefaultValue=false)]
        public string ControllingUserId { get; set; }

        /// <summary>
        /// Gets or Sets Arguments
        /// </summary>
        [DataMember(Name="Arguments", EmitDefaultValue=false)]
        public Dictionary<string, string> Arguments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GeneralCommand {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ControllingUserId: ").Append(ControllingUserId).Append("\n");
            sb.Append("  Arguments: ").Append(Arguments).Append("\n");
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
            return this.Equals(input as GeneralCommand);
        }

        /// <summary>
        /// Returns true if GeneralCommand instances are equal
        /// </summary>
        /// <param name="input">Instance of GeneralCommand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GeneralCommand input)
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
                    this.ControllingUserId == input.ControllingUserId ||
                    (this.ControllingUserId != null &&
                    this.ControllingUserId.Equals(input.ControllingUserId))
                ) && 
                (
                    this.Arguments == input.Arguments ||
                    this.Arguments != null &&
                    input.Arguments != null &&
                    this.Arguments.SequenceEqual(input.Arguments)
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
                if (this.ControllingUserId != null)
                    hashCode = hashCode * 59 + this.ControllingUserId.GetHashCode();
                if (this.Arguments != null)
                    hashCode = hashCode * 59 + this.Arguments.GetHashCode();
                return hashCode;
            }
        }

    }
}
