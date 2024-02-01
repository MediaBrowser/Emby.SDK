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
* Enum class TranscodeSeekInfo.
* @enum {}
* @readonly
*/
export default class TranscodeSeekInfo {
        /**
         * value: "Auto"
         * @const
         */
        auto = "Auto";

        /**
         * value: "Bytes"
         * @const
         */
        bytes = "Bytes";


    /**
    * Returns a <code>TranscodeSeekInfo</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TranscodeSeekInfo} The enum <code>TranscodeSeekInfo</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
