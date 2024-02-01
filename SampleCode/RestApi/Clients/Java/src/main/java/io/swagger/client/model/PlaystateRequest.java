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
import io.swagger.client.model.PlaystateCommand;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PlaystateRequest
 */


public class PlaystateRequest {
  @SerializedName("Command")
  private PlaystateCommand command = null;

  @SerializedName("SeekPositionTicks")
  private Long seekPositionTicks = null;

  @SerializedName("ControllingUserId")
  private String controllingUserId = null;

  public PlaystateRequest command(PlaystateCommand command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @Schema(description = "")
  public PlaystateCommand getCommand() {
    return command;
  }

  public void setCommand(PlaystateCommand command) {
    this.command = command;
  }

  public PlaystateRequest seekPositionTicks(Long seekPositionTicks) {
    this.seekPositionTicks = seekPositionTicks;
    return this;
  }

   /**
   * Get seekPositionTicks
   * @return seekPositionTicks
  **/
  @Schema(description = "")
  public Long getSeekPositionTicks() {
    return seekPositionTicks;
  }

  public void setSeekPositionTicks(Long seekPositionTicks) {
    this.seekPositionTicks = seekPositionTicks;
  }

  public PlaystateRequest controllingUserId(String controllingUserId) {
    this.controllingUserId = controllingUserId;
    return this;
  }

   /**
   * The controlling user identifier.
   * @return controllingUserId
  **/
  @Schema(description = "The controlling user identifier.")
  public String getControllingUserId() {
    return controllingUserId;
  }

  public void setControllingUserId(String controllingUserId) {
    this.controllingUserId = controllingUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaystateRequest playstateRequest = (PlaystateRequest) o;
    return Objects.equals(this.command, playstateRequest.command) &&
        Objects.equals(this.seekPositionTicks, playstateRequest.seekPositionTicks) &&
        Objects.equals(this.controllingUserId, playstateRequest.controllingUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, seekPositionTicks, controllingUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaystateRequest {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    seekPositionTicks: ").append(toIndentedString(seekPositionTicks)).append("\n");
    sb.append("    controllingUserId: ").append(toIndentedString(controllingUserId)).append("\n");
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
