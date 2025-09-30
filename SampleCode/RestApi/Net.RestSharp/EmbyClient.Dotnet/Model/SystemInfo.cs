/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// Class SystemInfo  
    /// </summary>
    [DataContract]
        public partial class SystemInfo :  IEquatable<SystemInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SystemInfo" /> class.
        /// </summary>
        /// <param name="systemUpdateLevel">systemUpdateLevel.</param>
        /// <param name="operatingSystemDisplayName">The display name of the operating system..</param>
        /// <param name="packageName">packageName.</param>
        /// <param name="hasPendingRestart">A value indicating whether this instance has pending restart..</param>
        /// <param name="isShuttingDown">isShuttingDown.</param>
        /// <param name="hasImageEnhancers">hasImageEnhancers.</param>
        /// <param name="operatingSystem">The operating sytem..</param>
        /// <param name="supportsLibraryMonitor">A value indicating whether \\[supports library monitor\\]..</param>
        /// <param name="supportsLocalPortConfiguration">supportsLocalPortConfiguration.</param>
        /// <param name="supportsWakeServer">supportsWakeServer.</param>
        /// <param name="webSocketPortNumber">The web socket port number..</param>
        /// <param name="completedInstallations">The completed installations..</param>
        /// <param name="canSelfRestart">A value indicating whether this instance can self restart..</param>
        /// <param name="canSelfUpdate">A value indicating whether this instance can self update..</param>
        /// <param name="canLaunchWebBrowser">canLaunchWebBrowser.</param>
        /// <param name="programDataPath">The program data path..</param>
        /// <param name="itemsByNamePath">The items by name path..</param>
        /// <param name="cachePath">The cache path..</param>
        /// <param name="logPath">The log path..</param>
        /// <param name="internalMetadataPath">The internal metadata path..</param>
        /// <param name="transcodingTempPath">The transcoding temporary path..</param>
        /// <param name="httpServerPortNumber">The HTTP server port number..</param>
        /// <param name="supportsHttps">A value indicating whether \\[enable HTTPS\\]..</param>
        /// <param name="httpsPortNumber">The HTTPS server port number..</param>
        /// <param name="hasUpdateAvailable">A value indicating whether this instance has update available..</param>
        /// <param name="supportsAutoRunAtStartup">A value indicating whether \\[supports automatic run at startup\\]..</param>
        /// <param name="hardwareAccelerationRequiresPremiere">hardwareAccelerationRequiresPremiere.</param>
        /// <param name="wakeOnLanInfo">wakeOnLanInfo.</param>
        /// <param name="isInMaintenanceMode">isInMaintenanceMode.</param>
        /// <param name="localAddress">The local address..</param>
        /// <param name="localAddresses">localAddresses.</param>
        /// <param name="wanAddress">The wan address..</param>
        /// <param name="remoteAddresses">remoteAddresses.</param>
        /// <param name="serverName">The name of the server..</param>
        /// <param name="version">The version..</param>
        /// <param name="id">The id..</param>
        public SystemInfo(PackageVersionClass systemUpdateLevel = default(PackageVersionClass), string operatingSystemDisplayName = default(string), string packageName = default(string), bool? hasPendingRestart = default(bool?), bool? isShuttingDown = default(bool?), bool? hasImageEnhancers = default(bool?), string operatingSystem = default(string), bool? supportsLibraryMonitor = default(bool?), bool? supportsLocalPortConfiguration = default(bool?), bool? supportsWakeServer = default(bool?), int? webSocketPortNumber = default(int?), List<InstallationInfo> completedInstallations = default(List<InstallationInfo>), bool? canSelfRestart = default(bool?), bool? canSelfUpdate = default(bool?), bool? canLaunchWebBrowser = default(bool?), string programDataPath = default(string), string itemsByNamePath = default(string), string cachePath = default(string), string logPath = default(string), string internalMetadataPath = default(string), string transcodingTempPath = default(string), int? httpServerPortNumber = default(int?), bool? supportsHttps = default(bool?), int? httpsPortNumber = default(int?), bool? hasUpdateAvailable = default(bool?), bool? supportsAutoRunAtStartup = default(bool?), bool? hardwareAccelerationRequiresPremiere = default(bool?), List<WakeOnLanInfo> wakeOnLanInfo = default(List<WakeOnLanInfo>), bool? isInMaintenanceMode = default(bool?), string localAddress = default(string), List<string> localAddresses = default(List<string>), string wanAddress = default(string), List<string> remoteAddresses = default(List<string>), string serverName = default(string), string version = default(string), string id = default(string))
        {
            this.SystemUpdateLevel = systemUpdateLevel;
            this.OperatingSystemDisplayName = operatingSystemDisplayName;
            this.PackageName = packageName;
            this.HasPendingRestart = hasPendingRestart;
            this.IsShuttingDown = isShuttingDown;
            this.HasImageEnhancers = hasImageEnhancers;
            this.OperatingSystem = operatingSystem;
            this.SupportsLibraryMonitor = supportsLibraryMonitor;
            this.SupportsLocalPortConfiguration = supportsLocalPortConfiguration;
            this.SupportsWakeServer = supportsWakeServer;
            this.WebSocketPortNumber = webSocketPortNumber;
            this.CompletedInstallations = completedInstallations;
            this.CanSelfRestart = canSelfRestart;
            this.CanSelfUpdate = canSelfUpdate;
            this.CanLaunchWebBrowser = canLaunchWebBrowser;
            this.ProgramDataPath = programDataPath;
            this.ItemsByNamePath = itemsByNamePath;
            this.CachePath = cachePath;
            this.LogPath = logPath;
            this.InternalMetadataPath = internalMetadataPath;
            this.TranscodingTempPath = transcodingTempPath;
            this.HttpServerPortNumber = httpServerPortNumber;
            this.SupportsHttps = supportsHttps;
            this.HttpsPortNumber = httpsPortNumber;
            this.HasUpdateAvailable = hasUpdateAvailable;
            this.SupportsAutoRunAtStartup = supportsAutoRunAtStartup;
            this.HardwareAccelerationRequiresPremiere = hardwareAccelerationRequiresPremiere;
            this.WakeOnLanInfo = wakeOnLanInfo;
            this.IsInMaintenanceMode = isInMaintenanceMode;
            this.LocalAddress = localAddress;
            this.LocalAddresses = localAddresses;
            this.WanAddress = wanAddress;
            this.RemoteAddresses = remoteAddresses;
            this.ServerName = serverName;
            this.Version = version;
            this.Id = id;
        }
        
        /// <summary>
        /// Gets or Sets SystemUpdateLevel
        /// </summary>
        [DataMember(Name="SystemUpdateLevel", EmitDefaultValue=false)]
        public PackageVersionClass SystemUpdateLevel { get; set; }

        /// <summary>
        /// The display name of the operating system.
        /// </summary>
        /// <value>The display name of the operating system.</value>
        [DataMember(Name="OperatingSystemDisplayName", EmitDefaultValue=false)]
        public string OperatingSystemDisplayName { get; set; }

        /// <summary>
        /// Gets or Sets PackageName
        /// </summary>
        [DataMember(Name="PackageName", EmitDefaultValue=false)]
        public string PackageName { get; set; }

        /// <summary>
        /// A value indicating whether this instance has pending restart.
        /// </summary>
        /// <value>A value indicating whether this instance has pending restart.</value>
        [DataMember(Name="HasPendingRestart", EmitDefaultValue=false)]
        public bool? HasPendingRestart { get; set; }

        /// <summary>
        /// Gets or Sets IsShuttingDown
        /// </summary>
        [DataMember(Name="IsShuttingDown", EmitDefaultValue=false)]
        public bool? IsShuttingDown { get; set; }

        /// <summary>
        /// Gets or Sets HasImageEnhancers
        /// </summary>
        [DataMember(Name="HasImageEnhancers", EmitDefaultValue=false)]
        public bool? HasImageEnhancers { get; set; }

        /// <summary>
        /// The operating sytem.
        /// </summary>
        /// <value>The operating sytem.</value>
        [DataMember(Name="OperatingSystem", EmitDefaultValue=false)]
        public string OperatingSystem { get; set; }

        /// <summary>
        /// A value indicating whether \\[supports library monitor\\].
        /// </summary>
        /// <value>A value indicating whether \\[supports library monitor\\].</value>
        [DataMember(Name="SupportsLibraryMonitor", EmitDefaultValue=false)]
        public bool? SupportsLibraryMonitor { get; set; }

        /// <summary>
        /// Gets or Sets SupportsLocalPortConfiguration
        /// </summary>
        [DataMember(Name="SupportsLocalPortConfiguration", EmitDefaultValue=false)]
        public bool? SupportsLocalPortConfiguration { get; set; }

        /// <summary>
        /// Gets or Sets SupportsWakeServer
        /// </summary>
        [DataMember(Name="SupportsWakeServer", EmitDefaultValue=false)]
        public bool? SupportsWakeServer { get; set; }

        /// <summary>
        /// The web socket port number.
        /// </summary>
        /// <value>The web socket port number.</value>
        [DataMember(Name="WebSocketPortNumber", EmitDefaultValue=false)]
        public int? WebSocketPortNumber { get; set; }

        /// <summary>
        /// The completed installations.
        /// </summary>
        /// <value>The completed installations.</value>
        [DataMember(Name="CompletedInstallations", EmitDefaultValue=false)]
        public List<InstallationInfo> CompletedInstallations { get; set; }

        /// <summary>
        /// A value indicating whether this instance can self restart.
        /// </summary>
        /// <value>A value indicating whether this instance can self restart.</value>
        [DataMember(Name="CanSelfRestart", EmitDefaultValue=false)]
        public bool? CanSelfRestart { get; set; }

        /// <summary>
        /// A value indicating whether this instance can self update.
        /// </summary>
        /// <value>A value indicating whether this instance can self update.</value>
        [DataMember(Name="CanSelfUpdate", EmitDefaultValue=false)]
        public bool? CanSelfUpdate { get; set; }

        /// <summary>
        /// Gets or Sets CanLaunchWebBrowser
        /// </summary>
        [DataMember(Name="CanLaunchWebBrowser", EmitDefaultValue=false)]
        public bool? CanLaunchWebBrowser { get; set; }

        /// <summary>
        /// The program data path.
        /// </summary>
        /// <value>The program data path.</value>
        [DataMember(Name="ProgramDataPath", EmitDefaultValue=false)]
        public string ProgramDataPath { get; set; }

        /// <summary>
        /// The items by name path.
        /// </summary>
        /// <value>The items by name path.</value>
        [DataMember(Name="ItemsByNamePath", EmitDefaultValue=false)]
        public string ItemsByNamePath { get; set; }

        /// <summary>
        /// The cache path.
        /// </summary>
        /// <value>The cache path.</value>
        [DataMember(Name="CachePath", EmitDefaultValue=false)]
        public string CachePath { get; set; }

        /// <summary>
        /// The log path.
        /// </summary>
        /// <value>The log path.</value>
        [DataMember(Name="LogPath", EmitDefaultValue=false)]
        public string LogPath { get; set; }

        /// <summary>
        /// The internal metadata path.
        /// </summary>
        /// <value>The internal metadata path.</value>
        [DataMember(Name="InternalMetadataPath", EmitDefaultValue=false)]
        public string InternalMetadataPath { get; set; }

        /// <summary>
        /// The transcoding temporary path.
        /// </summary>
        /// <value>The transcoding temporary path.</value>
        [DataMember(Name="TranscodingTempPath", EmitDefaultValue=false)]
        public string TranscodingTempPath { get; set; }

        /// <summary>
        /// The HTTP server port number.
        /// </summary>
        /// <value>The HTTP server port number.</value>
        [DataMember(Name="HttpServerPortNumber", EmitDefaultValue=false)]
        public int? HttpServerPortNumber { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable HTTPS\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable HTTPS\\].</value>
        [DataMember(Name="SupportsHttps", EmitDefaultValue=false)]
        public bool? SupportsHttps { get; set; }

        /// <summary>
        /// The HTTPS server port number.
        /// </summary>
        /// <value>The HTTPS server port number.</value>
        [DataMember(Name="HttpsPortNumber", EmitDefaultValue=false)]
        public int? HttpsPortNumber { get; set; }

        /// <summary>
        /// A value indicating whether this instance has update available.
        /// </summary>
        /// <value>A value indicating whether this instance has update available.</value>
        [DataMember(Name="HasUpdateAvailable", EmitDefaultValue=false)]
        public bool? HasUpdateAvailable { get; set; }

        /// <summary>
        /// A value indicating whether \\[supports automatic run at startup\\].
        /// </summary>
        /// <value>A value indicating whether \\[supports automatic run at startup\\].</value>
        [DataMember(Name="SupportsAutoRunAtStartup", EmitDefaultValue=false)]
        public bool? SupportsAutoRunAtStartup { get; set; }

        /// <summary>
        /// Gets or Sets HardwareAccelerationRequiresPremiere
        /// </summary>
        [DataMember(Name="HardwareAccelerationRequiresPremiere", EmitDefaultValue=false)]
        public bool? HardwareAccelerationRequiresPremiere { get; set; }

        /// <summary>
        /// Gets or Sets WakeOnLanInfo
        /// </summary>
        [DataMember(Name="WakeOnLanInfo", EmitDefaultValue=false)]
        public List<WakeOnLanInfo> WakeOnLanInfo { get; set; }

        /// <summary>
        /// Gets or Sets IsInMaintenanceMode
        /// </summary>
        [DataMember(Name="IsInMaintenanceMode", EmitDefaultValue=false)]
        public bool? IsInMaintenanceMode { get; set; }

        /// <summary>
        /// The local address.
        /// </summary>
        /// <value>The local address.</value>
        [DataMember(Name="LocalAddress", EmitDefaultValue=false)]
        public string LocalAddress { get; set; }

        /// <summary>
        /// Gets or Sets LocalAddresses
        /// </summary>
        [DataMember(Name="LocalAddresses", EmitDefaultValue=false)]
        public List<string> LocalAddresses { get; set; }

        /// <summary>
        /// The wan address.
        /// </summary>
        /// <value>The wan address.</value>
        [DataMember(Name="WanAddress", EmitDefaultValue=false)]
        public string WanAddress { get; set; }

        /// <summary>
        /// Gets or Sets RemoteAddresses
        /// </summary>
        [DataMember(Name="RemoteAddresses", EmitDefaultValue=false)]
        public List<string> RemoteAddresses { get; set; }

        /// <summary>
        /// The name of the server.
        /// </summary>
        /// <value>The name of the server.</value>
        [DataMember(Name="ServerName", EmitDefaultValue=false)]
        public string ServerName { get; set; }

        /// <summary>
        /// The version.
        /// </summary>
        /// <value>The version.</value>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// The id.
        /// </summary>
        /// <value>The id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SystemInfo {\n");
            sb.Append("  SystemUpdateLevel: ").Append(SystemUpdateLevel).Append("\n");
            sb.Append("  OperatingSystemDisplayName: ").Append(OperatingSystemDisplayName).Append("\n");
            sb.Append("  PackageName: ").Append(PackageName).Append("\n");
            sb.Append("  HasPendingRestart: ").Append(HasPendingRestart).Append("\n");
            sb.Append("  IsShuttingDown: ").Append(IsShuttingDown).Append("\n");
            sb.Append("  HasImageEnhancers: ").Append(HasImageEnhancers).Append("\n");
            sb.Append("  OperatingSystem: ").Append(OperatingSystem).Append("\n");
            sb.Append("  SupportsLibraryMonitor: ").Append(SupportsLibraryMonitor).Append("\n");
            sb.Append("  SupportsLocalPortConfiguration: ").Append(SupportsLocalPortConfiguration).Append("\n");
            sb.Append("  SupportsWakeServer: ").Append(SupportsWakeServer).Append("\n");
            sb.Append("  WebSocketPortNumber: ").Append(WebSocketPortNumber).Append("\n");
            sb.Append("  CompletedInstallations: ").Append(CompletedInstallations).Append("\n");
            sb.Append("  CanSelfRestart: ").Append(CanSelfRestart).Append("\n");
            sb.Append("  CanSelfUpdate: ").Append(CanSelfUpdate).Append("\n");
            sb.Append("  CanLaunchWebBrowser: ").Append(CanLaunchWebBrowser).Append("\n");
            sb.Append("  ProgramDataPath: ").Append(ProgramDataPath).Append("\n");
            sb.Append("  ItemsByNamePath: ").Append(ItemsByNamePath).Append("\n");
            sb.Append("  CachePath: ").Append(CachePath).Append("\n");
            sb.Append("  LogPath: ").Append(LogPath).Append("\n");
            sb.Append("  InternalMetadataPath: ").Append(InternalMetadataPath).Append("\n");
            sb.Append("  TranscodingTempPath: ").Append(TranscodingTempPath).Append("\n");
            sb.Append("  HttpServerPortNumber: ").Append(HttpServerPortNumber).Append("\n");
            sb.Append("  SupportsHttps: ").Append(SupportsHttps).Append("\n");
            sb.Append("  HttpsPortNumber: ").Append(HttpsPortNumber).Append("\n");
            sb.Append("  HasUpdateAvailable: ").Append(HasUpdateAvailable).Append("\n");
            sb.Append("  SupportsAutoRunAtStartup: ").Append(SupportsAutoRunAtStartup).Append("\n");
            sb.Append("  HardwareAccelerationRequiresPremiere: ").Append(HardwareAccelerationRequiresPremiere).Append("\n");
            sb.Append("  WakeOnLanInfo: ").Append(WakeOnLanInfo).Append("\n");
            sb.Append("  IsInMaintenanceMode: ").Append(IsInMaintenanceMode).Append("\n");
            sb.Append("  LocalAddress: ").Append(LocalAddress).Append("\n");
            sb.Append("  LocalAddresses: ").Append(LocalAddresses).Append("\n");
            sb.Append("  WanAddress: ").Append(WanAddress).Append("\n");
            sb.Append("  RemoteAddresses: ").Append(RemoteAddresses).Append("\n");
            sb.Append("  ServerName: ").Append(ServerName).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SystemInfo);
        }

        /// <summary>
        /// Returns true if SystemInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of SystemInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SystemInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SystemUpdateLevel == input.SystemUpdateLevel ||
                    (this.SystemUpdateLevel != null &&
                    this.SystemUpdateLevel.Equals(input.SystemUpdateLevel))
                ) && 
                (
                    this.OperatingSystemDisplayName == input.OperatingSystemDisplayName ||
                    (this.OperatingSystemDisplayName != null &&
                    this.OperatingSystemDisplayName.Equals(input.OperatingSystemDisplayName))
                ) && 
                (
                    this.PackageName == input.PackageName ||
                    (this.PackageName != null &&
                    this.PackageName.Equals(input.PackageName))
                ) && 
                (
                    this.HasPendingRestart == input.HasPendingRestart ||
                    (this.HasPendingRestart != null &&
                    this.HasPendingRestart.Equals(input.HasPendingRestart))
                ) && 
                (
                    this.IsShuttingDown == input.IsShuttingDown ||
                    (this.IsShuttingDown != null &&
                    this.IsShuttingDown.Equals(input.IsShuttingDown))
                ) && 
                (
                    this.HasImageEnhancers == input.HasImageEnhancers ||
                    (this.HasImageEnhancers != null &&
                    this.HasImageEnhancers.Equals(input.HasImageEnhancers))
                ) && 
                (
                    this.OperatingSystem == input.OperatingSystem ||
                    (this.OperatingSystem != null &&
                    this.OperatingSystem.Equals(input.OperatingSystem))
                ) && 
                (
                    this.SupportsLibraryMonitor == input.SupportsLibraryMonitor ||
                    (this.SupportsLibraryMonitor != null &&
                    this.SupportsLibraryMonitor.Equals(input.SupportsLibraryMonitor))
                ) && 
                (
                    this.SupportsLocalPortConfiguration == input.SupportsLocalPortConfiguration ||
                    (this.SupportsLocalPortConfiguration != null &&
                    this.SupportsLocalPortConfiguration.Equals(input.SupportsLocalPortConfiguration))
                ) && 
                (
                    this.SupportsWakeServer == input.SupportsWakeServer ||
                    (this.SupportsWakeServer != null &&
                    this.SupportsWakeServer.Equals(input.SupportsWakeServer))
                ) && 
                (
                    this.WebSocketPortNumber == input.WebSocketPortNumber ||
                    (this.WebSocketPortNumber != null &&
                    this.WebSocketPortNumber.Equals(input.WebSocketPortNumber))
                ) && 
                (
                    this.CompletedInstallations == input.CompletedInstallations ||
                    this.CompletedInstallations != null &&
                    input.CompletedInstallations != null &&
                    this.CompletedInstallations.SequenceEqual(input.CompletedInstallations)
                ) && 
                (
                    this.CanSelfRestart == input.CanSelfRestart ||
                    (this.CanSelfRestart != null &&
                    this.CanSelfRestart.Equals(input.CanSelfRestart))
                ) && 
                (
                    this.CanSelfUpdate == input.CanSelfUpdate ||
                    (this.CanSelfUpdate != null &&
                    this.CanSelfUpdate.Equals(input.CanSelfUpdate))
                ) && 
                (
                    this.CanLaunchWebBrowser == input.CanLaunchWebBrowser ||
                    (this.CanLaunchWebBrowser != null &&
                    this.CanLaunchWebBrowser.Equals(input.CanLaunchWebBrowser))
                ) && 
                (
                    this.ProgramDataPath == input.ProgramDataPath ||
                    (this.ProgramDataPath != null &&
                    this.ProgramDataPath.Equals(input.ProgramDataPath))
                ) && 
                (
                    this.ItemsByNamePath == input.ItemsByNamePath ||
                    (this.ItemsByNamePath != null &&
                    this.ItemsByNamePath.Equals(input.ItemsByNamePath))
                ) && 
                (
                    this.CachePath == input.CachePath ||
                    (this.CachePath != null &&
                    this.CachePath.Equals(input.CachePath))
                ) && 
                (
                    this.LogPath == input.LogPath ||
                    (this.LogPath != null &&
                    this.LogPath.Equals(input.LogPath))
                ) && 
                (
                    this.InternalMetadataPath == input.InternalMetadataPath ||
                    (this.InternalMetadataPath != null &&
                    this.InternalMetadataPath.Equals(input.InternalMetadataPath))
                ) && 
                (
                    this.TranscodingTempPath == input.TranscodingTempPath ||
                    (this.TranscodingTempPath != null &&
                    this.TranscodingTempPath.Equals(input.TranscodingTempPath))
                ) && 
                (
                    this.HttpServerPortNumber == input.HttpServerPortNumber ||
                    (this.HttpServerPortNumber != null &&
                    this.HttpServerPortNumber.Equals(input.HttpServerPortNumber))
                ) && 
                (
                    this.SupportsHttps == input.SupportsHttps ||
                    (this.SupportsHttps != null &&
                    this.SupportsHttps.Equals(input.SupportsHttps))
                ) && 
                (
                    this.HttpsPortNumber == input.HttpsPortNumber ||
                    (this.HttpsPortNumber != null &&
                    this.HttpsPortNumber.Equals(input.HttpsPortNumber))
                ) && 
                (
                    this.HasUpdateAvailable == input.HasUpdateAvailable ||
                    (this.HasUpdateAvailable != null &&
                    this.HasUpdateAvailable.Equals(input.HasUpdateAvailable))
                ) && 
                (
                    this.SupportsAutoRunAtStartup == input.SupportsAutoRunAtStartup ||
                    (this.SupportsAutoRunAtStartup != null &&
                    this.SupportsAutoRunAtStartup.Equals(input.SupportsAutoRunAtStartup))
                ) && 
                (
                    this.HardwareAccelerationRequiresPremiere == input.HardwareAccelerationRequiresPremiere ||
                    (this.HardwareAccelerationRequiresPremiere != null &&
                    this.HardwareAccelerationRequiresPremiere.Equals(input.HardwareAccelerationRequiresPremiere))
                ) && 
                (
                    this.WakeOnLanInfo == input.WakeOnLanInfo ||
                    this.WakeOnLanInfo != null &&
                    input.WakeOnLanInfo != null &&
                    this.WakeOnLanInfo.SequenceEqual(input.WakeOnLanInfo)
                ) && 
                (
                    this.IsInMaintenanceMode == input.IsInMaintenanceMode ||
                    (this.IsInMaintenanceMode != null &&
                    this.IsInMaintenanceMode.Equals(input.IsInMaintenanceMode))
                ) && 
                (
                    this.LocalAddress == input.LocalAddress ||
                    (this.LocalAddress != null &&
                    this.LocalAddress.Equals(input.LocalAddress))
                ) && 
                (
                    this.LocalAddresses == input.LocalAddresses ||
                    this.LocalAddresses != null &&
                    input.LocalAddresses != null &&
                    this.LocalAddresses.SequenceEqual(input.LocalAddresses)
                ) && 
                (
                    this.WanAddress == input.WanAddress ||
                    (this.WanAddress != null &&
                    this.WanAddress.Equals(input.WanAddress))
                ) && 
                (
                    this.RemoteAddresses == input.RemoteAddresses ||
                    this.RemoteAddresses != null &&
                    input.RemoteAddresses != null &&
                    this.RemoteAddresses.SequenceEqual(input.RemoteAddresses)
                ) && 
                (
                    this.ServerName == input.ServerName ||
                    (this.ServerName != null &&
                    this.ServerName.Equals(input.ServerName))
                ) && 
                (
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.SystemUpdateLevel != null)
                    hashCode = hashCode * 59 + this.SystemUpdateLevel.GetHashCode();
                if (this.OperatingSystemDisplayName != null)
                    hashCode = hashCode * 59 + this.OperatingSystemDisplayName.GetHashCode();
                if (this.PackageName != null)
                    hashCode = hashCode * 59 + this.PackageName.GetHashCode();
                if (this.HasPendingRestart != null)
                    hashCode = hashCode * 59 + this.HasPendingRestart.GetHashCode();
                if (this.IsShuttingDown != null)
                    hashCode = hashCode * 59 + this.IsShuttingDown.GetHashCode();
                if (this.HasImageEnhancers != null)
                    hashCode = hashCode * 59 + this.HasImageEnhancers.GetHashCode();
                if (this.OperatingSystem != null)
                    hashCode = hashCode * 59 + this.OperatingSystem.GetHashCode();
                if (this.SupportsLibraryMonitor != null)
                    hashCode = hashCode * 59 + this.SupportsLibraryMonitor.GetHashCode();
                if (this.SupportsLocalPortConfiguration != null)
                    hashCode = hashCode * 59 + this.SupportsLocalPortConfiguration.GetHashCode();
                if (this.SupportsWakeServer != null)
                    hashCode = hashCode * 59 + this.SupportsWakeServer.GetHashCode();
                if (this.WebSocketPortNumber != null)
                    hashCode = hashCode * 59 + this.WebSocketPortNumber.GetHashCode();
                if (this.CompletedInstallations != null)
                    hashCode = hashCode * 59 + this.CompletedInstallations.GetHashCode();
                if (this.CanSelfRestart != null)
                    hashCode = hashCode * 59 + this.CanSelfRestart.GetHashCode();
                if (this.CanSelfUpdate != null)
                    hashCode = hashCode * 59 + this.CanSelfUpdate.GetHashCode();
                if (this.CanLaunchWebBrowser != null)
                    hashCode = hashCode * 59 + this.CanLaunchWebBrowser.GetHashCode();
                if (this.ProgramDataPath != null)
                    hashCode = hashCode * 59 + this.ProgramDataPath.GetHashCode();
                if (this.ItemsByNamePath != null)
                    hashCode = hashCode * 59 + this.ItemsByNamePath.GetHashCode();
                if (this.CachePath != null)
                    hashCode = hashCode * 59 + this.CachePath.GetHashCode();
                if (this.LogPath != null)
                    hashCode = hashCode * 59 + this.LogPath.GetHashCode();
                if (this.InternalMetadataPath != null)
                    hashCode = hashCode * 59 + this.InternalMetadataPath.GetHashCode();
                if (this.TranscodingTempPath != null)
                    hashCode = hashCode * 59 + this.TranscodingTempPath.GetHashCode();
                if (this.HttpServerPortNumber != null)
                    hashCode = hashCode * 59 + this.HttpServerPortNumber.GetHashCode();
                if (this.SupportsHttps != null)
                    hashCode = hashCode * 59 + this.SupportsHttps.GetHashCode();
                if (this.HttpsPortNumber != null)
                    hashCode = hashCode * 59 + this.HttpsPortNumber.GetHashCode();
                if (this.HasUpdateAvailable != null)
                    hashCode = hashCode * 59 + this.HasUpdateAvailable.GetHashCode();
                if (this.SupportsAutoRunAtStartup != null)
                    hashCode = hashCode * 59 + this.SupportsAutoRunAtStartup.GetHashCode();
                if (this.HardwareAccelerationRequiresPremiere != null)
                    hashCode = hashCode * 59 + this.HardwareAccelerationRequiresPremiere.GetHashCode();
                if (this.WakeOnLanInfo != null)
                    hashCode = hashCode * 59 + this.WakeOnLanInfo.GetHashCode();
                if (this.IsInMaintenanceMode != null)
                    hashCode = hashCode * 59 + this.IsInMaintenanceMode.GetHashCode();
                if (this.LocalAddress != null)
                    hashCode = hashCode * 59 + this.LocalAddress.GetHashCode();
                if (this.LocalAddresses != null)
                    hashCode = hashCode * 59 + this.LocalAddresses.GetHashCode();
                if (this.WanAddress != null)
                    hashCode = hashCode * 59 + this.WanAddress.GetHashCode();
                if (this.RemoteAddresses != null)
                    hashCode = hashCode * 59 + this.RemoteAddresses.GetHashCode();
                if (this.ServerName != null)
                    hashCode = hashCode * 59 + this.ServerName.GetHashCode();
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                return hashCode;
            }
        }

    }
}
