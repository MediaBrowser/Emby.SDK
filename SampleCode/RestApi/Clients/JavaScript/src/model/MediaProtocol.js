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
* Enum class MediaProtocol.
* @enum {}
* @readonly
*/
export default class MediaProtocol {
        /**
         * value: "File"
         * @const
         */
        file = "File";

        /**
         * value: "Http"
         * @const
         */
        http = "Http";

        /**
         * value: "Rtmp"
         * @const
         */
        rtmp = "Rtmp";

        /**
         * value: "Rtsp"
         * @const
         */
        rtsp = "Rtsp";

        /**
         * value: "Udp"
         * @const
         */
        udp = "Udp";

        /**
         * value: "Rtp"
         * @const
         */
        rtp = "Rtp";

        /**
         * value: "Ftp"
         * @const
         */
        ftp = "Ftp";

        /**
         * value: "Mms"
         * @const
         */
        mms = "Mms";


    /**
    * Returns a <code>MediaProtocol</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaProtocol} The enum <code>MediaProtocol</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
