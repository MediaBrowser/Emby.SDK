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
import io.swagger.client.model.ImageSavingConvention;
import io.swagger.client.model.NetSocketsAddressFamily;
import io.swagger.client.model.PathSubstitution;
import io.swagger.client.model.ProxyHeaderMode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents the server configuration.  
 */
@Schema(description = "Represents the server configuration.  ")

public class ServerConfiguration {
  @SerializedName("EnableUPnP")
  private Boolean enableUPnP = null;

  @SerializedName("PublicPort")
  private Integer publicPort = null;

  @SerializedName("PublicHttpsPort")
  private Integer publicHttpsPort = null;

  @SerializedName("HttpServerPortNumber")
  private Integer httpServerPortNumber = null;

  @SerializedName("HttpsPortNumber")
  private Integer httpsPortNumber = null;

  @SerializedName("EnableHttps")
  private Boolean enableHttps = null;

  @SerializedName("CertificatePath")
  private String certificatePath = null;

  @SerializedName("CertificatePassword")
  private String certificatePassword = null;

  @SerializedName("IsPortAuthorized")
  private Boolean isPortAuthorized = null;

  @SerializedName("AutoRunWebApp")
  private Boolean autoRunWebApp = null;

  @SerializedName("EnableRemoteAccess")
  private Boolean enableRemoteAccess = null;

  @SerializedName("LogAllQueryTimes")
  private Boolean logAllQueryTimes = null;

  @SerializedName("EnableCaseSensitiveItemIds")
  private Boolean enableCaseSensitiveItemIds = null;

  @SerializedName("MetadataPath")
  private String metadataPath = null;

  @SerializedName("MetadataNetworkPath")
  private String metadataNetworkPath = null;

  @SerializedName("PreferredMetadataLanguage")
  private String preferredMetadataLanguage = null;

  @SerializedName("MetadataCountryCode")
  private String metadataCountryCode = null;

  @SerializedName("SortRemoveWords")
  private List<String> sortRemoveWords = null;

  @SerializedName("LibraryMonitorDelaySeconds")
  private Integer libraryMonitorDelaySeconds = null;

  @SerializedName("EnableDashboardResponseCaching")
  private Boolean enableDashboardResponseCaching = null;

  @SerializedName("DashboardSourcePath")
  private String dashboardSourcePath = null;

  @SerializedName("ImageSavingConvention")
  private ImageSavingConvention imageSavingConvention = null;

  @SerializedName("EnableAutomaticRestart")
  private Boolean enableAutomaticRestart = null;

  @SerializedName("ServerName")
  private String serverName = null;

  @SerializedName("PreferredDetectedRemoteAddressFamily")
  private NetSocketsAddressFamily preferredDetectedRemoteAddressFamily = null;

  @SerializedName("WanDdns")
  private String wanDdns = null;

  @SerializedName("UICulture")
  private String uiCulture = null;

  @SerializedName("RemoteClientBitrateLimit")
  private Integer remoteClientBitrateLimit = null;

  @SerializedName("LocalNetworkSubnets")
  private List<String> localNetworkSubnets = null;

  @SerializedName("LocalNetworkAddresses")
  private List<String> localNetworkAddresses = null;

  @SerializedName("EnableExternalContentInSuggestions")
  private Boolean enableExternalContentInSuggestions = null;

  @SerializedName("RequireHttps")
  private Boolean requireHttps = null;

  @SerializedName("IsBehindProxy")
  private Boolean isBehindProxy = null;

  @SerializedName("RemoteIPFilter")
  private List<String> remoteIPFilter = null;

  @SerializedName("IsRemoteIPFilterBlacklist")
  private Boolean isRemoteIPFilterBlacklist = null;

  @SerializedName("ImageExtractionTimeoutMs")
  private Integer imageExtractionTimeoutMs = null;

  @SerializedName("PathSubstitutions")
  private List<PathSubstitution> pathSubstitutions = null;

  @SerializedName("UninstalledPlugins")
  private List<String> uninstalledPlugins = null;

  @SerializedName("CollapseVideoFolders")
  private Boolean collapseVideoFolders = null;

  @SerializedName("EnableOriginalTrackTitles")
  private Boolean enableOriginalTrackTitles = null;

  @SerializedName("VacuumDatabaseOnStartup")
  private Boolean vacuumDatabaseOnStartup = null;

  @SerializedName("SimultaneousStreamLimit")
  private Integer simultaneousStreamLimit = null;

  @SerializedName("DatabaseCacheSizeMB")
  private Integer databaseCacheSizeMB = null;

  @SerializedName("EnableSqLiteMmio")
  private Boolean enableSqLiteMmio = null;

  @SerializedName("PlaylistsUpgradedToM3U")
  private Boolean playlistsUpgradedToM3U = null;

  @SerializedName("ImageExtractorUpgraded1")
  private Boolean imageExtractorUpgraded1 = null;

  @SerializedName("EnablePeopleLetterSubFolders")
  private Boolean enablePeopleLetterSubFolders = null;

  @SerializedName("OptimizeDatabaseOnShutdown")
  private Boolean optimizeDatabaseOnShutdown = null;

  @SerializedName("DatabaseAnalysisLimit")
  private Integer databaseAnalysisLimit = null;

  @SerializedName("DisableAsyncIO")
  private Boolean disableAsyncIO = null;

  @SerializedName("MigratedToUserItemShares8")
  private Boolean migratedToUserItemShares8 = null;

  @SerializedName("MigratedLibraryOptionsToDb")
  private Boolean migratedLibraryOptionsToDb = null;

  @SerializedName("AllowLegacyLocalNetworkPassword")
  private Boolean allowLegacyLocalNetworkPassword = null;

  @SerializedName("EnableSavedMetadataForPeople")
  private Boolean enableSavedMetadataForPeople = null;

  @SerializedName("TvChannelsRefreshed")
  private Boolean tvChannelsRefreshed = null;

  @SerializedName("ProxyHeaderMode")
  private ProxyHeaderMode proxyHeaderMode = null;

  @SerializedName("EnableDebugLevelLogging")
  private Boolean enableDebugLevelLogging = null;

  @SerializedName("RevertDebugLogging")
  private String revertDebugLogging = null;

  @SerializedName("EnableAutoUpdate")
  private Boolean enableAutoUpdate = null;

  @SerializedName("LogFileRetentionDays")
  private Integer logFileRetentionDays = null;

  @SerializedName("RunAtStartup")
  private Boolean runAtStartup = null;

  @SerializedName("IsStartupWizardCompleted")
  private Boolean isStartupWizardCompleted = null;

  @SerializedName("CachePath")
  private String cachePath = null;

  public ServerConfiguration enableUPnP(Boolean enableUPnP) {
    this.enableUPnP = enableUPnP;
    return this;
  }

   /**
   * A value indicating whether \\[enable u pn p\\].
   * @return enableUPnP
  **/
  @Schema(description = "A value indicating whether \\[enable u pn p\\].")
  public Boolean isEnableUPnP() {
    return enableUPnP;
  }

