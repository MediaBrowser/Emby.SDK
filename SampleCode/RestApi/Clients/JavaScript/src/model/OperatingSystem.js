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
* Enum class OperatingSystem.
* @enum {}
* @readonly
*/
export default class OperatingSystem {
        /**
         * value: "Windows"
         * @const
         */
        windows = "Windows";

        /**
         * value: "Linux"
         * @const
         */
        linux = "Linux";

        /**
         * value: "OSX"
         * @const
         */
        OSX = "OSX";

        /**
         * value: "BSD"
         * @const
         */
        BSD = "BSD";

        /**
         * value: "Android"
         * @const
         */
        android = "Android";


    /**
    * Returns a <code>OperatingSystem</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/OperatingSystem} The enum <code>OperatingSystem</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
