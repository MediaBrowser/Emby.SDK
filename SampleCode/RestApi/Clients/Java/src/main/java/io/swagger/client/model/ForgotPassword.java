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
 * ForgotPassword
 */


public class ForgotPassword {
  @SerializedName("EnteredUsername")
  private String enteredUsername = null;

  public ForgotPassword enteredUsername(String enteredUsername) {
    this.enteredUsername = enteredUsername;
    return this;
  }

   /**
   * Get enteredUsername
   * @return enteredUsername
  **/
  @Schema(description = "")
  public String getEnteredUsername() {
    return enteredUsername;
  }

  public void setEnteredUsername(String enteredUsername) {
    this.enteredUsername = enteredUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgotPassword forgotPassword = (ForgotPassword) o;
    return Objects.equals(this.enteredUsername, forgotPassword.enteredUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enteredUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgotPassword {\n");
    
    sb.append("    enteredUsername: ").append(toIndentedString(enteredUsername)).append("\n");
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