  public void setEnableUPnP(Boolean enableUPnP) {
    this.enableUPnP = enableUPnP;
  }

  public ServerConfiguration publicPort(Integer publicPort) {
    this.publicPort = publicPort;
    return this;
  }

   /**
   * The public mapped port.
   * @return publicPort
  **/
  @Schema(description = "The public mapped port.")
  public Integer getPublicPort() {
    return publicPort;
  }

  public void setPublicPort(Integer publicPort) {
    this.publicPort = publicPort;
  }

  public ServerConfiguration publicHttpsPort(Integer publicHttpsPort) {
    this.publicHttpsPort = publicHttpsPort;
    return this;
  }

   /**
   * The public HTTPS port.
   * @return publicHttpsPort
  **/
  @Schema(description = "The public HTTPS port.")
  public Integer getPublicHttpsPort() {
    return publicHttpsPort;
  }

  public void setPublicHttpsPort(Integer publicHttpsPort) {
    this.publicHttpsPort = publicHttpsPort;
  }

  public ServerConfiguration httpServerPortNumber(Integer httpServerPortNumber) {
    this.httpServerPortNumber = httpServerPortNumber;
    return this;
  }

   /**
   * The HTTP server port number.
   * @return httpServerPortNumber
  **/
  @Schema(description = "The HTTP server port number.")
  public Integer getHttpServerPortNumber() {
    return httpServerPortNumber;
  }

  public void setHttpServerPortNumber(Integer httpServerPortNumber) {
    this.httpServerPortNumber = httpServerPortNumber;
  }

  public ServerConfiguration httpsPortNumber(Integer httpsPortNumber) {
    this.httpsPortNumber = httpsPortNumber;
    return this;
  }

   /**
   * The HTTPS server port number.
   * @return httpsPortNumber
  **/
  @Schema(description = "The HTTPS server port number.")
  public Integer getHttpsPortNumber() {
    return httpsPortNumber;
  }

  public void setHttpsPortNumber(Integer httpsPortNumber) {
    this.httpsPortNumber = httpsPortNumber;
  }

