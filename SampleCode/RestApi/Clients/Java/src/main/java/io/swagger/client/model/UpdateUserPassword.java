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
 * UpdateUserPassword
 */


public class UpdateUserPassword {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("NewPw")
  private String newPw = null;

  @SerializedName("ResetPassword")
  private Boolean resetPassword = null;

  public UpdateUserPassword id(String id) {
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

  public UpdateUserPassword newPw(String newPw) {
    this.newPw = newPw;
    return this;
  }

   /**
   * Get newPw
   * @return newPw
  **/
  @Schema(description = "")
  public String getNewPw() {
    return newPw;
  }

  public void setNewPw(String newPw) {
    this.newPw = newPw;
  }

  public UpdateUserPassword resetPassword(Boolean resetPassword) {
    this.resetPassword = resetPassword;
    return this;
  }

   /**
   * Get resetPassword
   * @return resetPassword
  **/
  @Schema(description = "")
  public Boolean isResetPassword() {
    return resetPassword;
  }

  public void setResetPassword(Boolean resetPassword) {
    this.resetPassword = resetPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserPassword updateUserPassword = (UpdateUserPassword) o;
    return Objects.equals(this.id, updateUserPassword.id) &&
        Objects.equals(this.newPw, updateUserPassword.newPw) &&
        Objects.equals(this.resetPassword, updateUserPassword.resetPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newPw, resetPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserPassword {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newPw: ").append(toIndentedString(newPw)).append("\n");
    sb.append("    resetPassword: ").append(toIndentedString(resetPassword)).append("\n");
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
