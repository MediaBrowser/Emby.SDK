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
import EmbyNotificationsApiNotification from './EmbyNotificationsApiNotification';

/**
* The EmbyNotificationsApiNotificationResult model module.
* @module model/EmbyNotificationsApiNotificationResult
* @version 4.8.0.10
*/
export default class EmbyNotificationsApiNotificationResult {
    /**
    * Constructs a new <code>EmbyNotificationsApiNotificationResult</code>.
    * @alias module:model/EmbyNotificationsApiNotificationResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyNotificationsApiNotificationResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyNotificationsApiNotificationResult} obj Optional instance to populate.
    * @return {module:model/EmbyNotificationsApiNotificationResult} The populated <code>EmbyNotificationsApiNotificationResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyNotificationsApiNotificationResult();
                        
            
            if (data.hasOwnProperty('Notifications')) {
                obj['Notifications'] = ApiClient.convertToType(data['Notifications'], [EmbyNotificationsApiNotification]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/EmbyNotificationsApiNotification>} Notifications
    */
    'Notifications' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
