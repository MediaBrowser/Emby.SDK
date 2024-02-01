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
import io.swagger.client.model.ApiNameIdDescriptionPair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ApiAvailableRecordingOptions
 */


public class ApiAvailableRecordingOptions {
  @SerializedName("RecordingFolders")
  private List<ApiNameIdDescriptionPair> recordingFolders = null;

  @SerializedName("MovieRecordingFolders")
  private List<ApiNameIdDescriptionPair> movieRecordingFolders = null;

  @SerializedName("SeriesRecordingFolders")
  private List<ApiNameIdDescriptionPair> seriesRecordingFolders = null;

  public ApiAvailableRecordingOptions recordingFolders(List<ApiNameIdDescriptionPair> recordingFolders) {
    this.recordingFolders = recordingFolders;
    return this;
  }

  public ApiAvailableRecordingOptions addRecordingFoldersItem(ApiNameIdDescriptionPair recordingFoldersItem) {
    if (this.recordingFolders == null) {
      this.recordingFolders = new ArrayList<ApiNameIdDescriptionPair>();
    }
    this.recordingFolders.add(recordingFoldersItem);
    return this;
  }

   /**
   * Get recordingFolders
   * @return recordingFolders
  **/
  @Schema(description = "")
  public List<ApiNameIdDescriptionPair> getRecordingFolders() {
    return recordingFolders;
  }

  public void setRecordingFolders(List<ApiNameIdDescriptionPair> recordingFolders) {
    this.recordingFolders = recordingFolders;
  }

  public ApiAvailableRecordingOptions movieRecordingFolders(List<ApiNameIdDescriptionPair> movieRecordingFolders) {
    this.movieRecordingFolders = movieRecordingFolders;
    return this;
  }

  public ApiAvailableRecordingOptions addMovieRecordingFoldersItem(ApiNameIdDescriptionPair movieRecordingFoldersItem) {
    if (this.movieRecordingFolders == null) {
      this.movieRecordingFolders = new ArrayList<ApiNameIdDescriptionPair>();
    }
    this.movieRecordingFolders.add(movieRecordingFoldersItem);
    return this;
  }

   /**
   * Get movieRecordingFolders
   * @return movieRecordingFolders
  **/
  @Schema(description = "")
  public List<ApiNameIdDescriptionPair> getMovieRecordingFolders() {
    return movieRecordingFolders;
  }

  public void setMovieRecordingFolders(List<ApiNameIdDescriptionPair> movieRecordingFolders) {
    this.movieRecordingFolders = movieRecordingFolders;
  }

  public ApiAvailableRecordingOptions seriesRecordingFolders(List<ApiNameIdDescriptionPair> seriesRecordingFolders) {
    this.seriesRecordingFolders = seriesRecordingFolders;
    return this;
  }

  public ApiAvailableRecordingOptions addSeriesRecordingFoldersItem(ApiNameIdDescriptionPair seriesRecordingFoldersItem) {
    if (this.seriesRecordingFolders == null) {
      this.seriesRecordingFolders = new ArrayList<ApiNameIdDescriptionPair>();
    }
    this.seriesRecordingFolders.add(seriesRecordingFoldersItem);
    return this;
  }

   /**
   * Get seriesRecordingFolders
   * @return seriesRecordingFolders
  **/
  @Schema(description = "")
  public List<ApiNameIdDescriptionPair> getSeriesRecordingFolders() {
    return seriesRecordingFolders;
  }

  public void setSeriesRecordingFolders(List<ApiNameIdDescriptionPair> seriesRecordingFolders) {
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
    ApiAvailableRecordingOptions apiAvailableRecordingOptions = (ApiAvailableRecordingOptions) o;
    return Objects.equals(this.recordingFolders, apiAvailableRecordingOptions.recordingFolders) &&
        Objects.equals(this.movieRecordingFolders, apiAvailableRecordingOptions.movieRecordingFolders) &&
        Objects.equals(this.seriesRecordingFolders, apiAvailableRecordingOptions.seriesRecordingFolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingFolders, movieRecordingFolders, seriesRecordingFolders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAvailableRecordingOptions {\n");
    
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
