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
    /// DisplayPreferences
    /// </summary>
    [DataContract]
        public partial class DisplayPreferences :  IEquatable<DisplayPreferences>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DisplayPreferences" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="viewType">viewType.</param>
        /// <param name="sortBy">sortBy.</param>
        /// <param name="indexBy">indexBy.</param>
        /// <param name="rememberIndexing">rememberIndexing.</param>
        /// <param name="primaryImageHeight">primaryImageHeight.</param>
        /// <param name="primaryImageWidth">primaryImageWidth.</param>
        /// <param name="customPrefs">customPrefs.</param>
        /// <param name="scrollDirection">scrollDirection.</param>
        /// <param name="showBackdrop">showBackdrop.</param>
        /// <param name="rememberSorting">rememberSorting.</param>
        /// <param name="sortOrder">sortOrder.</param>
        /// <param name="_client">_client.</param>
        public DisplayPreferences(string id = default(string), string viewType = default(string), string sortBy = default(string), string indexBy = default(string), bool? rememberIndexing = default(bool?), int? primaryImageHeight = default(int?), int? primaryImageWidth = default(int?), Dictionary<string, string> customPrefs = default(Dictionary<string, string>), ScrollDirection scrollDirection = default(ScrollDirection), bool? showBackdrop = default(bool?), bool? rememberSorting = default(bool?), SortOrder sortOrder = default(SortOrder), string _client = default(string))
        {
            this.Id = id;
            this.ViewType = viewType;
            this.SortBy = sortBy;
            this.IndexBy = indexBy;
            this.RememberIndexing = rememberIndexing;
            this.PrimaryImageHeight = primaryImageHeight;
            this.PrimaryImageWidth = primaryImageWidth;
            this.CustomPrefs = customPrefs;
            this.ScrollDirection = scrollDirection;
            this.ShowBackdrop = showBackdrop;
            this.RememberSorting = rememberSorting;
            this.SortOrder = sortOrder;
            this._Client = _client;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ViewType
        /// </summary>
        [DataMember(Name="ViewType", EmitDefaultValue=false)]
        public string ViewType { get; set; }

        /// <summary>
        /// Gets or Sets SortBy
        /// </summary>
        [DataMember(Name="SortBy", EmitDefaultValue=false)]
        public string SortBy { get; set; }

        /// <summary>
        /// Gets or Sets IndexBy
        /// </summary>
        [DataMember(Name="IndexBy", EmitDefaultValue=false)]
        public string IndexBy { get; set; }

        /// <summary>
        /// Gets or Sets RememberIndexing
        /// </summary>
        [DataMember(Name="RememberIndexing", EmitDefaultValue=false)]
        public bool? RememberIndexing { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageHeight
        /// </summary>
        [DataMember(Name="PrimaryImageHeight", EmitDefaultValue=false)]
        public int? PrimaryImageHeight { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageWidth
        /// </summary>
        [DataMember(Name="PrimaryImageWidth", EmitDefaultValue=false)]
        public int? PrimaryImageWidth { get; set; }

        /// <summary>
        /// Gets or Sets CustomPrefs
        /// </summary>
        [DataMember(Name="CustomPrefs", EmitDefaultValue=false)]
        public Dictionary<string, string> CustomPrefs { get; set; }

        /// <summary>
        /// Gets or Sets ScrollDirection
        /// </summary>
        [DataMember(Name="ScrollDirection", EmitDefaultValue=false)]
        public ScrollDirection ScrollDirection { get; set; }

        /// <summary>
        /// Gets or Sets ShowBackdrop
        /// </summary>
        [DataMember(Name="ShowBackdrop", EmitDefaultValue=false)]
        public bool? ShowBackdrop { get; set; }

        /// <summary>
        /// Gets or Sets RememberSorting
        /// </summary>
        [DataMember(Name="RememberSorting", EmitDefaultValue=false)]
        public bool? RememberSorting { get; set; }

        /// <summary>
        /// Gets or Sets SortOrder
        /// </summary>
        [DataMember(Name="SortOrder", EmitDefaultValue=false)]
        public SortOrder SortOrder { get; set; }

        /// <summary>
        /// Gets or Sets _Client
        /// </summary>
        [DataMember(Name="Client", EmitDefaultValue=false)]
        public string _Client { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DisplayPreferences {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ViewType: ").Append(ViewType).Append("\n");
            sb.Append("  SortBy: ").Append(SortBy).Append("\n");
            sb.Append("  IndexBy: ").Append(IndexBy).Append("\n");
            sb.Append("  RememberIndexing: ").Append(RememberIndexing).Append("\n");
            sb.Append("  PrimaryImageHeight: ").Append(PrimaryImageHeight).Append("\n");
            sb.Append("  PrimaryImageWidth: ").Append(PrimaryImageWidth).Append("\n");
            sb.Append("  CustomPrefs: ").Append(CustomPrefs).Append("\n");
            sb.Append("  ScrollDirection: ").Append(ScrollDirection).Append("\n");
            sb.Append("  ShowBackdrop: ").Append(ShowBackdrop).Append("\n");
            sb.Append("  RememberSorting: ").Append(RememberSorting).Append("\n");
            sb.Append("  SortOrder: ").Append(SortOrder).Append("\n");
            sb.Append("  _Client: ").Append(_Client).Append("\n");
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
            return this.Equals(input as DisplayPreferences);
        }

        /// <summary>
        /// Returns true if DisplayPreferences instances are equal
        /// </summary>
        /// <param name="input">Instance of DisplayPreferences to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DisplayPreferences input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ViewType == input.ViewType ||
                    (this.ViewType != null &&
                    this.ViewType.Equals(input.ViewType))
                ) && 
                (
                    this.SortBy == input.SortBy ||
                    (this.SortBy != null &&
                    this.SortBy.Equals(input.SortBy))
                ) && 
                (
                    this.IndexBy == input.IndexBy ||
                    (this.IndexBy != null &&
                    this.IndexBy.Equals(input.IndexBy))
                ) && 
                (
                    this.RememberIndexing == input.RememberIndexing ||
                    (this.RememberIndexing != null &&
                    this.RememberIndexing.Equals(input.RememberIndexing))
                ) && 
                (
                    this.PrimaryImageHeight == input.PrimaryImageHeight ||
                    (this.PrimaryImageHeight != null &&
                    this.PrimaryImageHeight.Equals(input.PrimaryImageHeight))
                ) && 
                (
                    this.PrimaryImageWidth == input.PrimaryImageWidth ||
                    (this.PrimaryImageWidth != null &&
                    this.PrimaryImageWidth.Equals(input.PrimaryImageWidth))
                ) && 
                (
                    this.CustomPrefs == input.CustomPrefs ||
                    this.CustomPrefs != null &&
                    input.CustomPrefs != null &&
                    this.CustomPrefs.SequenceEqual(input.CustomPrefs)
                ) && 
                (
                    this.ScrollDirection == input.ScrollDirection ||
                    (this.ScrollDirection != null &&
                    this.ScrollDirection.Equals(input.ScrollDirection))
                ) && 
                (
                    this.ShowBackdrop == input.ShowBackdrop ||
                    (this.ShowBackdrop != null &&
                    this.ShowBackdrop.Equals(input.ShowBackdrop))
                ) && 
                (
                    this.RememberSorting == input.RememberSorting ||
                    (this.RememberSorting != null &&
                    this.RememberSorting.Equals(input.RememberSorting))
                ) && 
                (
                    this.SortOrder == input.SortOrder ||
                    (this.SortOrder != null &&
                    this.SortOrder.Equals(input.SortOrder))
                ) && 
                (
                    this._Client == input._Client ||
                    (this._Client != null &&
                    this._Client.Equals(input._Client))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ViewType != null)
                    hashCode = hashCode * 59 + this.ViewType.GetHashCode();
                if (this.SortBy != null)
                    hashCode = hashCode * 59 + this.SortBy.GetHashCode();
                if (this.IndexBy != null)
                    hashCode = hashCode * 59 + this.IndexBy.GetHashCode();
                if (this.RememberIndexing != null)
                    hashCode = hashCode * 59 + this.RememberIndexing.GetHashCode();
                if (this.PrimaryImageHeight != null)
                    hashCode = hashCode * 59 + this.PrimaryImageHeight.GetHashCode();
                if (this.PrimaryImageWidth != null)
                    hashCode = hashCode * 59 + this.PrimaryImageWidth.GetHashCode();
                if (this.CustomPrefs != null)
                    hashCode = hashCode * 59 + this.CustomPrefs.GetHashCode();
                if (this.ScrollDirection != null)
                    hashCode = hashCode * 59 + this.ScrollDirection.GetHashCode();
                if (this.ShowBackdrop != null)
                    hashCode = hashCode * 59 + this.ShowBackdrop.GetHashCode();
                if (this.RememberSorting != null)
                    hashCode = hashCode * 59 + this.RememberSorting.GetHashCode();
                if (this.SortOrder != null)
                    hashCode = hashCode * 59 + this.SortOrder.GetHashCode();
                if (this._Client != null)
                    hashCode = hashCode * 59 + this._Client.GetHashCode();
                return hashCode;
            }
        }

    }
}
