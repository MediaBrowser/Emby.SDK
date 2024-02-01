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
import io.swagger.client.model.UserActionType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * UserAction
 */


public class UserAction {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("Type")
  private UserActionType type = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("PositionTicks")
  private Long positionTicks = null;

  @SerializedName("Played")
  private Boolean played = null;

  @SerializedName("IsFavorite")
  private Boolean isFavorite = null;

  public UserAction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserAction serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public UserAction userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserAction itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public UserAction type(UserActionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public UserActionType getType() {
    return type;
  }

  public void setType(UserActionType type) {
    this.type = type;
  }

  public UserAction date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public UserAction positionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
    return this;
  }

   /**
   * Get positionTicks
   * @return positionTicks
  **/
  @Schema(description = "")
  public Long getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
  }

  public UserAction played(Boolean played) {
    this.played = played;
    return this;
  }

   /**
   * Get played
   * @return played
  **/
  @Schema(description = "")
  public Boolean isPlayed() {
    return played;
  }

  public void setPlayed(Boolean played) {
    this.played = played;
  }

  public UserAction isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Get isFavorite
   * @return isFavorite
  **/
  @Schema(description = "")
  public Boolean isIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAction userAction = (UserAction) o;
    return Objects.equals(this.id, userAction.id) &&
        Objects.equals(this.serverId, userAction.serverId) &&
        Objects.equals(this.userId, userAction.userId) &&
        Objects.equals(this.itemId, userAction.itemId) &&
        Objects.equals(this.type, userAction.type) &&
        Objects.equals(this.date, userAction.date) &&
        Objects.equals(this.positionTicks, userAction.positionTicks) &&
        Objects.equals(this.played, userAction.played) &&
        Objects.equals(this.isFavorite, userAction.isFavorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serverId, userId, itemId, type, date, positionTicks, played, isFavorite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
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
