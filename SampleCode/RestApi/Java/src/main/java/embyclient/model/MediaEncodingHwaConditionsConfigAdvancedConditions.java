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
 * MediaEncodingHwaConditionsConfigAdvancedConditions
 */


public class MediaEncodingHwaConditionsConfigAdvancedConditions {
  @SerializedName("FilterString")
  private String filterString = null;

  @SerializedName("DataFilterString")
  private String dataFilterString = null;

  public MediaEncodingHwaConditionsConfigAdvancedConditions filterString(String filterString) {
    this.filterString = filterString;
    return this;
  }

   /**
   * Get filterString
   * @return filterString
  **/
  @Schema(description = "")
  public String getFilterString() {
    return filterString;
  }

  public void setFilterString(String filterString) {
    this.filterString = filterString;
  }

  public MediaEncodingHwaConditionsConfigAdvancedConditions dataFilterString(String dataFilterString) {
    this.dataFilterString = dataFilterString;
    return this;
  }

   /**
   * Get dataFilterString
   * @return dataFilterString
  **/
  @Schema(description = "")
  public String getDataFilterString() {
    return dataFilterString;
  }

  public void setDataFilterString(String dataFilterString) {
    this.dataFilterString = dataFilterString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingHwaConditionsConfigAdvancedConditions mediaEncodingHwaConditionsConfigAdvancedConditions = (MediaEncodingHwaConditionsConfigAdvancedConditions) o;
    return Objects.equals(this.filterString, mediaEncodingHwaConditionsConfigAdvancedConditions.filterString) &&
        Objects.equals(this.dataFilterString, mediaEncodingHwaConditionsConfigAdvancedConditions.dataFilterString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterString, dataFilterString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingHwaConditionsConfigAdvancedConditions {\n");
    
    sb.append("    filterString: ").append(toIndentedString(filterString)).append("\n");
    sb.append("    dataFilterString: ").append(toIndentedString(dataFilterString)).append("\n");
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
