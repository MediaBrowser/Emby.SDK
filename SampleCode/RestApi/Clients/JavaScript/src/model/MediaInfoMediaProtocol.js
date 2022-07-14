/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class MediaInfoMediaProtocol.
* @enum {}
* @readonly
*/
export default class MediaInfoMediaProtocol {
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
    * Returns a <code>MediaInfoMediaProtocol</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaInfoMediaProtocol} The enum <code>MediaInfoMediaProtocol</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
