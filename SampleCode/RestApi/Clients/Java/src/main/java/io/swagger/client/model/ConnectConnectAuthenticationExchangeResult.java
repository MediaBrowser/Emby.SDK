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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ConnectConnectAuthenticationExchangeResult
 */


public class ConnectConnectAuthenticationExchangeResult {
  @SerializedName("LocalUserId")
  private String localUserId = null;

  @SerializedName("AccessToken")
  private String accessToken = null;

  public ConnectConnectAuthenticationExchangeResult localUserId(String localUserId) {
    this.localUserId = localUserId;
    return this;
  }

   /**
   * Get localUserId
   * @return localUserId
  **/
  @Schema(description = "")
  public String getLocalUserId() {
    return localUserId;
  }

  public void setLocalUserId(String localUserId) {
    this.localUserId = localUserId;
  }

  public ConnectConnectAuthenticationExchangeResult accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @Schema(description = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectConnectAuthenticationExchangeResult connectConnectAuthenticationExchangeResult = (ConnectConnectAuthenticationExchangeResult) o;
    return Objects.equals(this.localUserId, connectConnectAuthenticationExchangeResult.localUserId) &&
        Objects.equals(this.accessToken, connectConnectAuthenticationExchangeResult.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localUserId, accessToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectConnectAuthenticationExchangeResult {\n");
    
    sb.append("    localUserId: ").append(toIndentedString(localUserId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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
