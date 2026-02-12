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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ItemsQuery
 */


public class ItemsQuery {
  @SerializedName("StudioIds")
  private List<String> studioIds = null;

  @SerializedName("TagIds")
  private List<String> tagIds = null;

  @SerializedName("GenreIds")
  private List<String> genreIds = null;

  @SerializedName("CollectionTypes")
  private List<String> collectionTypes = null;

  @SerializedName("IsFavorite")
  private Boolean isFavorite = null;

  public ItemsQuery studioIds(List<String> studioIds) {
    this.studioIds = studioIds;
    return this;
  }

  public ItemsQuery addStudioIdsItem(String studioIdsItem) {
    if (this.studioIds == null) {
      this.studioIds = new ArrayList<>();
    }
    this.studioIds.add(studioIdsItem);
    return this;
  }

   /**
   * Get studioIds
   * @return studioIds
  **/
  @Schema(description = "")
  public List<String> getStudioIds() {
    return studioIds;
  }

  public void setStudioIds(List<String> studioIds) {
    this.studioIds = studioIds;
  }

  public ItemsQuery tagIds(List<String> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public ItemsQuery addTagIdsItem(String tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @Schema(description = "")
  public List<String> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
  }

  public ItemsQuery genreIds(List<String> genreIds) {
    this.genreIds = genreIds;
    return this;
  }

  public ItemsQuery addGenreIdsItem(String genreIdsItem) {
    if (this.genreIds == null) {
      this.genreIds = new ArrayList<>();
    }
    this.genreIds.add(genreIdsItem);
    return this;
  }

   /**
   * Get genreIds
   * @return genreIds
  **/
  @Schema(description = "")
  public List<String> getGenreIds() {
    return genreIds;
  }

  public void setGenreIds(List<String> genreIds) {
    this.genreIds = genreIds;
  }

  public ItemsQuery collectionTypes(List<String> collectionTypes) {
    this.collectionTypes = collectionTypes;
    return this;
  }

  public ItemsQuery addCollectionTypesItem(String collectionTypesItem) {
    if (this.collectionTypes == null) {
      this.collectionTypes = new ArrayList<>();
    }
    this.collectionTypes.add(collectionTypesItem);
    return this;
  }

   /**
   * Get collectionTypes
   * @return collectionTypes
  **/
  @Schema(description = "")
  public List<String> getCollectionTypes() {
    return collectionTypes;
  }

  public void setCollectionTypes(List<String> collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  public ItemsQuery isFavorite(Boolean isFavorite) {
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
    ItemsQuery itemsQuery = (ItemsQuery) o;
    return Objects.equals(this.studioIds, itemsQuery.studioIds) &&
        Objects.equals(this.tagIds, itemsQuery.tagIds) &&
        Objects.equals(this.genreIds, itemsQuery.genreIds) &&
        Objects.equals(this.collectionTypes, itemsQuery.collectionTypes) &&
        Objects.equals(this.isFavorite, itemsQuery.isFavorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studioIds, tagIds, genreIds, collectionTypes, isFavorite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsQuery {\n");
    
    sb.append("    studioIds: ").append(toIndentedString(studioIds)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    collectionTypes: ").append(toIndentedString(collectionTypes)).append("\n");
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
