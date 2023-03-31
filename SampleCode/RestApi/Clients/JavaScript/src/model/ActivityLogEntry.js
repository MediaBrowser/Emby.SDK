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
import LoggingLogSeverity from './LoggingLogSeverity';

/**
* The ActivityLogEntry model module.
* @module model/ActivityLogEntry
* @version 4.8.0.28
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
    * @member {Number} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * @member {String} ShortOverview
    */
    'ShortOverview' = undefined;
    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {Date} Date
    */
    'Date' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {String} UserPrimaryImageTag
    */
    'UserPrimaryImageTag' = undefined;
    /**
    * @member {module:model/LoggingLogSeverity} Severity
    */
    'Severity' = undefined;




}
