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
import LoggingLogSeverity from './LoggingLogSeverity';

/**
* The ActivityLogEntry model module.
* @module model/ActivityLogEntry
* @version 4.8.10.0
*/
export default class ActivityLogEntry {
    /**
    * Constructs a new <code>ActivityLogEntry</code>.
    * @alias module:model/ActivityLogEntry
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ActivityLogEntry</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ActivityLogEntry} obj Optional instance to populate.
    * @return {module:model/ActivityLogEntry} The populated <code>ActivityLogEntry</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ActivityLogEntry();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Overview')) {
                obj['Overview'] = ApiClient.convertToType(data['Overview'], 'String');
            }
            if (data.hasOwnProperty('ShortOverview')) {
                obj['ShortOverview'] = ApiClient.convertToType(data['ShortOverview'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('Date')) {
                obj['Date'] = ApiClient.convertToType(data['Date'], 'Date');
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('UserPrimaryImageTag')) {
                obj['UserPrimaryImageTag'] = ApiClient.convertToType(data['UserPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('Severity')) {
                obj['Severity'] = LoggingLogSeverity.constructFromObject(data['Severity']);
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
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The overview.
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * The short overview.
    * @member {String} ShortOverview
    */
    'ShortOverview' = undefined;
    /**
    * The type.
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * The item identifier.
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * The date.
    * @member {Date} Date
    */
    'Date' = undefined;
    /**
    * The user identifier.
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * The user primary image tag.
    * @member {String} UserPrimaryImageTag
    */
    'UserPrimaryImageTag' = undefined;
    /**
    * @member {module:model/LoggingLogSeverity} Severity
    */
    'Severity' = undefined;




}
