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
import io.swagger.client.model.ConfigurationImageSavingConvention;
import io.swagger.client.model.ConfigurationPathSubstitution;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConfigurationServerConfiguration
 */


public class ConfigurationServerConfiguration {
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

  @SerializedName("LibraryMonitorDelay")
  private Integer libraryMonitorDelay = null;

  @SerializedName("EnableDashboardResponseCaching")
  private Boolean enableDashboardResponseCaching = null;

  @SerializedName("DashboardSourcePath")
  private String dashboardSourcePath = null;

  @SerializedName("ImageSavingConvention")
  private ConfigurationImageSavingConvention imageSavingConvention = null;

  @SerializedName("EnableAutomaticRestart")
  private Boolean enableAutomaticRestart = null;

  @SerializedName("ServerName")
  private String serverName = null;

  @SerializedName("WanDdns")
  private String wanDdns = null;

  @SerializedName("UICulture")
  private String uiCulture = null;

  @SerializedName("RemoteClientBitrateLimit")
  private Integer remoteClientBitrateLimit = null;

  @SerializedName("DisplaySpecialsWithinSeasons")
  private Boolean displaySpecialsWithinSeasons = null;

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
  private List<ConfigurationPathSubstitution> pathSubstitutions = null;

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

  @SerializedName("ChannelOptionsUpgraded")
  private Boolean channelOptionsUpgraded = null;

  @SerializedName("TimerIdsUpgraded")
  private Boolean timerIdsUpgraded = null;

  @SerializedName("ForcedSortNameUpgraded")
  private Boolean forcedSortNameUpgraded = null;

  @SerializedName("InheritedParentalRatingValueUpgraded")
  private Boolean inheritedParentalRatingValueUpgraded = null;

  @SerializedName("ImageExtractorUpgraded")
  private Boolean imageExtractorUpgraded = null;

  @SerializedName("EnablePeopleLetterSubFolders")
  private Boolean enablePeopleLetterSubFolders = null;

  @SerializedName("OptimizeDatabaseOnShutdown")
  private Boolean optimizeDatabaseOnShutdown = null;

  @SerializedName("DatabaseAnalysisLimit")
  private Integer databaseAnalysisLimit = null;

  @SerializedName("DisableAsyncIO")
  private Boolean disableAsyncIO = null;

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

  public ConfigurationServerConfiguration enableUPnP(Boolean enableUPnP) {
    this.enableUPnP = enableUPnP;
    return this;
  }

   /**
   * Get enableUPnP
   * @return enableUPnP
  **/
  @Schema(description = "")
  public Boolean isEnableUPnP() {
    return enableUPnP;
  }

  public void setEnableUPnP(Boolean enableUPnP) {
    this.enableUPnP = enableUPnP;
  }

  public ConfigurationServerConfiguration publicPort(Integer publicPort) {
    this.publicPort = publicPort;
    return this;
  }

   /**
   * Get publicPort
   * @return publicPort
  **/
  @Schema(description = "")
  public Integer getPublicPort() {
    return publicPort;
  }

  public void setPublicPort(Integer publicPort) {
    this.publicPort = publicPort;
  }

  public ConfigurationServerConfiguration publicHttpsPort(Integer publicHttpsPort) {
    this.publicHttpsPort = publicHttpsPort;
    return this;
  }

   /**
   * Get publicHttpsPort
   * @return publicHttpsPort
  **/
  @Schema(description = "")
  public Integer getPublicHttpsPort() {
    return publicHttpsPort;
  }

  public void setPublicHttpsPort(Integer publicHttpsPort) {
    this.publicHttpsPort = publicHttpsPort;
  }

  public ConfigurationServerConfiguration httpServerPortNumber(Integer httpServerPortNumber) {
    this.httpServerPortNumber = httpServerPortNumber;
    return this;
  }

   /**
   * Get httpServerPortNumber
   * @return httpServerPortNumber
  **/
  @Schema(description = "")
  public Integer getHttpServerPortNumber() {
    return httpServerPortNumber;
  }

