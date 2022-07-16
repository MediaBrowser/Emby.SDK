/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class UpdatesPackageVersionClass.
* @enum {}
* @readonly
*/
export default class UpdatesPackageVersionClass {
        /**
         * value: "Release"
         * @const
         */
        release = "Release";

        /**
         * value: "Beta"
         * @const
         */
        beta = "Beta";

        /**
         * value: "Dev"
         * @const
         */
        dev = "Dev";


    /**
    * Returns a <code>UpdatesPackageVersionClass</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UpdatesPackageVersionClass} The enum <code>UpdatesPackageVersionClass</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
