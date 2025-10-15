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
import embyclient.model.SessionPartyInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SessionPartyInfoResult
 */


public class SessionPartyInfoResult {
  @SerializedName("PartyInfo")
  private SessionPartyInfo partyInfo = null;

  public SessionPartyInfoResult partyInfo(SessionPartyInfo partyInfo) {
    this.partyInfo = partyInfo;
    return this;
  }

   /**
   * Get partyInfo
   * @return partyInfo
  **/
  @Schema(description = "")
  public SessionPartyInfo getPartyInfo() {
    return partyInfo;
  }

  public void setPartyInfo(SessionPartyInfo partyInfo) {
    this.partyInfo = partyInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionPartyInfoResult sessionPartyInfoResult = (SessionPartyInfoResult) o;
    return Objects.equals(this.partyInfo, sessionPartyInfoResult.partyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionPartyInfoResult {\n");
    
    sb.append("    partyInfo: ").append(toIndentedString(partyInfo)).append("\n");
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
