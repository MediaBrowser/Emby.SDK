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
* Enum class MediaStreamType.
* @enum {}
* @readonly
*/
export default class MediaStreamType {
        /**
         * value: "Unknown"
         * @const
         */
        Unknown = "Unknown";

        /**
         * value: "Audio"
         * @const
         */
        Audio = "Audio";

        /**
         * value: "Video"
         * @const
         */
        Video = "Video";

        /**
         * value: "Subtitle"
         * @const
         */
        Subtitle = "Subtitle";

        /**
         * value: "EmbeddedImage"
         * @const
         */
        EmbeddedImage = "EmbeddedImage";

        /**
         * value: "Attachment"
         * @const
         */
        Attachment = "Attachment";

        /**
         * value: "Data"
         * @const
         */
        Data = "Data";


    /**
    * Returns a <code>MediaStreamType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaStreamType} The enum <code>MediaStreamType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
