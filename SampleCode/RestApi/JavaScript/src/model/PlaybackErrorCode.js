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
* Enum class PlaybackErrorCode.
* @enum {}
* @readonly
*/
export default class PlaybackErrorCode {
        /**
         * value: "NotAllowed"
         * @const
         */
        NotAllowed = "NotAllowed";

        /**
         * value: "NoCompatibleStream"
         * @const
         */
        NoCompatibleStream = "NoCompatibleStream";

        /**
         * value: "RateLimitExceeded"
         * @const
         */
        RateLimitExceeded = "RateLimitExceeded";


    /**
    * Returns a <code>PlaybackErrorCode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PlaybackErrorCode} The enum <code>PlaybackErrorCode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
