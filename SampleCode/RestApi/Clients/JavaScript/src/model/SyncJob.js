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
import SyncCategory from './SyncCategory';
import SyncJobStatus from './SyncJobStatus';

/**
* The SyncJob model module.
* @module model/SyncJob
* @version 4.8.10.0
*/
export default class SyncJob {
    /**
    * Constructs a new <code>SyncJob</code>.
    * @alias module:model/SyncJob
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncJob</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncJob} obj Optional instance to populate.
    * @return {module:model/SyncJob} The populated <code>SyncJob</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncJob();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('TargetId')) {
                obj['TargetId'] = ApiClient.convertToType(data['TargetId'], 'String');
            }
            if (data.hasOwnProperty('InternalTargetId')) {
                obj['InternalTargetId'] = ApiClient.convertToType(data['InternalTargetId'], 'Number');
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
                obj['Category'] = SyncCategory.constructFromObject(data['Category']);
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
                obj['Status'] = SyncJobStatus.constructFromObject(data['Status']);
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
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'Number');
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
    * The identifier.
    * @member {Number} Id
    */
    'Id' = undefined;
    /**
    * The device identifier.
    * @member {String} TargetId
    */
    'TargetId' = undefined;
    /**
    * @member {Number} InternalTargetId
    */
    'InternalTargetId' = undefined;
    /**
    * The name of the target.
    * @member {String} TargetName
    */
    'TargetName' = undefined;
    /**
    * The quality.
    * @member {String} Quality
    */
    'Quality' = undefined;
    /**
    * The bitrate.
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
    * The profile.
    * @member {String} Profile
    */
    'Profile' = undefined;
    /**
    * @member {module:model/SyncCategory} Category
    */
    'Category' = undefined;
    /**
    * The parent identifier.
    * @member {Number} ParentId
    */
    'ParentId' = undefined;
    /**
    * The current progress.
    * @member {Number} Progress
    */
    'Progress' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {module:model/SyncJobStatus} Status
    */
    'Status' = undefined;
    /**
    * The user identifier.
    * @member {Number} UserId
    */
    'UserId' = undefined;
    /**
    * A value indicating whether \\[unwatched only\\].
    * @member {Boolean} UnwatchedOnly
    */
    'UnwatchedOnly' = undefined;
    /**
    * A value indicating whether \\[synchronize new content\\].
    * @member {Boolean} SyncNewContent
    */
    'SyncNewContent' = undefined;
    /**
    * The item limit.
    * @member {Number} ItemLimit
    */
    'ItemLimit' = undefined;
    /**
    * The requested item ids.
    * @member {Array.<Number>} RequestedItemIds
    */
    'RequestedItemIds' = undefined;
    /**
    * @member {Number} ItemId
    */
    'ItemId' = undefined;
    /**
    * The date created.
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * The date last modified.
    * @member {Date} DateLastModified
    */
    'DateLastModified' = undefined;
    /**
    * The item count.
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
