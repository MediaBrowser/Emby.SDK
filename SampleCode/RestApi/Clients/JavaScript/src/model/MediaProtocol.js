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
* Enum class MediaProtocol.
* @enum {}
* @readonly
*/
export default class MediaProtocol {
        /**
         * value: "File"
         * @const
         */
        File = "File";

        /**
         * value: "Http"
         * @const
         */
        Http = "Http";

        /**
         * value: "Rtmp"
         * @const
         */
        Rtmp = "Rtmp";

        /**
         * value: "Rtsp"
         * @const
         */
        Rtsp = "Rtsp";

        /**
         * value: "Udp"
         * @const
         */
        Udp = "Udp";

        /**
         * value: "Rtp"
         * @const
         */
        Rtp = "Rtp";

        /**
         * value: "Ftp"
         * @const
         */
        Ftp = "Ftp";

        /**
         * value: "Mms"
         * @const
         */
        Mms = "Mms";


    /**
    * Returns a <code>MediaProtocol</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaProtocol} The enum <code>MediaProtocol</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
