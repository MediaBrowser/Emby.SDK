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
    /// Class UserConfiguration  
    /// </summary>
    [DataContract]
        public partial class UserConfiguration :  IEquatable<UserConfiguration>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserConfiguration" /> class.
        /// </summary>
        /// <param name="audioLanguagePreference">The audio language preference..</param>
        /// <param name="playDefaultAudioTrack">A value indicating whether \\[play default audio track\\]..</param>
        /// <param name="subtitleLanguagePreference">The subtitle language preference..</param>
        /// <param name="profilePin">profilePin.</param>
        /// <param name="displayMissingEpisodes">displayMissingEpisodes.</param>
        /// <param name="subtitleMode">subtitleMode.</param>
        /// <param name="orderedViews">orderedViews.</param>
        /// <param name="latestItemsExcludes">latestItemsExcludes.</param>
        /// <param name="myMediaExcludes">myMediaExcludes.</param>
        /// <param name="hidePlayedInLatest">hidePlayedInLatest.</param>
        /// <param name="hidePlayedInMoreLikeThis">hidePlayedInMoreLikeThis.</param>
        /// <param name="hidePlayedInSuggestions">hidePlayedInSuggestions.</param>
        /// <param name="rememberAudioSelections">rememberAudioSelections.</param>
        /// <param name="rememberSubtitleSelections">rememberSubtitleSelections.</param>
        /// <param name="enableNextEpisodeAutoPlay">enableNextEpisodeAutoPlay.</param>
        /// <param name="resumeRewindSeconds">resumeRewindSeconds.</param>
        /// <param name="introSkipMode">introSkipMode.</param>
        /// <param name="enableLocalPassword">enableLocalPassword.</param>
        public UserConfiguration(string audioLanguagePreference = default(string), bool? playDefaultAudioTrack = default(bool?), string subtitleLanguagePreference = default(string), string profilePin = default(string), bool? displayMissingEpisodes = default(bool?), SubtitlePlaybackMode subtitleMode = default(SubtitlePlaybackMode), List<string> orderedViews = default(List<string>), List<string> latestItemsExcludes = default(List<string>), List<string> myMediaExcludes = default(List<string>), bool? hidePlayedInLatest = default(bool?), bool? hidePlayedInMoreLikeThis = default(bool?), bool? hidePlayedInSuggestions = default(bool?), bool? rememberAudioSelections = default(bool?), bool? rememberSubtitleSelections = default(bool?), bool? enableNextEpisodeAutoPlay = default(bool?), int? resumeRewindSeconds = default(int?), SegmentSkipMode introSkipMode = default(SegmentSkipMode), bool? enableLocalPassword = default(bool?))
        {
            this.AudioLanguagePreference = audioLanguagePreference;
            this.PlayDefaultAudioTrack = playDefaultAudioTrack;
            this.SubtitleLanguagePreference = subtitleLanguagePreference;
            this.ProfilePin = profilePin;
            this.DisplayMissingEpisodes = displayMissingEpisodes;
            this.SubtitleMode = subtitleMode;
            this.OrderedViews = orderedViews;
            this.LatestItemsExcludes = latestItemsExcludes;
            this.MyMediaExcludes = myMediaExcludes;
            this.HidePlayedInLatest = hidePlayedInLatest;
            this.HidePlayedInMoreLikeThis = hidePlayedInMoreLikeThis;
            this.HidePlayedInSuggestions = hidePlayedInSuggestions;
            this.RememberAudioSelections = rememberAudioSelections;
            this.RememberSubtitleSelections = rememberSubtitleSelections;
            this.EnableNextEpisodeAutoPlay = enableNextEpisodeAutoPlay;
            this.ResumeRewindSeconds = resumeRewindSeconds;
            this.IntroSkipMode = introSkipMode;
            this.EnableLocalPassword = enableLocalPassword;
        }
        
        /// <summary>
        /// The audio language preference.
        /// </summary>
        /// <value>The audio language preference.</value>
        [DataMember(Name="AudioLanguagePreference", EmitDefaultValue=false)]
        public string AudioLanguagePreference { get; set; }

        /// <summary>
        /// A value indicating whether \\[play default audio track\\].
        /// </summary>
        /// <value>A value indicating whether \\[play default audio track\\].</value>
        [DataMember(Name="PlayDefaultAudioTrack", EmitDefaultValue=false)]
        public bool? PlayDefaultAudioTrack { get; set; }

        /// <summary>
        /// The subtitle language preference.
        /// </summary>
        /// <value>The subtitle language preference.</value>
        [DataMember(Name="SubtitleLanguagePreference", EmitDefaultValue=false)]
        public string SubtitleLanguagePreference { get; set; }

        /// <summary>
        /// Gets or Sets ProfilePin
        /// </summary>
        [DataMember(Name="ProfilePin", EmitDefaultValue=false)]
        public string ProfilePin { get; set; }

        /// <summary>
        /// Gets or Sets DisplayMissingEpisodes
        /// </summary>
        [DataMember(Name="DisplayMissingEpisodes", EmitDefaultValue=false)]
        public bool? DisplayMissingEpisodes { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleMode
        /// </summary>
        [DataMember(Name="SubtitleMode", EmitDefaultValue=false)]
        public SubtitlePlaybackMode SubtitleMode { get; set; }

        /// <summary>
        /// Gets or Sets OrderedViews
        /// </summary>
        [DataMember(Name="OrderedViews", EmitDefaultValue=false)]
        public List<string> OrderedViews { get; set; }

        /// <summary>
        /// Gets or Sets LatestItemsExcludes
        /// </summary>
        [DataMember(Name="LatestItemsExcludes", EmitDefaultValue=false)]
        public List<string> LatestItemsExcludes { get; set; }

        /// <summary>
        /// Gets or Sets MyMediaExcludes
        /// </summary>
        [DataMember(Name="MyMediaExcludes", EmitDefaultValue=false)]
        public List<string> MyMediaExcludes { get; set; }

        /// <summary>
        /// Gets or Sets HidePlayedInLatest
        /// </summary>
        [DataMember(Name="HidePlayedInLatest", EmitDefaultValue=false)]
        public bool? HidePlayedInLatest { get; set; }

        /// <summary>
        /// Gets or Sets HidePlayedInMoreLikeThis
        /// </summary>
        [DataMember(Name="HidePlayedInMoreLikeThis", EmitDefaultValue=false)]
        public bool? HidePlayedInMoreLikeThis { get; set; }

        /// <summary>
        /// Gets or Sets HidePlayedInSuggestions
        /// </summary>
        [DataMember(Name="HidePlayedInSuggestions", EmitDefaultValue=false)]
        public bool? HidePlayedInSuggestions { get; set; }

        /// <summary>
        /// Gets or Sets RememberAudioSelections
        /// </summary>
        [DataMember(Name="RememberAudioSelections", EmitDefaultValue=false)]
        public bool? RememberAudioSelections { get; set; }

        /// <summary>
        /// Gets or Sets RememberSubtitleSelections
        /// </summary>
        [DataMember(Name="RememberSubtitleSelections", EmitDefaultValue=false)]
        public bool? RememberSubtitleSelections { get; set; }

        /// <summary>
        /// Gets or Sets EnableNextEpisodeAutoPlay
        /// </summary>
        [DataMember(Name="EnableNextEpisodeAutoPlay", EmitDefaultValue=false)]
        public bool? EnableNextEpisodeAutoPlay { get; set; }

        /// <summary>
        /// Gets or Sets ResumeRewindSeconds
        /// </summary>
        [DataMember(Name="ResumeRewindSeconds", EmitDefaultValue=false)]
        public int? ResumeRewindSeconds { get; set; }

        /// <summary>
        /// Gets or Sets IntroSkipMode
        /// </summary>
        [DataMember(Name="IntroSkipMode", EmitDefaultValue=false)]
        public SegmentSkipMode IntroSkipMode { get; set; }

        /// <summary>
        /// Gets or Sets EnableLocalPassword
        /// </summary>
        [DataMember(Name="EnableLocalPassword", EmitDefaultValue=false)]
        public bool? EnableLocalPassword { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserConfiguration {\n");
            sb.Append("  AudioLanguagePreference: ").Append(AudioLanguagePreference).Append("\n");
            sb.Append("  PlayDefaultAudioTrack: ").Append(PlayDefaultAudioTrack).Append("\n");
            sb.Append("  SubtitleLanguagePreference: ").Append(SubtitleLanguagePreference).Append("\n");
            sb.Append("  ProfilePin: ").Append(ProfilePin).Append("\n");
            sb.Append("  DisplayMissingEpisodes: ").Append(DisplayMissingEpisodes).Append("\n");
            sb.Append("  SubtitleMode: ").Append(SubtitleMode).Append("\n");
            sb.Append("  OrderedViews: ").Append(OrderedViews).Append("\n");
            sb.Append("  LatestItemsExcludes: ").Append(LatestItemsExcludes).Append("\n");
            sb.Append("  MyMediaExcludes: ").Append(MyMediaExcludes).Append("\n");
            sb.Append("  HidePlayedInLatest: ").Append(HidePlayedInLatest).Append("\n");
            sb.Append("  HidePlayedInMoreLikeThis: ").Append(HidePlayedInMoreLikeThis).Append("\n");
            sb.Append("  HidePlayedInSuggestions: ").Append(HidePlayedInSuggestions).Append("\n");
            sb.Append("  RememberAudioSelections: ").Append(RememberAudioSelections).Append("\n");
            sb.Append("  RememberSubtitleSelections: ").Append(RememberSubtitleSelections).Append("\n");
            sb.Append("  EnableNextEpisodeAutoPlay: ").Append(EnableNextEpisodeAutoPlay).Append("\n");
            sb.Append("  ResumeRewindSeconds: ").Append(ResumeRewindSeconds).Append("\n");
            sb.Append("  IntroSkipMode: ").Append(IntroSkipMode).Append("\n");
            sb.Append("  EnableLocalPassword: ").Append(EnableLocalPassword).Append("\n");
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
            return this.Equals(input as UserConfiguration);
        }

        /// <summary>
        /// Returns true if UserConfiguration instances are equal
        /// </summary>
        /// <param name="input">Instance of UserConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserConfiguration input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AudioLanguagePreference == input.AudioLanguagePreference ||
                    (this.AudioLanguagePreference != null &&
                    this.AudioLanguagePreference.Equals(input.AudioLanguagePreference))
                ) && 
                (
                    this.PlayDefaultAudioTrack == input.PlayDefaultAudioTrack ||
                    (this.PlayDefaultAudioTrack != null &&
                    this.PlayDefaultAudioTrack.Equals(input.PlayDefaultAudioTrack))
                ) && 
                (
                    this.SubtitleLanguagePreference == input.SubtitleLanguagePreference ||
                    (this.SubtitleLanguagePreference != null &&
                    this.SubtitleLanguagePreference.Equals(input.SubtitleLanguagePreference))
                ) && 
                (
                    this.ProfilePin == input.ProfilePin ||
                    (this.ProfilePin != null &&
                    this.ProfilePin.Equals(input.ProfilePin))
                ) && 
                (
                    this.DisplayMissingEpisodes == input.DisplayMissingEpisodes ||
                    (this.DisplayMissingEpisodes != null &&
                    this.DisplayMissingEpisodes.Equals(input.DisplayMissingEpisodes))
                ) && 
                (
                    this.SubtitleMode == input.SubtitleMode ||
                    (this.SubtitleMode != null &&
                    this.SubtitleMode.Equals(input.SubtitleMode))
                ) && 
                (
                    this.OrderedViews == input.OrderedViews ||
                    this.OrderedViews != null &&
                    input.OrderedViews != null &&
                    this.OrderedViews.SequenceEqual(input.OrderedViews)
                ) && 
                (
                    this.LatestItemsExcludes == input.LatestItemsExcludes ||
                    this.LatestItemsExcludes != null &&
                    input.LatestItemsExcludes != null &&
                    this.LatestItemsExcludes.SequenceEqual(input.LatestItemsExcludes)
                ) && 
                (
                    this.MyMediaExcludes == input.MyMediaExcludes ||
                    this.MyMediaExcludes != null &&
                    input.MyMediaExcludes != null &&
                    this.MyMediaExcludes.SequenceEqual(input.MyMediaExcludes)
                ) && 
                (
                    this.HidePlayedInLatest == input.HidePlayedInLatest ||
                    (this.HidePlayedInLatest != null &&
                    this.HidePlayedInLatest.Equals(input.HidePlayedInLatest))
                ) && 
                (
                    this.HidePlayedInMoreLikeThis == input.HidePlayedInMoreLikeThis ||
                    (this.HidePlayedInMoreLikeThis != null &&
                    this.HidePlayedInMoreLikeThis.Equals(input.HidePlayedInMoreLikeThis))
                ) && 
                (
                    this.HidePlayedInSuggestions == input.HidePlayedInSuggestions ||
                    (this.HidePlayedInSuggestions != null &&
                    this.HidePlayedInSuggestions.Equals(input.HidePlayedInSuggestions))
                ) && 
                (
                    this.RememberAudioSelections == input.RememberAudioSelections ||
                    (this.RememberAudioSelections != null &&
                    this.RememberAudioSelections.Equals(input.RememberAudioSelections))
                ) && 
                (
                    this.RememberSubtitleSelections == input.RememberSubtitleSelections ||
                    (this.RememberSubtitleSelections != null &&
                    this.RememberSubtitleSelections.Equals(input.RememberSubtitleSelections))
                ) && 
                (
                    this.EnableNextEpisodeAutoPlay == input.EnableNextEpisodeAutoPlay ||
                    (this.EnableNextEpisodeAutoPlay != null &&
                    this.EnableNextEpisodeAutoPlay.Equals(input.EnableNextEpisodeAutoPlay))
                ) && 
                (
                    this.ResumeRewindSeconds == input.ResumeRewindSeconds ||
                    (this.ResumeRewindSeconds != null &&
                    this.ResumeRewindSeconds.Equals(input.ResumeRewindSeconds))
                ) && 
                (
                    this.IntroSkipMode == input.IntroSkipMode ||
                    (this.IntroSkipMode != null &&
                    this.IntroSkipMode.Equals(input.IntroSkipMode))
                ) && 
                (
                    this.EnableLocalPassword == input.EnableLocalPassword ||
                    (this.EnableLocalPassword != null &&
                    this.EnableLocalPassword.Equals(input.EnableLocalPassword))
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
                if (this.AudioLanguagePreference != null)
                    hashCode = hashCode * 59 + this.AudioLanguagePreference.GetHashCode();
                if (this.PlayDefaultAudioTrack != null)
                    hashCode = hashCode * 59 + this.PlayDefaultAudioTrack.GetHashCode();
                if (this.SubtitleLanguagePreference != null)
                    hashCode = hashCode * 59 + this.SubtitleLanguagePreference.GetHashCode();
                if (this.ProfilePin != null)
                    hashCode = hashCode * 59 + this.ProfilePin.GetHashCode();
                if (this.DisplayMissingEpisodes != null)
                    hashCode = hashCode * 59 + this.DisplayMissingEpisodes.GetHashCode();
                if (this.SubtitleMode != null)
                    hashCode = hashCode * 59 + this.SubtitleMode.GetHashCode();
                if (this.OrderedViews != null)
                    hashCode = hashCode * 59 + this.OrderedViews.GetHashCode();
                if (this.LatestItemsExcludes != null)
                    hashCode = hashCode * 59 + this.LatestItemsExcludes.GetHashCode();
                if (this.MyMediaExcludes != null)
                    hashCode = hashCode * 59 + this.MyMediaExcludes.GetHashCode();
                if (this.HidePlayedInLatest != null)
                    hashCode = hashCode * 59 + this.HidePlayedInLatest.GetHashCode();
                if (this.HidePlayedInMoreLikeThis != null)
                    hashCode = hashCode * 59 + this.HidePlayedInMoreLikeThis.GetHashCode();
                if (this.HidePlayedInSuggestions != null)
                    hashCode = hashCode * 59 + this.HidePlayedInSuggestions.GetHashCode();
                if (this.RememberAudioSelections != null)
                    hashCode = hashCode * 59 + this.RememberAudioSelections.GetHashCode();
                if (this.RememberSubtitleSelections != null)
                    hashCode = hashCode * 59 + this.RememberSubtitleSelections.GetHashCode();
                if (this.EnableNextEpisodeAutoPlay != null)
                    hashCode = hashCode * 59 + this.EnableNextEpisodeAutoPlay.GetHashCode();
                if (this.ResumeRewindSeconds != null)
                    hashCode = hashCode * 59 + this.ResumeRewindSeconds.GetHashCode();
                if (this.IntroSkipMode != null)
                    hashCode = hashCode * 59 + this.IntroSkipMode.GetHashCode();
                if (this.EnableLocalPassword != null)
                    hashCode = hashCode * 59 + this.EnableLocalPassword.GetHashCode();
                return hashCode;
            }
        }

    }
}
