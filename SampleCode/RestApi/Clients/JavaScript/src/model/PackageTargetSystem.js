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
* Enum class PackageTargetSystem.
* @enum {}
* @readonly
*/
export default class PackageTargetSystem {
        /**
         * value: "Server"
         * @const
         */
        server = "Server";

        /**
         * value: "MBTheater"
         * @const
         */
        mBTheater = "MBTheater";

        /**
         * value: "MBClassic"
         * @const
         */
        mBClassic = "MBClassic";

        /**
         * value: "Other"
         * @const
         */
        other = "Other";


    /**
    * Returns a <code>PackageTargetSystem</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PackageTargetSystem} The enum <code>PackageTargetSystem</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
