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
* Enum class EmbyDlnaProfilesDeviceProfileType.
* @enum {}
* @readonly
*/
export default class EmbyDlnaProfilesDeviceProfileType {
        /**
         * value: "System"
         * @const
         */
        system = "System";

        /**
         * value: "User"
         * @const
         */
        user = "User";


    /**
    * Returns a <code>EmbyDlnaProfilesDeviceProfileType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyDlnaProfilesDeviceProfileType} The enum <code>EmbyDlnaProfilesDeviceProfileType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
