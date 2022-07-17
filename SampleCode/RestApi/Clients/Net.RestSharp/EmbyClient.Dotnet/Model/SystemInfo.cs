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
    /// SystemInfo
    /// </summary>
    [DataContract]
        public partial class SystemInfo :  IEquatable<SystemInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SystemInfo" /> class.
        /// </summary>
        /// <param name="systemUpdateLevel">systemUpdateLevel.</param>
        /// <param name="operatingSystemDisplayName">operatingSystemDisplayName.</param>
        /// <param name="packageName">packageName.</param>
        /// <param name="hasPendingRestart">hasPendingRestart.</param>
        /// <param name="isShuttingDown">isShuttingDown.</param>
        /// <param name="operatingSystem">operatingSystem.</param>
        /// <param name="supportsLibraryMonitor">supportsLibraryMonitor.</param>
        /// <param name="supportsLocalPortConfiguration">supportsLocalPortConfiguration.</param>
        /// <param name="supportsWakeServer">supportsWakeServer.</param>
        /// <param name="webSocketPortNumber">webSocketPortNumber.</param>
        /// <param name="completedInstallations">completedInstallations.</param>
        /// <param name="canSelfRestart">canSelfRestart.</param>
        /// <param name="canSelfUpdate">canSelfUpdate.</param>
        /// <param name="canLaunchWebBrowser">canLaunchWebBrowser.</param>
        /// <param name="programDataPath">programDataPath.</param>
        /// <param name="itemsByNamePath">itemsByNamePath.</param>
        /// <param name="cachePath">cachePath.</param>
        /// <param name="logPath">logPath.</param>
        /// <param name="internalMetadataPath">internalMetadataPath.</param>
        /// <param name="transcodingTempPath">transcodingTempPath.</param>
        /// <param name="httpServerPortNumber">httpServerPortNumber.</param>
        /// <param name="supportsHttps">supportsHttps.</param>
        /// <param name="httpsPortNumber">httpsPortNumber.</param>
        /// <param name="hasUpdateAvailable">hasUpdateAvailable.</param>
        /// <param name="supportsAutoRunAtStartup">supportsAutoRunAtStartup.</param>
        /// <param name="hardwareAccelerationRequiresPremiere">hardwareAccelerationRequiresPremiere.</param>
        /// <param name="localAddress">localAddress.</param>
        /// <param name="localAddresses">localAddresses.</param>
        /// <param name="wanAddress">wanAddress.</param>
        /// <param name="remoteAddresses">remoteAddresses.</param>
        /// <param name="serverName">serverName.</param>
        /// <param name="version">version.</param>
        /// <param name="id">id.</param>
        public SystemInfo(UpdatesPackageVersionClass systemUpdateLevel = default(UpdatesPackageVersionClass), string operatingSystemDisplayName = default(string), string packageName = default(string), bool? hasPendingRestart = default(bool?), bool? isShuttingDown = default(bool?), string operatingSystem = default(string), bool? supportsLibraryMonitor = default(bool?), bool? supportsLocalPortConfiguration = default(bool?), bool? supportsWakeServer = default(bool?), int? webSocketPortNumber = default(int?), List<UpdatesInstallationInfo> completedInstallations = default(List<UpdatesInstallationInfo>), bool? canSelfRestart = default(bool?), bool? canSelfUpdate = default(bool?), bool? canLaunchWebBrowser = default(bool?), string programDataPath = default(string), string itemsByNamePath = default(string), string cachePath = default(string), string logPath = default(string), string internalMetadataPath = default(string), string transcodingTempPath = default(string), int? httpServerPortNumber = default(int?), bool? supportsHttps = default(bool?), int? httpsPortNumber = default(int?), bool? hasUpdateAvailable = default(bool?), bool? supportsAutoRunAtStartup = default(bool?), bool? hardwareAccelerationRequiresPremiere = default(bool?), string localAddress = default(string), List<string> localAddresses = default(List<string>), string wanAddress = default(string), List<string> remoteAddresses = default(List<string>), string serverName = default(string), string version = default(string), string id = default(string))
        {
            this.SystemUpdateLevel = systemUpdateLevel;
            this.OperatingSystemDisplayName = operatingSystemDisplayName;
            this.PackageName = packageName;
            this.HasPendingRestart = hasPendingRestart;
            this.IsShuttingDown = isShuttingDown;
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
        public UpdatesPackageVersionClass SystemUpdateLevel { get; set; }

        /// <summary>
        /// Gets or Sets OperatingSystemDisplayName
        /// </summary>
        [DataMember(Name="OperatingSystemDisplayName", EmitDefaultValue=false)]
        public string OperatingSystemDisplayName { get; set; }

        /// <summary>
        /// Gets or Sets PackageName
        /// </summary>
        [DataMember(Name="PackageName", EmitDefaultValue=false)]
        public string PackageName { get; set; }

        /// <summary>
        /// Gets or Sets HasPendingRestart
        /// </summary>
        [DataMember(Name="HasPendingRestart", EmitDefaultValue=false)]
        public bool? HasPendingRestart { get; set; }

        /// <summary>
        /// Gets or Sets IsShuttingDown
        /// </summary>
        [DataMember(Name="IsShuttingDown", EmitDefaultValue=false)]
        public bool? IsShuttingDown { get; set; }

        /// <summary>
        /// Gets or Sets OperatingSystem
        /// </summary>
        [DataMember(Name="OperatingSystem", EmitDefaultValue=false)]
        public string OperatingSystem { get; set; }

        /// <summary>
        /// Gets or Sets SupportsLibraryMonitor
        /// </summary>
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
        /// Gets or Sets WebSocketPortNumber
        /// </summary>
        [DataMember(Name="WebSocketPortNumber", EmitDefaultValue=false)]
        public int? WebSocketPortNumber { get; set; }

        /// <summary>
        /// Gets or Sets CompletedInstallations
        /// </summary>
        [DataMember(Name="CompletedInstallations", EmitDefaultValue=false)]
        public List<UpdatesInstallationInfo> CompletedInstallations { get; set; }

        /// <summary>
        /// Gets or Sets CanSelfRestart
        /// </summary>
        [DataMember(Name="CanSelfRestart", EmitDefaultValue=false)]
        public bool? CanSelfRestart { get; set; }

        /// <summary>
        /// Gets or Sets CanSelfUpdate
        /// </summary>
        [DataMember(Name="CanSelfUpdate", EmitDefaultValue=false)]
        public bool? CanSelfUpdate { get; set; }

        /// <summary>
        /// Gets or Sets CanLaunchWebBrowser
        /// </summary>
        [DataMember(Name="CanLaunchWebBrowser", EmitDefaultValue=false)]
        public bool? CanLaunchWebBrowser { get; set; }

        /// <summary>
        /// Gets or Sets ProgramDataPath
        /// </summary>
        [DataMember(Name="ProgramDataPath", EmitDefaultValue=false)]
        public string ProgramDataPath { get; set; }

        /// <summary>
        /// Gets or Sets ItemsByNamePath
        /// </summary>
        [DataMember(Name="ItemsByNamePath", EmitDefaultValue=false)]
        public string ItemsByNamePath { get; set; }

        /// <summary>
        /// Gets or Sets CachePath
        /// </summary>
        [DataMember(Name="CachePath", EmitDefaultValue=false)]
        public string CachePath { get; set; }

        /// <summary>
        /// Gets or Sets LogPath
        /// </summary>
        [DataMember(Name="LogPath", EmitDefaultValue=false)]
        public string LogPath { get; set; }

        /// <summary>
        /// Gets or Sets InternalMetadataPath
        /// </summary>
        [DataMember(Name="InternalMetadataPath", EmitDefaultValue=false)]
        public string InternalMetadataPath { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingTempPath
        /// </summary>
        [DataMember(Name="TranscodingTempPath", EmitDefaultValue=false)]
        public string TranscodingTempPath { get; set; }

        /// <summary>
        /// Gets or Sets HttpServerPortNumber
        /// </summary>
        [DataMember(Name="HttpServerPortNumber", EmitDefaultValue=false)]
        public int? HttpServerPortNumber { get; set; }

        /// <summary>
        /// Gets or Sets SupportsHttps
        /// </summary>
        [DataMember(Name="SupportsHttps", EmitDefaultValue=false)]
        public bool? SupportsHttps { get; set; }

        /// <summary>
        /// Gets or Sets HttpsPortNumber
        /// </summary>
        [DataMember(Name="HttpsPortNumber", EmitDefaultValue=false)]
        public int? HttpsPortNumber { get; set; }

        /// <summary>
        /// Gets or Sets HasUpdateAvailable
        /// </summary>
        [DataMember(Name="HasUpdateAvailable", EmitDefaultValue=false)]
        public bool? HasUpdateAvailable { get; set; }

        /// <summary>
        /// Gets or Sets SupportsAutoRunAtStartup
        /// </summary>
        [DataMember(Name="SupportsAutoRunAtStartup", EmitDefaultValue=false)]
        public bool? SupportsAutoRunAtStartup { get; set; }

        /// <summary>
        /// Gets or Sets HardwareAccelerationRequiresPremiere
        /// </summary>
        [DataMember(Name="HardwareAccelerationRequiresPremiere", EmitDefaultValue=false)]
        public bool? HardwareAccelerationRequiresPremiere { get; set; }

        /// <summary>
        /// Gets or Sets LocalAddress
        /// </summary>
        [DataMember(Name="LocalAddress", EmitDefaultValue=false)]
        public string LocalAddress { get; set; }

        /// <summary>
        /// Gets or Sets LocalAddresses
        /// </summary>
        [DataMember(Name="LocalAddresses", EmitDefaultValue=false)]
        public List<string> LocalAddresses { get; set; }

        /// <summary>
        /// Gets or Sets WanAddress
        /// </summary>
        [DataMember(Name="WanAddress", EmitDefaultValue=false)]
        public string WanAddress { get; set; }

        /// <summary>
        /// Gets or Sets RemoteAddresses
        /// </summary>
        [DataMember(Name="RemoteAddresses", EmitDefaultValue=false)]
        public List<string> RemoteAddresses { get; set; }

        /// <summary>
        /// Gets or Sets ServerName
        /// </summary>
        [DataMember(Name="ServerName", EmitDefaultValue=false)]
        public string ServerName { get; set; }

        /// <summary>
        /// Gets or Sets Version
        /// </summary>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
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
