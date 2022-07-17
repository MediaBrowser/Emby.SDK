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
    /// LiveTvTimerInfoDto
    /// </summary>
    [DataContract]
        public partial class LiveTvTimerInfoDto :  IEquatable<LiveTvTimerInfoDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvTimerInfoDto" /> class.
        /// </summary>
        /// <param name="status">status.</param>
        /// <param name="seriesTimerId">seriesTimerId.</param>
        /// <param name="runTimeTicks">runTimeTicks.</param>
        /// <param name="programInfo">programInfo.</param>
        /// <param name="timerType">timerType.</param>
        /// <param name="id">id.</param>
        /// <param name="type">type.</param>
        /// <param name="serverId">serverId.</param>
        /// <param name="channelId">channelId.</param>
        /// <param name="channelName">channelName.</param>
        /// <param name="channelPrimaryImageTag">channelPrimaryImageTag.</param>
        /// <param name="programId">programId.</param>
        /// <param name="name">name.</param>
        /// <param name="overview">overview.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="priority">priority.</param>
        /// <param name="prePaddingSeconds">prePaddingSeconds.</param>
        /// <param name="postPaddingSeconds">postPaddingSeconds.</param>
        /// <param name="isPrePaddingRequired">isPrePaddingRequired.</param>
        /// <param name="parentBackdropItemId">parentBackdropItemId.</param>
        /// <param name="parentBackdropImageTags">parentBackdropImageTags.</param>
        /// <param name="isPostPaddingRequired">isPostPaddingRequired.</param>
        /// <param name="keepUntil">keepUntil.</param>
        public LiveTvTimerInfoDto(LiveTvRecordingStatus status = default(LiveTvRecordingStatus), string seriesTimerId = default(string), long? runTimeTicks = default(long?), BaseItemDto programInfo = default(BaseItemDto), LiveTvTimerType timerType = default(LiveTvTimerType), string id = default(string), string type = default(string), string serverId = default(string), string channelId = default(string), string channelName = default(string), string channelPrimaryImageTag = default(string), string programId = default(string), string name = default(string), string overview = default(string), DateTimeOffset? startDate = default(DateTimeOffset?), DateTimeOffset? endDate = default(DateTimeOffset?), int? priority = default(int?), int? prePaddingSeconds = default(int?), int? postPaddingSeconds = default(int?), bool? isPrePaddingRequired = default(bool?), string parentBackdropItemId = default(string), List<string> parentBackdropImageTags = default(List<string>), bool? isPostPaddingRequired = default(bool?), LiveTvKeepUntil keepUntil = default(LiveTvKeepUntil))
        {
            this.Status = status;
            this.SeriesTimerId = seriesTimerId;
            this.RunTimeTicks = runTimeTicks;
            this.ProgramInfo = programInfo;
            this.TimerType = timerType;
            this.Id = id;
            this.Type = type;
            this.ServerId = serverId;
            this.ChannelId = channelId;
            this.ChannelName = channelName;
            this.ChannelPrimaryImageTag = channelPrimaryImageTag;
            this.ProgramId = programId;
            this.Name = name;
            this.Overview = overview;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.Priority = priority;
            this.PrePaddingSeconds = prePaddingSeconds;
            this.PostPaddingSeconds = postPaddingSeconds;
            this.IsPrePaddingRequired = isPrePaddingRequired;
            this.ParentBackdropItemId = parentBackdropItemId;
            this.ParentBackdropImageTags = parentBackdropImageTags;
            this.IsPostPaddingRequired = isPostPaddingRequired;
            this.KeepUntil = keepUntil;
        }
        
        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public LiveTvRecordingStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets SeriesTimerId
        /// </summary>
        [DataMember(Name="SeriesTimerId", EmitDefaultValue=false)]
        public string SeriesTimerId { get; set; }

        /// <summary>
        /// Gets or Sets RunTimeTicks
        /// </summary>
        [DataMember(Name="RunTimeTicks", EmitDefaultValue=false)]
        public long? RunTimeTicks { get; set; }

        /// <summary>
        /// Gets or Sets ProgramInfo
        /// </summary>
        [DataMember(Name="ProgramInfo", EmitDefaultValue=false)]
        public BaseItemDto ProgramInfo { get; set; }

        /// <summary>
        /// Gets or Sets TimerType
        /// </summary>
        [DataMember(Name="TimerType", EmitDefaultValue=false)]
        public LiveTvTimerType TimerType { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets ServerId
        /// </summary>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Gets or Sets ChannelId
        /// </summary>
        [DataMember(Name="ChannelId", EmitDefaultValue=false)]
        public string ChannelId { get; set; }

        /// <summary>
        /// Gets or Sets ChannelName
        /// </summary>
        [DataMember(Name="ChannelName", EmitDefaultValue=false)]
        public string ChannelName { get; set; }

        /// <summary>
        /// Gets or Sets ChannelPrimaryImageTag
        /// </summary>
        [DataMember(Name="ChannelPrimaryImageTag", EmitDefaultValue=false)]
        public string ChannelPrimaryImageTag { get; set; }

        /// <summary>
        /// Gets or Sets ProgramId
        /// </summary>
        [DataMember(Name="ProgramId", EmitDefaultValue=false)]
        public string ProgramId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Overview
        /// </summary>
        [DataMember(Name="Overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="StartDate", EmitDefaultValue=false)]
        public DateTimeOffset? StartDate { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="EndDate", EmitDefaultValue=false)]
        public DateTimeOffset? EndDate { get; set; }

        /// <summary>
        /// Gets or Sets Priority
        /// </summary>
        [DataMember(Name="Priority", EmitDefaultValue=false)]
        public int? Priority { get; set; }

        /// <summary>
        /// Gets or Sets PrePaddingSeconds
        /// </summary>
        [DataMember(Name="PrePaddingSeconds", EmitDefaultValue=false)]
        public int? PrePaddingSeconds { get; set; }

        /// <summary>
        /// Gets or Sets PostPaddingSeconds
        /// </summary>
        [DataMember(Name="PostPaddingSeconds", EmitDefaultValue=false)]
        public int? PostPaddingSeconds { get; set; }

        /// <summary>
        /// Gets or Sets IsPrePaddingRequired
        /// </summary>
        [DataMember(Name="IsPrePaddingRequired", EmitDefaultValue=false)]
        public bool? IsPrePaddingRequired { get; set; }

        /// <summary>
        /// Gets or Sets ParentBackdropItemId
        /// </summary>
        [DataMember(Name="ParentBackdropItemId", EmitDefaultValue=false)]
        public string ParentBackdropItemId { get; set; }

        /// <summary>
        /// Gets or Sets ParentBackdropImageTags
        /// </summary>
        [DataMember(Name="ParentBackdropImageTags", EmitDefaultValue=false)]
        public List<string> ParentBackdropImageTags { get; set; }

        /// <summary>
        /// Gets or Sets IsPostPaddingRequired
        /// </summary>
        [DataMember(Name="IsPostPaddingRequired", EmitDefaultValue=false)]
        public bool? IsPostPaddingRequired { get; set; }

        /// <summary>
        /// Gets or Sets KeepUntil
        /// </summary>
        [DataMember(Name="KeepUntil", EmitDefaultValue=false)]
        public LiveTvKeepUntil KeepUntil { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvTimerInfoDto {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  SeriesTimerId: ").Append(SeriesTimerId).Append("\n");
            sb.Append("  RunTimeTicks: ").Append(RunTimeTicks).Append("\n");
            sb.Append("  ProgramInfo: ").Append(ProgramInfo).Append("\n");
            sb.Append("  TimerType: ").Append(TimerType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  ChannelId: ").Append(ChannelId).Append("\n");
            sb.Append("  ChannelName: ").Append(ChannelName).Append("\n");
            sb.Append("  ChannelPrimaryImageTag: ").Append(ChannelPrimaryImageTag).Append("\n");
            sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("  PrePaddingSeconds: ").Append(PrePaddingSeconds).Append("\n");
            sb.Append("  PostPaddingSeconds: ").Append(PostPaddingSeconds).Append("\n");
            sb.Append("  IsPrePaddingRequired: ").Append(IsPrePaddingRequired).Append("\n");
            sb.Append("  ParentBackdropItemId: ").Append(ParentBackdropItemId).Append("\n");
            sb.Append("  ParentBackdropImageTags: ").Append(ParentBackdropImageTags).Append("\n");
            sb.Append("  IsPostPaddingRequired: ").Append(IsPostPaddingRequired).Append("\n");
            sb.Append("  KeepUntil: ").Append(KeepUntil).Append("\n");
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
            return this.Equals(input as LiveTvTimerInfoDto);
        }

        /// <summary>
        /// Returns true if LiveTvTimerInfoDto instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvTimerInfoDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvTimerInfoDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.SeriesTimerId == input.SeriesTimerId ||
                    (this.SeriesTimerId != null &&
                    this.SeriesTimerId.Equals(input.SeriesTimerId))
                ) && 
                (
                    this.RunTimeTicks == input.RunTimeTicks ||
                    (this.RunTimeTicks != null &&
                    this.RunTimeTicks.Equals(input.RunTimeTicks))
                ) && 
                (
                    this.ProgramInfo == input.ProgramInfo ||
                    (this.ProgramInfo != null &&
                    this.ProgramInfo.Equals(input.ProgramInfo))
                ) && 
                (
                    this.TimerType == input.TimerType ||
                    (this.TimerType != null &&
                    this.TimerType.Equals(input.TimerType))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
                ) && 
                (
                    this.ChannelId == input.ChannelId ||
                    (this.ChannelId != null &&
                    this.ChannelId.Equals(input.ChannelId))
                ) && 
                (
                    this.ChannelName == input.ChannelName ||
                    (this.ChannelName != null &&
                    this.ChannelName.Equals(input.ChannelName))
                ) && 
                (
                    this.ChannelPrimaryImageTag == input.ChannelPrimaryImageTag ||
                    (this.ChannelPrimaryImageTag != null &&
                    this.ChannelPrimaryImageTag.Equals(input.ChannelPrimaryImageTag))
                ) && 
                (
                    this.ProgramId == input.ProgramId ||
                    (this.ProgramId != null &&
                    this.ProgramId.Equals(input.ProgramId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Overview == input.Overview ||
                    (this.Overview != null &&
                    this.Overview.Equals(input.Overview))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Priority == input.Priority ||
                    (this.Priority != null &&
                    this.Priority.Equals(input.Priority))
                ) && 
                (
                    this.PrePaddingSeconds == input.PrePaddingSeconds ||
                    (this.PrePaddingSeconds != null &&
                    this.PrePaddingSeconds.Equals(input.PrePaddingSeconds))
                ) && 
                (
                    this.PostPaddingSeconds == input.PostPaddingSeconds ||
                    (this.PostPaddingSeconds != null &&
                    this.PostPaddingSeconds.Equals(input.PostPaddingSeconds))
                ) && 
                (
                    this.IsPrePaddingRequired == input.IsPrePaddingRequired ||
                    (this.IsPrePaddingRequired != null &&
                    this.IsPrePaddingRequired.Equals(input.IsPrePaddingRequired))
                ) && 
                (
                    this.ParentBackdropItemId == input.ParentBackdropItemId ||
                    (this.ParentBackdropItemId != null &&
                    this.ParentBackdropItemId.Equals(input.ParentBackdropItemId))
                ) && 
                (
                    this.ParentBackdropImageTags == input.ParentBackdropImageTags ||
                    this.ParentBackdropImageTags != null &&
                    input.ParentBackdropImageTags != null &&
                    this.ParentBackdropImageTags.SequenceEqual(input.ParentBackdropImageTags)
                ) && 
                (
                    this.IsPostPaddingRequired == input.IsPostPaddingRequired ||
                    (this.IsPostPaddingRequired != null &&
                    this.IsPostPaddingRequired.Equals(input.IsPostPaddingRequired))
                ) && 
                (
                    this.KeepUntil == input.KeepUntil ||
                    (this.KeepUntil != null &&
                    this.KeepUntil.Equals(input.KeepUntil))
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
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.SeriesTimerId != null)
                    hashCode = hashCode * 59 + this.SeriesTimerId.GetHashCode();
                if (this.RunTimeTicks != null)
                    hashCode = hashCode * 59 + this.RunTimeTicks.GetHashCode();
                if (this.ProgramInfo != null)
                    hashCode = hashCode * 59 + this.ProgramInfo.GetHashCode();
                if (this.TimerType != null)
                    hashCode = hashCode * 59 + this.TimerType.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.ChannelId != null)
                    hashCode = hashCode * 59 + this.ChannelId.GetHashCode();
                if (this.ChannelName != null)
                    hashCode = hashCode * 59 + this.ChannelName.GetHashCode();
                if (this.ChannelPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.ChannelPrimaryImageTag.GetHashCode();
                if (this.ProgramId != null)
                    hashCode = hashCode * 59 + this.ProgramId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.Priority != null)
                    hashCode = hashCode * 59 + this.Priority.GetHashCode();
                if (this.PrePaddingSeconds != null)
                    hashCode = hashCode * 59 + this.PrePaddingSeconds.GetHashCode();
                if (this.PostPaddingSeconds != null)
                    hashCode = hashCode * 59 + this.PostPaddingSeconds.GetHashCode();
                if (this.IsPrePaddingRequired != null)
                    hashCode = hashCode * 59 + this.IsPrePaddingRequired.GetHashCode();
                if (this.ParentBackdropItemId != null)
                    hashCode = hashCode * 59 + this.ParentBackdropItemId.GetHashCode();
                if (this.ParentBackdropImageTags != null)
                    hashCode = hashCode * 59 + this.ParentBackdropImageTags.GetHashCode();
                if (this.IsPostPaddingRequired != null)
                    hashCode = hashCode * 59 + this.IsPostPaddingRequired.GetHashCode();
                if (this.KeepUntil != null)
                    hashCode = hashCode * 59 + this.KeepUntil.GetHashCode();
                return hashCode;
            }
        }

    }
}
