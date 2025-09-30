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
    /// Represents the server configuration.  
    /// </summary>
    [DataContract]
        public partial class ServerConfiguration :  IEquatable<ServerConfiguration>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServerConfiguration" /> class.
        /// </summary>
        /// <param name="enableUPnP">A value indicating whether \\[enable u pn p\\]..</param>
        /// <param name="publicPort">The public mapped port..</param>
        /// <param name="publicHttpsPort">The public HTTPS port..</param>
        /// <param name="httpServerPortNumber">The HTTP server port number..</param>
        /// <param name="httpsPortNumber">The HTTPS server port number..</param>
        /// <param name="enableHttps">A value indicating whether \\[use HTTPS\\]..</param>
        /// <param name="certificatePath">The value pointing to the file system where the ssl certiifcate is located...</param>
        /// <param name="certificatePassword">certificatePassword.</param>
        /// <param name="isPortAuthorized">A value indicating whether this instance is port authorized..</param>
        /// <param name="autoRunWebApp">autoRunWebApp.</param>
        /// <param name="enableRemoteAccess">enableRemoteAccess.</param>
        /// <param name="logAllQueryTimes">logAllQueryTimes.</param>
        /// <param name="disableOutgoingIPv6">disableOutgoingIPv6.</param>
        /// <param name="enableCaseSensitiveItemIds">A value indicating whether \\[enable case sensitive item ids\\]..</param>
        /// <param name="metadataPath">The metadata path..</param>
        /// <param name="metadataNetworkPath">metadataNetworkPath.</param>
        /// <param name="preferredMetadataLanguage">The preferred metadata language..</param>
        /// <param name="metadataCountryCode">The metadata country code..</param>
        /// <param name="sortRemoveWords">Words to be removed from strings to create a sort name.</param>
        /// <param name="libraryMonitorDelaySeconds">The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files..</param>
        /// <param name="enableDashboardResponseCaching">A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes..</param>
        /// <param name="dashboardSourcePath">Allows the dashboard to be served from a custom path..</param>
        /// <param name="imageSavingConvention">imageSavingConvention.</param>
        /// <param name="enableAutomaticRestart">enableAutomaticRestart.</param>
        /// <param name="serverName">serverName.</param>
        /// <param name="preferredDetectedRemoteAddressFamily">preferredDetectedRemoteAddressFamily.</param>
        /// <param name="wanDdns">wanDdns.</param>
        /// <param name="uICulture">uICulture.</param>
        /// <param name="remoteClientBitrateLimit">remoteClientBitrateLimit.</param>
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
        /// <param name="playlistsUpgradedToM3U">playlistsUpgradedToM3U.</param>
        /// <param name="imageExtractorUpgraded1">imageExtractorUpgraded1.</param>
        /// <param name="enablePeopleLetterSubFolders">enablePeopleLetterSubFolders.</param>
        /// <param name="optimizeDatabaseOnShutdown">optimizeDatabaseOnShutdown.</param>
        /// <param name="databaseAnalysisLimit">databaseAnalysisLimit.</param>
        /// <param name="maxLibraryDbConnections">maxLibraryDbConnections.</param>
        /// <param name="maxAuthDbConnections">maxAuthDbConnections.</param>
        /// <param name="maxOtherDbConnections">maxOtherDbConnections.</param>
        /// <param name="disableAsyncIO">disableAsyncIO.</param>
        /// <param name="migratedToUserItemShares8">migratedToUserItemShares8.</param>
        /// <param name="migratedLibraryOptionsToDb">migratedLibraryOptionsToDb.</param>
        /// <param name="allowLegacyLocalNetworkPassword">allowLegacyLocalNetworkPassword.</param>
        /// <param name="enableSavedMetadataForPeople">enableSavedMetadataForPeople.</param>
        /// <param name="tvChannelsRefreshed">tvChannelsRefreshed.</param>
        /// <param name="proxyHeaderMode">proxyHeaderMode.</param>
        /// <param name="isInMaintenanceMode">isInMaintenanceMode.</param>
        /// <param name="maintenanceModeMessage">maintenanceModeMessage.</param>
        /// <param name="enableDebugLevelLogging">A value indicating whether \\[enable debug level logging\\]..</param>
        /// <param name="revertDebugLogging">revertDebugLogging.</param>
        /// <param name="enableAutoUpdate">Enable automatically and silently updating of the application.</param>
        /// <param name="logFileRetentionDays">The number of days we should retain log files.</param>
        /// <param name="runAtStartup">A value indicating whether \\[run at startup\\]..</param>
        /// <param name="isStartupWizardCompleted">A value indicating whether this instance is first run..</param>
        /// <param name="cachePath">The cache path..</param>
        public ServerConfiguration(bool? enableUPnP = default(bool?), int? publicPort = default(int?), int? publicHttpsPort = default(int?), int? httpServerPortNumber = default(int?), int? httpsPortNumber = default(int?), bool? enableHttps = default(bool?), string certificatePath = default(string), string certificatePassword = default(string), bool? isPortAuthorized = default(bool?), bool? autoRunWebApp = default(bool?), bool? enableRemoteAccess = default(bool?), bool? logAllQueryTimes = default(bool?), bool? disableOutgoingIPv6 = default(bool?), bool? enableCaseSensitiveItemIds = default(bool?), string metadataPath = default(string), string metadataNetworkPath = default(string), string preferredMetadataLanguage = default(string), string metadataCountryCode = default(string), List<string> sortRemoveWords = default(List<string>), int? libraryMonitorDelaySeconds = default(int?), bool? enableDashboardResponseCaching = default(bool?), string dashboardSourcePath = default(string), ImageSavingConvention imageSavingConvention = default(ImageSavingConvention), bool? enableAutomaticRestart = default(bool?), string serverName = default(string), NetSocketsAddressFamily preferredDetectedRemoteAddressFamily = default(NetSocketsAddressFamily), string wanDdns = default(string), string uICulture = default(string), int? remoteClientBitrateLimit = default(int?), List<string> localNetworkSubnets = default(List<string>), List<string> localNetworkAddresses = default(List<string>), bool? enableExternalContentInSuggestions = default(bool?), bool? requireHttps = default(bool?), bool? isBehindProxy = default(bool?), List<string> remoteIPFilter = default(List<string>), bool? isRemoteIPFilterBlacklist = default(bool?), int? imageExtractionTimeoutMs = default(int?), List<PathSubstitution> pathSubstitutions = default(List<PathSubstitution>), List<string> uninstalledPlugins = default(List<string>), bool? collapseVideoFolders = default(bool?), bool? enableOriginalTrackTitles = default(bool?), bool? vacuumDatabaseOnStartup = default(bool?), int? simultaneousStreamLimit = default(int?), int? databaseCacheSizeMB = default(int?), bool? enableSqLiteMmio = default(bool?), bool? playlistsUpgradedToM3U = default(bool?), bool? imageExtractorUpgraded1 = default(bool?), bool? enablePeopleLetterSubFolders = default(bool?), bool? optimizeDatabaseOnShutdown = default(bool?), int? databaseAnalysisLimit = default(int?), int? maxLibraryDbConnections = default(int?), int? maxAuthDbConnections = default(int?), int? maxOtherDbConnections = default(int?), bool? disableAsyncIO = default(bool?), bool? migratedToUserItemShares8 = default(bool?), bool? migratedLibraryOptionsToDb = default(bool?), bool? allowLegacyLocalNetworkPassword = default(bool?), bool? enableSavedMetadataForPeople = default(bool?), bool? tvChannelsRefreshed = default(bool?), ProxyHeaderMode proxyHeaderMode = default(ProxyHeaderMode), bool? isInMaintenanceMode = default(bool?), string maintenanceModeMessage = default(string), bool? enableDebugLevelLogging = default(bool?), string revertDebugLogging = default(string), bool? enableAutoUpdate = default(bool?), int? logFileRetentionDays = default(int?), bool? runAtStartup = default(bool?), bool? isStartupWizardCompleted = default(bool?), string cachePath = default(string))
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
            this.DisableOutgoingIPv6 = disableOutgoingIPv6;
            this.EnableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
            this.MetadataPath = metadataPath;
            this.MetadataNetworkPath = metadataNetworkPath;
            this.PreferredMetadataLanguage = preferredMetadataLanguage;
            this.MetadataCountryCode = metadataCountryCode;
            this.SortRemoveWords = sortRemoveWords;
            this.LibraryMonitorDelaySeconds = libraryMonitorDelaySeconds;
            this.EnableDashboardResponseCaching = enableDashboardResponseCaching;
            this.DashboardSourcePath = dashboardSourcePath;
            this.ImageSavingConvention = imageSavingConvention;
            this.EnableAutomaticRestart = enableAutomaticRestart;
            this.ServerName = serverName;
            this.PreferredDetectedRemoteAddressFamily = preferredDetectedRemoteAddressFamily;
            this.WanDdns = wanDdns;
            this.UICulture = uICulture;
            this.RemoteClientBitrateLimit = remoteClientBitrateLimit;
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
            this.PlaylistsUpgradedToM3U = playlistsUpgradedToM3U;
            this.ImageExtractorUpgraded1 = imageExtractorUpgraded1;
            this.EnablePeopleLetterSubFolders = enablePeopleLetterSubFolders;
            this.OptimizeDatabaseOnShutdown = optimizeDatabaseOnShutdown;
            this.DatabaseAnalysisLimit = databaseAnalysisLimit;
            this.MaxLibraryDbConnections = maxLibraryDbConnections;
            this.MaxAuthDbConnections = maxAuthDbConnections;
            this.MaxOtherDbConnections = maxOtherDbConnections;
            this.DisableAsyncIO = disableAsyncIO;
            this.MigratedToUserItemShares8 = migratedToUserItemShares8;
            this.MigratedLibraryOptionsToDb = migratedLibraryOptionsToDb;
            this.AllowLegacyLocalNetworkPassword = allowLegacyLocalNetworkPassword;
            this.EnableSavedMetadataForPeople = enableSavedMetadataForPeople;
            this.TvChannelsRefreshed = tvChannelsRefreshed;
            this.ProxyHeaderMode = proxyHeaderMode;
            this.IsInMaintenanceMode = isInMaintenanceMode;
            this.MaintenanceModeMessage = maintenanceModeMessage;
            this.EnableDebugLevelLogging = enableDebugLevelLogging;
            this.RevertDebugLogging = revertDebugLogging;
            this.EnableAutoUpdate = enableAutoUpdate;
            this.LogFileRetentionDays = logFileRetentionDays;
            this.RunAtStartup = runAtStartup;
            this.IsStartupWizardCompleted = isStartupWizardCompleted;
            this.CachePath = cachePath;
        }
        
        /// <summary>
        /// A value indicating whether \\[enable u pn p\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable u pn p\\].</value>
        [DataMember(Name="EnableUPnP", EmitDefaultValue=false)]
        public bool? EnableUPnP { get; set; }

        /// <summary>
        /// The public mapped port.
        /// </summary>
        /// <value>The public mapped port.</value>
        [DataMember(Name="PublicPort", EmitDefaultValue=false)]
        public int? PublicPort { get; set; }

        /// <summary>
        /// The public HTTPS port.
        /// </summary>
        /// <value>The public HTTPS port.</value>
        [DataMember(Name="PublicHttpsPort", EmitDefaultValue=false)]
        public int? PublicHttpsPort { get; set; }

        /// <summary>
        /// The HTTP server port number.
        /// </summary>
        /// <value>The HTTP server port number.</value>
        [DataMember(Name="HttpServerPortNumber", EmitDefaultValue=false)]
        public int? HttpServerPortNumber { get; set; }

        /// <summary>
        /// The HTTPS server port number.
        /// </summary>
        /// <value>The HTTPS server port number.</value>
        [DataMember(Name="HttpsPortNumber", EmitDefaultValue=false)]
        public int? HttpsPortNumber { get; set; }

        /// <summary>
        /// A value indicating whether \\[use HTTPS\\].
        /// </summary>
        /// <value>A value indicating whether \\[use HTTPS\\].</value>
        [DataMember(Name="EnableHttps", EmitDefaultValue=false)]
        public bool? EnableHttps { get; set; }

        /// <summary>
        /// The value pointing to the file system where the ssl certiifcate is located..
        /// </summary>
        /// <value>The value pointing to the file system where the ssl certiifcate is located..</value>
        [DataMember(Name="CertificatePath", EmitDefaultValue=false)]
        public string CertificatePath { get; set; }

        /// <summary>
        /// Gets or Sets CertificatePassword
        /// </summary>
        [DataMember(Name="CertificatePassword", EmitDefaultValue=false)]
        public string CertificatePassword { get; set; }

        /// <summary>
        /// A value indicating whether this instance is port authorized.
        /// </summary>
        /// <value>A value indicating whether this instance is port authorized.</value>
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
        /// Gets or Sets DisableOutgoingIPv6
        /// </summary>
        [DataMember(Name="DisableOutgoingIPv6", EmitDefaultValue=false)]
        public bool? DisableOutgoingIPv6 { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable case sensitive item ids\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable case sensitive item ids\\].</value>
        [DataMember(Name="EnableCaseSensitiveItemIds", EmitDefaultValue=false)]
        public bool? EnableCaseSensitiveItemIds { get; set; }

        /// <summary>
        /// The metadata path.
        /// </summary>
        /// <value>The metadata path.</value>
        [DataMember(Name="MetadataPath", EmitDefaultValue=false)]
        public string MetadataPath { get; set; }

        /// <summary>
        /// Gets or Sets MetadataNetworkPath
        /// </summary>
        [DataMember(Name="MetadataNetworkPath", EmitDefaultValue=false)]
        public string MetadataNetworkPath { get; set; }

        /// <summary>
        /// The preferred metadata language.
        /// </summary>
        /// <value>The preferred metadata language.</value>
        [DataMember(Name="PreferredMetadataLanguage", EmitDefaultValue=false)]
        public string PreferredMetadataLanguage { get; set; }

        /// <summary>
        /// The metadata country code.
        /// </summary>
        /// <value>The metadata country code.</value>
        [DataMember(Name="MetadataCountryCode", EmitDefaultValue=false)]
        public string MetadataCountryCode { get; set; }

        /// <summary>
        /// Words to be removed from strings to create a sort name
        /// </summary>
        /// <value>Words to be removed from strings to create a sort name</value>
        [DataMember(Name="SortRemoveWords", EmitDefaultValue=false)]
        public List<string> SortRemoveWords { get; set; }

        /// <summary>
        /// The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files.
        /// </summary>
        /// <value>The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files.</value>
        [DataMember(Name="LibraryMonitorDelaySeconds", EmitDefaultValue=false)]
        public int? LibraryMonitorDelaySeconds { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes.
        /// </summary>
        /// <value>A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes.</value>
        [DataMember(Name="EnableDashboardResponseCaching", EmitDefaultValue=false)]
        public bool? EnableDashboardResponseCaching { get; set; }

        /// <summary>
        /// Allows the dashboard to be served from a custom path.
        /// </summary>
        /// <value>Allows the dashboard to be served from a custom path.</value>
        [DataMember(Name="DashboardSourcePath", EmitDefaultValue=false)]
        public string DashboardSourcePath { get; set; }

        /// <summary>
        /// Gets or Sets ImageSavingConvention
        /// </summary>
        [DataMember(Name="ImageSavingConvention", EmitDefaultValue=false)]
        public ImageSavingConvention ImageSavingConvention { get; set; }

        /// <summary>
        /// Gets or Sets EnableAutomaticRestart
        /// </summary>
        [DataMember(Name="EnableAutomaticRestart", EmitDefaultValue=false)]
        public bool? EnableAutomaticRestart { get; set; }

        /// <summary>
        /// Gets or Sets ServerName
        /// </summary>
        [DataMember(Name="ServerName", EmitDefaultValue=false)]
        public string ServerName { get; set; }

        /// <summary>
        /// Gets or Sets PreferredDetectedRemoteAddressFamily
        /// </summary>
        [DataMember(Name="PreferredDetectedRemoteAddressFamily", EmitDefaultValue=false)]
        public NetSocketsAddressFamily PreferredDetectedRemoteAddressFamily { get; set; }

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
        /// Gets or Sets RemoteClientBitrateLimit
        /// </summary>
        [DataMember(Name="RemoteClientBitrateLimit", EmitDefaultValue=false)]
        public int? RemoteClientBitrateLimit { get; set; }

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
        public List<PathSubstitution> PathSubstitutions { get; set; }

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
        /// Gets or Sets PlaylistsUpgradedToM3U
        /// </summary>
        [DataMember(Name="PlaylistsUpgradedToM3U", EmitDefaultValue=false)]
        public bool? PlaylistsUpgradedToM3U { get; set; }

        /// <summary>
        /// Gets or Sets ImageExtractorUpgraded1
        /// </summary>
        [DataMember(Name="ImageExtractorUpgraded1", EmitDefaultValue=false)]
        public bool? ImageExtractorUpgraded1 { get; set; }

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
        /// Gets or Sets MaxLibraryDbConnections
        /// </summary>
        [DataMember(Name="MaxLibraryDbConnections", EmitDefaultValue=false)]
        public int? MaxLibraryDbConnections { get; set; }

        /// <summary>
        /// Gets or Sets MaxAuthDbConnections
        /// </summary>
        [DataMember(Name="MaxAuthDbConnections", EmitDefaultValue=false)]
        public int? MaxAuthDbConnections { get; set; }

        /// <summary>
        /// Gets or Sets MaxOtherDbConnections
        /// </summary>
        [DataMember(Name="MaxOtherDbConnections", EmitDefaultValue=false)]
        public int? MaxOtherDbConnections { get; set; }

        /// <summary>
        /// Gets or Sets DisableAsyncIO
        /// </summary>
        [DataMember(Name="DisableAsyncIO", EmitDefaultValue=false)]
        public bool? DisableAsyncIO { get; set; }

        /// <summary>
        /// Gets or Sets MigratedToUserItemShares8
        /// </summary>
        [DataMember(Name="MigratedToUserItemShares8", EmitDefaultValue=false)]
        public bool? MigratedToUserItemShares8 { get; set; }

        /// <summary>
        /// Gets or Sets MigratedLibraryOptionsToDb
        /// </summary>
        [DataMember(Name="MigratedLibraryOptionsToDb", EmitDefaultValue=false)]
        public bool? MigratedLibraryOptionsToDb { get; set; }

        /// <summary>
        /// Gets or Sets AllowLegacyLocalNetworkPassword
        /// </summary>
        [DataMember(Name="AllowLegacyLocalNetworkPassword", EmitDefaultValue=false)]
        public bool? AllowLegacyLocalNetworkPassword { get; set; }

        /// <summary>
        /// Gets or Sets EnableSavedMetadataForPeople
        /// </summary>
        [DataMember(Name="EnableSavedMetadataForPeople", EmitDefaultValue=false)]
        public bool? EnableSavedMetadataForPeople { get; set; }

        /// <summary>
        /// Gets or Sets TvChannelsRefreshed
        /// </summary>
        [DataMember(Name="TvChannelsRefreshed", EmitDefaultValue=false)]
        public bool? TvChannelsRefreshed { get; set; }

        /// <summary>
        /// Gets or Sets ProxyHeaderMode
        /// </summary>
        [DataMember(Name="ProxyHeaderMode", EmitDefaultValue=false)]
        public ProxyHeaderMode ProxyHeaderMode { get; set; }

        /// <summary>
        /// Gets or Sets IsInMaintenanceMode
        /// </summary>
        [DataMember(Name="IsInMaintenanceMode", EmitDefaultValue=false)]
        public bool? IsInMaintenanceMode { get; set; }

        /// <summary>
        /// Gets or Sets MaintenanceModeMessage
        /// </summary>
        [DataMember(Name="MaintenanceModeMessage", EmitDefaultValue=false)]
        public string MaintenanceModeMessage { get; set; }

        /// <summary>
        /// A value indicating whether \\[enable debug level logging\\].
        /// </summary>
        /// <value>A value indicating whether \\[enable debug level logging\\].</value>
        [DataMember(Name="EnableDebugLevelLogging", EmitDefaultValue=false)]
        public bool? EnableDebugLevelLogging { get; set; }

        /// <summary>
        /// Gets or Sets RevertDebugLogging
        /// </summary>
        [DataMember(Name="RevertDebugLogging", EmitDefaultValue=false)]
        public string RevertDebugLogging { get; set; }

        /// <summary>
        /// Enable automatically and silently updating of the application
        /// </summary>
        /// <value>Enable automatically and silently updating of the application</value>
        [DataMember(Name="EnableAutoUpdate", EmitDefaultValue=false)]
        public bool? EnableAutoUpdate { get; set; }

        /// <summary>
        /// The number of days we should retain log files
        /// </summary>
        /// <value>The number of days we should retain log files</value>
        [DataMember(Name="LogFileRetentionDays", EmitDefaultValue=false)]
        public int? LogFileRetentionDays { get; set; }

        /// <summary>
        /// A value indicating whether \\[run at startup\\].
        /// </summary>
        /// <value>A value indicating whether \\[run at startup\\].</value>
        [DataMember(Name="RunAtStartup", EmitDefaultValue=false)]
        public bool? RunAtStartup { get; set; }

        /// <summary>
        /// A value indicating whether this instance is first run.
        /// </summary>
        /// <value>A value indicating whether this instance is first run.</value>
        [DataMember(Name="IsStartupWizardCompleted", EmitDefaultValue=false)]
        public bool? IsStartupWizardCompleted { get; set; }

        /// <summary>
        /// The cache path.
        /// </summary>
        /// <value>The cache path.</value>
        [DataMember(Name="CachePath", EmitDefaultValue=false)]
        public string CachePath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ServerConfiguration {\n");
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
            sb.Append("  DisableOutgoingIPv6: ").Append(DisableOutgoingIPv6).Append("\n");
            sb.Append("  EnableCaseSensitiveItemIds: ").Append(EnableCaseSensitiveItemIds).Append("\n");
            sb.Append("  MetadataPath: ").Append(MetadataPath).Append("\n");
            sb.Append("  MetadataNetworkPath: ").Append(MetadataNetworkPath).Append("\n");
            sb.Append("  PreferredMetadataLanguage: ").Append(PreferredMetadataLanguage).Append("\n");
            sb.Append("  MetadataCountryCode: ").Append(MetadataCountryCode).Append("\n");
            sb.Append("  SortRemoveWords: ").Append(SortRemoveWords).Append("\n");
            sb.Append("  LibraryMonitorDelaySeconds: ").Append(LibraryMonitorDelaySeconds).Append("\n");
            sb.Append("  EnableDashboardResponseCaching: ").Append(EnableDashboardResponseCaching).Append("\n");
            sb.Append("  DashboardSourcePath: ").Append(DashboardSourcePath).Append("\n");
            sb.Append("  ImageSavingConvention: ").Append(ImageSavingConvention).Append("\n");
            sb.Append("  EnableAutomaticRestart: ").Append(EnableAutomaticRestart).Append("\n");
            sb.Append("  ServerName: ").Append(ServerName).Append("\n");
            sb.Append("  PreferredDetectedRemoteAddressFamily: ").Append(PreferredDetectedRemoteAddressFamily).Append("\n");
            sb.Append("  WanDdns: ").Append(WanDdns).Append("\n");
            sb.Append("  UICulture: ").Append(UICulture).Append("\n");
            sb.Append("  RemoteClientBitrateLimit: ").Append(RemoteClientBitrateLimit).Append("\n");
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
            sb.Append("  PlaylistsUpgradedToM3U: ").Append(PlaylistsUpgradedToM3U).Append("\n");
            sb.Append("  ImageExtractorUpgraded1: ").Append(ImageExtractorUpgraded1).Append("\n");
            sb.Append("  EnablePeopleLetterSubFolders: ").Append(EnablePeopleLetterSubFolders).Append("\n");
            sb.Append("  OptimizeDatabaseOnShutdown: ").Append(OptimizeDatabaseOnShutdown).Append("\n");
            sb.Append("  DatabaseAnalysisLimit: ").Append(DatabaseAnalysisLimit).Append("\n");
            sb.Append("  MaxLibraryDbConnections: ").Append(MaxLibraryDbConnections).Append("\n");
            sb.Append("  MaxAuthDbConnections: ").Append(MaxAuthDbConnections).Append("\n");
            sb.Append("  MaxOtherDbConnections: ").Append(MaxOtherDbConnections).Append("\n");
            sb.Append("  DisableAsyncIO: ").Append(DisableAsyncIO).Append("\n");
            sb.Append("  MigratedToUserItemShares8: ").Append(MigratedToUserItemShares8).Append("\n");
            sb.Append("  MigratedLibraryOptionsToDb: ").Append(MigratedLibraryOptionsToDb).Append("\n");
            sb.Append("  AllowLegacyLocalNetworkPassword: ").Append(AllowLegacyLocalNetworkPassword).Append("\n");
            sb.Append("  EnableSavedMetadataForPeople: ").Append(EnableSavedMetadataForPeople).Append("\n");
            sb.Append("  TvChannelsRefreshed: ").Append(TvChannelsRefreshed).Append("\n");
            sb.Append("  ProxyHeaderMode: ").Append(ProxyHeaderMode).Append("\n");
            sb.Append("  IsInMaintenanceMode: ").Append(IsInMaintenanceMode).Append("\n");
            sb.Append("  MaintenanceModeMessage: ").Append(MaintenanceModeMessage).Append("\n");
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
            return this.Equals(input as ServerConfiguration);
        }

        /// <summary>
        /// Returns true if ServerConfiguration instances are equal
        /// </summary>
        /// <param name="input">Instance of ServerConfiguration to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ServerConfiguration input)
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
                    this.DisableOutgoingIPv6 == input.DisableOutgoingIPv6 ||
                    (this.DisableOutgoingIPv6 != null &&
                    this.DisableOutgoingIPv6.Equals(input.DisableOutgoingIPv6))
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
                    this.LibraryMonitorDelaySeconds == input.LibraryMonitorDelaySeconds ||
                    (this.LibraryMonitorDelaySeconds != null &&
                    this.LibraryMonitorDelaySeconds.Equals(input.LibraryMonitorDelaySeconds))
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
                    this.ServerName == input.ServerName ||
                    (this.ServerName != null &&
                    this.ServerName.Equals(input.ServerName))
                ) && 
                (
                    this.PreferredDetectedRemoteAddressFamily == input.PreferredDetectedRemoteAddressFamily ||
                    (this.PreferredDetectedRemoteAddressFamily != null &&
                    this.PreferredDetectedRemoteAddressFamily.Equals(input.PreferredDetectedRemoteAddressFamily))
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
                    this.RemoteClientBitrateLimit == input.RemoteClientBitrateLimit ||
                    (this.RemoteClientBitrateLimit != null &&
                    this.RemoteClientBitrateLimit.Equals(input.RemoteClientBitrateLimit))
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
                    this.PlaylistsUpgradedToM3U == input.PlaylistsUpgradedToM3U ||
                    (this.PlaylistsUpgradedToM3U != null &&
                    this.PlaylistsUpgradedToM3U.Equals(input.PlaylistsUpgradedToM3U))
                ) && 
                (
                    this.ImageExtractorUpgraded1 == input.ImageExtractorUpgraded1 ||
                    (this.ImageExtractorUpgraded1 != null &&
                    this.ImageExtractorUpgraded1.Equals(input.ImageExtractorUpgraded1))
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
                    this.MaxLibraryDbConnections == input.MaxLibraryDbConnections ||
                    (this.MaxLibraryDbConnections != null &&
                    this.MaxLibraryDbConnections.Equals(input.MaxLibraryDbConnections))
                ) && 
                (
                    this.MaxAuthDbConnections == input.MaxAuthDbConnections ||
                    (this.MaxAuthDbConnections != null &&
                    this.MaxAuthDbConnections.Equals(input.MaxAuthDbConnections))
                ) && 
                (
                    this.MaxOtherDbConnections == input.MaxOtherDbConnections ||
                    (this.MaxOtherDbConnections != null &&
                    this.MaxOtherDbConnections.Equals(input.MaxOtherDbConnections))
                ) && 
                (
                    this.DisableAsyncIO == input.DisableAsyncIO ||
                    (this.DisableAsyncIO != null &&
                    this.DisableAsyncIO.Equals(input.DisableAsyncIO))
                ) && 
                (
                    this.MigratedToUserItemShares8 == input.MigratedToUserItemShares8 ||
                    (this.MigratedToUserItemShares8 != null &&
                    this.MigratedToUserItemShares8.Equals(input.MigratedToUserItemShares8))
                ) && 
                (
                    this.MigratedLibraryOptionsToDb == input.MigratedLibraryOptionsToDb ||
                    (this.MigratedLibraryOptionsToDb != null &&
                    this.MigratedLibraryOptionsToDb.Equals(input.MigratedLibraryOptionsToDb))
                ) && 
                (
                    this.AllowLegacyLocalNetworkPassword == input.AllowLegacyLocalNetworkPassword ||
                    (this.AllowLegacyLocalNetworkPassword != null &&
                    this.AllowLegacyLocalNetworkPassword.Equals(input.AllowLegacyLocalNetworkPassword))
                ) && 
                (
                    this.EnableSavedMetadataForPeople == input.EnableSavedMetadataForPeople ||
                    (this.EnableSavedMetadataForPeople != null &&
                    this.EnableSavedMetadataForPeople.Equals(input.EnableSavedMetadataForPeople))
                ) && 
                (
                    this.TvChannelsRefreshed == input.TvChannelsRefreshed ||
                    (this.TvChannelsRefreshed != null &&
                    this.TvChannelsRefreshed.Equals(input.TvChannelsRefreshed))
                ) && 
                (
                    this.ProxyHeaderMode == input.ProxyHeaderMode ||
                    (this.ProxyHeaderMode != null &&
                    this.ProxyHeaderMode.Equals(input.ProxyHeaderMode))
                ) && 
                (
                    this.IsInMaintenanceMode == input.IsInMaintenanceMode ||
                    (this.IsInMaintenanceMode != null &&
                    this.IsInMaintenanceMode.Equals(input.IsInMaintenanceMode))
                ) && 
                (
                    this.MaintenanceModeMessage == input.MaintenanceModeMessage ||
                    (this.MaintenanceModeMessage != null &&
                    this.MaintenanceModeMessage.Equals(input.MaintenanceModeMessage))
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
                if (this.DisableOutgoingIPv6 != null)
                    hashCode = hashCode * 59 + this.DisableOutgoingIPv6.GetHashCode();
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
                if (this.LibraryMonitorDelaySeconds != null)
                    hashCode = hashCode * 59 + this.LibraryMonitorDelaySeconds.GetHashCode();
                if (this.EnableDashboardResponseCaching != null)
                    hashCode = hashCode * 59 + this.EnableDashboardResponseCaching.GetHashCode();
                if (this.DashboardSourcePath != null)
                    hashCode = hashCode * 59 + this.DashboardSourcePath.GetHashCode();
                if (this.ImageSavingConvention != null)
                    hashCode = hashCode * 59 + this.ImageSavingConvention.GetHashCode();
                if (this.EnableAutomaticRestart != null)
                    hashCode = hashCode * 59 + this.EnableAutomaticRestart.GetHashCode();
                if (this.ServerName != null)
                    hashCode = hashCode * 59 + this.ServerName.GetHashCode();
                if (this.PreferredDetectedRemoteAddressFamily != null)
                    hashCode = hashCode * 59 + this.PreferredDetectedRemoteAddressFamily.GetHashCode();
                if (this.WanDdns != null)
                    hashCode = hashCode * 59 + this.WanDdns.GetHashCode();
                if (this.UICulture != null)
                    hashCode = hashCode * 59 + this.UICulture.GetHashCode();
                if (this.RemoteClientBitrateLimit != null)
                    hashCode = hashCode * 59 + this.RemoteClientBitrateLimit.GetHashCode();
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
                if (this.PlaylistsUpgradedToM3U != null)
                    hashCode = hashCode * 59 + this.PlaylistsUpgradedToM3U.GetHashCode();
                if (this.ImageExtractorUpgraded1 != null)
                    hashCode = hashCode * 59 + this.ImageExtractorUpgraded1.GetHashCode();
                if (this.EnablePeopleLetterSubFolders != null)
                    hashCode = hashCode * 59 + this.EnablePeopleLetterSubFolders.GetHashCode();
                if (this.OptimizeDatabaseOnShutdown != null)
                    hashCode = hashCode * 59 + this.OptimizeDatabaseOnShutdown.GetHashCode();
                if (this.DatabaseAnalysisLimit != null)
                    hashCode = hashCode * 59 + this.DatabaseAnalysisLimit.GetHashCode();
                if (this.MaxLibraryDbConnections != null)
                    hashCode = hashCode * 59 + this.MaxLibraryDbConnections.GetHashCode();
                if (this.MaxAuthDbConnections != null)
                    hashCode = hashCode * 59 + this.MaxAuthDbConnections.GetHashCode();
                if (this.MaxOtherDbConnections != null)
                    hashCode = hashCode * 59 + this.MaxOtherDbConnections.GetHashCode();
                if (this.DisableAsyncIO != null)
                    hashCode = hashCode * 59 + this.DisableAsyncIO.GetHashCode();
                if (this.MigratedToUserItemShares8 != null)
                    hashCode = hashCode * 59 + this.MigratedToUserItemShares8.GetHashCode();
                if (this.MigratedLibraryOptionsToDb != null)
                    hashCode = hashCode * 59 + this.MigratedLibraryOptionsToDb.GetHashCode();
                if (this.AllowLegacyLocalNetworkPassword != null)
                    hashCode = hashCode * 59 + this.AllowLegacyLocalNetworkPassword.GetHashCode();
                if (this.EnableSavedMetadataForPeople != null)
                    hashCode = hashCode * 59 + this.EnableSavedMetadataForPeople.GetHashCode();
                if (this.TvChannelsRefreshed != null)
                    hashCode = hashCode * 59 + this.TvChannelsRefreshed.GetHashCode();
                if (this.ProxyHeaderMode != null)
                    hashCode = hashCode * 59 + this.ProxyHeaderMode.GetHashCode();
                if (this.IsInMaintenanceMode != null)
                    hashCode = hashCode * 59 + this.IsInMaintenanceMode.GetHashCode();
                if (this.MaintenanceModeMessage != null)
                    hashCode = hashCode * 59 + this.MaintenanceModeMessage.GetHashCode();
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
