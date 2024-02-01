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
 * Class SessionUserInfo.  
 */
@Schema(description = "Class SessionUserInfo.  ")

public class SessionUserInfo {
  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("UserInternalId")
  private Long userInternalId = null;

  public SessionUserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user identifier.
   * @return userId
  **/
  @Schema(description = "The user identifier.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SessionUserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The name of the user.
   * @return userName
  **/
  @Schema(description = "The name of the user.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SessionUserInfo userInternalId(Long userInternalId) {
    this.userInternalId = userInternalId;
    return this;
  }

   /**
   * Get userInternalId
   * @return userInternalId
  **/
  @Schema(description = "")
  public Long getUserInternalId() {
    return userInternalId;
  }

  public void setUserInternalId(Long userInternalId) {
    this.userInternalId = userInternalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionUserInfo sessionUserInfo = (SessionUserInfo) o;
    return Objects.equals(this.userId, sessionUserInfo.userId) &&
        Objects.equals(this.userName, sessionUserInfo.userName) &&
        Objects.equals(this.userInternalId, sessionUserInfo.userInternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userInternalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionUserInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userInternalId: ").append(toIndentedString(userInternalId)).append("\n");
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
