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
* Enum class TranscodingVpStepTypes.
* @enum {}
* @readonly
*/
export default class TranscodingVpStepTypes {
        /**
         * value: "Decoder"
         * @const
         */
        decoder = "Decoder";

        /**
         * value: "Encoder"
         * @const
         */
        encoder = "Encoder";

        /**
         * value: "Scaling"
         * @const
         */
        scaling = "Scaling";

        /**
         * value: "Deinterlace"
         * @const
         */
        deinterlace = "Deinterlace";

        /**
         * value: "SubtitleOverlay"
         * @const
         */
        subtitleOverlay = "SubtitleOverlay";

        /**
         * value: "ToneMapping"
         * @const
         */
        toneMapping = "ToneMapping";

        /**
         * value: "ColorConversion"
         * @const
         */
        colorConversion = "ColorConversion";

        /**
         * value: "SplitCaptions"
         * @const
         */
        splitCaptions = "SplitCaptions";

        /**
         * value: "TextSub2Video"
         * @const
         */
        textSub2Video = "TextSub2Video";

        /**
         * value: "GraphicSub2Video"
         * @const
         */
        graphicSub2Video = "GraphicSub2Video";

        /**
         * value: "GraphicSub2Text"
         * @const
         */
        graphicSub2Text = "GraphicSub2Text";

        /**
         * value: "BurnInTextSubs"
         * @const
         */
        burnInTextSubs = "BurnInTextSubs";

        /**
         * value: "BurnInGraphicSubs"
         * @const
         */
        burnInGraphicSubs = "BurnInGraphicSubs";

        /**
         * value: "ScaleSubs"
         * @const
         */
        scaleSubs = "ScaleSubs";

        /**
         * value: "TextMod"
         * @const
         */
        textMod = "TextMod";

        /**
         * value: "Censor"
         * @const
         */
        censor = "Censor";

        /**
         * value: "ShowSpeaker"
         * @const
         */
        showSpeaker = "ShowSpeaker";

        /**
         * value: "StripStyles"
         * @const
         */
        stripStyles = "StripStyles";

        /**
         * value: "ConnectTo"
         * @const
         */
        connectTo = "ConnectTo";


    /**
    * Returns a <code>TranscodingVpStepTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TranscodingVpStepTypes} The enum <code>TranscodingVpStepTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
