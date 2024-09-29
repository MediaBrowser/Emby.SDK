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
import NameIdPair from './NameIdPair';

/**
* The MBBackupBackupInfo model module.
* @module model/MBBackupBackupInfo
* @version 4.8.10.0
*/
export default class MBBackupBackupInfo {
    /**
    * Constructs a new <code>MBBackupBackupInfo</code>.
    * @alias module:model/MBBackupBackupInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MBBackupBackupInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MBBackupBackupInfo} obj Optional instance to populate.
    * @return {module:model/MBBackupBackupInfo} The populated <code>MBBackupBackupInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MBBackupBackupInfo();
                        
            
            if (data.hasOwnProperty('ServerVersion')) {
                obj['ServerVersion'] = ApiClient.convertToType(data['ServerVersion'], 'String');
            }
            if (data.hasOwnProperty('PluginVersion')) {
                obj['PluginVersion'] = ApiClient.convertToType(data['PluginVersion'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('CanRestore')) {
                obj['CanRestore'] = ApiClient.convertToType(data['CanRestore'], 'Boolean');
            }
            if (data.hasOwnProperty('IsFullBackup')) {
                obj['IsFullBackup'] = ApiClient.convertToType(data['IsFullBackup'], 'Boolean');
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('Users')) {
                obj['Users'] = ApiClient.convertToType(data['Users'], [NameIdPair]);
            }
        }
        return obj;
    }

    /**
    * @member {String} ServerVersion
    */
    'ServerVersion' = undefined;
    /**
    * @member {String} PluginVersion
    */
    'PluginVersion' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {Boolean} CanRestore
    */
    'CanRestore' = undefined;
    /**
    * @member {Boolean} IsFullBackup
    */
    'IsFullBackup' = undefined;
    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {Array.<module:model/NameIdPair>} Users
    */
    'Users' = undefined;




}
