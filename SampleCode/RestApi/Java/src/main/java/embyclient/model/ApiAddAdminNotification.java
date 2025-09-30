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
 * ApiAddAdminNotification
 */


public class ApiAddAdminNotification {
  @SerializedName("DisplayDateTime")
  private Boolean displayDateTime = null;

  public ApiAddAdminNotification displayDateTime(Boolean displayDateTime) {
    this.displayDateTime = displayDateTime;
    return this;
  }

   /**
   * Get displayDateTime
   * @return displayDateTime
  **/
  @Schema(description = "")
  public Boolean isDisplayDateTime() {
    return displayDateTime;
  }

  public void setDisplayDateTime(Boolean displayDateTime) {
    this.displayDateTime = displayDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAddAdminNotification apiAddAdminNotification = (ApiAddAdminNotification) o;
    return Objects.equals(this.displayDateTime, apiAddAdminNotification.displayDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAddAdminNotification {\n");
    
    sb.append("    displayDateTime: ").append(toIndentedString(displayDateTime)).append("\n");
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
