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
import io.swagger.client.model.SessionSessionInfo;
import io.swagger.client.model.UserDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AuthenticationAuthenticationResult
 */


public class AuthenticationAuthenticationResult {
  @SerializedName("User")
  private UserDto user = null;

  @SerializedName("SessionInfo")
  private SessionSessionInfo sessionInfo = null;

  @SerializedName("AccessToken")
  private String accessToken = null;

  @SerializedName("ServerId")
  private String serverId = null;

  public AuthenticationAuthenticationResult user(UserDto user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  public AuthenticationAuthenticationResult sessionInfo(SessionSessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
    return this;
  }

   /**
   * Get sessionInfo
   * @return sessionInfo
  **/
  @Schema(description = "")
  public SessionSessionInfo getSessionInfo() {
    return sessionInfo;
  }

  public void setSessionInfo(SessionSessionInfo sessionInfo) {
    this.sessionInfo = sessionInfo;
  }

  public AuthenticationAuthenticationResult accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The authentication token.
   * @return accessToken
  **/
  @Schema(description = "The authentication token.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthenticationAuthenticationResult serverId(String serverId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationAuthenticationResult authenticationAuthenticationResult = (AuthenticationAuthenticationResult) o;
    return Objects.equals(this.user, authenticationAuthenticationResult.user) &&
        Objects.equals(this.sessionInfo, authenticationAuthenticationResult.sessionInfo) &&
        Objects.equals(this.accessToken, authenticationAuthenticationResult.accessToken) &&
        Objects.equals(this.serverId, authenticationAuthenticationResult.serverId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, sessionInfo, accessToken, serverId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationAuthenticationResult {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    sessionInfo: ").append(toIndentedString(sessionInfo)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
