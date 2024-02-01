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
* Enum class LocationType.
* @enum {}
* @readonly
*/
export default class LocationType {
        /**
         * value: "FileSystem"
         * @const
         */
        fileSystem = "FileSystem";

        /**
         * value: "Virtual"
         * @const
         */
        virtual = "Virtual";


    /**
    * Returns a <code>LocationType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LocationType} The enum <code>LocationType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
