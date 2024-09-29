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
import MBBackupBackupInfo from './MBBackupBackupInfo';

/**
* The MBBackupApiAllBackupsInfo model module.
* @module model/MBBackupApiAllBackupsInfo
* @version 4.8.10.0
*/
export default class MBBackupApiAllBackupsInfo {
    /**
    * Constructs a new <code>MBBackupApiAllBackupsInfo</code>.
    * @alias module:model/MBBackupApiAllBackupsInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MBBackupApiAllBackupsInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MBBackupApiAllBackupsInfo} obj Optional instance to populate.
    * @return {module:model/MBBackupApiAllBackupsInfo} The populated <code>MBBackupApiAllBackupsInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MBBackupApiAllBackupsInfo();
                        
            
            if (data.hasOwnProperty('FullBackupInfo')) {
                obj['FullBackupInfo'] = MBBackupBackupInfo.constructFromObject(data['FullBackupInfo']);
            }
            if (data.hasOwnProperty('LightBackups')) {
                obj['LightBackups'] = ApiClient.convertToType(data['LightBackups'], [MBBackupBackupInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/MBBackupBackupInfo} FullBackupInfo
    */
    'FullBackupInfo' = undefined;
    /**
    * @member {Array.<module:model/MBBackupBackupInfo>} LightBackups
    */
    'LightBackups' = undefined;




}
