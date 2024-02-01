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
* Enum class MediaEncodingCodecParameterContext.
* @enum {}
* @readonly
*/
export default class MediaEncodingCodecParameterContext {
        /**
         * value: "Playback"
         * @const
         */
        playback = "Playback";

        /**
         * value: "Conversion"
         * @const
         */
        conversion = "Conversion";


    /**
    * Returns a <code>MediaEncodingCodecParameterContext</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaEncodingCodecParameterContext} The enum <code>MediaEncodingCodecParameterContext</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
