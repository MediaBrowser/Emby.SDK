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
import io.swagger.client.model.UpdatesPackageTargetSystem;
import io.swagger.client.model.UpdatesPackageVersionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * UpdatesPackageInfo
 */


public class UpdatesPackageInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shortDescription")
  private String shortDescription = null;

  @SerializedName("overview")
  private String overview = null;

  @SerializedName("isPremium")
  private Boolean isPremium = null;

  @SerializedName("adult")
  private Boolean adult = null;

  @SerializedName("richDescUrl")
  private String richDescUrl = null;

  @SerializedName("thumbImage")
  private String thumbImage = null;

  @SerializedName("previewImage")
  private String previewImage = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("targetFilename")
  private String targetFilename = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("tileColor")
  private String tileColor = null;

  @SerializedName("featureId")
  private String featureId = null;

  @SerializedName("regInfo")
  private String regInfo = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("targetSystem")
  private UpdatesPackageTargetSystem targetSystem = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("totalRatings")
  private Integer totalRatings = null;

  @SerializedName("avgRating")
  private Float avgRating = null;

  @SerializedName("isRegistered")
  private Boolean isRegistered = null;

  @SerializedName("expDate")
  private OffsetDateTime expDate = null;

  @SerializedName("versions")
  private List<UpdatesPackageVersionInfo> versions = null;

  @SerializedName("enableInAppStore")
  private Boolean enableInAppStore = null;

  @SerializedName("installs")
  private Integer installs = null;

  public UpdatesPackageInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatesPackageInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatesPackageInfo shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @Schema(description = "")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public UpdatesPackageInfo overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @Schema(description = "")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public UpdatesPackageInfo isPremium(Boolean isPremium) {
    this.isPremium = isPremium;
    return this;
  }

   /**
   * Get isPremium
   * @return isPremium
  **/
  @Schema(description = "")
  public Boolean isIsPremium() {
    return isPremium;
  }

  public void setIsPremium(Boolean isPremium) {
    this.isPremium = isPremium;
  }

  public UpdatesPackageInfo adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @Schema(description = "")
  public Boolean isAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public UpdatesPackageInfo richDescUrl(String richDescUrl) {
    this.richDescUrl = richDescUrl;
    return this;
  }

   /**
   * Get richDescUrl
   * @return richDescUrl
  **/
  @Schema(description = "")
  public String getRichDescUrl() {
    return richDescUrl;
  }

  public void setRichDescUrl(String richDescUrl) {
    this.richDescUrl = richDescUrl;
  }

  public UpdatesPackageInfo thumbImage(String thumbImage) {
    this.thumbImage = thumbImage;
    return this;
  }

   /**
   * Get thumbImage
   * @return thumbImage
  **/
  @Schema(description = "")
  public String getThumbImage() {
    return thumbImage;
  }

  public void setThumbImage(String thumbImage) {
    this.thumbImage = thumbImage;
  }

  public UpdatesPackageInfo previewImage(String previewImage) {
    this.previewImage = previewImage;
    return this;
  }

   /**
   * Get previewImage
   * @return previewImage
  **/
  @Schema(description = "")
  public String getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(String previewImage) {
    this.previewImage = previewImage;
  }

  public UpdatesPackageInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UpdatesPackageInfo targetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
    return this;
  }

   /**
   * Get targetFilename
   * @return targetFilename
  **/
  @Schema(description = "")
  public String getTargetFilename() {
    return targetFilename;
  }

  public void setTargetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
  }

  public UpdatesPackageInfo owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public UpdatesPackageInfo category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public UpdatesPackageInfo tileColor(String tileColor) {
    this.tileColor = tileColor;
    return this;
  }

   /**
   * Get tileColor
   * @return tileColor
  **/
  @Schema(description = "")
  public String getTileColor() {
    return tileColor;
  }

  public void setTileColor(String tileColor) {
    this.tileColor = tileColor;
  }

  public UpdatesPackageInfo featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

   /**
   * Get featureId
   * @return featureId
  **/
  @Schema(description = "")
  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  public UpdatesPackageInfo regInfo(String regInfo) {
    this.regInfo = regInfo;
    return this;
  }

   /**
   * Get regInfo
   * @return regInfo
  **/
  @Schema(description = "")
  public String getRegInfo() {
    return regInfo;
  }

  public void setRegInfo(String regInfo) {
    this.regInfo = regInfo;
  }

  public UpdatesPackageInfo price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public UpdatesPackageInfo targetSystem(UpdatesPackageTargetSystem targetSystem) {
    this.targetSystem = targetSystem;
    return this;
  }

   /**
   * Get targetSystem
   * @return targetSystem
  **/
  @Schema(description = "")
  public UpdatesPackageTargetSystem getTargetSystem() {
    return targetSystem;
  }

  public void setTargetSystem(UpdatesPackageTargetSystem targetSystem) {
    this.targetSystem = targetSystem;
  }

  public UpdatesPackageInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @Schema(description = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public UpdatesPackageInfo totalRatings(Integer totalRatings) {
    this.totalRatings = totalRatings;
    return this;
  }

   /**
   * Get totalRatings
   * @return totalRatings
  **/
  @Schema(description = "")
  public Integer getTotalRatings() {
    return totalRatings;
  }

  public void setTotalRatings(Integer totalRatings) {
    this.totalRatings = totalRatings;
  }

  public UpdatesPackageInfo avgRating(Float avgRating) {
    this.avgRating = avgRating;
    return this;
  }

   /**
   * Get avgRating
   * @return avgRating
  **/
  @Schema(description = "")
  public Float getAvgRating() {
    return avgRating;
  }

  public void setAvgRating(Float avgRating) {
    this.avgRating = avgRating;
  }

  public UpdatesPackageInfo isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

   /**
   * Get isRegistered
   * @return isRegistered
  **/
  @Schema(description = "")
  public Boolean isIsRegistered() {
    return isRegistered;
  }

  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public UpdatesPackageInfo expDate(OffsetDateTime expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * Get expDate
   * @return expDate
  **/
  @Schema(description = "")
  public OffsetDateTime getExpDate() {
    return expDate;
  }

  public void setExpDate(OffsetDateTime expDate) {
    this.expDate = expDate;
  }

  public UpdatesPackageInfo versions(List<UpdatesPackageVersionInfo> versions) {
    this.versions = versions;
    return this;
  }

  public UpdatesPackageInfo addVersionsItem(UpdatesPackageVersionInfo versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<UpdatesPackageVersionInfo>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @Schema(description = "")
  public List<UpdatesPackageVersionInfo> getVersions() {
    return versions;
  }

  public void setVersions(List<UpdatesPackageVersionInfo> versions) {
    this.versions = versions;
  }

  public UpdatesPackageInfo enableInAppStore(Boolean enableInAppStore) {
    this.enableInAppStore = enableInAppStore;
    return this;
  }

   /**
   * Get enableInAppStore
   * @return enableInAppStore
  **/
  @Schema(description = "")
  public Boolean isEnableInAppStore() {
    return enableInAppStore;
  }

  public void setEnableInAppStore(Boolean enableInAppStore) {
    this.enableInAppStore = enableInAppStore;
  }

  public UpdatesPackageInfo installs(Integer installs) {
    this.installs = installs;
    return this;
  }

   /**
   * Get installs
   * @return installs
  **/
  @Schema(description = "")
  public Integer getInstalls() {
    return installs;
  }

  public void setInstalls(Integer installs) {
    this.installs = installs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatesPackageInfo updatesPackageInfo = (UpdatesPackageInfo) o;
    return Objects.equals(this.id, updatesPackageInfo.id) &&
        Objects.equals(this.name, updatesPackageInfo.name) &&
        Objects.equals(this.shortDescription, updatesPackageInfo.shortDescription) &&
        Objects.equals(this.overview, updatesPackageInfo.overview) &&
        Objects.equals(this.isPremium, updatesPackageInfo.isPremium) &&
        Objects.equals(this.adult, updatesPackageInfo.adult) &&
        Objects.equals(this.richDescUrl, updatesPackageInfo.richDescUrl) &&
        Objects.equals(this.thumbImage, updatesPackageInfo.thumbImage) &&
        Objects.equals(this.previewImage, updatesPackageInfo.previewImage) &&
        Objects.equals(this.type, updatesPackageInfo.type) &&
        Objects.equals(this.targetFilename, updatesPackageInfo.targetFilename) &&
        Objects.equals(this.owner, updatesPackageInfo.owner) &&
        Objects.equals(this.category, updatesPackageInfo.category) &&
        Objects.equals(this.tileColor, updatesPackageInfo.tileColor) &&
        Objects.equals(this.featureId, updatesPackageInfo.featureId) &&
        Objects.equals(this.regInfo, updatesPackageInfo.regInfo) &&
        Objects.equals(this.price, updatesPackageInfo.price) &&
        Objects.equals(this.targetSystem, updatesPackageInfo.targetSystem) &&
        Objects.equals(this.guid, updatesPackageInfo.guid) &&
        Objects.equals(this.totalRatings, updatesPackageInfo.totalRatings) &&
        Objects.equals(this.avgRating, updatesPackageInfo.avgRating) &&
        Objects.equals(this.isRegistered, updatesPackageInfo.isRegistered) &&
        Objects.equals(this.expDate, updatesPackageInfo.expDate) &&
        Objects.equals(this.versions, updatesPackageInfo.versions) &&
        Objects.equals(this.enableInAppStore, updatesPackageInfo.enableInAppStore) &&
        Objects.equals(this.installs, updatesPackageInfo.installs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortDescription, overview, isPremium, adult, richDescUrl, thumbImage, previewImage, type, targetFilename, owner, category, tileColor, featureId, regInfo, price, targetSystem, guid, totalRatings, avgRating, isRegistered, expDate, versions, enableInAppStore, installs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatesPackageInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    isPremium: ").append(toIndentedString(isPremium)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    richDescUrl: ").append(toIndentedString(richDescUrl)).append("\n");
    sb.append("    thumbImage: ").append(toIndentedString(thumbImage)).append("\n");
    sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetFilename: ").append(toIndentedString(targetFilename)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    tileColor: ").append(toIndentedString(tileColor)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    regInfo: ").append(toIndentedString(regInfo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    targetSystem: ").append(toIndentedString(targetSystem)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    totalRatings: ").append(toIndentedString(totalRatings)).append("\n");
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    enableInAppStore: ").append(toIndentedString(enableInAppStore)).append("\n");
    sb.append("    installs: ").append(toIndentedString(installs)).append("\n");
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
