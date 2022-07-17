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
    /// SyncSyncJob
    /// </summary>
    [DataContract]
        public partial class SyncSyncJob :  IEquatable<SyncSyncJob>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncSyncJob" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="targetId">targetId.</param>
        /// <param name="targetName">targetName.</param>
        /// <param name="quality">quality.</param>
        /// <param name="bitrate">bitrate.</param>
        /// <param name="container">container.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="profile">profile.</param>
        /// <param name="category">category.</param>
        /// <param name="parentId">parentId.</param>
        /// <param name="progress">progress.</param>
        /// <param name="name">name.</param>
        /// <param name="status">status.</param>
        /// <param name="userId">userId.</param>
        /// <param name="unwatchedOnly">unwatchedOnly.</param>
        /// <param name="syncNewContent">syncNewContent.</param>
        /// <param name="itemLimit">itemLimit.</param>
        /// <param name="requestedItemIds">requestedItemIds.</param>
        /// <param name="dateCreated">dateCreated.</param>
        /// <param name="dateLastModified">dateLastModified.</param>
        /// <param name="itemCount">itemCount.</param>
        /// <param name="parentName">parentName.</param>
        /// <param name="primaryImageItemId">primaryImageItemId.</param>
        /// <param name="primaryImageTag">primaryImageTag.</param>
        public SyncSyncJob(long? id = default(long?), string targetId = default(string), string targetName = default(string), string quality = default(string), int? bitrate = default(int?), string container = default(string), string videoCodec = default(string), string audioCodec = default(string), string profile = default(string), SyncSyncCategory category = default(SyncSyncCategory), long? parentId = default(long?), double? progress = default(double?), string name = default(string), SyncSyncJobStatus status = default(SyncSyncJobStatus), long? userId = default(long?), bool? unwatchedOnly = default(bool?), bool? syncNewContent = default(bool?), int? itemLimit = default(int?), List<long?> requestedItemIds = default(List<long?>), DateTimeOffset? dateCreated = default(DateTimeOffset?), DateTimeOffset? dateLastModified = default(DateTimeOffset?), int? itemCount = default(int?), string parentName = default(string), string primaryImageItemId = default(string), string primaryImageTag = default(string))
        {
            this.Id = id;
            this.TargetId = targetId;
            this.TargetName = targetName;
            this.Quality = quality;
            this.Bitrate = bitrate;
            this.Container = container;
            this.VideoCodec = videoCodec;
            this.AudioCodec = audioCodec;
            this.Profile = profile;
            this.Category = category;
            this.ParentId = parentId;
            this.Progress = progress;
            this.Name = name;
            this.Status = status;
            this.UserId = userId;
            this.UnwatchedOnly = unwatchedOnly;
            this.SyncNewContent = syncNewContent;
            this.ItemLimit = itemLimit;
            this.RequestedItemIds = requestedItemIds;
            this.DateCreated = dateCreated;
            this.DateLastModified = dateLastModified;
            this.ItemCount = itemCount;
            this.ParentName = parentName;
            this.PrimaryImageItemId = primaryImageItemId;
            this.PrimaryImageTag = primaryImageTag;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or Sets TargetId
        /// </summary>
        [DataMember(Name="TargetId", EmitDefaultValue=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// Gets or Sets TargetName
        /// </summary>
        [DataMember(Name="TargetName", EmitDefaultValue=false)]
        public string TargetName { get; set; }

        /// <summary>
        /// Gets or Sets Quality
        /// </summary>
        [DataMember(Name="Quality", EmitDefaultValue=false)]
        public string Quality { get; set; }

        /// <summary>
        /// Gets or Sets Bitrate
        /// </summary>
        [DataMember(Name="Bitrate", EmitDefaultValue=false)]
        public int? Bitrate { get; set; }

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
        /// Gets or Sets Profile
        /// </summary>
        [DataMember(Name="Profile", EmitDefaultValue=false)]
        public string Profile { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="Category", EmitDefaultValue=false)]
        public SyncSyncCategory Category { get; set; }

        /// <summary>
        /// Gets or Sets ParentId
        /// </summary>
        [DataMember(Name="ParentId", EmitDefaultValue=false)]
        public long? ParentId { get; set; }

        /// <summary>
        /// Gets or Sets Progress
        /// </summary>
        [DataMember(Name="Progress", EmitDefaultValue=false)]
        public double? Progress { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public SyncSyncJobStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public long? UserId { get; set; }

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
        /// Gets or Sets RequestedItemIds
        /// </summary>
        [DataMember(Name="RequestedItemIds", EmitDefaultValue=false)]
        public List<long?> RequestedItemIds { get; set; }

        /// <summary>
        /// Gets or Sets DateCreated
        /// </summary>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets DateLastModified
        /// </summary>
        [DataMember(Name="DateLastModified", EmitDefaultValue=false)]
        public DateTimeOffset? DateLastModified { get; set; }

        /// <summary>
        /// Gets or Sets ItemCount
        /// </summary>
        [DataMember(Name="ItemCount", EmitDefaultValue=false)]
        public int? ItemCount { get; set; }

        /// <summary>
        /// Gets or Sets ParentName
        /// </summary>
        [DataMember(Name="ParentName", EmitDefaultValue=false)]
        public string ParentName { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageItemId
        /// </summary>
        [DataMember(Name="PrimaryImageItemId", EmitDefaultValue=false)]
        public string PrimaryImageItemId { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageTag
        /// </summary>
        [DataMember(Name="PrimaryImageTag", EmitDefaultValue=false)]
        public string PrimaryImageTag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncSyncJob {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  TargetId: ").Append(TargetId).Append("\n");
            sb.Append("  TargetName: ").Append(TargetName).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Bitrate: ").Append(Bitrate).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  Profile: ").Append(Profile).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  Progress: ").Append(Progress).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  UnwatchedOnly: ").Append(UnwatchedOnly).Append("\n");
            sb.Append("  SyncNewContent: ").Append(SyncNewContent).Append("\n");
            sb.Append("  ItemLimit: ").Append(ItemLimit).Append("\n");
            sb.Append("  RequestedItemIds: ").Append(RequestedItemIds).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  DateLastModified: ").Append(DateLastModified).Append("\n");
            sb.Append("  ItemCount: ").Append(ItemCount).Append("\n");
            sb.Append("  ParentName: ").Append(ParentName).Append("\n");
            sb.Append("  PrimaryImageItemId: ").Append(PrimaryImageItemId).Append("\n");
            sb.Append("  PrimaryImageTag: ").Append(PrimaryImageTag).Append("\n");
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
            return this.Equals(input as SyncSyncJob);
        }

        /// <summary>
        /// Returns true if SyncSyncJob instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncSyncJob to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncSyncJob input)
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
                    this.TargetId == input.TargetId ||
                    (this.TargetId != null &&
                    this.TargetId.Equals(input.TargetId))
                ) && 
                (
                    this.TargetName == input.TargetName ||
                    (this.TargetName != null &&
                    this.TargetName.Equals(input.TargetName))
                ) && 
                (
                    this.Quality == input.Quality ||
                    (this.Quality != null &&
                    this.Quality.Equals(input.Quality))
                ) && 
                (
                    this.Bitrate == input.Bitrate ||
                    (this.Bitrate != null &&
                    this.Bitrate.Equals(input.Bitrate))
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
                    this.Profile == input.Profile ||
                    (this.Profile != null &&
                    this.Profile.Equals(input.Profile))
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
                    this.Progress == input.Progress ||
                    (this.Progress != null &&
                    this.Progress.Equals(input.Progress))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                    this.RequestedItemIds == input.RequestedItemIds ||
                    this.RequestedItemIds != null &&
                    input.RequestedItemIds != null &&
                    this.RequestedItemIds.SequenceEqual(input.RequestedItemIds)
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.DateLastModified == input.DateLastModified ||
                    (this.DateLastModified != null &&
                    this.DateLastModified.Equals(input.DateLastModified))
                ) && 
                (
                    this.ItemCount == input.ItemCount ||
                    (this.ItemCount != null &&
                    this.ItemCount.Equals(input.ItemCount))
                ) && 
                (
                    this.ParentName == input.ParentName ||
                    (this.ParentName != null &&
                    this.ParentName.Equals(input.ParentName))
                ) && 
                (
                    this.PrimaryImageItemId == input.PrimaryImageItemId ||
                    (this.PrimaryImageItemId != null &&
                    this.PrimaryImageItemId.Equals(input.PrimaryImageItemId))
                ) && 
                (
                    this.PrimaryImageTag == input.PrimaryImageTag ||
                    (this.PrimaryImageTag != null &&
                    this.PrimaryImageTag.Equals(input.PrimaryImageTag))
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
                if (this.TargetId != null)
                    hashCode = hashCode * 59 + this.TargetId.GetHashCode();
                if (this.TargetName != null)
                    hashCode = hashCode * 59 + this.TargetName.GetHashCode();
                if (this.Quality != null)
                    hashCode = hashCode * 59 + this.Quality.GetHashCode();
                if (this.Bitrate != null)
                    hashCode = hashCode * 59 + this.Bitrate.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.VideoCodec != null)
                    hashCode = hashCode * 59 + this.VideoCodec.GetHashCode();
                if (this.AudioCodec != null)
                    hashCode = hashCode * 59 + this.AudioCodec.GetHashCode();
                if (this.Profile != null)
                    hashCode = hashCode * 59 + this.Profile.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.ParentId != null)
                    hashCode = hashCode * 59 + this.ParentId.GetHashCode();
                if (this.Progress != null)
                    hashCode = hashCode * 59 + this.Progress.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.UnwatchedOnly != null)
                    hashCode = hashCode * 59 + this.UnwatchedOnly.GetHashCode();
                if (this.SyncNewContent != null)
                    hashCode = hashCode * 59 + this.SyncNewContent.GetHashCode();
                if (this.ItemLimit != null)
                    hashCode = hashCode * 59 + this.ItemLimit.GetHashCode();
                if (this.RequestedItemIds != null)
                    hashCode = hashCode * 59 + this.RequestedItemIds.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.DateLastModified != null)
                    hashCode = hashCode * 59 + this.DateLastModified.GetHashCode();
                if (this.ItemCount != null)
                    hashCode = hashCode * 59 + this.ItemCount.GetHashCode();
                if (this.ParentName != null)
                    hashCode = hashCode * 59 + this.ParentName.GetHashCode();
                if (this.PrimaryImageItemId != null)
                    hashCode = hashCode * 59 + this.PrimaryImageItemId.GetHashCode();
                if (this.PrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.PrimaryImageTag.GetHashCode();
                return hashCode;
            }
        }

    }
}
