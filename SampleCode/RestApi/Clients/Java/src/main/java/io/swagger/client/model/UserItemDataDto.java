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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Class UserItemDataDto  
 */
@Schema(description = "Class UserItemDataDto  ")

public class UserItemDataDto {
  @SerializedName("Rating")
  private Double rating = null;

  @SerializedName("PlayedPercentage")
  private Double playedPercentage = null;

  @SerializedName("UnplayedItemCount")
  private Integer unplayedItemCount = null;

  @SerializedName("PlaybackPositionTicks")
  private Long playbackPositionTicks = null;

  @SerializedName("PlayCount")
  private Integer playCount = null;

  @SerializedName("IsFavorite")
  private Boolean isFavorite = null;

  @SerializedName("LastPlayedDate")
  private OffsetDateTime lastPlayedDate = null;

  @SerializedName("Played")
  private Boolean played = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("ServerId")
  private String serverId = null;

  public UserItemDataDto rating(Double rating) {
    this.rating = rating;
    return this;
  }

   /**
   * The rating.
   * @return rating
  **/
  @Schema(description = "The rating.")
  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public UserItemDataDto playedPercentage(Double playedPercentage) {
    this.playedPercentage = playedPercentage;
    return this;
  }

   /**
   * The played percentage.
   * @return playedPercentage
  **/
  @Schema(description = "The played percentage.")
  public Double getPlayedPercentage() {
    return playedPercentage;
  }

  public void setPlayedPercentage(Double playedPercentage) {
    this.playedPercentage = playedPercentage;
  }

  public UserItemDataDto unplayedItemCount(Integer unplayedItemCount) {
    this.unplayedItemCount = unplayedItemCount;
    return this;
  }

   /**
   * The unplayed item count.
   * @return unplayedItemCount
  **/
  @Schema(description = "The unplayed item count.")
  public Integer getUnplayedItemCount() {
    return unplayedItemCount;
  }

  public void setUnplayedItemCount(Integer unplayedItemCount) {
    this.unplayedItemCount = unplayedItemCount;
  }

  public UserItemDataDto playbackPositionTicks(Long playbackPositionTicks) {
    this.playbackPositionTicks = playbackPositionTicks;
    return this;
  }

   /**
   * The playback position ticks.
   * @return playbackPositionTicks
  **/
  @Schema(description = "The playback position ticks.")
  public Long getPlaybackPositionTicks() {
    return playbackPositionTicks;
  }

  public void setPlaybackPositionTicks(Long playbackPositionTicks) {
    this.playbackPositionTicks = playbackPositionTicks;
  }

  public UserItemDataDto playCount(Integer playCount) {
    this.playCount = playCount;
    return this;
  }

   /**
   * The play count.
   * @return playCount
  **/
  @Schema(description = "The play count.")
  public Integer getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Integer playCount) {
    this.playCount = playCount;
  }

  public UserItemDataDto isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * A value indicating whether this instance is favorite.
   * @return isFavorite
  **/
  @Schema(description = "A value indicating whether this instance is favorite.")
  public Boolean isIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public UserItemDataDto lastPlayedDate(OffsetDateTime lastPlayedDate) {
    this.lastPlayedDate = lastPlayedDate;
    return this;
  }

   /**
   * The last played date.
   * @return lastPlayedDate
  **/
  @Schema(description = "The last played date.")
  public OffsetDateTime getLastPlayedDate() {
    return lastPlayedDate;
  }

  public void setLastPlayedDate(OffsetDateTime lastPlayedDate) {
    this.lastPlayedDate = lastPlayedDate;
  }

  public UserItemDataDto played(Boolean played) {
    this.played = played;
    return this;
  }

   /**
   * A value indicating whether this &#x60;MediaBrowser.Model.Dto.UserItemDataDto&#x60; is played.
   * @return played
  **/
  @Schema(description = "A value indicating whether this `MediaBrowser.Model.Dto.UserItemDataDto` is played.")
  public Boolean isPlayed() {
    return played;
  }

  public void setPlayed(Boolean played) {
    this.played = played;
  }

  public UserItemDataDto key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key.
   * @return key
  **/
  @Schema(description = "The key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserItemDataDto itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The item identifier.
   * @return itemId
  **/
  @Schema(description = "The item identifier.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public UserItemDataDto serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Used only by our Windows app. Not used by Emby Server.
   * @return serverId
  **/
  @Schema(description = "Used only by our Windows app. Not used by Emby Server.")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserItemDataDto userItemDataDto = (UserItemDataDto) o;
    return Objects.equals(this.rating, userItemDataDto.rating) &&
        Objects.equals(this.playedPercentage, userItemDataDto.playedPercentage) &&
        Objects.equals(this.unplayedItemCount, userItemDataDto.unplayedItemCount) &&
        Objects.equals(this.playbackPositionTicks, userItemDataDto.playbackPositionTicks) &&
        Objects.equals(this.playCount, userItemDataDto.playCount) &&
        Objects.equals(this.isFavorite, userItemDataDto.isFavorite) &&
        Objects.equals(this.lastPlayedDate, userItemDataDto.lastPlayedDate) &&
        Objects.equals(this.played, userItemDataDto.played) &&
        Objects.equals(this.key, userItemDataDto.key) &&
        Objects.equals(this.itemId, userItemDataDto.itemId) &&
        Objects.equals(this.serverId, userItemDataDto.serverId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, playedPercentage, unplayedItemCount, playbackPositionTicks, playCount, isFavorite, lastPlayedDate, played, key, itemId, serverId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserItemDataDto {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    playedPercentage: ").append(toIndentedString(playedPercentage)).append("\n");
    sb.append("    unplayedItemCount: ").append(toIndentedString(unplayedItemCount)).append("\n");
    sb.append("    playbackPositionTicks: ").append(toIndentedString(playbackPositionTicks)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    lastPlayedDate: ").append(toIndentedString(lastPlayedDate)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
