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
import LibraryUserCopyOptions from './LibraryUserCopyOptions';

/**
* The CopyData model module.
* @module model/CopyData
* @version 4.10.0.4
*/
export default class CopyData {
    /**
    * Constructs a new <code>CopyData</code>.
    * @alias module:model/CopyData
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CopyData</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CopyData} obj Optional instance to populate.
    * @return {module:model/CopyData} The populated <code>CopyData</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CopyData();
                        
            
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('ToUserIds')) {
                obj['ToUserIds'] = ApiClient.convertToType(data['ToUserIds'], ['String']);
            }
            if (data.hasOwnProperty('CopyOptions')) {
                obj['CopyOptions'] = ApiClient.convertToType(data['CopyOptions'], [LibraryUserCopyOptions]);
            }
        }
        return obj;
    }

    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Array.<String>} ToUserIds
    */
    'ToUserIds' = undefined;
    /**
    * @member {Array.<module:model/LibraryUserCopyOptions>} CopyOptions
    */
    'CopyOptions' = undefined;




}
