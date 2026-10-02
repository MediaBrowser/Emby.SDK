/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.UserDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SessionPartySessionInfo
 */


public class SessionPartySessionInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("User")
  private UserDto user = null;

  @SerializedName("IsHost")
  private Boolean isHost = null;

  public SessionPartySessionInfo id(String id) {
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

  public SessionPartySessionInfo user(UserDto user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  public SessionPartySessionInfo isHost(Boolean isHost) {
    this.isHost = isHost;
    return this;
  }

   /**
   * Get isHost
   * @return isHost
  **/
  @Schema(description = "")
  public Boolean isIsHost() {
    return isHost;
  }

  public void setIsHost(Boolean isHost) {
    this.isHost = isHost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionPartySessionInfo sessionPartySessionInfo = (SessionPartySessionInfo) o;
    return Objects.equals(this.id, sessionPartySessionInfo.id) &&
        Objects.equals(this.user, sessionPartySessionInfo.user) &&
        Objects.equals(this.isHost, sessionPartySessionInfo.isHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, isHost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionPartySessionInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isHost: ").append(toIndentedString(isHost)).append("\n");
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
