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
import io.swagger.client.model.ConnectUserLinkType;
import io.swagger.client.model.UserConfiguration;
import io.swagger.client.model.UserItemShareLevel;
import io.swagger.client.model.UserPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Class UserDto  
 */
@Schema(description = "Class UserDto  ")

public class UserDto {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("ServerName")
  private String serverName = null;

  @SerializedName("Prefix")
  private String prefix = null;

  @SerializedName("ConnectUserName")
  private String connectUserName = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("ConnectLinkType")
  private ConnectUserLinkType connectLinkType = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("PrimaryImageTag")
  private String primaryImageTag = null;

  @SerializedName("HasPassword")
  private Boolean hasPassword = null;

  @SerializedName("HasConfiguredPassword")
  private Boolean hasConfiguredPassword = null;

  @SerializedName("EnableAutoLogin")
  private Boolean enableAutoLogin = null;

  @SerializedName("LastLoginDate")
  private OffsetDateTime lastLoginDate = null;

  @SerializedName("LastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("Configuration")
  private UserConfiguration _configuration = null;

  @SerializedName("Policy")
  private UserPolicy policy = null;

  @SerializedName("PrimaryImageAspectRatio")
  private Double primaryImageAspectRatio = null;

  @SerializedName("HasConfiguredEasyPassword")
  private Boolean hasConfiguredEasyPassword = null;

  @SerializedName("UserItemShareLevel")
  private UserItemShareLevel userItemShareLevel = null;

  public UserDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserDto serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * The server identifier.
   * @return serverId
  **/
  @Schema(description = "The server identifier.")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public UserDto serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * The name of the server. This is not used by the server and is for client\\-side usage only.
   * @return serverName
  **/
  @Schema(description = "The name of the server. This is not used by the server and is for client\\-side usage only.")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public UserDto prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public UserDto connectUserName(String connectUserName) {
    this.connectUserName = connectUserName;
    return this;
  }

   /**
   * The name of the connect user.
   * @return connectUserName
  **/
  @Schema(description = "The name of the connect user.")
  public String getConnectUserName() {
    return connectUserName;
  }

  public void setConnectUserName(String connectUserName) {
    this.connectUserName = connectUserName;
  }

  public UserDto dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public UserDto connectLinkType(ConnectUserLinkType connectLinkType) {
    this.connectLinkType = connectLinkType;
    return this;
  }

   /**
   * Get connectLinkType
   * @return connectLinkType
  **/
  @Schema(description = "")
  public ConnectUserLinkType getConnectLinkType() {
    return connectLinkType;
  }

  public void setConnectLinkType(ConnectUserLinkType connectLinkType) {
    this.connectLinkType = connectLinkType;
  }

  public UserDto id(String id) {
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

  public UserDto primaryImageTag(String primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
    return this;
  }

   /**
   * The primary image tag.
   * @return primaryImageTag
  **/
  @Schema(description = "The primary image tag.")
  public String getPrimaryImageTag() {
    return primaryImageTag;
  }

  public void setPrimaryImageTag(String primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
  }

  public UserDto hasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
    return this;
  }

   /**
   * A value indicating whether this instance has password.
   * @return hasPassword
  **/
  @Schema(description = "A value indicating whether this instance has password.")
  public Boolean isHasPassword() {
    return hasPassword;
  }

  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }

  public UserDto hasConfiguredPassword(Boolean hasConfiguredPassword) {
    this.hasConfiguredPassword = hasConfiguredPassword;
    return this;
  }

   /**
   * A value indicating whether this instance has configured password.
   * @return hasConfiguredPassword
  **/
  @Schema(description = "A value indicating whether this instance has configured password.")
  public Boolean isHasConfiguredPassword() {
    return hasConfiguredPassword;
  }

  public void setHasConfiguredPassword(Boolean hasConfiguredPassword) {
    this.hasConfiguredPassword = hasConfiguredPassword;
  }

  public UserDto enableAutoLogin(Boolean enableAutoLogin) {
    this.enableAutoLogin = enableAutoLogin;
    return this;
  }

   /**
   * Get enableAutoLogin
   * @return enableAutoLogin
  **/
  @Schema(description = "")
  public Boolean isEnableAutoLogin() {
    return enableAutoLogin;
  }

  public void setEnableAutoLogin(Boolean enableAutoLogin) {
    this.enableAutoLogin = enableAutoLogin;
  }

