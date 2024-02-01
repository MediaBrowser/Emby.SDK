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
 * AuthenticateUser
 */


public class AuthenticateUser {
  @SerializedName("Pw")
  private String pw = null;

  public AuthenticateUser pw(String pw) {
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
    AuthenticateUser authenticateUser = (AuthenticateUser) o;
    return Objects.equals(this.pw, authenticateUser.pw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateUser {\n");
    
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
