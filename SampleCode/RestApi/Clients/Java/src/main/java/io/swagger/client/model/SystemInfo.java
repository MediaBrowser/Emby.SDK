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
import io.swagger.client.model.InstallationInfo;
import io.swagger.client.model.PackageVersionClass;
import io.swagger.client.model.WakeOnLanInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class SystemInfo  
 */
@Schema(description = "Class SystemInfo  ")

public class SystemInfo {
  @SerializedName("SystemUpdateLevel")
  private PackageVersionClass systemUpdateLevel = null;

  @SerializedName("OperatingSystemDisplayName")
  private String operatingSystemDisplayName = null;

  @SerializedName("PackageName")
  private String packageName = null;

  @SerializedName("HasPendingRestart")
  private Boolean hasPendingRestart = null;

  @SerializedName("IsShuttingDown")
  private Boolean isShuttingDown = null;

  @SerializedName("HasImageEnhancers")
  private Boolean hasImageEnhancers = null;

  @SerializedName("OperatingSystem")
  private String operatingSystem = null;

  @SerializedName("SupportsLibraryMonitor")
  private Boolean supportsLibraryMonitor = null;

  @SerializedName("SupportsLocalPortConfiguration")
  private Boolean supportsLocalPortConfiguration = null;

  @SerializedName("SupportsWakeServer")
  private Boolean supportsWakeServer = null;

  @SerializedName("WebSocketPortNumber")
  private Integer webSocketPortNumber = null;

  @SerializedName("CompletedInstallations")
  private List<InstallationInfo> completedInstallations = null;

  @SerializedName("CanSelfRestart")
  private Boolean canSelfRestart = null;

  @SerializedName("CanSelfUpdate")
  private Boolean canSelfUpdate = null;

  @SerializedName("CanLaunchWebBrowser")
  private Boolean canLaunchWebBrowser = null;

  @SerializedName("ProgramDataPath")
  private String programDataPath = null;

  @SerializedName("ItemsByNamePath")
  private String itemsByNamePath = null;

  @SerializedName("CachePath")
  private String cachePath = null;

  @SerializedName("LogPath")
  private String logPath = null;

  @SerializedName("InternalMetadataPath")
  private String internalMetadataPath = null;

  @SerializedName("TranscodingTempPath")
  private String transcodingTempPath = null;

  @SerializedName("HttpServerPortNumber")
  private Integer httpServerPortNumber = null;

  @SerializedName("SupportsHttps")
  private Boolean supportsHttps = null;

  @SerializedName("HttpsPortNumber")
  private Integer httpsPortNumber = null;

  @SerializedName("HasUpdateAvailable")
  private Boolean hasUpdateAvailable = null;

  @SerializedName("SupportsAutoRunAtStartup")
  private Boolean supportsAutoRunAtStartup = null;

  @SerializedName("HardwareAccelerationRequiresPremiere")
  private Boolean hardwareAccelerationRequiresPremiere = null;

  @SerializedName("WakeOnLanInfo")
  private List<WakeOnLanInfo> wakeOnLanInfo = null;

  @SerializedName("LocalAddress")
  private String localAddress = null;

  @SerializedName("LocalAddresses")
  private List<String> localAddresses = null;

  @SerializedName("WanAddress")
  private String wanAddress = null;

  @SerializedName("RemoteAddresses")
  private List<String> remoteAddresses = null;

  @SerializedName("ServerName")
  private String serverName = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("Id")
  private String id = null;

  public SystemInfo systemUpdateLevel(PackageVersionClass systemUpdateLevel) {
    this.systemUpdateLevel = systemUpdateLevel;
    return this;
  }

   /**
   * Get systemUpdateLevel
   * @return systemUpdateLevel
  **/
  @Schema(description = "")
  public PackageVersionClass getSystemUpdateLevel() {
    return systemUpdateLevel;
  }

  public void setSystemUpdateLevel(PackageVersionClass systemUpdateLevel) {
    this.systemUpdateLevel = systemUpdateLevel;
  }

  public SystemInfo operatingSystemDisplayName(String operatingSystemDisplayName) {
    this.operatingSystemDisplayName = operatingSystemDisplayName;
    return this;
  }

   /**
   * The display name of the operating system.
   * @return operatingSystemDisplayName
  **/
  @Schema(description = "The display name of the operating system.")
  public String getOperatingSystemDisplayName() {
    return operatingSystemDisplayName;
  }

