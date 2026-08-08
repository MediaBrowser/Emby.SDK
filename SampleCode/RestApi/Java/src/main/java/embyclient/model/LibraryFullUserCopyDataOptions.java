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
import embyclient.model.NameIdPair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryFullUserCopyDataOptions
 */


public class LibraryFullUserCopyDataOptions {
  @SerializedName("DataOptions")
  private List<NameIdPair> dataOptions = null;

  public LibraryFullUserCopyDataOptions dataOptions(List<NameIdPair> dataOptions) {
    this.dataOptions = dataOptions;
    return this;
  }

  public LibraryFullUserCopyDataOptions addDataOptionsItem(NameIdPair dataOptionsItem) {
    if (this.dataOptions == null) {
      this.dataOptions = new ArrayList<>();
    }
    this.dataOptions.add(dataOptionsItem);
    return this;
  }

   /**
   * Get dataOptions
   * @return dataOptions
  **/
  @Schema(description = "")
  public List<NameIdPair> getDataOptions() {
    return dataOptions;
  }

  public void setDataOptions(List<NameIdPair> dataOptions) {
    this.dataOptions = dataOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryFullUserCopyDataOptions libraryFullUserCopyDataOptions = (LibraryFullUserCopyDataOptions) o;
    return Objects.equals(this.dataOptions, libraryFullUserCopyDataOptions.dataOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryFullUserCopyDataOptions {\n");
    
    sb.append("    dataOptions: ").append(toIndentedString(dataOptions)).append("\n");
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
