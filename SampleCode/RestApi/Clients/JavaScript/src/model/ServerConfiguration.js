/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ImageSavingConvention from './ImageSavingConvention';
import NetSocketsAddressFamily from './NetSocketsAddressFamily';
import PathSubstitution from './PathSubstitution';
import ProxyHeaderMode from './ProxyHeaderMode';

/**
* The ServerConfiguration model module.
* @module model/ServerConfiguration
* @version 4.8.10.0
*/
export default class ServerConfiguration {
    /**
    * Constructs a new <code>ServerConfiguration</code>.
    * Represents the server configuration.  
    * @alias module:model/ServerConfiguration
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ServerConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ServerConfiguration} obj Optional instance to populate.
    * @return {module:model/ServerConfiguration} The populated <code>ServerConfiguration</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ServerConfiguration();
                        
            
            if (data.hasOwnProperty('EnableUPnP')) {
                obj['EnableUPnP'] = ApiClient.convertToType(data['EnableUPnP'], 'Boolean');
            }
            if (data.hasOwnProperty('PublicPort')) {
                obj['PublicPort'] = ApiClient.convertToType(data['PublicPort'], 'Number');
            }
            if (data.hasOwnProperty('PublicHttpsPort')) {
                obj['PublicHttpsPort'] = ApiClient.convertToType(data['PublicHttpsPort'], 'Number');
            }
            if (data.hasOwnProperty('HttpServerPortNumber')) {
                obj['HttpServerPortNumber'] = ApiClient.convertToType(data['HttpServerPortNumber'], 'Number');
            }
            if (data.hasOwnProperty('HttpsPortNumber')) {
                obj['HttpsPortNumber'] = ApiClient.convertToType(data['HttpsPortNumber'], 'Number');
            }
            if (data.hasOwnProperty('EnableHttps')) {
                obj['EnableHttps'] = ApiClient.convertToType(data['EnableHttps'], 'Boolean');
            }
            if (data.hasOwnProperty('CertificatePath')) {
                obj['CertificatePath'] = ApiClient.convertToType(data['CertificatePath'], 'String');
            }
            if (data.hasOwnProperty('CertificatePassword')) {
                obj['CertificatePassword'] = ApiClient.convertToType(data['CertificatePassword'], 'String');
            }
            if (data.hasOwnProperty('IsPortAuthorized')) {
                obj['IsPortAuthorized'] = ApiClient.convertToType(data['IsPortAuthorized'], 'Boolean');
            }
            if (data.hasOwnProperty('AutoRunWebApp')) {
                obj['AutoRunWebApp'] = ApiClient.convertToType(data['AutoRunWebApp'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableRemoteAccess')) {
                obj['EnableRemoteAccess'] = ApiClient.convertToType(data['EnableRemoteAccess'], 'Boolean');
            }
            if (data.hasOwnProperty('LogAllQueryTimes')) {
                obj['LogAllQueryTimes'] = ApiClient.convertToType(data['LogAllQueryTimes'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableCaseSensitiveItemIds')) {
                obj['EnableCaseSensitiveItemIds'] = ApiClient.convertToType(data['EnableCaseSensitiveItemIds'], 'Boolean');
            }
            if (data.hasOwnProperty('MetadataPath')) {
                obj['MetadataPath'] = ApiClient.convertToType(data['MetadataPath'], 'String');
            }
            if (data.hasOwnProperty('MetadataNetworkPath')) {
                obj['MetadataNetworkPath'] = ApiClient.convertToType(data['MetadataNetworkPath'], 'String');
            }
            if (data.hasOwnProperty('PreferredMetadataLanguage')) {
                obj['PreferredMetadataLanguage'] = ApiClient.convertToType(data['PreferredMetadataLanguage'], 'String');
            }
            if (data.hasOwnProperty('MetadataCountryCode')) {
                obj['MetadataCountryCode'] = ApiClient.convertToType(data['MetadataCountryCode'], 'String');
            }
            if (data.hasOwnProperty('SortRemoveWords')) {
                obj['SortRemoveWords'] = ApiClient.convertToType(data['SortRemoveWords'], ['String']);
            }
            if (data.hasOwnProperty('LibraryMonitorDelaySeconds')) {
                obj['LibraryMonitorDelaySeconds'] = ApiClient.convertToType(data['LibraryMonitorDelaySeconds'], 'Number');
            }
            if (data.hasOwnProperty('EnableDashboardResponseCaching')) {
                obj['EnableDashboardResponseCaching'] = ApiClient.convertToType(data['EnableDashboardResponseCaching'], 'Boolean');
            }
            if (data.hasOwnProperty('DashboardSourcePath')) {
                obj['DashboardSourcePath'] = ApiClient.convertToType(data['DashboardSourcePath'], 'String');
            }
            if (data.hasOwnProperty('ImageSavingConvention')) {
                obj['ImageSavingConvention'] = ImageSavingConvention.constructFromObject(data['ImageSavingConvention']);
            }
            if (data.hasOwnProperty('EnableAutomaticRestart')) {
                obj['EnableAutomaticRestart'] = ApiClient.convertToType(data['EnableAutomaticRestart'], 'Boolean');
            }
            if (data.hasOwnProperty('ServerName')) {
                obj['ServerName'] = ApiClient.convertToType(data['ServerName'], 'String');
            }
            if (data.hasOwnProperty('PreferredDetectedRemoteAddressFamily')) {
                obj['PreferredDetectedRemoteAddressFamily'] = NetSocketsAddressFamily.constructFromObject(data['PreferredDetectedRemoteAddressFamily']);
            }
            if (data.hasOwnProperty('WanDdns')) {
                obj['WanDdns'] = ApiClient.convertToType(data['WanDdns'], 'String');
            }
            if (data.hasOwnProperty('UICulture')) {
                obj['UICulture'] = ApiClient.convertToType(data['UICulture'], 'String');
            }
            if (data.hasOwnProperty('RemoteClientBitrateLimit')) {
                obj['RemoteClientBitrateLimit'] = ApiClient.convertToType(data['RemoteClientBitrateLimit'], 'Number');
            }
            if (data.hasOwnProperty('LocalNetworkSubnets')) {
                obj['LocalNetworkSubnets'] = ApiClient.convertToType(data['LocalNetworkSubnets'], ['String']);
            }
            if (data.hasOwnProperty('LocalNetworkAddresses')) {
                obj['LocalNetworkAddresses'] = ApiClient.convertToType(data['LocalNetworkAddresses'], ['String']);
            }
            if (data.hasOwnProperty('EnableExternalContentInSuggestions')) {
                obj['EnableExternalContentInSuggestions'] = ApiClient.convertToType(data['EnableExternalContentInSuggestions'], 'Boolean');
            }
            if (data.hasOwnProperty('RequireHttps')) {
                obj['RequireHttps'] = ApiClient.convertToType(data['RequireHttps'], 'Boolean');
            }
            if (data.hasOwnProperty('IsBehindProxy')) {
                obj['IsBehindProxy'] = ApiClient.convertToType(data['IsBehindProxy'], 'Boolean');
            }
            if (data.hasOwnProperty('RemoteIPFilter')) {
                obj['RemoteIPFilter'] = ApiClient.convertToType(data['RemoteIPFilter'], ['String']);
            }
            if (data.hasOwnProperty('IsRemoteIPFilterBlacklist')) {
                obj['IsRemoteIPFilterBlacklist'] = ApiClient.convertToType(data['IsRemoteIPFilterBlacklist'], 'Boolean');
            }
            if (data.hasOwnProperty('ImageExtractionTimeoutMs')) {
                obj['ImageExtractionTimeoutMs'] = ApiClient.convertToType(data['ImageExtractionTimeoutMs'], 'Number');
            }
            if (data.hasOwnProperty('PathSubstitutions')) {
                obj['PathSubstitutions'] = ApiClient.convertToType(data['PathSubstitutions'], [PathSubstitution]);
            }
            if (data.hasOwnProperty('UninstalledPlugins')) {
                obj['UninstalledPlugins'] = ApiClient.convertToType(data['UninstalledPlugins'], ['String']);
            }
            if (data.hasOwnProperty('CollapseVideoFolders')) {
                obj['CollapseVideoFolders'] = ApiClient.convertToType(data['CollapseVideoFolders'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableOriginalTrackTitles')) {
                obj['EnableOriginalTrackTitles'] = ApiClient.convertToType(data['EnableOriginalTrackTitles'], 'Boolean');
            }
            if (data.hasOwnProperty('VacuumDatabaseOnStartup')) {
                obj['VacuumDatabaseOnStartup'] = ApiClient.convertToType(data['VacuumDatabaseOnStartup'], 'Boolean');
            }
            if (data.hasOwnProperty('SimultaneousStreamLimit')) {
                obj['SimultaneousStreamLimit'] = ApiClient.convertToType(data['SimultaneousStreamLimit'], 'Number');
            }
            if (data.hasOwnProperty('DatabaseCacheSizeMB')) {
                obj['DatabaseCacheSizeMB'] = ApiClient.convertToType(data['DatabaseCacheSizeMB'], 'Number');
            }
            if (data.hasOwnProperty('EnableSqLiteMmio')) {
                obj['EnableSqLiteMmio'] = ApiClient.convertToType(data['EnableSqLiteMmio'], 'Boolean');
            }
            if (data.hasOwnProperty('PlaylistsUpgradedToM3U')) {
                obj['PlaylistsUpgradedToM3U'] = ApiClient.convertToType(data['PlaylistsUpgradedToM3U'], 'Boolean');
            }
            if (data.hasOwnProperty('ImageExtractorUpgraded1')) {
                obj['ImageExtractorUpgraded1'] = ApiClient.convertToType(data['ImageExtractorUpgraded1'], 'Boolean');
            }
            if (data.hasOwnProperty('EnablePeopleLetterSubFolders')) {
                obj['EnablePeopleLetterSubFolders'] = ApiClient.convertToType(data['EnablePeopleLetterSubFolders'], 'Boolean');
            }
            if (data.hasOwnProperty('OptimizeDatabaseOnShutdown')) {
                obj['OptimizeDatabaseOnShutdown'] = ApiClient.convertToType(data['OptimizeDatabaseOnShutdown'], 'Boolean');
            }
            if (data.hasOwnProperty('DatabaseAnalysisLimit')) {
                obj['DatabaseAnalysisLimit'] = ApiClient.convertToType(data['DatabaseAnalysisLimit'], 'Number');
            }
            if (data.hasOwnProperty('DisableAsyncIO')) {
                obj['DisableAsyncIO'] = ApiClient.convertToType(data['DisableAsyncIO'], 'Boolean');
            }
            if (data.hasOwnProperty('MigratedToUserItemShares8')) {
                obj['MigratedToUserItemShares8'] = ApiClient.convertToType(data['MigratedToUserItemShares8'], 'Boolean');
            }
            if (data.hasOwnProperty('MigratedLibraryOptionsToDb')) {
                obj['MigratedLibraryOptionsToDb'] = ApiClient.convertToType(data['MigratedLibraryOptionsToDb'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowLegacyLocalNetworkPassword')) {
                obj['AllowLegacyLocalNetworkPassword'] = ApiClient.convertToType(data['AllowLegacyLocalNetworkPassword'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableSavedMetadataForPeople')) {
                obj['EnableSavedMetadataForPeople'] = ApiClient.convertToType(data['EnableSavedMetadataForPeople'], 'Boolean');
            }
            if (data.hasOwnProperty('TvChannelsRefreshed')) {
                obj['TvChannelsRefreshed'] = ApiClient.convertToType(data['TvChannelsRefreshed'], 'Boolean');
            }
            if (data.hasOwnProperty('ProxyHeaderMode')) {
                obj['ProxyHeaderMode'] = ProxyHeaderMode.constructFromObject(data['ProxyHeaderMode']);
            }
            if (data.hasOwnProperty('EnableDebugLevelLogging')) {
                obj['EnableDebugLevelLogging'] = ApiClient.convertToType(data['EnableDebugLevelLogging'], 'Boolean');
            }
            if (data.hasOwnProperty('RevertDebugLogging')) {
                obj['RevertDebugLogging'] = ApiClient.convertToType(data['RevertDebugLogging'], 'String');
            }
            if (data.hasOwnProperty('EnableAutoUpdate')) {
                obj['EnableAutoUpdate'] = ApiClient.convertToType(data['EnableAutoUpdate'], 'Boolean');
            }
            if (data.hasOwnProperty('LogFileRetentionDays')) {
                obj['LogFileRetentionDays'] = ApiClient.convertToType(data['LogFileRetentionDays'], 'Number');
            }
            if (data.hasOwnProperty('RunAtStartup')) {
                obj['RunAtStartup'] = ApiClient.convertToType(data['RunAtStartup'], 'Boolean');
            }
            if (data.hasOwnProperty('IsStartupWizardCompleted')) {
                obj['IsStartupWizardCompleted'] = ApiClient.convertToType(data['IsStartupWizardCompleted'], 'Boolean');
            }
            if (data.hasOwnProperty('CachePath')) {
                obj['CachePath'] = ApiClient.convertToType(data['CachePath'], 'String');
            }
        }
        return obj;
    }

    /**
    * A value indicating whether \\[enable u pn p\\].
    * @member {Boolean} EnableUPnP
    */
    'EnableUPnP' = undefined;
    /**
    * The public mapped port.
    * @member {Number} PublicPort
    */
    'PublicPort' = undefined;
    /**
    * The public HTTPS port.
    * @member {Number} PublicHttpsPort
    */
    'PublicHttpsPort' = undefined;
    /**
    * The HTTP server port number.
    * @member {Number} HttpServerPortNumber
    */
    'HttpServerPortNumber' = undefined;
    /**
    * The HTTPS server port number.
    * @member {Number} HttpsPortNumber
    */
    'HttpsPortNumber' = undefined;
    /**
    * A value indicating whether \\[use HTTPS\\].
    * @member {Boolean} EnableHttps
    */
    'EnableHttps' = undefined;
    /**
    * The value pointing to the file system where the ssl certiifcate is located..
    * @member {String} CertificatePath
    */
    'CertificatePath' = undefined;
    /**
    * @member {String} CertificatePassword
    */
    'CertificatePassword' = undefined;
    /**
    * A value indicating whether this instance is port authorized.
    * @member {Boolean} IsPortAuthorized
    */
    'IsPortAuthorized' = undefined;
    /**
    * @member {Boolean} AutoRunWebApp
    */
    'AutoRunWebApp' = undefined;
    /**
    * @member {Boolean} EnableRemoteAccess
    */
    'EnableRemoteAccess' = undefined;
    /**
    * @member {Boolean} LogAllQueryTimes
    */
    'LogAllQueryTimes' = undefined;
    /**
    * A value indicating whether \\[enable case sensitive item ids\\].
    * @member {Boolean} EnableCaseSensitiveItemIds
    */
    'EnableCaseSensitiveItemIds' = undefined;
    /**
    * The metadata path.
    * @member {String} MetadataPath
    */
    'MetadataPath' = undefined;
    /**
    * @member {String} MetadataNetworkPath
    */
    'MetadataNetworkPath' = undefined;
    /**
    * The preferred metadata language.
    * @member {String} PreferredMetadataLanguage
    */
    'PreferredMetadataLanguage' = undefined;
    /**
    * The metadata country code.
    * @member {String} MetadataCountryCode
    */
    'MetadataCountryCode' = undefined;
    /**
    * Words to be removed from strings to create a sort name
    * @member {Array.<String>} SortRemoveWords
    */
    'SortRemoveWords' = undefined;
    /**
    * The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files.
    * @member {Number} LibraryMonitorDelaySeconds
    */
    'LibraryMonitorDelaySeconds' = undefined;
    /**
    * A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes.
    * @member {Boolean} EnableDashboardResponseCaching
    */
    'EnableDashboardResponseCaching' = undefined;
    /**
    * Allows the dashboard to be served from a custom path.
    * @member {String} DashboardSourcePath
    */
    'DashboardSourcePath' = undefined;
    /**
    * @member {module:model/ImageSavingConvention} ImageSavingConvention
    */
    'ImageSavingConvention' = undefined;
    /**
    * @member {Boolean} EnableAutomaticRestart
    */
    'EnableAutomaticRestart' = undefined;
    /**
    * @member {String} ServerName
    */
    'ServerName' = undefined;
    /**
    * @member {module:model/NetSocketsAddressFamily} PreferredDetectedRemoteAddressFamily
    */
    'PreferredDetectedRemoteAddressFamily' = undefined;
    /**
    * @member {String} WanDdns
    */
    'WanDdns' = undefined;
    /**
    * @member {String} UICulture
    */
    'UICulture' = undefined;
    /**
    * @member {Number} RemoteClientBitrateLimit
    */
    'RemoteClientBitrateLimit' = undefined;
    /**
    * @member {Array.<String>} LocalNetworkSubnets
    */
    'LocalNetworkSubnets' = undefined;
    /**
    * @member {Array.<String>} LocalNetworkAddresses
    */
    'LocalNetworkAddresses' = undefined;
    /**
    * @member {Boolean} EnableExternalContentInSuggestions
    */
    'EnableExternalContentInSuggestions' = undefined;
    /**
    * @member {Boolean} RequireHttps
    */
    'RequireHttps' = undefined;
    /**
    * @member {Boolean} IsBehindProxy
    */
    'IsBehindProxy' = undefined;
    /**
    * @member {Array.<String>} RemoteIPFilter
    */
    'RemoteIPFilter' = undefined;
    /**
    * @member {Boolean} IsRemoteIPFilterBlacklist
    */
    'IsRemoteIPFilterBlacklist' = undefined;
    /**
    * @member {Number} ImageExtractionTimeoutMs
    */
    'ImageExtractionTimeoutMs' = undefined;
    /**
    * @member {Array.<module:model/PathSubstitution>} PathSubstitutions
    */
    'PathSubstitutions' = undefined;
    /**
    * @member {Array.<String>} UninstalledPlugins
    */
    'UninstalledPlugins' = undefined;
    /**
    * @member {Boolean} CollapseVideoFolders
    */
    'CollapseVideoFolders' = undefined;
    /**
    * @member {Boolean} EnableOriginalTrackTitles
    */
    'EnableOriginalTrackTitles' = undefined;
    /**
    * @member {Boolean} VacuumDatabaseOnStartup
    */
    'VacuumDatabaseOnStartup' = undefined;
    /**
    * @member {Number} SimultaneousStreamLimit
    */
    'SimultaneousStreamLimit' = undefined;
    /**
    * @member {Number} DatabaseCacheSizeMB
    */
    'DatabaseCacheSizeMB' = undefined;
    /**
    * @member {Boolean} EnableSqLiteMmio
    */
    'EnableSqLiteMmio' = undefined;
    /**
    * @member {Boolean} PlaylistsUpgradedToM3U
    */
    'PlaylistsUpgradedToM3U' = undefined;
    /**
    * @member {Boolean} ImageExtractorUpgraded1
    */
    'ImageExtractorUpgraded1' = undefined;
    /**
    * @member {Boolean} EnablePeopleLetterSubFolders
    */
    'EnablePeopleLetterSubFolders' = undefined;
    /**
    * @member {Boolean} OptimizeDatabaseOnShutdown
    */
    'OptimizeDatabaseOnShutdown' = undefined;
    /**
    * @member {Number} DatabaseAnalysisLimit
    */
    'DatabaseAnalysisLimit' = undefined;
    /**
    * @member {Boolean} DisableAsyncIO
    */
    'DisableAsyncIO' = undefined;
    /**
    * @member {Boolean} MigratedToUserItemShares8
    */
    'MigratedToUserItemShares8' = undefined;
    /**
    * @member {Boolean} MigratedLibraryOptionsToDb
    */
    'MigratedLibraryOptionsToDb' = undefined;
    /**
    * @member {Boolean} AllowLegacyLocalNetworkPassword
    */
    'AllowLegacyLocalNetworkPassword' = undefined;
    /**
    * @member {Boolean} EnableSavedMetadataForPeople
    */
    'EnableSavedMetadataForPeople' = undefined;
    /**
    * @member {Boolean} TvChannelsRefreshed
    */
    'TvChannelsRefreshed' = undefined;
    /**
    * @member {module:model/ProxyHeaderMode} ProxyHeaderMode
    */
    'ProxyHeaderMode' = undefined;
    /**
    * A value indicating whether \\[enable debug level logging\\].
    * @member {Boolean} EnableDebugLevelLogging
    */
    'EnableDebugLevelLogging' = undefined;
    /**
    * @member {String} RevertDebugLogging
    */
    'RevertDebugLogging' = undefined;
    /**
    * Enable automatically and silently updating of the application
    * @member {Boolean} EnableAutoUpdate
    */
    'EnableAutoUpdate' = undefined;
    /**
    * The number of days we should retain log files
    * @member {Number} LogFileRetentionDays
    */
    'LogFileRetentionDays' = undefined;
    /**
    * A value indicating whether \\[run at startup\\].
    * @member {Boolean} RunAtStartup
    */
    'RunAtStartup' = undefined;
    /**
    * A value indicating whether this instance is first run.
    * @member {Boolean} IsStartupWizardCompleted
    */
    'IsStartupWizardCompleted' = undefined;
    /**
    * The cache path.
    * @member {String} CachePath
    */
    'CachePath' = undefined;




}
