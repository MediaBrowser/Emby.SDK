/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.3
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// EmbyPluginGenericEditDemoDataDemoTypeInfo
    /// </summary>
    [DataContract]
        public partial class EmbyPluginGenericEditDemoDataDemoTypeInfo :  IEquatable<EmbyPluginGenericEditDemoDataDemoTypeInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyPluginGenericEditDemoDataDemoTypeInfo" /> class.
        /// </summary>
        /// <param name="demoType">demoType.</param>
        /// <param name="name">name.</param>
        public EmbyPluginGenericEditDemoDataDemoTypeInfo(int? demoType = default(int?), string name = default(string))
        {
            this.DemoType = demoType;
            this.Name = name;
        }
        
        /// <summary>
        /// Gets or Sets DemoType
        /// </summary>
        [DataMember(Name="DemoType", EmitDefaultValue=false)]
        public int? DemoType { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyPluginGenericEditDemoDataDemoTypeInfo {\n");
            sb.Append("  DemoType: ").Append(DemoType).Append("\n");
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
            return this.Equals(input as EmbyPluginGenericEditDemoDataDemoTypeInfo);
        }

        /// <summary>
        /// Returns true if EmbyPluginGenericEditDemoDataDemoTypeInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyPluginGenericEditDemoDataDemoTypeInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyPluginGenericEditDemoDataDemoTypeInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DemoType == input.DemoType ||
                    (this.DemoType != null &&
                    this.DemoType.Equals(input.DemoType))
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
                if (this.DemoType != null)
                    hashCode = hashCode * 59 + this.DemoType.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                return hashCode;
            }
        }

    }
}
