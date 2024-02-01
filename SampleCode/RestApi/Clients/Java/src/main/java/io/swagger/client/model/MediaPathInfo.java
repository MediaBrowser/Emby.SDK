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
 * MediaPathInfo
 */


public class MediaPathInfo {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("NetworkPath")
  private String networkPath = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("Password")
  private String password = null;

  public MediaPathInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MediaPathInfo networkPath(String networkPath) {
    this.networkPath = networkPath;
    return this;
  }

   /**
   * Get networkPath
   * @return networkPath
  **/
  @Schema(description = "")
  public String getNetworkPath() {
    return networkPath;
  }

  public void setNetworkPath(String networkPath) {
    this.networkPath = networkPath;
  }

  public MediaPathInfo username(String username) {
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

  public MediaPathInfo password(String password) {
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
    MediaPathInfo mediaPathInfo = (MediaPathInfo) o;
    return Objects.equals(this.path, mediaPathInfo.path) &&
        Objects.equals(this.networkPath, mediaPathInfo.networkPath) &&
        Objects.equals(this.username, mediaPathInfo.username) &&
        Objects.equals(this.password, mediaPathInfo.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, networkPath, username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaPathInfo {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    networkPath: ").append(toIndentedString(networkPath)).append("\n");
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
