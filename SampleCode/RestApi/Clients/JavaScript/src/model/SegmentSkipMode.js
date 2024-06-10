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
* Enum class SegmentSkipMode.
* @enum {}
* @readonly
*/
export default class SegmentSkipMode {
        /**
         * value: "ShowButton"
         * @const
         */
        ShowButton = "ShowButton";

        /**
         * value: "AutoSkip"
         * @const
         */
        AutoSkip = "AutoSkip";

        /**
         * value: "None"
         * @const
         */
        None = "None";


    /**
    * Returns a <code>SegmentSkipMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SegmentSkipMode} The enum <code>SegmentSkipMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
