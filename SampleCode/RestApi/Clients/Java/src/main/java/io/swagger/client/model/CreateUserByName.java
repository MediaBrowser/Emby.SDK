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
import io.swagger.client.model.LibraryUserCopyOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CreateUserByName
 */


public class CreateUserByName {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("CopyFromUserId")
  private String copyFromUserId = null;

  @SerializedName("UserCopyOptions")
  private List<LibraryUserCopyOptions> userCopyOptions = null;

  public CreateUserByName name(String name) {
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

  public CreateUserByName copyFromUserId(String copyFromUserId) {
    this.copyFromUserId = copyFromUserId;
    return this;
  }

   /**
   * Get copyFromUserId
   * @return copyFromUserId
  **/
  @Schema(description = "")
  public String getCopyFromUserId() {
    return copyFromUserId;
  }

  public void setCopyFromUserId(String copyFromUserId) {
    this.copyFromUserId = copyFromUserId;
  }

  public CreateUserByName userCopyOptions(List<LibraryUserCopyOptions> userCopyOptions) {
    this.userCopyOptions = userCopyOptions;
    return this;
  }

  public CreateUserByName addUserCopyOptionsItem(LibraryUserCopyOptions userCopyOptionsItem) {
    if (this.userCopyOptions == null) {
      this.userCopyOptions = new ArrayList<LibraryUserCopyOptions>();
    }
    this.userCopyOptions.add(userCopyOptionsItem);
    return this;
  }

   /**
   * Get userCopyOptions
   * @return userCopyOptions
  **/
  @Schema(description = "")
  public List<LibraryUserCopyOptions> getUserCopyOptions() {
    return userCopyOptions;
  }

  public void setUserCopyOptions(List<LibraryUserCopyOptions> userCopyOptions) {
    this.userCopyOptions = userCopyOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserByName createUserByName = (CreateUserByName) o;
    return Objects.equals(this.name, createUserByName.name) &&
        Objects.equals(this.copyFromUserId, createUserByName.copyFromUserId) &&
        Objects.equals(this.userCopyOptions, createUserByName.userCopyOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, copyFromUserId, userCopyOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserByName {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    copyFromUserId: ").append(toIndentedString(copyFromUserId)).append("\n");
    sb.append("    userCopyOptions: ").append(toIndentedString(userCopyOptions)).append("\n");
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
