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
* Enum class DlnaProfilesHeaderMatchType.
* @enum {}
* @readonly
*/
export default class DlnaProfilesHeaderMatchType {
        /**
         * value: "Equals"
         * @const
         */
        Equals = "Equals";

        /**
         * value: "Regex"
         * @const
         */
        Regex = "Regex";

        /**
         * value: "Substring"
         * @const
         */
        Substring = "Substring";


    /**
    * Returns a <code>DlnaProfilesHeaderMatchType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaProfilesHeaderMatchType} The enum <code>DlnaProfilesHeaderMatchType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
