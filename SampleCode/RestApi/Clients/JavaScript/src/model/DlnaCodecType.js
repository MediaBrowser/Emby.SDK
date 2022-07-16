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
* Enum class DlnaCodecType.
* @enum {}
* @readonly
*/
export default class DlnaCodecType {
        /**
         * value: "Video"
         * @const
         */
        video = "Video";

        /**
         * value: "VideoAudio"
         * @const
         */
        videoAudio = "VideoAudio";

        /**
         * value: "Audio"
         * @const
         */
        audio = "Audio";


    /**
    * Returns a <code>DlnaCodecType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaCodecType} The enum <code>DlnaCodecType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
