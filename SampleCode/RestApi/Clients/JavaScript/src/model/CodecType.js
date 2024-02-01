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
* Enum class CodecType.
* @enum {}
* @readonly
*/
export default class CodecType {
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
    * Returns a <code>CodecType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/CodecType} The enum <code>CodecType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
