/*
 * Emby REST API
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
import java.util.ArrayList;
import java.util.List;
/**
 * UsersPinRedeemResult
 */


public class UsersPinRedeemResult {
  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("UsersReset")
  private List<String> usersReset = null;

  public UsersPinRedeemResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public UsersPinRedeemResult usersReset(List<String> usersReset) {
    this.usersReset = usersReset;
    return this;
  }

  public UsersPinRedeemResult addUsersResetItem(String usersResetItem) {
    if (this.usersReset == null) {
      this.usersReset = new ArrayList<String>();
    }
    this.usersReset.add(usersResetItem);
    return this;
  }

   /**
   * Get usersReset
   * @return usersReset
  **/
  @Schema(description = "")
  public List<String> getUsersReset() {
    return usersReset;
  }

  public void setUsersReset(List<String> usersReset) {
    this.usersReset = usersReset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPinRedeemResult usersPinRedeemResult = (UsersPinRedeemResult) o;
    return Objects.equals(this.success, usersPinRedeemResult.success) &&
        Objects.equals(this.usersReset, usersPinRedeemResult.usersReset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, usersReset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPinRedeemResult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    usersReset: ").append(toIndentedString(usersReset)).append("\n");
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
