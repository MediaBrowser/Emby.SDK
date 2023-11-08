/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.LiveTVApiNameIdDescriptionPair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LiveTVApiAvailableRecordingOptions
 */


public class LiveTVApiAvailableRecordingOptions {
  @SerializedName("RecordingFolders")
  private List<LiveTVApiNameIdDescriptionPair> recordingFolders = null;

  @SerializedName("MovieRecordingFolders")
  private List<LiveTVApiNameIdDescriptionPair> movieRecordingFolders = null;

  @SerializedName("SeriesRecordingFolders")
  private List<LiveTVApiNameIdDescriptionPair> seriesRecordingFolders = null;

  public LiveTVApiAvailableRecordingOptions recordingFolders(List<LiveTVApiNameIdDescriptionPair> recordingFolders) {
    this.recordingFolders = recordingFolders;
    return this;
  }

  public LiveTVApiAvailableRecordingOptions addRecordingFoldersItem(LiveTVApiNameIdDescriptionPair recordingFoldersItem) {
    if (this.recordingFolders == null) {
      this.recordingFolders = new ArrayList<LiveTVApiNameIdDescriptionPair>();
    }
    this.recordingFolders.add(recordingFoldersItem);
    return this;
  }

   /**
   * Get recordingFolders
   * @return recordingFolders
  **/
  @Schema(description = "")
  public List<LiveTVApiNameIdDescriptionPair> getRecordingFolders() {
    return recordingFolders;
  }

  public void setRecordingFolders(List<LiveTVApiNameIdDescriptionPair> recordingFolders) {
    this.recordingFolders = recordingFolders;
  }

  public LiveTVApiAvailableRecordingOptions movieRecordingFolders(List<LiveTVApiNameIdDescriptionPair> movieRecordingFolders) {
    this.movieRecordingFolders = movieRecordingFolders;
    return this;
  }

  public LiveTVApiAvailableRecordingOptions addMovieRecordingFoldersItem(LiveTVApiNameIdDescriptionPair movieRecordingFoldersItem) {
    if (this.movieRecordingFolders == null) {
      this.movieRecordingFolders = new ArrayList<LiveTVApiNameIdDescriptionPair>();
    }
    this.movieRecordingFolders.add(movieRecordingFoldersItem);
    return this;
  }

   /**
   * Get movieRecordingFolders
   * @return movieRecordingFolders
  **/
  @Schema(description = "")
  public List<LiveTVApiNameIdDescriptionPair> getMovieRecordingFolders() {
    return movieRecordingFolders;
  }

  public void setMovieRecordingFolders(List<LiveTVApiNameIdDescriptionPair> movieRecordingFolders) {
    this.movieRecordingFolders = movieRecordingFolders;
  }

  public LiveTVApiAvailableRecordingOptions seriesRecordingFolders(List<LiveTVApiNameIdDescriptionPair> seriesRecordingFolders) {
    this.seriesRecordingFolders = seriesRecordingFolders;
    return this;
  }

  public LiveTVApiAvailableRecordingOptions addSeriesRecordingFoldersItem(LiveTVApiNameIdDescriptionPair seriesRecordingFoldersItem) {
    if (this.seriesRecordingFolders == null) {
      this.seriesRecordingFolders = new ArrayList<LiveTVApiNameIdDescriptionPair>();
    }
    this.seriesRecordingFolders.add(seriesRecordingFoldersItem);
    return this;
  }

   /**
   * Get seriesRecordingFolders
   * @return seriesRecordingFolders
  **/
  @Schema(description = "")
  public List<LiveTVApiNameIdDescriptionPair> getSeriesRecordingFolders() {
    return seriesRecordingFolders;
  }

  public void setSeriesRecordingFolders(List<LiveTVApiNameIdDescriptionPair> seriesRecordingFolders) {
    this.seriesRecordingFolders = seriesRecordingFolders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTVApiAvailableRecordingOptions liveTVApiAvailableRecordingOptions = (LiveTVApiAvailableRecordingOptions) o;
    return Objects.equals(this.recordingFolders, liveTVApiAvailableRecordingOptions.recordingFolders) &&
        Objects.equals(this.movieRecordingFolders, liveTVApiAvailableRecordingOptions.movieRecordingFolders) &&
        Objects.equals(this.seriesRecordingFolders, liveTVApiAvailableRecordingOptions.seriesRecordingFolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingFolders, movieRecordingFolders, seriesRecordingFolders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTVApiAvailableRecordingOptions {\n");
    
    sb.append("    recordingFolders: ").append(toIndentedString(recordingFolders)).append("\n");
    sb.append("    movieRecordingFolders: ").append(toIndentedString(movieRecordingFolders)).append("\n");
    sb.append("    seriesRecordingFolders: ").append(toIndentedString(seriesRecordingFolders)).append("\n");
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
