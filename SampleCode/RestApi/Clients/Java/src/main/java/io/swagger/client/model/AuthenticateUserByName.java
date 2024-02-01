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
 * AuthenticateUserByName
 */


public class AuthenticateUserByName {
  @SerializedName("Username")
  private String username = null;

  @SerializedName("Pw")
  private String pw = null;

  public AuthenticateUserByName username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AuthenticateUserByName pw(String pw) {
    this.pw = pw;
    return this;
  }

   /**
   * Get pw
   * @return pw
  **/
  @Schema(description = "")
  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticateUserByName authenticateUserByName = (AuthenticateUserByName) o;
    return Objects.equals(this.username, authenticateUserByName.username) &&
        Objects.equals(this.pw, authenticateUserByName.pw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, pw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateUserByName {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    pw: ").append(toIndentedString(pw)).append("\n");
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
