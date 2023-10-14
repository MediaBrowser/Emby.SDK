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
    /// LiveTvKeywordInfo
    /// </summary>
    [DataContract]
        public partial class LiveTvKeywordInfo :  IEquatable<LiveTvKeywordInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvKeywordInfo" /> class.
        /// </summary>
        /// <param name="keywordType">keywordType.</param>
        /// <param name="keyword">keyword.</param>
        public LiveTvKeywordInfo(LiveTvKeywordType keywordType = default(LiveTvKeywordType), string keyword = default(string))
        {
            this.KeywordType = keywordType;
            this.Keyword = keyword;
        }
        
        /// <summary>
        /// Gets or Sets KeywordType
        /// </summary>
        [DataMember(Name="KeywordType", EmitDefaultValue=false)]
        public LiveTvKeywordType KeywordType { get; set; }

        /// <summary>
        /// Gets or Sets Keyword
        /// </summary>
        [DataMember(Name="Keyword", EmitDefaultValue=false)]
        public string Keyword { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvKeywordInfo {\n");
            sb.Append("  KeywordType: ").Append(KeywordType).Append("\n");
            sb.Append("  Keyword: ").Append(Keyword).Append("\n");
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
            return this.Equals(input as LiveTvKeywordInfo);
        }

        /// <summary>
        /// Returns true if LiveTvKeywordInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvKeywordInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvKeywordInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.KeywordType == input.KeywordType ||
                    (this.KeywordType != null &&
                    this.KeywordType.Equals(input.KeywordType))
                ) && 
                (
                    this.Keyword == input.Keyword ||
                    (this.Keyword != null &&
                    this.Keyword.Equals(input.Keyword))
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
                if (this.KeywordType != null)
                    hashCode = hashCode * 59 + this.KeywordType.GetHashCode();
                if (this.Keyword != null)
                    hashCode = hashCode * 59 + this.Keyword.GetHashCode();
                return hashCode;
            }
        }

    }
}
