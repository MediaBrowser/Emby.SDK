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
    /// BaseRefreshRequest
    /// </summary>
    [DataContract]
        public partial class BaseRefreshRequest :  IEquatable<BaseRefreshRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BaseRefreshRequest" /> class.
        /// </summary>
        /// <param name="replaceThumbnailImages">replaceThumbnailImages.</param>
        public BaseRefreshRequest(bool? replaceThumbnailImages = default(bool?))
        {
            this.ReplaceThumbnailImages = replaceThumbnailImages;
        }
        
        /// <summary>
        /// Gets or Sets ReplaceThumbnailImages
        /// </summary>
        [DataMember(Name="ReplaceThumbnailImages", EmitDefaultValue=false)]
        public bool? ReplaceThumbnailImages { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BaseRefreshRequest {\n");
            sb.Append("  ReplaceThumbnailImages: ").Append(ReplaceThumbnailImages).Append("\n");
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
            return this.Equals(input as BaseRefreshRequest);
        }

        /// <summary>
        /// Returns true if BaseRefreshRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of BaseRefreshRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BaseRefreshRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ReplaceThumbnailImages == input.ReplaceThumbnailImages ||
                    (this.ReplaceThumbnailImages != null &&
                    this.ReplaceThumbnailImages.Equals(input.ReplaceThumbnailImages))
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
                if (this.ReplaceThumbnailImages != null)
                    hashCode = hashCode * 59 + this.ReplaceThumbnailImages.GetHashCode();
                return hashCode;
            }
        }

    }
}
