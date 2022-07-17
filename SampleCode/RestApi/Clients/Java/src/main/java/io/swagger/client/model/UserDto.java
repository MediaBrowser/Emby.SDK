/*
 * Emby REST API
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
import io.swagger.client.model.ConfigurationUserConfiguration;
import io.swagger.client.model.ConnectUserLinkType;
import io.swagger.client.model.UsersUserPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * UserDto
 */


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

  @SerializedName("HasConfiguredEasyPassword")
  private Boolean hasConfiguredEasyPassword = null;

  @SerializedName("EnableAutoLogin")
  private Boolean enableAutoLogin = null;

  @SerializedName("LastLoginDate")
  private OffsetDateTime lastLoginDate = null;

  @SerializedName("LastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("Configuration")
  private ConfigurationUserConfiguration _configuration = null;

  @SerializedName("Policy")
  private UsersUserPolicy policy = null;

  @SerializedName("PrimaryImageAspectRatio")
  private Double primaryImageAspectRatio = null;

  public UserDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
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

  public UserDto serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @Schema(description = "")
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
   * Get connectUserName
   * @return connectUserName
  **/
  @Schema(description = "")
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
   * Get id
   * @return id
  **/
  @Schema(description = "")
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
   * Get primaryImageTag
   * @return primaryImageTag
  **/
  @Schema(description = "")
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
   * Get hasPassword
   * @return hasPassword
  **/
  @Schema(description = "")
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
   * Get hasConfiguredPassword
   * @return hasConfiguredPassword
  **/
  @Schema(description = "")
  public Boolean isHasConfiguredPassword() {
    return hasConfiguredPassword;
  }

  public void setHasConfiguredPassword(Boolean hasConfiguredPassword) {
    this.hasConfiguredPassword = hasConfiguredPassword;
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
   * Get lastLoginDate
   * @return lastLoginDate
  **/
  @Schema(description = "")
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
   * Get lastActivityDate
   * @return lastActivityDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public UserDto _configuration(ConfigurationUserConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @Schema(description = "")
  public ConfigurationUserConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(ConfigurationUserConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public UserDto policy(UsersUserPolicy policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public UsersUserPolicy getPolicy() {
    return policy;
  }

  public void setPolicy(UsersUserPolicy policy) {
    this.policy = policy;
  }

  public UserDto primaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
    return this;
  }

   /**
   * Get primaryImageAspectRatio
   * @return primaryImageAspectRatio
  **/
  @Schema(description = "")
  public Double getPrimaryImageAspectRatio() {
    return primaryImageAspectRatio;
  }

  public void setPrimaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
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
        Objects.equals(this.hasConfiguredEasyPassword, userDto.hasConfiguredEasyPassword) &&
        Objects.equals(this.enableAutoLogin, userDto.enableAutoLogin) &&
        Objects.equals(this.lastLoginDate, userDto.lastLoginDate) &&
        Objects.equals(this.lastActivityDate, userDto.lastActivityDate) &&
        Objects.equals(this._configuration, userDto._configuration) &&
        Objects.equals(this.policy, userDto.policy) &&
        Objects.equals(this.primaryImageAspectRatio, userDto.primaryImageAspectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serverId, serverName, prefix, connectUserName, dateCreated, connectLinkType, id, primaryImageTag, hasPassword, hasConfiguredPassword, hasConfiguredEasyPassword, enableAutoLogin, lastLoginDate, lastActivityDate, _configuration, policy, primaryImageAspectRatio);
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
    sb.append("    hasConfiguredEasyPassword: ").append(toIndentedString(hasConfiguredEasyPassword)).append("\n");
    sb.append("    enableAutoLogin: ").append(toIndentedString(enableAutoLogin)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    primaryImageAspectRatio: ").append(toIndentedString(primaryImageAspectRatio)).append("\n");
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
