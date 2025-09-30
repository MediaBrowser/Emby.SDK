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
/**
* Enum class SyncJobOption.
* @enum {}
* @readonly
*/
export default class SyncJobOption {
        /**
         * value: "Name"
         * @const
         */
        Name = "Name";

        /**
         * value: "Quality"
         * @const
         */
        Quality = "Quality";

        /**
         * value: "UnwatchedOnly"
         * @const
         */
        UnwatchedOnly = "UnwatchedOnly";

        /**
         * value: "SyncNewContent"
         * @const
         */
        SyncNewContent = "SyncNewContent";

        /**
         * value: "ItemLimit"
         * @const
         */
        ItemLimit = "ItemLimit";

        /**
         * value: "Profile"
         * @const
         */
        Profile = "Profile";


    /**
    * Returns a <code>SyncJobOption</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncJobOption} The enum <code>SyncJobOption</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
