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
import io.swagger.client.model.MBBackupApiUserRestoreInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MBBackupApiDataRestoreOptions
 */


public class MBBackupApiDataRestoreOptions {
  @SerializedName("Users")
  private List<MBBackupApiUserRestoreInfo> users = null;

  public MBBackupApiDataRestoreOptions users(List<MBBackupApiUserRestoreInfo> users) {
    this.users = users;
    return this;
  }

  public MBBackupApiDataRestoreOptions addUsersItem(MBBackupApiUserRestoreInfo usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<MBBackupApiUserRestoreInfo>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public List<MBBackupApiUserRestoreInfo> getUsers() {
    return users;
  }

  public void setUsers(List<MBBackupApiUserRestoreInfo> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MBBackupApiDataRestoreOptions mbBackupApiDataRestoreOptions = (MBBackupApiDataRestoreOptions) o;
    return Objects.equals(this.users, mbBackupApiDataRestoreOptions.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MBBackupApiDataRestoreOptions {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