  public void setOperatingSystemDisplayName(String operatingSystemDisplayName) {
    this.operatingSystemDisplayName = operatingSystemDisplayName;
  }

  public SystemInfo packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

   /**
   * Get packageName
   * @return packageName
  **/
  @Schema(description = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public SystemInfo hasPendingRestart(Boolean hasPendingRestart) {
    this.hasPendingRestart = hasPendingRestart;
    return this;
  }

   /**
   * A value indicating whether this instance has pending restart.
   * @return hasPendingRestart
  **/
  @Schema(description = "A value indicating whether this instance has pending restart.")
  public Boolean isHasPendingRestart() {
    return hasPendingRestart;
  }

  public void setHasPendingRestart(Boolean hasPendingRestart) {
    this.hasPendingRestart = hasPendingRestart;
  }

  public SystemInfo isShuttingDown(Boolean isShuttingDown) {
    this.isShuttingDown = isShuttingDown;
    return this;
  }

   /**
   * Get isShuttingDown
   * @return isShuttingDown
  **/
  @Schema(description = "")
  public Boolean isIsShuttingDown() {
    return isShuttingDown;
  }

  public void setIsShuttingDown(Boolean isShuttingDown) {
    this.isShuttingDown = isShuttingDown;
  }

  public SystemInfo hasImageEnhancers(Boolean hasImageEnhancers) {
    this.hasImageEnhancers = hasImageEnhancers;
    return this;
  }

   /**
   * Get hasImageEnhancers
   * @return hasImageEnhancers
  **/
  @Schema(description = "")
  public Boolean isHasImageEnhancers() {
    return hasImageEnhancers;
  }

  public void setHasImageEnhancers(Boolean hasImageEnhancers) {
    this.hasImageEnhancers = hasImageEnhancers;
  }

  public SystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * The operating sytem.
   * @return operatingSystem
  **/
  @Schema(description = "The operating sytem.")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public SystemInfo supportsLibraryMonitor(Boolean supportsLibraryMonitor) {
    this.supportsLibraryMonitor = supportsLibraryMonitor;
    return this;
  }

   /**
   * A value indicating whether \\[supports library monitor\\].
   * @return supportsLibraryMonitor
  **/
  @Schema(description = "A value indicating whether \\[supports library monitor\\].")
  public Boolean isSupportsLibraryMonitor() {
    return supportsLibraryMonitor;
  }

  public void setSupportsLibraryMonitor(Boolean supportsLibraryMonitor) {
    this.supportsLibraryMonitor = supportsLibraryMonitor;
  }

  public SystemInfo supportsLocalPortConfiguration(Boolean supportsLocalPortConfiguration) {
    this.supportsLocalPortConfiguration = supportsLocalPortConfiguration;
    return this;
  }

   /**
   * Get supportsLocalPortConfiguration
   * @return supportsLocalPortConfiguration
  **/
  @Schema(description = "")
  public Boolean isSupportsLocalPortConfiguration() {
    return supportsLocalPortConfiguration;
  }

  public void setSupportsLocalPortConfiguration(Boolean supportsLocalPortConfiguration) {
    this.supportsLocalPortConfiguration = supportsLocalPortConfiguration;
  }

  public SystemInfo supportsWakeServer(Boolean supportsWakeServer) {
    this.supportsWakeServer = supportsWakeServer;
    return this;
  }

   /**
   * Get supportsWakeServer
   * @return supportsWakeServer
  **/
  @Schema(description = "")
  public Boolean isSupportsWakeServer() {
    return supportsWakeServer;
  }

  public void setSupportsWakeServer(Boolean supportsWakeServer) {
    this.supportsWakeServer = supportsWakeServer;
  }

  public SystemInfo webSocketPortNumber(Integer webSocketPortNumber) {
    this.webSocketPortNumber = webSocketPortNumber;
    return this;
  }

   /**
   * The web socket port number.
   * @return webSocketPortNumber
  **/
  @Schema(description = "The web socket port number.")
  public Integer getWebSocketPortNumber() {
    return webSocketPortNumber;
  }

  public void setWebSocketPortNumber(Integer webSocketPortNumber) {
    this.webSocketPortNumber = webSocketPortNumber;
  }

  public SystemInfo completedInstallations(List<InstallationInfo> completedInstallations) {
    this.completedInstallations = completedInstallations;
    return this;
  }

  public SystemInfo addCompletedInstallationsItem(InstallationInfo completedInstallationsItem) {
    if (this.completedInstallations == null) {
      this.completedInstallations = new ArrayList<InstallationInfo>();
    }
    this.completedInstallations.add(completedInstallationsItem);
    return this;
  }

   /**
   * The completed installations.
   * @return completedInstallations
  **/
  @Schema(description = "The completed installations.")
  public List<InstallationInfo> getCompletedInstallations() {
    return completedInstallations;
  }

  public void setCompletedInstallations(List<InstallationInfo> completedInstallations) {
    this.completedInstallations = completedInstallations;
  }

  public SystemInfo canSelfRestart(Boolean canSelfRestart) {
    this.canSelfRestart = canSelfRestart;
    return this;
  }

   /**
   * A value indicating whether this instance can self restart.
   * @return canSelfRestart
  **/
  @Schema(description = "A value indicating whether this instance can self restart.")
  public Boolean isCanSelfRestart() {
    return canSelfRestart;
  }

  public void setCanSelfRestart(Boolean canSelfRestart) {
    this.canSelfRestart = canSelfRestart;
  }

  public SystemInfo canSelfUpdate(Boolean canSelfUpdate) {
    this.canSelfUpdate = canSelfUpdate;
    return this;
  }

   /**
   * A value indicating whether this instance can self update.
   * @return canSelfUpdate
  **/
  @Schema(description = "A value indicating whether this instance can self update.")
  public Boolean isCanSelfUpdate() {
    return canSelfUpdate;
  }

  public void setCanSelfUpdate(Boolean canSelfUpdate) {
    this.canSelfUpdate = canSelfUpdate;
  }

  public SystemInfo canLaunchWebBrowser(Boolean canLaunchWebBrowser) {
    this.canLaunchWebBrowser = canLaunchWebBrowser;
    return this;
  }

   /**
   * Get canLaunchWebBrowser
   * @return canLaunchWebBrowser
  **/
  @Schema(description = "")
  public Boolean isCanLaunchWebBrowser() {
    return canLaunchWebBrowser;
  }

  public void setCanLaunchWebBrowser(Boolean canLaunchWebBrowser) {
    this.canLaunchWebBrowser = canLaunchWebBrowser;
  }

  public SystemInfo programDataPath(String programDataPath) {
    this.programDataPath = programDataPath;
    return this;
  }

   /**
   * The program data path.
   * @return programDataPath
  **/
  @Schema(description = "The program data path.")
  public String getProgramDataPath() {
    return programDataPath;
  }

  public void setProgramDataPath(String programDataPath) {
    this.programDataPath = programDataPath;
  }

  public SystemInfo itemsByNamePath(String itemsByNamePath) {
    this.itemsByNamePath = itemsByNamePath;
    return this;
  }

   /**
   * The items by name path.
   * @return itemsByNamePath
  **/
  @Schema(description = "The items by name path.")
  public String getItemsByNamePath() {
    return itemsByNamePath;
  }

  public void setItemsByNamePath(String itemsByNamePath) {
    this.itemsByNamePath = itemsByNamePath;
  }

  public SystemInfo cachePath(String cachePath) {
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

  public SystemInfo logPath(String logPath) {
    this.logPath = logPath;
    return this;
  }

   /**
   * The log path.
   * @return logPath
  **/
  @Schema(description = "The log path.")
  public String getLogPath() {
    return logPath;
  }

  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }

  public SystemInfo internalMetadataPath(String internalMetadataPath) {
    this.internalMetadataPath = internalMetadataPath;
    return this;
  }

   /**
   * The internal metadata path.
   * @return internalMetadataPath
  **/
  @Schema(description = "The internal metadata path.")
  public String getInternalMetadataPath() {
    return internalMetadataPath;
  }

  public void setInternalMetadataPath(String internalMetadataPath) {
    this.internalMetadataPath = internalMetadataPath;
  }

  public SystemInfo transcodingTempPath(String transcodingTempPath) {
    this.transcodingTempPath = transcodingTempPath;
    return this;
  }

   /**
   * The transcoding temporary path.
   * @return transcodingTempPath
  **/
  @Schema(description = "The transcoding temporary path.")
  public String getTranscodingTempPath() {
    return transcodingTempPath;
  }

  public void setTranscodingTempPath(String transcodingTempPath) {
    this.transcodingTempPath = transcodingTempPath;
  }

  public SystemInfo httpServerPortNumber(Integer httpServerPortNumber) {
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

  public SystemInfo supportsHttps(Boolean supportsHttps) {
    this.supportsHttps = supportsHttps;
    return this;
  }

   /**
   * A value indicating whether \\[enable HTTPS\\].
   * @return supportsHttps
  **/
  @Schema(description = "A value indicating whether \\[enable HTTPS\\].")
  public Boolean isSupportsHttps() {
    return supportsHttps;
  }

  public void setSupportsHttps(Boolean supportsHttps) {
    this.supportsHttps = supportsHttps;
  }

  public SystemInfo httpsPortNumber(Integer httpsPortNumber) {
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

  public SystemInfo hasUpdateAvailable(Boolean hasUpdateAvailable) {
    this.hasUpdateAvailable = hasUpdateAvailable;
    return this;
  }

   /**
   * A value indicating whether this instance has update available.
   * @return hasUpdateAvailable
  **/
  @Schema(description = "A value indicating whether this instance has update available.")
  public Boolean isHasUpdateAvailable() {
    return hasUpdateAvailable;
  }

  public void setHasUpdateAvailable(Boolean hasUpdateAvailable) {
    this.hasUpdateAvailable = hasUpdateAvailable;
  }

  public SystemInfo supportsAutoRunAtStartup(Boolean supportsAutoRunAtStartup) {
    this.supportsAutoRunAtStartup = supportsAutoRunAtStartup;
    return this;
  }

   /**
   * A value indicating whether \\[supports automatic run at startup\\].
   * @return supportsAutoRunAtStartup
  **/
  @Schema(description = "A value indicating whether \\[supports automatic run at startup\\].")
  public Boolean isSupportsAutoRunAtStartup() {
    return supportsAutoRunAtStartup;
  }

  public void setSupportsAutoRunAtStartup(Boolean supportsAutoRunAtStartup) {
    this.supportsAutoRunAtStartup = supportsAutoRunAtStartup;
  }

  public SystemInfo hardwareAccelerationRequiresPremiere(Boolean hardwareAccelerationRequiresPremiere) {
    this.hardwareAccelerationRequiresPremiere = hardwareAccelerationRequiresPremiere;
    return this;
  }

   /**
   * Get hardwareAccelerationRequiresPremiere
   * @return hardwareAccelerationRequiresPremiere
  **/
  @Schema(description = "")
  public Boolean isHardwareAccelerationRequiresPremiere() {
    return hardwareAccelerationRequiresPremiere;
  }

  public void setHardwareAccelerationRequiresPremiere(Boolean hardwareAccelerationRequiresPremiere) {
    this.hardwareAccelerationRequiresPremiere = hardwareAccelerationRequiresPremiere;
  }

  public SystemInfo wakeOnLanInfo(List<WakeOnLanInfo> wakeOnLanInfo) {
    this.wakeOnLanInfo = wakeOnLanInfo;
    return this;
  }

  public SystemInfo addWakeOnLanInfoItem(WakeOnLanInfo wakeOnLanInfoItem) {
    if (this.wakeOnLanInfo == null) {
      this.wakeOnLanInfo = new ArrayList<WakeOnLanInfo>();
    }
    this.wakeOnLanInfo.add(wakeOnLanInfoItem);
    return this;
  }

   /**
   * Get wakeOnLanInfo
   * @return wakeOnLanInfo
  **/
  @Schema(description = "")
  public List<WakeOnLanInfo> getWakeOnLanInfo() {
    return wakeOnLanInfo;
  }

  public void setWakeOnLanInfo(List<WakeOnLanInfo> wakeOnLanInfo) {
    this.wakeOnLanInfo = wakeOnLanInfo;
  }

  public SystemInfo localAddress(String localAddress) {
    this.localAddress = localAddress;
    return this;
  }

   /**
   * The local address.
   * @return localAddress
  **/
  @Schema(description = "The local address.")
  public String getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(String localAddress) {
    this.localAddress = localAddress;
  }

  public SystemInfo localAddresses(List<String> localAddresses) {
    this.localAddresses = localAddresses;
    return this;
  }

  public SystemInfo addLocalAddressesItem(String localAddressesItem) {
    if (this.localAddresses == null) {
      this.localAddresses = new ArrayList<String>();
    }
    this.localAddresses.add(localAddressesItem);
    return this;
  }

   /**
   * Get localAddresses
   * @return localAddresses
  **/
  @Schema(description = "")
  public List<String> getLocalAddresses() {
    return localAddresses;
  }

  public void setLocalAddresses(List<String> localAddresses) {
    this.localAddresses = localAddresses;
  }

  public SystemInfo wanAddress(String wanAddress) {
    this.wanAddress = wanAddress;
    return this;
  }

   /**
   * The wan address.
   * @return wanAddress
  **/
  @Schema(description = "The wan address.")
  public String getWanAddress() {
    return wanAddress;
  }

  public void setWanAddress(String wanAddress) {
    this.wanAddress = wanAddress;
  }

  public SystemInfo remoteAddresses(List<String> remoteAddresses) {
    this.remoteAddresses = remoteAddresses;
    return this;
  }

  public SystemInfo addRemoteAddressesItem(String remoteAddressesItem) {
    if (this.remoteAddresses == null) {
      this.remoteAddresses = new ArrayList<String>();
    }
    this.remoteAddresses.add(remoteAddressesItem);
    return this;
  }

   /**
   * Get remoteAddresses
   * @return remoteAddresses
  **/
  @Schema(description = "")
  public List<String> getRemoteAddresses() {
    return remoteAddresses;
  }

  public void setRemoteAddresses(List<String> remoteAddresses) {
    this.remoteAddresses = remoteAddresses;
  }

  public SystemInfo serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * The name of the server.
   * @return serverName
  **/
  @Schema(description = "The name of the server.")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public SystemInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version.
   * @return version
  **/
  @Schema(description = "The version.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id.
   * @return id
  **/
  @Schema(description = "The id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return Objects.equals(this.systemUpdateLevel, systemInfo.systemUpdateLevel) &&
        Objects.equals(this.operatingSystemDisplayName, systemInfo.operatingSystemDisplayName) &&
        Objects.equals(this.packageName, systemInfo.packageName) &&
        Objects.equals(this.hasPendingRestart, systemInfo.hasPendingRestart) &&
        Objects.equals(this.isShuttingDown, systemInfo.isShuttingDown) &&
        Objects.equals(this.hasImageEnhancers, systemInfo.hasImageEnhancers) &&
        Objects.equals(this.operatingSystem, systemInfo.operatingSystem) &&
        Objects.equals(this.supportsLibraryMonitor, systemInfo.supportsLibraryMonitor) &&
        Objects.equals(this.supportsLocalPortConfiguration, systemInfo.supportsLocalPortConfiguration) &&
        Objects.equals(this.supportsWakeServer, systemInfo.supportsWakeServer) &&
        Objects.equals(this.webSocketPortNumber, systemInfo.webSocketPortNumber) &&
        Objects.equals(this.completedInstallations, systemInfo.completedInstallations) &&
        Objects.equals(this.canSelfRestart, systemInfo.canSelfRestart) &&
        Objects.equals(this.canSelfUpdate, systemInfo.canSelfUpdate) &&
        Objects.equals(this.canLaunchWebBrowser, systemInfo.canLaunchWebBrowser) &&
        Objects.equals(this.programDataPath, systemInfo.programDataPath) &&
        Objects.equals(this.itemsByNamePath, systemInfo.itemsByNamePath) &&
        Objects.equals(this.cachePath, systemInfo.cachePath) &&
        Objects.equals(this.logPath, systemInfo.logPath) &&
        Objects.equals(this.internalMetadataPath, systemInfo.internalMetadataPath) &&
        Objects.equals(this.transcodingTempPath, systemInfo.transcodingTempPath) &&
        Objects.equals(this.httpServerPortNumber, systemInfo.httpServerPortNumber) &&
        Objects.equals(this.supportsHttps, systemInfo.supportsHttps) &&
        Objects.equals(this.httpsPortNumber, systemInfo.httpsPortNumber) &&
        Objects.equals(this.hasUpdateAvailable, systemInfo.hasUpdateAvailable) &&
        Objects.equals(this.supportsAutoRunAtStartup, systemInfo.supportsAutoRunAtStartup) &&
        Objects.equals(this.hardwareAccelerationRequiresPremiere, systemInfo.hardwareAccelerationRequiresPremiere) &&
        Objects.equals(this.wakeOnLanInfo, systemInfo.wakeOnLanInfo) &&
        Objects.equals(this.localAddress, systemInfo.localAddress) &&
        Objects.equals(this.localAddresses, systemInfo.localAddresses) &&
        Objects.equals(this.wanAddress, systemInfo.wanAddress) &&
        Objects.equals(this.remoteAddresses, systemInfo.remoteAddresses) &&
        Objects.equals(this.serverName, systemInfo.serverName) &&
        Objects.equals(this.version, systemInfo.version) &&
        Objects.equals(this.id, systemInfo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemUpdateLevel, operatingSystemDisplayName, packageName, hasPendingRestart, isShuttingDown, hasImageEnhancers, operatingSystem, supportsLibraryMonitor, supportsLocalPortConfiguration, supportsWakeServer, webSocketPortNumber, completedInstallations, canSelfRestart, canSelfUpdate, canLaunchWebBrowser, programDataPath, itemsByNamePath, cachePath, logPath, internalMetadataPath, transcodingTempPath, httpServerPortNumber, supportsHttps, httpsPortNumber, hasUpdateAvailable, supportsAutoRunAtStartup, hardwareAccelerationRequiresPremiere, wakeOnLanInfo, localAddress, localAddresses, wanAddress, remoteAddresses, serverName, version, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("    systemUpdateLevel: ").append(toIndentedString(systemUpdateLevel)).append("\n");
    sb.append("    operatingSystemDisplayName: ").append(toIndentedString(operatingSystemDisplayName)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    hasPendingRestart: ").append(toIndentedString(hasPendingRestart)).append("\n");
    sb.append("    isShuttingDown: ").append(toIndentedString(isShuttingDown)).append("\n");
    sb.append("    hasImageEnhancers: ").append(toIndentedString(hasImageEnhancers)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    supportsLibraryMonitor: ").append(toIndentedString(supportsLibraryMonitor)).append("\n");
    sb.append("    supportsLocalPortConfiguration: ").append(toIndentedString(supportsLocalPortConfiguration)).append("\n");
    sb.append("    supportsWakeServer: ").append(toIndentedString(supportsWakeServer)).append("\n");
    sb.append("    webSocketPortNumber: ").append(toIndentedString(webSocketPortNumber)).append("\n");
    sb.append("    completedInstallations: ").append(toIndentedString(completedInstallations)).append("\n");
    sb.append("    canSelfRestart: ").append(toIndentedString(canSelfRestart)).append("\n");
    sb.append("    canSelfUpdate: ").append(toIndentedString(canSelfUpdate)).append("\n");
    sb.append("    canLaunchWebBrowser: ").append(toIndentedString(canLaunchWebBrowser)).append("\n");
    sb.append("    programDataPath: ").append(toIndentedString(programDataPath)).append("\n");
    sb.append("    itemsByNamePath: ").append(toIndentedString(itemsByNamePath)).append("\n");
    sb.append("    cachePath: ").append(toIndentedString(cachePath)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    internalMetadataPath: ").append(toIndentedString(internalMetadataPath)).append("\n");
    sb.append("    transcodingTempPath: ").append(toIndentedString(transcodingTempPath)).append("\n");
    sb.append("    httpServerPortNumber: ").append(toIndentedString(httpServerPortNumber)).append("\n");
    sb.append("    supportsHttps: ").append(toIndentedString(supportsHttps)).append("\n");
    sb.append("    httpsPortNumber: ").append(toIndentedString(httpsPortNumber)).append("\n");
    sb.append("    hasUpdateAvailable: ").append(toIndentedString(hasUpdateAvailable)).append("\n");
    sb.append("    supportsAutoRunAtStartup: ").append(toIndentedString(supportsAutoRunAtStartup)).append("\n");
    sb.append("    hardwareAccelerationRequiresPremiere: ").append(toIndentedString(hardwareAccelerationRequiresPremiere)).append("\n");
    sb.append("    wakeOnLanInfo: ").append(toIndentedString(wakeOnLanInfo)).append("\n");
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    localAddresses: ").append(toIndentedString(localAddresses)).append("\n");
    sb.append("    wanAddress: ").append(toIndentedString(wanAddress)).append("\n");
    sb.append("    remoteAddresses: ").append(toIndentedString(remoteAddresses)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
