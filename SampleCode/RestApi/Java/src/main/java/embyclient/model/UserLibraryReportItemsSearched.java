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
 * UserLibraryReportItemsSearched
 */


public class UserLibraryReportItemsSearched {
  @SerializedName("WasSearched")
  private Boolean wasSearched = null;

  public UserLibraryReportItemsSearched wasSearched(Boolean wasSearched) {
    this.wasSearched = wasSearched;
    return this;
  }

   /**
   * Get wasSearched
   * @return wasSearched
  **/
  @Schema(description = "")
  public Boolean isWasSearched() {
    return wasSearched;
  }

  public void setWasSearched(Boolean wasSearched) {
    this.wasSearched = wasSearched;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibraryReportItemsSearched userLibraryReportItemsSearched = (UserLibraryReportItemsSearched) o;
    return Objects.equals(this.wasSearched, userLibraryReportItemsSearched.wasSearched);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wasSearched);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibraryReportItemsSearched {\n");
    
    sb.append("    wasSearched: ").append(toIndentedString(wasSearched)).append("\n");
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
