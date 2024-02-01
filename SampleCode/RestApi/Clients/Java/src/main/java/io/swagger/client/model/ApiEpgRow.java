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
import io.swagger.client.model.BaseItemDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApiEpgRow
 */


public class ApiEpgRow {
  @SerializedName("Channel")
  private BaseItemDto channel = null;

  @SerializedName("Programs")
  private List<BaseItemDto> programs = null;

  public ApiEpgRow channel(BaseItemDto channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @Schema(description = "")
  public BaseItemDto getChannel() {
    return channel;
  }

  public void setChannel(BaseItemDto channel) {
    this.channel = channel;
  }

  public ApiEpgRow programs(List<BaseItemDto> programs) {
    this.programs = programs;
    return this;
  }

  public ApiEpgRow addProgramsItem(BaseItemDto programsItem) {
    if (this.programs == null) {
      this.programs = new ArrayList<BaseItemDto>();
    }
    this.programs.add(programsItem);
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  @Schema(description = "")
  public List<BaseItemDto> getPrograms() {
    return programs;
  }

  public void setPrograms(List<BaseItemDto> programs) {
    this.programs = programs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiEpgRow apiEpgRow = (ApiEpgRow) o;
    return Objects.equals(this.channel, apiEpgRow.channel) &&
        Objects.equals(this.programs, apiEpgRow.programs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, programs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiEpgRow {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
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
