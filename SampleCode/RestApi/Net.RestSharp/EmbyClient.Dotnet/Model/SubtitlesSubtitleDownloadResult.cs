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
    /// SubtitlesSubtitleDownloadResult
    /// </summary>
    [DataContract]
        public partial class SubtitlesSubtitleDownloadResult :  IEquatable<SubtitlesSubtitleDownloadResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SubtitlesSubtitleDownloadResult" /> class.
        /// </summary>
        /// <param name="newIndex">newIndex.</param>
        public SubtitlesSubtitleDownloadResult(int? newIndex = default(int?))
        {
            this.NewIndex = newIndex;
        }
        
        /// <summary>
        /// Gets or Sets NewIndex
        /// </summary>
        [DataMember(Name="NewIndex", EmitDefaultValue=false)]
        public int? NewIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SubtitlesSubtitleDownloadResult {\n");
            sb.Append("  NewIndex: ").Append(NewIndex).Append("\n");
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
            return this.Equals(input as SubtitlesSubtitleDownloadResult);
        }

        /// <summary>
        /// Returns true if SubtitlesSubtitleDownloadResult instances are equal
        /// </summary>
        /// <param name="input">Instance of SubtitlesSubtitleDownloadResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SubtitlesSubtitleDownloadResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NewIndex == input.NewIndex ||
                    (this.NewIndex != null &&
                    this.NewIndex.Equals(input.NewIndex))
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
                if (this.NewIndex != null)
                    hashCode = hashCode * 59 + this.NewIndex.GetHashCode();
                return hashCode;
            }
        }

    }
}
