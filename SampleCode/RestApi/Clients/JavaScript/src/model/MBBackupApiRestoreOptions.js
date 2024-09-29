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

/**
* The MBBackupApiRestoreOptions model module.
* @module model/MBBackupApiRestoreOptions
* @version 4.8.10.0
*/
export default class MBBackupApiRestoreOptions {
    /**
    * Constructs a new <code>MBBackupApiRestoreOptions</code>.
    * @alias module:model/MBBackupApiRestoreOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MBBackupApiRestoreOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MBBackupApiRestoreOptions} obj Optional instance to populate.
    * @return {module:model/MBBackupApiRestoreOptions} The populated <code>MBBackupApiRestoreOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MBBackupApiRestoreOptions();
                        
            
            if (data.hasOwnProperty('RestoreServerId')) {
                obj['RestoreServerId'] = ApiClient.convertToType(data['RestoreServerId'], 'Boolean');
            }
            if (data.hasOwnProperty('UseFiles')) {
                obj['UseFiles'] = ApiClient.convertToType(data['UseFiles'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} RestoreServerId
    */
    'RestoreServerId' = undefined;
    /**
    * @member {String} UseFiles
    */
    'UseFiles' = undefined;




}
