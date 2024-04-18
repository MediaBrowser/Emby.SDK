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
    /// LiveTvSeriesTimerInfo
    /// </summary>
    [DataContract]
        public partial class LiveTvSeriesTimerInfo :  IEquatable<LiveTvSeriesTimerInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvSeriesTimerInfo" /> class.
        /// </summary>
        /// <param name="id">Id of the recording..</param>
        /// <param name="channelId">ChannelId of the recording..</param>
        /// <param name="channelIds">channelIds.</param>
        /// <param name="parentFolderId">parentFolderId.</param>
        /// <param name="programId">The program identifier..</param>
        /// <param name="name">Name of the recording..</param>
        /// <param name="serviceName">serviceName.</param>
        /// <param name="overview">Description of the recording..</param>
        /// <param name="startDate">The start date of the recording, in UTC..</param>
        /// <param name="endDate">The end date of the recording, in UTC..</param>
        /// <param name="recordAnyTime">A value indicating whether \\[record any time\\]..</param>
        /// <param name="keepUpTo">keepUpTo.</param>
        /// <param name="keepUntil">keepUntil.</param>
        /// <param name="skipEpisodesInLibrary">skipEpisodesInLibrary.</param>
        /// <param name="matchExistingItemsWithAnyLibrary">matchExistingItemsWithAnyLibrary.</param>
        /// <param name="recordNewOnly">A value indicating whether \\[record new only\\]..</param>
        /// <param name="days">The days..</param>
        /// <param name="priority">The priority..</param>
        /// <param name="prePaddingSeconds">The pre padding seconds..</param>
        /// <param name="postPaddingSeconds">The post padding seconds..</param>
        /// <param name="isPrePaddingRequired">A value indicating whether this instance is pre padding required..</param>
        /// <param name="isPostPaddingRequired">A value indicating whether this instance is post padding required..</param>
        /// <param name="seriesId">The series identifier..</param>
        /// <param name="providerIds">providerIds.</param>
        /// <param name="maxRecordingSeconds">maxRecordingSeconds.</param>
        /// <param name="keywords">keywords.</param>
        /// <param name="timerType">timerType.</param>
        public LiveTvSeriesTimerInfo(string id = default(string), string channelId = default(string), List<string> channelIds = default(List<string>), long? parentFolderId = default(long?), string programId = default(string), string name = default(string), string serviceName = default(string), string overview = default(string), DateTimeOffset? startDate = default(DateTimeOffset?), DateTimeOffset? endDate = default(DateTimeOffset?), bool? recordAnyTime = default(bool?), int? keepUpTo = default(int?), LiveTvKeepUntil keepUntil = default(LiveTvKeepUntil), bool? skipEpisodesInLibrary = default(bool?), bool? matchExistingItemsWithAnyLibrary = default(bool?), bool? recordNewOnly = default(bool?), List<DayOfWeek> days = default(List<DayOfWeek>), int? priority = default(int?), int? prePaddingSeconds = default(int?), int? postPaddingSeconds = default(int?), bool? isPrePaddingRequired = default(bool?), bool? isPostPaddingRequired = default(bool?), string seriesId = default(string), ProviderIdDictionary providerIds = default(ProviderIdDictionary), int? maxRecordingSeconds = default(int?), List<LiveTvKeywordInfo> keywords = default(List<LiveTvKeywordInfo>), LiveTvTimerType timerType = default(LiveTvTimerType))
        {
            this.Id = id;
            this.ChannelId = channelId;
            this.ChannelIds = channelIds;
            this.ParentFolderId = parentFolderId;
            this.ProgramId = programId;
            this.Name = name;
            this.ServiceName = serviceName;
            this.Overview = overview;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.RecordAnyTime = recordAnyTime;
            this.KeepUpTo = keepUpTo;
            this.KeepUntil = keepUntil;
            this.SkipEpisodesInLibrary = skipEpisodesInLibrary;
            this.MatchExistingItemsWithAnyLibrary = matchExistingItemsWithAnyLibrary;
            this.RecordNewOnly = recordNewOnly;
            this.Days = days;
            this.Priority = priority;
            this.PrePaddingSeconds = prePaddingSeconds;
            this.PostPaddingSeconds = postPaddingSeconds;
            this.IsPrePaddingRequired = isPrePaddingRequired;
            this.IsPostPaddingRequired = isPostPaddingRequired;
            this.SeriesId = seriesId;
            this.ProviderIds = providerIds;
            this.MaxRecordingSeconds = maxRecordingSeconds;
            this.Keywords = keywords;
            this.TimerType = timerType;
        }
        
        /// <summary>
        /// Id of the recording.
        /// </summary>
        /// <value>Id of the recording.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// ChannelId of the recording.
        /// </summary>
        /// <value>ChannelId of the recording.</value>
        [DataMember(Name="ChannelId", EmitDefaultValue=false)]
        public string ChannelId { get; set; }

        /// <summary>
        /// Gets or Sets ChannelIds
        /// </summary>
        [DataMember(Name="ChannelIds", EmitDefaultValue=false)]
        public List<string> ChannelIds { get; set; }

        /// <summary>
        /// Gets or Sets ParentFolderId
        /// </summary>
        [DataMember(Name="ParentFolderId", EmitDefaultValue=false)]
        public long? ParentFolderId { get; set; }

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
        /// Gets or Sets ServiceName
        /// </summary>
        [DataMember(Name="ServiceName", EmitDefaultValue=false)]
        public string ServiceName { get; set; }

        /// <summary>
        /// Description of the recording.
        /// </summary>
        /// <value>Description of the recording.</value>
        [DataMember(Name="Overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

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
        /// A value indicating whether \\[record any time\\].
        /// </summary>
        /// <value>A value indicating whether \\[record any time\\].</value>
        [DataMember(Name="RecordAnyTime", EmitDefaultValue=false)]
        public bool? RecordAnyTime { get; set; }

        /// <summary>
        /// Gets or Sets KeepUpTo
        /// </summary>
        [DataMember(Name="KeepUpTo", EmitDefaultValue=false)]
        public int? KeepUpTo { get; set; }

        /// <summary>
        /// Gets or Sets KeepUntil
        /// </summary>
        [DataMember(Name="KeepUntil", EmitDefaultValue=false)]
        public LiveTvKeepUntil KeepUntil { get; set; }

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
        /// A value indicating whether \\[record new only\\].
        /// </summary>
        /// <value>A value indicating whether \\[record new only\\].</value>
        [DataMember(Name="RecordNewOnly", EmitDefaultValue=false)]
        public bool? RecordNewOnly { get; set; }

        /// <summary>
        /// The days.
        /// </summary>
        /// <value>The days.</value>
        [DataMember(Name="Days", EmitDefaultValue=false)]
        public List<DayOfWeek> Days { get; set; }

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
        /// A value indicating whether this instance is post padding required.
        /// </summary>
        /// <value>A value indicating whether this instance is post padding required.</value>
        [DataMember(Name="IsPostPaddingRequired", EmitDefaultValue=false)]
        public bool? IsPostPaddingRequired { get; set; }

        /// <summary>
        /// The series identifier.
        /// </summary>
        /// <value>The series identifier.</value>
        [DataMember(Name="SeriesId", EmitDefaultValue=false)]
        public string SeriesId { get; set; }

        /// <summary>
        /// Gets or Sets ProviderIds
        /// </summary>
        [DataMember(Name="ProviderIds", EmitDefaultValue=false)]
        public ProviderIdDictionary ProviderIds { get; set; }

        /// <summary>
        /// Gets or Sets MaxRecordingSeconds
        /// </summary>
        [DataMember(Name="MaxRecordingSeconds", EmitDefaultValue=false)]
        public int? MaxRecordingSeconds { get; set; }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvSeriesTimerInfo {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ChannelId: ").Append(ChannelId).Append("\n");
            sb.Append("  ChannelIds: ").Append(ChannelIds).Append("\n");
            sb.Append("  ParentFolderId: ").Append(ParentFolderId).Append("\n");
            sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  RecordAnyTime: ").Append(RecordAnyTime).Append("\n");
            sb.Append("  KeepUpTo: ").Append(KeepUpTo).Append("\n");
            sb.Append("  KeepUntil: ").Append(KeepUntil).Append("\n");
            sb.Append("  SkipEpisodesInLibrary: ").Append(SkipEpisodesInLibrary).Append("\n");
            sb.Append("  MatchExistingItemsWithAnyLibrary: ").Append(MatchExistingItemsWithAnyLibrary).Append("\n");
            sb.Append("  RecordNewOnly: ").Append(RecordNewOnly).Append("\n");
            sb.Append("  Days: ").Append(Days).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("  PrePaddingSeconds: ").Append(PrePaddingSeconds).Append("\n");
            sb.Append("  PostPaddingSeconds: ").Append(PostPaddingSeconds).Append("\n");
            sb.Append("  IsPrePaddingRequired: ").Append(IsPrePaddingRequired).Append("\n");
            sb.Append("  IsPostPaddingRequired: ").Append(IsPostPaddingRequired).Append("\n");
            sb.Append("  SeriesId: ").Append(SeriesId).Append("\n");
            sb.Append("  ProviderIds: ").Append(ProviderIds).Append("\n");
            sb.Append("  MaxRecordingSeconds: ").Append(MaxRecordingSeconds).Append("\n");
            sb.Append("  Keywords: ").Append(Keywords).Append("\n");
            sb.Append("  TimerType: ").Append(TimerType).Append("\n");
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
            return this.Equals(input as LiveTvSeriesTimerInfo);
        }

        /// <summary>
        /// Returns true if LiveTvSeriesTimerInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvSeriesTimerInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvSeriesTimerInfo input)
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
                    this.ChannelId == input.ChannelId ||
                    (this.ChannelId != null &&
                    this.ChannelId.Equals(input.ChannelId))
                ) && 
                (
                    this.ChannelIds == input.ChannelIds ||
                    this.ChannelIds != null &&
                    input.ChannelIds != null &&
                    this.ChannelIds.SequenceEqual(input.ChannelIds)
                ) && 
                (
                    this.ParentFolderId == input.ParentFolderId ||
                    (this.ParentFolderId != null &&
                    this.ParentFolderId.Equals(input.ParentFolderId))
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
                    this.ServiceName == input.ServiceName ||
                    (this.ServiceName != null &&
                    this.ServiceName.Equals(input.ServiceName))
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
                    this.RecordAnyTime == input.RecordAnyTime ||
                    (this.RecordAnyTime != null &&
                    this.RecordAnyTime.Equals(input.RecordAnyTime))
                ) && 
                (
                    this.KeepUpTo == input.KeepUpTo ||
                    (this.KeepUpTo != null &&
                    this.KeepUpTo.Equals(input.KeepUpTo))
                ) && 
                (
                    this.KeepUntil == input.KeepUntil ||
                    (this.KeepUntil != null &&
                    this.KeepUntil.Equals(input.KeepUntil))
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
                    this.RecordNewOnly == input.RecordNewOnly ||
                    (this.RecordNewOnly != null &&
                    this.RecordNewOnly.Equals(input.RecordNewOnly))
                ) && 
                (
                    this.Days == input.Days ||
                    this.Days != null &&
                    input.Days != null &&
                    this.Days.SequenceEqual(input.Days)
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
                    this.IsPostPaddingRequired == input.IsPostPaddingRequired ||
                    (this.IsPostPaddingRequired != null &&
                    this.IsPostPaddingRequired.Equals(input.IsPostPaddingRequired))
                ) && 
                (
                    this.SeriesId == input.SeriesId ||
                    (this.SeriesId != null &&
                    this.SeriesId.Equals(input.SeriesId))
                ) && 
                (
                    this.ProviderIds == input.ProviderIds ||
                    (this.ProviderIds != null &&
                    this.ProviderIds.Equals(input.ProviderIds))
                ) && 
                (
                    this.MaxRecordingSeconds == input.MaxRecordingSeconds ||
                    (this.MaxRecordingSeconds != null &&
                    this.MaxRecordingSeconds.Equals(input.MaxRecordingSeconds))
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
                if (this.ChannelId != null)
                    hashCode = hashCode * 59 + this.ChannelId.GetHashCode();
                if (this.ChannelIds != null)
                    hashCode = hashCode * 59 + this.ChannelIds.GetHashCode();
                if (this.ParentFolderId != null)
                    hashCode = hashCode * 59 + this.ParentFolderId.GetHashCode();
                if (this.ProgramId != null)
                    hashCode = hashCode * 59 + this.ProgramId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ServiceName != null)
                    hashCode = hashCode * 59 + this.ServiceName.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.RecordAnyTime != null)
                    hashCode = hashCode * 59 + this.RecordAnyTime.GetHashCode();
                if (this.KeepUpTo != null)
                    hashCode = hashCode * 59 + this.KeepUpTo.GetHashCode();
                if (this.KeepUntil != null)
                    hashCode = hashCode * 59 + this.KeepUntil.GetHashCode();
                if (this.SkipEpisodesInLibrary != null)
                    hashCode = hashCode * 59 + this.SkipEpisodesInLibrary.GetHashCode();
                if (this.MatchExistingItemsWithAnyLibrary != null)
                    hashCode = hashCode * 59 + this.MatchExistingItemsWithAnyLibrary.GetHashCode();
                if (this.RecordNewOnly != null)
                    hashCode = hashCode * 59 + this.RecordNewOnly.GetHashCode();
                if (this.Days != null)
                    hashCode = hashCode * 59 + this.Days.GetHashCode();
                if (this.Priority != null)
                    hashCode = hashCode * 59 + this.Priority.GetHashCode();
                if (this.PrePaddingSeconds != null)
                    hashCode = hashCode * 59 + this.PrePaddingSeconds.GetHashCode();
                if (this.PostPaddingSeconds != null)
                    hashCode = hashCode * 59 + this.PostPaddingSeconds.GetHashCode();
                if (this.IsPrePaddingRequired != null)
                    hashCode = hashCode * 59 + this.IsPrePaddingRequired.GetHashCode();
                if (this.IsPostPaddingRequired != null)
                    hashCode = hashCode * 59 + this.IsPostPaddingRequired.GetHashCode();
                if (this.SeriesId != null)
                    hashCode = hashCode * 59 + this.SeriesId.GetHashCode();
                if (this.ProviderIds != null)
                    hashCode = hashCode * 59 + this.ProviderIds.GetHashCode();
                if (this.MaxRecordingSeconds != null)
                    hashCode = hashCode * 59 + this.MaxRecordingSeconds.GetHashCode();
                if (this.Keywords != null)
                    hashCode = hashCode * 59 + this.Keywords.GetHashCode();
                if (this.TimerType != null)
                    hashCode = hashCode * 59 + this.TimerType.GetHashCode();
                return hashCode;
            }
        }

    }
}
