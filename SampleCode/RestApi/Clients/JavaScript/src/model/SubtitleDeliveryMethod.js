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
* Enum class SubtitleDeliveryMethod.
* @enum {}
* @readonly
*/
export default class SubtitleDeliveryMethod {
        /**
         * value: "Encode"
         * @const
         */
        encode = "Encode";

        /**
         * value: "Embed"
         * @const
         */
        embed = "Embed";

        /**
         * value: "External"
         * @const
         */
        external = "External";

        /**
         * value: "Hls"
         * @const
         */
        hls = "Hls";

        /**
         * value: "VideoSideData"
         * @const
         */
        videoSideData = "VideoSideData";


    /**
    * Returns a <code>SubtitleDeliveryMethod</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SubtitleDeliveryMethod} The enum <code>SubtitleDeliveryMethod</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
