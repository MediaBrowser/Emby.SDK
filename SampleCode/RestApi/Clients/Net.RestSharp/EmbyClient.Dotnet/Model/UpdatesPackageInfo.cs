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
    /// UpdatesPackageInfo
    /// </summary>
    [DataContract]
        public partial class UpdatesPackageInfo :  IEquatable<UpdatesPackageInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdatesPackageInfo" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="shortDescription">shortDescription.</param>
        /// <param name="overview">overview.</param>
        /// <param name="isPremium">isPremium.</param>
        /// <param name="adult">adult.</param>
        /// <param name="richDescUrl">richDescUrl.</param>
        /// <param name="thumbImage">thumbImage.</param>
        /// <param name="previewImage">previewImage.</param>
        /// <param name="type">type.</param>
        /// <param name="targetFilename">targetFilename.</param>
        /// <param name="owner">owner.</param>
        /// <param name="category">category.</param>
        /// <param name="tileColor">tileColor.</param>
        /// <param name="featureId">featureId.</param>
        /// <param name="regInfo">regInfo.</param>
        /// <param name="price">price.</param>
        /// <param name="targetSystem">targetSystem.</param>
        /// <param name="guid">guid.</param>
        /// <param name="totalRatings">totalRatings.</param>
        /// <param name="avgRating">avgRating.</param>
        /// <param name="isRegistered">isRegistered.</param>
        /// <param name="expDate">expDate.</param>
        /// <param name="versions">versions.</param>
        /// <param name="enableInAppStore">enableInAppStore.</param>
        /// <param name="installs">installs.</param>
        public UpdatesPackageInfo(string id = default(string), string name = default(string), string shortDescription = default(string), string overview = default(string), bool? isPremium = default(bool?), bool? adult = default(bool?), string richDescUrl = default(string), string thumbImage = default(string), string previewImage = default(string), string type = default(string), string targetFilename = default(string), string owner = default(string), string category = default(string), string tileColor = default(string), string featureId = default(string), string regInfo = default(string), float? price = default(float?), UpdatesPackageTargetSystem targetSystem = default(UpdatesPackageTargetSystem), string guid = default(string), int? totalRatings = default(int?), float? avgRating = default(float?), bool? isRegistered = default(bool?), DateTimeOffset? expDate = default(DateTimeOffset?), List<UpdatesPackageVersionInfo> versions = default(List<UpdatesPackageVersionInfo>), bool? enableInAppStore = default(bool?), int? installs = default(int?))
        {
            this.Id = id;
            this.Name = name;
            this.ShortDescription = shortDescription;
            this.Overview = overview;
            this.IsPremium = isPremium;
            this.Adult = adult;
            this.RichDescUrl = richDescUrl;
            this.ThumbImage = thumbImage;
            this.PreviewImage = previewImage;
            this.Type = type;
            this.TargetFilename = targetFilename;
            this.Owner = owner;
            this.Category = category;
            this.TileColor = tileColor;
            this.FeatureId = featureId;
            this.RegInfo = regInfo;
            this.Price = price;
            this.TargetSystem = targetSystem;
            this.Guid = guid;
            this.TotalRatings = totalRatings;
            this.AvgRating = avgRating;
            this.IsRegistered = isRegistered;
            this.ExpDate = expDate;
            this.Versions = versions;
            this.EnableInAppStore = enableInAppStore;
            this.Installs = installs;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ShortDescription
        /// </summary>
        [DataMember(Name="shortDescription", EmitDefaultValue=false)]
        public string ShortDescription { get; set; }

        /// <summary>
        /// Gets or Sets Overview
        /// </summary>
        [DataMember(Name="overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

        /// <summary>
        /// Gets or Sets IsPremium
        /// </summary>
        [DataMember(Name="isPremium", EmitDefaultValue=false)]
        public bool? IsPremium { get; set; }

        /// <summary>
        /// Gets or Sets Adult
        /// </summary>
        [DataMember(Name="adult", EmitDefaultValue=false)]
        public bool? Adult { get; set; }

        /// <summary>
        /// Gets or Sets RichDescUrl
        /// </summary>
        [DataMember(Name="richDescUrl", EmitDefaultValue=false)]
        public string RichDescUrl { get; set; }

        /// <summary>
        /// Gets or Sets ThumbImage
        /// </summary>
        [DataMember(Name="thumbImage", EmitDefaultValue=false)]
        public string ThumbImage { get; set; }

        /// <summary>
        /// Gets or Sets PreviewImage
        /// </summary>
        [DataMember(Name="previewImage", EmitDefaultValue=false)]
        public string PreviewImage { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets TargetFilename
        /// </summary>
        [DataMember(Name="targetFilename", EmitDefaultValue=false)]
        public string TargetFilename { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name="owner", EmitDefaultValue=false)]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets TileColor
        /// </summary>
        [DataMember(Name="tileColor", EmitDefaultValue=false)]
        public string TileColor { get; set; }

        /// <summary>
        /// Gets or Sets FeatureId
        /// </summary>
        [DataMember(Name="featureId", EmitDefaultValue=false)]
        public string FeatureId { get; set; }

        /// <summary>
        /// Gets or Sets RegInfo
        /// </summary>
        [DataMember(Name="regInfo", EmitDefaultValue=false)]
        public string RegInfo { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public float? Price { get; set; }

        /// <summary>
        /// Gets or Sets TargetSystem
        /// </summary>
        [DataMember(Name="targetSystem", EmitDefaultValue=false)]
        public UpdatesPackageTargetSystem TargetSystem { get; set; }

        /// <summary>
        /// Gets or Sets Guid
        /// </summary>
        [DataMember(Name="guid", EmitDefaultValue=false)]
        public string Guid { get; set; }

        /// <summary>
        /// Gets or Sets TotalRatings
        /// </summary>
        [DataMember(Name="totalRatings", EmitDefaultValue=false)]
        public int? TotalRatings { get; set; }

        /// <summary>
        /// Gets or Sets AvgRating
        /// </summary>
        [DataMember(Name="avgRating", EmitDefaultValue=false)]
        public float? AvgRating { get; set; }

        /// <summary>
        /// Gets or Sets IsRegistered
        /// </summary>
        [DataMember(Name="isRegistered", EmitDefaultValue=false)]
        public bool? IsRegistered { get; set; }

        /// <summary>
        /// Gets or Sets ExpDate
        /// </summary>
        [DataMember(Name="expDate", EmitDefaultValue=false)]
        public DateTimeOffset? ExpDate { get; set; }

        /// <summary>
        /// Gets or Sets Versions
        /// </summary>
        [DataMember(Name="versions", EmitDefaultValue=false)]
        public List<UpdatesPackageVersionInfo> Versions { get; set; }

        /// <summary>
        /// Gets or Sets EnableInAppStore
        /// </summary>
        [DataMember(Name="enableInAppStore", EmitDefaultValue=false)]
        public bool? EnableInAppStore { get; set; }

        /// <summary>
        /// Gets or Sets Installs
        /// </summary>
        [DataMember(Name="installs", EmitDefaultValue=false)]
        public int? Installs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdatesPackageInfo {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ShortDescription: ").Append(ShortDescription).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  IsPremium: ").Append(IsPremium).Append("\n");
            sb.Append("  Adult: ").Append(Adult).Append("\n");
            sb.Append("  RichDescUrl: ").Append(RichDescUrl).Append("\n");
            sb.Append("  ThumbImage: ").Append(ThumbImage).Append("\n");
            sb.Append("  PreviewImage: ").Append(PreviewImage).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  TargetFilename: ").Append(TargetFilename).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  TileColor: ").Append(TileColor).Append("\n");
            sb.Append("  FeatureId: ").Append(FeatureId).Append("\n");
            sb.Append("  RegInfo: ").Append(RegInfo).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  TargetSystem: ").Append(TargetSystem).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  TotalRatings: ").Append(TotalRatings).Append("\n");
            sb.Append("  AvgRating: ").Append(AvgRating).Append("\n");
            sb.Append("  IsRegistered: ").Append(IsRegistered).Append("\n");
            sb.Append("  ExpDate: ").Append(ExpDate).Append("\n");
            sb.Append("  Versions: ").Append(Versions).Append("\n");
            sb.Append("  EnableInAppStore: ").Append(EnableInAppStore).Append("\n");
            sb.Append("  Installs: ").Append(Installs).Append("\n");
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
            return this.Equals(input as UpdatesPackageInfo);
        }

        /// <summary>
        /// Returns true if UpdatesPackageInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdatesPackageInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdatesPackageInfo input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ShortDescription == input.ShortDescription ||
                    (this.ShortDescription != null &&
                    this.ShortDescription.Equals(input.ShortDescription))
                ) && 
                (
                    this.Overview == input.Overview ||
                    (this.Overview != null &&
                    this.Overview.Equals(input.Overview))
                ) && 
                (
                    this.IsPremium == input.IsPremium ||
                    (this.IsPremium != null &&
                    this.IsPremium.Equals(input.IsPremium))
                ) && 
                (
                    this.Adult == input.Adult ||
                    (this.Adult != null &&
                    this.Adult.Equals(input.Adult))
                ) && 
                (
                    this.RichDescUrl == input.RichDescUrl ||
                    (this.RichDescUrl != null &&
                    this.RichDescUrl.Equals(input.RichDescUrl))
                ) && 
                (
                    this.ThumbImage == input.ThumbImage ||
                    (this.ThumbImage != null &&
                    this.ThumbImage.Equals(input.ThumbImage))
                ) && 
                (
                    this.PreviewImage == input.PreviewImage ||
                    (this.PreviewImage != null &&
                    this.PreviewImage.Equals(input.PreviewImage))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.TargetFilename == input.TargetFilename ||
                    (this.TargetFilename != null &&
                    this.TargetFilename.Equals(input.TargetFilename))
                ) && 
                (
                    this.Owner == input.Owner ||
                    (this.Owner != null &&
                    this.Owner.Equals(input.Owner))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.TileColor == input.TileColor ||
                    (this.TileColor != null &&
                    this.TileColor.Equals(input.TileColor))
                ) && 
                (
                    this.FeatureId == input.FeatureId ||
                    (this.FeatureId != null &&
                    this.FeatureId.Equals(input.FeatureId))
                ) && 
                (
                    this.RegInfo == input.RegInfo ||
                    (this.RegInfo != null &&
                    this.RegInfo.Equals(input.RegInfo))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.TargetSystem == input.TargetSystem ||
                    (this.TargetSystem != null &&
                    this.TargetSystem.Equals(input.TargetSystem))
                ) && 
                (
                    this.Guid == input.Guid ||
                    (this.Guid != null &&
                    this.Guid.Equals(input.Guid))
                ) && 
                (
                    this.TotalRatings == input.TotalRatings ||
                    (this.TotalRatings != null &&
                    this.TotalRatings.Equals(input.TotalRatings))
                ) && 
                (
                    this.AvgRating == input.AvgRating ||
                    (this.AvgRating != null &&
                    this.AvgRating.Equals(input.AvgRating))
                ) && 
                (
                    this.IsRegistered == input.IsRegistered ||
                    (this.IsRegistered != null &&
                    this.IsRegistered.Equals(input.IsRegistered))
                ) && 
                (
                    this.ExpDate == input.ExpDate ||
                    (this.ExpDate != null &&
                    this.ExpDate.Equals(input.ExpDate))
                ) && 
                (
                    this.Versions == input.Versions ||
                    this.Versions != null &&
                    input.Versions != null &&
                    this.Versions.SequenceEqual(input.Versions)
                ) && 
                (
                    this.EnableInAppStore == input.EnableInAppStore ||
                    (this.EnableInAppStore != null &&
                    this.EnableInAppStore.Equals(input.EnableInAppStore))
                ) && 
                (
                    this.Installs == input.Installs ||
                    (this.Installs != null &&
                    this.Installs.Equals(input.Installs))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ShortDescription != null)
                    hashCode = hashCode * 59 + this.ShortDescription.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.IsPremium != null)
                    hashCode = hashCode * 59 + this.IsPremium.GetHashCode();
                if (this.Adult != null)
                    hashCode = hashCode * 59 + this.Adult.GetHashCode();
                if (this.RichDescUrl != null)
                    hashCode = hashCode * 59 + this.RichDescUrl.GetHashCode();
                if (this.ThumbImage != null)
                    hashCode = hashCode * 59 + this.ThumbImage.GetHashCode();
                if (this.PreviewImage != null)
                    hashCode = hashCode * 59 + this.PreviewImage.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.TargetFilename != null)
                    hashCode = hashCode * 59 + this.TargetFilename.GetHashCode();
                if (this.Owner != null)
                    hashCode = hashCode * 59 + this.Owner.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.TileColor != null)
                    hashCode = hashCode * 59 + this.TileColor.GetHashCode();
                if (this.FeatureId != null)
                    hashCode = hashCode * 59 + this.FeatureId.GetHashCode();
                if (this.RegInfo != null)
                    hashCode = hashCode * 59 + this.RegInfo.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.TargetSystem != null)
                    hashCode = hashCode * 59 + this.TargetSystem.GetHashCode();
                if (this.Guid != null)
                    hashCode = hashCode * 59 + this.Guid.GetHashCode();
                if (this.TotalRatings != null)
                    hashCode = hashCode * 59 + this.TotalRatings.GetHashCode();
                if (this.AvgRating != null)
                    hashCode = hashCode * 59 + this.AvgRating.GetHashCode();
                if (this.IsRegistered != null)
                    hashCode = hashCode * 59 + this.IsRegistered.GetHashCode();
                if (this.ExpDate != null)
                    hashCode = hashCode * 59 + this.ExpDate.GetHashCode();
                if (this.Versions != null)
                    hashCode = hashCode * 59 + this.Versions.GetHashCode();
                if (this.EnableInAppStore != null)
                    hashCode = hashCode * 59 + this.EnableInAppStore.GetHashCode();
                if (this.Installs != null)
                    hashCode = hashCode * 59 + this.Installs.GetHashCode();
                return hashCode;
            }
        }

    }
}
