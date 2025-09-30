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
* Enum class PackageTargetSystem.
* @enum {}
* @readonly
*/
export default class PackageTargetSystem {
        /**
         * value: "Server"
         * @const
         */
        Server = "Server";

        /**
         * value: "MBTheater"
         * @const
         */
        MBTheater = "MBTheater";

        /**
         * value: "MBClassic"
         * @const
         */
        MBClassic = "MBClassic";

        /**
         * value: "Other"
         * @const
         */
        Other = "Other";


    /**
    * Returns a <code>PackageTargetSystem</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PackageTargetSystem} The enum <code>PackageTargetSystem</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
