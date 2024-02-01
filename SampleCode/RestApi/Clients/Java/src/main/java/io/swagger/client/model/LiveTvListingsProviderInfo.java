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
import io.swagger.client.model.NameValuePair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LiveTvListingsProviderInfo
 */


public class LiveTvListingsProviderInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("SetupUrl")
  private String setupUrl = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Username")
  private String username = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("ListingsId")
  private String listingsId = null;

  @SerializedName("ZipCode")
  private String zipCode = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("EnabledTuners")
  private List<String> enabledTuners = null;

  @SerializedName("EnableAllTuners")
  private Boolean enableAllTuners = null;

  @SerializedName("NewsCategories")
  private List<String> newsCategories = null;

  @SerializedName("SportsCategories")
  private List<String> sportsCategories = null;

  @SerializedName("KidsCategories")
  private List<String> kidsCategories = null;

  @SerializedName("MovieCategories")
  private List<String> movieCategories = null;

  @SerializedName("ChannelMappings")
  private List<NameValuePair> channelMappings = null;

  @SerializedName("MoviePrefix")
  private String moviePrefix = null;

  @SerializedName("PreferredLanguage")
  private String preferredLanguage = null;

  @SerializedName("UserAgent")
  private String userAgent = null;

  @SerializedName("DataVersion")
  private String dataVersion = null;

  public LiveTvListingsProviderInfo name(String name) {
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

  public LiveTvListingsProviderInfo setupUrl(String setupUrl) {
    this.setupUrl = setupUrl;
    return this;
  }

   /**
   * Get setupUrl
   * @return setupUrl
  **/
  @Schema(description = "")
  public String getSetupUrl() {
    return setupUrl;
  }

  public void setSetupUrl(String setupUrl) {
    this.setupUrl = setupUrl;
  }

  public LiveTvListingsProviderInfo id(String id) {
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

  public LiveTvListingsProviderInfo type(String type) {
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

  public LiveTvListingsProviderInfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LiveTvListingsProviderInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LiveTvListingsProviderInfo listingsId(String listingsId) {
    this.listingsId = listingsId;
    return this;
  }

   /**
   * Get listingsId
   * @return listingsId
  **/
  @Schema(description = "")
  public String getListingsId() {
    return listingsId;
  }

  public void setListingsId(String listingsId) {
    this.listingsId = listingsId;
  }

  public LiveTvListingsProviderInfo zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @Schema(description = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public LiveTvListingsProviderInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LiveTvListingsProviderInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public LiveTvListingsProviderInfo enabledTuners(List<String> enabledTuners) {
    this.enabledTuners = enabledTuners;
    return this;
  }

  public LiveTvListingsProviderInfo addEnabledTunersItem(String enabledTunersItem) {
    if (this.enabledTuners == null) {
      this.enabledTuners = new ArrayList<String>();
    }
    this.enabledTuners.add(enabledTunersItem);
    return this;
  }

   /**
   * Get enabledTuners
   * @return enabledTuners
  **/
  @Schema(description = "")
  public List<String> getEnabledTuners() {
    return enabledTuners;
  }

  public void setEnabledTuners(List<String> enabledTuners) {
    this.enabledTuners = enabledTuners;
  }

  public LiveTvListingsProviderInfo enableAllTuners(Boolean enableAllTuners) {
    this.enableAllTuners = enableAllTuners;
    return this;
  }

   /**
   * Get enableAllTuners
   * @return enableAllTuners
  **/
  @Schema(description = "")
  public Boolean isEnableAllTuners() {
    return enableAllTuners;
  }

  public void setEnableAllTuners(Boolean enableAllTuners) {
    this.enableAllTuners = enableAllTuners;
  }

  public LiveTvListingsProviderInfo newsCategories(List<String> newsCategories) {
    this.newsCategories = newsCategories;
    return this;
  }

  public LiveTvListingsProviderInfo addNewsCategoriesItem(String newsCategoriesItem) {
    if (this.newsCategories == null) {
      this.newsCategories = new ArrayList<String>();
    }
    this.newsCategories.add(newsCategoriesItem);
    return this;
  }

   /**
   * Get newsCategories
   * @return newsCategories
  **/
  @Schema(description = "")
  public List<String> getNewsCategories() {
    return newsCategories;
  }

  public void setNewsCategories(List<String> newsCategories) {
    this.newsCategories = newsCategories;
  }

  public LiveTvListingsProviderInfo sportsCategories(List<String> sportsCategories) {
    this.sportsCategories = sportsCategories;
    return this;
  }

  public LiveTvListingsProviderInfo addSportsCategoriesItem(String sportsCategoriesItem) {
    if (this.sportsCategories == null) {
      this.sportsCategories = new ArrayList<String>();
    }
    this.sportsCategories.add(sportsCategoriesItem);
    return this;
  }

   /**
   * Get sportsCategories
   * @return sportsCategories
  **/
  @Schema(description = "")
  public List<String> getSportsCategories() {
    return sportsCategories;
  }

  public void setSportsCategories(List<String> sportsCategories) {
    this.sportsCategories = sportsCategories;
  }

  public LiveTvListingsProviderInfo kidsCategories(List<String> kidsCategories) {
    this.kidsCategories = kidsCategories;
    return this;
  }

  public LiveTvListingsProviderInfo addKidsCategoriesItem(String kidsCategoriesItem) {
    if (this.kidsCategories == null) {
      this.kidsCategories = new ArrayList<String>();
    }
    this.kidsCategories.add(kidsCategoriesItem);
    return this;
  }

   /**
   * Get kidsCategories
   * @return kidsCategories
  **/
  @Schema(description = "")
  public List<String> getKidsCategories() {
    return kidsCategories;
  }

  public void setKidsCategories(List<String> kidsCategories) {
    this.kidsCategories = kidsCategories;
  }

  public LiveTvListingsProviderInfo movieCategories(List<String> movieCategories) {
    this.movieCategories = movieCategories;
    return this;
  }

  public LiveTvListingsProviderInfo addMovieCategoriesItem(String movieCategoriesItem) {
    if (this.movieCategories == null) {
      this.movieCategories = new ArrayList<String>();
    }
    this.movieCategories.add(movieCategoriesItem);
    return this;
  }

   /**
   * Get movieCategories
   * @return movieCategories
  **/
  @Schema(description = "")
  public List<String> getMovieCategories() {
    return movieCategories;
  }

  public void setMovieCategories(List<String> movieCategories) {
    this.movieCategories = movieCategories;
  }

  public LiveTvListingsProviderInfo channelMappings(List<NameValuePair> channelMappings) {
    this.channelMappings = channelMappings;
    return this;
  }

  public LiveTvListingsProviderInfo addChannelMappingsItem(NameValuePair channelMappingsItem) {
    if (this.channelMappings == null) {
      this.channelMappings = new ArrayList<NameValuePair>();
    }
    this.channelMappings.add(channelMappingsItem);
    return this;
  }

   /**
   * Get channelMappings
   * @return channelMappings
  **/
  @Schema(description = "")
  public List<NameValuePair> getChannelMappings() {
    return channelMappings;
  }

  public void setChannelMappings(List<NameValuePair> channelMappings) {
    this.channelMappings = channelMappings;
  }

  public LiveTvListingsProviderInfo moviePrefix(String moviePrefix) {
    this.moviePrefix = moviePrefix;
    return this;
  }

   /**
   * Get moviePrefix
   * @return moviePrefix
  **/
  @Schema(description = "")
  public String getMoviePrefix() {
    return moviePrefix;
  }

  public void setMoviePrefix(String moviePrefix) {
    this.moviePrefix = moviePrefix;
  }

  public LiveTvListingsProviderInfo preferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
    return this;
  }

   /**
   * Get preferredLanguage
   * @return preferredLanguage
  **/
  @Schema(description = "")
  public String getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  public LiveTvListingsProviderInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @Schema(description = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public LiveTvListingsProviderInfo dataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @Schema(description = "")
  public String getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTvListingsProviderInfo liveTvListingsProviderInfo = (LiveTvListingsProviderInfo) o;
    return Objects.equals(this.name, liveTvListingsProviderInfo.name) &&
        Objects.equals(this.setupUrl, liveTvListingsProviderInfo.setupUrl) &&
        Objects.equals(this.id, liveTvListingsProviderInfo.id) &&
        Objects.equals(this.type, liveTvListingsProviderInfo.type) &&
        Objects.equals(this.username, liveTvListingsProviderInfo.username) &&
        Objects.equals(this.password, liveTvListingsProviderInfo.password) &&
        Objects.equals(this.listingsId, liveTvListingsProviderInfo.listingsId) &&
        Objects.equals(this.zipCode, liveTvListingsProviderInfo.zipCode) &&
        Objects.equals(this.country, liveTvListingsProviderInfo.country) &&
        Objects.equals(this.path, liveTvListingsProviderInfo.path) &&
        Objects.equals(this.enabledTuners, liveTvListingsProviderInfo.enabledTuners) &&
        Objects.equals(this.enableAllTuners, liveTvListingsProviderInfo.enableAllTuners) &&
        Objects.equals(this.newsCategories, liveTvListingsProviderInfo.newsCategories) &&
        Objects.equals(this.sportsCategories, liveTvListingsProviderInfo.sportsCategories) &&
        Objects.equals(this.kidsCategories, liveTvListingsProviderInfo.kidsCategories) &&
        Objects.equals(this.movieCategories, liveTvListingsProviderInfo.movieCategories) &&
        Objects.equals(this.channelMappings, liveTvListingsProviderInfo.channelMappings) &&
        Objects.equals(this.moviePrefix, liveTvListingsProviderInfo.moviePrefix) &&
        Objects.equals(this.preferredLanguage, liveTvListingsProviderInfo.preferredLanguage) &&
        Objects.equals(this.userAgent, liveTvListingsProviderInfo.userAgent) &&
        Objects.equals(this.dataVersion, liveTvListingsProviderInfo.dataVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, setupUrl, id, type, username, password, listingsId, zipCode, country, path, enabledTuners, enableAllTuners, newsCategories, sportsCategories, kidsCategories, movieCategories, channelMappings, moviePrefix, preferredLanguage, userAgent, dataVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTvListingsProviderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    setupUrl: ").append(toIndentedString(setupUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    listingsId: ").append(toIndentedString(listingsId)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    enabledTuners: ").append(toIndentedString(enabledTuners)).append("\n");
    sb.append("    enableAllTuners: ").append(toIndentedString(enableAllTuners)).append("\n");
    sb.append("    newsCategories: ").append(toIndentedString(newsCategories)).append("\n");
    sb.append("    sportsCategories: ").append(toIndentedString(sportsCategories)).append("\n");
    sb.append("    kidsCategories: ").append(toIndentedString(kidsCategories)).append("\n");
    sb.append("    movieCategories: ").append(toIndentedString(movieCategories)).append("\n");
    sb.append("    channelMappings: ").append(toIndentedString(channelMappings)).append("\n");
    sb.append("    moviePrefix: ").append(toIndentedString(moviePrefix)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
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