  public ServerConfiguration enableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
    return this;
  }

   /**
   * A value indicating whether \\[use HTTPS\\].
   * @return enableHttps
  **/
  @Schema(description = "A value indicating whether \\[use HTTPS\\].")
  public Boolean isEnableHttps() {
    return enableHttps;
  }

  public void setEnableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
  }

  public ServerConfiguration certificatePath(String certificatePath) {
    this.certificatePath = certificatePath;
    return this;
  }

   /**
   * The value pointing to the file system where the ssl certiifcate is located..
   * @return certificatePath
  **/
  @Schema(description = "The value pointing to the file system where the ssl certiifcate is located..")
  public String getCertificatePath() {
    return certificatePath;
  }

  public void setCertificatePath(String certificatePath) {
    this.certificatePath = certificatePath;
  }

  public ServerConfiguration certificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
    return this;
  }

   /**
   * Get certificatePassword
   * @return certificatePassword
  **/
  @Schema(description = "")
  public String getCertificatePassword() {
    return certificatePassword;
  }

  public void setCertificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
  }

  public ServerConfiguration isPortAuthorized(Boolean isPortAuthorized) {
    this.isPortAuthorized = isPortAuthorized;
    return this;
  }

   /**
   * A value indicating whether this instance is port authorized.
   * @return isPortAuthorized
  **/
  @Schema(description = "A value indicating whether this instance is port authorized.")
  public Boolean isIsPortAuthorized() {
    return isPortAuthorized;
  }

  public void setIsPortAuthorized(Boolean isPortAuthorized) {
    this.isPortAuthorized = isPortAuthorized;
  }

  public ServerConfiguration autoRunWebApp(Boolean autoRunWebApp) {
    this.autoRunWebApp = autoRunWebApp;
    return this;
  }

   /**
   * Get autoRunWebApp
   * @return autoRunWebApp
  **/
  @Schema(description = "")
  public Boolean isAutoRunWebApp() {
    return autoRunWebApp;
  }

  public void setAutoRunWebApp(Boolean autoRunWebApp) {
    this.autoRunWebApp = autoRunWebApp;
  }

  public ServerConfiguration enableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
    return this;
  }

   /**
   * Get enableRemoteAccess
   * @return enableRemoteAccess
  **/
  @Schema(description = "")
  public Boolean isEnableRemoteAccess() {
    return enableRemoteAccess;
  }

  public void setEnableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
  }

  public ServerConfiguration logAllQueryTimes(Boolean logAllQueryTimes) {
    this.logAllQueryTimes = logAllQueryTimes;
    return this;
  }

   /**
   * Get logAllQueryTimes
   * @return logAllQueryTimes
  **/
  @Schema(description = "")
  public Boolean isLogAllQueryTimes() {
    return logAllQueryTimes;
  }

  public void setLogAllQueryTimes(Boolean logAllQueryTimes) {
    this.logAllQueryTimes = logAllQueryTimes;
  }

  public ServerConfiguration enableCaseSensitiveItemIds(Boolean enableCaseSensitiveItemIds) {
    this.enableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
    return this;
  }

   /**
   * A value indicating whether \\[enable case sensitive item ids\\].
   * @return enableCaseSensitiveItemIds
  **/
  @Schema(description = "A value indicating whether \\[enable case sensitive item ids\\].")
  public Boolean isEnableCaseSensitiveItemIds() {
    return enableCaseSensitiveItemIds;
  }

  public void setEnableCaseSensitiveItemIds(Boolean enableCaseSensitiveItemIds) {
    this.enableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
  }

  public ServerConfiguration metadataPath(String metadataPath) {
    this.metadataPath = metadataPath;
    return this;
  }

   /**
   * The metadata path.
   * @return metadataPath
  **/
  @Schema(description = "The metadata path.")
  public String getMetadataPath() {
    return metadataPath;
  }

  public void setMetadataPath(String metadataPath) {
    this.metadataPath = metadataPath;
  }

  public ServerConfiguration metadataNetworkPath(String metadataNetworkPath) {
    this.metadataNetworkPath = metadataNetworkPath;
    return this;
  }

   /**
   * Get metadataNetworkPath
   * @return metadataNetworkPath
  **/
  @Schema(description = "")
  public String getMetadataNetworkPath() {
    return metadataNetworkPath;
  }

  public void setMetadataNetworkPath(String metadataNetworkPath) {
    this.metadataNetworkPath = metadataNetworkPath;
  }

  public ServerConfiguration preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
    return this;
  }

   /**
   * The preferred metadata language.
   * @return preferredMetadataLanguage
  **/
  @Schema(description = "The preferred metadata language.")
  public String getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public ServerConfiguration metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
    return this;
  }

   /**
   * The metadata country code.
   * @return metadataCountryCode
  **/
  @Schema(description = "The metadata country code.")
  public String getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public ServerConfiguration sortRemoveWords(List<String> sortRemoveWords) {
    this.sortRemoveWords = sortRemoveWords;
    return this;
  }

  public ServerConfiguration addSortRemoveWordsItem(String sortRemoveWordsItem) {
    if (this.sortRemoveWords == null) {
      this.sortRemoveWords = new ArrayList<String>();
    }
    this.sortRemoveWords.add(sortRemoveWordsItem);
    return this;
  }

   /**
   * Words to be removed from strings to create a sort name
   * @return sortRemoveWords
  **/
  @Schema(description = "Words to be removed from strings to create a sort name")
  public List<String> getSortRemoveWords() {
    return sortRemoveWords;
  }

  public void setSortRemoveWords(List<String> sortRemoveWords) {
    this.sortRemoveWords = sortRemoveWords;
  }

  public ServerConfiguration libraryMonitorDelaySeconds(Integer libraryMonitorDelaySeconds) {
    this.libraryMonitorDelaySeconds = libraryMonitorDelaySeconds;
    return this;
  }

   /**
   * The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files.
   * @return libraryMonitorDelaySeconds
  **/
  @Schema(description = "The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files.")
  public Integer getLibraryMonitorDelaySeconds() {
    return libraryMonitorDelaySeconds;
  }

  public void setLibraryMonitorDelaySeconds(Integer libraryMonitorDelaySeconds) {
    this.libraryMonitorDelaySeconds = libraryMonitorDelaySeconds;
  }

  public ServerConfiguration enableDashboardResponseCaching(Boolean enableDashboardResponseCaching) {
    this.enableDashboardResponseCaching = enableDashboardResponseCaching;
    return this;
  }

   /**
   * A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes.
   * @return enableDashboardResponseCaching
  **/
  @Schema(description = "A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes.")
  public Boolean isEnableDashboardResponseCaching() {
    return enableDashboardResponseCaching;
  }

  public void setEnableDashboardResponseCaching(Boolean enableDashboardResponseCaching) {
    this.enableDashboardResponseCaching = enableDashboardResponseCaching;
  }

  public ServerConfiguration dashboardSourcePath(String dashboardSourcePath) {
    this.dashboardSourcePath = dashboardSourcePath;
    return this;
  }

   /**
   * Allows the dashboard to be served from a custom path.
   * @return dashboardSourcePath
  **/
  @Schema(description = "Allows the dashboard to be served from a custom path.")
  public String getDashboardSourcePath() {
    return dashboardSourcePath;
  }

  public void setDashboardSourcePath(String dashboardSourcePath) {
    this.dashboardSourcePath = dashboardSourcePath;
  }

  public ServerConfiguration imageSavingConvention(ImageSavingConvention imageSavingConvention) {
    this.imageSavingConvention = imageSavingConvention;
    return this;
  }

   /**
   * Get imageSavingConvention
   * @return imageSavingConvention
  **/
  @Schema(description = "")
  public ImageSavingConvention getImageSavingConvention() {
    return imageSavingConvention;
  }

  public void setImageSavingConvention(ImageSavingConvention imageSavingConvention) {
    this.imageSavingConvention = imageSavingConvention;
  }

  public ServerConfiguration enableAutomaticRestart(Boolean enableAutomaticRestart) {
    this.enableAutomaticRestart = enableAutomaticRestart;
    return this;
  }

   /**
   * Get enableAutomaticRestart
   * @return enableAutomaticRestart
  **/
  @Schema(description = "")
  public Boolean isEnableAutomaticRestart() {
    return enableAutomaticRestart;
  }

  public void setEnableAutomaticRestart(Boolean enableAutomaticRestart) {
    this.enableAutomaticRestart = enableAutomaticRestart;
  }

  public ServerConfiguration serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @Schema(description = "")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public ServerConfiguration preferredDetectedRemoteAddressFamily(NetSocketsAddressFamily preferredDetectedRemoteAddressFamily) {
    this.preferredDetectedRemoteAddressFamily = preferredDetectedRemoteAddressFamily;
    return this;
  }

   /**
   * Get preferredDetectedRemoteAddressFamily
   * @return preferredDetectedRemoteAddressFamily
  **/
  @Schema(description = "")
  public NetSocketsAddressFamily getPreferredDetectedRemoteAddressFamily() {
    return preferredDetectedRemoteAddressFamily;
  }

  public void setPreferredDetectedRemoteAddressFamily(NetSocketsAddressFamily preferredDetectedRemoteAddressFamily) {
    this.preferredDetectedRemoteAddressFamily = preferredDetectedRemoteAddressFamily;
  }

  public ServerConfiguration wanDdns(String wanDdns) {
    this.wanDdns = wanDdns;
    return this;
  }

   /**
   * Get wanDdns
   * @return wanDdns
  **/
  @Schema(description = "")
  public String getWanDdns() {
    return wanDdns;
  }

  public void setWanDdns(String wanDdns) {
    this.wanDdns = wanDdns;
  }

  public ServerConfiguration uiCulture(String uiCulture) {
    this.uiCulture = uiCulture;
    return this;
  }

   /**
   * Get uiCulture
   * @return uiCulture
  **/
  @Schema(description = "")
  public String getUiCulture() {
    return uiCulture;
  }

  public void setUiCulture(String uiCulture) {
    this.uiCulture = uiCulture;
  }

  public ServerConfiguration remoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
    this.remoteClientBitrateLimit = remoteClientBitrateLimit;
    return this;
  }

   /**
   * Get remoteClientBitrateLimit
   * @return remoteClientBitrateLimit
  **/
  @Schema(description = "")
  public Integer getRemoteClientBitrateLimit() {
    return remoteClientBitrateLimit;
  }

  public void setRemoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
    this.remoteClientBitrateLimit = remoteClientBitrateLimit;
  }

  public ServerConfiguration localNetworkSubnets(List<String> localNetworkSubnets) {
    this.localNetworkSubnets = localNetworkSubnets;
    return this;
  }

  public ServerConfiguration addLocalNetworkSubnetsItem(String localNetworkSubnetsItem) {
    if (this.localNetworkSubnets == null) {
      this.localNetworkSubnets = new ArrayList<String>();
    }
    this.localNetworkSubnets.add(localNetworkSubnetsItem);
    return this;
  }

   /**
   * Get localNetworkSubnets
   * @return localNetworkSubnets
  **/
  @Schema(description = "")
  public List<String> getLocalNetworkSubnets() {
    return localNetworkSubnets;
  }

  public void setLocalNetworkSubnets(List<String> localNetworkSubnets) {
    this.localNetworkSubnets = localNetworkSubnets;
  }

  public ServerConfiguration localNetworkAddresses(List<String> localNetworkAddresses) {
    this.localNetworkAddresses = localNetworkAddresses;
    return this;
  }

  public ServerConfiguration addLocalNetworkAddressesItem(String localNetworkAddressesItem) {
    if (this.localNetworkAddresses == null) {
      this.localNetworkAddresses = new ArrayList<String>();
    }
    this.localNetworkAddresses.add(localNetworkAddressesItem);
    return this;
  }

   /**
   * Get localNetworkAddresses
   * @return localNetworkAddresses
  **/
  @Schema(description = "")
  public List<String> getLocalNetworkAddresses() {
    return localNetworkAddresses;
  }

  public void setLocalNetworkAddresses(List<String> localNetworkAddresses) {
    this.localNetworkAddresses = localNetworkAddresses;
  }

  public ServerConfiguration enableExternalContentInSuggestions(Boolean enableExternalContentInSuggestions) {
    this.enableExternalContentInSuggestions = enableExternalContentInSuggestions;
    return this;
  }

   /**
   * Get enableExternalContentInSuggestions
   * @return enableExternalContentInSuggestions
  **/
  @Schema(description = "")
  public Boolean isEnableExternalContentInSuggestions() {
    return enableExternalContentInSuggestions;
  }

  public void setEnableExternalContentInSuggestions(Boolean enableExternalContentInSuggestions) {
    this.enableExternalContentInSuggestions = enableExternalContentInSuggestions;
  }

  public ServerConfiguration requireHttps(Boolean requireHttps) {
    this.requireHttps = requireHttps;
    return this;
  }

   /**
   * Get requireHttps
   * @return requireHttps
  **/
  @Schema(description = "")
  public Boolean isRequireHttps() {
    return requireHttps;
  }

  public void setRequireHttps(Boolean requireHttps) {
    this.requireHttps = requireHttps;
  }

  public ServerConfiguration isBehindProxy(Boolean isBehindProxy) {
    this.isBehindProxy = isBehindProxy;
    return this;
  }

   /**
   * Get isBehindProxy
   * @return isBehindProxy
  **/
  @Schema(description = "")
  public Boolean isIsBehindProxy() {
    return isBehindProxy;
  }

  public void setIsBehindProxy(Boolean isBehindProxy) {
    this.isBehindProxy = isBehindProxy;
  }

  public ServerConfiguration remoteIPFilter(List<String> remoteIPFilter) {
    this.remoteIPFilter = remoteIPFilter;
    return this;
  }

  public ServerConfiguration addRemoteIPFilterItem(String remoteIPFilterItem) {
    if (this.remoteIPFilter == null) {
      this.remoteIPFilter = new ArrayList<String>();
    }
    this.remoteIPFilter.add(remoteIPFilterItem);
    return this;
  }

   /**
   * Get remoteIPFilter
   * @return remoteIPFilter
  **/
  @Schema(description = "")
  public List<String> getRemoteIPFilter() {
    return remoteIPFilter;
  }

  public void setRemoteIPFilter(List<String> remoteIPFilter) {
    this.remoteIPFilter = remoteIPFilter;
  }

  public ServerConfiguration isRemoteIPFilterBlacklist(Boolean isRemoteIPFilterBlacklist) {
    this.isRemoteIPFilterBlacklist = isRemoteIPFilterBlacklist;
    return this;
  }

   /**
   * Get isRemoteIPFilterBlacklist
   * @return isRemoteIPFilterBlacklist
  **/
  @Schema(description = "")
  public Boolean isIsRemoteIPFilterBlacklist() {
    return isRemoteIPFilterBlacklist;
  }

  public void setIsRemoteIPFilterBlacklist(Boolean isRemoteIPFilterBlacklist) {
    this.isRemoteIPFilterBlacklist = isRemoteIPFilterBlacklist;
  }

  public ServerConfiguration imageExtractionTimeoutMs(Integer imageExtractionTimeoutMs) {
    this.imageExtractionTimeoutMs = imageExtractionTimeoutMs;
    return this;
  }

   /**
   * Get imageExtractionTimeoutMs
   * @return imageExtractionTimeoutMs
  **/
  @Schema(description = "")
  public Integer getImageExtractionTimeoutMs() {
    return imageExtractionTimeoutMs;
  }

  public void setImageExtractionTimeoutMs(Integer imageExtractionTimeoutMs) {
    this.imageExtractionTimeoutMs = imageExtractionTimeoutMs;
  }

  public ServerConfiguration pathSubstitutions(List<PathSubstitution> pathSubstitutions) {
    this.pathSubstitutions = pathSubstitutions;
    return this;
  }

  public ServerConfiguration addPathSubstitutionsItem(PathSubstitution pathSubstitutionsItem) {
    if (this.pathSubstitutions == null) {
      this.pathSubstitutions = new ArrayList<PathSubstitution>();
    }
    this.pathSubstitutions.add(pathSubstitutionsItem);
    return this;
  }

   /**
   * Get pathSubstitutions
   * @return pathSubstitutions
  **/
  @Schema(description = "")
  public List<PathSubstitution> getPathSubstitutions() {
    return pathSubstitutions;
  }

  public void setPathSubstitutions(List<PathSubstitution> pathSubstitutions) {
    this.pathSubstitutions = pathSubstitutions;
  }

  public ServerConfiguration uninstalledPlugins(List<String> uninstalledPlugins) {
    this.uninstalledPlugins = uninstalledPlugins;
    return this;
  }

  public ServerConfiguration addUninstalledPluginsItem(String uninstalledPluginsItem) {
    if (this.uninstalledPlugins == null) {
      this.uninstalledPlugins = new ArrayList<String>();
    }
    this.uninstalledPlugins.add(uninstalledPluginsItem);
    return this;
  }

   /**
   * Get uninstalledPlugins
   * @return uninstalledPlugins
  **/
  @Schema(description = "")
  public List<String> getUninstalledPlugins() {
    return uninstalledPlugins;
  }

  public void setUninstalledPlugins(List<String> uninstalledPlugins) {
    this.uninstalledPlugins = uninstalledPlugins;
  }

  public ServerConfiguration collapseVideoFolders(Boolean collapseVideoFolders) {
    this.collapseVideoFolders = collapseVideoFolders;
    return this;
  }

   /**
   * Get collapseVideoFolders
   * @return collapseVideoFolders
  **/
  @Schema(description = "")
  public Boolean isCollapseVideoFolders() {
    return collapseVideoFolders;
  }

  public void setCollapseVideoFolders(Boolean collapseVideoFolders) {
    this.collapseVideoFolders = collapseVideoFolders;
  }

  public ServerConfiguration enableOriginalTrackTitles(Boolean enableOriginalTrackTitles) {
    this.enableOriginalTrackTitles = enableOriginalTrackTitles;
    return this;
  }

   /**
   * Get enableOriginalTrackTitles
   * @return enableOriginalTrackTitles
  **/
  @Schema(description = "")
  public Boolean isEnableOriginalTrackTitles() {
    return enableOriginalTrackTitles;
  }

  public void setEnableOriginalTrackTitles(Boolean enableOriginalTrackTitles) {
    this.enableOriginalTrackTitles = enableOriginalTrackTitles;
  }

  public ServerConfiguration vacuumDatabaseOnStartup(Boolean vacuumDatabaseOnStartup) {
    this.vacuumDatabaseOnStartup = vacuumDatabaseOnStartup;
    return this;
  }

   /**
   * Get vacuumDatabaseOnStartup
   * @return vacuumDatabaseOnStartup
  **/
  @Schema(description = "")
  public Boolean isVacuumDatabaseOnStartup() {
    return vacuumDatabaseOnStartup;
  }

  public void setVacuumDatabaseOnStartup(Boolean vacuumDatabaseOnStartup) {
    this.vacuumDatabaseOnStartup = vacuumDatabaseOnStartup;
  }

  public ServerConfiguration simultaneousStreamLimit(Integer simultaneousStreamLimit) {
    this.simultaneousStreamLimit = simultaneousStreamLimit;
    return this;
  }

   /**
   * Get simultaneousStreamLimit
   * @return simultaneousStreamLimit
  **/
  @Schema(description = "")
  public Integer getSimultaneousStreamLimit() {
    return simultaneousStreamLimit;
  }

  public void setSimultaneousStreamLimit(Integer simultaneousStreamLimit) {
    this.simultaneousStreamLimit = simultaneousStreamLimit;
  }

  public ServerConfiguration databaseCacheSizeMB(Integer databaseCacheSizeMB) {
    this.databaseCacheSizeMB = databaseCacheSizeMB;
    return this;
  }

   /**
   * Get databaseCacheSizeMB
   * @return databaseCacheSizeMB
  **/
  @Schema(description = "")
  public Integer getDatabaseCacheSizeMB() {
    return databaseCacheSizeMB;
  }

  public void setDatabaseCacheSizeMB(Integer databaseCacheSizeMB) {
    this.databaseCacheSizeMB = databaseCacheSizeMB;
  }

  public ServerConfiguration enableSqLiteMmio(Boolean enableSqLiteMmio) {
    this.enableSqLiteMmio = enableSqLiteMmio;
    return this;
  }

   /**
   * Get enableSqLiteMmio
   * @return enableSqLiteMmio
  **/
  @Schema(description = "")
  public Boolean isEnableSqLiteMmio() {
    return enableSqLiteMmio;
  }

  public void setEnableSqLiteMmio(Boolean enableSqLiteMmio) {
    this.enableSqLiteMmio = enableSqLiteMmio;
  }

  public ServerConfiguration playlistsUpgradedToM3U(Boolean playlistsUpgradedToM3U) {
    this.playlistsUpgradedToM3U = playlistsUpgradedToM3U;
    return this;
  }

   /**
   * Get playlistsUpgradedToM3U
   * @return playlistsUpgradedToM3U
  **/
  @Schema(description = "")
  public Boolean isPlaylistsUpgradedToM3U() {
    return playlistsUpgradedToM3U;
  }

  public void setPlaylistsUpgradedToM3U(Boolean playlistsUpgradedToM3U) {
    this.playlistsUpgradedToM3U = playlistsUpgradedToM3U;
  }

  public ServerConfiguration imageExtractorUpgraded1(Boolean imageExtractorUpgraded1) {
    this.imageExtractorUpgraded1 = imageExtractorUpgraded1;
    return this;
  }

   /**
   * Get imageExtractorUpgraded1
   * @return imageExtractorUpgraded1
  **/
  @Schema(description = "")
  public Boolean isImageExtractorUpgraded1() {
    return imageExtractorUpgraded1;
  }

  public void setImageExtractorUpgraded1(Boolean imageExtractorUpgraded1) {
    this.imageExtractorUpgraded1 = imageExtractorUpgraded1;
  }

  public ServerConfiguration enablePeopleLetterSubFolders(Boolean enablePeopleLetterSubFolders) {
    this.enablePeopleLetterSubFolders = enablePeopleLetterSubFolders;
    return this;
  }

   /**
   * Get enablePeopleLetterSubFolders
   * @return enablePeopleLetterSubFolders
  **/
  @Schema(description = "")
  public Boolean isEnablePeopleLetterSubFolders() {
    return enablePeopleLetterSubFolders;
  }

  public void setEnablePeopleLetterSubFolders(Boolean enablePeopleLetterSubFolders) {
    this.enablePeopleLetterSubFolders = enablePeopleLetterSubFolders;
  }

  public ServerConfiguration optimizeDatabaseOnShutdown(Boolean optimizeDatabaseOnShutdown) {
    this.optimizeDatabaseOnShutdown = optimizeDatabaseOnShutdown;
    return this;
  }

   /**
   * Get optimizeDatabaseOnShutdown
   * @return optimizeDatabaseOnShutdown
  **/
  @Schema(description = "")
  public Boolean isOptimizeDatabaseOnShutdown() {
    return optimizeDatabaseOnShutdown;
  }

  public void setOptimizeDatabaseOnShutdown(Boolean optimizeDatabaseOnShutdown) {
    this.optimizeDatabaseOnShutdown = optimizeDatabaseOnShutdown;
  }

  public ServerConfiguration databaseAnalysisLimit(Integer databaseAnalysisLimit) {
    this.databaseAnalysisLimit = databaseAnalysisLimit;
    return this;
  }

   /**
   * Get databaseAnalysisLimit
   * @return databaseAnalysisLimit
  **/
  @Schema(description = "")
  public Integer getDatabaseAnalysisLimit() {
    return databaseAnalysisLimit;
  }

  public void setDatabaseAnalysisLimit(Integer databaseAnalysisLimit) {
    this.databaseAnalysisLimit = databaseAnalysisLimit;
  }

  public ServerConfiguration disableAsyncIO(Boolean disableAsyncIO) {
    this.disableAsyncIO = disableAsyncIO;
    return this;
  }

   /**
   * Get disableAsyncIO
   * @return disableAsyncIO
  **/
  @Schema(description = "")
  public Boolean isDisableAsyncIO() {
    return disableAsyncIO;
  }

  public void setDisableAsyncIO(Boolean disableAsyncIO) {
    this.disableAsyncIO = disableAsyncIO;
  }

  public ServerConfiguration migratedToUserItemShares8(Boolean migratedToUserItemShares8) {
    this.migratedToUserItemShares8 = migratedToUserItemShares8;
    return this;
  }

   /**
   * Get migratedToUserItemShares8
   * @return migratedToUserItemShares8
  **/
  @Schema(description = "")
  public Boolean isMigratedToUserItemShares8() {
    return migratedToUserItemShares8;
  }

  public void setMigratedToUserItemShares8(Boolean migratedToUserItemShares8) {
    this.migratedToUserItemShares8 = migratedToUserItemShares8;
  }

  public ServerConfiguration migratedLibraryOptionsToDb(Boolean migratedLibraryOptionsToDb) {
    this.migratedLibraryOptionsToDb = migratedLibraryOptionsToDb;
    return this;
  }

   /**
   * Get migratedLibraryOptionsToDb
   * @return migratedLibraryOptionsToDb
  **/
  @Schema(description = "")
  public Boolean isMigratedLibraryOptionsToDb() {
    return migratedLibraryOptionsToDb;
  }

  public void setMigratedLibraryOptionsToDb(Boolean migratedLibraryOptionsToDb) {
    this.migratedLibraryOptionsToDb = migratedLibraryOptionsToDb;
  }

  public ServerConfiguration allowLegacyLocalNetworkPassword(Boolean allowLegacyLocalNetworkPassword) {
    this.allowLegacyLocalNetworkPassword = allowLegacyLocalNetworkPassword;
    return this;
  }

   /**
   * Get allowLegacyLocalNetworkPassword
   * @return allowLegacyLocalNetworkPassword
  **/
  @Schema(description = "")
  public Boolean isAllowLegacyLocalNetworkPassword() {
    return allowLegacyLocalNetworkPassword;
  }

  public void setAllowLegacyLocalNetworkPassword(Boolean allowLegacyLocalNetworkPassword) {
    this.allowLegacyLocalNetworkPassword = allowLegacyLocalNetworkPassword;
  }

  public ServerConfiguration enableSavedMetadataForPeople(Boolean enableSavedMetadataForPeople) {
    this.enableSavedMetadataForPeople = enableSavedMetadataForPeople;
    return this;
  }

   /**
   * Get enableSavedMetadataForPeople
   * @return enableSavedMetadataForPeople
  **/
  @Schema(description = "")
  public Boolean isEnableSavedMetadataForPeople() {
    return enableSavedMetadataForPeople;
  }

  public void setEnableSavedMetadataForPeople(Boolean enableSavedMetadataForPeople) {
    this.enableSavedMetadataForPeople = enableSavedMetadataForPeople;
  }

  public ServerConfiguration tvChannelsRefreshed(Boolean tvChannelsRefreshed) {
    this.tvChannelsRefreshed = tvChannelsRefreshed;
    return this;
  }

   /**
   * Get tvChannelsRefreshed
   * @return tvChannelsRefreshed
  **/
  @Schema(description = "")
  public Boolean isTvChannelsRefreshed() {
    return tvChannelsRefreshed;
  }

  public void setTvChannelsRefreshed(Boolean tvChannelsRefreshed) {
    this.tvChannelsRefreshed = tvChannelsRefreshed;
  }

  public ServerConfiguration proxyHeaderMode(ProxyHeaderMode proxyHeaderMode) {
    this.proxyHeaderMode = proxyHeaderMode;
    return this;
  }

   /**
   * Get proxyHeaderMode
   * @return proxyHeaderMode
  **/
  @Schema(description = "")
  public ProxyHeaderMode getProxyHeaderMode() {
    return proxyHeaderMode;
  }

  public void setProxyHeaderMode(ProxyHeaderMode proxyHeaderMode) {
    this.proxyHeaderMode = proxyHeaderMode;
  }

  public ServerConfiguration enableDebugLevelLogging(Boolean enableDebugLevelLogging) {
    this.enableDebugLevelLogging = enableDebugLevelLogging;
    return this;
  }

   /**
   * A value indicating whether \\[enable debug level logging\\].
   * @return enableDebugLevelLogging
  **/
  @Schema(description = "A value indicating whether \\[enable debug level logging\\].")
  public Boolean isEnableDebugLevelLogging() {
    return enableDebugLevelLogging;
  }

  public void setEnableDebugLevelLogging(Boolean enableDebugLevelLogging) {
    this.enableDebugLevelLogging = enableDebugLevelLogging;
  }

  public ServerConfiguration revertDebugLogging(String revertDebugLogging) {
    this.revertDebugLogging = revertDebugLogging;
    return this;
  }

   /**
   * Get revertDebugLogging
   * @return revertDebugLogging
  **/
  @Schema(description = "")
  public String getRevertDebugLogging() {
    return revertDebugLogging;
  }

  public void setRevertDebugLogging(String revertDebugLogging) {
    this.revertDebugLogging = revertDebugLogging;
  }

  public ServerConfiguration enableAutoUpdate(Boolean enableAutoUpdate) {
    this.enableAutoUpdate = enableAutoUpdate;
    return this;
  }

   /**
   * Enable automatically and silently updating of the application
   * @return enableAutoUpdate
  **/
  @Schema(description = "Enable automatically and silently updating of the application")
  public Boolean isEnableAutoUpdate() {
    return enableAutoUpdate;
  }

  public void setEnableAutoUpdate(Boolean enableAutoUpdate) {
    this.enableAutoUpdate = enableAutoUpdate;
  }

  public ServerConfiguration logFileRetentionDays(Integer logFileRetentionDays) {
    this.logFileRetentionDays = logFileRetentionDays;
    return this;
  }

   /**
   * The number of days we should retain log files
   * @return logFileRetentionDays
  **/
  @Schema(description = "The number of days we should retain log files")
  public Integer getLogFileRetentionDays() {
    return logFileRetentionDays;
  }

  public void setLogFileRetentionDays(Integer logFileRetentionDays) {
    this.logFileRetentionDays = logFileRetentionDays;
  }

  public ServerConfiguration runAtStartup(Boolean runAtStartup) {
    this.runAtStartup = runAtStartup;
    return this;
  }

   /**
   * A value indicating whether \\[run at startup\\].
   * @return runAtStartup
  **/
  @Schema(description = "A value indicating whether \\[run at startup\\].")
  public Boolean isRunAtStartup() {
    return runAtStartup;
  }

  public void setRunAtStartup(Boolean runAtStartup) {
    this.runAtStartup = runAtStartup;
  }

  public ServerConfiguration isStartupWizardCompleted(Boolean isStartupWizardCompleted) {
    this.isStartupWizardCompleted = isStartupWizardCompleted;
    return this;
  }

   /**
   * A value indicating whether this instance is first run.
   * @return isStartupWizardCompleted
  **/
  @Schema(description = "A value indicating whether this instance is first run.")
  public Boolean isIsStartupWizardCompleted() {
    return isStartupWizardCompleted;
  }

  public void setIsStartupWizardCompleted(Boolean isStartupWizardCompleted) {
    this.isStartupWizardCompleted = isStartupWizardCompleted;
  }

  public ServerConfiguration cachePath(String cachePath) {
    this.cachePath = cachePath;
    return this;
  }

   /**
   * The cache path.
   * @return cachePath
  **/
  @Schema(description = "The cache path.")
  public String getCachePath() {
    return cachePath;
  }

  public void setCachePath(String cachePath) {
    this.cachePath = cachePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfiguration serverConfiguration = (ServerConfiguration) o;
    return Objects.equals(this.enableUPnP, serverConfiguration.enableUPnP) &&
        Objects.equals(this.publicPort, serverConfiguration.publicPort) &&
        Objects.equals(this.publicHttpsPort, serverConfiguration.publicHttpsPort) &&
        Objects.equals(this.httpServerPortNumber, serverConfiguration.httpServerPortNumber) &&
        Objects.equals(this.httpsPortNumber, serverConfiguration.httpsPortNumber) &&
        Objects.equals(this.enableHttps, serverConfiguration.enableHttps) &&
        Objects.equals(this.certificatePath, serverConfiguration.certificatePath) &&
        Objects.equals(this.certificatePassword, serverConfiguration.certificatePassword) &&
        Objects.equals(this.isPortAuthorized, serverConfiguration.isPortAuthorized) &&
        Objects.equals(this.autoRunWebApp, serverConfiguration.autoRunWebApp) &&
        Objects.equals(this.enableRemoteAccess, serverConfiguration.enableRemoteAccess) &&
        Objects.equals(this.logAllQueryTimes, serverConfiguration.logAllQueryTimes) &&
        Objects.equals(this.enableCaseSensitiveItemIds, serverConfiguration.enableCaseSensitiveItemIds) &&
        Objects.equals(this.metadataPath, serverConfiguration.metadataPath) &&
        Objects.equals(this.metadataNetworkPath, serverConfiguration.metadataNetworkPath) &&
        Objects.equals(this.preferredMetadataLanguage, serverConfiguration.preferredMetadataLanguage) &&
        Objects.equals(this.metadataCountryCode, serverConfiguration.metadataCountryCode) &&
        Objects.equals(this.sortRemoveWords, serverConfiguration.sortRemoveWords) &&
        Objects.equals(this.libraryMonitorDelaySeconds, serverConfiguration.libraryMonitorDelaySeconds) &&
        Objects.equals(this.enableDashboardResponseCaching, serverConfiguration.enableDashboardResponseCaching) &&
        Objects.equals(this.dashboardSourcePath, serverConfiguration.dashboardSourcePath) &&
        Objects.equals(this.imageSavingConvention, serverConfiguration.imageSavingConvention) &&
        Objects.equals(this.enableAutomaticRestart, serverConfiguration.enableAutomaticRestart) &&
        Objects.equals(this.serverName, serverConfiguration.serverName) &&
        Objects.equals(this.preferredDetectedRemoteAddressFamily, serverConfiguration.preferredDetectedRemoteAddressFamily) &&
        Objects.equals(this.wanDdns, serverConfiguration.wanDdns) &&
        Objects.equals(this.uiCulture, serverConfiguration.uiCulture) &&
        Objects.equals(this.remoteClientBitrateLimit, serverConfiguration.remoteClientBitrateLimit) &&
        Objects.equals(this.localNetworkSubnets, serverConfiguration.localNetworkSubnets) &&
        Objects.equals(this.localNetworkAddresses, serverConfiguration.localNetworkAddresses) &&
        Objects.equals(this.enableExternalContentInSuggestions, serverConfiguration.enableExternalContentInSuggestions) &&
        Objects.equals(this.requireHttps, serverConfiguration.requireHttps) &&
        Objects.equals(this.isBehindProxy, serverConfiguration.isBehindProxy) &&
        Objects.equals(this.remoteIPFilter, serverConfiguration.remoteIPFilter) &&
        Objects.equals(this.isRemoteIPFilterBlacklist, serverConfiguration.isRemoteIPFilterBlacklist) &&
        Objects.equals(this.imageExtractionTimeoutMs, serverConfiguration.imageExtractionTimeoutMs) &&
        Objects.equals(this.pathSubstitutions, serverConfiguration.pathSubstitutions) &&
        Objects.equals(this.uninstalledPlugins, serverConfiguration.uninstalledPlugins) &&
        Objects.equals(this.collapseVideoFolders, serverConfiguration.collapseVideoFolders) &&
        Objects.equals(this.enableOriginalTrackTitles, serverConfiguration.enableOriginalTrackTitles) &&
        Objects.equals(this.vacuumDatabaseOnStartup, serverConfiguration.vacuumDatabaseOnStartup) &&
        Objects.equals(this.simultaneousStreamLimit, serverConfiguration.simultaneousStreamLimit) &&
        Objects.equals(this.databaseCacheSizeMB, serverConfiguration.databaseCacheSizeMB) &&
        Objects.equals(this.enableSqLiteMmio, serverConfiguration.enableSqLiteMmio) &&
        Objects.equals(this.playlistsUpgradedToM3U, serverConfiguration.playlistsUpgradedToM3U) &&
        Objects.equals(this.imageExtractorUpgraded1, serverConfiguration.imageExtractorUpgraded1) &&
        Objects.equals(this.enablePeopleLetterSubFolders, serverConfiguration.enablePeopleLetterSubFolders) &&
        Objects.equals(this.optimizeDatabaseOnShutdown, serverConfiguration.optimizeDatabaseOnShutdown) &&
        Objects.equals(this.databaseAnalysisLimit, serverConfiguration.databaseAnalysisLimit) &&
        Objects.equals(this.disableAsyncIO, serverConfiguration.disableAsyncIO) &&
        Objects.equals(this.migratedToUserItemShares8, serverConfiguration.migratedToUserItemShares8) &&
        Objects.equals(this.migratedLibraryOptionsToDb, serverConfiguration.migratedLibraryOptionsToDb) &&
        Objects.equals(this.allowLegacyLocalNetworkPassword, serverConfiguration.allowLegacyLocalNetworkPassword) &&
        Objects.equals(this.enableSavedMetadataForPeople, serverConfiguration.enableSavedMetadataForPeople) &&
        Objects.equals(this.tvChannelsRefreshed, serverConfiguration.tvChannelsRefreshed) &&
        Objects.equals(this.proxyHeaderMode, serverConfiguration.proxyHeaderMode) &&
        Objects.equals(this.enableDebugLevelLogging, serverConfiguration.enableDebugLevelLogging) &&
        Objects.equals(this.revertDebugLogging, serverConfiguration.revertDebugLogging) &&
        Objects.equals(this.enableAutoUpdate, serverConfiguration.enableAutoUpdate) &&
        Objects.equals(this.logFileRetentionDays, serverConfiguration.logFileRetentionDays) &&
        Objects.equals(this.runAtStartup, serverConfiguration.runAtStartup) &&
        Objects.equals(this.isStartupWizardCompleted, serverConfiguration.isStartupWizardCompleted) &&
        Objects.equals(this.cachePath, serverConfiguration.cachePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableUPnP, publicPort, publicHttpsPort, httpServerPortNumber, httpsPortNumber, enableHttps, certificatePath, certificatePassword, isPortAuthorized, autoRunWebApp, enableRemoteAccess, logAllQueryTimes, enableCaseSensitiveItemIds, metadataPath, metadataNetworkPath, preferredMetadataLanguage, metadataCountryCode, sortRemoveWords, libraryMonitorDelaySeconds, enableDashboardResponseCaching, dashboardSourcePath, imageSavingConvention, enableAutomaticRestart, serverName, preferredDetectedRemoteAddressFamily, wanDdns, uiCulture, remoteClientBitrateLimit, localNetworkSubnets, localNetworkAddresses, enableExternalContentInSuggestions, requireHttps, isBehindProxy, remoteIPFilter, isRemoteIPFilterBlacklist, imageExtractionTimeoutMs, pathSubstitutions, uninstalledPlugins, collapseVideoFolders, enableOriginalTrackTitles, vacuumDatabaseOnStartup, simultaneousStreamLimit, databaseCacheSizeMB, enableSqLiteMmio, playlistsUpgradedToM3U, imageExtractorUpgraded1, enablePeopleLetterSubFolders, optimizeDatabaseOnShutdown, databaseAnalysisLimit, disableAsyncIO, migratedToUserItemShares8, migratedLibraryOptionsToDb, allowLegacyLocalNetworkPassword, enableSavedMetadataForPeople, tvChannelsRefreshed, proxyHeaderMode, enableDebugLevelLogging, revertDebugLogging, enableAutoUpdate, logFileRetentionDays, runAtStartup, isStartupWizardCompleted, cachePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConfiguration {\n");
    
    sb.append("    enableUPnP: ").append(toIndentedString(enableUPnP)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
    sb.append("    publicHttpsPort: ").append(toIndentedString(publicHttpsPort)).append("\n");
    sb.append("    httpServerPortNumber: ").append(toIndentedString(httpServerPortNumber)).append("\n");
    sb.append("    httpsPortNumber: ").append(toIndentedString(httpsPortNumber)).append("\n");
    sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
    sb.append("    certificatePath: ").append(toIndentedString(certificatePath)).append("\n");
    sb.append("    certificatePassword: ").append(toIndentedString(certificatePassword)).append("\n");
    sb.append("    isPortAuthorized: ").append(toIndentedString(isPortAuthorized)).append("\n");
    sb.append("    autoRunWebApp: ").append(toIndentedString(autoRunWebApp)).append("\n");
    sb.append("    enableRemoteAccess: ").append(toIndentedString(enableRemoteAccess)).append("\n");
    sb.append("    logAllQueryTimes: ").append(toIndentedString(logAllQueryTimes)).append("\n");
    sb.append("    enableCaseSensitiveItemIds: ").append(toIndentedString(enableCaseSensitiveItemIds)).append("\n");
    sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
    sb.append("    metadataNetworkPath: ").append(toIndentedString(metadataNetworkPath)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    sortRemoveWords: ").append(toIndentedString(sortRemoveWords)).append("\n");
    sb.append("    libraryMonitorDelaySeconds: ").append(toIndentedString(libraryMonitorDelaySeconds)).append("\n");
    sb.append("    enableDashboardResponseCaching: ").append(toIndentedString(enableDashboardResponseCaching)).append("\n");
    sb.append("    dashboardSourcePath: ").append(toIndentedString(dashboardSourcePath)).append("\n");
    sb.append("    imageSavingConvention: ").append(toIndentedString(imageSavingConvention)).append("\n");
    sb.append("    enableAutomaticRestart: ").append(toIndentedString(enableAutomaticRestart)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    preferredDetectedRemoteAddressFamily: ").append(toIndentedString(preferredDetectedRemoteAddressFamily)).append("\n");
    sb.append("    wanDdns: ").append(toIndentedString(wanDdns)).append("\n");
    sb.append("    uiCulture: ").append(toIndentedString(uiCulture)).append("\n");
    sb.append("    remoteClientBitrateLimit: ").append(toIndentedString(remoteClientBitrateLimit)).append("\n");
    sb.append("    localNetworkSubnets: ").append(toIndentedString(localNetworkSubnets)).append("\n");
    sb.append("    localNetworkAddresses: ").append(toIndentedString(localNetworkAddresses)).append("\n");
    sb.append("    enableExternalContentInSuggestions: ").append(toIndentedString(enableExternalContentInSuggestions)).append("\n");
    sb.append("    requireHttps: ").append(toIndentedString(requireHttps)).append("\n");
    sb.append("    isBehindProxy: ").append(toIndentedString(isBehindProxy)).append("\n");
    sb.append("    remoteIPFilter: ").append(toIndentedString(remoteIPFilter)).append("\n");
    sb.append("    isRemoteIPFilterBlacklist: ").append(toIndentedString(isRemoteIPFilterBlacklist)).append("\n");
    sb.append("    imageExtractionTimeoutMs: ").append(toIndentedString(imageExtractionTimeoutMs)).append("\n");
    sb.append("    pathSubstitutions: ").append(toIndentedString(pathSubstitutions)).append("\n");
    sb.append("    uninstalledPlugins: ").append(toIndentedString(uninstalledPlugins)).append("\n");
    sb.append("    collapseVideoFolders: ").append(toIndentedString(collapseVideoFolders)).append("\n");
    sb.append("    enableOriginalTrackTitles: ").append(toIndentedString(enableOriginalTrackTitles)).append("\n");
    sb.append("    vacuumDatabaseOnStartup: ").append(toIndentedString(vacuumDatabaseOnStartup)).append("\n");
    sb.append("    simultaneousStreamLimit: ").append(toIndentedString(simultaneousStreamLimit)).append("\n");
    sb.append("    databaseCacheSizeMB: ").append(toIndentedString(databaseCacheSizeMB)).append("\n");
    sb.append("    enableSqLiteMmio: ").append(toIndentedString(enableSqLiteMmio)).append("\n");
    sb.append("    playlistsUpgradedToM3U: ").append(toIndentedString(playlistsUpgradedToM3U)).append("\n");
    sb.append("    imageExtractorUpgraded1: ").append(toIndentedString(imageExtractorUpgraded1)).append("\n");
    sb.append("    enablePeopleLetterSubFolders: ").append(toIndentedString(enablePeopleLetterSubFolders)).append("\n");
    sb.append("    optimizeDatabaseOnShutdown: ").append(toIndentedString(optimizeDatabaseOnShutdown)).append("\n");
    sb.append("    databaseAnalysisLimit: ").append(toIndentedString(databaseAnalysisLimit)).append("\n");
    sb.append("    disableAsyncIO: ").append(toIndentedString(disableAsyncIO)).append("\n");
    sb.append("    migratedToUserItemShares8: ").append(toIndentedString(migratedToUserItemShares8)).append("\n");
    sb.append("    migratedLibraryOptionsToDb: ").append(toIndentedString(migratedLibraryOptionsToDb)).append("\n");
    sb.append("    allowLegacyLocalNetworkPassword: ").append(toIndentedString(allowLegacyLocalNetworkPassword)).append("\n");
    sb.append("    enableSavedMetadataForPeople: ").append(toIndentedString(enableSavedMetadataForPeople)).append("\n");
    sb.append("    tvChannelsRefreshed: ").append(toIndentedString(tvChannelsRefreshed)).append("\n");
    sb.append("    proxyHeaderMode: ").append(toIndentedString(proxyHeaderMode)).append("\n");
    sb.append("    enableDebugLevelLogging: ").append(toIndentedString(enableDebugLevelLogging)).append("\n");
    sb.append("    revertDebugLogging: ").append(toIndentedString(revertDebugLogging)).append("\n");
    sb.append("    enableAutoUpdate: ").append(toIndentedString(enableAutoUpdate)).append("\n");
    sb.append("    logFileRetentionDays: ").append(toIndentedString(logFileRetentionDays)).append("\n");
    sb.append("    runAtStartup: ").append(toIndentedString(runAtStartup)).append("\n");
    sb.append("    isStartupWizardCompleted: ").append(toIndentedString(isStartupWizardCompleted)).append("\n");
    sb.append("    cachePath: ").append(toIndentedString(cachePath)).append("\n");
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
