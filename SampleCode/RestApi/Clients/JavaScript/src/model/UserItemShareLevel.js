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
* Enum class UserItemShareLevel.
* @enum {}
* @readonly
*/
export default class UserItemShareLevel {
        /**
         * value: "None"
         * @const
         */
        none = "None";

        /**
         * value: "Read"
         * @const
         */
        read = "Read";

        /**
         * value: "Write"
         * @const
         */
        write = "Write";

        /**
         * value: "Manage"
         * @const
         */
        manage = "Manage";

        /**
         * value: "ManageDelete"
         * @const
         */
        manageDelete = "ManageDelete";


    /**
    * Returns a <code>UserItemShareLevel</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UserItemShareLevel} The enum <code>UserItemShareLevel</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
