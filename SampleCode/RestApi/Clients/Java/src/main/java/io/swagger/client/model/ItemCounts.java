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
/**
 * Class LibrarySummary  
 */
@Schema(description = "Class LibrarySummary  ")

public class ItemCounts {
  @SerializedName("MovieCount")
  private Integer movieCount = null;

  @SerializedName("SeriesCount")
  private Integer seriesCount = null;

  @SerializedName("EpisodeCount")
  private Integer episodeCount = null;

  @SerializedName("GameCount")
  private Integer gameCount = null;

  @SerializedName("ArtistCount")
  private Integer artistCount = null;

  @SerializedName("ProgramCount")
  private Integer programCount = null;

  @SerializedName("GameSystemCount")
  private Integer gameSystemCount = null;

  @SerializedName("TrailerCount")
  private Integer trailerCount = null;

  @SerializedName("SongCount")
  private Integer songCount = null;

  @SerializedName("AlbumCount")
  private Integer albumCount = null;

  @SerializedName("MusicVideoCount")
  private Integer musicVideoCount = null;

  @SerializedName("BoxSetCount")
  private Integer boxSetCount = null;

  @SerializedName("BookCount")
  private Integer bookCount = null;

  @SerializedName("ItemCount")
  private Integer itemCount = null;

  public ItemCounts movieCount(Integer movieCount) {
    this.movieCount = movieCount;
    return this;
  }

   /**
   * The movie count.
   * @return movieCount
  **/
  @Schema(description = "The movie count.")
  public Integer getMovieCount() {
    return movieCount;
  }

  public void setMovieCount(Integer movieCount) {
    this.movieCount = movieCount;
  }

  public ItemCounts seriesCount(Integer seriesCount) {
    this.seriesCount = seriesCount;
    return this;
  }

   /**
   * The series count.
   * @return seriesCount
  **/
  @Schema(description = "The series count.")
  public Integer getSeriesCount() {
    return seriesCount;
  }

  public void setSeriesCount(Integer seriesCount) {
    this.seriesCount = seriesCount;
  }

  public ItemCounts episodeCount(Integer episodeCount) {
    this.episodeCount = episodeCount;
    return this;
  }

   /**
   * The episode count.
   * @return episodeCount
  **/
  @Schema(description = "The episode count.")
  public Integer getEpisodeCount() {
    return episodeCount;
  }

  public void setEpisodeCount(Integer episodeCount) {
    this.episodeCount = episodeCount;
  }

  public ItemCounts gameCount(Integer gameCount) {
    this.gameCount = gameCount;
    return this;
  }

   /**
   * The game count.
   * @return gameCount
  **/
  @Schema(description = "The game count.")
  public Integer getGameCount() {
    return gameCount;
  }

  public void setGameCount(Integer gameCount) {
    this.gameCount = gameCount;
  }

  public ItemCounts artistCount(Integer artistCount) {
    this.artistCount = artistCount;
    return this;
  }

   /**
   * Get artistCount
   * @return artistCount
  **/
  @Schema(description = "")
  public Integer getArtistCount() {
    return artistCount;
  }

  public void setArtistCount(Integer artistCount) {
    this.artistCount = artistCount;
  }

  public ItemCounts programCount(Integer programCount) {
    this.programCount = programCount;
    return this;
  }

   /**
   * Get programCount
   * @return programCount
  **/
  @Schema(description = "")
  public Integer getProgramCount() {
    return programCount;
  }

  public void setProgramCount(Integer programCount) {
    this.programCount = programCount;
  }

  public ItemCounts gameSystemCount(Integer gameSystemCount) {
    this.gameSystemCount = gameSystemCount;
    return this;
  }

   /**
   * The game system count.
   * @return gameSystemCount
  **/
  @Schema(description = "The game system count.")
  public Integer getGameSystemCount() {
    return gameSystemCount;
  }

  public void setGameSystemCount(Integer gameSystemCount) {
    this.gameSystemCount = gameSystemCount;
  }

  public ItemCounts trailerCount(Integer trailerCount) {
    this.trailerCount = trailerCount;
    return this;
  }

   /**
   * The trailer count.
   * @return trailerCount
  **/
  @Schema(description = "The trailer count.")
  public Integer getTrailerCount() {
    return trailerCount;
  }

  public void setTrailerCount(Integer trailerCount) {
    this.trailerCount = trailerCount;
  }

