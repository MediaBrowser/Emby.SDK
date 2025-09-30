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
    /// Class SeriesTimerInfoDto.  
    /// </summary>
    [DataContract]
        public partial class LiveTvSeriesTimerInfoDto :  IEquatable<LiveTvSeriesTimerInfoDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvSeriesTimerInfoDto" /> class.
        /// </summary>
        /// <param name="recordAnyTime">A value indicating whether \\[record any time\\]..</param>
        /// <param name="skipEpisodesInLibrary">skipEpisodesInLibrary.</param>
        /// <param name="matchExistingItemsWithAnyLibrary">matchExistingItemsWithAnyLibrary.</param>
        /// <param name="recordAnyChannel">A value indicating whether \\[record any channel\\]..</param>
        /// <param name="keepUpTo">keepUpTo.</param>
        /// <param name="maxRecordingSeconds">maxRecordingSeconds.</param>
        /// <param name="recordNewOnly">A value indicating whether \\[record new only\\]..</param>
        /// <param name="channelIds">channelIds.</param>
        /// <param name="days">The days..</param>
        /// <param name="imageTags">The image tags..</param>
        /// <param name="parentThumbItemId">The parent thumb item id..</param>
        /// <param name="parentThumbImageTag">The parent thumb image tag..</param>
        /// <param name="parentPrimaryImageItemId">The parent primary image item identifier..</param>
        /// <param name="parentPrimaryImageTag">The parent primary image tag..</param>
        /// <param name="seriesId">seriesId.</param>
        /// <param name="keywords">keywords.</param>
        /// <param name="timerType">timerType.</param>
        /// <param name="id">Id of the recording..</param>
        /// <param name="type">type.</param>
        /// <param name="serverId">The server identifier..</param>
        /// <param name="channelId">ChannelId of the recording..</param>
        /// <param name="channelName">ChannelName of the recording..</param>
        /// <param name="channelNumber">channelNumber.</param>
        /// <param name="channelPrimaryImageTag">channelPrimaryImageTag.</param>
        /// <param name="programId">The program identifier..</param>
        /// <param name="name">Name of the recording..</param>
        /// <param name="overview">Description of the recording..</param>
        /// <param name="parentFolderId">parentFolderId.</param>
        /// <param name="startDate">The start date of the recording, in UTC..</param>
        /// <param name="endDate">The end date of the recording, in UTC..</param>
        /// <param name="priority">The priority..</param>
        /// <param name="prePaddingSeconds">The pre padding seconds..</param>
        /// <param name="postPaddingSeconds">The post padding seconds..</param>
        /// <param name="isPrePaddingRequired">A value indicating whether this instance is pre padding required..</param>
        /// <param name="parentBackdropItemId">If the item does not have any backdrops, this will hold the Id of the Parent that has one..</param>
        /// <param name="parentBackdropImageTags">The parent backdrop image tags..</param>
        /// <param name="isPostPaddingRequired">A value indicating whether this instance is post padding required..</param>
        /// <param name="keepUntil">keepUntil.</param>
        public LiveTvSeriesTimerInfoDto(bool? recordAnyTime = default(bool?), bool? skipEpisodesInLibrary = default(bool?), bool? matchExistingItemsWithAnyLibrary = default(bool?), bool? recordAnyChannel = default(bool?), int? keepUpTo = default(int?), int? maxRecordingSeconds = default(int?), bool? recordNewOnly = default(bool?), List<string> channelIds = default(List<string>), List<DayOfWeek> days = default(List<DayOfWeek>), Dictionary<string, string> imageTags = default(Dictionary<string, string>), string parentThumbItemId = default(string), string parentThumbImageTag = default(string), string parentPrimaryImageItemId = default(string), string parentPrimaryImageTag = default(string), string seriesId = default(string), List<LiveTvKeywordInfo> keywords = default(List<LiveTvKeywordInfo>), LiveTvTimerType timerType = default(LiveTvTimerType), string id = default(string), string type = default(string), string serverId = default(string), string channelId = default(string), string channelName = default(string), string channelNumber = default(string), string channelPrimaryImageTag = default(string), string programId = default(string), string name = default(string), string overview = default(string), string parentFolderId = default(string), DateTimeOffset? startDate = default(DateTimeOffset?), DateTimeOffset? endDate = default(DateTimeOffset?), int? priority = default(int?), int? prePaddingSeconds = default(int?), int? postPaddingSeconds = default(int?), bool? isPrePaddingRequired = default(bool?), string parentBackdropItemId = default(string), List<string> parentBackdropImageTags = default(List<string>), bool? isPostPaddingRequired = default(bool?), LiveTvKeepUntil keepUntil = default(LiveTvKeepUntil))
        {
            this.RecordAnyTime = recordAnyTime;
            this.SkipEpisodesInLibrary = skipEpisodesInLibrary;
            this.MatchExistingItemsWithAnyLibrary = matchExistingItemsWithAnyLibrary;
            this.RecordAnyChannel = recordAnyChannel;
            this.KeepUpTo = keepUpTo;
            this.MaxRecordingSeconds = maxRecordingSeconds;
            this.RecordNewOnly = recordNewOnly;
            this.ChannelIds = channelIds;
            this.Days = days;
            this.ImageTags = imageTags;
            this.ParentThumbItemId = parentThumbItemId;
            this.ParentThumbImageTag = parentThumbImageTag;
            this.ParentPrimaryImageItemId = parentPrimaryImageItemId;
            this.ParentPrimaryImageTag = parentPrimaryImageTag;
            this.SeriesId = seriesId;
            this.Keywords = keywords;
            this.TimerType = timerType;
            this.Id = id;
            this.Type = type;
            this.ServerId = serverId;
            this.ChannelId = channelId;
            this.ChannelName = channelName;
            this.ChannelNumber = channelNumber;
            this.ChannelPrimaryImageTag = channelPrimaryImageTag;
            this.ProgramId = programId;
            this.Name = name;
            this.Overview = overview;
            this.ParentFolderId = parentFolderId;
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
        /// A value indicating whether \\[record any time\\].
        /// </summary>
        /// <value>A value indicating whether \\[record any time\\].</value>
        [DataMember(Name="RecordAnyTime", EmitDefaultValue=false)]
        public bool? RecordAnyTime { get; set; }

        /// <summary>
        /// Gets or Sets SkipEpisodesInLibrary
        /// </summary>
        [DataMember(Name="SkipEpisodesInLibrary", EmitDefaultValue=false)]
        public bool? SkipEpisodesInLibrary { get; set; }

        /// <summary>
        /// Gets or Sets MatchExistingItemsWithAnyLibrary
        /// </summary>
        [DataMember(Name="MatchExistingItemsWithAnyLibrary", EmitDefaultValue=false)]
        public bool? MatchExistingItemsWithAnyLibrary { get; set; }

        /// <summary>
        /// A value indicating whether \\[record any channel\\].
        /// </summary>
        /// <value>A value indicating whether \\[record any channel\\].</value>
        [DataMember(Name="RecordAnyChannel", EmitDefaultValue=false)]
        public bool? RecordAnyChannel { get; set; }

        /// <summary>
        /// Gets or Sets KeepUpTo
        /// </summary>
        [DataMember(Name="KeepUpTo", EmitDefaultValue=false)]
        public int? KeepUpTo { get; set; }

        /// <summary>
        /// Gets or Sets MaxRecordingSeconds
        /// </summary>
        [DataMember(Name="MaxRecordingSeconds", EmitDefaultValue=false)]
        public int? MaxRecordingSeconds { get; set; }

        /// <summary>
        /// A value indicating whether \\[record new only\\].
        /// </summary>
        /// <value>A value indicating whether \\[record new only\\].</value>
        [DataMember(Name="RecordNewOnly", EmitDefaultValue=false)]
        public bool? RecordNewOnly { get; set; }

        /// <summary>
        /// Gets or Sets ChannelIds
        /// </summary>
        [DataMember(Name="ChannelIds", EmitDefaultValue=false)]
        public List<string> ChannelIds { get; set; }

        /// <summary>
        /// The days.
        /// </summary>
        /// <value>The days.</value>
        [DataMember(Name="Days", EmitDefaultValue=false)]
        public List<DayOfWeek> Days { get; set; }

        /// <summary>
        /// The image tags.
        /// </summary>
        /// <value>The image tags.</value>
        [DataMember(Name="ImageTags", EmitDefaultValue=false)]
        public Dictionary<string, string> ImageTags { get; set; }

        /// <summary>
        /// The parent thumb item id.
        /// </summary>
        /// <value>The parent thumb item id.</value>
        [DataMember(Name="ParentThumbItemId", EmitDefaultValue=false)]
        public string ParentThumbItemId { get; set; }

        /// <summary>
        /// The parent thumb image tag.
        /// </summary>
        /// <value>The parent thumb image tag.</value>
        [DataMember(Name="ParentThumbImageTag", EmitDefaultValue=false)]
        public string ParentThumbImageTag { get; set; }

        /// <summary>
        /// The parent primary image item identifier.
        /// </summary>
        /// <value>The parent primary image item identifier.</value>
        [DataMember(Name="ParentPrimaryImageItemId", EmitDefaultValue=false)]
        public string ParentPrimaryImageItemId { get; set; }

        /// <summary>
        /// The parent primary image tag.
        /// </summary>
        /// <value>The parent primary image tag.</value>
        [DataMember(Name="ParentPrimaryImageTag", EmitDefaultValue=false)]
        public string ParentPrimaryImageTag { get; set; }

        /// <summary>
        /// Gets or Sets SeriesId
        /// </summary>
        [DataMember(Name="SeriesId", EmitDefaultValue=false)]
        public string SeriesId { get; set; }

        /// <summary>
        /// Gets or Sets Keywords
        /// </summary>
        [DataMember(Name="Keywords", EmitDefaultValue=false)]
        public List<LiveTvKeywordInfo> Keywords { get; set; }

        /// <summary>
        /// Gets or Sets TimerType
        /// </summary>
        [DataMember(Name="TimerType", EmitDefaultValue=false)]
        public LiveTvTimerType TimerType { get; set; }

        /// <summary>
        /// Id of the recording.
        /// </summary>
        /// <value>Id of the recording.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The server identifier.
        /// </summary>
        /// <value>The server identifier.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// ChannelId of the recording.
        /// </summary>
        /// <value>ChannelId of the recording.</value>
        [DataMember(Name="ChannelId", EmitDefaultValue=false)]
        public string ChannelId { get; set; }

        /// <summary>
        /// ChannelName of the recording.
        /// </summary>
        /// <value>ChannelName of the recording.</value>
        [DataMember(Name="ChannelName", EmitDefaultValue=false)]
        public string ChannelName { get; set; }

        /// <summary>
        /// Gets or Sets ChannelNumber
        /// </summary>
        [DataMember(Name="ChannelNumber", EmitDefaultValue=false)]
        public string ChannelNumber { get; set; }

        /// <summary>
        /// Gets or Sets ChannelPrimaryImageTag
        /// </summary>
        [DataMember(Name="ChannelPrimaryImageTag", EmitDefaultValue=false)]
        public string ChannelPrimaryImageTag { get; set; }

        /// <summary>
        /// The program identifier.
        /// </summary>
        /// <value>The program identifier.</value>
        [DataMember(Name="ProgramId", EmitDefaultValue=false)]
        public string ProgramId { get; set; }

        /// <summary>
        /// Name of the recording.
        /// </summary>
        /// <value>Name of the recording.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Description of the recording.
        /// </summary>
        /// <value>Description of the recording.</value>
        [DataMember(Name="Overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

        /// <summary>
        /// Gets or Sets ParentFolderId
        /// </summary>
        [DataMember(Name="ParentFolderId", EmitDefaultValue=false)]
        public string ParentFolderId { get; set; }

        /// <summary>
        /// The start date of the recording, in UTC.
        /// </summary>
        /// <value>The start date of the recording, in UTC.</value>
        [DataMember(Name="StartDate", EmitDefaultValue=false)]
        public DateTimeOffset? StartDate { get; set; }

        /// <summary>
        /// The end date of the recording, in UTC.
        /// </summary>
        /// <value>The end date of the recording, in UTC.</value>
        [DataMember(Name="EndDate", EmitDefaultValue=false)]
        public DateTimeOffset? EndDate { get; set; }

        /// <summary>
        /// The priority.
        /// </summary>
        /// <value>The priority.</value>
        [DataMember(Name="Priority", EmitDefaultValue=false)]
        public int? Priority { get; set; }

        /// <summary>
        /// The pre padding seconds.
        /// </summary>
        /// <value>The pre padding seconds.</value>
        [DataMember(Name="PrePaddingSeconds", EmitDefaultValue=false)]
        public int? PrePaddingSeconds { get; set; }

        /// <summary>
        /// The post padding seconds.
        /// </summary>
        /// <value>The post padding seconds.</value>
        [DataMember(Name="PostPaddingSeconds", EmitDefaultValue=false)]
        public int? PostPaddingSeconds { get; set; }

        /// <summary>
        /// A value indicating whether this instance is pre padding required.
        /// </summary>
        /// <value>A value indicating whether this instance is pre padding required.</value>
        [DataMember(Name="IsPrePaddingRequired", EmitDefaultValue=false)]
        public bool? IsPrePaddingRequired { get; set; }

        /// <summary>
        /// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
        /// </summary>
        /// <value>If the item does not have any backdrops, this will hold the Id of the Parent that has one.</value>
        [DataMember(Name="ParentBackdropItemId", EmitDefaultValue=false)]
        public string ParentBackdropItemId { get; set; }

        /// <summary>
        /// The parent backdrop image tags.
        /// </summary>
        /// <value>The parent backdrop image tags.</value>
        [DataMember(Name="ParentBackdropImageTags", EmitDefaultValue=false)]
        public List<string> ParentBackdropImageTags { get; set; }

        /// <summary>
        /// A value indicating whether this instance is post padding required.
        /// </summary>
        /// <value>A value indicating whether this instance is post padding required.</value>
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
            sb.Append("class LiveTvSeriesTimerInfoDto {\n");
            sb.Append("  RecordAnyTime: ").Append(RecordAnyTime).Append("\n");
            sb.Append("  SkipEpisodesInLibrary: ").Append(SkipEpisodesInLibrary).Append("\n");
            sb.Append("  MatchExistingItemsWithAnyLibrary: ").Append(MatchExistingItemsWithAnyLibrary).Append("\n");
            sb.Append("  RecordAnyChannel: ").Append(RecordAnyChannel).Append("\n");
            sb.Append("  KeepUpTo: ").Append(KeepUpTo).Append("\n");
            sb.Append("  MaxRecordingSeconds: ").Append(MaxRecordingSeconds).Append("\n");
            sb.Append("  RecordNewOnly: ").Append(RecordNewOnly).Append("\n");
            sb.Append("  ChannelIds: ").Append(ChannelIds).Append("\n");
            sb.Append("  Days: ").Append(Days).Append("\n");
            sb.Append("  ImageTags: ").Append(ImageTags).Append("\n");
            sb.Append("  ParentThumbItemId: ").Append(ParentThumbItemId).Append("\n");
            sb.Append("  ParentThumbImageTag: ").Append(ParentThumbImageTag).Append("\n");
            sb.Append("  ParentPrimaryImageItemId: ").Append(ParentPrimaryImageItemId).Append("\n");
            sb.Append("  ParentPrimaryImageTag: ").Append(ParentPrimaryImageTag).Append("\n");
            sb.Append("  SeriesId: ").Append(SeriesId).Append("\n");
            sb.Append("  Keywords: ").Append(Keywords).Append("\n");
            sb.Append("  TimerType: ").Append(TimerType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  ChannelId: ").Append(ChannelId).Append("\n");
            sb.Append("  ChannelName: ").Append(ChannelName).Append("\n");
            sb.Append("  ChannelNumber: ").Append(ChannelNumber).Append("\n");
            sb.Append("  ChannelPrimaryImageTag: ").Append(ChannelPrimaryImageTag).Append("\n");
            sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  ParentFolderId: ").Append(ParentFolderId).Append("\n");
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
            return this.Equals(input as LiveTvSeriesTimerInfoDto);
        }

        /// <summary>
        /// Returns true if LiveTvSeriesTimerInfoDto instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvSeriesTimerInfoDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvSeriesTimerInfoDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RecordAnyTime == input.RecordAnyTime ||
                    (this.RecordAnyTime != null &&
                    this.RecordAnyTime.Equals(input.RecordAnyTime))
                ) && 
                (
                    this.SkipEpisodesInLibrary == input.SkipEpisodesInLibrary ||
                    (this.SkipEpisodesInLibrary != null &&
                    this.SkipEpisodesInLibrary.Equals(input.SkipEpisodesInLibrary))
                ) && 
                (
                    this.MatchExistingItemsWithAnyLibrary == input.MatchExistingItemsWithAnyLibrary ||
                    (this.MatchExistingItemsWithAnyLibrary != null &&
                    this.MatchExistingItemsWithAnyLibrary.Equals(input.MatchExistingItemsWithAnyLibrary))
                ) && 
                (
                    this.RecordAnyChannel == input.RecordAnyChannel ||
                    (this.RecordAnyChannel != null &&
                    this.RecordAnyChannel.Equals(input.RecordAnyChannel))
                ) && 
                (
                    this.KeepUpTo == input.KeepUpTo ||
                    (this.KeepUpTo != null &&
                    this.KeepUpTo.Equals(input.KeepUpTo))
                ) && 
                (
                    this.MaxRecordingSeconds == input.MaxRecordingSeconds ||
                    (this.MaxRecordingSeconds != null &&
                    this.MaxRecordingSeconds.Equals(input.MaxRecordingSeconds))
                ) && 
                (
                    this.RecordNewOnly == input.RecordNewOnly ||
                    (this.RecordNewOnly != null &&
                    this.RecordNewOnly.Equals(input.RecordNewOnly))
                ) && 
                (
                    this.ChannelIds == input.ChannelIds ||
                    this.ChannelIds != null &&
                    input.ChannelIds != null &&
                    this.ChannelIds.SequenceEqual(input.ChannelIds)
                ) && 
                (
                    this.Days == input.Days ||
                    this.Days != null &&
                    input.Days != null &&
                    this.Days.SequenceEqual(input.Days)
                ) && 
                (
                    this.ImageTags == input.ImageTags ||
                    this.ImageTags != null &&
                    input.ImageTags != null &&
                    this.ImageTags.SequenceEqual(input.ImageTags)
                ) && 
                (
                    this.ParentThumbItemId == input.ParentThumbItemId ||
                    (this.ParentThumbItemId != null &&
                    this.ParentThumbItemId.Equals(input.ParentThumbItemId))
                ) && 
                (
                    this.ParentThumbImageTag == input.ParentThumbImageTag ||
                    (this.ParentThumbImageTag != null &&
                    this.ParentThumbImageTag.Equals(input.ParentThumbImageTag))
                ) && 
                (
                    this.ParentPrimaryImageItemId == input.ParentPrimaryImageItemId ||
                    (this.ParentPrimaryImageItemId != null &&
                    this.ParentPrimaryImageItemId.Equals(input.ParentPrimaryImageItemId))
                ) && 
                (
                    this.ParentPrimaryImageTag == input.ParentPrimaryImageTag ||
                    (this.ParentPrimaryImageTag != null &&
                    this.ParentPrimaryImageTag.Equals(input.ParentPrimaryImageTag))
                ) && 
                (
                    this.SeriesId == input.SeriesId ||
                    (this.SeriesId != null &&
                    this.SeriesId.Equals(input.SeriesId))
                ) && 
                (
                    this.Keywords == input.Keywords ||
                    this.Keywords != null &&
                    input.Keywords != null &&
                    this.Keywords.SequenceEqual(input.Keywords)
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
                    this.ChannelNumber == input.ChannelNumber ||
                    (this.ChannelNumber != null &&
                    this.ChannelNumber.Equals(input.ChannelNumber))
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
                    this.ParentFolderId == input.ParentFolderId ||
                    (this.ParentFolderId != null &&
                    this.ParentFolderId.Equals(input.ParentFolderId))
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
                if (this.RecordAnyTime != null)
                    hashCode = hashCode * 59 + this.RecordAnyTime.GetHashCode();
                if (this.SkipEpisodesInLibrary != null)
                    hashCode = hashCode * 59 + this.SkipEpisodesInLibrary.GetHashCode();
                if (this.MatchExistingItemsWithAnyLibrary != null)
                    hashCode = hashCode * 59 + this.MatchExistingItemsWithAnyLibrary.GetHashCode();
                if (this.RecordAnyChannel != null)
                    hashCode = hashCode * 59 + this.RecordAnyChannel.GetHashCode();
                if (this.KeepUpTo != null)
                    hashCode = hashCode * 59 + this.KeepUpTo.GetHashCode();
                if (this.MaxRecordingSeconds != null)
                    hashCode = hashCode * 59 + this.MaxRecordingSeconds.GetHashCode();
                if (this.RecordNewOnly != null)
                    hashCode = hashCode * 59 + this.RecordNewOnly.GetHashCode();
                if (this.ChannelIds != null)
                    hashCode = hashCode * 59 + this.ChannelIds.GetHashCode();
                if (this.Days != null)
                    hashCode = hashCode * 59 + this.Days.GetHashCode();
                if (this.ImageTags != null)
                    hashCode = hashCode * 59 + this.ImageTags.GetHashCode();
                if (this.ParentThumbItemId != null)
                    hashCode = hashCode * 59 + this.ParentThumbItemId.GetHashCode();
                if (this.ParentThumbImageTag != null)
                    hashCode = hashCode * 59 + this.ParentThumbImageTag.GetHashCode();
                if (this.ParentPrimaryImageItemId != null)
                    hashCode = hashCode * 59 + this.ParentPrimaryImageItemId.GetHashCode();
                if (this.ParentPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.ParentPrimaryImageTag.GetHashCode();
                if (this.SeriesId != null)
                    hashCode = hashCode * 59 + this.SeriesId.GetHashCode();
                if (this.Keywords != null)
                    hashCode = hashCode * 59 + this.Keywords.GetHashCode();
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
                if (this.ChannelNumber != null)
                    hashCode = hashCode * 59 + this.ChannelNumber.GetHashCode();
                if (this.ChannelPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.ChannelPrimaryImageTag.GetHashCode();
                if (this.ProgramId != null)
                    hashCode = hashCode * 59 + this.ProgramId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.ParentFolderId != null)
                    hashCode = hashCode * 59 + this.ParentFolderId.GetHashCode();
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
