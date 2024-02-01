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
 * ConnectUserLinkResult
 */


public class ConnectUserLinkResult {
  @SerializedName("IsPending")
  private Boolean isPending = null;

  @SerializedName("IsNewUserInvitation")
  private Boolean isNewUserInvitation = null;

  @SerializedName("GuestDisplayName")
  private String guestDisplayName = null;

  public ConnectUserLinkResult isPending(Boolean isPending) {
    this.isPending = isPending;
    return this;
  }

   /**
   * Get isPending
   * @return isPending
  **/
  @Schema(description = "")
  public Boolean isIsPending() {
    return isPending;
  }

  public void setIsPending(Boolean isPending) {
    this.isPending = isPending;
  }

  public ConnectUserLinkResult isNewUserInvitation(Boolean isNewUserInvitation) {
    this.isNewUserInvitation = isNewUserInvitation;
    return this;
  }

   /**
   * Get isNewUserInvitation
   * @return isNewUserInvitation
  **/
  @Schema(description = "")
  public Boolean isIsNewUserInvitation() {
    return isNewUserInvitation;
  }

  public void setIsNewUserInvitation(Boolean isNewUserInvitation) {
    this.isNewUserInvitation = isNewUserInvitation;
  }

  public ConnectUserLinkResult guestDisplayName(String guestDisplayName) {
    this.guestDisplayName = guestDisplayName;
    return this;
  }

   /**
   * Get guestDisplayName
   * @return guestDisplayName
  **/
  @Schema(description = "")
  public String getGuestDisplayName() {
    return guestDisplayName;
  }

  public void setGuestDisplayName(String guestDisplayName) {
    this.guestDisplayName = guestDisplayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectUserLinkResult connectUserLinkResult = (ConnectUserLinkResult) o;
    return Objects.equals(this.isPending, connectUserLinkResult.isPending) &&
        Objects.equals(this.isNewUserInvitation, connectUserLinkResult.isNewUserInvitation) &&
        Objects.equals(this.guestDisplayName, connectUserLinkResult.guestDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPending, isNewUserInvitation, guestDisplayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectUserLinkResult {\n");
    
    sb.append("    isPending: ").append(toIndentedString(isPending)).append("\n");
    sb.append("    isNewUserInvitation: ").append(toIndentedString(isNewUserInvitation)).append("\n");
    sb.append("    guestDisplayName: ").append(toIndentedString(guestDisplayName)).append("\n");
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
