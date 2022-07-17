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
import NotificationsNotificationLevel from './NotificationsNotificationLevel';

/**
* The EmbyNotificationsApiNotificationsSummary model module.
* @module model/EmbyNotificationsApiNotificationsSummary
* @version 4.8.0.6
*/
export default class EmbyNotificationsApiNotificationsSummary {
    /**
    * Constructs a new <code>EmbyNotificationsApiNotificationsSummary</code>.
    * @alias module:model/EmbyNotificationsApiNotificationsSummary
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyNotificationsApiNotificationsSummary</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyNotificationsApiNotificationsSummary} obj Optional instance to populate.
    * @return {module:model/EmbyNotificationsApiNotificationsSummary} The populated <code>EmbyNotificationsApiNotificationsSummary</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyNotificationsApiNotificationsSummary();
                        
            
            if (data.hasOwnProperty('UnreadCount')) {
                obj['UnreadCount'] = ApiClient.convertToType(data['UnreadCount'], 'Number');
            }
            if (data.hasOwnProperty('MaxUnreadNotificationLevel')) {
                obj['MaxUnreadNotificationLevel'] = NotificationsNotificationLevel.constructFromObject(data['MaxUnreadNotificationLevel']);
            }
        }
        return obj;
    }

    /**
    * @member {Number} UnreadCount
    */
    'UnreadCount' = undefined;
    /**
    * @member {module:model/NotificationsNotificationLevel} MaxUnreadNotificationLevel
    */
    'MaxUnreadNotificationLevel' = undefined;




}
