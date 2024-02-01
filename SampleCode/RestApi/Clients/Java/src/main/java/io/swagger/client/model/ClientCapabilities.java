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
import io.swagger.client.model.DeviceProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ClientCapabilities
 */


public class ClientCapabilities {
  @SerializedName("PlayableMediaTypes")
  private List<String> playableMediaTypes = null;

  @SerializedName("SupportedCommands")
  private List<String> supportedCommands = null;

  @SerializedName("SupportsMediaControl")
  private Boolean supportsMediaControl = null;

  @SerializedName("PushToken")
  private String pushToken = null;

  @SerializedName("PushTokenType")
  private String pushTokenType = null;

  @SerializedName("SupportsSync")
  private Boolean supportsSync = null;

  @SerializedName("DeviceProfile")
  private DeviceProfile deviceProfile = null;

  @SerializedName("IconUrl")
  private String iconUrl = null;

  @SerializedName("AppId")
  private String appId = null;

  public ClientCapabilities playableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
    return this;
  }

  public ClientCapabilities addPlayableMediaTypesItem(String playableMediaTypesItem) {
    if (this.playableMediaTypes == null) {
      this.playableMediaTypes = new ArrayList<String>();
    }
    this.playableMediaTypes.add(playableMediaTypesItem);
    return this;
  }

   /**
   * Get playableMediaTypes
   * @return playableMediaTypes
  **/
  @Schema(description = "")
  public List<String> getPlayableMediaTypes() {
    return playableMediaTypes;
  }

  public void setPlayableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
  }

  public ClientCapabilities supportedCommands(List<String> supportedCommands) {
    this.supportedCommands = supportedCommands;
    return this;
  }

  public ClientCapabilities addSupportedCommandsItem(String supportedCommandsItem) {
    if (this.supportedCommands == null) {
      this.supportedCommands = new ArrayList<String>();
    }
    this.supportedCommands.add(supportedCommandsItem);
    return this;
  }

   /**
   * Get supportedCommands
   * @return supportedCommands
  **/
  @Schema(description = "")
  public List<String> getSupportedCommands() {
    return supportedCommands;
  }

  public void setSupportedCommands(List<String> supportedCommands) {
    this.supportedCommands = supportedCommands;
  }

  public ClientCapabilities supportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
    return this;
  }

   /**
   * Get supportsMediaControl
   * @return supportsMediaControl
  **/
  @Schema(description = "")
  public Boolean isSupportsMediaControl() {
    return supportsMediaControl;
  }

  public void setSupportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
  }

  public ClientCapabilities pushToken(String pushToken) {
    this.pushToken = pushToken;
    return this;
  }

   /**
   * Get pushToken
   * @return pushToken
  **/
  @Schema(description = "")
  public String getPushToken() {
    return pushToken;
  }

  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }

  public ClientCapabilities pushTokenType(String pushTokenType) {
    this.pushTokenType = pushTokenType;
    return this;
  }

   /**
   * Get pushTokenType
   * @return pushTokenType
  **/
  @Schema(description = "")
  public String getPushTokenType() {
    return pushTokenType;
  }

  public void setPushTokenType(String pushTokenType) {
    this.pushTokenType = pushTokenType;
  }

  public ClientCapabilities supportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
    return this;
  }

   /**
   * Get supportsSync
   * @return supportsSync
  **/
  @Schema(description = "")
  public Boolean isSupportsSync() {
    return supportsSync;
  }

  public void setSupportsSync(Boolean supportsSync) {
    this.supportsSync = supportsSync;
  }

  public ClientCapabilities deviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
    return this;
  }

   /**
   * Get deviceProfile
   * @return deviceProfile
  **/
  @Schema(description = "")
  public DeviceProfile getDeviceProfile() {
    return deviceProfile;
  }

  public void setDeviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
  }

  public ClientCapabilities iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @Schema(description = "")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public ClientCapabilities appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCapabilities clientCapabilities = (ClientCapabilities) o;
    return Objects.equals(this.playableMediaTypes, clientCapabilities.playableMediaTypes) &&
        Objects.equals(this.supportedCommands, clientCapabilities.supportedCommands) &&
        Objects.equals(this.supportsMediaControl, clientCapabilities.supportsMediaControl) &&
        Objects.equals(this.pushToken, clientCapabilities.pushToken) &&
        Objects.equals(this.pushTokenType, clientCapabilities.pushTokenType) &&
        Objects.equals(this.supportsSync, clientCapabilities.supportsSync) &&
        Objects.equals(this.deviceProfile, clientCapabilities.deviceProfile) &&
        Objects.equals(this.iconUrl, clientCapabilities.iconUrl) &&
        Objects.equals(this.appId, clientCapabilities.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playableMediaTypes, supportedCommands, supportsMediaControl, pushToken, pushTokenType, supportsSync, deviceProfile, iconUrl, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCapabilities {\n");
    
    sb.append("    playableMediaTypes: ").append(toIndentedString(playableMediaTypes)).append("\n");
    sb.append("    supportedCommands: ").append(toIndentedString(supportedCommands)).append("\n");
    sb.append("    supportsMediaControl: ").append(toIndentedString(supportsMediaControl)).append("\n");
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
    sb.append("    pushTokenType: ").append(toIndentedString(pushTokenType)).append("\n");
    sb.append("    supportsSync: ").append(toIndentedString(supportsSync)).append("\n");
    sb.append("    deviceProfile: ").append(toIndentedString(deviceProfile)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
