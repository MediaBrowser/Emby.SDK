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
* Enum class TranscodingVpStepTypes.
* @enum {}
* @readonly
*/
export default class TranscodingVpStepTypes {
        /**
         * value: "Decoder"
         * @const
         */
        Decoder = "Decoder";

        /**
         * value: "Encoder"
         * @const
         */
        Encoder = "Encoder";

        /**
         * value: "Scaling"
         * @const
         */
        Scaling = "Scaling";

        /**
         * value: "Deinterlace"
         * @const
         */
        Deinterlace = "Deinterlace";

        /**
         * value: "SubtitleOverlay"
         * @const
         */
        SubtitleOverlay = "SubtitleOverlay";

        /**
         * value: "ToneMapping"
         * @const
         */
        ToneMapping = "ToneMapping";

        /**
         * value: "ColorConversion"
         * @const
         */
        ColorConversion = "ColorConversion";

        /**
         * value: "SplitCaptions"
         * @const
         */
        SplitCaptions = "SplitCaptions";

        /**
         * value: "TextSub2Video"
         * @const
         */
        TextSub2Video = "TextSub2Video";

        /**
         * value: "GraphicSub2Video"
         * @const
         */
        GraphicSub2Video = "GraphicSub2Video";

        /**
         * value: "GraphicSub2Text"
         * @const
         */
        GraphicSub2Text = "GraphicSub2Text";

        /**
         * value: "BurnInTextSubs"
         * @const
         */
        BurnInTextSubs = "BurnInTextSubs";

        /**
         * value: "BurnInGraphicSubs"
         * @const
         */
        BurnInGraphicSubs = "BurnInGraphicSubs";

        /**
         * value: "ScaleSubs"
         * @const
         */
        ScaleSubs = "ScaleSubs";

        /**
         * value: "TextMod"
         * @const
         */
        TextMod = "TextMod";

        /**
         * value: "Censor"
         * @const
         */
        Censor = "Censor";

        /**
         * value: "ShowSpeaker"
         * @const
         */
        ShowSpeaker = "ShowSpeaker";

        /**
         * value: "StripStyles"
         * @const
         */
        StripStyles = "StripStyles";

        /**
         * value: "ConnectTo"
         * @const
         */
        ConnectTo = "ConnectTo";


    /**
    * Returns a <code>TranscodingVpStepTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TranscodingVpStepTypes} The enum <code>TranscodingVpStepTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
