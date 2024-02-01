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
        name = "Name";

        /**
         * value: "Quality"
         * @const
         */
        quality = "Quality";

        /**
         * value: "UnwatchedOnly"
         * @const
         */
        unwatchedOnly = "UnwatchedOnly";

        /**
         * value: "SyncNewContent"
         * @const
         */
        syncNewContent = "SyncNewContent";

        /**
         * value: "ItemLimit"
         * @const
         */
        itemLimit = "ItemLimit";

        /**
         * value: "Profile"
         * @const
         */
        profile = "Profile";


    /**
    * Returns a <code>SyncJobOption</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncJobOption} The enum <code>SyncJobOption</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