  public UserDto lastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
    return this;
  }

   /**
   * The last login date.
   * @return lastLoginDate
  **/
  @Schema(description = "The last login date.")
  public OffsetDateTime getLastLoginDate() {
    return lastLoginDate;
  }

  public void setLastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }

  public UserDto lastActivityDate(OffsetDateTime lastActivityDate) {
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

  public UserDto _configuration(UserConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @Schema(description = "")
  public UserConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(UserConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public UserDto policy(UserPolicy policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public UserPolicy getPolicy() {
    return policy;
  }

  public void setPolicy(UserPolicy policy) {
    this.policy = policy;
  }

  public UserDto primaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
    return this;
  }

   /**
   * The primary image aspect ratio.
   * @return primaryImageAspectRatio
  **/
  @Schema(description = "The primary image aspect ratio.")
  public Double getPrimaryImageAspectRatio() {
    return primaryImageAspectRatio;
  }

  public void setPrimaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
  }

  public UserDto hasConfiguredEasyPassword(Boolean hasConfiguredEasyPassword) {
    this.hasConfiguredEasyPassword = hasConfiguredEasyPassword;
    return this;
  }

   /**
   * Get hasConfiguredEasyPassword
   * @return hasConfiguredEasyPassword
  **/
  @Schema(description = "")
  public Boolean isHasConfiguredEasyPassword() {
    return hasConfiguredEasyPassword;
  }

  public void setHasConfiguredEasyPassword(Boolean hasConfiguredEasyPassword) {
    this.hasConfiguredEasyPassword = hasConfiguredEasyPassword;
  }

  public UserDto userItemShareLevel(UserItemShareLevel userItemShareLevel) {
    this.userItemShareLevel = userItemShareLevel;
    return this;
  }

   /**
   * Get userItemShareLevel
   * @return userItemShareLevel
  **/
  @Schema(description = "")
  public UserItemShareLevel getUserItemShareLevel() {
    return userItemShareLevel;
  }

  public void setUserItemShareLevel(UserItemShareLevel userItemShareLevel) {
    this.userItemShareLevel = userItemShareLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.name, userDto.name) &&
        Objects.equals(this.serverId, userDto.serverId) &&
        Objects.equals(this.serverName, userDto.serverName) &&
        Objects.equals(this.prefix, userDto.prefix) &&
        Objects.equals(this.connectUserName, userDto.connectUserName) &&
        Objects.equals(this.dateCreated, userDto.dateCreated) &&
        Objects.equals(this.connectLinkType, userDto.connectLinkType) &&
        Objects.equals(this.id, userDto.id) &&
        Objects.equals(this.primaryImageTag, userDto.primaryImageTag) &&
        Objects.equals(this.hasPassword, userDto.hasPassword) &&
        Objects.equals(this.hasConfiguredPassword, userDto.hasConfiguredPassword) &&
        Objects.equals(this.enableAutoLogin, userDto.enableAutoLogin) &&
        Objects.equals(this.lastLoginDate, userDto.lastLoginDate) &&
        Objects.equals(this.lastActivityDate, userDto.lastActivityDate) &&
        Objects.equals(this._configuration, userDto._configuration) &&
        Objects.equals(this.policy, userDto.policy) &&
        Objects.equals(this.primaryImageAspectRatio, userDto.primaryImageAspectRatio) &&
        Objects.equals(this.hasConfiguredEasyPassword, userDto.hasConfiguredEasyPassword) &&
        Objects.equals(this.userItemShareLevel, userDto.userItemShareLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serverId, serverName, prefix, connectUserName, dateCreated, connectLinkType, id, primaryImageTag, hasPassword, hasConfiguredPassword, enableAutoLogin, lastLoginDate, lastActivityDate, _configuration, policy, primaryImageAspectRatio, hasConfiguredEasyPassword, userItemShareLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    connectUserName: ").append(toIndentedString(connectUserName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    connectLinkType: ").append(toIndentedString(connectLinkType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    hasConfiguredPassword: ").append(toIndentedString(hasConfiguredPassword)).append("\n");
    sb.append("    enableAutoLogin: ").append(toIndentedString(enableAutoLogin)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    primaryImageAspectRatio: ").append(toIndentedString(primaryImageAspectRatio)).append("\n");
    sb.append("    hasConfiguredEasyPassword: ").append(toIndentedString(hasConfiguredEasyPassword)).append("\n");
    sb.append("    userItemShareLevel: ").append(toIndentedString(userItemShareLevel)).append("\n");
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
