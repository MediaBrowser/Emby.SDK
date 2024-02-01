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
    /// EditObjectContainer
    /// </summary>
    [DataContract]
        public partial class EditObjectContainer :  IEquatable<EditObjectContainer>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EditObjectContainer" /> class.
        /// </summary>
        /// <param name="_object">_object.</param>
        /// <param name="defaultObject">defaultObject.</param>
        /// <param name="typeName">typeName.</param>
        /// <param name="editorRoot">editorRoot.</param>
        public EditObjectContainer(Object _object = default(Object), Object defaultObject = default(Object), string typeName = default(string), EditorsEditorRoot editorRoot = default(EditorsEditorRoot))
        {
            this._Object = _object;
            this.DefaultObject = defaultObject;
            this.TypeName = typeName;
            this.EditorRoot = editorRoot;
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
        /// Gets or Sets EditorRoot
        /// </summary>
        [DataMember(Name="EditorRoot", EmitDefaultValue=false)]
        public EditorsEditorRoot EditorRoot { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EditObjectContainer {\n");
            sb.Append("  _Object: ").Append(_Object).Append("\n");
            sb.Append("  DefaultObject: ").Append(DefaultObject).Append("\n");
            sb.Append("  TypeName: ").Append(TypeName).Append("\n");
            sb.Append("  EditorRoot: ").Append(EditorRoot).Append("\n");
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
            return this.Equals(input as EditObjectContainer);
        }

        /// <summary>
        /// Returns true if EditObjectContainer instances are equal
        /// </summary>
        /// <param name="input">Instance of EditObjectContainer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EditObjectContainer input)
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
                ) && 
                (
                    this.EditorRoot == input.EditorRoot ||
                    (this.EditorRoot != null &&
                    this.EditorRoot.Equals(input.EditorRoot))
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
                if (this.EditorRoot != null)
                    hashCode = hashCode * 59 + this.EditorRoot.GetHashCode();
                return hashCode;
            }
        }

    }
}
