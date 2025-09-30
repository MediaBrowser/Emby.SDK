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
    /// SyncJob
    /// </summary>
    [DataContract]
        public partial class SyncJob :  IEquatable<SyncJob>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncJob" /> class.
        /// </summary>
        /// <param name="id">The identifier..</param>
        /// <param name="targetId">The device identifier..</param>
        /// <param name="internalTargetId">internalTargetId.</param>
        /// <param name="targetName">The name of the target..</param>
        /// <param name="quality">The quality..</param>
        /// <param name="bitrate">The bitrate..</param>
        /// <param name="container">container.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="profile">The profile..</param>
        /// <param name="category">category.</param>
        /// <param name="parentId">The parent identifier..</param>
        /// <param name="progress">The current progress..</param>
        /// <param name="name">The name..</param>
        /// <param name="status">status.</param>
        /// <param name="userId">The user identifier..</param>
        /// <param name="unwatchedOnly">A value indicating whether \\[unwatched only\\]..</param>
        /// <param name="syncNewContent">A value indicating whether \\[synchronize new content\\]..</param>
        /// <param name="itemLimit">The item limit..</param>
        /// <param name="requestedItemIds">The requested item ids..</param>
        /// <param name="itemId">itemId.</param>
        /// <param name="dateCreated">The date created..</param>
        /// <param name="dateLastModified">The date last modified..</param>
        /// <param name="itemCount">The item count..</param>
        /// <param name="parentName">parentName.</param>
        /// <param name="primaryImageItemId">primaryImageItemId.</param>
        /// <param name="primaryImageTag">primaryImageTag.</param>
        public SyncJob(long? id = default(long?), string targetId = default(string), long? internalTargetId = default(long?), string targetName = default(string), string quality = default(string), int? bitrate = default(int?), string container = default(string), string videoCodec = default(string), string audioCodec = default(string), string profile = default(string), SyncCategory category = default(SyncCategory), long? parentId = default(long?), double? progress = default(double?), string name = default(string), SyncJobStatus status = default(SyncJobStatus), long? userId = default(long?), bool? unwatchedOnly = default(bool?), bool? syncNewContent = default(bool?), int? itemLimit = default(int?), List<long?> requestedItemIds = default(List<long?>), long? itemId = default(long?), DateTimeOffset? dateCreated = default(DateTimeOffset?), DateTimeOffset? dateLastModified = default(DateTimeOffset?), int? itemCount = default(int?), string parentName = default(string), string primaryImageItemId = default(string), string primaryImageTag = default(string))
        {
            this.Id = id;
            this.TargetId = targetId;
            this.InternalTargetId = internalTargetId;
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
            this.ItemId = itemId;
            this.DateCreated = dateCreated;
            this.DateLastModified = dateLastModified;
            this.ItemCount = itemCount;
            this.ParentName = parentName;
            this.PrimaryImageItemId = primaryImageItemId;
            this.PrimaryImageTag = primaryImageTag;
        }
        
        /// <summary>
        /// The identifier.
        /// </summary>
        /// <value>The identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// The device identifier.
        /// </summary>
        /// <value>The device identifier.</value>
        [DataMember(Name="TargetId", EmitDefaultValue=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// Gets or Sets InternalTargetId
        /// </summary>
        [DataMember(Name="InternalTargetId", EmitDefaultValue=false)]
        public long? InternalTargetId { get; set; }

        /// <summary>
        /// The name of the target.
        /// </summary>
        /// <value>The name of the target.</value>
        [DataMember(Name="TargetName", EmitDefaultValue=false)]
        public string TargetName { get; set; }

        /// <summary>
        /// The quality.
        /// </summary>
        /// <value>The quality.</value>
        [DataMember(Name="Quality", EmitDefaultValue=false)]
        public string Quality { get; set; }

        /// <summary>
        /// The bitrate.
        /// </summary>
        /// <value>The bitrate.</value>
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
        /// The profile.
        /// </summary>
        /// <value>The profile.</value>
        [DataMember(Name="Profile", EmitDefaultValue=false)]
        public string Profile { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="Category", EmitDefaultValue=false)]
        public SyncCategory Category { get; set; }

        /// <summary>
        /// The parent identifier.
        /// </summary>
        /// <value>The parent identifier.</value>
        [DataMember(Name="ParentId", EmitDefaultValue=false)]
        public long? ParentId { get; set; }

        /// <summary>
        /// The current progress.
        /// </summary>
        /// <value>The current progress.</value>
        [DataMember(Name="Progress", EmitDefaultValue=false)]
        public double? Progress { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public SyncJobStatus Status { get; set; }

        /// <summary>
        /// The user identifier.
        /// </summary>
        /// <value>The user identifier.</value>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public long? UserId { get; set; }

        /// <summary>
        /// A value indicating whether \\[unwatched only\\].
        /// </summary>
        /// <value>A value indicating whether \\[unwatched only\\].</value>
        [DataMember(Name="UnwatchedOnly", EmitDefaultValue=false)]
        public bool? UnwatchedOnly { get; set; }

        /// <summary>
        /// A value indicating whether \\[synchronize new content\\].
        /// </summary>
        /// <value>A value indicating whether \\[synchronize new content\\].</value>
        [DataMember(Name="SyncNewContent", EmitDefaultValue=false)]
        public bool? SyncNewContent { get; set; }

        /// <summary>
        /// The item limit.
        /// </summary>
        /// <value>The item limit.</value>
        [DataMember(Name="ItemLimit", EmitDefaultValue=false)]
        public int? ItemLimit { get; set; }

        /// <summary>
        /// The requested item ids.
        /// </summary>
        /// <value>The requested item ids.</value>
        [DataMember(Name="RequestedItemIds", EmitDefaultValue=false)]
        public List<long?> RequestedItemIds { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public long? ItemId { get; set; }

        /// <summary>
        /// The date created.
        /// </summary>
        /// <value>The date created.</value>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// The date last modified.
        /// </summary>
        /// <value>The date last modified.</value>
        [DataMember(Name="DateLastModified", EmitDefaultValue=false)]
        public DateTimeOffset? DateLastModified { get; set; }

        /// <summary>
        /// The item count.
        /// </summary>
        /// <value>The item count.</value>
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
            sb.Append("class SyncJob {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  TargetId: ").Append(TargetId).Append("\n");
            sb.Append("  InternalTargetId: ").Append(InternalTargetId).Append("\n");
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
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
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
            return this.Equals(input as SyncJob);
        }

        /// <summary>
        /// Returns true if SyncJob instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncJob to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncJob input)
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
                    this.InternalTargetId == input.InternalTargetId ||
                    (this.InternalTargetId != null &&
                    this.InternalTargetId.Equals(input.InternalTargetId))
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
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
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
                if (this.InternalTargetId != null)
                    hashCode = hashCode * 59 + this.InternalTargetId.GetHashCode();
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
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
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
