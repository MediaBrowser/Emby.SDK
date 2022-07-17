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
    /// LiveTVApiGetPrograms
    /// </summary>
    [DataContract]
        public partial class LiveTVApiGetPrograms :  IEquatable<LiveTVApiGetPrograms>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTVApiGetPrograms" /> class.
        /// </summary>
        /// <param name="isAiring">isAiring.</param>
        /// <param name="tagIds">tagIds.</param>
        /// <param name="excludeItemIds">excludeItemIds.</param>
        /// <param name="enableTotalRecordCount">enableTotalRecordCount.</param>
        /// <param name="seriesTimerId">seriesTimerId.</param>
        /// <param name="librarySeriesId">librarySeriesId.</param>
        /// <param name="seriesFromProgramId">seriesFromProgramId.</param>
        /// <param name="showingsFromProgramId">showingsFromProgramId.</param>
        /// <param name="groupProgramsBySeries">groupProgramsBySeries.</param>
        public LiveTVApiGetPrograms(bool? isAiring = default(bool?), string tagIds = default(string), string excludeItemIds = default(string), bool? enableTotalRecordCount = default(bool?), string seriesTimerId = default(string), string librarySeriesId = default(string), string seriesFromProgramId = default(string), string showingsFromProgramId = default(string), bool? groupProgramsBySeries = default(bool?))
        {
            this.IsAiring = isAiring;
            this.TagIds = tagIds;
            this.ExcludeItemIds = excludeItemIds;
            this.EnableTotalRecordCount = enableTotalRecordCount;
            this.SeriesTimerId = seriesTimerId;
            this.LibrarySeriesId = librarySeriesId;
            this.SeriesFromProgramId = seriesFromProgramId;
            this.ShowingsFromProgramId = showingsFromProgramId;
            this.GroupProgramsBySeries = groupProgramsBySeries;
        }
        
        /// <summary>
        /// Gets or Sets IsAiring
        /// </summary>
        [DataMember(Name="IsAiring", EmitDefaultValue=false)]
        public bool? IsAiring { get; set; }

        /// <summary>
        /// Gets or Sets TagIds
        /// </summary>
        [DataMember(Name="TagIds", EmitDefaultValue=false)]
        public string TagIds { get; set; }

        /// <summary>
        /// Gets or Sets ExcludeItemIds
        /// </summary>
        [DataMember(Name="ExcludeItemIds", EmitDefaultValue=false)]
        public string ExcludeItemIds { get; set; }

        /// <summary>
        /// Gets or Sets EnableTotalRecordCount
        /// </summary>
        [DataMember(Name="EnableTotalRecordCount", EmitDefaultValue=false)]
        public bool? EnableTotalRecordCount { get; set; }

        /// <summary>
        /// Gets or Sets SeriesTimerId
        /// </summary>
        [DataMember(Name="SeriesTimerId", EmitDefaultValue=false)]
        public string SeriesTimerId { get; set; }

        /// <summary>
        /// Gets or Sets LibrarySeriesId
        /// </summary>
        [DataMember(Name="LibrarySeriesId", EmitDefaultValue=false)]
        public string LibrarySeriesId { get; set; }

        /// <summary>
        /// Gets or Sets SeriesFromProgramId
        /// </summary>
        [DataMember(Name="SeriesFromProgramId", EmitDefaultValue=false)]
        public string SeriesFromProgramId { get; set; }

        /// <summary>
        /// Gets or Sets ShowingsFromProgramId
        /// </summary>
        [DataMember(Name="ShowingsFromProgramId", EmitDefaultValue=false)]
        public string ShowingsFromProgramId { get; set; }

        /// <summary>
        /// Gets or Sets GroupProgramsBySeries
        /// </summary>
        [DataMember(Name="GroupProgramsBySeries", EmitDefaultValue=false)]
        public bool? GroupProgramsBySeries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTVApiGetPrograms {\n");
            sb.Append("  IsAiring: ").Append(IsAiring).Append("\n");
            sb.Append("  TagIds: ").Append(TagIds).Append("\n");
            sb.Append("  ExcludeItemIds: ").Append(ExcludeItemIds).Append("\n");
            sb.Append("  EnableTotalRecordCount: ").Append(EnableTotalRecordCount).Append("\n");
            sb.Append("  SeriesTimerId: ").Append(SeriesTimerId).Append("\n");
            sb.Append("  LibrarySeriesId: ").Append(LibrarySeriesId).Append("\n");
            sb.Append("  SeriesFromProgramId: ").Append(SeriesFromProgramId).Append("\n");
            sb.Append("  ShowingsFromProgramId: ").Append(ShowingsFromProgramId).Append("\n");
            sb.Append("  GroupProgramsBySeries: ").Append(GroupProgramsBySeries).Append("\n");
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
            return this.Equals(input as LiveTVApiGetPrograms);
        }

        /// <summary>
        /// Returns true if LiveTVApiGetPrograms instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTVApiGetPrograms to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTVApiGetPrograms input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsAiring == input.IsAiring ||
                    (this.IsAiring != null &&
                    this.IsAiring.Equals(input.IsAiring))
                ) && 
                (
                    this.TagIds == input.TagIds ||
                    (this.TagIds != null &&
                    this.TagIds.Equals(input.TagIds))
                ) && 
                (
                    this.ExcludeItemIds == input.ExcludeItemIds ||
                    (this.ExcludeItemIds != null &&
                    this.ExcludeItemIds.Equals(input.ExcludeItemIds))
                ) && 
                (
                    this.EnableTotalRecordCount == input.EnableTotalRecordCount ||
                    (this.EnableTotalRecordCount != null &&
                    this.EnableTotalRecordCount.Equals(input.EnableTotalRecordCount))
                ) && 
                (
                    this.SeriesTimerId == input.SeriesTimerId ||
                    (this.SeriesTimerId != null &&
                    this.SeriesTimerId.Equals(input.SeriesTimerId))
                ) && 
                (
                    this.LibrarySeriesId == input.LibrarySeriesId ||
                    (this.LibrarySeriesId != null &&
                    this.LibrarySeriesId.Equals(input.LibrarySeriesId))
                ) && 
                (
                    this.SeriesFromProgramId == input.SeriesFromProgramId ||
                    (this.SeriesFromProgramId != null &&
                    this.SeriesFromProgramId.Equals(input.SeriesFromProgramId))
                ) && 
                (
                    this.ShowingsFromProgramId == input.ShowingsFromProgramId ||
                    (this.ShowingsFromProgramId != null &&
                    this.ShowingsFromProgramId.Equals(input.ShowingsFromProgramId))
                ) && 
                (
                    this.GroupProgramsBySeries == input.GroupProgramsBySeries ||
                    (this.GroupProgramsBySeries != null &&
                    this.GroupProgramsBySeries.Equals(input.GroupProgramsBySeries))
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
                if (this.IsAiring != null)
                    hashCode = hashCode * 59 + this.IsAiring.GetHashCode();
                if (this.TagIds != null)
                    hashCode = hashCode * 59 + this.TagIds.GetHashCode();
                if (this.ExcludeItemIds != null)
                    hashCode = hashCode * 59 + this.ExcludeItemIds.GetHashCode();
                if (this.EnableTotalRecordCount != null)
                    hashCode = hashCode * 59 + this.EnableTotalRecordCount.GetHashCode();
                if (this.SeriesTimerId != null)
                    hashCode = hashCode * 59 + this.SeriesTimerId.GetHashCode();
                if (this.LibrarySeriesId != null)
                    hashCode = hashCode * 59 + this.LibrarySeriesId.GetHashCode();
                if (this.SeriesFromProgramId != null)
                    hashCode = hashCode * 59 + this.SeriesFromProgramId.GetHashCode();
                if (this.ShowingsFromProgramId != null)
                    hashCode = hashCode * 59 + this.ShowingsFromProgramId.GetHashCode();
                if (this.GroupProgramsBySeries != null)
                    hashCode = hashCode * 59 + this.GroupProgramsBySeries.GetHashCode();
                return hashCode;
            }
        }

    }
}
