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
import UpdatesInstallationInfo from './UpdatesInstallationInfo';
import UpdatesPackageVersionClass from './UpdatesPackageVersionClass';

/**
* The SystemInfo model module.
* @module model/SystemInfo
* @version 4.8.0.39
*/
export default class SystemInfo {
    /**
    * Constructs a new <code>SystemInfo</code>.
    * @alias module:model/SystemInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SystemInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SystemInfo} obj Optional instance to populate.
    * @return {module:model/SystemInfo} The populated <code>SystemInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SystemInfo();
                        
            
            if (data.hasOwnProperty('SystemUpdateLevel')) {
                obj['SystemUpdateLevel'] = UpdatesPackageVersionClass.constructFromObject(data['SystemUpdateLevel']);
            }
            if (data.hasOwnProperty('OperatingSystemDisplayName')) {
                obj['OperatingSystemDisplayName'] = ApiClient.convertToType(data['OperatingSystemDisplayName'], 'String');
            }
            if (data.hasOwnProperty('PackageName')) {
                obj['PackageName'] = ApiClient.convertToType(data['PackageName'], 'String');
            }
            if (data.hasOwnProperty('HasPendingRestart')) {
                obj['HasPendingRestart'] = ApiClient.convertToType(data['HasPendingRestart'], 'Boolean');
            }
            if (data.hasOwnProperty('IsShuttingDown')) {
                obj['IsShuttingDown'] = ApiClient.convertToType(data['IsShuttingDown'], 'Boolean');
            }
            if (data.hasOwnProperty('OperatingSystem')) {
                obj['OperatingSystem'] = ApiClient.convertToType(data['OperatingSystem'], 'String');
            }
            if (data.hasOwnProperty('SupportsLibraryMonitor')) {
                obj['SupportsLibraryMonitor'] = ApiClient.convertToType(data['SupportsLibraryMonitor'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsLocalPortConfiguration')) {
                obj['SupportsLocalPortConfiguration'] = ApiClient.convertToType(data['SupportsLocalPortConfiguration'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsWakeServer')) {
                obj['SupportsWakeServer'] = ApiClient.convertToType(data['SupportsWakeServer'], 'Boolean');
            }
            if (data.hasOwnProperty('WebSocketPortNumber')) {
                obj['WebSocketPortNumber'] = ApiClient.convertToType(data['WebSocketPortNumber'], 'Number');
            }
            if (data.hasOwnProperty('CompletedInstallations')) {
                obj['CompletedInstallations'] = ApiClient.convertToType(data['CompletedInstallations'], [UpdatesInstallationInfo]);
            }
            if (data.hasOwnProperty('CanSelfRestart')) {
                obj['CanSelfRestart'] = ApiClient.convertToType(data['CanSelfRestart'], 'Boolean');
            }
            if (data.hasOwnProperty('CanSelfUpdate')) {
                obj['CanSelfUpdate'] = ApiClient.convertToType(data['CanSelfUpdate'], 'Boolean');
            }
            if (data.hasOwnProperty('CanLaunchWebBrowser')) {
                obj['CanLaunchWebBrowser'] = ApiClient.convertToType(data['CanLaunchWebBrowser'], 'Boolean');
            }
            if (data.hasOwnProperty('ProgramDataPath')) {
                obj['ProgramDataPath'] = ApiClient.convertToType(data['ProgramDataPath'], 'String');
            }
            if (data.hasOwnProperty('ItemsByNamePath')) {
                obj['ItemsByNamePath'] = ApiClient.convertToType(data['ItemsByNamePath'], 'String');
            }
            if (data.hasOwnProperty('CachePath')) {
                obj['CachePath'] = ApiClient.convertToType(data['CachePath'], 'String');
            }
            if (data.hasOwnProperty('LogPath')) {
                obj['LogPath'] = ApiClient.convertToType(data['LogPath'], 'String');
            }
            if (data.hasOwnProperty('InternalMetadataPath')) {
                obj['InternalMetadataPath'] = ApiClient.convertToType(data['InternalMetadataPath'], 'String');
            }
            if (data.hasOwnProperty('TranscodingTempPath')) {
                obj['TranscodingTempPath'] = ApiClient.convertToType(data['TranscodingTempPath'], 'String');
            }
            if (data.hasOwnProperty('HttpServerPortNumber')) {
                obj['HttpServerPortNumber'] = ApiClient.convertToType(data['HttpServerPortNumber'], 'Number');
            }
            if (data.hasOwnProperty('SupportsHttps')) {
                obj['SupportsHttps'] = ApiClient.convertToType(data['SupportsHttps'], 'Boolean');
            }
            if (data.hasOwnProperty('HttpsPortNumber')) {
                obj['HttpsPortNumber'] = ApiClient.convertToType(data['HttpsPortNumber'], 'Number');
            }
            if (data.hasOwnProperty('HasUpdateAvailable')) {
                obj['HasUpdateAvailable'] = ApiClient.convertToType(data['HasUpdateAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsAutoRunAtStartup')) {
                obj['SupportsAutoRunAtStartup'] = ApiClient.convertToType(data['SupportsAutoRunAtStartup'], 'Boolean');
            }
            if (data.hasOwnProperty('HardwareAccelerationRequiresPremiere')) {
                obj['HardwareAccelerationRequiresPremiere'] = ApiClient.convertToType(data['HardwareAccelerationRequiresPremiere'], 'Boolean');
            }
            if (data.hasOwnProperty('LocalAddress')) {
                obj['LocalAddress'] = ApiClient.convertToType(data['LocalAddress'], 'String');
            }
            if (data.hasOwnProperty('LocalAddresses')) {
                obj['LocalAddresses'] = ApiClient.convertToType(data['LocalAddresses'], ['String']);
            }
            if (data.hasOwnProperty('WanAddress')) {
                obj['WanAddress'] = ApiClient.convertToType(data['WanAddress'], 'String');
            }
            if (data.hasOwnProperty('RemoteAddresses')) {
                obj['RemoteAddresses'] = ApiClient.convertToType(data['RemoteAddresses'], ['String']);
            }
            if (data.hasOwnProperty('ServerName')) {
                obj['ServerName'] = ApiClient.convertToType(data['ServerName'], 'String');
            }
            if (data.hasOwnProperty('Version')) {
                obj['Version'] = ApiClient.convertToType(data['Version'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/UpdatesPackageVersionClass} SystemUpdateLevel
    */
    'SystemUpdateLevel' = undefined;
    /**
    * @member {String} OperatingSystemDisplayName
    */
    'OperatingSystemDisplayName' = undefined;
    /**
    * @member {String} PackageName
    */
    'PackageName' = undefined;
    /**
    * @member {Boolean} HasPendingRestart
    */
    'HasPendingRestart' = undefined;
    /**
    * @member {Boolean} IsShuttingDown
    */
    'IsShuttingDown' = undefined;
    /**
    * @member {String} OperatingSystem
    */
    'OperatingSystem' = undefined;
    /**
    * @member {Boolean} SupportsLibraryMonitor
    */
    'SupportsLibraryMonitor' = undefined;
    /**
    * @member {Boolean} SupportsLocalPortConfiguration
    */
    'SupportsLocalPortConfiguration' = undefined;
    /**
    * @member {Boolean} SupportsWakeServer
    */
    'SupportsWakeServer' = undefined;
    /**
    * @member {Number} WebSocketPortNumber
    */
    'WebSocketPortNumber' = undefined;
    /**
    * @member {Array.<module:model/UpdatesInstallationInfo>} CompletedInstallations
    */
    'CompletedInstallations' = undefined;
    /**
    * @member {Boolean} CanSelfRestart
    */
    'CanSelfRestart' = undefined;
    /**
    * @member {Boolean} CanSelfUpdate
    */
    'CanSelfUpdate' = undefined;
    /**
    * @member {Boolean} CanLaunchWebBrowser
    */
    'CanLaunchWebBrowser' = undefined;
    /**
    * @member {String} ProgramDataPath
    */
    'ProgramDataPath' = undefined;
    /**
    * @member {String} ItemsByNamePath
    */
    'ItemsByNamePath' = undefined;
    /**
    * @member {String} CachePath
    */
    'CachePath' = undefined;
    /**
    * @member {String} LogPath
    */
    'LogPath' = undefined;
    /**
    * @member {String} InternalMetadataPath
    */
    'InternalMetadataPath' = undefined;
    /**
    * @member {String} TranscodingTempPath
    */
    'TranscodingTempPath' = undefined;
    /**
    * @member {Number} HttpServerPortNumber
    */
    'HttpServerPortNumber' = undefined;
    /**
    * @member {Boolean} SupportsHttps
    */
    'SupportsHttps' = undefined;
    /**
    * @member {Number} HttpsPortNumber
    */
    'HttpsPortNumber' = undefined;
    /**
    * @member {Boolean} HasUpdateAvailable
    */
    'HasUpdateAvailable' = undefined;
    /**
    * @member {Boolean} SupportsAutoRunAtStartup
    */
    'SupportsAutoRunAtStartup' = undefined;
    /**
    * @member {Boolean} HardwareAccelerationRequiresPremiere
    */
    'HardwareAccelerationRequiresPremiere' = undefined;
    /**
    * @member {String} LocalAddress
    */
    'LocalAddress' = undefined;
    /**
    * @member {Array.<String>} LocalAddresses
    */
    'LocalAddresses' = undefined;
    /**
    * @member {String} WanAddress
    */
    'WanAddress' = undefined;
    /**
    * @member {Array.<String>} RemoteAddresses
    */
    'RemoteAddresses' = undefined;
    /**
    * @member {String} ServerName
    */
    'ServerName' = undefined;
    /**
    * @member {String} Version
    */
    'Version' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;




}
