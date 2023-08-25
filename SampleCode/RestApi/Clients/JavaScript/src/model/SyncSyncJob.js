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
import SyncSyncCategory from './SyncSyncCategory';
import SyncSyncJobStatus from './SyncSyncJobStatus';

/**
* The SyncSyncJob model module.
* @module model/SyncSyncJob
* @version 4.8.0.43
*/
export default class SyncSyncJob {
    /**
    * Constructs a new <code>SyncSyncJob</code>.
    * @alias module:model/SyncSyncJob
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncSyncJob</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncSyncJob} obj Optional instance to populate.
    * @return {module:model/SyncSyncJob} The populated <code>SyncSyncJob</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncSyncJob();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('TargetId')) {
                obj['TargetId'] = ApiClient.convertToType(data['TargetId'], 'String');
            }
            if (data.hasOwnProperty('TargetName')) {
                obj['TargetName'] = ApiClient.convertToType(data['TargetName'], 'String');
            }
            if (data.hasOwnProperty('Quality')) {
                obj['Quality'] = ApiClient.convertToType(data['Quality'], 'String');
            }
            if (data.hasOwnProperty('Bitrate')) {
                obj['Bitrate'] = ApiClient.convertToType(data['Bitrate'], 'Number');
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('VideoCodec')) {
                obj['VideoCodec'] = ApiClient.convertToType(data['VideoCodec'], 'String');
            }
            if (data.hasOwnProperty('AudioCodec')) {
                obj['AudioCodec'] = ApiClient.convertToType(data['AudioCodec'], 'String');
            }
            if (data.hasOwnProperty('Profile')) {
                obj['Profile'] = ApiClient.convertToType(data['Profile'], 'String');
            }
            if (data.hasOwnProperty('Category')) {
                obj['Category'] = SyncSyncCategory.constructFromObject(data['Category']);
            }
            if (data.hasOwnProperty('ParentId')) {
                obj['ParentId'] = ApiClient.convertToType(data['ParentId'], 'Number');
            }
            if (data.hasOwnProperty('Progress')) {
                obj['Progress'] = ApiClient.convertToType(data['Progress'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = SyncSyncJobStatus.constructFromObject(data['Status']);
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'Number');
            }
            if (data.hasOwnProperty('UnwatchedOnly')) {
                obj['UnwatchedOnly'] = ApiClient.convertToType(data['UnwatchedOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('SyncNewContent')) {
                obj['SyncNewContent'] = ApiClient.convertToType(data['SyncNewContent'], 'Boolean');
            }
            if (data.hasOwnProperty('ItemLimit')) {
                obj['ItemLimit'] = ApiClient.convertToType(data['ItemLimit'], 'Number');
            }
            if (data.hasOwnProperty('RequestedItemIds')) {
                obj['RequestedItemIds'] = ApiClient.convertToType(data['RequestedItemIds'], ['Number']);
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('DateLastModified')) {
                obj['DateLastModified'] = ApiClient.convertToType(data['DateLastModified'], 'Date');
            }
            if (data.hasOwnProperty('ItemCount')) {
                obj['ItemCount'] = ApiClient.convertToType(data['ItemCount'], 'Number');
            }
            if (data.hasOwnProperty('ParentName')) {
                obj['ParentName'] = ApiClient.convertToType(data['ParentName'], 'String');
            }
            if (data.hasOwnProperty('PrimaryImageItemId')) {
                obj['PrimaryImageItemId'] = ApiClient.convertToType(data['PrimaryImageItemId'], 'String');
            }
            if (data.hasOwnProperty('PrimaryImageTag')) {
                obj['PrimaryImageTag'] = ApiClient.convertToType(data['PrimaryImageTag'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Id
    */
    'Id' = undefined;
    /**
    * @member {String} TargetId
    */
    'TargetId' = undefined;
    /**
    * @member {String} TargetName
    */
    'TargetName' = undefined;
    /**
    * @member {String} Quality
    */
    'Quality' = undefined;
    /**
    * @member {Number} Bitrate
    */
    'Bitrate' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {String} VideoCodec
    */
    'VideoCodec' = undefined;
    /**
    * @member {String} AudioCodec
    */
    'AudioCodec' = undefined;
    /**
    * @member {String} Profile
    */
    'Profile' = undefined;
    /**
    * @member {module:model/SyncSyncCategory} Category
    */
    'Category' = undefined;
    /**
    * @member {Number} ParentId
    */
    'ParentId' = undefined;
    /**
    * @member {Number} Progress
    */
    'Progress' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {module:model/SyncSyncJobStatus} Status
    */
    'Status' = undefined;
    /**
    * @member {Number} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Boolean} UnwatchedOnly
    */
    'UnwatchedOnly' = undefined;
    /**
    * @member {Boolean} SyncNewContent
    */
    'SyncNewContent' = undefined;
    /**
    * @member {Number} ItemLimit
    */
    'ItemLimit' = undefined;
    /**
    * @member {Array.<Number>} RequestedItemIds
    */
    'RequestedItemIds' = undefined;
    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {Date} DateLastModified
    */
    'DateLastModified' = undefined;
    /**
    * @member {Number} ItemCount
    */
    'ItemCount' = undefined;
    /**
    * @member {String} ParentName
    */
    'ParentName' = undefined;
    /**
    * @member {String} PrimaryImageItemId
    */
    'PrimaryImageItemId' = undefined;
    /**
    * @member {String} PrimaryImageTag
    */
    'PrimaryImageTag' = undefined;




}
