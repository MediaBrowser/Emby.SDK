/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.LibraryOptionInfo;
import embyclient.model.LibraryTypeOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryOptionsResult
 */


public class LibraryOptionsResult {
  @SerializedName("MetadataSavers")
  private List<LibraryOptionInfo> metadataSavers = null;

  @SerializedName("MetadataReaders")
  private List<LibraryOptionInfo> metadataReaders = null;

  @SerializedName("SubtitleFetchers")
  private List<LibraryOptionInfo> subtitleFetchers = null;

  @SerializedName("LyricsFetchers")
  private List<LibraryOptionInfo> lyricsFetchers = null;

  @SerializedName("TypeOptions")
  private List<LibraryTypeOptions> typeOptions = null;

  public LibraryOptionsResult metadataSavers(List<LibraryOptionInfo> metadataSavers) {
    this.metadataSavers = metadataSavers;
    return this;
  }

  public LibraryOptionsResult addMetadataSaversItem(LibraryOptionInfo metadataSaversItem) {
    if (this.metadataSavers == null) {
      this.metadataSavers = new ArrayList<LibraryOptionInfo>();
    }
    this.metadataSavers.add(metadataSaversItem);
    return this;
  }

   /**
   * Get metadataSavers
   * @return metadataSavers
  **/
  @Schema(description = "")
  public List<LibraryOptionInfo> getMetadataSavers() {
    return metadataSavers;
  }

  public void setMetadataSavers(List<LibraryOptionInfo> metadataSavers) {
    this.metadataSavers = metadataSavers;
  }

  public LibraryOptionsResult metadataReaders(List<LibraryOptionInfo> metadataReaders) {
    this.metadataReaders = metadataReaders;
    return this;
  }

  public LibraryOptionsResult addMetadataReadersItem(LibraryOptionInfo metadataReadersItem) {
    if (this.metadataReaders == null) {
      this.metadataReaders = new ArrayList<LibraryOptionInfo>();
    }
    this.metadataReaders.add(metadataReadersItem);
    return this;
  }

   /**
   * Get metadataReaders
   * @return metadataReaders
  **/
  @Schema(description = "")
  public List<LibraryOptionInfo> getMetadataReaders() {
    return metadataReaders;
  }

  public void setMetadataReaders(List<LibraryOptionInfo> metadataReaders) {
    this.metadataReaders = metadataReaders;
  }

  public LibraryOptionsResult subtitleFetchers(List<LibraryOptionInfo> subtitleFetchers) {
    this.subtitleFetchers = subtitleFetchers;
    return this;
  }

  public LibraryOptionsResult addSubtitleFetchersItem(LibraryOptionInfo subtitleFetchersItem) {
    if (this.subtitleFetchers == null) {
      this.subtitleFetchers = new ArrayList<LibraryOptionInfo>();
    }
    this.subtitleFetchers.add(subtitleFetchersItem);
    return this;
  }

   /**
   * Get subtitleFetchers
   * @return subtitleFetchers
  **/
  @Schema(description = "")
  public List<LibraryOptionInfo> getSubtitleFetchers() {
    return subtitleFetchers;
  }

  public void setSubtitleFetchers(List<LibraryOptionInfo> subtitleFetchers) {
    this.subtitleFetchers = subtitleFetchers;
  }

  public LibraryOptionsResult lyricsFetchers(List<LibraryOptionInfo> lyricsFetchers) {
    this.lyricsFetchers = lyricsFetchers;
    return this;
  }

  public LibraryOptionsResult addLyricsFetchersItem(LibraryOptionInfo lyricsFetchersItem) {
    if (this.lyricsFetchers == null) {
      this.lyricsFetchers = new ArrayList<LibraryOptionInfo>();
    }
    this.lyricsFetchers.add(lyricsFetchersItem);
    return this;
  }

   /**
   * Get lyricsFetchers
   * @return lyricsFetchers
  **/
  @Schema(description = "")
  public List<LibraryOptionInfo> getLyricsFetchers() {
    return lyricsFetchers;
  }

  public void setLyricsFetchers(List<LibraryOptionInfo> lyricsFetchers) {
    this.lyricsFetchers = lyricsFetchers;
  }

  public LibraryOptionsResult typeOptions(List<LibraryTypeOptions> typeOptions) {
    this.typeOptions = typeOptions;
    return this;
  }

  public LibraryOptionsResult addTypeOptionsItem(LibraryTypeOptions typeOptionsItem) {
    if (this.typeOptions == null) {
      this.typeOptions = new ArrayList<LibraryTypeOptions>();
    }
    this.typeOptions.add(typeOptionsItem);
    return this;
  }

   /**
   * Get typeOptions
   * @return typeOptions
  **/
  @Schema(description = "")
  public List<LibraryTypeOptions> getTypeOptions() {
    return typeOptions;
  }

  public void setTypeOptions(List<LibraryTypeOptions> typeOptions) {
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
    LibraryOptionsResult libraryOptionsResult = (LibraryOptionsResult) o;
    return Objects.equals(this.metadataSavers, libraryOptionsResult.metadataSavers) &&
        Objects.equals(this.metadataReaders, libraryOptionsResult.metadataReaders) &&
        Objects.equals(this.subtitleFetchers, libraryOptionsResult.subtitleFetchers) &&
        Objects.equals(this.lyricsFetchers, libraryOptionsResult.lyricsFetchers) &&
        Objects.equals(this.typeOptions, libraryOptionsResult.typeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataSavers, metadataReaders, subtitleFetchers, lyricsFetchers, typeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryOptionsResult {\n");
    
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
