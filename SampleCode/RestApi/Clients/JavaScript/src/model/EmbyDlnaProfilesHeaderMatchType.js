/**
 * Emby REST API
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
* Enum class EmbyDlnaProfilesHeaderMatchType.
* @enum {}
* @readonly
*/
export default class EmbyDlnaProfilesHeaderMatchType {
        /**
         * value: "Equals"
         * @const
         */
        equals = "Equals";

        /**
         * value: "Regex"
         * @const
         */
        regex = "Regex";

        /**
         * value: "Substring"
         * @const
         */
        substring = "Substring";


    /**
    * Returns a <code>EmbyDlnaProfilesHeaderMatchType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyDlnaProfilesHeaderMatchType} The enum <code>EmbyDlnaProfilesHeaderMatchType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
