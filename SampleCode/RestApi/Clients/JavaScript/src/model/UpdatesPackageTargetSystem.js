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
* Enum class UpdatesPackageTargetSystem.
* @enum {}
* @readonly
*/
export default class UpdatesPackageTargetSystem {
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
    * Returns a <code>UpdatesPackageTargetSystem</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UpdatesPackageTargetSystem} The enum <code>UpdatesPackageTargetSystem</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
