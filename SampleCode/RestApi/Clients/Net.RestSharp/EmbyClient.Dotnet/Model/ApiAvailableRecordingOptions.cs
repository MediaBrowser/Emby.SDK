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
    /// ApiAvailableRecordingOptions
    /// </summary>
    [DataContract]
        public partial class ApiAvailableRecordingOptions :  IEquatable<ApiAvailableRecordingOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiAvailableRecordingOptions" /> class.
        /// </summary>
        /// <param name="recordingFolders">recordingFolders.</param>
        /// <param name="movieRecordingFolders">movieRecordingFolders.</param>
        /// <param name="seriesRecordingFolders">seriesRecordingFolders.</param>
        public ApiAvailableRecordingOptions(List<ApiNameIdDescriptionPair> recordingFolders = default(List<ApiNameIdDescriptionPair>), List<ApiNameIdDescriptionPair> movieRecordingFolders = default(List<ApiNameIdDescriptionPair>), List<ApiNameIdDescriptionPair> seriesRecordingFolders = default(List<ApiNameIdDescriptionPair>))
        {
            this.RecordingFolders = recordingFolders;
            this.MovieRecordingFolders = movieRecordingFolders;
            this.SeriesRecordingFolders = seriesRecordingFolders;
        }
        
        /// <summary>
        /// Gets or Sets RecordingFolders
        /// </summary>
        [DataMember(Name="RecordingFolders", EmitDefaultValue=false)]
        public List<ApiNameIdDescriptionPair> RecordingFolders { get; set; }

        /// <summary>
        /// Gets or Sets MovieRecordingFolders
        /// </summary>
        [DataMember(Name="MovieRecordingFolders", EmitDefaultValue=false)]
        public List<ApiNameIdDescriptionPair> MovieRecordingFolders { get; set; }

        /// <summary>
        /// Gets or Sets SeriesRecordingFolders
        /// </summary>
        [DataMember(Name="SeriesRecordingFolders", EmitDefaultValue=false)]
        public List<ApiNameIdDescriptionPair> SeriesRecordingFolders { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiAvailableRecordingOptions {\n");
            sb.Append("  RecordingFolders: ").Append(RecordingFolders).Append("\n");
            sb.Append("  MovieRecordingFolders: ").Append(MovieRecordingFolders).Append("\n");
            sb.Append("  SeriesRecordingFolders: ").Append(SeriesRecordingFolders).Append("\n");
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
            return this.Equals(input as ApiAvailableRecordingOptions);
        }

        /// <summary>
        /// Returns true if ApiAvailableRecordingOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiAvailableRecordingOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiAvailableRecordingOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RecordingFolders == input.RecordingFolders ||
                    this.RecordingFolders != null &&
                    input.RecordingFolders != null &&
                    this.RecordingFolders.SequenceEqual(input.RecordingFolders)
                ) && 
                (
                    this.MovieRecordingFolders == input.MovieRecordingFolders ||
                    this.MovieRecordingFolders != null &&
                    input.MovieRecordingFolders != null &&
                    this.MovieRecordingFolders.SequenceEqual(input.MovieRecordingFolders)
                ) && 
                (
                    this.SeriesRecordingFolders == input.SeriesRecordingFolders ||
                    this.SeriesRecordingFolders != null &&
                    input.SeriesRecordingFolders != null &&
                    this.SeriesRecordingFolders.SequenceEqual(input.SeriesRecordingFolders)
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
                if (this.RecordingFolders != null)
                    hashCode = hashCode * 59 + this.RecordingFolders.GetHashCode();
                if (this.MovieRecordingFolders != null)
                    hashCode = hashCode * 59 + this.MovieRecordingFolders.GetHashCode();
                if (this.SeriesRecordingFolders != null)
                    hashCode = hashCode * 59 + this.SeriesRecordingFolders.GetHashCode();
                return hashCode;
            }
        }

    }
}
