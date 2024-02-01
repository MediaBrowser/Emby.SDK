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
* Enum class DlnaProfileType.
* @enum {}
* @readonly
*/
export default class DlnaProfileType {
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
    * Returns a <code>DlnaProfileType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaProfileType} The enum <code>DlnaProfileType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
