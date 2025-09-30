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
    /// Class SessionInfo  
    /// </summary>
    [DataContract]
        public partial class SessionSessionInfo :  IEquatable<SessionSessionInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionSessionInfo" /> class.
        /// </summary>
        /// <param name="playState">playState.</param>
        /// <param name="additionalUsers">additionalUsers.</param>
        /// <param name="remoteEndPoint">The remote end point..</param>
        /// <param name="protocol">protocol.</param>
        /// <param name="playableMediaTypes">The playable media types..</param>
        /// <param name="playlistItemId">playlistItemId.</param>
        /// <param name="playlistIndex">playlistIndex.</param>
        /// <param name="playlistLength">playlistLength.</param>
        /// <param name="id">The id..</param>
        /// <param name="serverId">serverId.</param>
        /// <param name="userId">The user id..</param>
        /// <param name="partyId">partyId.</param>
        /// <param name="userName">The username..</param>
        /// <param name="userPrimaryImageTag">userPrimaryImageTag.</param>
        /// <param name="_client">The type of the client..</param>
        /// <param name="lastActivityDate">The last activity date..</param>
        /// <param name="deviceName">The name of the device..</param>
        /// <param name="deviceType">deviceType.</param>
        /// <param name="nowPlayingItem">nowPlayingItem.</param>
        /// <param name="internalDeviceId">internalDeviceId.</param>
        /// <param name="deviceId">The device id..</param>
        /// <param name="applicationVersion">The application version..</param>
        /// <param name="appIconUrl">The application icon URL..</param>
        /// <param name="supportedCommands">The supported commands..</param>
        /// <param name="transcodingInfo">transcodingInfo.</param>
        /// <param name="supportsRemoteControl">supportsRemoteControl.</param>
        public SessionSessionInfo(PlayerStateInfo playState = default(PlayerStateInfo), List<SessionUserInfo> additionalUsers = default(List<SessionUserInfo>), string remoteEndPoint = default(string), string protocol = default(string), List<string> playableMediaTypes = default(List<string>), string playlistItemId = default(string), int? playlistIndex = default(int?), int? playlistLength = default(int?), string id = default(string), string serverId = default(string), string userId = default(string), string partyId = default(string), string userName = default(string), string userPrimaryImageTag = default(string), string _client = default(string), DateTimeOffset? lastActivityDate = default(DateTimeOffset?), string deviceName = default(string), string deviceType = default(string), BaseItemDto nowPlayingItem = default(BaseItemDto), long? internalDeviceId = default(long?), string deviceId = default(string), string applicationVersion = default(string), string appIconUrl = default(string), List<string> supportedCommands = default(List<string>), TranscodingInfo transcodingInfo = default(TranscodingInfo), bool? supportsRemoteControl = default(bool?))
        {
            this.PlayState = playState;
            this.AdditionalUsers = additionalUsers;
            this.RemoteEndPoint = remoteEndPoint;
            this.Protocol = protocol;
            this.PlayableMediaTypes = playableMediaTypes;
            this.PlaylistItemId = playlistItemId;
            this.PlaylistIndex = playlistIndex;
            this.PlaylistLength = playlistLength;
            this.Id = id;
            this.ServerId = serverId;
            this.UserId = userId;
            this.PartyId = partyId;
            this.UserName = userName;
            this.UserPrimaryImageTag = userPrimaryImageTag;
            this._Client = _client;
            this.LastActivityDate = lastActivityDate;
            this.DeviceName = deviceName;
            this.DeviceType = deviceType;
            this.NowPlayingItem = nowPlayingItem;
            this.InternalDeviceId = internalDeviceId;
            this.DeviceId = deviceId;
            this.ApplicationVersion = applicationVersion;
            this.AppIconUrl = appIconUrl;
            this.SupportedCommands = supportedCommands;
            this.TranscodingInfo = transcodingInfo;
            this.SupportsRemoteControl = supportsRemoteControl;
        }
        
        /// <summary>
        /// Gets or Sets PlayState
        /// </summary>
        [DataMember(Name="PlayState", EmitDefaultValue=false)]
        public PlayerStateInfo PlayState { get; set; }

        /// <summary>
        /// Gets or Sets AdditionalUsers
        /// </summary>
        [DataMember(Name="AdditionalUsers", EmitDefaultValue=false)]
        public List<SessionUserInfo> AdditionalUsers { get; set; }

        /// <summary>
        /// The remote end point.
        /// </summary>
        /// <value>The remote end point.</value>
        [DataMember(Name="RemoteEndPoint", EmitDefaultValue=false)]
        public string RemoteEndPoint { get; set; }

        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="Protocol", EmitDefaultValue=false)]
        public string Protocol { get; set; }

        /// <summary>
        /// The playable media types.
        /// </summary>
        /// <value>The playable media types.</value>
        [DataMember(Name="PlayableMediaTypes", EmitDefaultValue=false)]
        public List<string> PlayableMediaTypes { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistItemId
        /// </summary>
        [DataMember(Name="PlaylistItemId", EmitDefaultValue=false)]
        public string PlaylistItemId { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistIndex
        /// </summary>
        [DataMember(Name="PlaylistIndex", EmitDefaultValue=false)]
        public int? PlaylistIndex { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistLength
        /// </summary>
        [DataMember(Name="PlaylistLength", EmitDefaultValue=false)]
        public int? PlaylistLength { get; set; }

        /// <summary>
        /// The id.
        /// </summary>
        /// <value>The id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ServerId
        /// </summary>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// The user id.
        /// </summary>
        /// <value>The user id.</value>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets PartyId
        /// </summary>
        [DataMember(Name="PartyId", EmitDefaultValue=false)]
        public string PartyId { get; set; }

        /// <summary>
        /// The username.
        /// </summary>
        /// <value>The username.</value>
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets UserPrimaryImageTag
        /// </summary>
        [DataMember(Name="UserPrimaryImageTag", EmitDefaultValue=false)]
        public string UserPrimaryImageTag { get; set; }

        /// <summary>
        /// The type of the client.
        /// </summary>
        /// <value>The type of the client.</value>
        [DataMember(Name="Client", EmitDefaultValue=false)]
        public string _Client { get; set; }

        /// <summary>
        /// The last activity date.
        /// </summary>
        /// <value>The last activity date.</value>
        [DataMember(Name="LastActivityDate", EmitDefaultValue=false)]
        public DateTimeOffset? LastActivityDate { get; set; }

        /// <summary>
        /// The name of the device.
        /// </summary>
        /// <value>The name of the device.</value>
        [DataMember(Name="DeviceName", EmitDefaultValue=false)]
        public string DeviceName { get; set; }

        /// <summary>
        /// Gets or Sets DeviceType
        /// </summary>
        [DataMember(Name="DeviceType", EmitDefaultValue=false)]
        public string DeviceType { get; set; }

        /// <summary>
        /// Gets or Sets NowPlayingItem
        /// </summary>
        [DataMember(Name="NowPlayingItem", EmitDefaultValue=false)]
        public BaseItemDto NowPlayingItem { get; set; }

        /// <summary>
        /// Gets or Sets InternalDeviceId
        /// </summary>
        [DataMember(Name="InternalDeviceId", EmitDefaultValue=false)]
        public long? InternalDeviceId { get; set; }

        /// <summary>
        /// The device id.
        /// </summary>
        /// <value>The device id.</value>
        [DataMember(Name="DeviceId", EmitDefaultValue=false)]
        public string DeviceId { get; set; }

        /// <summary>
        /// The application version.
        /// </summary>
        /// <value>The application version.</value>
        [DataMember(Name="ApplicationVersion", EmitDefaultValue=false)]
        public string ApplicationVersion { get; set; }

        /// <summary>
        /// The application icon URL.
        /// </summary>
        /// <value>The application icon URL.</value>
        [DataMember(Name="AppIconUrl", EmitDefaultValue=false)]
        public string AppIconUrl { get; set; }

        /// <summary>
        /// The supported commands.
        /// </summary>
        /// <value>The supported commands.</value>
        [DataMember(Name="SupportedCommands", EmitDefaultValue=false)]
        public List<string> SupportedCommands { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingInfo
        /// </summary>
        [DataMember(Name="TranscodingInfo", EmitDefaultValue=false)]
        public TranscodingInfo TranscodingInfo { get; set; }

        /// <summary>
        /// Gets or Sets SupportsRemoteControl
        /// </summary>
        [DataMember(Name="SupportsRemoteControl", EmitDefaultValue=false)]
        public bool? SupportsRemoteControl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SessionSessionInfo {\n");
            sb.Append("  PlayState: ").Append(PlayState).Append("\n");
            sb.Append("  AdditionalUsers: ").Append(AdditionalUsers).Append("\n");
            sb.Append("  RemoteEndPoint: ").Append(RemoteEndPoint).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
            sb.Append("  PlayableMediaTypes: ").Append(PlayableMediaTypes).Append("\n");
            sb.Append("  PlaylistItemId: ").Append(PlaylistItemId).Append("\n");
            sb.Append("  PlaylistIndex: ").Append(PlaylistIndex).Append("\n");
            sb.Append("  PlaylistLength: ").Append(PlaylistLength).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  PartyId: ").Append(PartyId).Append("\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  UserPrimaryImageTag: ").Append(UserPrimaryImageTag).Append("\n");
            sb.Append("  _Client: ").Append(_Client).Append("\n");
            sb.Append("  LastActivityDate: ").Append(LastActivityDate).Append("\n");
            sb.Append("  DeviceName: ").Append(DeviceName).Append("\n");
            sb.Append("  DeviceType: ").Append(DeviceType).Append("\n");
            sb.Append("  NowPlayingItem: ").Append(NowPlayingItem).Append("\n");
            sb.Append("  InternalDeviceId: ").Append(InternalDeviceId).Append("\n");
            sb.Append("  DeviceId: ").Append(DeviceId).Append("\n");
            sb.Append("  ApplicationVersion: ").Append(ApplicationVersion).Append("\n");
            sb.Append("  AppIconUrl: ").Append(AppIconUrl).Append("\n");
            sb.Append("  SupportedCommands: ").Append(SupportedCommands).Append("\n");
            sb.Append("  TranscodingInfo: ").Append(TranscodingInfo).Append("\n");
            sb.Append("  SupportsRemoteControl: ").Append(SupportsRemoteControl).Append("\n");
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
            return this.Equals(input as SessionSessionInfo);
        }

        /// <summary>
        /// Returns true if SessionSessionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of SessionSessionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SessionSessionInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PlayState == input.PlayState ||
                    (this.PlayState != null &&
                    this.PlayState.Equals(input.PlayState))
                ) && 
                (
                    this.AdditionalUsers == input.AdditionalUsers ||
                    this.AdditionalUsers != null &&
                    input.AdditionalUsers != null &&
                    this.AdditionalUsers.SequenceEqual(input.AdditionalUsers)
                ) && 
                (
                    this.RemoteEndPoint == input.RemoteEndPoint ||
                    (this.RemoteEndPoint != null &&
                    this.RemoteEndPoint.Equals(input.RemoteEndPoint))
                ) && 
                (
                    this.Protocol == input.Protocol ||
                    (this.Protocol != null &&
                    this.Protocol.Equals(input.Protocol))
                ) && 
                (
                    this.PlayableMediaTypes == input.PlayableMediaTypes ||
                    this.PlayableMediaTypes != null &&
                    input.PlayableMediaTypes != null &&
                    this.PlayableMediaTypes.SequenceEqual(input.PlayableMediaTypes)
                ) && 
                (
                    this.PlaylistItemId == input.PlaylistItemId ||
                    (this.PlaylistItemId != null &&
                    this.PlaylistItemId.Equals(input.PlaylistItemId))
                ) && 
                (
                    this.PlaylistIndex == input.PlaylistIndex ||
                    (this.PlaylistIndex != null &&
                    this.PlaylistIndex.Equals(input.PlaylistIndex))
                ) && 
                (
                    this.PlaylistLength == input.PlaylistLength ||
                    (this.PlaylistLength != null &&
                    this.PlaylistLength.Equals(input.PlaylistLength))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.PartyId == input.PartyId ||
                    (this.PartyId != null &&
                    this.PartyId.Equals(input.PartyId))
                ) && 
                (
                    this.UserName == input.UserName ||
                    (this.UserName != null &&
                    this.UserName.Equals(input.UserName))
                ) && 
                (
                    this.UserPrimaryImageTag == input.UserPrimaryImageTag ||
                    (this.UserPrimaryImageTag != null &&
                    this.UserPrimaryImageTag.Equals(input.UserPrimaryImageTag))
                ) && 
                (
                    this._Client == input._Client ||
                    (this._Client != null &&
                    this._Client.Equals(input._Client))
                ) && 
                (
                    this.LastActivityDate == input.LastActivityDate ||
                    (this.LastActivityDate != null &&
                    this.LastActivityDate.Equals(input.LastActivityDate))
                ) && 
                (
                    this.DeviceName == input.DeviceName ||
                    (this.DeviceName != null &&
                    this.DeviceName.Equals(input.DeviceName))
                ) && 
                (
                    this.DeviceType == input.DeviceType ||
                    (this.DeviceType != null &&
                    this.DeviceType.Equals(input.DeviceType))
                ) && 
                (
                    this.NowPlayingItem == input.NowPlayingItem ||
                    (this.NowPlayingItem != null &&
                    this.NowPlayingItem.Equals(input.NowPlayingItem))
                ) && 
                (
                    this.InternalDeviceId == input.InternalDeviceId ||
                    (this.InternalDeviceId != null &&
                    this.InternalDeviceId.Equals(input.InternalDeviceId))
                ) && 
                (
                    this.DeviceId == input.DeviceId ||
                    (this.DeviceId != null &&
                    this.DeviceId.Equals(input.DeviceId))
                ) && 
                (
                    this.ApplicationVersion == input.ApplicationVersion ||
                    (this.ApplicationVersion != null &&
                    this.ApplicationVersion.Equals(input.ApplicationVersion))
                ) && 
                (
                    this.AppIconUrl == input.AppIconUrl ||
                    (this.AppIconUrl != null &&
                    this.AppIconUrl.Equals(input.AppIconUrl))
                ) && 
                (
                    this.SupportedCommands == input.SupportedCommands ||
                    this.SupportedCommands != null &&
                    input.SupportedCommands != null &&
                    this.SupportedCommands.SequenceEqual(input.SupportedCommands)
                ) && 
                (
                    this.TranscodingInfo == input.TranscodingInfo ||
                    (this.TranscodingInfo != null &&
                    this.TranscodingInfo.Equals(input.TranscodingInfo))
                ) && 
                (
                    this.SupportsRemoteControl == input.SupportsRemoteControl ||
                    (this.SupportsRemoteControl != null &&
                    this.SupportsRemoteControl.Equals(input.SupportsRemoteControl))
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
                if (this.PlayState != null)
                    hashCode = hashCode * 59 + this.PlayState.GetHashCode();
                if (this.AdditionalUsers != null)
                    hashCode = hashCode * 59 + this.AdditionalUsers.GetHashCode();
                if (this.RemoteEndPoint != null)
                    hashCode = hashCode * 59 + this.RemoteEndPoint.GetHashCode();
                if (this.Protocol != null)
                    hashCode = hashCode * 59 + this.Protocol.GetHashCode();
                if (this.PlayableMediaTypes != null)
                    hashCode = hashCode * 59 + this.PlayableMediaTypes.GetHashCode();
                if (this.PlaylistItemId != null)
                    hashCode = hashCode * 59 + this.PlaylistItemId.GetHashCode();
                if (this.PlaylistIndex != null)
                    hashCode = hashCode * 59 + this.PlaylistIndex.GetHashCode();
                if (this.PlaylistLength != null)
                    hashCode = hashCode * 59 + this.PlaylistLength.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.PartyId != null)
                    hashCode = hashCode * 59 + this.PartyId.GetHashCode();
                if (this.UserName != null)
                    hashCode = hashCode * 59 + this.UserName.GetHashCode();
                if (this.UserPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.UserPrimaryImageTag.GetHashCode();
                if (this._Client != null)
                    hashCode = hashCode * 59 + this._Client.GetHashCode();
                if (this.LastActivityDate != null)
                    hashCode = hashCode * 59 + this.LastActivityDate.GetHashCode();
                if (this.DeviceName != null)
                    hashCode = hashCode * 59 + this.DeviceName.GetHashCode();
                if (this.DeviceType != null)
                    hashCode = hashCode * 59 + this.DeviceType.GetHashCode();
                if (this.NowPlayingItem != null)
                    hashCode = hashCode * 59 + this.NowPlayingItem.GetHashCode();
                if (this.InternalDeviceId != null)
                    hashCode = hashCode * 59 + this.InternalDeviceId.GetHashCode();
                if (this.DeviceId != null)
                    hashCode = hashCode * 59 + this.DeviceId.GetHashCode();
                if (this.ApplicationVersion != null)
                    hashCode = hashCode * 59 + this.ApplicationVersion.GetHashCode();
                if (this.AppIconUrl != null)
                    hashCode = hashCode * 59 + this.AppIconUrl.GetHashCode();
                if (this.SupportedCommands != null)
                    hashCode = hashCode * 59 + this.SupportedCommands.GetHashCode();
                if (this.TranscodingInfo != null)
                    hashCode = hashCode * 59 + this.TranscodingInfo.GetHashCode();
                if (this.SupportsRemoteControl != null)
                    hashCode = hashCode * 59 + this.SupportsRemoteControl.GetHashCode();
                return hashCode;
            }
        }

    }
}