  public ItemCounts songCount(Integer songCount) {
    this.songCount = songCount;
    return this;
  }

   /**
   * The song count.
   * @return songCount
  **/
  @Schema(description = "The song count.")
  public Integer getSongCount() {
    return songCount;
  }

  public void setSongCount(Integer songCount) {
    this.songCount = songCount;
  }

  public ItemCounts albumCount(Integer albumCount) {
    this.albumCount = albumCount;
    return this;
  }

   /**
   * The album count.
   * @return albumCount
  **/
  @Schema(description = "The album count.")
  public Integer getAlbumCount() {
    return albumCount;
  }

  public void setAlbumCount(Integer albumCount) {
    this.albumCount = albumCount;
  }

  public ItemCounts musicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
    return this;
  }

   /**
   * The music video count.
   * @return musicVideoCount
  **/
  @Schema(description = "The music video count.")
  public Integer getMusicVideoCount() {
    return musicVideoCount;
  }

  public void setMusicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
  }

  public ItemCounts boxSetCount(Integer boxSetCount) {
    this.boxSetCount = boxSetCount;
    return this;
  }

   /**
   * The box set count.
   * @return boxSetCount
  **/
  @Schema(description = "The box set count.")
  public Integer getBoxSetCount() {
    return boxSetCount;
  }

  public void setBoxSetCount(Integer boxSetCount) {
    this.boxSetCount = boxSetCount;
  }

  public ItemCounts bookCount(Integer bookCount) {
    this.bookCount = bookCount;
    return this;
  }

   /**
   * The book count.
   * @return bookCount
  **/
  @Schema(description = "The book count.")
  public Integer getBookCount() {
    return bookCount;
  }

  public void setBookCount(Integer bookCount) {
    this.bookCount = bookCount;
  }

  public ItemCounts itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @Schema(description = "")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCounts itemCounts = (ItemCounts) o;
    return Objects.equals(this.movieCount, itemCounts.movieCount) &&
        Objects.equals(this.seriesCount, itemCounts.seriesCount) &&
        Objects.equals(this.episodeCount, itemCounts.episodeCount) &&
        Objects.equals(this.gameCount, itemCounts.gameCount) &&
        Objects.equals(this.artistCount, itemCounts.artistCount) &&
        Objects.equals(this.programCount, itemCounts.programCount) &&
        Objects.equals(this.gameSystemCount, itemCounts.gameSystemCount) &&
        Objects.equals(this.trailerCount, itemCounts.trailerCount) &&
        Objects.equals(this.songCount, itemCounts.songCount) &&
        Objects.equals(this.albumCount, itemCounts.albumCount) &&
        Objects.equals(this.musicVideoCount, itemCounts.musicVideoCount) &&
        Objects.equals(this.boxSetCount, itemCounts.boxSetCount) &&
        Objects.equals(this.bookCount, itemCounts.bookCount) &&
        Objects.equals(this.itemCount, itemCounts.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieCount, seriesCount, episodeCount, gameCount, artistCount, programCount, gameSystemCount, trailerCount, songCount, albumCount, musicVideoCount, boxSetCount, bookCount, itemCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCounts {\n");
    
    sb.append("    movieCount: ").append(toIndentedString(movieCount)).append("\n");
    sb.append("    seriesCount: ").append(toIndentedString(seriesCount)).append("\n");
    sb.append("    episodeCount: ").append(toIndentedString(episodeCount)).append("\n");
    sb.append("    gameCount: ").append(toIndentedString(gameCount)).append("\n");
    sb.append("    artistCount: ").append(toIndentedString(artistCount)).append("\n");
    sb.append("    programCount: ").append(toIndentedString(programCount)).append("\n");
    sb.append("    gameSystemCount: ").append(toIndentedString(gameSystemCount)).append("\n");
    sb.append("    trailerCount: ").append(toIndentedString(trailerCount)).append("\n");
    sb.append("    songCount: ").append(toIndentedString(songCount)).append("\n");
    sb.append("    albumCount: ").append(toIndentedString(albumCount)).append("\n");
    sb.append("    musicVideoCount: ").append(toIndentedString(musicVideoCount)).append("\n");
    sb.append("    boxSetCount: ").append(toIndentedString(boxSetCount)).append("\n");
    sb.append("    bookCount: ").append(toIndentedString(bookCount)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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
