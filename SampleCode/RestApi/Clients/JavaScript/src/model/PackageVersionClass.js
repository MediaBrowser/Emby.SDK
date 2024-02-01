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
* Enum class PackageVersionClass.
* @enum {}
* @readonly
*/
export default class PackageVersionClass {
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
    * Returns a <code>PackageVersionClass</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PackageVersionClass} The enum <code>PackageVersionClass</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
