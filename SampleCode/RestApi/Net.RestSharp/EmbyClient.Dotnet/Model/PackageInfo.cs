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
    /// Class PackageInfo  
    /// </summary>
    [DataContract]
        public partial class PackageInfo :  IEquatable<PackageInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PackageInfo" /> class.
        /// </summary>
        /// <param name="id">The internal id of this package..</param>
        /// <param name="name">The name..</param>
        /// <param name="shortDescription">The short description..</param>
        /// <param name="overview">The overview..</param>
        /// <param name="isPremium">A value indicating whether this instance is premium..</param>
        /// <param name="adult">A value indicating whether this instance is adult only content..</param>
        /// <param name="richDescUrl">The rich desc URL..</param>
        /// <param name="thumbImage">The thumb image..</param>
        /// <param name="previewImage">The preview image..</param>
        /// <param name="type">The type..</param>
        /// <param name="targetFilename">The target filename..</param>
        /// <param name="owner">The owner..</param>
        /// <param name="category">The category..</param>
        /// <param name="tileColor">The catalog tile color..</param>
        /// <param name="featureId">The feature id of this package (if premium)..</param>
        /// <param name="price">The price for this package (if premium)..</param>
        /// <param name="targetSystem">targetSystem.</param>
        /// <param name="guid">The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates..</param>
        /// <param name="isRegistered">Whether or not this package is registered..</param>
        /// <param name="expDate">The expiration date for this package..</param>
        /// <param name="versions">The versions..</param>
        /// <param name="enableInAppStore">A value indicating whether \\[enable in application store\\]..</param>
        /// <param name="installs">The installs..</param>
        public PackageInfo(string id = default(string), string name = default(string), string shortDescription = default(string), string overview = default(string), bool? isPremium = default(bool?), bool? adult = default(bool?), string richDescUrl = default(string), string thumbImage = default(string), string previewImage = default(string), string type = default(string), string targetFilename = default(string), string owner = default(string), string category = default(string), string tileColor = default(string), string featureId = default(string), float? price = default(float?), PackageTargetSystem targetSystem = default(PackageTargetSystem), string guid = default(string), bool? isRegistered = default(bool?), DateTimeOffset? expDate = default(DateTimeOffset?), List<PackageVersionInfo> versions = default(List<PackageVersionInfo>), bool? enableInAppStore = default(bool?), int? installs = default(int?))
        {
            this.id = id;
            this.name = name;
            this.shortDescription = shortDescription;
            this.overview = overview;
            this.isPremium = isPremium;
            this.adult = adult;
            this.richDescUrl = richDescUrl;
            this.thumbImage = thumbImage;
            this.previewImage = previewImage;
            this.type = type;
            this.targetFilename = targetFilename;
            this.owner = owner;
            this.category = category;
            this.tileColor = tileColor;
            this.featureId = featureId;
            this.price = price;
            this.targetSystem = targetSystem;
            this.guid = guid;
            this.isRegistered = isRegistered;
            this.expDate = expDate;
            this.versions = versions;
            this.enableInAppStore = enableInAppStore;
            this.installs = installs;
        }
        
        /// <summary>
        /// The internal id of this package.
        /// </summary>
        /// <value>The internal id of this package.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string id { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string name { get; set; }

        /// <summary>
        /// The short description.
        /// </summary>
        /// <value>The short description.</value>
        [DataMember(Name="shortDescription", EmitDefaultValue=false)]
        public string shortDescription { get; set; }

        /// <summary>
        /// The overview.
        /// </summary>
        /// <value>The overview.</value>
        [DataMember(Name="overview", EmitDefaultValue=false)]
        public string overview { get; set; }

        /// <summary>
        /// A value indicating whether this instance is premium.
        /// </summary>
        /// <value>A value indicating whether this instance is premium.</value>
        [DataMember(Name="isPremium", EmitDefaultValue=false)]
        public bool? isPremium { get; set; }

        /// <summary>
        /// A value indicating whether this instance is adult only content.
        /// </summary>
        /// <value>A value indicating whether this instance is adult only content.</value>
        [DataMember(Name="adult", EmitDefaultValue=false)]
        public bool? adult { get; set; }

        /// <summary>
        /// The rich desc URL.
        /// </summary>
        /// <value>The rich desc URL.</value>
        [DataMember(Name="richDescUrl", EmitDefaultValue=false)]
        public string richDescUrl { get; set; }

        /// <summary>
        /// The thumb image.
        /// </summary>
        /// <value>The thumb image.</value>
        [DataMember(Name="thumbImage", EmitDefaultValue=false)]
        public string thumbImage { get; set; }

        /// <summary>
        /// The preview image.
        /// </summary>
        /// <value>The preview image.</value>
        [DataMember(Name="previewImage", EmitDefaultValue=false)]
        public string previewImage { get; set; }

        /// <summary>
        /// The type.
        /// </summary>
        /// <value>The type.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string type { get; set; }

        /// <summary>
        /// The target filename.
        /// </summary>
        /// <value>The target filename.</value>
        [DataMember(Name="targetFilename", EmitDefaultValue=false)]
        public string targetFilename { get; set; }

        /// <summary>
        /// The owner.
        /// </summary>
        /// <value>The owner.</value>
        [DataMember(Name="owner", EmitDefaultValue=false)]
        public string owner { get; set; }

        /// <summary>
        /// The category.
        /// </summary>
        /// <value>The category.</value>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public string category { get; set; }

        /// <summary>
        /// The catalog tile color.
        /// </summary>
        /// <value>The catalog tile color.</value>
        [DataMember(Name="tileColor", EmitDefaultValue=false)]
        public string tileColor { get; set; }

        /// <summary>
        /// The feature id of this package (if premium).
        /// </summary>
        /// <value>The feature id of this package (if premium).</value>
        [DataMember(Name="featureId", EmitDefaultValue=false)]
        public string featureId { get; set; }

        /// <summary>
        /// The price for this package (if premium).
        /// </summary>
        /// <value>The price for this package (if premium).</value>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public float? price { get; set; }

        /// <summary>
        /// Gets or Sets targetSystem
        /// </summary>
        [DataMember(Name="targetSystem", EmitDefaultValue=false)]
        public PackageTargetSystem targetSystem { get; set; }

        /// <summary>
        /// The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates.
        /// </summary>
        /// <value>The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates.</value>
        [DataMember(Name="guid", EmitDefaultValue=false)]
        public string guid { get; set; }

        /// <summary>
        /// Whether or not this package is registered.
        /// </summary>
        /// <value>Whether or not this package is registered.</value>
        [DataMember(Name="isRegistered", EmitDefaultValue=false)]
        public bool? isRegistered { get; set; }

        /// <summary>
        /// The expiration date for this package.
        /// </summary>
        /// <value>The expiration date for this package.</value>
        [DataMember(Name="expDate", EmitDefaultValue=false)]
        public DateTimeOffset? expDate { get; set; }

        /// <summary>
        /// The versions.
        /// </summary>
        /// <value>The versions.</value>
        [DataMember(Name="versions", EmitDefaultValue=false)]
        public List<PackageVersionInfo> versions { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable in application store\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable in application store\\].</value>
        [DataMember(Name="enableInAppStore", EmitDefaultValue=false)]
        public bool? enableInAppStore { get; set; }

        /// <summary>
        /// The installs.
        /// </summary>
        /// <value>The installs.</value>
        [DataMember(Name="installs", EmitDefaultValue=false)]
        public int? installs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PackageInfo {\n");
            sb.Append("  id: ").Append(id).Append("\n");
            sb.Append("  name: ").Append(name).Append("\n");
            sb.Append("  shortDescription: ").Append(shortDescription).Append("\n");
            sb.Append("  overview: ").Append(overview).Append("\n");
            sb.Append("  isPremium: ").Append(isPremium).Append("\n");
            sb.Append("  adult: ").Append(adult).Append("\n");
            sb.Append("  richDescUrl: ").Append(richDescUrl).Append("\n");
            sb.Append("  thumbImage: ").Append(thumbImage).Append("\n");
            sb.Append("  previewImage: ").Append(previewImage).Append("\n");
            sb.Append("  type: ").Append(type).Append("\n");
            sb.Append("  targetFilename: ").Append(targetFilename).Append("\n");
            sb.Append("  owner: ").Append(owner).Append("\n");
            sb.Append("  category: ").Append(category).Append("\n");
            sb.Append("  tileColor: ").Append(tileColor).Append("\n");
            sb.Append("  featureId: ").Append(featureId).Append("\n");
            sb.Append("  price: ").Append(price).Append("\n");
            sb.Append("  targetSystem: ").Append(targetSystem).Append("\n");
            sb.Append("  guid: ").Append(guid).Append("\n");
            sb.Append("  isRegistered: ").Append(isRegistered).Append("\n");
            sb.Append("  expDate: ").Append(expDate).Append("\n");
            sb.Append("  versions: ").Append(versions).Append("\n");
            sb.Append("  enableInAppStore: ").Append(enableInAppStore).Append("\n");
            sb.Append("  installs: ").Append(installs).Append("\n");
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
            return this.Equals(input as PackageInfo);
        }

        /// <summary>
        /// Returns true if PackageInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PackageInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PackageInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.id == input.id ||
                    (this.id != null &&
                    this.id.Equals(input.id))
                ) && 
                (
                    this.name == input.name ||
                    (this.name != null &&
                    this.name.Equals(input.name))
                ) && 
                (
                    this.shortDescription == input.shortDescription ||
                    (this.shortDescription != null &&
                    this.shortDescription.Equals(input.shortDescription))
                ) && 
                (
                    this.overview == input.overview ||
                    (this.overview != null &&
                    this.overview.Equals(input.overview))
                ) && 
                (
                    this.isPremium == input.isPremium ||
                    (this.isPremium != null &&
                    this.isPremium.Equals(input.isPremium))
                ) && 
                (
                    this.adult == input.adult ||
                    (this.adult != null &&
                    this.adult.Equals(input.adult))
                ) && 
                (
                    this.richDescUrl == input.richDescUrl ||
                    (this.richDescUrl != null &&
                    this.richDescUrl.Equals(input.richDescUrl))
                ) && 
                (
                    this.thumbImage == input.thumbImage ||
                    (this.thumbImage != null &&
                    this.thumbImage.Equals(input.thumbImage))
                ) && 
                (
                    this.previewImage == input.previewImage ||
                    (this.previewImage != null &&
                    this.previewImage.Equals(input.previewImage))
                ) && 
                (
                    this.type == input.type ||
                    (this.type != null &&
                    this.type.Equals(input.type))
                ) && 
                (
                    this.targetFilename == input.targetFilename ||
                    (this.targetFilename != null &&
                    this.targetFilename.Equals(input.targetFilename))
                ) && 
                (
                    this.owner == input.owner ||
                    (this.owner != null &&
                    this.owner.Equals(input.owner))
                ) && 
                (
                    this.category == input.category ||
                    (this.category != null &&
                    this.category.Equals(input.category))
                ) && 
                (
                    this.tileColor == input.tileColor ||
                    (this.tileColor != null &&
                    this.tileColor.Equals(input.tileColor))
                ) && 
                (
                    this.featureId == input.featureId ||
                    (this.featureId != null &&
                    this.featureId.Equals(input.featureId))
                ) && 
                (
                    this.price == input.price ||
                    (this.price != null &&
                    this.price.Equals(input.price))
                ) && 
                (
                    this.targetSystem == input.targetSystem ||
                    (this.targetSystem != null &&
                    this.targetSystem.Equals(input.targetSystem))
                ) && 
                (
                    this.guid == input.guid ||
                    (this.guid != null &&
                    this.guid.Equals(input.guid))
                ) && 
                (
                    this.isRegistered == input.isRegistered ||
                    (this.isRegistered != null &&
                    this.isRegistered.Equals(input.isRegistered))
                ) && 
                (
                    this.expDate == input.expDate ||
                    (this.expDate != null &&
                    this.expDate.Equals(input.expDate))
                ) && 
                (
                    this.versions == input.versions ||
                    this.versions != null &&
                    input.versions != null &&
                    this.versions.SequenceEqual(input.versions)
                ) && 
                (
                    this.enableInAppStore == input.enableInAppStore ||
                    (this.enableInAppStore != null &&
                    this.enableInAppStore.Equals(input.enableInAppStore))
                ) && 
                (
                    this.installs == input.installs ||
                    (this.installs != null &&
                    this.installs.Equals(input.installs))
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
                if (this.id != null)
                    hashCode = hashCode * 59 + this.id.GetHashCode();
                if (this.name != null)
                    hashCode = hashCode * 59 + this.name.GetHashCode();
                if (this.shortDescription != null)
                    hashCode = hashCode * 59 + this.shortDescription.GetHashCode();
                if (this.overview != null)
                    hashCode = hashCode * 59 + this.overview.GetHashCode();
                if (this.isPremium != null)
                    hashCode = hashCode * 59 + this.isPremium.GetHashCode();
                if (this.adult != null)
                    hashCode = hashCode * 59 + this.adult.GetHashCode();
                if (this.richDescUrl != null)
                    hashCode = hashCode * 59 + this.richDescUrl.GetHashCode();
                if (this.thumbImage != null)
                    hashCode = hashCode * 59 + this.thumbImage.GetHashCode();
                if (this.previewImage != null)
                    hashCode = hashCode * 59 + this.previewImage.GetHashCode();
                if (this.type != null)
                    hashCode = hashCode * 59 + this.type.GetHashCode();
                if (this.targetFilename != null)
                    hashCode = hashCode * 59 + this.targetFilename.GetHashCode();
                if (this.owner != null)
                    hashCode = hashCode * 59 + this.owner.GetHashCode();
                if (this.category != null)
                    hashCode = hashCode * 59 + this.category.GetHashCode();
                if (this.tileColor != null)
                    hashCode = hashCode * 59 + this.tileColor.GetHashCode();
                if (this.featureId != null)
                    hashCode = hashCode * 59 + this.featureId.GetHashCode();
                if (this.price != null)
                    hashCode = hashCode * 59 + this.price.GetHashCode();
                if (this.targetSystem != null)
                    hashCode = hashCode * 59 + this.targetSystem.GetHashCode();
                if (this.guid != null)
                    hashCode = hashCode * 59 + this.guid.GetHashCode();
                if (this.isRegistered != null)
                    hashCode = hashCode * 59 + this.isRegistered.GetHashCode();
                if (this.expDate != null)
                    hashCode = hashCode * 59 + this.expDate.GetHashCode();
                if (this.versions != null)
                    hashCode = hashCode * 59 + this.versions.GetHashCode();
                if (this.enableInAppStore != null)
                    hashCode = hashCode * 59 + this.enableInAppStore.GetHashCode();
                if (this.installs != null)
                    hashCode = hashCode * 59 + this.installs.GetHashCode();
                return hashCode;
            }
        }

    }
}
