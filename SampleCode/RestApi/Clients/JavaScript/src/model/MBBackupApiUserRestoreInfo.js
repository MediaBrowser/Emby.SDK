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
* The MBBackupApiUserRestoreInfo model module.
* @module model/MBBackupApiUserRestoreInfo
* @version 4.8.10.0
*/
export default class MBBackupApiUserRestoreInfo {
    /**
    * Constructs a new <code>MBBackupApiUserRestoreInfo</code>.
    * @alias module:model/MBBackupApiUserRestoreInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MBBackupApiUserRestoreInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MBBackupApiUserRestoreInfo} obj Optional instance to populate.
    * @return {module:model/MBBackupApiUserRestoreInfo} The populated <code>MBBackupApiUserRestoreInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MBBackupApiUserRestoreInfo();
                        
            
            if (data.hasOwnProperty('SourceUserId')) {
                obj['SourceUserId'] = ApiClient.convertToType(data['SourceUserId'], 'String');
            }
            if (data.hasOwnProperty('TargetUserId')) {
                obj['TargetUserId'] = ApiClient.convertToType(data['TargetUserId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} SourceUserId
    */
    'SourceUserId' = undefined;
    /**
    * @member {String} TargetUserId
    */
    'TargetUserId' = undefined;




}
