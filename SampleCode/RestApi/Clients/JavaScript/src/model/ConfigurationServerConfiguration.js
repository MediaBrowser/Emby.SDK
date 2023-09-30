/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigurationImageSavingConvention from './ConfigurationImageSavingConvention';
import ConfigurationPathSubstitution from './ConfigurationPathSubstitution';
import ConfigurationProxyHeaderMode from './ConfigurationProxyHeaderMode';
import NetSocketsAddressFamily from './NetSocketsAddressFamily';

/**
* The ConfigurationServerConfiguration model module.
* @module model/ConfigurationServerConfiguration
* @version 4.8.0.49
*/
export default class ConfigurationServerConfiguration {
    /**
    * Constructs a new <code>ConfigurationServerConfiguration</code>.
    * @alias module:model/ConfigurationServerConfiguration
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationServerConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationServerConfiguration} obj Optional instance to populate.
    * @return {module:model/ConfigurationServerConfiguration} The populated <code>ConfigurationServerConfiguration</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationServerConfiguration();
                        
            
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
            if (data.hasOwnProperty('LibraryMonitorDelay')) {
                obj['LibraryMonitorDelay'] = ApiClient.convertToType(data['LibraryMonitorDelay'], 'Number');
            }
            if (data.hasOwnProperty('EnableDashboardResponseCaching')) {
                obj['EnableDashboardResponseCaching'] = ApiClient.convertToType(data['EnableDashboardResponseCaching'], 'Boolean');
            }
            if (data.hasOwnProperty('DashboardSourcePath')) {
                obj['DashboardSourcePath'] = ApiClient.convertToType(data['DashboardSourcePath'], 'String');
            }
            if (data.hasOwnProperty('ImageSavingConvention')) {
                obj['ImageSavingConvention'] = ConfigurationImageSavingConvention.constructFromObject(data['ImageSavingConvention']);
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
                obj['PathSubstitutions'] = ApiClient.convertToType(data['PathSubstitutions'], [ConfigurationPathSubstitution]);
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
            if (data.hasOwnProperty('ForcedSortNameUpgraded')) {
                obj['ForcedSortNameUpgraded'] = ApiClient.convertToType(data['ForcedSortNameUpgraded'], 'Boolean');
            }
            if (data.hasOwnProperty('InheritedParentalRatingValueUpgraded')) {
                obj['InheritedParentalRatingValueUpgraded'] = ApiClient.convertToType(data['InheritedParentalRatingValueUpgraded'], 'Boolean');
            }
            if (data.hasOwnProperty('ImageExtractorUpgraded')) {
                obj['ImageExtractorUpgraded'] = ApiClient.convertToType(data['ImageExtractorUpgraded'], 'Boolean');
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
            if (data.hasOwnProperty('MigratedToUserItemShares')) {
                obj['MigratedToUserItemShares'] = ApiClient.convertToType(data['MigratedToUserItemShares'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableFks')) {
                obj['EnableFks'] = ApiClient.convertToType(data['EnableFks'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowRenegotiation')) {
                obj['AllowRenegotiation'] = ApiClient.convertToType(data['AllowRenegotiation'], 'Boolean');
            }
            if (data.hasOwnProperty('ProxyHeaderMode')) {
                obj['ProxyHeaderMode'] = ConfigurationProxyHeaderMode.constructFromObject(data['ProxyHeaderMode']);
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
    * @member {Boolean} EnableUPnP
    */
    'EnableUPnP' = undefined;
    /**
    * @member {Number} PublicPort
    */
    'PublicPort' = undefined;
    /**
    * @member {Number} PublicHttpsPort
    */
    'PublicHttpsPort' = undefined;
    /**
    * @member {Number} HttpServerPortNumber
    */
    'HttpServerPortNumber' = undefined;
    /**
    * @member {Number} HttpsPortNumber
    */
    'HttpsPortNumber' = undefined;
    /**
    * @member {Boolean} EnableHttps
    */
    'EnableHttps' = undefined;
    /**
    * @member {String} CertificatePath
    */
    'CertificatePath' = undefined;
    /**
    * @member {String} CertificatePassword
    */
    'CertificatePassword' = undefined;
    /**
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
    * @member {Boolean} EnableCaseSensitiveItemIds
    */
    'EnableCaseSensitiveItemIds' = undefined;
    /**
    * @member {String} MetadataPath
    */
    'MetadataPath' = undefined;
    /**
    * @member {String} MetadataNetworkPath
    */
    'MetadataNetworkPath' = undefined;
    /**
    * @member {String} PreferredMetadataLanguage
    */
    'PreferredMetadataLanguage' = undefined;
    /**
    * @member {String} MetadataCountryCode
    */
    'MetadataCountryCode' = undefined;
    /**
    * @member {Array.<String>} SortRemoveWords
    */
    'SortRemoveWords' = undefined;
    /**
    * @member {Number} LibraryMonitorDelay
    */
    'LibraryMonitorDelay' = undefined;
    /**
    * @member {Boolean} EnableDashboardResponseCaching
    */
    'EnableDashboardResponseCaching' = undefined;
    /**
    * @member {String} DashboardSourcePath
    */
    'DashboardSourcePath' = undefined;
    /**
    * @member {module:model/ConfigurationImageSavingConvention} ImageSavingConvention
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
    * @member {Array.<module:model/ConfigurationPathSubstitution>} PathSubstitutions
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
    * @member {Boolean} ForcedSortNameUpgraded
    */
    'ForcedSortNameUpgraded' = undefined;
    /**
    * @member {Boolean} InheritedParentalRatingValueUpgraded
    */
    'InheritedParentalRatingValueUpgraded' = undefined;
    /**
    * @member {Boolean} ImageExtractorUpgraded
    */
    'ImageExtractorUpgraded' = undefined;
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
    * @member {Boolean} MigratedToUserItemShares
    */
    'MigratedToUserItemShares' = undefined;
    /**
    * @member {Boolean} EnableFks
    */
    'EnableFks' = undefined;
    /**
    * @member {Boolean} AllowRenegotiation
    */
    'AllowRenegotiation' = undefined;
    /**
    * @member {module:model/ConfigurationProxyHeaderMode} ProxyHeaderMode
    */
    'ProxyHeaderMode' = undefined;
    /**
    * @member {Boolean} EnableDebugLevelLogging
    */
    'EnableDebugLevelLogging' = undefined;
    /**
    * @member {String} RevertDebugLogging
    */
    'RevertDebugLogging' = undefined;
    /**
    * @member {Boolean} EnableAutoUpdate
    */
    'EnableAutoUpdate' = undefined;
    /**
    * @member {Number} LogFileRetentionDays
    */
    'LogFileRetentionDays' = undefined;
    /**
    * @member {Boolean} RunAtStartup
    */
    'RunAtStartup' = undefined;
    /**
    * @member {Boolean} IsStartupWizardCompleted
    */
    'IsStartupWizardCompleted' = undefined;
    /**
    * @member {String} CachePath
    */
    'CachePath' = undefined;




}
