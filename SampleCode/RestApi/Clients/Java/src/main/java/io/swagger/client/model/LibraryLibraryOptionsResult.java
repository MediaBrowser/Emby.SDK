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
import io.swagger.client.model.LibraryLibraryOptionInfo;
import io.swagger.client.model.LibraryLibraryTypeOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryLibraryOptionsResult
 */


public class LibraryLibraryOptionsResult {
  @SerializedName("MetadataSavers")
  private List<LibraryLibraryOptionInfo> metadataSavers = null;

  @SerializedName("MetadataReaders")
  private List<LibraryLibraryOptionInfo> metadataReaders = null;

  @SerializedName("SubtitleFetchers")
  private List<LibraryLibraryOptionInfo> subtitleFetchers = null;

  @SerializedName("LyricsFetchers")
  private List<LibraryLibraryOptionInfo> lyricsFetchers = null;

  @SerializedName("TypeOptions")
  private List<LibraryLibraryTypeOptions> typeOptions = null;

  public LibraryLibraryOptionsResult metadataSavers(List<LibraryLibraryOptionInfo> metadataSavers) {
    this.metadataSavers = metadataSavers;
    return this;
  }

  public LibraryLibraryOptionsResult addMetadataSaversItem(LibraryLibraryOptionInfo metadataSaversItem) {
    if (this.metadataSavers == null) {
      this.metadataSavers = new ArrayList<LibraryLibraryOptionInfo>();
    }
    this.metadataSavers.add(metadataSaversItem);
    return this;
  }

   /**
   * Get metadataSavers
   * @return metadataSavers
  **/
  @Schema(description = "")
  public List<LibraryLibraryOptionInfo> getMetadataSavers() {
    return metadataSavers;
  }

  public void setMetadataSavers(List<LibraryLibraryOptionInfo> metadataSavers) {
    this.metadataSavers = metadataSavers;
  }

  public LibraryLibraryOptionsResult metadataReaders(List<LibraryLibraryOptionInfo> metadataReaders) {
    this.metadataReaders = metadataReaders;
    return this;
  }

  public LibraryLibraryOptionsResult addMetadataReadersItem(LibraryLibraryOptionInfo metadataReadersItem) {
    if (this.metadataReaders == null) {
      this.metadataReaders = new ArrayList<LibraryLibraryOptionInfo>();
    }
    this.metadataReaders.add(metadataReadersItem);
    return this;
  }

   /**
   * Get metadataReaders
   * @return metadataReaders
  **/
  @Schema(description = "")
  public List<LibraryLibraryOptionInfo> getMetadataReaders() {
    return metadataReaders;
  }

  public void setMetadataReaders(List<LibraryLibraryOptionInfo> metadataReaders) {
    this.metadataReaders = metadataReaders;
  }

  public LibraryLibraryOptionsResult subtitleFetchers(List<LibraryLibraryOptionInfo> subtitleFetchers) {
    this.subtitleFetchers = subtitleFetchers;
    return this;
  }

  public LibraryLibraryOptionsResult addSubtitleFetchersItem(LibraryLibraryOptionInfo subtitleFetchersItem) {
    if (this.subtitleFetchers == null) {
      this.subtitleFetchers = new ArrayList<LibraryLibraryOptionInfo>();
    }
    this.subtitleFetchers.add(subtitleFetchersItem);
    return this;
  }

   /**
   * Get subtitleFetchers
   * @return subtitleFetchers
  **/
  @Schema(description = "")
  public List<LibraryLibraryOptionInfo> getSubtitleFetchers() {
    return subtitleFetchers;
  }

  public void setSubtitleFetchers(List<LibraryLibraryOptionInfo> subtitleFetchers) {
    this.subtitleFetchers = subtitleFetchers;
  }

  public LibraryLibraryOptionsResult lyricsFetchers(List<LibraryLibraryOptionInfo> lyricsFetchers) {
    this.lyricsFetchers = lyricsFetchers;
    return this;
  }

  public LibraryLibraryOptionsResult addLyricsFetchersItem(LibraryLibraryOptionInfo lyricsFetchersItem) {
    if (this.lyricsFetchers == null) {
      this.lyricsFetchers = new ArrayList<LibraryLibraryOptionInfo>();
    }
    this.lyricsFetchers.add(lyricsFetchersItem);
    return this;
  }

   /**
   * Get lyricsFetchers
   * @return lyricsFetchers
  **/
  @Schema(description = "")
  public List<LibraryLibraryOptionInfo> getLyricsFetchers() {
    return lyricsFetchers;
  }

  public void setLyricsFetchers(List<LibraryLibraryOptionInfo> lyricsFetchers) {
    this.lyricsFetchers = lyricsFetchers;
  }

  public LibraryLibraryOptionsResult typeOptions(List<LibraryLibraryTypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
    return this;
  }

  public LibraryLibraryOptionsResult addTypeOptionsItem(LibraryLibraryTypeOptions typeOptionsItem) {
    if (this.typeOptions == null) {
      this.typeOptions = new ArrayList<LibraryLibraryTypeOptions>();
    }
    this.typeOptions.add(typeOptionsItem);
    return this;
  }

   /**
   * Get typeOptions
   * @return typeOptions
  **/
  @Schema(description = "")
  public List<LibraryLibraryTypeOptions> getTypeOptions() {
    return typeOptions;
  }

  public void setTypeOptions(List<LibraryLibraryTypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryLibraryOptionsResult libraryLibraryOptionsResult = (LibraryLibraryOptionsResult) o;
    return Objects.equals(this.metadataSavers, libraryLibraryOptionsResult.metadataSavers) &&
        Objects.equals(this.metadataReaders, libraryLibraryOptionsResult.metadataReaders) &&
        Objects.equals(this.subtitleFetchers, libraryLibraryOptionsResult.subtitleFetchers) &&
        Objects.equals(this.lyricsFetchers, libraryLibraryOptionsResult.lyricsFetchers) &&
        Objects.equals(this.typeOptions, libraryLibraryOptionsResult.typeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataSavers, metadataReaders, subtitleFetchers, lyricsFetchers, typeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryLibraryOptionsResult {\n");
    
    sb.append("    metadataSavers: ").append(toIndentedString(metadataSavers)).append("\n");
    sb.append("    metadataReaders: ").append(toIndentedString(metadataReaders)).append("\n");
    sb.append("    subtitleFetchers: ").append(toIndentedString(subtitleFetchers)).append("\n");
    sb.append("    lyricsFetchers: ").append(toIndentedString(lyricsFetchers)).append("\n");
    sb.append("    typeOptions: ").append(toIndentedString(typeOptions)).append("\n");
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
