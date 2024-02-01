/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.PlayerStateInfo;
import io.swagger.client.model.SessionUserInfo;
import io.swagger.client.model.TranscodingInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Class SessionInfo  
 */
@Schema(description = "Class SessionInfo  ")

public class SessionSessionInfo {
  @SerializedName("PlayState")
  private PlayerStateInfo playState = null;

  @SerializedName("AdditionalUsers")
  private List<SessionUserInfo> additionalUsers = null;

  @SerializedName("RemoteEndPoint")
  private String remoteEndPoint = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("PlayableMediaTypes")
  private List<String> playableMediaTypes = null;

  @SerializedName("PlaylistItemId")
  private String playlistItemId = null;

  @SerializedName("PlaylistIndex")
  private Integer playlistIndex = null;

  @SerializedName("PlaylistLength")
  private Integer playlistLength = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("UserPrimaryImageTag")
  private String userPrimaryImageTag = null;

  @SerializedName("Client")
  private String client = null;

  @SerializedName("LastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("DeviceName")
  private String deviceName = null;

  @SerializedName("DeviceType")
  private String deviceType = null;

  @SerializedName("NowPlayingItem")
  private BaseItemDto nowPlayingItem = null;

  @SerializedName("InternalDeviceId")
  private Long internalDeviceId = null;

  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("ApplicationVersion")
  private String applicationVersion = null;

  @SerializedName("AppIconUrl")
  private String appIconUrl = null;

  @SerializedName("SupportedCommands")
  private List<String> supportedCommands = null;

  @SerializedName("TranscodingInfo")
  private TranscodingInfo transcodingInfo = null;

  @SerializedName("SupportsRemoteControl")
  private Boolean supportsRemoteControl = null;

  public SessionSessionInfo playState(PlayerStateInfo playState) {
    this.playState = playState;
    return this;
  }

   /**
   * Get playState
   * @return playState
  **/
  @Schema(description = "")
  public PlayerStateInfo getPlayState() {
    return playState;
  }

  public void setPlayState(PlayerStateInfo playState) {
    this.playState = playState;
  }

  public SessionSessionInfo additionalUsers(List<SessionUserInfo> additionalUsers) {
    this.additionalUsers = additionalUsers;
    return this;
  }

  public SessionSessionInfo addAdditionalUsersItem(SessionUserInfo additionalUsersItem) {
    if (this.additionalUsers == null) {
      this.additionalUsers = new ArrayList<SessionUserInfo>();
    }
    this.additionalUsers.add(additionalUsersItem);
    return this;
  }

   /**
   * Get additionalUsers
   * @return additionalUsers
  **/
  @Schema(description = "")
  public List<SessionUserInfo> getAdditionalUsers() {
    return additionalUsers;
  }

  public void setAdditionalUsers(List<SessionUserInfo> additionalUsers) {
    this.additionalUsers = additionalUsers;
  }

  public SessionSessionInfo remoteEndPoint(String remoteEndPoint) {
    this.remoteEndPoint = remoteEndPoint;
    return this;
  }

   /**
   * The remote end point.
   * @return remoteEndPoint
  **/
  @Schema(description = "The remote end point.")
  public String getRemoteEndPoint() {
    return remoteEndPoint;
  }

  public void setRemoteEndPoint(String remoteEndPoint) {
    this.remoteEndPoint = remoteEndPoint;
  }

  public SessionSessionInfo protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SessionSessionInfo playableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
    return this;
  }

  public SessionSessionInfo addPlayableMediaTypesItem(String playableMediaTypesItem) {
    if (this.playableMediaTypes == null) {
      this.playableMediaTypes = new ArrayList<String>();
    }
    this.playableMediaTypes.add(playableMediaTypesItem);
    return this;
  }

   /**
   * The playable media types.
   * @return playableMediaTypes
  **/
  @Schema(description = "The playable media types.")
  public List<String> getPlayableMediaTypes() {
    return playableMediaTypes;
  }

