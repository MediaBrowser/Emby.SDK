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
* Enum class UserItemShareLevel.
* @enum {}
* @readonly
*/
export default class UserItemShareLevel {
        /**
         * value: "None"
         * @const
         */
        None = "None";

        /**
         * value: "Read"
         * @const
         */
        Read = "Read";

        /**
         * value: "Write"
         * @const
         */
        Write = "Write";

        /**
         * value: "Manage"
         * @const
         */
        Manage = "Manage";

        /**
         * value: "ManageDelete"
         * @const
         */
        ManageDelete = "ManageDelete";


    /**
    * Returns a <code>UserItemShareLevel</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UserItemShareLevel} The enum <code>UserItemShareLevel</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
