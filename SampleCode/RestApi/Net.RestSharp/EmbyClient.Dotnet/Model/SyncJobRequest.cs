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
    /// SyncJobRequest
    /// </summary>
    [DataContract]
        public partial class SyncJobRequest :  IEquatable<SyncJobRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncJobRequest" /> class.
        /// </summary>
        /// <param name="targetId">targetId.</param>
        /// <param name="itemIds">itemIds.</param>
        /// <param name="category">category.</param>
        /// <param name="parentId">parentId.</param>
        /// <param name="quality">quality.</param>
        /// <param name="profile">profile.</param>
        /// <param name="container">container.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="name">name.</param>
        /// <param name="userId">userId.</param>
        /// <param name="unwatchedOnly">unwatchedOnly.</param>
        /// <param name="syncNewContent">syncNewContent.</param>
        /// <param name="itemLimit">itemLimit.</param>
        /// <param name="bitrate">bitrate.</param>
        /// <param name="downloaded">downloaded.</param>
        public SyncJobRequest(string targetId = default(string), List<string> itemIds = default(List<string>), SyncCategory category = default(SyncCategory), string parentId = default(string), string quality = default(string), string profile = default(string), string container = default(string), string videoCodec = default(string), string audioCodec = default(string), string name = default(string), string userId = default(string), bool? unwatchedOnly = default(bool?), bool? syncNewContent = default(bool?), int? itemLimit = default(int?), int? bitrate = default(int?), bool? downloaded = default(bool?))
        {
            this.TargetId = targetId;
            this.ItemIds = itemIds;
            this.Category = category;
            this.ParentId = parentId;
            this.Quality = quality;
            this.Profile = profile;
            this.Container = container;
            this.VideoCodec = videoCodec;
            this.AudioCodec = audioCodec;
            this.Name = name;
            this.UserId = userId;
            this.UnwatchedOnly = unwatchedOnly;
            this.SyncNewContent = syncNewContent;
            this.ItemLimit = itemLimit;
            this.Bitrate = bitrate;
            this.Downloaded = downloaded;
        }
        
        /// <summary>
        /// Gets or Sets TargetId
        /// </summary>
        [DataMember(Name="TargetId", EmitDefaultValue=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// Gets or Sets ItemIds
        /// </summary>
        [DataMember(Name="ItemIds", EmitDefaultValue=false)]
        public List<string> ItemIds { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="Category", EmitDefaultValue=false)]
        public SyncCategory Category { get; set; }

        /// <summary>
        /// Gets or Sets ParentId
        /// </summary>
        [DataMember(Name="ParentId", EmitDefaultValue=false)]
        public string ParentId { get; set; }

        /// <summary>
        /// Gets or Sets Quality
        /// </summary>
        [DataMember(Name="Quality", EmitDefaultValue=false)]
        public string Quality { get; set; }

        /// <summary>
        /// Gets or Sets Profile
        /// </summary>
        [DataMember(Name="Profile", EmitDefaultValue=false)]
        public string Profile { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets VideoCodec
        /// </summary>
        [DataMember(Name="VideoCodec", EmitDefaultValue=false)]
        public string VideoCodec { get; set; }

        /// <summary>
        /// Gets or Sets AudioCodec
        /// </summary>
        [DataMember(Name="AudioCodec", EmitDefaultValue=false)]
        public string AudioCodec { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets UnwatchedOnly
        /// </summary>
        [DataMember(Name="UnwatchedOnly", EmitDefaultValue=false)]
        public bool? UnwatchedOnly { get; set; }

        /// <summary>
        /// Gets or Sets SyncNewContent
        /// </summary>
        [DataMember(Name="SyncNewContent", EmitDefaultValue=false)]
        public bool? SyncNewContent { get; set; }

        /// <summary>
        /// Gets or Sets ItemLimit
        /// </summary>
        [DataMember(Name="ItemLimit", EmitDefaultValue=false)]
        public int? ItemLimit { get; set; }

        /// <summary>
        /// Gets or Sets Bitrate
        /// </summary>
        [DataMember(Name="Bitrate", EmitDefaultValue=false)]
        public int? Bitrate { get; set; }

        /// <summary>
        /// Gets or Sets Downloaded
        /// </summary>
        [DataMember(Name="Downloaded", EmitDefaultValue=false)]
        public bool? Downloaded { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncJobRequest {\n");
            sb.Append("  TargetId: ").Append(TargetId).Append("\n");
            sb.Append("  ItemIds: ").Append(ItemIds).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Profile: ").Append(Profile).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  UnwatchedOnly: ").Append(UnwatchedOnly).Append("\n");
            sb.Append("  SyncNewContent: ").Append(SyncNewContent).Append("\n");
            sb.Append("  ItemLimit: ").Append(ItemLimit).Append("\n");
            sb.Append("  Bitrate: ").Append(Bitrate).Append("\n");
            sb.Append("  Downloaded: ").Append(Downloaded).Append("\n");
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
            return this.Equals(input as SyncJobRequest);
        }

        /// <summary>
        /// Returns true if SyncJobRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncJobRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncJobRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TargetId == input.TargetId ||
                    (this.TargetId != null &&
                    this.TargetId.Equals(input.TargetId))
                ) && 
                (
                    this.ItemIds == input.ItemIds ||
                    this.ItemIds != null &&
                    input.ItemIds != null &&
                    this.ItemIds.SequenceEqual(input.ItemIds)
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.ParentId == input.ParentId ||
                    (this.ParentId != null &&
                    this.ParentId.Equals(input.ParentId))
                ) && 
                (
                    this.Quality == input.Quality ||
                    (this.Quality != null &&
                    this.Quality.Equals(input.Quality))
                ) && 
                (
                    this.Profile == input.Profile ||
                    (this.Profile != null &&
                    this.Profile.Equals(input.Profile))
                ) && 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.VideoCodec == input.VideoCodec ||
                    (this.VideoCodec != null &&
                    this.VideoCodec.Equals(input.VideoCodec))
                ) && 
                (
                    this.AudioCodec == input.AudioCodec ||
                    (this.AudioCodec != null &&
                    this.AudioCodec.Equals(input.AudioCodec))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.UnwatchedOnly == input.UnwatchedOnly ||
                    (this.UnwatchedOnly != null &&
                    this.UnwatchedOnly.Equals(input.UnwatchedOnly))
                ) && 
                (
                    this.SyncNewContent == input.SyncNewContent ||
                    (this.SyncNewContent != null &&
                    this.SyncNewContent.Equals(input.SyncNewContent))
                ) && 
                (
                    this.ItemLimit == input.ItemLimit ||
                    (this.ItemLimit != null &&
                    this.ItemLimit.Equals(input.ItemLimit))
                ) && 
                (
                    this.Bitrate == input.Bitrate ||
                    (this.Bitrate != null &&
                    this.Bitrate.Equals(input.Bitrate))
                ) && 
                (
                    this.Downloaded == input.Downloaded ||
                    (this.Downloaded != null &&
                    this.Downloaded.Equals(input.Downloaded))
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
                if (this.TargetId != null)
                    hashCode = hashCode * 59 + this.TargetId.GetHashCode();
                if (this.ItemIds != null)
                    hashCode = hashCode * 59 + this.ItemIds.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.ParentId != null)
                    hashCode = hashCode * 59 + this.ParentId.GetHashCode();
                if (this.Quality != null)
                    hashCode = hashCode * 59 + this.Quality.GetHashCode();
                if (this.Profile != null)
                    hashCode = hashCode * 59 + this.Profile.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.VideoCodec != null)
                    hashCode = hashCode * 59 + this.VideoCodec.GetHashCode();
                if (this.AudioCodec != null)
                    hashCode = hashCode * 59 + this.AudioCodec.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.UnwatchedOnly != null)
                    hashCode = hashCode * 59 + this.UnwatchedOnly.GetHashCode();
                if (this.SyncNewContent != null)
                    hashCode = hashCode * 59 + this.SyncNewContent.GetHashCode();
                if (this.ItemLimit != null)
                    hashCode = hashCode * 59 + this.ItemLimit.GetHashCode();
                if (this.Bitrate != null)
                    hashCode = hashCode * 59 + this.Bitrate.GetHashCode();
                if (this.Downloaded != null)
                    hashCode = hashCode * 59 + this.Downloaded.GetHashCode();
                return hashCode;
            }
        }

    }
}
