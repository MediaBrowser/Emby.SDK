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
import embyclient.model.ConnectUserLinkType;
import embyclient.model.EntitiesItemImageInfo;
import embyclient.model.LinkedItemInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Class User  
 */
@Schema(description = "Class User  ")

public class EntitiesUser {
  @SerializedName("UsesIdForConfigurationPath")
  private Boolean usesIdForConfigurationPath = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("EasyPassword")
  private String easyPassword = null;

  @SerializedName("Salt")
  private String salt = null;

  @SerializedName("ConnectUserName")
  private String connectUserName = null;

  @SerializedName("ConnectUserId")
  private String connectUserId = null;

  @SerializedName("ConnectLinkType")
  private ConnectUserLinkType connectLinkType = null;

  @SerializedName("ConnectAccessKey")
  private String connectAccessKey = null;

  @SerializedName("ImageInfos")
  private List<EntitiesItemImageInfo> imageInfos = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("LastLoginDate")
  private OffsetDateTime lastLoginDate = null;

  @SerializedName("LastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("PlayedPercentage")
  private Double playedPercentage = null;

  @SerializedName("RecursiveChildCountEqualsChildCount")
  private Boolean recursiveChildCountEqualsChildCount = null;

  @SerializedName("OriginalParsedName")
  private String originalParsedName = null;

  @SerializedName("IsNameParsedFromFolder")
  private Boolean isNameParsedFromFolder = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("ImportedCollections")
  private List<LinkedItemInfo> importedCollections = null;

  @SerializedName("ResolvedPresentationUniqueKey")
  private String resolvedPresentationUniqueKey = null;

  public EntitiesUser usesIdForConfigurationPath(Boolean usesIdForConfigurationPath) {
    this.usesIdForConfigurationPath = usesIdForConfigurationPath;
    return this;
  }

   /**
   * From now on all user paths will be Id\\-based. This is for backwards compatibility.
   * @return usesIdForConfigurationPath
  **/
  @Schema(description = "From now on all user paths will be Id\\-based. This is for backwards compatibility.")
  public Boolean isUsesIdForConfigurationPath() {
    return usesIdForConfigurationPath;
  }

  public void setUsesIdForConfigurationPath(Boolean usesIdForConfigurationPath) {
    this.usesIdForConfigurationPath = usesIdForConfigurationPath;
  }

  public EntitiesUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password.
   * @return password
  **/
  @Schema(description = "The password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EntitiesUser easyPassword(String easyPassword) {
    this.easyPassword = easyPassword;
    return this;
  }

   /**
   * Get easyPassword
   * @return easyPassword
  **/
  @Schema(description = "")
  public String getEasyPassword() {
    return easyPassword;
  }

  public void setEasyPassword(String easyPassword) {
    this.easyPassword = easyPassword;
  }

  public EntitiesUser salt(String salt) {
    this.salt = salt;
    return this;
  }

   /**
   * Get salt
   * @return salt
  **/
  @Schema(description = "")
  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public EntitiesUser connectUserName(String connectUserName) {
    this.connectUserName = connectUserName;
    return this;
  }

   /**
   * Get connectUserName
   * @return connectUserName
  **/
  @Schema(description = "")
  public String getConnectUserName() {
    return connectUserName;
  }

  public void setConnectUserName(String connectUserName) {
    this.connectUserName = connectUserName;
  }

  public EntitiesUser connectUserId(String connectUserId) {
    this.connectUserId = connectUserId;
    return this;
  }

   /**
   * Get connectUserId
   * @return connectUserId
  **/
  @Schema(description = "")
  public String getConnectUserId() {
    return connectUserId;
  }

  public void setConnectUserId(String connectUserId) {
    this.connectUserId = connectUserId;
  }

  public EntitiesUser connectLinkType(ConnectUserLinkType connectLinkType) {
    this.connectLinkType = connectLinkType;
    return this;
  }

   /**
   * Get connectLinkType
   * @return connectLinkType
  **/
  @Schema(description = "")
  public ConnectUserLinkType getConnectLinkType() {
    return connectLinkType;
  }

  public void setConnectLinkType(ConnectUserLinkType connectLinkType) {
    this.connectLinkType = connectLinkType;
  }

  public EntitiesUser connectAccessKey(String connectAccessKey) {
    this.connectAccessKey = connectAccessKey;
    return this;
  }

   /**
   * Get connectAccessKey
   * @return connectAccessKey
  **/
  @Schema(description = "")
  public String getConnectAccessKey() {
    return connectAccessKey;
  }

  public void setConnectAccessKey(String connectAccessKey) {
    this.connectAccessKey = connectAccessKey;
  }

  public EntitiesUser imageInfos(List<EntitiesItemImageInfo> imageInfos) {
    this.imageInfos = imageInfos;
    return this;
  }

  public EntitiesUser addImageInfosItem(EntitiesItemImageInfo imageInfosItem) {
    if (this.imageInfos == null) {
      this.imageInfos = new ArrayList<>();
    }
    this.imageInfos.add(imageInfosItem);
    return this;
  }

   /**
   * Get imageInfos
   * @return imageInfos
  **/
  @Schema(description = "")
  public List<EntitiesItemImageInfo> getImageInfos() {
    return imageInfos;
  }

  public void setImageInfos(List<EntitiesItemImageInfo> imageInfos) {
    this.imageInfos = imageInfos;
  }

  public EntitiesUser name(String name) {
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

  public EntitiesUser lastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
    return this;
  }

   /**
   * The last login date.
   * @return lastLoginDate
  **/
  @Schema(description = "The last login date.")
  public OffsetDateTime getLastLoginDate() {
    return lastLoginDate;
  }

  public void setLastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }

