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
import io.swagger.client.model.ThemeMediaResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AllThemeMediaResult
 */


public class AllThemeMediaResult {
  @SerializedName("ThemeVideosResult")
  private ThemeMediaResult themeVideosResult = null;

  @SerializedName("ThemeSongsResult")
  private ThemeMediaResult themeSongsResult = null;

  @SerializedName("SoundtrackSongsResult")
  private ThemeMediaResult soundtrackSongsResult = null;

  public AllThemeMediaResult themeVideosResult(ThemeMediaResult themeVideosResult) {
    this.themeVideosResult = themeVideosResult;
    return this;
  }

   /**
   * Get themeVideosResult
   * @return themeVideosResult
  **/
  @Schema(description = "")
  public ThemeMediaResult getThemeVideosResult() {
    return themeVideosResult;
  }

  public void setThemeVideosResult(ThemeMediaResult themeVideosResult) {
    this.themeVideosResult = themeVideosResult;
  }

  public AllThemeMediaResult themeSongsResult(ThemeMediaResult themeSongsResult) {
    this.themeSongsResult = themeSongsResult;
    return this;
  }

   /**
   * Get themeSongsResult
   * @return themeSongsResult
  **/
  @Schema(description = "")
  public ThemeMediaResult getThemeSongsResult() {
    return themeSongsResult;
  }

  public void setThemeSongsResult(ThemeMediaResult themeSongsResult) {
    this.themeSongsResult = themeSongsResult;
  }

  public AllThemeMediaResult soundtrackSongsResult(ThemeMediaResult soundtrackSongsResult) {
    this.soundtrackSongsResult = soundtrackSongsResult;
    return this;
  }

   /**
   * Get soundtrackSongsResult
   * @return soundtrackSongsResult
  **/
  @Schema(description = "")
  public ThemeMediaResult getSoundtrackSongsResult() {
    return soundtrackSongsResult;
  }

  public void setSoundtrackSongsResult(ThemeMediaResult soundtrackSongsResult) {
    this.soundtrackSongsResult = soundtrackSongsResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllThemeMediaResult allThemeMediaResult = (AllThemeMediaResult) o;
    return Objects.equals(this.themeVideosResult, allThemeMediaResult.themeVideosResult) &&
        Objects.equals(this.themeSongsResult, allThemeMediaResult.themeSongsResult) &&
        Objects.equals(this.soundtrackSongsResult, allThemeMediaResult.soundtrackSongsResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(themeVideosResult, themeSongsResult, soundtrackSongsResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllThemeMediaResult {\n");
    
    sb.append("    themeVideosResult: ").append(toIndentedString(themeVideosResult)).append("\n");
    sb.append("    themeSongsResult: ").append(toIndentedString(themeSongsResult)).append("\n");
    sb.append("    soundtrackSongsResult: ").append(toIndentedString(soundtrackSongsResult)).append("\n");
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
