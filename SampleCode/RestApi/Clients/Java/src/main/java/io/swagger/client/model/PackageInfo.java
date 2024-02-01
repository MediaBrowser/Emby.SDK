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
import io.swagger.client.model.PackageTargetSystem;
import io.swagger.client.model.PackageVersionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Class PackageInfo  
 */
@Schema(description = "Class PackageInfo  ")

public class PackageInfo {
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

  @SerializedName("price")
  private Float price = null;

  @SerializedName("targetSystem")
  private PackageTargetSystem targetSystem = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("isRegistered")
  private Boolean isRegistered = null;

  @SerializedName("expDate")
  private OffsetDateTime expDate = null;

  @SerializedName("versions")
  private List<PackageVersionInfo> versions = null;

  @SerializedName("enableInAppStore")
  private Boolean enableInAppStore = null;

  @SerializedName("installs")
  private Integer installs = null;

  public PackageInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The internal id of this package.
   * @return id
  **/
  @Schema(description = "The internal id of this package.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PackageInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageInfo shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The short description.
   * @return shortDescription
  **/
  @Schema(description = "The short description.")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public PackageInfo overview(String overview) {
    this.overview = overview;
    return this;
  }

   /**
   * The overview.
   * @return overview
  **/
  @Schema(description = "The overview.")
  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public PackageInfo isPremium(Boolean isPremium) {
    this.isPremium = isPremium;
    return this;
  }

   /**
   * A value indicating whether this instance is premium.
   * @return isPremium
  **/
  @Schema(description = "A value indicating whether this instance is premium.")
  public Boolean isIsPremium() {
    return isPremium;
  }

  public void setIsPremium(Boolean isPremium) {
    this.isPremium = isPremium;
  }

  public PackageInfo adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * A value indicating whether this instance is adult only content.
   * @return adult
  **/
  @Schema(description = "A value indicating whether this instance is adult only content.")
  public Boolean isAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public PackageInfo richDescUrl(String richDescUrl) {
    this.richDescUrl = richDescUrl;
    return this;
  }

   /**
   * The rich desc URL.
   * @return richDescUrl
  **/
  @Schema(description = "The rich desc URL.")
  public String getRichDescUrl() {
    return richDescUrl;
  }

  public void setRichDescUrl(String richDescUrl) {
    this.richDescUrl = richDescUrl;
  }

  public PackageInfo thumbImage(String thumbImage) {
    this.thumbImage = thumbImage;
    return this;
  }

   /**
   * The thumb image.
   * @return thumbImage
  **/
  @Schema(description = "The thumb image.")
  public String getThumbImage() {
    return thumbImage;
  }

  public void setThumbImage(String thumbImage) {
    this.thumbImage = thumbImage;
  }

  public PackageInfo previewImage(String previewImage) {
    this.previewImage = previewImage;
    return this;
  }

   /**
   * The preview image.
   * @return previewImage
  **/
  @Schema(description = "The preview image.")
  public String getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(String previewImage) {
    this.previewImage = previewImage;
  }

  public PackageInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type.
   * @return type
  **/
  @Schema(description = "The type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PackageInfo targetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
    return this;
  }

   /**
   * The target filename.
   * @return targetFilename
  **/
  @Schema(description = "The target filename.")
  public String getTargetFilename() {
    return targetFilename;
  }

  public void setTargetFilename(String targetFilename) {
    this.targetFilename = targetFilename;
  }

  public PackageInfo owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner.
   * @return owner
  **/
  @Schema(description = "The owner.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public PackageInfo category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category.
   * @return category
  **/
  @Schema(description = "The category.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PackageInfo tileColor(String tileColor) {
    this.tileColor = tileColor;
    return this;
  }

   /**
   * The catalog tile color.
   * @return tileColor
  **/
  @Schema(description = "The catalog tile color.")
  public String getTileColor() {
    return tileColor;
  }

  public void setTileColor(String tileColor) {
    this.tileColor = tileColor;
  }

  public PackageInfo featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

   /**
   * The feature id of this package (if premium).
   * @return featureId
  **/
  @Schema(description = "The feature id of this package (if premium).")
  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  public PackageInfo price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * The price for this package (if premium).
   * @return price
  **/
  @Schema(description = "The price for this package (if premium).")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public PackageInfo targetSystem(PackageTargetSystem targetSystem) {
    this.targetSystem = targetSystem;
    return this;
  }

   /**
   * Get targetSystem
   * @return targetSystem
  **/
  @Schema(description = "")
  public PackageTargetSystem getTargetSystem() {
    return targetSystem;
  }

  public void setTargetSystem(PackageTargetSystem targetSystem) {
    this.targetSystem = targetSystem;
  }

  public PackageInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates.
   * @return guid
  **/
  @Schema(description = "The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public PackageInfo isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

   /**
   * Whether or not this package is registered.
   * @return isRegistered
  **/
  @Schema(description = "Whether or not this package is registered.")
  public Boolean isIsRegistered() {
    return isRegistered;
  }

  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public PackageInfo expDate(OffsetDateTime expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * The expiration date for this package.
   * @return expDate
  **/
  @Schema(description = "The expiration date for this package.")
  public OffsetDateTime getExpDate() {
    return expDate;
  }

  public void setExpDate(OffsetDateTime expDate) {
    this.expDate = expDate;
  }

  public PackageInfo versions(List<PackageVersionInfo> versions) {
    this.versions = versions;
    return this;
  }

  public PackageInfo addVersionsItem(PackageVersionInfo versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<PackageVersionInfo>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * The versions.
   * @return versions
  **/
  @Schema(description = "The versions.")
  public List<PackageVersionInfo> getVersions() {
    return versions;
  }

  public void setVersions(List<PackageVersionInfo> versions) {
    this.versions = versions;
  }

  public PackageInfo enableInAppStore(Boolean enableInAppStore) {
    this.enableInAppStore = enableInAppStore;
    return this;
  }

   /**
   * A value indicating whether \\[enable in application store\\].
   * @return enableInAppStore
  **/
  @Schema(description = "A value indicating whether \\[enable in application store\\].")
  public Boolean isEnableInAppStore() {
    return enableInAppStore;
  }

  public void setEnableInAppStore(Boolean enableInAppStore) {
    this.enableInAppStore = enableInAppStore;
  }

  public PackageInfo installs(Integer installs) {
    this.installs = installs;
    return this;
  }

   /**
   * The installs.
   * @return installs
  **/
  @Schema(description = "The installs.")
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
    PackageInfo packageInfo = (PackageInfo) o;
    return Objects.equals(this.id, packageInfo.id) &&
        Objects.equals(this.name, packageInfo.name) &&
        Objects.equals(this.shortDescription, packageInfo.shortDescription) &&
        Objects.equals(this.overview, packageInfo.overview) &&
        Objects.equals(this.isPremium, packageInfo.isPremium) &&
        Objects.equals(this.adult, packageInfo.adult) &&
        Objects.equals(this.richDescUrl, packageInfo.richDescUrl) &&
        Objects.equals(this.thumbImage, packageInfo.thumbImage) &&
        Objects.equals(this.previewImage, packageInfo.previewImage) &&
        Objects.equals(this.type, packageInfo.type) &&
        Objects.equals(this.targetFilename, packageInfo.targetFilename) &&
        Objects.equals(this.owner, packageInfo.owner) &&
        Objects.equals(this.category, packageInfo.category) &&
        Objects.equals(this.tileColor, packageInfo.tileColor) &&
        Objects.equals(this.featureId, packageInfo.featureId) &&
        Objects.equals(this.price, packageInfo.price) &&
        Objects.equals(this.targetSystem, packageInfo.targetSystem) &&
        Objects.equals(this.guid, packageInfo.guid) &&
        Objects.equals(this.isRegistered, packageInfo.isRegistered) &&
        Objects.equals(this.expDate, packageInfo.expDate) &&
        Objects.equals(this.versions, packageInfo.versions) &&
        Objects.equals(this.enableInAppStore, packageInfo.enableInAppStore) &&
        Objects.equals(this.installs, packageInfo.installs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortDescription, overview, isPremium, adult, richDescUrl, thumbImage, previewImage, type, targetFilename, owner, category, tileColor, featureId, price, targetSystem, guid, isRegistered, expDate, versions, enableInAppStore, installs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageInfo {\n");
    
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
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    targetSystem: ").append(toIndentedString(targetSystem)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
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
