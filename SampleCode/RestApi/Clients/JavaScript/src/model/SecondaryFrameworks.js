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
* Enum class SecondaryFrameworks.
* @enum {}
* @readonly
*/
export default class SecondaryFrameworks {
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
    * Returns a <code>SecondaryFrameworks</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SecondaryFrameworks} The enum <code>SecondaryFrameworks</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
