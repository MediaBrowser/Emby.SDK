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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SecurityAttestationReply
 */


public class SecurityAttestationReply {
  @SerializedName("type")
  private String type = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("appAttestation")
  private String appAttestation = null;

  public SecurityAttestationReply type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecurityAttestationReply requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public SecurityAttestationReply appAttestation(String appAttestation) {
    this.appAttestation = appAttestation;
    return this;
  }

   /**
   * Get appAttestation
   * @return appAttestation
  **/
  @Schema(description = "")
  public String getAppAttestation() {
    return appAttestation;
  }

  public void setAppAttestation(String appAttestation) {
    this.appAttestation = appAttestation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAttestationReply securityAttestationReply = (SecurityAttestationReply) o;
    return Objects.equals(this.type, securityAttestationReply.type) &&
        Objects.equals(this.requestId, securityAttestationReply.requestId) &&
        Objects.equals(this.appAttestation, securityAttestationReply.appAttestation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, requestId, appAttestation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAttestationReply {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    appAttestation: ").append(toIndentedString(appAttestation)).append("\n");
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