  public void setPlayableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
  }

  public SessionSessionInfo playlistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

   /**
   * Get playlistItemId
   * @return playlistItemId
  **/
  @Schema(description = "")
  public String getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public SessionSessionInfo playlistIndex(Integer playlistIndex) {
    this.playlistIndex = playlistIndex;
    return this;
  }

   /**
   * Get playlistIndex
   * @return playlistIndex
  **/
  @Schema(description = "")
  public Integer getPlaylistIndex() {
    return playlistIndex;
  }

  public void setPlaylistIndex(Integer playlistIndex) {
    this.playlistIndex = playlistIndex;
  }

  public SessionSessionInfo playlistLength(Integer playlistLength) {
    this.playlistLength = playlistLength;
    return this;
  }

   /**
   * Get playlistLength
   * @return playlistLength
  **/
  @Schema(description = "")
  public Integer getPlaylistLength() {
    return playlistLength;
  }

  public void setPlaylistLength(Integer playlistLength) {
    this.playlistLength = playlistLength;
  }

  public SessionSessionInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id.
   * @return id
  **/
  @Schema(description = "The id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SessionSessionInfo serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public SessionSessionInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user id.
   * @return userId
  **/
  @Schema(description = "The user id.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SessionSessionInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The username.
   * @return userName
  **/
  @Schema(description = "The username.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SessionSessionInfo userPrimaryImageTag(String userPrimaryImageTag) {
    this.userPrimaryImageTag = userPrimaryImageTag;
    return this;
  }

   /**
   * Get userPrimaryImageTag
   * @return userPrimaryImageTag
  **/
  @Schema(description = "")
  public String getUserPrimaryImageTag() {
    return userPrimaryImageTag;
  }

  public void setUserPrimaryImageTag(String userPrimaryImageTag) {
    this.userPrimaryImageTag = userPrimaryImageTag;
  }

  public SessionSessionInfo client(String client) {
    this.client = client;
    return this;
  }

   /**
   * The type of the client.
   * @return client
  **/
  @Schema(description = "The type of the client.")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public SessionSessionInfo lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * The last activity date.
   * @return lastActivityDate
  **/
  @Schema(description = "The last activity date.")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public SessionSessionInfo deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * The name of the device.
   * @return deviceName
  **/
  @Schema(description = "The name of the device.")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public SessionSessionInfo deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @Schema(description = "")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public SessionSessionInfo nowPlayingItem(BaseItemDto nowPlayingItem) {
    this.nowPlayingItem = nowPlayingItem;
    return this;
  }

   /**
   * Get nowPlayingItem
   * @return nowPlayingItem
  **/
  @Schema(description = "")
  public BaseItemDto getNowPlayingItem() {
    return nowPlayingItem;
  }

  public void setNowPlayingItem(BaseItemDto nowPlayingItem) {
    this.nowPlayingItem = nowPlayingItem;
  }

  public SessionSessionInfo internalDeviceId(Long internalDeviceId) {
    this.internalDeviceId = internalDeviceId;
    return this;
  }

   /**
   * Get internalDeviceId
   * @return internalDeviceId
  **/
  @Schema(description = "")
  public Long getInternalDeviceId() {
    return internalDeviceId;
  }

  public void setInternalDeviceId(Long internalDeviceId) {
    this.internalDeviceId = internalDeviceId;
  }

  public SessionSessionInfo deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device id.
   * @return deviceId
  **/
  @Schema(description = "The device id.")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public SessionSessionInfo applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * The application version.
   * @return applicationVersion
  **/
  @Schema(description = "The application version.")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public SessionSessionInfo appIconUrl(String appIconUrl) {
    this.appIconUrl = appIconUrl;
    return this;
  }

   /**
   * The application icon URL.
   * @return appIconUrl
  **/
  @Schema(description = "The application icon URL.")
  public String getAppIconUrl() {
    return appIconUrl;
  }

  public void setAppIconUrl(String appIconUrl) {
    this.appIconUrl = appIconUrl;
  }

  public SessionSessionInfo supportedCommands(List<String> supportedCommands) {
    this.supportedCommands = supportedCommands;
    return this;
  }

  public SessionSessionInfo addSupportedCommandsItem(String supportedCommandsItem) {
    if (this.supportedCommands == null) {
      this.supportedCommands = new ArrayList<String>();
    }
    this.supportedCommands.add(supportedCommandsItem);
    return this;
  }

   /**
   * The supported commands.
   * @return supportedCommands
  **/
  @Schema(description = "The supported commands.")
  public List<String> getSupportedCommands() {
    return supportedCommands;
  }

  public void setSupportedCommands(List<String> supportedCommands) {
    this.supportedCommands = supportedCommands;
  }

  public SessionSessionInfo transcodingInfo(TranscodingInfo transcodingInfo) {
    this.transcodingInfo = transcodingInfo;
    return this;
  }

   /**
   * Get transcodingInfo
   * @return transcodingInfo
  **/
  @Schema(description = "")
  public TranscodingInfo getTranscodingInfo() {
    return transcodingInfo;
  }

  public void setTranscodingInfo(TranscodingInfo transcodingInfo) {
    this.transcodingInfo = transcodingInfo;
  }

  public SessionSessionInfo supportsRemoteControl(Boolean supportsRemoteControl) {
    this.supportsRemoteControl = supportsRemoteControl;
    return this;
  }

   /**
   * Get supportsRemoteControl
   * @return supportsRemoteControl
  **/
  @Schema(description = "")
  public Boolean isSupportsRemoteControl() {
    return supportsRemoteControl;
  }

  public void setSupportsRemoteControl(Boolean supportsRemoteControl) {
    this.supportsRemoteControl = supportsRemoteControl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionSessionInfo sessionSessionInfo = (SessionSessionInfo) o;
    return Objects.equals(this.playState, sessionSessionInfo.playState) &&
        Objects.equals(this.additionalUsers, sessionSessionInfo.additionalUsers) &&
        Objects.equals(this.remoteEndPoint, sessionSessionInfo.remoteEndPoint) &&
        Objects.equals(this.protocol, sessionSessionInfo.protocol) &&
        Objects.equals(this.playableMediaTypes, sessionSessionInfo.playableMediaTypes) &&
        Objects.equals(this.playlistItemId, sessionSessionInfo.playlistItemId) &&
        Objects.equals(this.playlistIndex, sessionSessionInfo.playlistIndex) &&
        Objects.equals(this.playlistLength, sessionSessionInfo.playlistLength) &&
        Objects.equals(this.id, sessionSessionInfo.id) &&
        Objects.equals(this.serverId, sessionSessionInfo.serverId) &&
        Objects.equals(this.userId, sessionSessionInfo.userId) &&
        Objects.equals(this.userName, sessionSessionInfo.userName) &&
        Objects.equals(this.userPrimaryImageTag, sessionSessionInfo.userPrimaryImageTag) &&
        Objects.equals(this.client, sessionSessionInfo.client) &&
        Objects.equals(this.lastActivityDate, sessionSessionInfo.lastActivityDate) &&
        Objects.equals(this.deviceName, sessionSessionInfo.deviceName) &&
        Objects.equals(this.deviceType, sessionSessionInfo.deviceType) &&
        Objects.equals(this.nowPlayingItem, sessionSessionInfo.nowPlayingItem) &&
        Objects.equals(this.internalDeviceId, sessionSessionInfo.internalDeviceId) &&
        Objects.equals(this.deviceId, sessionSessionInfo.deviceId) &&
        Objects.equals(this.applicationVersion, sessionSessionInfo.applicationVersion) &&
        Objects.equals(this.appIconUrl, sessionSessionInfo.appIconUrl) &&
        Objects.equals(this.supportedCommands, sessionSessionInfo.supportedCommands) &&
        Objects.equals(this.transcodingInfo, sessionSessionInfo.transcodingInfo) &&
        Objects.equals(this.supportsRemoteControl, sessionSessionInfo.supportsRemoteControl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playState, additionalUsers, remoteEndPoint, protocol, playableMediaTypes, playlistItemId, playlistIndex, playlistLength, id, serverId, userId, userName, userPrimaryImageTag, client, lastActivityDate, deviceName, deviceType, nowPlayingItem, internalDeviceId, deviceId, applicationVersion, appIconUrl, supportedCommands, transcodingInfo, supportsRemoteControl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionSessionInfo {\n");
    
    sb.append("    playState: ").append(toIndentedString(playState)).append("\n");
    sb.append("    additionalUsers: ").append(toIndentedString(additionalUsers)).append("\n");
    sb.append("    remoteEndPoint: ").append(toIndentedString(remoteEndPoint)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    playableMediaTypes: ").append(toIndentedString(playableMediaTypes)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    playlistIndex: ").append(toIndentedString(playlistIndex)).append("\n");
    sb.append("    playlistLength: ").append(toIndentedString(playlistLength)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPrimaryImageTag: ").append(toIndentedString(userPrimaryImageTag)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    nowPlayingItem: ").append(toIndentedString(nowPlayingItem)).append("\n");
    sb.append("    internalDeviceId: ").append(toIndentedString(internalDeviceId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    appIconUrl: ").append(toIndentedString(appIconUrl)).append("\n");
    sb.append("    supportedCommands: ").append(toIndentedString(supportedCommands)).append("\n");
    sb.append("    transcodingInfo: ").append(toIndentedString(transcodingInfo)).append("\n");
    sb.append("    supportsRemoteControl: ").append(toIndentedString(supportsRemoteControl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
