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
import io.swagger.client.model.DlnaProfilesHeaderMatchType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DlnaProfilesHttpHeaderInfo
 */


public class DlnaProfilesHttpHeaderInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("Match")
  private DlnaProfilesHeaderMatchType match = null;

  public DlnaProfilesHttpHeaderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DlnaProfilesHttpHeaderInfo value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DlnaProfilesHttpHeaderInfo match(DlnaProfilesHeaderMatchType match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(description = "")
  public DlnaProfilesHeaderMatchType getMatch() {
    return match;
  }

  public void setMatch(DlnaProfilesHeaderMatchType match) {
    this.match = match;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlnaProfilesHttpHeaderInfo dlnaProfilesHttpHeaderInfo = (DlnaProfilesHttpHeaderInfo) o;
    return Objects.equals(this.name, dlnaProfilesHttpHeaderInfo.name) &&
        Objects.equals(this.value, dlnaProfilesHttpHeaderInfo.value) &&
        Objects.equals(this.match, dlnaProfilesHttpHeaderInfo.match);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, match);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaProfilesHttpHeaderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
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
