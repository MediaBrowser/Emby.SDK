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
import MBBackupApiUserRestoreInfo from './MBBackupApiUserRestoreInfo';

/**
* The MBBackupApiDataRestoreOptions model module.
* @module model/MBBackupApiDataRestoreOptions
* @version 4.8.10.0
*/
export default class MBBackupApiDataRestoreOptions {
    /**
    * Constructs a new <code>MBBackupApiDataRestoreOptions</code>.
    * @alias module:model/MBBackupApiDataRestoreOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MBBackupApiDataRestoreOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MBBackupApiDataRestoreOptions} obj Optional instance to populate.
    * @return {module:model/MBBackupApiDataRestoreOptions} The populated <code>MBBackupApiDataRestoreOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MBBackupApiDataRestoreOptions();
                        
            
            if (data.hasOwnProperty('Users')) {
                obj['Users'] = ApiClient.convertToType(data['Users'], [MBBackupApiUserRestoreInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/MBBackupApiUserRestoreInfo>} Users
    */
    'Users' = undefined;




}
