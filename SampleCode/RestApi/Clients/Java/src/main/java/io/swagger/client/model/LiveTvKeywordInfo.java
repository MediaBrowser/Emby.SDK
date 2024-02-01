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
import io.swagger.client.model.LiveTvKeywordType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LiveTvKeywordInfo
 */


public class LiveTvKeywordInfo {
  @SerializedName("KeywordType")
  private LiveTvKeywordType keywordType = null;

  @SerializedName("Keyword")
  private String keyword = null;

  public LiveTvKeywordInfo keywordType(LiveTvKeywordType keywordType) {
    this.keywordType = keywordType;
    return this;
  }

   /**
   * Get keywordType
   * @return keywordType
  **/
  @Schema(description = "")
  public LiveTvKeywordType getKeywordType() {
    return keywordType;
  }

  public void setKeywordType(LiveTvKeywordType keywordType) {
    this.keywordType = keywordType;
  }

  public LiveTvKeywordInfo keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvKeywordInfo liveTvKeywordInfo = (LiveTvKeywordInfo) o;
    return Objects.equals(this.keywordType, liveTvKeywordInfo.keywordType) &&
        Objects.equals(this.keyword, liveTvKeywordInfo.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordType, keyword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvKeywordInfo {\n");
    
    sb.append("    keywordType: ").append(toIndentedString(keywordType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
