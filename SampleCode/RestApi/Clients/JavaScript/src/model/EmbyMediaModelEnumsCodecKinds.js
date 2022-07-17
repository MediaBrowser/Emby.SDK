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
* Enum class EmbyMediaModelEnumsCodecKinds.
* @enum {}
* @readonly
*/
export default class EmbyMediaModelEnumsCodecKinds {
        /**
         * value: "Audio"
         * @const
         */
        audio = "Audio";

        /**
         * value: "Video"
         * @const
         */
        video = "Video";

        /**
         * value: "SubTitles"
         * @const
         */
        subTitles = "SubTitles";


    /**
    * Returns a <code>EmbyMediaModelEnumsCodecKinds</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyMediaModelEnumsCodecKinds} The enum <code>EmbyMediaModelEnumsCodecKinds</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
