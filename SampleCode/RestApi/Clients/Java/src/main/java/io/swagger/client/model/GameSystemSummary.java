/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
 */

package io.swagger.client.model;

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
 * GameSystemSummary
 */


public class GameSystemSummary {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("GameCount")
  private Integer gameCount = null;

  @SerializedName("GameFileExtensions")
  private List<String> gameFileExtensions = null;

  @SerializedName("ClientInstalledGameCount")
  private Integer clientInstalledGameCount = null;

  public GameSystemSummary name(String name) {
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

  public GameSystemSummary displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GameSystemSummary gameCount(Integer gameCount) {
    this.gameCount = gameCount;
    return this;
  }

   /**
   * Get gameCount
   * @return gameCount
  **/
  @Schema(description = "")
  public Integer getGameCount() {
    return gameCount;
  }

  public void setGameCount(Integer gameCount) {
    this.gameCount = gameCount;
  }

  public GameSystemSummary gameFileExtensions(List<String> gameFileExtensions) {
    this.gameFileExtensions = gameFileExtensions;
    return this;
  }

  public GameSystemSummary addGameFileExtensionsItem(String gameFileExtensionsItem) {
    if (this.gameFileExtensions == null) {
      this.gameFileExtensions = new ArrayList<String>();
    }
    this.gameFileExtensions.add(gameFileExtensionsItem);
    return this;
  }

   /**
   * Get gameFileExtensions
   * @return gameFileExtensions
  **/
  @Schema(description = "")
  public List<String> getGameFileExtensions() {
    return gameFileExtensions;
  }

  public void setGameFileExtensions(List<String> gameFileExtensions) {
    this.gameFileExtensions = gameFileExtensions;
  }

  public GameSystemSummary clientInstalledGameCount(Integer clientInstalledGameCount) {
    this.clientInstalledGameCount = clientInstalledGameCount;
    return this;
  }

   /**
   * Get clientInstalledGameCount
   * @return clientInstalledGameCount
  **/
  @Schema(description = "")
  public Integer getClientInstalledGameCount() {
    return clientInstalledGameCount;
  }

  public void setClientInstalledGameCount(Integer clientInstalledGameCount) {
    this.clientInstalledGameCount = clientInstalledGameCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameSystemSummary gameSystemSummary = (GameSystemSummary) o;
    return Objects.equals(this.name, gameSystemSummary.name) &&
        Objects.equals(this.displayName, gameSystemSummary.displayName) &&
        Objects.equals(this.gameCount, gameSystemSummary.gameCount) &&
        Objects.equals(this.gameFileExtensions, gameSystemSummary.gameFileExtensions) &&
        Objects.equals(this.clientInstalledGameCount, gameSystemSummary.clientInstalledGameCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, gameCount, gameFileExtensions, clientInstalledGameCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameSystemSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gameCount: ").append(toIndentedString(gameCount)).append("\n");
    sb.append("    gameFileExtensions: ").append(toIndentedString(gameFileExtensions)).append("\n");
    sb.append("    clientInstalledGameCount: ").append(toIndentedString(clientInstalledGameCount)).append("\n");
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
