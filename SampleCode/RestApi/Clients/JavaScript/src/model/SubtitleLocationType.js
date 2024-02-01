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
* Enum class SubtitleLocationType.
* @enum {}
* @readonly
*/
export default class SubtitleLocationType {
        /**
         * value: "InternalStream"
         * @const
         */
        internalStream = "InternalStream";

        /**
         * value: "VideoSideData"
         * @const
         */
        videoSideData = "VideoSideData";


    /**
    * Returns a <code>SubtitleLocationType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SubtitleLocationType} The enum <code>SubtitleLocationType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