  public void setHttpServerPortNumber(Integer httpServerPortNumber) {
    this.httpServerPortNumber = httpServerPortNumber;
  }

  public ConfigurationServerConfiguration httpsPortNumber(Integer httpsPortNumber) {
    this.httpsPortNumber = httpsPortNumber;
    return this;
  }

   /**
   * Get httpsPortNumber
   * @return httpsPortNumber
  **/
  @Schema(description = "")
  public Integer getHttpsPortNumber() {
    return httpsPortNumber;
  }

  public void setHttpsPortNumber(Integer httpsPortNumber) {
    this.httpsPortNumber = httpsPortNumber;
  }

  public ConfigurationServerConfiguration enableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
    return this;
  }

   /**
   * Get enableHttps
   * @return enableHttps
  **/
  @Schema(description = "")
  public Boolean isEnableHttps() {
    return enableHttps;
  }

  public void setEnableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
  }

  public ConfigurationServerConfiguration certificatePath(String certificatePath) {
    this.certificatePath = certificatePath;
    return this;
  }

   /**
   * Get certificatePath
   * @return certificatePath
  **/
  @Schema(description = "")
  public String getCertificatePath() {
    return certificatePath;
  }

  public void setCertificatePath(String certificatePath) {
    this.certificatePath = certificatePath;
  }

  public ConfigurationServerConfiguration certificatePassword(String certificatePassword) {
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

  public ConfigurationServerConfiguration isPortAuthorized(Boolean isPortAuthorized) {
    this.isPortAuthorized = isPortAuthorized;
    return this;
  }

   /**
   * Get isPortAuthorized
   * @return isPortAuthorized
  **/
  @Schema(description = "")
  public Boolean isIsPortAuthorized() {
    return isPortAuthorized;
  }

  public void setIsPortAuthorized(Boolean isPortAuthorized) {
    this.isPortAuthorized = isPortAuthorized;
  }

  public ConfigurationServerConfiguration autoRunWebApp(Boolean autoRunWebApp) {
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

  public ConfigurationServerConfiguration enableRemoteAccess(Boolean enableRemoteAccess) {
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

  public ConfigurationServerConfiguration logAllQueryTimes(Boolean logAllQueryTimes) {
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

  public ConfigurationServerConfiguration enableCaseSensitiveItemIds(Boolean enableCaseSensitiveItemIds) {
    this.enableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
    return this;
  }

   /**
   * Get enableCaseSensitiveItemIds
   * @return enableCaseSensitiveItemIds
  **/
  @Schema(description = "")
  public Boolean isEnableCaseSensitiveItemIds() {
    return enableCaseSensitiveItemIds;
  }

  public void setEnableCaseSensitiveItemIds(Boolean enableCaseSensitiveItemIds) {
    this.enableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
  }

  public ConfigurationServerConfiguration metadataPath(String metadataPath) {
    this.metadataPath = metadataPath;
    return this;
  }

   /**
   * Get metadataPath
   * @return metadataPath
  **/
  @Schema(description = "")
  public String getMetadataPath() {
    return metadataPath;
  }

  public void setMetadataPath(String metadataPath) {
    this.metadataPath = metadataPath;
  }

  public ConfigurationServerConfiguration metadataNetworkPath(String metadataNetworkPath) {
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

  public ConfigurationServerConfiguration preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
    return this;
  }

   /**
   * Get preferredMetadataLanguage
   * @return preferredMetadataLanguage
  **/
  @Schema(description = "")
  public String getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public ConfigurationServerConfiguration metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
    return this;
  }

   /**
   * Get metadataCountryCode
   * @return metadataCountryCode
  **/
  @Schema(description = "")
  public String getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public ConfigurationServerConfiguration sortRemoveWords(List<String> sortRemoveWords) {
    this.sortRemoveWords = sortRemoveWords;
    return this;
  }

  public ConfigurationServerConfiguration addSortRemoveWordsItem(String sortRemoveWordsItem) {
    if (this.sortRemoveWords == null) {
      this.sortRemoveWords = new ArrayList<String>();
    }
    this.sortRemoveWords.add(sortRemoveWordsItem);
    return this;
  }

   /**
   * Get sortRemoveWords
   * @return sortRemoveWords
  **/
  @Schema(description = "")
  public List<String> getSortRemoveWords() {
    return sortRemoveWords;
  }

  public void setSortRemoveWords(List<String> sortRemoveWords) {
    this.sortRemoveWords = sortRemoveWords;
  }

  public ConfigurationServerConfiguration libraryMonitorDelay(Integer libraryMonitorDelay) {
    this.libraryMonitorDelay = libraryMonitorDelay;
    return this;
  }

   /**
   * Get libraryMonitorDelay
   * @return libraryMonitorDelay
  **/
  @Schema(description = "")
  public Integer getLibraryMonitorDelay() {
    return libraryMonitorDelay;
  }

  public void setLibraryMonitorDelay(Integer libraryMonitorDelay) {
    this.libraryMonitorDelay = libraryMonitorDelay;
  }

  public ConfigurationServerConfiguration enableDashboardResponseCaching(Boolean enableDashboardResponseCaching) {
    this.enableDashboardResponseCaching = enableDashboardResponseCaching;
    return this;
  }

   /**
   * Get enableDashboardResponseCaching
   * @return enableDashboardResponseCaching
  **/
  @Schema(description = "")
  public Boolean isEnableDashboardResponseCaching() {
    return enableDashboardResponseCaching;
  }

  public void setEnableDashboardResponseCaching(Boolean enableDashboardResponseCaching) {
    this.enableDashboardResponseCaching = enableDashboardResponseCaching;
  }

  public ConfigurationServerConfiguration dashboardSourcePath(String dashboardSourcePath) {
    this.dashboardSourcePath = dashboardSourcePath;
    return this;
  }

   /**
   * Get dashboardSourcePath
   * @return dashboardSourcePath
  **/
  @Schema(description = "")
  public String getDashboardSourcePath() {
    return dashboardSourcePath;
  }

  public void setDashboardSourcePath(String dashboardSourcePath) {
    this.dashboardSourcePath = dashboardSourcePath;
  }

  public ConfigurationServerConfiguration imageSavingConvention(ConfigurationImageSavingConvention imageSavingConvention) {
    this.imageSavingConvention = imageSavingConvention;
    return this;
  }

   /**
   * Get imageSavingConvention
   * @return imageSavingConvention
  **/
  @Schema(description = "")
  public ConfigurationImageSavingConvention getImageSavingConvention() {
    return imageSavingConvention;
  }

  public void setImageSavingConvention(ConfigurationImageSavingConvention imageSavingConvention) {
    this.imageSavingConvention = imageSavingConvention;
  }

  public ConfigurationServerConfiguration enableAutomaticRestart(Boolean enableAutomaticRestart) {
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

  public ConfigurationServerConfiguration serverName(String serverName) {
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

  public ConfigurationServerConfiguration wanDdns(String wanDdns) {
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

  public ConfigurationServerConfiguration uiCulture(String uiCulture) {
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

  public ConfigurationServerConfiguration remoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
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

  public ConfigurationServerConfiguration displaySpecialsWithinSeasons(Boolean displaySpecialsWithinSeasons) {
    this.displaySpecialsWithinSeasons = displaySpecialsWithinSeasons;
    return this;
  }

   /**
   * Get displaySpecialsWithinSeasons
   * @return displaySpecialsWithinSeasons
  **/
  @Schema(description = "")
  public Boolean isDisplaySpecialsWithinSeasons() {
    return displaySpecialsWithinSeasons;
  }

  public void setDisplaySpecialsWithinSeasons(Boolean displaySpecialsWithinSeasons) {
    this.displaySpecialsWithinSeasons = displaySpecialsWithinSeasons;
  }

  public ConfigurationServerConfiguration localNetworkSubnets(List<String> localNetworkSubnets) {
    this.localNetworkSubnets = localNetworkSubnets;
    return this;
  }

  public ConfigurationServerConfiguration addLocalNetworkSubnetsItem(String localNetworkSubnetsItem) {
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

  public ConfigurationServerConfiguration localNetworkAddresses(List<String> localNetworkAddresses) {
    this.localNetworkAddresses = localNetworkAddresses;
    return this;
  }

  public ConfigurationServerConfiguration addLocalNetworkAddressesItem(String localNetworkAddressesItem) {
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

  public ConfigurationServerConfiguration enableExternalContentInSuggestions(Boolean enableExternalContentInSuggestions) {
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

  public ConfigurationServerConfiguration requireHttps(Boolean requireHttps) {
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

  public ConfigurationServerConfiguration isBehindProxy(Boolean isBehindProxy) {
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

  public ConfigurationServerConfiguration remoteIPFilter(List<String> remoteIPFilter) {
    this.remoteIPFilter = remoteIPFilter;
    return this;
  }

  public ConfigurationServerConfiguration addRemoteIPFilterItem(String remoteIPFilterItem) {
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

  public ConfigurationServerConfiguration isRemoteIPFilterBlacklist(Boolean isRemoteIPFilterBlacklist) {
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

  public ConfigurationServerConfiguration imageExtractionTimeoutMs(Integer imageExtractionTimeoutMs) {
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

  public ConfigurationServerConfiguration pathSubstitutions(List<ConfigurationPathSubstitution> pathSubstitutions) {
    this.pathSubstitutions = pathSubstitutions;
    return this;
  }

  public ConfigurationServerConfiguration addPathSubstitutionsItem(ConfigurationPathSubstitution pathSubstitutionsItem) {
    if (this.pathSubstitutions == null) {
      this.pathSubstitutions = new ArrayList<ConfigurationPathSubstitution>();
    }
    this.pathSubstitutions.add(pathSubstitutionsItem);
    return this;
  }

   /**
   * Get pathSubstitutions
   * @return pathSubstitutions
  **/
  @Schema(description = "")
  public List<ConfigurationPathSubstitution> getPathSubstitutions() {
    return pathSubstitutions;
  }

  public void setPathSubstitutions(List<ConfigurationPathSubstitution> pathSubstitutions) {
    this.pathSubstitutions = pathSubstitutions;
  }

  public ConfigurationServerConfiguration uninstalledPlugins(List<String> uninstalledPlugins) {
    this.uninstalledPlugins = uninstalledPlugins;
    return this;
  }

  public ConfigurationServerConfiguration addUninstalledPluginsItem(String uninstalledPluginsItem) {
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

  public ConfigurationServerConfiguration collapseVideoFolders(Boolean collapseVideoFolders) {
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

  public ConfigurationServerConfiguration enableOriginalTrackTitles(Boolean enableOriginalTrackTitles) {
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

  public ConfigurationServerConfiguration vacuumDatabaseOnStartup(Boolean vacuumDatabaseOnStartup) {
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

  public ConfigurationServerConfiguration simultaneousStreamLimit(Integer simultaneousStreamLimit) {
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

  public ConfigurationServerConfiguration databaseCacheSizeMB(Integer databaseCacheSizeMB) {
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

  public ConfigurationServerConfiguration enableSqLiteMmio(Boolean enableSqLiteMmio) {
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

  public ConfigurationServerConfiguration channelOptionsUpgraded(Boolean channelOptionsUpgraded) {
    this.channelOptionsUpgraded = channelOptionsUpgraded;
    return this;
  }

   /**
   * Get channelOptionsUpgraded
   * @return channelOptionsUpgraded
  **/
  @Schema(description = "")
  public Boolean isChannelOptionsUpgraded() {
    return channelOptionsUpgraded;
  }

  public void setChannelOptionsUpgraded(Boolean channelOptionsUpgraded) {
    this.channelOptionsUpgraded = channelOptionsUpgraded;
  }

  public ConfigurationServerConfiguration timerIdsUpgraded(Boolean timerIdsUpgraded) {
    this.timerIdsUpgraded = timerIdsUpgraded;
    return this;
  }

   /**
   * Get timerIdsUpgraded
   * @return timerIdsUpgraded
  **/
  @Schema(description = "")
  public Boolean isTimerIdsUpgraded() {
    return timerIdsUpgraded;
  }

  public void setTimerIdsUpgraded(Boolean timerIdsUpgraded) {
    this.timerIdsUpgraded = timerIdsUpgraded;
  }

  public ConfigurationServerConfiguration forcedSortNameUpgraded(Boolean forcedSortNameUpgraded) {
    this.forcedSortNameUpgraded = forcedSortNameUpgraded;
    return this;
  }

   /**
   * Get forcedSortNameUpgraded
   * @return forcedSortNameUpgraded
  **/
  @Schema(description = "")
  public Boolean isForcedSortNameUpgraded() {
    return forcedSortNameUpgraded;
  }

  public void setForcedSortNameUpgraded(Boolean forcedSortNameUpgraded) {
    this.forcedSortNameUpgraded = forcedSortNameUpgraded;
  }

  public ConfigurationServerConfiguration inheritedParentalRatingValueUpgraded(Boolean inheritedParentalRatingValueUpgraded) {
    this.inheritedParentalRatingValueUpgraded = inheritedParentalRatingValueUpgraded;
    return this;
  }

   /**
   * Get inheritedParentalRatingValueUpgraded
   * @return inheritedParentalRatingValueUpgraded
  **/
  @Schema(description = "")
  public Boolean isInheritedParentalRatingValueUpgraded() {
    return inheritedParentalRatingValueUpgraded;
  }

  public void setInheritedParentalRatingValueUpgraded(Boolean inheritedParentalRatingValueUpgraded) {
    this.inheritedParentalRatingValueUpgraded = inheritedParentalRatingValueUpgraded;
  }

  public ConfigurationServerConfiguration imageExtractorUpgraded(Boolean imageExtractorUpgraded) {
    this.imageExtractorUpgraded = imageExtractorUpgraded;
    return this;
  }

   /**
   * Get imageExtractorUpgraded
   * @return imageExtractorUpgraded
  **/
  @Schema(description = "")
  public Boolean isImageExtractorUpgraded() {
    return imageExtractorUpgraded;
  }

  public void setImageExtractorUpgraded(Boolean imageExtractorUpgraded) {
    this.imageExtractorUpgraded = imageExtractorUpgraded;
  }

  public ConfigurationServerConfiguration enablePeopleLetterSubFolders(Boolean enablePeopleLetterSubFolders) {
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

  public ConfigurationServerConfiguration optimizeDatabaseOnShutdown(Boolean optimizeDatabaseOnShutdown) {
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

  public ConfigurationServerConfiguration databaseAnalysisLimit(Integer databaseAnalysisLimit) {
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

  public ConfigurationServerConfiguration disableAsyncIO(Boolean disableAsyncIO) {
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

  public ConfigurationServerConfiguration enableDebugLevelLogging(Boolean enableDebugLevelLogging) {
    this.enableDebugLevelLogging = enableDebugLevelLogging;
    return this;
  }

   /**
   * Get enableDebugLevelLogging
   * @return enableDebugLevelLogging
  **/
  @Schema(description = "")
  public Boolean isEnableDebugLevelLogging() {
    return enableDebugLevelLogging;
  }

  public void setEnableDebugLevelLogging(Boolean enableDebugLevelLogging) {
    this.enableDebugLevelLogging = enableDebugLevelLogging;
  }

  public ConfigurationServerConfiguration revertDebugLogging(String revertDebugLogging) {
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

  public ConfigurationServerConfiguration enableAutoUpdate(Boolean enableAutoUpdate) {
    this.enableAutoUpdate = enableAutoUpdate;
    return this;
  }

   /**
   * Get enableAutoUpdate
   * @return enableAutoUpdate
  **/
  @Schema(description = "")
  public Boolean isEnableAutoUpdate() {
    return enableAutoUpdate;
  }

  public void setEnableAutoUpdate(Boolean enableAutoUpdate) {
    this.enableAutoUpdate = enableAutoUpdate;
  }

  public ConfigurationServerConfiguration logFileRetentionDays(Integer logFileRetentionDays) {
    this.logFileRetentionDays = logFileRetentionDays;
    return this;
  }

   /**
   * Get logFileRetentionDays
   * @return logFileRetentionDays
  **/
  @Schema(description = "")
  public Integer getLogFileRetentionDays() {
    return logFileRetentionDays;
  }

  public void setLogFileRetentionDays(Integer logFileRetentionDays) {
    this.logFileRetentionDays = logFileRetentionDays;
  }

  public ConfigurationServerConfiguration runAtStartup(Boolean runAtStartup) {
    this.runAtStartup = runAtStartup;
    return this;
  }

   /**
   * Get runAtStartup
   * @return runAtStartup
  **/
  @Schema(description = "")
  public Boolean isRunAtStartup() {
    return runAtStartup;
  }

  public void setRunAtStartup(Boolean runAtStartup) {
    this.runAtStartup = runAtStartup;
  }

  public ConfigurationServerConfiguration isStartupWizardCompleted(Boolean isStartupWizardCompleted) {
    this.isStartupWizardCompleted = isStartupWizardCompleted;
    return this;
  }

   /**
   * Get isStartupWizardCompleted
   * @return isStartupWizardCompleted
  **/
  @Schema(description = "")
  public Boolean isIsStartupWizardCompleted() {
    return isStartupWizardCompleted;
  }

  public void setIsStartupWizardCompleted(Boolean isStartupWizardCompleted) {
    this.isStartupWizardCompleted = isStartupWizardCompleted;
  }

  public ConfigurationServerConfiguration cachePath(String cachePath) {
    this.cachePath = cachePath;
    return this;
  }

   /**
   * Get cachePath
   * @return cachePath
  **/
  @Schema(description = "")
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
    ConfigurationServerConfiguration configurationServerConfiguration = (ConfigurationServerConfiguration) o;
    return Objects.equals(this.enableUPnP, configurationServerConfiguration.enableUPnP) &&
        Objects.equals(this.publicPort, configurationServerConfiguration.publicPort) &&
        Objects.equals(this.publicHttpsPort, configurationServerConfiguration.publicHttpsPort) &&
        Objects.equals(this.httpServerPortNumber, configurationServerConfiguration.httpServerPortNumber) &&
        Objects.equals(this.httpsPortNumber, configurationServerConfiguration.httpsPortNumber) &&
        Objects.equals(this.enableHttps, configurationServerConfiguration.enableHttps) &&
        Objects.equals(this.certificatePath, configurationServerConfiguration.certificatePath) &&
        Objects.equals(this.certificatePassword, configurationServerConfiguration.certificatePassword) &&
        Objects.equals(this.isPortAuthorized, configurationServerConfiguration.isPortAuthorized) &&
        Objects.equals(this.autoRunWebApp, configurationServerConfiguration.autoRunWebApp) &&
        Objects.equals(this.enableRemoteAccess, configurationServerConfiguration.enableRemoteAccess) &&
        Objects.equals(this.logAllQueryTimes, configurationServerConfiguration.logAllQueryTimes) &&
        Objects.equals(this.enableCaseSensitiveItemIds, configurationServerConfiguration.enableCaseSensitiveItemIds) &&
        Objects.equals(this.metadataPath, configurationServerConfiguration.metadataPath) &&
        Objects.equals(this.metadataNetworkPath, configurationServerConfiguration.metadataNetworkPath) &&
        Objects.equals(this.preferredMetadataLanguage, configurationServerConfiguration.preferredMetadataLanguage) &&
        Objects.equals(this.metadataCountryCode, configurationServerConfiguration.metadataCountryCode) &&
        Objects.equals(this.sortRemoveWords, configurationServerConfiguration.sortRemoveWords) &&
        Objects.equals(this.libraryMonitorDelay, configurationServerConfiguration.libraryMonitorDelay) &&
        Objects.equals(this.enableDashboardResponseCaching, configurationServerConfiguration.enableDashboardResponseCaching) &&
        Objects.equals(this.dashboardSourcePath, configurationServerConfiguration.dashboardSourcePath) &&
        Objects.equals(this.imageSavingConvention, configurationServerConfiguration.imageSavingConvention) &&
        Objects.equals(this.enableAutomaticRestart, configurationServerConfiguration.enableAutomaticRestart) &&
        Objects.equals(this.serverName, configurationServerConfiguration.serverName) &&
        Objects.equals(this.wanDdns, configurationServerConfiguration.wanDdns) &&
        Objects.equals(this.uiCulture, configurationServerConfiguration.uiCulture) &&
        Objects.equals(this.remoteClientBitrateLimit, configurationServerConfiguration.remoteClientBitrateLimit) &&
        Objects.equals(this.displaySpecialsWithinSeasons, configurationServerConfiguration.displaySpecialsWithinSeasons) &&
        Objects.equals(this.localNetworkSubnets, configurationServerConfiguration.localNetworkSubnets) &&
        Objects.equals(this.localNetworkAddresses, configurationServerConfiguration.localNetworkAddresses) &&
        Objects.equals(this.enableExternalContentInSuggestions, configurationServerConfiguration.enableExternalContentInSuggestions) &&
        Objects.equals(this.requireHttps, configurationServerConfiguration.requireHttps) &&
        Objects.equals(this.isBehindProxy, configurationServerConfiguration.isBehindProxy) &&
        Objects.equals(this.remoteIPFilter, configurationServerConfiguration.remoteIPFilter) &&
        Objects.equals(this.isRemoteIPFilterBlacklist, configurationServerConfiguration.isRemoteIPFilterBlacklist) &&
        Objects.equals(this.imageExtractionTimeoutMs, configurationServerConfiguration.imageExtractionTimeoutMs) &&
        Objects.equals(this.pathSubstitutions, configurationServerConfiguration.pathSubstitutions) &&
        Objects.equals(this.uninstalledPlugins, configurationServerConfiguration.uninstalledPlugins) &&
        Objects.equals(this.collapseVideoFolders, configurationServerConfiguration.collapseVideoFolders) &&
        Objects.equals(this.enableOriginalTrackTitles, configurationServerConfiguration.enableOriginalTrackTitles) &&
        Objects.equals(this.vacuumDatabaseOnStartup, configurationServerConfiguration.vacuumDatabaseOnStartup) &&
        Objects.equals(this.simultaneousStreamLimit, configurationServerConfiguration.simultaneousStreamLimit) &&
        Objects.equals(this.databaseCacheSizeMB, configurationServerConfiguration.databaseCacheSizeMB) &&
        Objects.equals(this.enableSqLiteMmio, configurationServerConfiguration.enableSqLiteMmio) &&
        Objects.equals(this.channelOptionsUpgraded, configurationServerConfiguration.channelOptionsUpgraded) &&
        Objects.equals(this.timerIdsUpgraded, configurationServerConfiguration.timerIdsUpgraded) &&
        Objects.equals(this.forcedSortNameUpgraded, configurationServerConfiguration.forcedSortNameUpgraded) &&
        Objects.equals(this.inheritedParentalRatingValueUpgraded, configurationServerConfiguration.inheritedParentalRatingValueUpgraded) &&
        Objects.equals(this.imageExtractorUpgraded, configurationServerConfiguration.imageExtractorUpgraded) &&
        Objects.equals(this.enablePeopleLetterSubFolders, configurationServerConfiguration.enablePeopleLetterSubFolders) &&
        Objects.equals(this.optimizeDatabaseOnShutdown, configurationServerConfiguration.optimizeDatabaseOnShutdown) &&
        Objects.equals(this.databaseAnalysisLimit, configurationServerConfiguration.databaseAnalysisLimit) &&
        Objects.equals(this.disableAsyncIO, configurationServerConfiguration.disableAsyncIO) &&
        Objects.equals(this.enableDebugLevelLogging, configurationServerConfiguration.enableDebugLevelLogging) &&
        Objects.equals(this.revertDebugLogging, configurationServerConfiguration.revertDebugLogging) &&
        Objects.equals(this.enableAutoUpdate, configurationServerConfiguration.enableAutoUpdate) &&
        Objects.equals(this.logFileRetentionDays, configurationServerConfiguration.logFileRetentionDays) &&
        Objects.equals(this.runAtStartup, configurationServerConfiguration.runAtStartup) &&
        Objects.equals(this.isStartupWizardCompleted, configurationServerConfiguration.isStartupWizardCompleted) &&
        Objects.equals(this.cachePath, configurationServerConfiguration.cachePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableUPnP, publicPort, publicHttpsPort, httpServerPortNumber, httpsPortNumber, enableHttps, certificatePath, certificatePassword, isPortAuthorized, autoRunWebApp, enableRemoteAccess, logAllQueryTimes, enableCaseSensitiveItemIds, metadataPath, metadataNetworkPath, preferredMetadataLanguage, metadataCountryCode, sortRemoveWords, libraryMonitorDelay, enableDashboardResponseCaching, dashboardSourcePath, imageSavingConvention, enableAutomaticRestart, serverName, wanDdns, uiCulture, remoteClientBitrateLimit, displaySpecialsWithinSeasons, localNetworkSubnets, localNetworkAddresses, enableExternalContentInSuggestions, requireHttps, isBehindProxy, remoteIPFilter, isRemoteIPFilterBlacklist, imageExtractionTimeoutMs, pathSubstitutions, uninstalledPlugins, collapseVideoFolders, enableOriginalTrackTitles, vacuumDatabaseOnStartup, simultaneousStreamLimit, databaseCacheSizeMB, enableSqLiteMmio, channelOptionsUpgraded, timerIdsUpgraded, forcedSortNameUpgraded, inheritedParentalRatingValueUpgraded, imageExtractorUpgraded, enablePeopleLetterSubFolders, optimizeDatabaseOnShutdown, databaseAnalysisLimit, disableAsyncIO, enableDebugLevelLogging, revertDebugLogging, enableAutoUpdate, logFileRetentionDays, runAtStartup, isStartupWizardCompleted, cachePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationServerConfiguration {\n");
    
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
    sb.append("    libraryMonitorDelay: ").append(toIndentedString(libraryMonitorDelay)).append("\n");
    sb.append("    enableDashboardResponseCaching: ").append(toIndentedString(enableDashboardResponseCaching)).append("\n");
    sb.append("    dashboardSourcePath: ").append(toIndentedString(dashboardSourcePath)).append("\n");
    sb.append("    imageSavingConvention: ").append(toIndentedString(imageSavingConvention)).append("\n");
    sb.append("    enableAutomaticRestart: ").append(toIndentedString(enableAutomaticRestart)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    wanDdns: ").append(toIndentedString(wanDdns)).append("\n");
    sb.append("    uiCulture: ").append(toIndentedString(uiCulture)).append("\n");
    sb.append("    remoteClientBitrateLimit: ").append(toIndentedString(remoteClientBitrateLimit)).append("\n");
    sb.append("    displaySpecialsWithinSeasons: ").append(toIndentedString(displaySpecialsWithinSeasons)).append("\n");
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
    sb.append("    channelOptionsUpgraded: ").append(toIndentedString(channelOptionsUpgraded)).append("\n");
    sb.append("    timerIdsUpgraded: ").append(toIndentedString(timerIdsUpgraded)).append("\n");
    sb.append("    forcedSortNameUpgraded: ").append(toIndentedString(forcedSortNameUpgraded)).append("\n");
    sb.append("    inheritedParentalRatingValueUpgraded: ").append(toIndentedString(inheritedParentalRatingValueUpgraded)).append("\n");
    sb.append("    imageExtractorUpgraded: ").append(toIndentedString(imageExtractorUpgraded)).append("\n");
    sb.append("    enablePeopleLetterSubFolders: ").append(toIndentedString(enablePeopleLetterSubFolders)).append("\n");
    sb.append("    optimizeDatabaseOnShutdown: ").append(toIndentedString(optimizeDatabaseOnShutdown)).append("\n");
    sb.append("    databaseAnalysisLimit: ").append(toIndentedString(databaseAnalysisLimit)).append("\n");
    sb.append("    disableAsyncIO: ").append(toIndentedString(disableAsyncIO)).append("\n");
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
