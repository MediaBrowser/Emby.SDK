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
    /// GenericEditIEditObjectContainer
    /// </summary>
    [DataContract]
        public partial class GenericEditIEditObjectContainer :  IEquatable<GenericEditIEditObjectContainer>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GenericEditIEditObjectContainer" /> class.
        /// </summary>
        /// <param name="_object">_object.</param>
        /// <param name="defaultObject">defaultObject.</param>
        /// <param name="typeName">typeName.</param>
        public GenericEditIEditObjectContainer(Object _object = default(Object), Object defaultObject = default(Object), string typeName = default(string))
        {
            this._Object = _object;
            this.DefaultObject = defaultObject;
            this.TypeName = typeName;
        }
        
        /// <summary>
        /// Gets or Sets _Object
        /// </summary>
        [DataMember(Name="Object", EmitDefaultValue=false)]
        public Object _Object { get; set; }

        /// <summary>
        /// Gets or Sets DefaultObject
        /// </summary>
        [DataMember(Name="DefaultObject", EmitDefaultValue=false)]
        public Object DefaultObject { get; set; }

        /// <summary>
        /// Gets or Sets TypeName
        /// </summary>
        [DataMember(Name="TypeName", EmitDefaultValue=false)]
        public string TypeName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GenericEditIEditObjectContainer {\n");
            sb.Append("  _Object: ").Append(_Object).Append("\n");
            sb.Append("  DefaultObject: ").Append(DefaultObject).Append("\n");
            sb.Append("  TypeName: ").Append(TypeName).Append("\n");
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
            return this.Equals(input as GenericEditIEditObjectContainer);
        }

        /// <summary>
        /// Returns true if GenericEditIEditObjectContainer instances are equal
        /// </summary>
        /// <param name="input">Instance of GenericEditIEditObjectContainer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GenericEditIEditObjectContainer input)
        {
            if (input == null)
                return false;

            return 
                (
                    this._Object == input._Object ||
                    (this._Object != null &&
                    this._Object.Equals(input._Object))
                ) && 
                (
                    this.DefaultObject == input.DefaultObject ||
                    (this.DefaultObject != null &&
                    this.DefaultObject.Equals(input.DefaultObject))
                ) && 
                (
                    this.TypeName == input.TypeName ||
                    (this.TypeName != null &&
                    this.TypeName.Equals(input.TypeName))
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
                if (this._Object != null)
                    hashCode = hashCode * 59 + this._Object.GetHashCode();
                if (this.DefaultObject != null)
                    hashCode = hashCode * 59 + this.DefaultObject.GetHashCode();
                if (this.TypeName != null)
                    hashCode = hashCode * 59 + this.TypeName.GetHashCode();
                return hashCode;
            }
        }

    }
}
