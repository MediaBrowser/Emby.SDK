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
* Enum class DlnaSubtitleDeliveryMethod.
* @enum {}
* @readonly
*/
export default class DlnaSubtitleDeliveryMethod {
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
    * Returns a <code>DlnaSubtitleDeliveryMethod</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaSubtitleDeliveryMethod} The enum <code>DlnaSubtitleDeliveryMethod</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