  public EntitiesUser lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * The last activity date.
   * @return lastActivityDate
  **/
  @Schema(description = "The last activity date.")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public EntitiesUser playedPercentage(Double playedPercentage) {
    this.playedPercentage = playedPercentage;
    return this;
  }

   /**
   * Get playedPercentage
   * @return playedPercentage
  **/
  @Schema(description = "")
  public Double getPlayedPercentage() {
    return playedPercentage;
  }

  public void setPlayedPercentage(Double playedPercentage) {
    this.playedPercentage = playedPercentage;
  }

  public EntitiesUser recursiveChildCountEqualsChildCount(Boolean recursiveChildCountEqualsChildCount) {
    this.recursiveChildCountEqualsChildCount = recursiveChildCountEqualsChildCount;
    return this;
  }

   /**
   * Get recursiveChildCountEqualsChildCount
   * @return recursiveChildCountEqualsChildCount
  **/
  @Schema(description = "")
  public Boolean isRecursiveChildCountEqualsChildCount() {
    return recursiveChildCountEqualsChildCount;
  }

  public void setRecursiveChildCountEqualsChildCount(Boolean recursiveChildCountEqualsChildCount) {
    this.recursiveChildCountEqualsChildCount = recursiveChildCountEqualsChildCount;
  }

  public EntitiesUser originalParsedName(String originalParsedName) {
    this.originalParsedName = originalParsedName;
    return this;
  }

   /**
   * Internal use only
   * @return originalParsedName
  **/
  @Schema(description = "Internal use only")
  public String getOriginalParsedName() {
    return originalParsedName;
  }

  public void setOriginalParsedName(String originalParsedName) {
    this.originalParsedName = originalParsedName;
  }

  public EntitiesUser isNameParsedFromFolder(Boolean isNameParsedFromFolder) {
    this.isNameParsedFromFolder = isNameParsedFromFolder;
    return this;
  }

   /**
   * Internal use only
   * @return isNameParsedFromFolder
  **/
  @Schema(description = "Internal use only")
  public Boolean isIsNameParsedFromFolder() {
    return isNameParsedFromFolder;
  }

  public void setIsNameParsedFromFolder(Boolean isNameParsedFromFolder) {
    this.isNameParsedFromFolder = isNameParsedFromFolder;
  }

  public EntitiesUser dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date created.
   * @return dateCreated
  **/
  @Schema(description = "The date created.")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public EntitiesUser importedCollections(List<LinkedItemInfo> importedCollections) {
    this.importedCollections = importedCollections;
    return this;
  }

  public EntitiesUser addImportedCollectionsItem(LinkedItemInfo importedCollectionsItem) {
    if (this.importedCollections == null) {
      this.importedCollections = new ArrayList<>();
    }
    this.importedCollections.add(importedCollectionsItem);
    return this;
  }

