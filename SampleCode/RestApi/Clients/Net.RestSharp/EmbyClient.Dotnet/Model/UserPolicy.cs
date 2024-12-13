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
    /// UserPolicy
    /// </summary>
    [DataContract]
        public partial class UserPolicy :  IEquatable<UserPolicy>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserPolicy" /> class.
        /// </summary>
        /// <param name="isAdministrator">A value indicating whether this instance is administrator..</param>
        /// <param name="isHidden">A value indicating whether this instance is hidden..</param>
        /// <param name="isHiddenRemotely">isHiddenRemotely.</param>
        /// <param name="isHiddenFromUnusedDevices">isHiddenFromUnusedDevices.</param>
        /// <param name="isDisabled">A value indicating whether this instance is disabled..</param>
        /// <param name="lockedOutDate">lockedOutDate.</param>
        /// <param name="maxParentalRating">The max parental rating..</param>
        /// <param name="allowTagOrRating">allowTagOrRating.</param>
        /// <param name="blockedTags">blockedTags.</param>
        /// <param name="isTagBlockingModeInclusive">isTagBlockingModeInclusive.</param>
        /// <param name="includeTags">includeTags.</param>
        /// <param name="enableUserPreferenceAccess">enableUserPreferenceAccess.</param>
        /// <param name="accessSchedules">accessSchedules.</param>
        /// <param name="blockUnratedItems">blockUnratedItems.</param>
        /// <param name="enableRemoteControlOfOtherUsers">enableRemoteControlOfOtherUsers.</param>
        /// <param name="enableSharedDeviceControl">enableSharedDeviceControl.</param>
        /// <param name="enableRemoteAccess">enableRemoteAccess.</param>
        /// <param name="enableLiveTvManagement">enableLiveTvManagement.</param>
        /// <param name="enableLiveTvAccess">enableLiveTvAccess.</param>
        /// <param name="enableMediaPlayback">enableMediaPlayback.</param>
        /// <param name="enableAudioPlaybackTranscoding">enableAudioPlaybackTranscoding.</param>
        /// <param name="enableVideoPlaybackTranscoding">enableVideoPlaybackTranscoding.</param>
        /// <param name="enablePlaybackRemuxing">enablePlaybackRemuxing.</param>
        /// <param name="enableContentDeletion">enableContentDeletion.</param>
        /// <param name="restrictedFeatures">restrictedFeatures.</param>
        /// <param name="enableContentDeletionFromFolders">enableContentDeletionFromFolders.</param>
        /// <param name="enableContentDownloading">enableContentDownloading.</param>
        /// <param name="enableSubtitleDownloading">enableSubtitleDownloading.</param>
        /// <param name="enableSubtitleManagement">enableSubtitleManagement.</param>
        /// <param name="enableSyncTranscoding">A value indicating whether \\[enable synchronize\\]..</param>
        /// <param name="enableMediaConversion">enableMediaConversion.</param>
        /// <param name="enabledChannels">enabledChannels.</param>
        /// <param name="enableAllChannels">enableAllChannels.</param>
        /// <param name="enabledFolders">enabledFolders.</param>
        /// <param name="enableAllFolders">enableAllFolders.</param>
        /// <param name="invalidLoginAttemptCount">invalidLoginAttemptCount.</param>
        /// <param name="enablePublicSharing">enablePublicSharing.</param>
        /// <param name="remoteClientBitrateLimit">remoteClientBitrateLimit.</param>
        /// <param name="authenticationProviderId">authenticationProviderId.</param>
        /// <param name="excludedSubFolders">excludedSubFolders.</param>
        /// <param name="simultaneousStreamLimit">simultaneousStreamLimit.</param>
        /// <param name="enabledDevices">enabledDevices.</param>
        /// <param name="enableAllDevices">enableAllDevices.</param>
        /// <param name="allowCameraUpload">allowCameraUpload.</param>
        /// <param name="allowSharingPersonalItems">allowSharingPersonalItems.</param>
        public UserPolicy(bool? isAdministrator = default(bool?), bool? isHidden = default(bool?), bool? isHiddenRemotely = default(bool?), bool? isHiddenFromUnusedDevices = default(bool?), bool? isDisabled = default(bool?), long? lockedOutDate = default(long?), int? maxParentalRating = default(int?), bool? allowTagOrRating = default(bool?), List<string> blockedTags = default(List<string>), bool? isTagBlockingModeInclusive = default(bool?), List<string> includeTags = default(List<string>), bool? enableUserPreferenceAccess = default(bool?), List<AccessSchedule> accessSchedules = default(List<AccessSchedule>), List<UnratedItem> blockUnratedItems = default(List<UnratedItem>), bool? enableRemoteControlOfOtherUsers = default(bool?), bool? enableSharedDeviceControl = default(bool?), bool? enableRemoteAccess = default(bool?), bool? enableLiveTvManagement = default(bool?), bool? enableLiveTvAccess = default(bool?), bool? enableMediaPlayback = default(bool?), bool? enableAudioPlaybackTranscoding = default(bool?), bool? enableVideoPlaybackTranscoding = default(bool?), bool? enablePlaybackRemuxing = default(bool?), bool? enableContentDeletion = default(bool?), List<string> restrictedFeatures = default(List<string>), List<string> enableContentDeletionFromFolders = default(List<string>), bool? enableContentDownloading = default(bool?), bool? enableSubtitleDownloading = default(bool?), bool? enableSubtitleManagement = default(bool?), bool? enableSyncTranscoding = default(bool?), bool? enableMediaConversion = default(bool?), List<string> enabledChannels = default(List<string>), bool? enableAllChannels = default(bool?), List<string> enabledFolders = default(List<string>), bool? enableAllFolders = default(bool?), int? invalidLoginAttemptCount = default(int?), bool? enablePublicSharing = default(bool?), int? remoteClientBitrateLimit = default(int?), string authenticationProviderId = default(string), List<string> excludedSubFolders = default(List<string>), int? simultaneousStreamLimit = default(int?), List<string> enabledDevices = default(List<string>), bool? enableAllDevices = default(bool?), bool? allowCameraUpload = default(bool?), bool? allowSharingPersonalItems = default(bool?))
        {
            this.IsAdministrator = isAdministrator;
            this.IsHidden = isHidden;
            this.IsHiddenRemotely = isHiddenRemotely;
            this.IsHiddenFromUnusedDevices = isHiddenFromUnusedDevices;
            this.IsDisabled = isDisabled;
            this.LockedOutDate = lockedOutDate;
            this.MaxParentalRating = maxParentalRating;
            this.AllowTagOrRating = allowTagOrRating;
            this.BlockedTags = blockedTags;
            this.IsTagBlockingModeInclusive = isTagBlockingModeInclusive;
            this.IncludeTags = includeTags;
            this.EnableUserPreferenceAccess = enableUserPreferenceAccess;
            this.AccessSchedules = accessSchedules;
            this.BlockUnratedItems = blockUnratedItems;
            this.EnableRemoteControlOfOtherUsers = enableRemoteControlOfOtherUsers;
            this.EnableSharedDeviceControl = enableSharedDeviceControl;
            this.EnableRemoteAccess = enableRemoteAccess;
            this.EnableLiveTvManagement = enableLiveTvManagement;
            this.EnableLiveTvAccess = enableLiveTvAccess;
            this.EnableMediaPlayback = enableMediaPlayback;
            this.EnableAudioPlaybackTranscoding = enableAudioPlaybackTranscoding;
            this.EnableVideoPlaybackTranscoding = enableVideoPlaybackTranscoding;
            this.EnablePlaybackRemuxing = enablePlaybackRemuxing;
            this.EnableContentDeletion = enableContentDeletion;
            this.RestrictedFeatures = restrictedFeatures;
            this.EnableContentDeletionFromFolders = enableContentDeletionFromFolders;
            this.EnableContentDownloading = enableContentDownloading;
            this.EnableSubtitleDownloading = enableSubtitleDownloading;
            this.EnableSubtitleManagement = enableSubtitleManagement;
            this.EnableSyncTranscoding = enableSyncTranscoding;
            this.EnableMediaConversion = enableMediaConversion;
            this.EnabledChannels = enabledChannels;
            this.EnableAllChannels = enableAllChannels;
            this.EnabledFolders = enabledFolders;
            this.EnableAllFolders = enableAllFolders;
            this.InvalidLoginAttemptCount = invalidLoginAttemptCount;
            this.EnablePublicSharing = enablePublicSharing;
            this.RemoteClientBitrateLimit = remoteClientBitrateLimit;
            this.AuthenticationProviderId = authenticationProviderId;
            this.ExcludedSubFolders = excludedSubFolders;
            this.SimultaneousStreamLimit = simultaneousStreamLimit;
            this.EnabledDevices = enabledDevices;
            this.EnableAllDevices = enableAllDevices;
            this.AllowCameraUpload = allowCameraUpload;
            this.AllowSharingPersonalItems = allowSharingPersonalItems;
        }
        
        /// <summary>
        /// A value indicating whether this instance is administrator.
        /// </summary>
        /// <value>A value indicating whether this instance is administrator.</value>
        [DataMember(Name="IsAdministrator", EmitDefaultValue=false)]
        public bool? IsAdministrator { get; set; }

        /// <summary>
        /// A value indicating whether this instance is hidden.
        /// </summary>
        /// <value>A value indicating whether this instance is hidden.</value>
        [DataMember(Name="IsHidden", EmitDefaultValue=false)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets IsHiddenRemotely
        /// </summary>
        [DataMember(Name="IsHiddenRemotely", EmitDefaultValue=false)]
        public bool? IsHiddenRemotely { get; set; }

        /// <summary>
        /// Gets or Sets IsHiddenFromUnusedDevices
        /// </summary>
        [DataMember(Name="IsHiddenFromUnusedDevices", EmitDefaultValue=false)]
        public bool? IsHiddenFromUnusedDevices { get; set; }

        /// <summary>
        /// A value indicating whether this instance is disabled.
        /// </summary>
        /// <value>A value indicating whether this instance is disabled.</value>
        [DataMember(Name="IsDisabled", EmitDefaultValue=false)]
        public bool? IsDisabled { get; set; }

        /// <summary>
        /// Gets or Sets LockedOutDate
        /// </summary>
        [DataMember(Name="LockedOutDate", EmitDefaultValue=false)]
        public long? LockedOutDate { get; set; }

        /// <summary>
        /// The max parental rating.
        /// </summary>
        /// <value>The max parental rating.</value>
        [DataMember(Name="MaxParentalRating", EmitDefaultValue=false)]
        public int? MaxParentalRating { get; set; }

        /// <summary>
        /// Gets or Sets AllowTagOrRating
        /// </summary>
        [DataMember(Name="AllowTagOrRating", EmitDefaultValue=false)]
        public bool? AllowTagOrRating { get; set; }

        /// <summary>
        /// Gets or Sets BlockedTags
        /// </summary>
        [DataMember(Name="BlockedTags", EmitDefaultValue=false)]
        public List<string> BlockedTags { get; set; }

        /// <summary>
        /// Gets or Sets IsTagBlockingModeInclusive
        /// </summary>
        [DataMember(Name="IsTagBlockingModeInclusive", EmitDefaultValue=false)]
        public bool? IsTagBlockingModeInclusive { get; set; }

        /// <summary>
        /// Gets or Sets IncludeTags
        /// </summary>
        [DataMember(Name="IncludeTags", EmitDefaultValue=false)]
        public List<string> IncludeTags { get; set; }

        /// <summary>
        /// Gets or Sets EnableUserPreferenceAccess
        /// </summary>
        [DataMember(Name="EnableUserPreferenceAccess", EmitDefaultValue=false)]
        public bool? EnableUserPreferenceAccess { get; set; }

        /// <summary>
        /// Gets or Sets AccessSchedules
        /// </summary>
        [DataMember(Name="AccessSchedules", EmitDefaultValue=false)]
        public List<AccessSchedule> AccessSchedules { get; set; }

        /// <summary>
        /// Gets or Sets BlockUnratedItems
        /// </summary>
        [DataMember(Name="BlockUnratedItems", EmitDefaultValue=false)]
        public List<UnratedItem> BlockUnratedItems { get; set; }

        /// <summary>
        /// Gets or Sets EnableRemoteControlOfOtherUsers
        /// </summary>
        [DataMember(Name="EnableRemoteControlOfOtherUsers", EmitDefaultValue=false)]
        public bool? EnableRemoteControlOfOtherUsers { get; set; }

        /// <summary>
        /// Gets or Sets EnableSharedDeviceControl
        /// </summary>
        [DataMember(Name="EnableSharedDeviceControl", EmitDefaultValue=false)]
        public bool? EnableSharedDeviceControl { get; set; }

        /// <summary>
        /// Gets or Sets EnableRemoteAccess
        /// </summary>
        [DataMember(Name="EnableRemoteAccess", EmitDefaultValue=false)]
        public bool? EnableRemoteAccess { get; set; }

        /// <summary>
        /// Gets or Sets EnableLiveTvManagement
        /// </summary>
        [DataMember(Name="EnableLiveTvManagement", EmitDefaultValue=false)]
        public bool? EnableLiveTvManagement { get; set; }

        /// <summary>
        /// Gets or Sets EnableLiveTvAccess
        /// </summary>
        [DataMember(Name="EnableLiveTvAccess", EmitDefaultValue=false)]
        public bool? EnableLiveTvAccess { get; set; }

        /// <summary>
        /// Gets or Sets EnableMediaPlayback
        /// </summary>
        [DataMember(Name="EnableMediaPlayback", EmitDefaultValue=false)]
        public bool? EnableMediaPlayback { get; set; }

        /// <summary>
        /// Gets or Sets EnableAudioPlaybackTranscoding
        /// </summary>
        [DataMember(Name="EnableAudioPlaybackTranscoding", EmitDefaultValue=false)]
        public bool? EnableAudioPlaybackTranscoding { get; set; }

        /// <summary>
        /// Gets or Sets EnableVideoPlaybackTranscoding
        /// </summary>
        [DataMember(Name="EnableVideoPlaybackTranscoding", EmitDefaultValue=false)]
        public bool? EnableVideoPlaybackTranscoding { get; set; }

        /// <summary>
        /// Gets or Sets EnablePlaybackRemuxing
        /// </summary>
        [DataMember(Name="EnablePlaybackRemuxing", EmitDefaultValue=false)]
        public bool? EnablePlaybackRemuxing { get; set; }

        /// <summary>
        /// Gets or Sets EnableContentDeletion
        /// </summary>
        [DataMember(Name="EnableContentDeletion", EmitDefaultValue=false)]
        public bool? EnableContentDeletion { get; set; }

        /// <summary>
        /// Gets or Sets RestrictedFeatures
        /// </summary>
        [DataMember(Name="RestrictedFeatures", EmitDefaultValue=false)]
        public List<string> RestrictedFeatures { get; set; }

        /// <summary>
        /// Gets or Sets EnableContentDeletionFromFolders
        /// </summary>
        [DataMember(Name="EnableContentDeletionFromFolders", EmitDefaultValue=false)]
        public List<string> EnableContentDeletionFromFolders { get; set; }

        /// <summary>
        /// Gets or Sets EnableContentDownloading
        /// </summary>
        [DataMember(Name="EnableContentDownloading", EmitDefaultValue=false)]
        public bool? EnableContentDownloading { get; set; }

        /// <summary>
        /// Gets or Sets EnableSubtitleDownloading
        /// </summary>
        [DataMember(Name="EnableSubtitleDownloading", EmitDefaultValue=false)]
        public bool? EnableSubtitleDownloading { get; set; }

        /// <summary>
        /// Gets or Sets EnableSubtitleManagement
        /// </summary>
        [DataMember(Name="EnableSubtitleManagement", EmitDefaultValue=false)]
        public bool? EnableSubtitleManagement { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable synchronize\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable synchronize\\].</value>
        [DataMember(Name="EnableSyncTranscoding", EmitDefaultValue=false)]
        public bool? EnableSyncTranscoding { get; set; }

        /// <summary>
        /// Gets or Sets EnableMediaConversion
        /// </summary>
        [DataMember(Name="EnableMediaConversion", EmitDefaultValue=false)]
        public bool? EnableMediaConversion { get; set; }

        /// <summary>
        /// Gets or Sets EnabledChannels
        /// </summary>
        [DataMember(Name="EnabledChannels", EmitDefaultValue=false)]
        public List<string> EnabledChannels { get; set; }

        /// <summary>
        /// Gets or Sets EnableAllChannels
        /// </summary>
        [DataMember(Name="EnableAllChannels", EmitDefaultValue=false)]
        public bool? EnableAllChannels { get; set; }

        /// <summary>
        /// Gets or Sets EnabledFolders
        /// </summary>
        [DataMember(Name="EnabledFolders", EmitDefaultValue=false)]
        public List<string> EnabledFolders { get; set; }

        /// <summary>
        /// Gets or Sets EnableAllFolders
        /// </summary>
        [DataMember(Name="EnableAllFolders", EmitDefaultValue=false)]
        public bool? EnableAllFolders { get; set; }

        /// <summary>
        /// Gets or Sets InvalidLoginAttemptCount
        /// </summary>
        [DataMember(Name="InvalidLoginAttemptCount", EmitDefaultValue=false)]
        public int? InvalidLoginAttemptCount { get; set; }

        /// <summary>
        /// Gets or Sets EnablePublicSharing
        /// </summary>
        [DataMember(Name="EnablePublicSharing", EmitDefaultValue=false)]
        public bool? EnablePublicSharing { get; set; }

        /// <summary>
        /// Gets or Sets RemoteClientBitrateLimit
        /// </summary>
        [DataMember(Name="RemoteClientBitrateLimit", EmitDefaultValue=false)]
        public int? RemoteClientBitrateLimit { get; set; }

        /// <summary>
        /// Gets or Sets AuthenticationProviderId
        /// </summary>
        [DataMember(Name="AuthenticationProviderId", EmitDefaultValue=false)]
        public string AuthenticationProviderId { get; set; }

        /// <summary>
        /// Gets or Sets ExcludedSubFolders
        /// </summary>
        [DataMember(Name="ExcludedSubFolders", EmitDefaultValue=false)]
        public List<string> ExcludedSubFolders { get; set; }

        /// <summary>
        /// Gets or Sets SimultaneousStreamLimit
        /// </summary>
        [DataMember(Name="SimultaneousStreamLimit", EmitDefaultValue=false)]
        public int? SimultaneousStreamLimit { get; set; }

        /// <summary>
        /// Gets or Sets EnabledDevices
        /// </summary>
        [DataMember(Name="EnabledDevices", EmitDefaultValue=false)]
        public List<string> EnabledDevices { get; set; }

        /// <summary>
        /// Gets or Sets EnableAllDevices
        /// </summary>
        [DataMember(Name="EnableAllDevices", EmitDefaultValue=false)]
        public bool? EnableAllDevices { get; set; }

        /// <summary>
        /// Gets or Sets AllowCameraUpload
        /// </summary>
        [DataMember(Name="AllowCameraUpload", EmitDefaultValue=false)]
        public bool? AllowCameraUpload { get; set; }

        /// <summary>
        /// Gets or Sets AllowSharingPersonalItems
        /// </summary>
        [DataMember(Name="AllowSharingPersonalItems", EmitDefaultValue=false)]
        public bool? AllowSharingPersonalItems { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserPolicy {\n");
            sb.Append("  IsAdministrator: ").Append(IsAdministrator).Append("\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  IsHiddenRemotely: ").Append(IsHiddenRemotely).Append("\n");
            sb.Append("  IsHiddenFromUnusedDevices: ").Append(IsHiddenFromUnusedDevices).Append("\n");
            sb.Append("  IsDisabled: ").Append(IsDisabled).Append("\n");
            sb.Append("  LockedOutDate: ").Append(LockedOutDate).Append("\n");
            sb.Append("  MaxParentalRating: ").Append(MaxParentalRating).Append("\n");
            sb.Append("  AllowTagOrRating: ").Append(AllowTagOrRating).Append("\n");
            sb.Append("  BlockedTags: ").Append(BlockedTags).Append("\n");
            sb.Append("  IsTagBlockingModeInclusive: ").Append(IsTagBlockingModeInclusive).Append("\n");
            sb.Append("  IncludeTags: ").Append(IncludeTags).Append("\n");
            sb.Append("  EnableUserPreferenceAccess: ").Append(EnableUserPreferenceAccess).Append("\n");
            sb.Append("  AccessSchedules: ").Append(AccessSchedules).Append("\n");
            sb.Append("  BlockUnratedItems: ").Append(BlockUnratedItems).Append("\n");
            sb.Append("  EnableRemoteControlOfOtherUsers: ").Append(EnableRemoteControlOfOtherUsers).Append("\n");
            sb.Append("  EnableSharedDeviceControl: ").Append(EnableSharedDeviceControl).Append("\n");
            sb.Append("  EnableRemoteAccess: ").Append(EnableRemoteAccess).Append("\n");
            sb.Append("  EnableLiveTvManagement: ").Append(EnableLiveTvManagement).Append("\n");
            sb.Append("  EnableLiveTvAccess: ").Append(EnableLiveTvAccess).Append("\n");
            sb.Append("  EnableMediaPlayback: ").Append(EnableMediaPlayback).Append("\n");
            sb.Append("  EnableAudioPlaybackTranscoding: ").Append(EnableAudioPlaybackTranscoding).Append("\n");
            sb.Append("  EnableVideoPlaybackTranscoding: ").Append(EnableVideoPlaybackTranscoding).Append("\n");
            sb.Append("  EnablePlaybackRemuxing: ").Append(EnablePlaybackRemuxing).Append("\n");
            sb.Append("  EnableContentDeletion: ").Append(EnableContentDeletion).Append("\n");
            sb.Append("  RestrictedFeatures: ").Append(RestrictedFeatures).Append("\n");
            sb.Append("  EnableContentDeletionFromFolders: ").Append(EnableContentDeletionFromFolders).Append("\n");
            sb.Append("  EnableContentDownloading: ").Append(EnableContentDownloading).Append("\n");
            sb.Append("  EnableSubtitleDownloading: ").Append(EnableSubtitleDownloading).Append("\n");
            sb.Append("  EnableSubtitleManagement: ").Append(EnableSubtitleManagement).Append("\n");
            sb.Append("  EnableSyncTranscoding: ").Append(EnableSyncTranscoding).Append("\n");
            sb.Append("  EnableMediaConversion: ").Append(EnableMediaConversion).Append("\n");
            sb.Append("  EnabledChannels: ").Append(EnabledChannels).Append("\n");
            sb.Append("  EnableAllChannels: ").Append(EnableAllChannels).Append("\n");
            sb.Append("  EnabledFolders: ").Append(EnabledFolders).Append("\n");
            sb.Append("  EnableAllFolders: ").Append(EnableAllFolders).Append("\n");
            sb.Append("  InvalidLoginAttemptCount: ").Append(InvalidLoginAttemptCount).Append("\n");
            sb.Append("  EnablePublicSharing: ").Append(EnablePublicSharing).Append("\n");
            sb.Append("  RemoteClientBitrateLimit: ").Append(RemoteClientBitrateLimit).Append("\n");
            sb.Append("  AuthenticationProviderId: ").Append(AuthenticationProviderId).Append("\n");
            sb.Append("  ExcludedSubFolders: ").Append(ExcludedSubFolders).Append("\n");
            sb.Append("  SimultaneousStreamLimit: ").Append(SimultaneousStreamLimit).Append("\n");
            sb.Append("  EnabledDevices: ").Append(EnabledDevices).Append("\n");
            sb.Append("  EnableAllDevices: ").Append(EnableAllDevices).Append("\n");
            sb.Append("  AllowCameraUpload: ").Append(AllowCameraUpload).Append("\n");
            sb.Append("  AllowSharingPersonalItems: ").Append(AllowSharingPersonalItems).Append("\n");
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
            return this.Equals(input as UserPolicy);
        }

        /// <summary>
        /// Returns true if UserPolicy instances are equal
        /// </summary>
        /// <param name="input">Instance of UserPolicy to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserPolicy input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsAdministrator == input.IsAdministrator ||
                    (this.IsAdministrator != null &&
                    this.IsAdministrator.Equals(input.IsAdministrator))
                ) && 
                (
                    this.IsHidden == input.IsHidden ||
                    (this.IsHidden != null &&
                    this.IsHidden.Equals(input.IsHidden))
                ) && 
                (
                    this.IsHiddenRemotely == input.IsHiddenRemotely ||
                    (this.IsHiddenRemotely != null &&
                    this.IsHiddenRemotely.Equals(input.IsHiddenRemotely))
                ) && 
                (
                    this.IsHiddenFromUnusedDevices == input.IsHiddenFromUnusedDevices ||
                    (this.IsHiddenFromUnusedDevices != null &&
                    this.IsHiddenFromUnusedDevices.Equals(input.IsHiddenFromUnusedDevices))
                ) && 
                (
                    this.IsDisabled == input.IsDisabled ||
                    (this.IsDisabled != null &&
                    this.IsDisabled.Equals(input.IsDisabled))
                ) && 
                (
                    this.LockedOutDate == input.LockedOutDate ||
                    (this.LockedOutDate != null &&
                    this.LockedOutDate.Equals(input.LockedOutDate))
                ) && 
                (
                    this.MaxParentalRating == input.MaxParentalRating ||
                    (this.MaxParentalRating != null &&
                    this.MaxParentalRating.Equals(input.MaxParentalRating))
                ) && 
                (
                    this.AllowTagOrRating == input.AllowTagOrRating ||
                    (this.AllowTagOrRating != null &&
                    this.AllowTagOrRating.Equals(input.AllowTagOrRating))
                ) && 
                (
                    this.BlockedTags == input.BlockedTags ||
                    this.BlockedTags != null &&
                    input.BlockedTags != null &&
                    this.BlockedTags.SequenceEqual(input.BlockedTags)
                ) && 
                (
                    this.IsTagBlockingModeInclusive == input.IsTagBlockingModeInclusive ||
                    (this.IsTagBlockingModeInclusive != null &&
                    this.IsTagBlockingModeInclusive.Equals(input.IsTagBlockingModeInclusive))
                ) && 
                (
                    this.IncludeTags == input.IncludeTags ||
                    this.IncludeTags != null &&
                    input.IncludeTags != null &&
                    this.IncludeTags.SequenceEqual(input.IncludeTags)
                ) && 
                (
                    this.EnableUserPreferenceAccess == input.EnableUserPreferenceAccess ||
                    (this.EnableUserPreferenceAccess != null &&
                    this.EnableUserPreferenceAccess.Equals(input.EnableUserPreferenceAccess))
                ) && 
                (
                    this.AccessSchedules == input.AccessSchedules ||
                    this.AccessSchedules != null &&
                    input.AccessSchedules != null &&
                    this.AccessSchedules.SequenceEqual(input.AccessSchedules)
                ) && 
                (
                    this.BlockUnratedItems == input.BlockUnratedItems ||
                    this.BlockUnratedItems != null &&
                    input.BlockUnratedItems != null &&
                    this.BlockUnratedItems.SequenceEqual(input.BlockUnratedItems)
                ) && 
                (
                    this.EnableRemoteControlOfOtherUsers == input.EnableRemoteControlOfOtherUsers ||
                    (this.EnableRemoteControlOfOtherUsers != null &&
                    this.EnableRemoteControlOfOtherUsers.Equals(input.EnableRemoteControlOfOtherUsers))
                ) && 
                (
                    this.EnableSharedDeviceControl == input.EnableSharedDeviceControl ||
                    (this.EnableSharedDeviceControl != null &&
                    this.EnableSharedDeviceControl.Equals(input.EnableSharedDeviceControl))
                ) && 
                (
                    this.EnableRemoteAccess == input.EnableRemoteAccess ||
                    (this.EnableRemoteAccess != null &&
                    this.EnableRemoteAccess.Equals(input.EnableRemoteAccess))
                ) && 
                (
                    this.EnableLiveTvManagement == input.EnableLiveTvManagement ||
                    (this.EnableLiveTvManagement != null &&
                    this.EnableLiveTvManagement.Equals(input.EnableLiveTvManagement))
                ) && 
                (
                    this.EnableLiveTvAccess == input.EnableLiveTvAccess ||
                    (this.EnableLiveTvAccess != null &&
                    this.EnableLiveTvAccess.Equals(input.EnableLiveTvAccess))
                ) && 
                (
                    this.EnableMediaPlayback == input.EnableMediaPlayback ||
                    (this.EnableMediaPlayback != null &&
                    this.EnableMediaPlayback.Equals(input.EnableMediaPlayback))
                ) && 
                (
                    this.EnableAudioPlaybackTranscoding == input.EnableAudioPlaybackTranscoding ||
                    (this.EnableAudioPlaybackTranscoding != null &&
                    this.EnableAudioPlaybackTranscoding.Equals(input.EnableAudioPlaybackTranscoding))
                ) && 
                (
                    this.EnableVideoPlaybackTranscoding == input.EnableVideoPlaybackTranscoding ||
                    (this.EnableVideoPlaybackTranscoding != null &&
                    this.EnableVideoPlaybackTranscoding.Equals(input.EnableVideoPlaybackTranscoding))
                ) && 
                (
                    this.EnablePlaybackRemuxing == input.EnablePlaybackRemuxing ||
                    (this.EnablePlaybackRemuxing != null &&
                    this.EnablePlaybackRemuxing.Equals(input.EnablePlaybackRemuxing))
                ) && 
                (
                    this.EnableContentDeletion == input.EnableContentDeletion ||
                    (this.EnableContentDeletion != null &&
                    this.EnableContentDeletion.Equals(input.EnableContentDeletion))
                ) && 
                (
                    this.RestrictedFeatures == input.RestrictedFeatures ||
                    this.RestrictedFeatures != null &&
                    input.RestrictedFeatures != null &&
                    this.RestrictedFeatures.SequenceEqual(input.RestrictedFeatures)
                ) && 
                (
                    this.EnableContentDeletionFromFolders == input.EnableContentDeletionFromFolders ||
                    this.EnableContentDeletionFromFolders != null &&
                    input.EnableContentDeletionFromFolders != null &&
                    this.EnableContentDeletionFromFolders.SequenceEqual(input.EnableContentDeletionFromFolders)
                ) && 
                (
                    this.EnableContentDownloading == input.EnableContentDownloading ||
                    (this.EnableContentDownloading != null &&
                    this.EnableContentDownloading.Equals(input.EnableContentDownloading))
                ) && 
                (
                    this.EnableSubtitleDownloading == input.EnableSubtitleDownloading ||
                    (this.EnableSubtitleDownloading != null &&
                    this.EnableSubtitleDownloading.Equals(input.EnableSubtitleDownloading))
                ) && 
                (
                    this.EnableSubtitleManagement == input.EnableSubtitleManagement ||
                    (this.EnableSubtitleManagement != null &&
                    this.EnableSubtitleManagement.Equals(input.EnableSubtitleManagement))
                ) && 
                (
                    this.EnableSyncTranscoding == input.EnableSyncTranscoding ||
                    (this.EnableSyncTranscoding != null &&
                    this.EnableSyncTranscoding.Equals(input.EnableSyncTranscoding))
                ) && 
                (
                    this.EnableMediaConversion == input.EnableMediaConversion ||
                    (this.EnableMediaConversion != null &&
                    this.EnableMediaConversion.Equals(input.EnableMediaConversion))
                ) && 
                (
                    this.EnabledChannels == input.EnabledChannels ||
                    this.EnabledChannels != null &&
                    input.EnabledChannels != null &&
                    this.EnabledChannels.SequenceEqual(input.EnabledChannels)
                ) && 
                (
                    this.EnableAllChannels == input.EnableAllChannels ||
                    (this.EnableAllChannels != null &&
                    this.EnableAllChannels.Equals(input.EnableAllChannels))
                ) && 
                (
                    this.EnabledFolders == input.EnabledFolders ||
                    this.EnabledFolders != null &&
                    input.EnabledFolders != null &&
                    this.EnabledFolders.SequenceEqual(input.EnabledFolders)
                ) && 
                (
                    this.EnableAllFolders == input.EnableAllFolders ||
                    (this.EnableAllFolders != null &&
                    this.EnableAllFolders.Equals(input.EnableAllFolders))
                ) && 
                (
                    this.InvalidLoginAttemptCount == input.InvalidLoginAttemptCount ||
                    (this.InvalidLoginAttemptCount != null &&
                    this.InvalidLoginAttemptCount.Equals(input.InvalidLoginAttemptCount))
                ) && 
                (
                    this.EnablePublicSharing == input.EnablePublicSharing ||
                    (this.EnablePublicSharing != null &&
                    this.EnablePublicSharing.Equals(input.EnablePublicSharing))
                ) && 
                (
                    this.RemoteClientBitrateLimit == input.RemoteClientBitrateLimit ||
                    (this.RemoteClientBitrateLimit != null &&
                    this.RemoteClientBitrateLimit.Equals(input.RemoteClientBitrateLimit))
                ) && 
                (
                    this.AuthenticationProviderId == input.AuthenticationProviderId ||
                    (this.AuthenticationProviderId != null &&
                    this.AuthenticationProviderId.Equals(input.AuthenticationProviderId))
                ) && 
                (
                    this.ExcludedSubFolders == input.ExcludedSubFolders ||
                    this.ExcludedSubFolders != null &&
                    input.ExcludedSubFolders != null &&
                    this.ExcludedSubFolders.SequenceEqual(input.ExcludedSubFolders)
                ) && 
                (
                    this.SimultaneousStreamLimit == input.SimultaneousStreamLimit ||
                    (this.SimultaneousStreamLimit != null &&
                    this.SimultaneousStreamLimit.Equals(input.SimultaneousStreamLimit))
                ) && 
                (
                    this.EnabledDevices == input.EnabledDevices ||
                    this.EnabledDevices != null &&
                    input.EnabledDevices != null &&
                    this.EnabledDevices.SequenceEqual(input.EnabledDevices)
                ) && 
                (
                    this.EnableAllDevices == input.EnableAllDevices ||
                    (this.EnableAllDevices != null &&
                    this.EnableAllDevices.Equals(input.EnableAllDevices))
                ) && 
                (
                    this.AllowCameraUpload == input.AllowCameraUpload ||
                    (this.AllowCameraUpload != null &&
                    this.AllowCameraUpload.Equals(input.AllowCameraUpload))
                ) && 
                (
                    this.AllowSharingPersonalItems == input.AllowSharingPersonalItems ||
                    (this.AllowSharingPersonalItems != null &&
                    this.AllowSharingPersonalItems.Equals(input.AllowSharingPersonalItems))
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
                if (this.IsAdministrator != null)
                    hashCode = hashCode * 59 + this.IsAdministrator.GetHashCode();
                if (this.IsHidden != null)
                    hashCode = hashCode * 59 + this.IsHidden.GetHashCode();
                if (this.IsHiddenRemotely != null)
                    hashCode = hashCode * 59 + this.IsHiddenRemotely.GetHashCode();
                if (this.IsHiddenFromUnusedDevices != null)
                    hashCode = hashCode * 59 + this.IsHiddenFromUnusedDevices.GetHashCode();
                if (this.IsDisabled != null)
                    hashCode = hashCode * 59 + this.IsDisabled.GetHashCode();
                if (this.LockedOutDate != null)
                    hashCode = hashCode * 59 + this.LockedOutDate.GetHashCode();
                if (this.MaxParentalRating != null)
                    hashCode = hashCode * 59 + this.MaxParentalRating.GetHashCode();
                if (this.AllowTagOrRating != null)
                    hashCode = hashCode * 59 + this.AllowTagOrRating.GetHashCode();
                if (this.BlockedTags != null)
                    hashCode = hashCode * 59 + this.BlockedTags.GetHashCode();
                if (this.IsTagBlockingModeInclusive != null)
                    hashCode = hashCode * 59 + this.IsTagBlockingModeInclusive.GetHashCode();
                if (this.IncludeTags != null)
                    hashCode = hashCode * 59 + this.IncludeTags.GetHashCode();
                if (this.EnableUserPreferenceAccess != null)
                    hashCode = hashCode * 59 + this.EnableUserPreferenceAccess.GetHashCode();
                if (this.AccessSchedules != null)
                    hashCode = hashCode * 59 + this.AccessSchedules.GetHashCode();
                if (this.BlockUnratedItems != null)
                    hashCode = hashCode * 59 + this.BlockUnratedItems.GetHashCode();
                if (this.EnableRemoteControlOfOtherUsers != null)
                    hashCode = hashCode * 59 + this.EnableRemoteControlOfOtherUsers.GetHashCode();
                if (this.EnableSharedDeviceControl != null)
                    hashCode = hashCode * 59 + this.EnableSharedDeviceControl.GetHashCode();
                if (this.EnableRemoteAccess != null)
                    hashCode = hashCode * 59 + this.EnableRemoteAccess.GetHashCode();
                if (this.EnableLiveTvManagement != null)
                    hashCode = hashCode * 59 + this.EnableLiveTvManagement.GetHashCode();
                if (this.EnableLiveTvAccess != null)
                    hashCode = hashCode * 59 + this.EnableLiveTvAccess.GetHashCode();
                if (this.EnableMediaPlayback != null)
                    hashCode = hashCode * 59 + this.EnableMediaPlayback.GetHashCode();
                if (this.EnableAudioPlaybackTranscoding != null)
                    hashCode = hashCode * 59 + this.EnableAudioPlaybackTranscoding.GetHashCode();
                if (this.EnableVideoPlaybackTranscoding != null)
                    hashCode = hashCode * 59 + this.EnableVideoPlaybackTranscoding.GetHashCode();
                if (this.EnablePlaybackRemuxing != null)
                    hashCode = hashCode * 59 + this.EnablePlaybackRemuxing.GetHashCode();
                if (this.EnableContentDeletion != null)
                    hashCode = hashCode * 59 + this.EnableContentDeletion.GetHashCode();
                if (this.RestrictedFeatures != null)
                    hashCode = hashCode * 59 + this.RestrictedFeatures.GetHashCode();
                if (this.EnableContentDeletionFromFolders != null)
                    hashCode = hashCode * 59 + this.EnableContentDeletionFromFolders.GetHashCode();
                if (this.EnableContentDownloading != null)
                    hashCode = hashCode * 59 + this.EnableContentDownloading.GetHashCode();
                if (this.EnableSubtitleDownloading != null)
                    hashCode = hashCode * 59 + this.EnableSubtitleDownloading.GetHashCode();
                if (this.EnableSubtitleManagement != null)
                    hashCode = hashCode * 59 + this.EnableSubtitleManagement.GetHashCode();
                if (this.EnableSyncTranscoding != null)
                    hashCode = hashCode * 59 + this.EnableSyncTranscoding.GetHashCode();
                if (this.EnableMediaConversion != null)
                    hashCode = hashCode * 59 + this.EnableMediaConversion.GetHashCode();
                if (this.EnabledChannels != null)
                    hashCode = hashCode * 59 + this.EnabledChannels.GetHashCode();
                if (this.EnableAllChannels != null)
                    hashCode = hashCode * 59 + this.EnableAllChannels.GetHashCode();
                if (this.EnabledFolders != null)
                    hashCode = hashCode * 59 + this.EnabledFolders.GetHashCode();
                if (this.EnableAllFolders != null)
                    hashCode = hashCode * 59 + this.EnableAllFolders.GetHashCode();
                if (this.InvalidLoginAttemptCount != null)
                    hashCode = hashCode * 59 + this.InvalidLoginAttemptCount.GetHashCode();
                if (this.EnablePublicSharing != null)
                    hashCode = hashCode * 59 + this.EnablePublicSharing.GetHashCode();
                if (this.RemoteClientBitrateLimit != null)
                    hashCode = hashCode * 59 + this.RemoteClientBitrateLimit.GetHashCode();
                if (this.AuthenticationProviderId != null)
                    hashCode = hashCode * 59 + this.AuthenticationProviderId.GetHashCode();
                if (this.ExcludedSubFolders != null)
                    hashCode = hashCode * 59 + this.ExcludedSubFolders.GetHashCode();
                if (this.SimultaneousStreamLimit != null)
                    hashCode = hashCode * 59 + this.SimultaneousStreamLimit.GetHashCode();
                if (this.EnabledDevices != null)
                    hashCode = hashCode * 59 + this.EnabledDevices.GetHashCode();
                if (this.EnableAllDevices != null)
                    hashCode = hashCode * 59 + this.EnableAllDevices.GetHashCode();
                if (this.AllowCameraUpload != null)
                    hashCode = hashCode * 59 + this.AllowCameraUpload.GetHashCode();
                if (this.AllowSharingPersonalItems != null)
                    hashCode = hashCode * 59 + this.AllowSharingPersonalItems.GetHashCode();
                return hashCode;
            }
        }

    }
}
