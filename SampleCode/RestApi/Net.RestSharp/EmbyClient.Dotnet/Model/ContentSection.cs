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
    /// ContentSection
    /// </summary>
    [DataContract]
        public partial class ContentSection :  IEquatable<ContentSection>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContentSection" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="customName">customName.</param>
        /// <param name="subtitle">subtitle.</param>
        /// <param name="id">id.</param>
        /// <param name="sectionType">sectionType.</param>
        /// <param name="collectionType">collectionType.</param>
        /// <param name="viewType">viewType.</param>
        /// <param name="imageType">imageType.</param>
        /// <param name="displayMode">displayMode.</param>
        /// <param name="monitor">monitor.</param>
        /// <param name="itemTypes">itemTypes.</param>
        /// <param name="excludedFolders">excludedFolders.</param>
        /// <param name="cardSizeOffset">cardSizeOffset.</param>
        /// <param name="scrollDirection">scrollDirection.</param>
        /// <param name="parentItem">parentItem.</param>
        /// <param name="parentId">parentId.</param>
        /// <param name="textInfo">textInfo.</param>
        /// <param name="premiumFeature">premiumFeature.</param>
        /// <param name="premiumMessage">premiumMessage.</param>
        /// <param name="refreshInterval">refreshInterval.</param>
        /// <param name="sortBy">sortBy.</param>
        /// <param name="sortOrder">sortOrder.</param>
        /// <param name="includeNextUpInResume">includeNextUpInResume.</param>
        /// <param name="query">query.</param>
        public ContentSection(string name = default(string), string customName = default(string), string subtitle = default(string), string id = default(string), string sectionType = default(string), string collectionType = default(string), string viewType = default(string), string imageType = default(string), string displayMode = default(string), List<string> monitor = default(List<string>), List<string> itemTypes = default(List<string>), List<string> excludedFolders = default(List<string>), int? cardSizeOffset = default(int?), ScrollDirection scrollDirection = default(ScrollDirection), BaseItemDto parentItem = default(BaseItemDto), string parentId = default(string), TextSectionInfo textInfo = default(TextSectionInfo), string premiumFeature = default(string), string premiumMessage = default(string), int? refreshInterval = default(int?), string sortBy = default(string), string sortOrder = default(string), bool? includeNextUpInResume = default(bool?), ItemsQuery query = default(ItemsQuery))
        {
            this.Name = name;
            this.CustomName = customName;
            this.Subtitle = subtitle;
            this.Id = id;
            this.SectionType = sectionType;
            this.CollectionType = collectionType;
            this.ViewType = viewType;
            this.ImageType = imageType;
            this.DisplayMode = displayMode;
            this.Monitor = monitor;
            this.ItemTypes = itemTypes;
            this.ExcludedFolders = excludedFolders;
            this.CardSizeOffset = cardSizeOffset;
            this.ScrollDirection = scrollDirection;
            this.ParentItem = parentItem;
            this.ParentId = parentId;
            this.TextInfo = textInfo;
            this.PremiumFeature = premiumFeature;
            this.PremiumMessage = premiumMessage;
            this.RefreshInterval = refreshInterval;
            this.SortBy = sortBy;
            this.SortOrder = sortOrder;
            this.IncludeNextUpInResume = includeNextUpInResume;
            this.Query = query;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CustomName
        /// </summary>
        [DataMember(Name="CustomName", EmitDefaultValue=false)]
        public string CustomName { get; set; }

        /// <summary>
        /// Gets or Sets Subtitle
        /// </summary>
        [DataMember(Name="Subtitle", EmitDefaultValue=false)]
        public string Subtitle { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets SectionType
        /// </summary>
        [DataMember(Name="SectionType", EmitDefaultValue=false)]
        public string SectionType { get; set; }

        /// <summary>
        /// Gets or Sets CollectionType
        /// </summary>
        [DataMember(Name="CollectionType", EmitDefaultValue=false)]
        public string CollectionType { get; set; }

        /// <summary>
        /// Gets or Sets ViewType
        /// </summary>
        [DataMember(Name="ViewType", EmitDefaultValue=false)]
        public string ViewType { get; set; }

        /// <summary>
        /// Gets or Sets ImageType
        /// </summary>
        [DataMember(Name="ImageType", EmitDefaultValue=false)]
        public string ImageType { get; set; }

        /// <summary>
        /// Gets or Sets DisplayMode
        /// </summary>
        [DataMember(Name="DisplayMode", EmitDefaultValue=false)]
        public string DisplayMode { get; set; }

        /// <summary>
        /// Gets or Sets Monitor
        /// </summary>
        [DataMember(Name="Monitor", EmitDefaultValue=false)]
        public List<string> Monitor { get; set; }

        /// <summary>
        /// Gets or Sets ItemTypes
        /// </summary>
        [DataMember(Name="ItemTypes", EmitDefaultValue=false)]
        public List<string> ItemTypes { get; set; }

        /// <summary>
        /// Gets or Sets ExcludedFolders
        /// </summary>
        [DataMember(Name="ExcludedFolders", EmitDefaultValue=false)]
        public List<string> ExcludedFolders { get; set; }

        /// <summary>
        /// Gets or Sets CardSizeOffset
        /// </summary>
        [DataMember(Name="CardSizeOffset", EmitDefaultValue=false)]
        public int? CardSizeOffset { get; set; }

        /// <summary>
        /// Gets or Sets ScrollDirection
        /// </summary>
        [DataMember(Name="ScrollDirection", EmitDefaultValue=false)]
        public ScrollDirection ScrollDirection { get; set; }

        /// <summary>
        /// Gets or Sets ParentItem
        /// </summary>
        [DataMember(Name="ParentItem", EmitDefaultValue=false)]
        public BaseItemDto ParentItem { get; set; }

        /// <summary>
        /// Gets or Sets ParentId
        /// </summary>
        [DataMember(Name="ParentId", EmitDefaultValue=false)]
        public string ParentId { get; set; }

        /// <summary>
        /// Gets or Sets TextInfo
        /// </summary>
        [DataMember(Name="TextInfo", EmitDefaultValue=false)]
        public TextSectionInfo TextInfo { get; set; }

        /// <summary>
        /// Gets or Sets PremiumFeature
        /// </summary>
        [DataMember(Name="PremiumFeature", EmitDefaultValue=false)]
        public string PremiumFeature { get; set; }

        /// <summary>
        /// Gets or Sets PremiumMessage
        /// </summary>
        [DataMember(Name="PremiumMessage", EmitDefaultValue=false)]
        public string PremiumMessage { get; set; }

        /// <summary>
        /// Gets or Sets RefreshInterval
        /// </summary>
        [DataMember(Name="RefreshInterval", EmitDefaultValue=false)]
        public int? RefreshInterval { get; set; }

        /// <summary>
        /// Gets or Sets SortBy
        /// </summary>
        [DataMember(Name="SortBy", EmitDefaultValue=false)]
        public string SortBy { get; set; }

        /// <summary>
        /// Gets or Sets SortOrder
        /// </summary>
        [DataMember(Name="SortOrder", EmitDefaultValue=false)]
        public string SortOrder { get; set; }

        /// <summary>
        /// Gets or Sets IncludeNextUpInResume
        /// </summary>
        [DataMember(Name="IncludeNextUpInResume", EmitDefaultValue=false)]
        public bool? IncludeNextUpInResume { get; set; }

        /// <summary>
        /// Gets or Sets Query
        /// </summary>
        [DataMember(Name="Query", EmitDefaultValue=false)]
        public ItemsQuery Query { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContentSection {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CustomName: ").Append(CustomName).Append("\n");
            sb.Append("  Subtitle: ").Append(Subtitle).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SectionType: ").Append(SectionType).Append("\n");
            sb.Append("  CollectionType: ").Append(CollectionType).Append("\n");
            sb.Append("  ViewType: ").Append(ViewType).Append("\n");
            sb.Append("  ImageType: ").Append(ImageType).Append("\n");
            sb.Append("  DisplayMode: ").Append(DisplayMode).Append("\n");
            sb.Append("  Monitor: ").Append(Monitor).Append("\n");
            sb.Append("  ItemTypes: ").Append(ItemTypes).Append("\n");
            sb.Append("  ExcludedFolders: ").Append(ExcludedFolders).Append("\n");
            sb.Append("  CardSizeOffset: ").Append(CardSizeOffset).Append("\n");
            sb.Append("  ScrollDirection: ").Append(ScrollDirection).Append("\n");
            sb.Append("  ParentItem: ").Append(ParentItem).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  TextInfo: ").Append(TextInfo).Append("\n");
            sb.Append("  PremiumFeature: ").Append(PremiumFeature).Append("\n");
            sb.Append("  PremiumMessage: ").Append(PremiumMessage).Append("\n");
            sb.Append("  RefreshInterval: ").Append(RefreshInterval).Append("\n");
            sb.Append("  SortBy: ").Append(SortBy).Append("\n");
            sb.Append("  SortOrder: ").Append(SortOrder).Append("\n");
            sb.Append("  IncludeNextUpInResume: ").Append(IncludeNextUpInResume).Append("\n");
            sb.Append("  Query: ").Append(Query).Append("\n");
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
            return this.Equals(input as ContentSection);
        }

        /// <summary>
        /// Returns true if ContentSection instances are equal
        /// </summary>
        /// <param name="input">Instance of ContentSection to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContentSection input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CustomName == input.CustomName ||
                    (this.CustomName != null &&
                    this.CustomName.Equals(input.CustomName))
                ) && 
                (
                    this.Subtitle == input.Subtitle ||
                    (this.Subtitle != null &&
                    this.Subtitle.Equals(input.Subtitle))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.SectionType == input.SectionType ||
                    (this.SectionType != null &&
                    this.SectionType.Equals(input.SectionType))
                ) && 
                (
                    this.CollectionType == input.CollectionType ||
                    (this.CollectionType != null &&
                    this.CollectionType.Equals(input.CollectionType))
                ) && 
                (
                    this.ViewType == input.ViewType ||
                    (this.ViewType != null &&
                    this.ViewType.Equals(input.ViewType))
                ) && 
                (
                    this.ImageType == input.ImageType ||
                    (this.ImageType != null &&
                    this.ImageType.Equals(input.ImageType))
                ) && 
                (
                    this.DisplayMode == input.DisplayMode ||
                    (this.DisplayMode != null &&
                    this.DisplayMode.Equals(input.DisplayMode))
                ) && 
                (
                    this.Monitor == input.Monitor ||
                    this.Monitor != null &&
                    input.Monitor != null &&
                    this.Monitor.SequenceEqual(input.Monitor)
                ) && 
                (
                    this.ItemTypes == input.ItemTypes ||
                    this.ItemTypes != null &&
                    input.ItemTypes != null &&
                    this.ItemTypes.SequenceEqual(input.ItemTypes)
                ) && 
                (
                    this.ExcludedFolders == input.ExcludedFolders ||
                    this.ExcludedFolders != null &&
                    input.ExcludedFolders != null &&
                    this.ExcludedFolders.SequenceEqual(input.ExcludedFolders)
                ) && 
                (
                    this.CardSizeOffset == input.CardSizeOffset ||
                    (this.CardSizeOffset != null &&
                    this.CardSizeOffset.Equals(input.CardSizeOffset))
                ) && 
                (
                    this.ScrollDirection == input.ScrollDirection ||
                    (this.ScrollDirection != null &&
                    this.ScrollDirection.Equals(input.ScrollDirection))
                ) && 
                (
                    this.ParentItem == input.ParentItem ||
                    (this.ParentItem != null &&
                    this.ParentItem.Equals(input.ParentItem))
                ) && 
                (
                    this.ParentId == input.ParentId ||
                    (this.ParentId != null &&
                    this.ParentId.Equals(input.ParentId))
                ) && 
                (
                    this.TextInfo == input.TextInfo ||
                    (this.TextInfo != null &&
                    this.TextInfo.Equals(input.TextInfo))
                ) && 
                (
                    this.PremiumFeature == input.PremiumFeature ||
                    (this.PremiumFeature != null &&
                    this.PremiumFeature.Equals(input.PremiumFeature))
                ) && 
                (
                    this.PremiumMessage == input.PremiumMessage ||
                    (this.PremiumMessage != null &&
                    this.PremiumMessage.Equals(input.PremiumMessage))
                ) && 
                (
                    this.RefreshInterval == input.RefreshInterval ||
                    (this.RefreshInterval != null &&
                    this.RefreshInterval.Equals(input.RefreshInterval))
                ) && 
                (
                    this.SortBy == input.SortBy ||
                    (this.SortBy != null &&
                    this.SortBy.Equals(input.SortBy))
                ) && 
                (
                    this.SortOrder == input.SortOrder ||
                    (this.SortOrder != null &&
                    this.SortOrder.Equals(input.SortOrder))
                ) && 
                (
                    this.IncludeNextUpInResume == input.IncludeNextUpInResume ||
                    (this.IncludeNextUpInResume != null &&
                    this.IncludeNextUpInResume.Equals(input.IncludeNextUpInResume))
                ) && 
                (
                    this.Query == input.Query ||
                    (this.Query != null &&
                    this.Query.Equals(input.Query))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.CustomName != null)
                    hashCode = hashCode * 59 + this.CustomName.GetHashCode();
                if (this.Subtitle != null)
                    hashCode = hashCode * 59 + this.Subtitle.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.SectionType != null)
                    hashCode = hashCode * 59 + this.SectionType.GetHashCode();
                if (this.CollectionType != null)
                    hashCode = hashCode * 59 + this.CollectionType.GetHashCode();
                if (this.ViewType != null)
                    hashCode = hashCode * 59 + this.ViewType.GetHashCode();
                if (this.ImageType != null)
                    hashCode = hashCode * 59 + this.ImageType.GetHashCode();
                if (this.DisplayMode != null)
                    hashCode = hashCode * 59 + this.DisplayMode.GetHashCode();
                if (this.Monitor != null)
                    hashCode = hashCode * 59 + this.Monitor.GetHashCode();
                if (this.ItemTypes != null)
                    hashCode = hashCode * 59 + this.ItemTypes.GetHashCode();
                if (this.ExcludedFolders != null)
                    hashCode = hashCode * 59 + this.ExcludedFolders.GetHashCode();
                if (this.CardSizeOffset != null)
                    hashCode = hashCode * 59 + this.CardSizeOffset.GetHashCode();
                if (this.ScrollDirection != null)
                    hashCode = hashCode * 59 + this.ScrollDirection.GetHashCode();
                if (this.ParentItem != null)
                    hashCode = hashCode * 59 + this.ParentItem.GetHashCode();
                if (this.ParentId != null)
                    hashCode = hashCode * 59 + this.ParentId.GetHashCode();
                if (this.TextInfo != null)
                    hashCode = hashCode * 59 + this.TextInfo.GetHashCode();
                if (this.PremiumFeature != null)
                    hashCode = hashCode * 59 + this.PremiumFeature.GetHashCode();
                if (this.PremiumMessage != null)
                    hashCode = hashCode * 59 + this.PremiumMessage.GetHashCode();
                if (this.RefreshInterval != null)
                    hashCode = hashCode * 59 + this.RefreshInterval.GetHashCode();
                if (this.SortBy != null)
                    hashCode = hashCode * 59 + this.SortBy.GetHashCode();
                if (this.SortOrder != null)
                    hashCode = hashCode * 59 + this.SortOrder.GetHashCode();
                if (this.IncludeNextUpInResume != null)
                    hashCode = hashCode * 59 + this.IncludeNextUpInResume.GetHashCode();
                if (this.Query != null)
                    hashCode = hashCode * 59 + this.Query.GetHashCode();
                return hashCode;
            }
        }

    }
}
