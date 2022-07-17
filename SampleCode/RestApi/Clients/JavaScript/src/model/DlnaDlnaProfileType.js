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
* Enum class DlnaDlnaProfileType.
* @enum {}
* @readonly
*/
export default class DlnaDlnaProfileType {
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
         * value: "Photo"
         * @const
         */
        photo = "Photo";


    /**
    * Returns a <code>DlnaDlnaProfileType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaDlnaProfileType} The enum <code>DlnaDlnaProfileType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
