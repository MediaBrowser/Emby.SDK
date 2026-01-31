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
import embyclient.model.LibraryUserCopyOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CopyData
 */


public class CopyData {
  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("ToUserIds")
  private List<String> toUserIds = null;

  @SerializedName("CopyOptions")
  private List<LibraryUserCopyOptions> copyOptions = null;

  public CopyData userId(String userId) {
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

  public CopyData toUserIds(List<String> toUserIds) {
    this.toUserIds = toUserIds;
    return this;
  }

  public CopyData addToUserIdsItem(String toUserIdsItem) {
    if (this.toUserIds == null) {
      this.toUserIds = new ArrayList<>();
    }
    this.toUserIds.add(toUserIdsItem);
    return this;
  }

   /**
   * Get toUserIds
   * @return toUserIds
  **/
  @Schema(description = "")
  public List<String> getToUserIds() {
    return toUserIds;
  }

  public void setToUserIds(List<String> toUserIds) {
    this.toUserIds = toUserIds;
  }

  public CopyData copyOptions(List<LibraryUserCopyOptions> copyOptions) {
    this.copyOptions = copyOptions;
    return this;
  }

  public CopyData addCopyOptionsItem(LibraryUserCopyOptions copyOptionsItem) {
    if (this.copyOptions == null) {
      this.copyOptions = new ArrayList<>();
    }
    this.copyOptions.add(copyOptionsItem);
    return this;
  }

   /**
   * Get copyOptions
   * @return copyOptions
  **/
  @Schema(description = "")
  public List<LibraryUserCopyOptions> getCopyOptions() {
    return copyOptions;
  }

  public void setCopyOptions(List<LibraryUserCopyOptions> copyOptions) {
    this.copyOptions = copyOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyData copyData = (CopyData) o;
    return Objects.equals(this.userId, copyData.userId) &&
        Objects.equals(this.toUserIds, copyData.toUserIds) &&
        Objects.equals(this.copyOptions, copyData.copyOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, toUserIds, copyOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyData {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    toUserIds: ").append(toIndentedString(toUserIds)).append("\n");
    sb.append("    copyOptions: ").append(toIndentedString(copyOptions)).append("\n");
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