   /**
   * Get importedCollections
   * @return importedCollections
  **/
  @Schema(description = "")
  public List<LinkedItemInfo> getImportedCollections() {
    return importedCollections;
  }

  public void setImportedCollections(List<LinkedItemInfo> importedCollections) {
    this.importedCollections = importedCollections;
  }

  public EntitiesUser resolvedPresentationUniqueKey(String resolvedPresentationUniqueKey) {
    this.resolvedPresentationUniqueKey = resolvedPresentationUniqueKey;
    return this;
  }

   /**
   * Get resolvedPresentationUniqueKey
   * @return resolvedPresentationUniqueKey
  **/
  @Schema(description = "")
  public String getResolvedPresentationUniqueKey() {
    return resolvedPresentationUniqueKey;
  }

  public void setResolvedPresentationUniqueKey(String resolvedPresentationUniqueKey) {
    this.resolvedPresentationUniqueKey = resolvedPresentationUniqueKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitiesUser entitiesUser = (EntitiesUser) o;
    return Objects.equals(this.usesIdForConfigurationPath, entitiesUser.usesIdForConfigurationPath) &&
        Objects.equals(this.password, entitiesUser.password) &&
        Objects.equals(this.easyPassword, entitiesUser.easyPassword) &&
        Objects.equals(this.salt, entitiesUser.salt) &&
        Objects.equals(this.connectUserName, entitiesUser.connectUserName) &&
        Objects.equals(this.connectUserId, entitiesUser.connectUserId) &&
        Objects.equals(this.connectLinkType, entitiesUser.connectLinkType) &&
        Objects.equals(this.connectAccessKey, entitiesUser.connectAccessKey) &&
        Objects.equals(this.imageInfos, entitiesUser.imageInfos) &&
        Objects.equals(this.name, entitiesUser.name) &&
        Objects.equals(this.lastLoginDate, entitiesUser.lastLoginDate) &&
        Objects.equals(this.lastActivityDate, entitiesUser.lastActivityDate) &&
        Objects.equals(this.playedPercentage, entitiesUser.playedPercentage) &&
        Objects.equals(this.recursiveChildCountEqualsChildCount, entitiesUser.recursiveChildCountEqualsChildCount) &&
        Objects.equals(this.originalParsedName, entitiesUser.originalParsedName) &&
        Objects.equals(this.isNameParsedFromFolder, entitiesUser.isNameParsedFromFolder) &&
        Objects.equals(this.dateCreated, entitiesUser.dateCreated) &&
        Objects.equals(this.importedCollections, entitiesUser.importedCollections) &&
        Objects.equals(this.resolvedPresentationUniqueKey, entitiesUser.resolvedPresentationUniqueKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usesIdForConfigurationPath, password, easyPassword, salt, connectUserName, connectUserId, connectLinkType, connectAccessKey, imageInfos, name, lastLoginDate, lastActivityDate, playedPercentage, recursiveChildCountEqualsChildCount, originalParsedName, isNameParsedFromFolder, dateCreated, importedCollections, resolvedPresentationUniqueKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesUser {\n");
    
    sb.append("    usesIdForConfigurationPath: ").append(toIndentedString(usesIdForConfigurationPath)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    easyPassword: ").append(toIndentedString(easyPassword)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    connectUserName: ").append(toIndentedString(connectUserName)).append("\n");
    sb.append("    connectUserId: ").append(toIndentedString(connectUserId)).append("\n");
    sb.append("    connectLinkType: ").append(toIndentedString(connectLinkType)).append("\n");
    sb.append("    connectAccessKey: ").append(toIndentedString(connectAccessKey)).append("\n");
    sb.append("    imageInfos: ").append(toIndentedString(imageInfos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    playedPercentage: ").append(toIndentedString(playedPercentage)).append("\n");
    sb.append("    recursiveChildCountEqualsChildCount: ").append(toIndentedString(recursiveChildCountEqualsChildCount)).append("\n");
    sb.append("    originalParsedName: ").append(toIndentedString(originalParsedName)).append("\n");
    sb.append("    isNameParsedFromFolder: ").append(toIndentedString(isNameParsedFromFolder)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    importedCollections: ").append(toIndentedString(importedCollections)).append("\n");
    sb.append("    resolvedPresentationUniqueKey: ").append(toIndentedString(resolvedPresentationUniqueKey)).append("\n");
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
