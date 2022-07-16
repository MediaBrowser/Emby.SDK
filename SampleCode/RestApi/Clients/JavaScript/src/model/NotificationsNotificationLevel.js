/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class NotificationsNotificationLevel.
* @enum {}
* @readonly
*/
export default class NotificationsNotificationLevel {
        /**
         * value: "Normal"
         * @const
         */
        normal = "Normal";

        /**
         * value: "Warning"
         * @const
         */
        warning = "Warning";

        /**
         * value: "Error"
         * @const
         */
        error = "Error";


    /**
    * Returns a <code>NotificationsNotificationLevel</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/NotificationsNotificationLevel} The enum <code>NotificationsNotificationLevel</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
