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
    /// TupleDoubleDouble
    /// </summary>
    [DataContract]
        public partial class TupleDoubleDouble :  IEquatable<TupleDoubleDouble>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TupleDoubleDouble" /> class.
        /// </summary>
        /// <param name="item1">item1.</param>
        /// <param name="item2">item2.</param>
        public TupleDoubleDouble(double? item1 = default(double?), double? item2 = default(double?))
        {
            this.Item1 = item1;
            this.Item2 = item2;
        }
        
        /// <summary>
        /// Gets or Sets Item1
        /// </summary>
        [DataMember(Name="Item1", EmitDefaultValue=false)]
        public double? Item1 { get; set; }

        /// <summary>
        /// Gets or Sets Item2
        /// </summary>
        [DataMember(Name="Item2", EmitDefaultValue=false)]
        public double? Item2 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TupleDoubleDouble {\n");
            sb.Append("  Item1: ").Append(Item1).Append("\n");
            sb.Append("  Item2: ").Append(Item2).Append("\n");
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
            return this.Equals(input as TupleDoubleDouble);
        }

        /// <summary>
        /// Returns true if TupleDoubleDouble instances are equal
        /// </summary>
        /// <param name="input">Instance of TupleDoubleDouble to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TupleDoubleDouble input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Item1 == input.Item1 ||
                    (this.Item1 != null &&
                    this.Item1.Equals(input.Item1))
                ) && 
                (
                    this.Item2 == input.Item2 ||
                    (this.Item2 != null &&
                    this.Item2.Equals(input.Item2))
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
                if (this.Item1 != null)
                    hashCode = hashCode * 59 + this.Item1.GetHashCode();
                if (this.Item2 != null)
                    hashCode = hashCode * 59 + this.Item2.GetHashCode();
                return hashCode;
            }
        }

    }
}
