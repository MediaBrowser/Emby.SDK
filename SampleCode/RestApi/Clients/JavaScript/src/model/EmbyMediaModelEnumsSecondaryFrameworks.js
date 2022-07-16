/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class EmbyMediaModelEnumsSecondaryFrameworks.
* @enum {}
* @readonly
*/
export default class EmbyMediaModelEnumsSecondaryFrameworks {
        /**
         * value: "Unknown"
         * @const
         */
        unknown = "Unknown";

        /**
         * value: "None"
         * @const
         */
        none = "None";

        /**
         * value: "AmdAmf"
         * @const
         */
        amdAmf = "AmdAmf";

        /**
         * value: "MediaCodec"
         * @const
         */
        mediaCodec = "MediaCodec";

        /**
         * value: "NvEncDec"
         * @const
         */
        nvEncDec = "NvEncDec";

        /**
         * value: "OpenMax"
         * @const
         */
        openMax = "OpenMax";

        /**
         * value: "QuickSync"
         * @const
         */
        quickSync = "QuickSync";

        /**
         * value: "VaApi"
         * @const
         */
        vaApi = "VaApi";

        /**
         * value: "V4L2"
         * @const
         */
        v4L2 = "V4L2";

        /**
         * value: "DxVa"
         * @const
         */
        dxVa = "DxVa";

        /**
         * value: "D3d11va"
         * @const
         */
        d3d11va = "D3d11va";

        /**
         * value: "VideoToolbox"
         * @const
         */
        videoToolbox = "VideoToolbox";

        /**
         * value: "Mmal"
         * @const
         */
        mmal = "Mmal";


    /**
    * Returns a <code>EmbyMediaModelEnumsSecondaryFrameworks</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyMediaModelEnumsSecondaryFrameworks} The enum <code>EmbyMediaModelEnumsSecondaryFrameworks</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
