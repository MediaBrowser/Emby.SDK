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
* Enum class SecondaryFrameworks.
* @enum {}
* @readonly
*/
export default class SecondaryFrameworks {
        /**
         * value: "Unknown"
         * @const
         */
        Unknown = "Unknown";

        /**
         * value: "None"
         * @const
         */
        None = "None";

        /**
         * value: "AmdAmf"
         * @const
         */
        AmdAmf = "AmdAmf";

        /**
         * value: "MediaCodec"
         * @const
         */
        MediaCodec = "MediaCodec";

        /**
         * value: "NvEncDec"
         * @const
         */
        NvEncDec = "NvEncDec";

        /**
         * value: "OpenMax"
         * @const
         */
        OpenMax = "OpenMax";

        /**
         * value: "QuickSync"
         * @const
         */
        QuickSync = "QuickSync";

        /**
         * value: "VaApi"
         * @const
         */
        VaApi = "VaApi";

        /**
         * value: "V4L2"
         * @const
         */
        V4L2 = "V4L2";

        /**
         * value: "DxVa"
         * @const
         */
        DxVa = "DxVa";

        /**
         * value: "D3d11va"
         * @const
         */
        D3d11va = "D3d11va";

        /**
         * value: "VideoToolbox"
         * @const
         */
        VideoToolbox = "VideoToolbox";

        /**
         * value: "Mmal"
         * @const
         */
        Mmal = "Mmal";


    /**
    * Returns a <code>SecondaryFrameworks</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SecondaryFrameworks} The enum <code>SecondaryFrameworks</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
