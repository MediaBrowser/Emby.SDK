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
* Enum class SegmentSkipMode.
* @enum {}
* @readonly
*/
export default class SegmentSkipMode {
        /**
         * value: "ShowButton"
         * @const
         */
        showButton = "ShowButton";

        /**
         * value: "AutoSkip"
         * @const
         */
        autoSkip = "AutoSkip";

        /**
         * value: "None"
         * @const
         */
        none = "None";


    /**
    * Returns a <code>SegmentSkipMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SegmentSkipMode} The enum <code>SegmentSkipMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
