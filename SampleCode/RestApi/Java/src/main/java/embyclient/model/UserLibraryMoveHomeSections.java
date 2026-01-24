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
import java.util.ArrayList;
import java.util.List;
/**
 * UserLibraryMoveHomeSections
 */


public class UserLibraryMoveHomeSections {
  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("NewIndex")
  private Integer newIndex = null;

  public UserLibraryMoveHomeSections ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public UserLibraryMoveHomeSections addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @Schema(description = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public UserLibraryMoveHomeSections newIndex(Integer newIndex) {
    this.newIndex = newIndex;
    return this;
  }

   /**
   * Get newIndex
   * @return newIndex
  **/
  @Schema(description = "")
  public Integer getNewIndex() {
    return newIndex;
  }

  public void setNewIndex(Integer newIndex) {
    this.newIndex = newIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibraryMoveHomeSections userLibraryMoveHomeSections = (UserLibraryMoveHomeSections) o;
    return Objects.equals(this.ids, userLibraryMoveHomeSections.ids) &&
        Objects.equals(this.newIndex, userLibraryMoveHomeSections.newIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, newIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibraryMoveHomeSections {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    newIndex: ").append(toIndentedString(newIndex)).append("\n");
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
