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
* Enum class DlnaPlaybackErrorCode.
* @enum {}
* @readonly
*/
export default class DlnaPlaybackErrorCode {
        /**
         * value: "NotAllowed"
         * @const
         */
        notAllowed = "NotAllowed";

        /**
         * value: "NoCompatibleStream"
         * @const
         */
        noCompatibleStream = "NoCompatibleStream";

        /**
         * value: "RateLimitExceeded"
         * @const
         */
        rateLimitExceeded = "RateLimitExceeded";


    /**
    * Returns a <code>DlnaPlaybackErrorCode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaPlaybackErrorCode} The enum <code>DlnaPlaybackErrorCode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
