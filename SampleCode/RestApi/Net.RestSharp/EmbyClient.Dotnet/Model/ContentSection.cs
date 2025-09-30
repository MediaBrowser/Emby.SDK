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
        /// <param name="subtitle">subtitle.</param>
        /// <param name="id">id.</param>
        /// <param name="sectionType">sectionType.</param>
        /// <param name="collectionType">collectionType.</param>
        /// <param name="viewType">viewType.</param>
        /// <param name="monitor">monitor.</param>
        /// <param name="cardSizeOffset">cardSizeOffset.</param>
        /// <param name="scrollDirection">scrollDirection.</param>
        /// <param name="parentItem">parentItem.</param>
        /// <param name="textInfo">textInfo.</param>
        /// <param name="premiumFeature">premiumFeature.</param>
        /// <param name="premiumMessage">premiumMessage.</param>
        /// <param name="refreshInterval">refreshInterval.</param>
        public ContentSection(string name = default(string), string subtitle = default(string), string id = default(string), string sectionType = default(string), string collectionType = default(string), string viewType = default(string), List<string> monitor = default(List<string>), int? cardSizeOffset = default(int?), ScrollDirection scrollDirection = default(ScrollDirection), BaseItemDto parentItem = default(BaseItemDto), TextSectionInfo textInfo = default(TextSectionInfo), string premiumFeature = default(string), string premiumMessage = default(string), int? refreshInterval = default(int?))
        {
            this.Name = name;
            this.Subtitle = subtitle;
            this.Id = id;
            this.SectionType = sectionType;
            this.CollectionType = collectionType;
            this.ViewType = viewType;
            this.Monitor = monitor;
            this.CardSizeOffset = cardSizeOffset;
            this.ScrollDirection = scrollDirection;
            this.ParentItem = parentItem;
            this.TextInfo = textInfo;
            this.PremiumFeature = premiumFeature;
            this.PremiumMessage = premiumMessage;
            this.RefreshInterval = refreshInterval;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

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
        /// Gets or Sets Monitor
        /// </summary>
        [DataMember(Name="Monitor", EmitDefaultValue=false)]
        public List<string> Monitor { get; set; }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContentSection {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Subtitle: ").Append(Subtitle).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SectionType: ").Append(SectionType).Append("\n");
            sb.Append("  CollectionType: ").Append(CollectionType).Append("\n");
            sb.Append("  ViewType: ").Append(ViewType).Append("\n");
            sb.Append("  Monitor: ").Append(Monitor).Append("\n");
            sb.Append("  CardSizeOffset: ").Append(CardSizeOffset).Append("\n");
            sb.Append("  ScrollDirection: ").Append(ScrollDirection).Append("\n");
            sb.Append("  ParentItem: ").Append(ParentItem).Append("\n");
            sb.Append("  TextInfo: ").Append(TextInfo).Append("\n");
            sb.Append("  PremiumFeature: ").Append(PremiumFeature).Append("\n");
            sb.Append("  PremiumMessage: ").Append(PremiumMessage).Append("\n");
            sb.Append("  RefreshInterval: ").Append(RefreshInterval).Append("\n");
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
                    this.Monitor == input.Monitor ||
                    this.Monitor != null &&
                    input.Monitor != null &&
                    this.Monitor.SequenceEqual(input.Monitor)
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
                if (this.Monitor != null)
                    hashCode = hashCode * 59 + this.Monitor.GetHashCode();
                if (this.CardSizeOffset != null)
                    hashCode = hashCode * 59 + this.CardSizeOffset.GetHashCode();
                if (this.ScrollDirection != null)
                    hashCode = hashCode * 59 + this.ScrollDirection.GetHashCode();
                if (this.ParentItem != null)
                    hashCode = hashCode * 59 + this.ParentItem.GetHashCode();
                if (this.TextInfo != null)
                    hashCode = hashCode * 59 + this.TextInfo.GetHashCode();
                if (this.PremiumFeature != null)
                    hashCode = hashCode * 59 + this.PremiumFeature.GetHashCode();
                if (this.PremiumMessage != null)
                    hashCode = hashCode * 59 + this.PremiumMessage.GetHashCode();
                if (this.RefreshInterval != null)
                    hashCode = hashCode * 59 + this.RefreshInterval.GetHashCode();
                return hashCode;
            }
        }

    }
}
