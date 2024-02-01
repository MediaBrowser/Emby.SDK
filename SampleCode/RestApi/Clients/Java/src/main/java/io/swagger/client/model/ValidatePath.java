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
 * ValidatePath
 */


public class ValidatePath {
  @SerializedName("ValidateWriteable")
  private Boolean validateWriteable = null;

  @SerializedName("IsFile")
  private Boolean isFile = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("Password")
  private String password = null;

  public ValidatePath validateWriteable(Boolean validateWriteable) {
    this.validateWriteable = validateWriteable;
    return this;
  }

   /**
   * Get validateWriteable
   * @return validateWriteable
  **/
  @Schema(description = "")
  public Boolean isValidateWriteable() {
    return validateWriteable;
  }

  public void setValidateWriteable(Boolean validateWriteable) {
    this.validateWriteable = validateWriteable;
  }

  public ValidatePath isFile(Boolean isFile) {
    this.isFile = isFile;
    return this;
  }

   /**
   * Get isFile
   * @return isFile
  **/
  @Schema(description = "")
  public Boolean isIsFile() {
    return isFile;
  }

  public void setIsFile(Boolean isFile) {
    this.isFile = isFile;
  }

  public ValidatePath username(String username) {
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

  public ValidatePath password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatePath validatePath = (ValidatePath) o;
    return Objects.equals(this.validateWriteable, validatePath.validateWriteable) &&
        Objects.equals(this.isFile, validatePath.isFile) &&
        Objects.equals(this.username, validatePath.username) &&
        Objects.equals(this.password, validatePath.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validateWriteable, isFile, username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePath {\n");
    
    sb.append("    validateWriteable: ").append(toIndentedString(validateWriteable)).append("\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
