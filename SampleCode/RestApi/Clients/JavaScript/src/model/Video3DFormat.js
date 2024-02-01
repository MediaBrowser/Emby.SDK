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
* Enum class Video3DFormat.
* @enum {}
* @readonly
*/
export default class Video3DFormat {
        /**
         * value: "HalfSideBySide"
         * @const
         */
        halfSideBySide = "HalfSideBySide";

        /**
         * value: "FullSideBySide"
         * @const
         */
        fullSideBySide = "FullSideBySide";

        /**
         * value: "FullTopAndBottom"
         * @const
         */
        fullTopAndBottom = "FullTopAndBottom";

        /**
         * value: "HalfTopAndBottom"
         * @const
         */
        halfTopAndBottom = "HalfTopAndBottom";

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
