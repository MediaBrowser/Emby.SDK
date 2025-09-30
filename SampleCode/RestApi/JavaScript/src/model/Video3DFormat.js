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
* Enum class Video3DFormat.
* @enum {}
* @readonly
*/
export default class Video3DFormat {
        /**
         * value: "HalfSideBySide"
         * @const
         */
        HalfSideBySide = "HalfSideBySide";

        /**
         * value: "FullSideBySide"
         * @const
         */
        FullSideBySide = "FullSideBySide";

        /**
         * value: "FullTopAndBottom"
         * @const
         */
        FullTopAndBottom = "FullTopAndBottom";

        /**
         * value: "HalfTopAndBottom"
         * @const
         */
        HalfTopAndBottom = "HalfTopAndBottom";

        /**
         * value: "MVC"
         * @const
         */
        MVC = "MVC";


    /**
    * Returns a <code>Video3DFormat</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Video3DFormat} The enum <code>Video3DFormat</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
