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
import MediaSourceInfo from './MediaSourceInfo';
import SyncModelItemFileInfo from './SyncModelItemFileInfo';
import SyncModelSyncJobItemStatus from './SyncModelSyncJobItemStatus';

/**
* The SyncModelSyncJobItem model module.
* @module model/SyncModelSyncJobItem
* @version 4.8.0.43
*/
export default class SyncModelSyncJobItem {
    /**
    * Constructs a new <code>SyncModelSyncJobItem</code>.
    * @alias module:model/SyncModelSyncJobItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncJobItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncJobItem} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncJobItem} The populated <code>SyncModelSyncJobItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncJobItem();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('JobId')) {
                obj['JobId'] = ApiClient.convertToType(data['JobId'], 'Number');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'Number');
            }
            if (data.hasOwnProperty('ItemName')) {
                obj['ItemName'] = ApiClient.convertToType(data['ItemName'], 'String');
            }
            if (data.hasOwnProperty('MediaSourceId')) {
                obj['MediaSourceId'] = ApiClient.convertToType(data['MediaSourceId'], 'String');
            }
            if (data.hasOwnProperty('MediaSource')) {
                obj['MediaSource'] = MediaSourceInfo.constructFromObject(data['MediaSource']);
            }
            if (data.hasOwnProperty('TargetId')) {
                obj['TargetId'] = ApiClient.convertToType(data['TargetId'], 'String');
            }
            if (data.hasOwnProperty('OutputPath')) {
                obj['OutputPath'] = ApiClient.convertToType(data['OutputPath'], 'String');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = SyncModelSyncJobItemStatus.constructFromObject(data['Status']);
            }
            if (data.hasOwnProperty('Progress')) {
                obj['Progress'] = ApiClient.convertToType(data['Progress'], 'Number');
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('PrimaryImageItemId')) {
                obj['PrimaryImageItemId'] = ApiClient.convertToType(data['PrimaryImageItemId'], 'String');
            }
            if (data.hasOwnProperty('PrimaryImageTag')) {
                obj['PrimaryImageTag'] = ApiClient.convertToType(data['PrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('TemporaryPath')) {
                obj['TemporaryPath'] = ApiClient.convertToType(data['TemporaryPath'], 'String');
            }
            if (data.hasOwnProperty('AdditionalFiles')) {
                obj['AdditionalFiles'] = ApiClient.convertToType(data['AdditionalFiles'], [SyncModelItemFileInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {Number} Id
    */
    'Id' = undefined;
    /**
    * @member {Number} JobId
    */
    'JobId' = undefined;
    /**
    * @member {Number} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {String} ItemName
    */
    'ItemName' = undefined;
    /**
    * @member {String} MediaSourceId
    */
    'MediaSourceId' = undefined;
    /**
    * @member {module:model/MediaSourceInfo} MediaSource
    */
    'MediaSource' = undefined;
    /**
    * @member {String} TargetId
    */
    'TargetId' = undefined;
    /**
    * @member {String} OutputPath
    */
    'OutputPath' = undefined;
    /**
    * @member {module:model/SyncModelSyncJobItemStatus} Status
    */
    'Status' = undefined;
    /**
    * @member {Number} Progress
    */
    'Progress' = undefined;
    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {String} PrimaryImageItemId
    */
    'PrimaryImageItemId' = undefined;
    /**
    * @member {String} PrimaryImageTag
    */
    'PrimaryImageTag' = undefined;
    /**
    * @member {String} TemporaryPath
    */
    'TemporaryPath' = undefined;
    /**
    * @member {Array.<module:model/SyncModelItemFileInfo>} AdditionalFiles
    */
    'AdditionalFiles' = undefined;




}
