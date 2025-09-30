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
    /// AllThemeMediaResult
    /// </summary>
    [DataContract]
        public partial class AllThemeMediaResult :  IEquatable<AllThemeMediaResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AllThemeMediaResult" /> class.
        /// </summary>
        /// <param name="themeVideosResult">themeVideosResult.</param>
        /// <param name="themeSongsResult">themeSongsResult.</param>
        /// <param name="soundtrackSongsResult">soundtrackSongsResult.</param>
        public AllThemeMediaResult(ThemeMediaResult themeVideosResult = default(ThemeMediaResult), ThemeMediaResult themeSongsResult = default(ThemeMediaResult), ThemeMediaResult soundtrackSongsResult = default(ThemeMediaResult))
        {
            this.ThemeVideosResult = themeVideosResult;
            this.ThemeSongsResult = themeSongsResult;
            this.SoundtrackSongsResult = soundtrackSongsResult;
        }
        
        /// <summary>
        /// Gets or Sets ThemeVideosResult
        /// </summary>
        [DataMember(Name="ThemeVideosResult", EmitDefaultValue=false)]
        public ThemeMediaResult ThemeVideosResult { get; set; }

        /// <summary>
        /// Gets or Sets ThemeSongsResult
        /// </summary>
        [DataMember(Name="ThemeSongsResult", EmitDefaultValue=false)]
        public ThemeMediaResult ThemeSongsResult { get; set; }

        /// <summary>
        /// Gets or Sets SoundtrackSongsResult
        /// </summary>
        [DataMember(Name="SoundtrackSongsResult", EmitDefaultValue=false)]
        public ThemeMediaResult SoundtrackSongsResult { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AllThemeMediaResult {\n");
            sb.Append("  ThemeVideosResult: ").Append(ThemeVideosResult).Append("\n");
            sb.Append("  ThemeSongsResult: ").Append(ThemeSongsResult).Append("\n");
            sb.Append("  SoundtrackSongsResult: ").Append(SoundtrackSongsResult).Append("\n");
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
            return this.Equals(input as AllThemeMediaResult);
        }

        /// <summary>
        /// Returns true if AllThemeMediaResult instances are equal
        /// </summary>
        /// <param name="input">Instance of AllThemeMediaResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AllThemeMediaResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ThemeVideosResult == input.ThemeVideosResult ||
                    (this.ThemeVideosResult != null &&
                    this.ThemeVideosResult.Equals(input.ThemeVideosResult))
                ) && 
                (
                    this.ThemeSongsResult == input.ThemeSongsResult ||
                    (this.ThemeSongsResult != null &&
                    this.ThemeSongsResult.Equals(input.ThemeSongsResult))
                ) && 
                (
                    this.SoundtrackSongsResult == input.SoundtrackSongsResult ||
                    (this.SoundtrackSongsResult != null &&
                    this.SoundtrackSongsResult.Equals(input.SoundtrackSongsResult))
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
                if (this.ThemeVideosResult != null)
                    hashCode = hashCode * 59 + this.ThemeVideosResult.GetHashCode();
                if (this.ThemeSongsResult != null)
                    hashCode = hashCode * 59 + this.ThemeSongsResult.GetHashCode();
                if (this.SoundtrackSongsResult != null)
                    hashCode = hashCode * 59 + this.SoundtrackSongsResult.GetHashCode();
                return hashCode;
            }
        }

    }
}
