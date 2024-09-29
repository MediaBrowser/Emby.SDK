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
import BaseItemDto from './BaseItemDto';
import ItemFileInfo from './ItemFileInfo';

/**
* The SyncedItem model module.
* @module model/SyncedItem
* @version 4.8.10.0
*/
export default class SyncedItem {
    /**
    * Constructs a new <code>SyncedItem</code>.
    * @alias module:model/SyncedItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncedItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncedItem} obj Optional instance to populate.
    * @return {module:model/SyncedItem} The populated <code>SyncedItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncedItem();
                        
            
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('SyncJobId')) {
                obj['SyncJobId'] = ApiClient.convertToType(data['SyncJobId'], 'Number');
            }
            if (data.hasOwnProperty('SyncJobName')) {
                obj['SyncJobName'] = ApiClient.convertToType(data['SyncJobName'], 'String');
            }
            if (data.hasOwnProperty('SyncJobDateCreated')) {
                obj['SyncJobDateCreated'] = ApiClient.convertToType(data['SyncJobDateCreated'], 'Date');
            }
            if (data.hasOwnProperty('SyncJobItemId')) {
                obj['SyncJobItemId'] = ApiClient.convertToType(data['SyncJobItemId'], 'Number');
            }
            if (data.hasOwnProperty('OriginalFileName')) {
                obj['OriginalFileName'] = ApiClient.convertToType(data['OriginalFileName'], 'String');
            }
            if (data.hasOwnProperty('Item')) {
                obj['Item'] = BaseItemDto.constructFromObject(data['Item']);
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('AdditionalFiles')) {
                obj['AdditionalFiles'] = ApiClient.convertToType(data['AdditionalFiles'], [ItemFileInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * @member {Number} SyncJobId
    */
    'SyncJobId' = undefined;
    /**
    * @member {String} SyncJobName
    */
    'SyncJobName' = undefined;
    /**
    * @member {Date} SyncJobDateCreated
    */
    'SyncJobDateCreated' = undefined;
    /**
    * @member {Number} SyncJobItemId
    */
    'SyncJobItemId' = undefined;
    /**
    * @member {String} OriginalFileName
    */
    'OriginalFileName' = undefined;
    /**
    * @member {module:model/BaseItemDto} Item
    */
    'Item' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Array.<module:model/ItemFileInfo>} AdditionalFiles
    */
    'AdditionalFiles' = undefined;




}
