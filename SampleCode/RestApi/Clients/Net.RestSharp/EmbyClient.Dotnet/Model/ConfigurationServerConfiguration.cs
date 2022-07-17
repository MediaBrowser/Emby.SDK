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
    /// ConfigurationServerConfiguration
    /// </summary>
    [DataContract]
        public partial class ConfigurationServerConfiguration :  IEquatable<ConfigurationServerConfiguration>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationServerConfiguration" /> class.
        /// </summary>
        /// <param name="enableUPnP">enableUPnP.</param>
        /// <param name="publicPort">publicPort.</param>
        /// <param name="publicHttpsPort">publicHttpsPort.</param>
        /// <param name="httpServerPortNumber">httpServerPortNumber.</param>
        /// <param name="httpsPortNumber">httpsPortNumber.</param>
        /// <param name="enableHttps">enableHttps.</param>
        /// <param name="certificatePath">certificatePath.</param>
        /// <param name="certificatePassword">certificatePassword.</param>
        /// <param name="isPortAuthorized">isPortAuthorized.</param>
        /// <param name="autoRunWebApp">autoRunWebApp.</param>
        /// <param name="enableRemoteAccess">enableRemoteAccess.</param>
        /// <param name="logAllQueryTimes">logAllQueryTimes.</param>
        /// <param name="enableCaseSensitiveItemIds">enableCaseSensitiveItemIds.</param>
        /// <param name="metadataPath">metadataPath.</param>
        /// <param name="metadataNetworkPath">metadataNetworkPath.</param>
        /// <param name="preferredMetadataLanguage">preferredMetadataLanguage.</param>
        /// <param name="metadataCountryCode">metadataCountryCode.</param>
        /// <param name="sortRemoveWords">sortRemoveWords.</param>
        /// <param name="libraryMonitorDelay">libraryMonitorDelay.</param>
        /// <param name="enableDashboardResponseCaching">enableDashboardResponseCaching.</param>
        /// <param name="dashboardSourcePath">dashboardSourcePath.</param>
        /// <param name="imageSavingConvention">imageSavingConvention.</param>
        /// <param name="enableAutomaticRestart">enableAutomaticRestart.</param>
        /// <param name="collectionFolderIdsMigrated">collectionFolderIdsMigrated.</param>
        /// <param name="serverName">serverName.</param>
        /// <param name="wanDdns">wanDdns.</param>
        /// <param name="uICulture">uICulture.</param>
        /// <param name="saveMetadataHidden">saveMetadataHidden.</param>
        /// <param name="remoteClientBitrateLimit">remoteClientBitrateLimit.</param>
        /// <param name="displaySpecialsWithinSeasons">displaySpecialsWithinSeasons.</param>
        /// <param name="localNetworkSubnets">localNetworkSubnets.</param>
        /// <param name="localNetworkAddresses">localNetworkAddresses.</param>
        /// <param name="enableExternalContentInSuggestions">enableExternalContentInSuggestions.</param>
        /// <param name="requireHttps">requireHttps.</param>
        /// <param name="isBehindProxy">isBehindProxy.</param>
        /// <param name="remoteIPFilter">remoteIPFilter.</param>
        /// <param name="isRemoteIPFilterBlacklist">isRemoteIPFilterBlacklist.</param>
        /// <param name="imageExtractionTimeoutMs">imageExtractionTimeoutMs.</param>
        /// <param name="pathSubstitutions">pathSubstitutions.</param>
        /// <param name="uninstalledPlugins">uninstalledPlugins.</param>
        /// <param name="collapseVideoFolders">collapseVideoFolders.</param>
        /// <param name="enableOriginalTrackTitles">enableOriginalTrackTitles.</param>
        /// <param name="vacuumDatabaseOnStartup">vacuumDatabaseOnStartup.</param>
        /// <param name="simultaneousStreamLimit">simultaneousStreamLimit.</param>
        /// <param name="databaseCacheSizeMB">databaseCacheSizeMB.</param>
        /// <param name="enableSqLiteMmio">enableSqLiteMmio.</param>
        /// <param name="nextUpUpgraded">nextUpUpgraded.</param>
        /// <param name="channelOptionsUpgraded">channelOptionsUpgraded.</param>
        /// <param name="timerIdsUpgraded">timerIdsUpgraded.</param>
        /// <param name="forcedSortNameUpgraded">forcedSortNameUpgraded.</param>
        /// <param name="inheritedParentalRatingValueUpgraded">inheritedParentalRatingValueUpgraded.</param>
        /// <param name="enablePeopleLetterSubFolders">enablePeopleLetterSubFolders.</param>
        /// <param name="optimizeDatabaseOnShutdown">optimizeDatabaseOnShutdown.</param>
        /// <param name="databaseAnalysisLimit">databaseAnalysisLimit.</param>
        /// <param name="disableAsyncIO">disableAsyncIO.</param>
        /// <param name="enableDebugLevelLogging">enableDebugLevelLogging.</param>
        /// <param name="revertDebugLogging">revertDebugLogging.</param>
        /// <param name="enableAutoUpdate">enableAutoUpdate.</param>
        /// <param name="logFileRetentionDays">logFileRetentionDays.</param>
        /// <param name="runAtStartup">runAtStartup.</param>
        /// <param name="isStartupWizardCompleted">isStartupWizardCompleted.</param>
        /// <param name="cachePath">cachePath.</param>
        public ConfigurationServerConfiguration(bool? enableUPnP = default(bool?), int? publicPort = default(int?), int? publicHttpsPort = default(int?), int? httpServerPortNumber = default(int?), int? httpsPortNumber = default(int?), bool? enableHttps = default(bool?), string certificatePath = default(string), string certificatePassword = default(string), bool? isPortAuthorized = default(bool?), bool? autoRunWebApp = default(bool?), bool? enableRemoteAccess = default(bool?), bool? logAllQueryTimes = default(bool?), bool? enableCaseSensitiveItemIds = default(bool?), string metadataPath = default(string), string metadataNetworkPath = default(string), string preferredMetadataLanguage = default(string), string metadataCountryCode = default(string), List<string> sortRemoveWords = default(List<string>), int? libraryMonitorDelay = default(int?), bool? enableDashboardResponseCaching = default(bool?), string dashboardSourcePath = default(string), ConfigurationImageSavingConvention imageSavingConvention = default(ConfigurationImageSavingConvention), bool? enableAutomaticRestart = default(bool?), bool? collectionFolderIdsMigrated = default(bool?), string serverName = default(string), string wanDdns = default(string), string uICulture = default(string), bool? saveMetadataHidden = default(bool?), int? remoteClientBitrateLimit = default(int?), bool? displaySpecialsWithinSeasons = default(bool?), List<string> localNetworkSubnets = default(List<string>), List<string> localNetworkAddresses = default(List<string>), bool? enableExternalContentInSuggestions = default(bool?), bool? requireHttps = default(bool?), bool? isBehindProxy = default(bool?), List<string> remoteIPFilter = default(List<string>), bool? isRemoteIPFilterBlacklist = default(bool?), int? imageExtractionTimeoutMs = default(int?), List<ConfigurationPathSubstitution> pathSubstitutions = default(List<ConfigurationPathSubstitution>), List<string> uninstalledPlugins = default(List<string>), bool? collapseVideoFolders = default(bool?), bool? enableOriginalTrackTitles = default(bool?), bool? vacuumDatabaseOnStartup = default(bool?), int? simultaneousStreamLimit = default(int?), int? databaseCacheSizeMB = default(int?), bool? enableSqLiteMmio = default(bool?), bool? nextUpUpgraded = default(bool?), bool? channelOptionsUpgraded = default(bool?), bool? timerIdsUpgraded = default(bool?), bool? forcedSortNameUpgraded = default(bool?), bool? inheritedParentalRatingValueUpgraded = default(bool?), bool? enablePeopleLetterSubFolders = default(bool?), bool? optimizeDatabaseOnShutdown = default(bool?), int? databaseAnalysisLimit = default(int?), bool? disableAsyncIO = default(bool?), bool? enableDebugLevelLogging = default(bool?), string revertDebugLogging = default(string), bool? enableAutoUpdate = default(bool?), int? logFileRetentionDays = default(int?), bool? runAtStartup = default(bool?), bool? isStartupWizardCompleted = default(bool?), string cachePath = default(string))
        {
            this.EnableUPnP = enableUPnP;
            this.PublicPort = publicPort;
            this.PublicHttpsPort = publicHttpsPort;
            this.HttpServerPortNumber = httpServerPortNumber;
            this.HttpsPortNumber = httpsPortNumber;
            this.EnableHttps = enableHttps;
            this.CertificatePath = certificatePath;
            this.CertificatePassword = certificatePassword;
            this.IsPortAuthorized = isPortAuthorized;
            this.AutoRunWebApp = autoRunWebApp;
            this.EnableRemoteAccess = enableRemoteAccess;
            this.LogAllQueryTimes = logAllQueryTimes;
            this.EnableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
            this.MetadataPath = metadataPath;
            this.MetadataNetworkPath = metadataNetworkPath;
            this.PreferredMetadataLanguage = preferredMetadataLanguage;
            this.MetadataCountryCode = metadataCountryCode;
            this.SortRemoveWords = sortRemoveWords;
            this.LibraryMonitorDelay = libraryMonitorDelay;
            this.EnableDashboardResponseCaching = enableDashboardResponseCaching;
            this.DashboardSourcePath = dashboardSourcePath;
            this.ImageSavingConvention = imageSavingConvention;
            this.EnableAutomaticRestart = enableAutomaticRestart;
            this.CollectionFolderIdsMigrated = collectionFolderIdsMigrated;
            this.ServerName = serverName;
            this.WanDdns = wanDdns;
            this.UICulture = uICulture;
            this.SaveMetadataHidden = saveMetadataHidden;
            this.RemoteClientBitrateLimit = remoteClientBitrateLimit;
            this.DisplaySpecialsWithinSeasons = displaySpecialsWithinSeasons;
            this.LocalNetworkSubnets = localNetworkSubnets;
            this.LocalNetworkAddresses = localNetworkAddresses;
            this.EnableExternalContentInSuggestions = enableExternalContentInSuggestions;
            this.RequireHttps = requireHttps;
            this.IsBehindProxy = isBehindProxy;
            this.RemoteIPFilter = remoteIPFilter;
            this.IsRemoteIPFilterBlacklist = isRemoteIPFilterBlacklist;
            this.ImageExtractionTimeoutMs = imageExtractionTimeoutMs;
            this.PathSubstitutions = pathSubstitutions;
            this.UninstalledPlugins = uninstalledPlugins;
            this.CollapseVideoFolders = collapseVideoFolders;
            this.EnableOriginalTrackTitles = enableOriginalTrackTitles;
            this.VacuumDatabaseOnStartup = vacuumDatabaseOnStartup;
            this.SimultaneousStreamLimit = simultaneousStreamLimit;
            this.DatabaseCacheSizeMB = databaseCacheSizeMB;
            this.EnableSqLiteMmio = enableSqLiteMmio;
            this.NextUpUpgraded = nextUpUpgraded;
            this.ChannelOptionsUpgraded = channelOptionsUpgraded;
            this.TimerIdsUpgraded = timerIdsUpgraded;
            this.ForcedSortNameUpgraded = forcedSortNameUpgraded;
            this.InheritedParentalRatingValueUpgraded = inheritedParentalRatingValueUpgraded;
            this.EnablePeopleLetterSubFolders = enablePeopleLetterSubFolders;
            this.OptimizeDatabaseOnShutdown = optimizeDatabaseOnShutdown;
            this.DatabaseAnalysisLimit = databaseAnalysisLimit;
            this.DisableAsyncIO = disableAsyncIO;
            this.EnableDebugLevelLogging = enableDebugLevelLogging;
            this.RevertDebugLogging = revertDebugLogging;
            this.EnableAutoUpdate = enableAutoUpdate;
            this.LogFileRetentionDays = logFileRetentionDays;
            this.RunAtStartup = runAtStartup;
            this.IsStartupWizardCompleted = isStartupWizardCompleted;
            this.CachePath = cachePath;
        }
        
        /// <summary>
        /// Gets or Sets EnableUPnP
        /// </summary>
        [DataMember(Name="EnableUPnP", EmitDefaultValue=false)]
        public bool? EnableUPnP { get; set; }

        /// <summary>
        /// Gets or Sets PublicPort
        /// </summary>
        [DataMember(Name="PublicPort", EmitDefaultValue=false)]
        public int? PublicPort { get; set; }

        /// <summary>
        /// Gets or Sets PublicHttpsPort
        /// </summary>
        [DataMember(Name="PublicHttpsPort", EmitDefaultValue=false)]
        public int? PublicHttpsPort { get; set; }

        /// <summary>
        /// Gets or Sets HttpServerPortNumber
        /// </summary>
        [DataMember(Name="HttpServerPortNumber", EmitDefaultValue=false)]
        public int? HttpServerPortNumber { get; set; }

        /// <summary>
        /// Gets or Sets HttpsPortNumber
        /// </summary>
        [DataMember(Name="HttpsPortNumber", EmitDefaultValue=false)]
        public int? HttpsPortNumber { get; set; }

        /// <summary>
        /// Gets or Sets EnableHttps
        /// </summary>
        [DataMember(Name="EnableHttps", EmitDefaultValue=false)]
        public bool? EnableHttps { get; set; }

        /// <summary>
        /// Gets or Sets CertificatePath
        /// </summary>
        [DataMember(Name="CertificatePath", EmitDefaultValue=false)]
        public string CertificatePath { get; set; }

        /// <summary>
        /// Gets or Sets CertificatePassword
        /// </summary>
        [DataMember(Name="CertificatePassword", EmitDefaultValue=false)]
        public string CertificatePassword { get; set; }

        /// <summary>
        /// Gets or Sets IsPortAuthorized
        /// </summary>
        [DataMember(Name="IsPortAuthorized", EmitDefaultValue=false)]
        public bool? IsPortAuthorized { get; set; }

        /// <summary>
        /// Gets or Sets AutoRunWebApp
        /// </summary>
        [DataMember(Name="AutoRunWebApp", EmitDefaultValue=false)]
        public bool? AutoRunWebApp { get; set; }

        /// <summary>
        /// Gets or Sets EnableRemoteAccess
        /// </summary>
        [DataMember(Name="EnableRemoteAccess", EmitDefaultValue=false)]
        public bool? EnableRemoteAccess { get; set; }

        /// <summary>
        /// Gets or Sets LogAllQueryTimes
        /// </summary>
        [DataMember(Name="LogAllQueryTimes", EmitDefaultValue=false)]
        public bool? LogAllQueryTimes { get; set; }

        /// <summary>
        /// Gets or Sets EnableCaseSensitiveItemIds
        /// </summary>
        [DataMember(Name="EnableCaseSensitiveItemIds", EmitDefaultValue=false)]
        public bool? EnableCaseSensitiveItemIds { get; set; }

        /// <summary>
        /// Gets or Sets MetadataPath
        /// </summary>
        [DataMember(Name="MetadataPath", EmitDefaultValue=false)]
        public string MetadataPath { get; set; }

        /// <summary>
        /// Gets or Sets MetadataNetworkPath
        /// </summary>
        [DataMember(Name="MetadataNetworkPath", EmitDefaultValue=false)]
        public string MetadataNetworkPath { get; set; }

        /// <summary>
        /// Gets or Sets PreferredMetadataLanguage
        /// </summary>
        [DataMember(Name="PreferredMetadataLanguage", EmitDefaultValue=false)]
        public string PreferredMetadataLanguage { get; set; }

        /// <summary>
        /// Gets or Sets MetadataCountryCode
        /// </summary>
        [DataMember(Name="MetadataCountryCode", EmitDefaultValue=false)]
        public string MetadataCountryCode { get; set; }

        /// <summary>
        /// Gets or Sets SortRemoveWords
        /// </summary>
        [DataMember(Name="SortRemoveWords", EmitDefaultValue=false)]
        public List<string> SortRemoveWords { get; set; }

        /// <summary>
        /// Gets or Sets LibraryMonitorDelay
        /// </summary>
        [DataMember(Name="LibraryMonitorDelay", EmitDefaultValue=false)]
        public int? LibraryMonitorDelay { get; set; }

        /// <summary>
        /// Gets or Sets EnableDashboardResponseCaching
        /// </summary>
        [DataMember(Name="EnableDashboardResponseCaching", EmitDefaultValue=false)]
        public bool? EnableDashboardResponseCaching { get; set; }

        /// <summary>
        /// Gets or Sets DashboardSourcePath
        /// </summary>
        [DataMember(Name="DashboardSourcePath", EmitDefaultValue=false)]
        public string DashboardSourcePath { get; set; }

        /// <summary>
        /// Gets or Sets ImageSavingConvention
        /// </summary>
        [DataMember(Name="ImageSavingConvention", EmitDefaultValue=false)]
        public ConfigurationImageSavingConvention ImageSavingConvention { get; set; }

        /// <summary>
        /// Gets or Sets EnableAutomaticRestart
        /// </summary>
        [DataMember(Name="EnableAutomaticRestart", EmitDefaultValue=false)]
        public bool? EnableAutomaticRestart { get; set; }

        /// <summary>
        /// Gets or Sets CollectionFolderIdsMigrated
        /// </summary>
        [DataMember(Name="CollectionFolderIdsMigrated", EmitDefaultValue=false)]
        public bool? CollectionFolderIdsMigrated { get; set; }

        /// <summary>
        /// Gets or Sets ServerName
        /// </summary>
        [DataMember(Name="ServerName", EmitDefaultValue=false)]
        public string ServerName { get; set; }

        /// <summary>
        /// Gets or Sets WanDdns
        /// </summary>
        [DataMember(Name="WanDdns", EmitDefaultValue=false)]
        public string WanDdns { get; set; }

        /// <summary>
        /// Gets or Sets UICulture
        /// </summary>
        [DataMember(Name="UICulture", EmitDefaultValue=false)]
        public string UICulture { get; set; }

        /// <summary>
        /// Gets or Sets SaveMetadataHidden
        /// </summary>
        [DataMember(Name="SaveMetadataHidden", EmitDefaultValue=false)]
        public bool? SaveMetadataHidden { get; set; }

        /// <summary>
        /// Gets or Sets RemoteClientBitrateLimit
        /// </summary>
        [DataMember(Name="RemoteClientBitrateLimit", EmitDefaultValue=false)]
        public int? RemoteClientBitrateLimit { get; set; }

        /// <summary>
        /// Gets or Sets DisplaySpecialsWithinSeasons
        /// </summary>
        [DataMember(Name="DisplaySpecialsWithinSeasons", EmitDefaultValue=false)]
        public bool? DisplaySpecialsWithinSeasons { get; set; }

        /// <summary>
        /// Gets or Sets LocalNetworkSubnets
        /// </summary>
        [DataMember(Name="LocalNetworkSubnets", EmitDefaultValue=false)]
        public List<string> LocalNetworkSubnets { get; set; }

        /// <summary>
        /// Gets or Sets LocalNetworkAddresses
        /// </summary>
        [DataMember(Name="LocalNetworkAddresses", EmitDefaultValue=false)]
        public List<string> LocalNetworkAddresses { get; set; }

        /// <summary>
        /// Gets or Sets EnableExternalContentInSuggestions
        /// </summary>
        [DataMember(Name="EnableExternalContentInSuggestions", EmitDefaultValue=false)]
        public bool? EnableExternalContentInSuggestions { get; set; }

        /// <summary>
        /// Gets or Sets RequireHttps
        /// </summary>
        [DataMember(Name="RequireHttps", EmitDefaultValue=false)]
        public bool? RequireHttps { get; set; }

        /// <summary>
        /// Gets or Sets IsBehindProxy
        /// </summary>
        [DataMember(Name="IsBehindProxy", EmitDefaultValue=false)]
        public bool? IsBehindProxy { get; set; }

        /// <summary>
        /// Gets or Sets RemoteIPFilter
        /// </summary>
        [DataMember(Name="RemoteIPFilter", EmitDefaultValue=false)]
        public List<string> RemoteIPFilter { get; set; }

        /// <summary>
        /// Gets or Sets IsRemoteIPFilterBlacklist
        /// </summary>
        [DataMember(Name="IsRemoteIPFilterBlacklist", EmitDefaultValue=false)]
        public bool? IsRemoteIPFilterBlacklist { get; set; }

        /// <summary>
        /// Gets or Sets ImageExtractionTimeoutMs
        /// </summary>
        [DataMember(Name="ImageExtractionTimeoutMs", EmitDefaultValue=false)]
        public int? ImageExtractionTimeoutMs { get; set; }

        /// <summary>
        /// Gets or Sets PathSubstitutions
        /// </summary>
        [DataMember(Name="PathSubstitutions", EmitDefaultValue=false)]
        public List<ConfigurationPathSubstitution> PathSubstitutions { get; set; }

        /// <summary>
        /// Gets or Sets UninstalledPlugins
        /// </summary>
        [DataMember(Name="UninstalledPlugins", EmitDefaultValue=false)]
        public List<string> UninstalledPlugins { get; set; }

        /// <summary>
        /// Gets or Sets CollapseVideoFolders
        /// </summary>
        [DataMember(Name="CollapseVideoFolders", EmitDefaultValue=false)]
        public bool? CollapseVideoFolders { get; set; }

        /// <summary>
        /// Gets or Sets EnableOriginalTrackTitles
        /// </summary>
        [DataMember(Name="EnableOriginalTrackTitles", EmitDefaultValue=false)]
        public bool? EnableOriginalTrackTitles { get; set; }

        /// <summary>
        /// Gets or Sets VacuumDatabaseOnStartup
        /// </summary>
        [DataMember(Name="VacuumDatabaseOnStartup", EmitDefaultValue=false)]
        public bool? VacuumDatabaseOnStartup { get; set; }

        /// <summary>
        /// Gets or Sets SimultaneousStreamLimit
        /// </summary>
        [DataMember(Name="SimultaneousStreamLimit", EmitDefaultValue=false)]
        public int? SimultaneousStreamLimit { get; set; }

        /// <summary>
        /// Gets or Sets DatabaseCacheSizeMB
        /// </summary>
        [DataMember(Name="DatabaseCacheSizeMB", EmitDefaultValue=false)]
        public int? DatabaseCacheSizeMB { get; set; }

        /// <summary>
        /// Gets or Sets EnableSqLiteMmio
        /// </summary>
        [DataMember(Name="EnableSqLiteMmio", EmitDefaultValue=false)]
        public bool? EnableSqLiteMmio { get; set; }

        /// <summary>
        /// Gets or Sets NextUpUpgraded
        /// </summary>
        [DataMember(Name="NextUpUpgraded", EmitDefaultValue=false)]
        public bool? NextUpUpgraded { get; set; }

        /// <summary>
        /// Gets or Sets ChannelOptionsUpgraded
        /// </summary>
        [DataMember(Name="ChannelOptionsUpgraded", EmitDefaultValue=false)]
        public bool? ChannelOptionsUpgraded { get; set; }

        /// <summary>
        /// Gets or Sets TimerIdsUpgraded
        /// </summary>
        [DataMember(Name="TimerIdsUpgraded", EmitDefaultValue=false)]
        public bool? TimerIdsUpgraded { get; set; }

        /// <summary>
        /// Gets or Sets ForcedSortNameUpgraded
        /// </summary>
        [DataMember(Name="ForcedSortNameUpgraded", EmitDefaultValue=false)]
        public bool? ForcedSortNameUpgraded { get; set; }

        /// <summary>
        /// Gets or Sets InheritedParentalRatingValueUpgraded
        /// </summary>
        [DataMember(Name="InheritedParentalRatingValueUpgraded", EmitDefaultValue=false)]
        public bool? InheritedParentalRatingValueUpgraded { get; set; }

        /// <summary>
        /// Gets or Sets EnablePeopleLetterSubFolders
        /// </summary>
        [DataMember(Name="EnablePeopleLetterSubFolders", EmitDefaultValue=false)]
        public bool? EnablePeopleLetterSubFolders { get; set; }

        /// <summary>
        /// Gets or Sets OptimizeDatabaseOnShutdown
        /// </summary>
        [DataMember(Name="OptimizeDatabaseOnShutdown", EmitDefaultValue=false)]
        public bool? OptimizeDatabaseOnShutdown { get; set; }

        /// <summary>
        /// Gets or Sets DatabaseAnalysisLimit
        /// </summary>
        [DataMember(Name="DatabaseAnalysisLimit", EmitDefaultValue=false)]
        public int? DatabaseAnalysisLimit { get; set; }

        /// <summary>
        /// Gets or Sets DisableAsyncIO
        /// </summary>
        [DataMember(Name="DisableAsyncIO", EmitDefaultValue=false)]
        public bool? DisableAsyncIO { get; set; }

        /// <summary>
        /// Gets or Sets EnableDebugLevelLogging
        /// </summary>
        [DataMember(Name="EnableDebugLevelLogging", EmitDefaultValue=false)]
        public bool? EnableDebugLevelLogging { get; set; }

        /// <summary>
        /// Gets or Sets RevertDebugLogging
        /// </summary>
        [DataMember(Name="RevertDebugLogging", EmitDefaultValue=false)]
        public string RevertDebugLogging { get; set; }

        /// <summary>
        /// Gets or Sets EnableAutoUpdate
        /// </summary>
        [DataMember(Name="EnableAutoUpdate", EmitDefaultValue=false)]
        public bool? EnableAutoUpdate { get; set; }

        /// <summary>
        /// Gets or Sets LogFileRetentionDays
        /// </summary>
        [DataMember(Name="LogFileRetentionDays", EmitDefaultValue=false)]
        public int? LogFileRetentionDays { get; set; }

        /// <summary>
        /// Gets or Sets RunAtStartup
        /// </summary>
        [DataMember(Name="RunAtStartup", EmitDefaultValue=false)]
        public bool? RunAtStartup { get; set; }

        /// <summary>
        /// Gets or Sets IsStartupWizardCompleted
        /// </summary>
        [DataMember(Name="IsStartupWizardCompleted", EmitDefaultValue=false)]
        public bool? IsStartupWizardCompleted { get; set; }

        /// <summary>
        /// Gets or Sets CachePath
        /// </summary>
        [DataMember(Name="CachePath", EmitDefaultValue=false)]
        public string CachePath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConfigurationServerConfiguration {\n");
            sb.Append("  EnableUPnP: ").Append(EnableUPnP).Append("\n");
            sb.Append("  PublicPort: ").Append(PublicPort).Append("\n");
            sb.Append("  PublicHttpsPort: ").Append(PublicHttpsPort).Append("\n");
            sb.Append("  HttpServerPortNumber: ").Append(HttpServerPortNumber).Append("\n");
            sb.Append("  HttpsPortNumber: ").Append(HttpsPortNumber).Append("\n");
            sb.Append("  EnableHttps: ").Append(EnableHttps).Append("\n");
            sb.Append("  CertificatePath: ").Append(CertificatePath).Append("\n");
            sb.Append("  CertificatePassword: ").Append(CertificatePassword).Append("\n");
            sb.Append("  IsPortAuthorized: ").Append(IsPortAuthorized).Append("\n");
            sb.Append("  AutoRunWebApp: ").Append(AutoRunWebApp).Append("\n");
            sb.Append("  EnableRemoteAccess: ").Append(EnableRemoteAccess).Append("\n");
            sb.Append("  LogAllQueryTimes: ").Append(LogAllQueryTimes).Append("\n");
            sb.Append("  EnableCaseSensitiveItemIds: ").Append(EnableCaseSensitiveItemIds).Append("\n");
            sb.Append("  MetadataPath: ").Append(MetadataPath).Append("\n");
            sb.Append("  MetadataNetworkPath: ").Append(MetadataNetworkPath).Append("\n");
            sb.Append("  PreferredMetadataLanguage: ").Append(PreferredMetadataLanguage).Append("\n");
            sb.Append("  MetadataCountryCode: ").Append(MetadataCountryCode).Append("\n");
            sb.Append("  SortRemoveWords: ").Append(SortRemoveWords).Append("\n");
            sb.Append("  LibraryMonitorDelay: ").Append(LibraryMonitorDelay).Append("\n");
            sb.Append("  EnableDashboardResponseCaching: ").Append(EnableDashboardResponseCaching).Append("\n");
            sb.Append("  DashboardSourcePath: ").Append(DashboardSourcePath).Append("\n");
            sb.Append("  ImageSavingConvention: ").Append(ImageSavingConvention).Append("\n");
            sb.Append("  EnableAutomaticRestart: ").Append(EnableAutomaticRestart).Append("\n");
            sb.Append("  CollectionFolderIdsMigrated: ").Append(CollectionFolderIdsMigrated).Append("\n");
            sb.Append("  ServerName: ").Append(ServerName).Append("\n");
            sb.Append("  WanDdns: ").Append(WanDdns).Append("\n");
            sb.Append("  UICulture: ").Append(UICulture).Append("\n");
            sb.Append("  SaveMetadataHidden: ").Append(SaveMetadataHidden).Append("\n");
            sb.Append("  RemoteClientBitrateLimit: ").Append(RemoteClientBitrateLimit).Append("\n");
            sb.Append("  DisplaySpecialsWithinSeasons: ").Append(DisplaySpecialsWithinSeasons).Append("\n");
            sb.Append("  LocalNetworkSubnets: ").Append(LocalNetworkSubnets).Append("\n");
            sb.Append("  LocalNetworkAddresses: ").Append(LocalNetworkAddresses).Append("\n");
            sb.Append("  EnableExternalContentInSuggestions: ").Append(EnableExternalContentInSuggestions).Append("\n");
            sb.Append("  RequireHttps: ").Append(RequireHttps).Append("\n");
            sb.Append("  IsBehindProxy: ").Append(IsBehindProxy).Append("\n");
            sb.Append("  RemoteIPFilter: ").Append(RemoteIPFilter).Append("\n");
            sb.Append("  IsRemoteIPFilterBlacklist: ").Append(IsRemoteIPFilterBlacklist).Append("\n");
            sb.Append("  ImageExtractionTimeoutMs: ").Append(ImageExtractionTimeoutMs).Append("\n");
            sb.Append("  PathSubstitutions: ").Append(PathSubstitutions).Append("\n");
            sb.Append("  UninstalledPlugins: ").Append(UninstalledPlugins).Append("\n");
            sb.Append("  CollapseVideoFolders: ").Append(CollapseVideoFolders).Append("\n");
            sb.Append("  EnableOriginalTrackTitles: ").Append(EnableOriginalTrackTitles).Append("\n");
            sb.Append("  VacuumDatabaseOnStartup: ").Append(VacuumDatabaseOnStartup).Append("\n");
            sb.Append("  SimultaneousStreamLimit: ").Append(SimultaneousStreamLimit).Append("\n");
            sb.Append("  DatabaseCacheSizeMB: ").Append(DatabaseCacheSizeMB).Append("\n");
            sb.Append("  EnableSqLiteMmio: ").Append(EnableSqLiteMmio).Append("\n");
            sb.Append("  NextUpUpgraded: ").Append(NextUpUpgraded).Append("\n");
            sb.Append("  ChannelOptionsUpgraded: ").Append(ChannelOptionsUpgraded).Append("\n");
            sb.Append("  TimerIdsUpgraded: ").Append(TimerIdsUpgraded).Append("\n");
            sb.Append("  ForcedSortNameUpgraded: ").Append(ForcedSortNameUpgraded).Append("\n");
            sb.Append("  InheritedParentalRatingValueUpgraded: ").Append(InheritedParentalRatingValueUpgraded).Append("\n");
            sb.Append("  EnablePeopleLetterSubFolders: ").Append(EnablePeopleLetterSubFolders).Append("\n");
            sb.Append("  OptimizeDatabaseOnShutdown: ").Append(OptimizeDatabaseOnShutdown).Append("\n");
            sb.Append("  DatabaseAnalysisLimit: ").Append(DatabaseAnalysisLimit).Append("\n");
            sb.Append("  DisableAsyncIO: ").Append(DisableAsyncIO).Append("\n");
            sb.Append("  EnableDebugLevelLogging: ").Append(EnableDebugLevelLogging).Append("\n");
            sb.Append("  RevertDebugLogging: ").Append(RevertDebugLogging).Append("\n");
            sb.Append("  EnableAutoUpdate: ").Append(EnableAutoUpdate).Append("\n");
            sb.Append("  LogFileRetentionDays: ").Append(LogFileRetentionDays).Append("\n");
            sb.Append("  RunAtStartup: ").Append(RunAtStartup).Append("\n");
            sb.Append("  IsStartupWizardCompleted: ").Append(IsStartupWizardCompleted).Append("\n");
            sb.Append("  CachePath: ").Append(CachePath).Append("\n");
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
            return this.Equals(input as ConfigurationServerConfiguration);
        }

        /// <summary>
        /// Returns true if ConfigurationServerConfiguration instances are equal
        /// </summary>
        /// <param name="input">Instance of ConfigurationServerConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConfigurationServerConfiguration input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EnableUPnP == input.EnableUPnP ||
                    (this.EnableUPnP != null &&
                    this.EnableUPnP.Equals(input.EnableUPnP))
                ) && 
                (
                    this.PublicPort == input.PublicPort ||
                    (this.PublicPort != null &&
                    this.PublicPort.Equals(input.PublicPort))
                ) && 
                (
                    this.PublicHttpsPort == input.PublicHttpsPort ||
                    (this.PublicHttpsPort != null &&
                    this.PublicHttpsPort.Equals(input.PublicHttpsPort))
                ) && 
                (
                    this.HttpServerPortNumber == input.HttpServerPortNumber ||
                    (this.HttpServerPortNumber != null &&
                    this.HttpServerPortNumber.Equals(input.HttpServerPortNumber))
                ) && 
                (
                    this.HttpsPortNumber == input.HttpsPortNumber ||
                    (this.HttpsPortNumber != null &&
                    this.HttpsPortNumber.Equals(input.HttpsPortNumber))
                ) && 
                (
                    this.EnableHttps == input.EnableHttps ||
                    (this.EnableHttps != null &&
                    this.EnableHttps.Equals(input.EnableHttps))
                ) && 
                (
                    this.CertificatePath == input.CertificatePath ||
                    (this.CertificatePath != null &&
                    this.CertificatePath.Equals(input.CertificatePath))
                ) && 
                (
                    this.CertificatePassword == input.CertificatePassword ||
                    (this.CertificatePassword != null &&
                    this.CertificatePassword.Equals(input.CertificatePassword))
                ) && 
                (
                    this.IsPortAuthorized == input.IsPortAuthorized ||
                    (this.IsPortAuthorized != null &&
                    this.IsPortAuthorized.Equals(input.IsPortAuthorized))
                ) && 
                (
                    this.AutoRunWebApp == input.AutoRunWebApp ||
                    (this.AutoRunWebApp != null &&
                    this.AutoRunWebApp.Equals(input.AutoRunWebApp))
                ) && 
                (
                    this.EnableRemoteAccess == input.EnableRemoteAccess ||
                    (this.EnableRemoteAccess != null &&
                    this.EnableRemoteAccess.Equals(input.EnableRemoteAccess))
                ) && 
                (
                    this.LogAllQueryTimes == input.LogAllQueryTimes ||
                    (this.LogAllQueryTimes != null &&
                    this.LogAllQueryTimes.Equals(input.LogAllQueryTimes))
                ) && 
                (
                    this.EnableCaseSensitiveItemIds == input.EnableCaseSensitiveItemIds ||
                    (this.EnableCaseSensitiveItemIds != null &&
                    this.EnableCaseSensitiveItemIds.Equals(input.EnableCaseSensitiveItemIds))
                ) && 
                (
                    this.MetadataPath == input.MetadataPath ||
                    (this.MetadataPath != null &&
                    this.MetadataPath.Equals(input.MetadataPath))
                ) && 
                (
                    this.MetadataNetworkPath == input.MetadataNetworkPath ||
                    (this.MetadataNetworkPath != null &&
                    this.MetadataNetworkPath.Equals(input.MetadataNetworkPath))
                ) && 
                (
                    this.PreferredMetadataLanguage == input.PreferredMetadataLanguage ||
                    (this.PreferredMetadataLanguage != null &&
                    this.PreferredMetadataLanguage.Equals(input.PreferredMetadataLanguage))
                ) && 
                (
                    this.MetadataCountryCode == input.MetadataCountryCode ||
                    (this.MetadataCountryCode != null &&
                    this.MetadataCountryCode.Equals(input.MetadataCountryCode))
                ) && 
                (
                    this.SortRemoveWords == input.SortRemoveWords ||
                    this.SortRemoveWords != null &&
                    input.SortRemoveWords != null &&
                    this.SortRemoveWords.SequenceEqual(input.SortRemoveWords)
                ) && 
                (
                    this.LibraryMonitorDelay == input.LibraryMonitorDelay ||
                    (this.LibraryMonitorDelay != null &&
                    this.LibraryMonitorDelay.Equals(input.LibraryMonitorDelay))
                ) && 
                (
                    this.EnableDashboardResponseCaching == input.EnableDashboardResponseCaching ||
                    (this.EnableDashboardResponseCaching != null &&
                    this.EnableDashboardResponseCaching.Equals(input.EnableDashboardResponseCaching))
                ) && 
                (
                    this.DashboardSourcePath == input.DashboardSourcePath ||
                    (this.DashboardSourcePath != null &&
                    this.DashboardSourcePath.Equals(input.DashboardSourcePath))
                ) && 
                (
                    this.ImageSavingConvention == input.ImageSavingConvention ||
                    (this.ImageSavingConvention != null &&
                    this.ImageSavingConvention.Equals(input.ImageSavingConvention))
                ) && 
                (
                    this.EnableAutomaticRestart == input.EnableAutomaticRestart ||
                    (this.EnableAutomaticRestart != null &&
                    this.EnableAutomaticRestart.Equals(input.EnableAutomaticRestart))
                ) && 
                (
                    this.CollectionFolderIdsMigrated == input.CollectionFolderIdsMigrated ||
                    (this.CollectionFolderIdsMigrated != null &&
                    this.CollectionFolderIdsMigrated.Equals(input.CollectionFolderIdsMigrated))
                ) && 
                (
                    this.ServerName == input.ServerName ||
                    (this.ServerName != null &&
                    this.ServerName.Equals(input.ServerName))
                ) && 
                (
                    this.WanDdns == input.WanDdns ||
                    (this.WanDdns != null &&
                    this.WanDdns.Equals(input.WanDdns))
                ) && 
                (
                    this.UICulture == input.UICulture ||
                    (this.UICulture != null &&
                    this.UICulture.Equals(input.UICulture))
                ) && 
                (
                    this.SaveMetadataHidden == input.SaveMetadataHidden ||
                    (this.SaveMetadataHidden != null &&
                    this.SaveMetadataHidden.Equals(input.SaveMetadataHidden))
                ) && 
                (
                    this.RemoteClientBitrateLimit == input.RemoteClientBitrateLimit ||
                    (this.RemoteClientBitrateLimit != null &&
                    this.RemoteClientBitrateLimit.Equals(input.RemoteClientBitrateLimit))
                ) && 
                (
                    this.DisplaySpecialsWithinSeasons == input.DisplaySpecialsWithinSeasons ||
                    (this.DisplaySpecialsWithinSeasons != null &&
                    this.DisplaySpecialsWithinSeasons.Equals(input.DisplaySpecialsWithinSeasons))
                ) && 
                (
                    this.LocalNetworkSubnets == input.LocalNetworkSubnets ||
                    this.LocalNetworkSubnets != null &&
                    input.LocalNetworkSubnets != null &&
                    this.LocalNetworkSubnets.SequenceEqual(input.LocalNetworkSubnets)
                ) && 
                (
                    this.LocalNetworkAddresses == input.LocalNetworkAddresses ||
                    this.LocalNetworkAddresses != null &&
                    input.LocalNetworkAddresses != null &&
                    this.LocalNetworkAddresses.SequenceEqual(input.LocalNetworkAddresses)
                ) && 
                (
                    this.EnableExternalContentInSuggestions == input.EnableExternalContentInSuggestions ||
                    (this.EnableExternalContentInSuggestions != null &&
                    this.EnableExternalContentInSuggestions.Equals(input.EnableExternalContentInSuggestions))
                ) && 
                (
                    this.RequireHttps == input.RequireHttps ||
                    (this.RequireHttps != null &&
                    this.RequireHttps.Equals(input.RequireHttps))
                ) && 
                (
                    this.IsBehindProxy == input.IsBehindProxy ||
                    (this.IsBehindProxy != null &&
                    this.IsBehindProxy.Equals(input.IsBehindProxy))
                ) && 
                (
                    this.RemoteIPFilter == input.RemoteIPFilter ||
                    this.RemoteIPFilter != null &&
                    input.RemoteIPFilter != null &&
                    this.RemoteIPFilter.SequenceEqual(input.RemoteIPFilter)
                ) && 
                (
                    this.IsRemoteIPFilterBlacklist == input.IsRemoteIPFilterBlacklist ||
                    (this.IsRemoteIPFilterBlacklist != null &&
                    this.IsRemoteIPFilterBlacklist.Equals(input.IsRemoteIPFilterBlacklist))
                ) && 
                (
                    this.ImageExtractionTimeoutMs == input.ImageExtractionTimeoutMs ||
                    (this.ImageExtractionTimeoutMs != null &&
                    this.ImageExtractionTimeoutMs.Equals(input.ImageExtractionTimeoutMs))
                ) && 
                (
                    this.PathSubstitutions == input.PathSubstitutions ||
                    this.PathSubstitutions != null &&
                    input.PathSubstitutions != null &&
                    this.PathSubstitutions.SequenceEqual(input.PathSubstitutions)
                ) && 
                (
                    this.UninstalledPlugins == input.UninstalledPlugins ||
                    this.UninstalledPlugins != null &&
                    input.UninstalledPlugins != null &&
                    this.UninstalledPlugins.SequenceEqual(input.UninstalledPlugins)
                ) && 
                (
                    this.CollapseVideoFolders == input.CollapseVideoFolders ||
                    (this.CollapseVideoFolders != null &&
                    this.CollapseVideoFolders.Equals(input.CollapseVideoFolders))
                ) && 
                (
                    this.EnableOriginalTrackTitles == input.EnableOriginalTrackTitles ||
                    (this.EnableOriginalTrackTitles != null &&
                    this.EnableOriginalTrackTitles.Equals(input.EnableOriginalTrackTitles))
                ) && 
                (
                    this.VacuumDatabaseOnStartup == input.VacuumDatabaseOnStartup ||
                    (this.VacuumDatabaseOnStartup != null &&
                    this.VacuumDatabaseOnStartup.Equals(input.VacuumDatabaseOnStartup))
                ) && 
                (
                    this.SimultaneousStreamLimit == input.SimultaneousStreamLimit ||
                    (this.SimultaneousStreamLimit != null &&
                    this.SimultaneousStreamLimit.Equals(input.SimultaneousStreamLimit))
                ) && 
                (
                    this.DatabaseCacheSizeMB == input.DatabaseCacheSizeMB ||
                    (this.DatabaseCacheSizeMB != null &&
                    this.DatabaseCacheSizeMB.Equals(input.DatabaseCacheSizeMB))
                ) && 
                (
                    this.EnableSqLiteMmio == input.EnableSqLiteMmio ||
                    (this.EnableSqLiteMmio != null &&
                    this.EnableSqLiteMmio.Equals(input.EnableSqLiteMmio))
                ) && 
                (
                    this.NextUpUpgraded == input.NextUpUpgraded ||
                    (this.NextUpUpgraded != null &&
                    this.NextUpUpgraded.Equals(input.NextUpUpgraded))
                ) && 
                (
                    this.ChannelOptionsUpgraded == input.ChannelOptionsUpgraded ||
                    (this.ChannelOptionsUpgraded != null &&
                    this.ChannelOptionsUpgraded.Equals(input.ChannelOptionsUpgraded))
                ) && 
                (
                    this.TimerIdsUpgraded == input.TimerIdsUpgraded ||
                    (this.TimerIdsUpgraded != null &&
                    this.TimerIdsUpgraded.Equals(input.TimerIdsUpgraded))
                ) && 
                (
                    this.ForcedSortNameUpgraded == input.ForcedSortNameUpgraded ||
                    (this.ForcedSortNameUpgraded != null &&
                    this.ForcedSortNameUpgraded.Equals(input.ForcedSortNameUpgraded))
                ) && 
                (
                    this.InheritedParentalRatingValueUpgraded == input.InheritedParentalRatingValueUpgraded ||
                    (this.InheritedParentalRatingValueUpgraded != null &&
                    this.InheritedParentalRatingValueUpgraded.Equals(input.InheritedParentalRatingValueUpgraded))
                ) && 
                (
                    this.EnablePeopleLetterSubFolders == input.EnablePeopleLetterSubFolders ||
                    (this.EnablePeopleLetterSubFolders != null &&
                    this.EnablePeopleLetterSubFolders.Equals(input.EnablePeopleLetterSubFolders))
                ) && 
                (
                    this.OptimizeDatabaseOnShutdown == input.OptimizeDatabaseOnShutdown ||
                    (this.OptimizeDatabaseOnShutdown != null &&
                    this.OptimizeDatabaseOnShutdown.Equals(input.OptimizeDatabaseOnShutdown))
                ) && 
                (
                    this.DatabaseAnalysisLimit == input.DatabaseAnalysisLimit ||
                    (this.DatabaseAnalysisLimit != null &&
                    this.DatabaseAnalysisLimit.Equals(input.DatabaseAnalysisLimit))
                ) && 
                (
                    this.DisableAsyncIO == input.DisableAsyncIO ||
                    (this.DisableAsyncIO != null &&
                    this.DisableAsyncIO.Equals(input.DisableAsyncIO))
                ) && 
                (
                    this.EnableDebugLevelLogging == input.EnableDebugLevelLogging ||
                    (this.EnableDebugLevelLogging != null &&
                    this.EnableDebugLevelLogging.Equals(input.EnableDebugLevelLogging))
                ) && 
                (
                    this.RevertDebugLogging == input.RevertDebugLogging ||
                    (this.RevertDebugLogging != null &&
                    this.RevertDebugLogging.Equals(input.RevertDebugLogging))
                ) && 
                (
                    this.EnableAutoUpdate == input.EnableAutoUpdate ||
                    (this.EnableAutoUpdate != null &&
                    this.EnableAutoUpdate.Equals(input.EnableAutoUpdate))
                ) && 
                (
                    this.LogFileRetentionDays == input.LogFileRetentionDays ||
                    (this.LogFileRetentionDays != null &&
                    this.LogFileRetentionDays.Equals(input.LogFileRetentionDays))
                ) && 
                (
                    this.RunAtStartup == input.RunAtStartup ||
                    (this.RunAtStartup != null &&
                    this.RunAtStartup.Equals(input.RunAtStartup))
                ) && 
                (
                    this.IsStartupWizardCompleted == input.IsStartupWizardCompleted ||
                    (this.IsStartupWizardCompleted != null &&
                    this.IsStartupWizardCompleted.Equals(input.IsStartupWizardCompleted))
                ) && 
                (
                    this.CachePath == input.CachePath ||
                    (this.CachePath != null &&
                    this.CachePath.Equals(input.CachePath))
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
                if (this.EnableUPnP != null)
                    hashCode = hashCode * 59 + this.EnableUPnP.GetHashCode();
                if (this.PublicPort != null)
                    hashCode = hashCode * 59 + this.PublicPort.GetHashCode();
                if (this.PublicHttpsPort != null)
                    hashCode = hashCode * 59 + this.PublicHttpsPort.GetHashCode();
                if (this.HttpServerPortNumber != null)
                    hashCode = hashCode * 59 + this.HttpServerPortNumber.GetHashCode();
                if (this.HttpsPortNumber != null)
                    hashCode = hashCode * 59 + this.HttpsPortNumber.GetHashCode();
                if (this.EnableHttps != null)
                    hashCode = hashCode * 59 + this.EnableHttps.GetHashCode();
                if (this.CertificatePath != null)
                    hashCode = hashCode * 59 + this.CertificatePath.GetHashCode();
                if (this.CertificatePassword != null)
                    hashCode = hashCode * 59 + this.CertificatePassword.GetHashCode();
                if (this.IsPortAuthorized != null)
                    hashCode = hashCode * 59 + this.IsPortAuthorized.GetHashCode();
                if (this.AutoRunWebApp != null)
                    hashCode = hashCode * 59 + this.AutoRunWebApp.GetHashCode();
                if (this.EnableRemoteAccess != null)
                    hashCode = hashCode * 59 + this.EnableRemoteAccess.GetHashCode();
                if (this.LogAllQueryTimes != null)
                    hashCode = hashCode * 59 + this.LogAllQueryTimes.GetHashCode();
                if (this.EnableCaseSensitiveItemIds != null)
                    hashCode = hashCode * 59 + this.EnableCaseSensitiveItemIds.GetHashCode();
                if (this.MetadataPath != null)
                    hashCode = hashCode * 59 + this.MetadataPath.GetHashCode();
                if (this.MetadataNetworkPath != null)
                    hashCode = hashCode * 59 + this.MetadataNetworkPath.GetHashCode();
                if (this.PreferredMetadataLanguage != null)
                    hashCode = hashCode * 59 + this.PreferredMetadataLanguage.GetHashCode();
                if (this.MetadataCountryCode != null)
                    hashCode = hashCode * 59 + this.MetadataCountryCode.GetHashCode();
                if (this.SortRemoveWords != null)
                    hashCode = hashCode * 59 + this.SortRemoveWords.GetHashCode();
                if (this.LibraryMonitorDelay != null)
                    hashCode = hashCode * 59 + this.LibraryMonitorDelay.GetHashCode();
                if (this.EnableDashboardResponseCaching != null)
                    hashCode = hashCode * 59 + this.EnableDashboardResponseCaching.GetHashCode();
                if (this.DashboardSourcePath != null)
                    hashCode = hashCode * 59 + this.DashboardSourcePath.GetHashCode();
                if (this.ImageSavingConvention != null)
                    hashCode = hashCode * 59 + this.ImageSavingConvention.GetHashCode();
                if (this.EnableAutomaticRestart != null)
                    hashCode = hashCode * 59 + this.EnableAutomaticRestart.GetHashCode();
                if (this.CollectionFolderIdsMigrated != null)
                    hashCode = hashCode * 59 + this.CollectionFolderIdsMigrated.GetHashCode();
                if (this.ServerName != null)
                    hashCode = hashCode * 59 + this.ServerName.GetHashCode();
                if (this.WanDdns != null)
                    hashCode = hashCode * 59 + this.WanDdns.GetHashCode();
                if (this.UICulture != null)
                    hashCode = hashCode * 59 + this.UICulture.GetHashCode();
                if (this.SaveMetadataHidden != null)
                    hashCode = hashCode * 59 + this.SaveMetadataHidden.GetHashCode();
                if (this.RemoteClientBitrateLimit != null)
                    hashCode = hashCode * 59 + this.RemoteClientBitrateLimit.GetHashCode();
                if (this.DisplaySpecialsWithinSeasons != null)
                    hashCode = hashCode * 59 + this.DisplaySpecialsWithinSeasons.GetHashCode();
                if (this.LocalNetworkSubnets != null)
                    hashCode = hashCode * 59 + this.LocalNetworkSubnets.GetHashCode();
                if (this.LocalNetworkAddresses != null)
                    hashCode = hashCode * 59 + this.LocalNetworkAddresses.GetHashCode();
                if (this.EnableExternalContentInSuggestions != null)
                    hashCode = hashCode * 59 + this.EnableExternalContentInSuggestions.GetHashCode();
                if (this.RequireHttps != null)
                    hashCode = hashCode * 59 + this.RequireHttps.GetHashCode();
                if (this.IsBehindProxy != null)
                    hashCode = hashCode * 59 + this.IsBehindProxy.GetHashCode();
                if (this.RemoteIPFilter != null)
                    hashCode = hashCode * 59 + this.RemoteIPFilter.GetHashCode();
                if (this.IsRemoteIPFilterBlacklist != null)
                    hashCode = hashCode * 59 + this.IsRemoteIPFilterBlacklist.GetHashCode();
                if (this.ImageExtractionTimeoutMs != null)
                    hashCode = hashCode * 59 + this.ImageExtractionTimeoutMs.GetHashCode();
                if (this.PathSubstitutions != null)
                    hashCode = hashCode * 59 + this.PathSubstitutions.GetHashCode();
                if (this.UninstalledPlugins != null)
                    hashCode = hashCode * 59 + this.UninstalledPlugins.GetHashCode();
                if (this.CollapseVideoFolders != null)
                    hashCode = hashCode * 59 + this.CollapseVideoFolders.GetHashCode();
                if (this.EnableOriginalTrackTitles != null)
                    hashCode = hashCode * 59 + this.EnableOriginalTrackTitles.GetHashCode();
                if (this.VacuumDatabaseOnStartup != null)
                    hashCode = hashCode * 59 + this.VacuumDatabaseOnStartup.GetHashCode();
                if (this.SimultaneousStreamLimit != null)
                    hashCode = hashCode * 59 + this.SimultaneousStreamLimit.GetHashCode();
                if (this.DatabaseCacheSizeMB != null)
                    hashCode = hashCode * 59 + this.DatabaseCacheSizeMB.GetHashCode();
                if (this.EnableSqLiteMmio != null)
                    hashCode = hashCode * 59 + this.EnableSqLiteMmio.GetHashCode();
                if (this.NextUpUpgraded != null)
                    hashCode = hashCode * 59 + this.NextUpUpgraded.GetHashCode();
                if (this.ChannelOptionsUpgraded != null)
                    hashCode = hashCode * 59 + this.ChannelOptionsUpgraded.GetHashCode();
                if (this.TimerIdsUpgraded != null)
                    hashCode = hashCode * 59 + this.TimerIdsUpgraded.GetHashCode();
                if (this.ForcedSortNameUpgraded != null)
                    hashCode = hashCode * 59 + this.ForcedSortNameUpgraded.GetHashCode();
                if (this.InheritedParentalRatingValueUpgraded != null)
                    hashCode = hashCode * 59 + this.InheritedParentalRatingValueUpgraded.GetHashCode();
                if (this.EnablePeopleLetterSubFolders != null)
                    hashCode = hashCode * 59 + this.EnablePeopleLetterSubFolders.GetHashCode();
                if (this.OptimizeDatabaseOnShutdown != null)
                    hashCode = hashCode * 59 + this.OptimizeDatabaseOnShutdown.GetHashCode();
                if (this.DatabaseAnalysisLimit != null)
                    hashCode = hashCode * 59 + this.DatabaseAnalysisLimit.GetHashCode();
                if (this.DisableAsyncIO != null)
                    hashCode = hashCode * 59 + this.DisableAsyncIO.GetHashCode();
                if (this.EnableDebugLevelLogging != null)
                    hashCode = hashCode * 59 + this.EnableDebugLevelLogging.GetHashCode();
                if (this.RevertDebugLogging != null)
                    hashCode = hashCode * 59 + this.RevertDebugLogging.GetHashCode();
                if (this.EnableAutoUpdate != null)
                    hashCode = hashCode * 59 + this.EnableAutoUpdate.GetHashCode();
                if (this.LogFileRetentionDays != null)
                    hashCode = hashCode * 59 + this.LogFileRetentionDays.GetHashCode();
                if (this.RunAtStartup != null)
                    hashCode = hashCode * 59 + this.RunAtStartup.GetHashCode();
                if (this.IsStartupWizardCompleted != null)
                    hashCode = hashCode * 59 + this.IsStartupWizardCompleted.GetHashCode();
                if (this.CachePath != null)
                    hashCode = hashCode * 59 + this.CachePath.GetHashCode();
                return hashCode;
            }
        }

    }
}
