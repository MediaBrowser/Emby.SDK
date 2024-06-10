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
* Enum class DrawingImageOrientation.
* @enum {}
* @readonly
*/
export default class DrawingImageOrientation {
        /**
         * value: "TopLeft"
         * @const
         */
        TopLeft = "TopLeft";

        /**
         * value: "TopRight"
         * @const
         */
        TopRight = "TopRight";

        /**
         * value: "BottomRight"
         * @const
         */
        BottomRight = "BottomRight";

        /**
         * value: "BottomLeft"
         * @const
         */
        BottomLeft = "BottomLeft";

        /**
         * value: "LeftTop"
         * @const
         */
        LeftTop = "LeftTop";

        /**
         * value: "RightTop"
         * @const
         */
        RightTop = "RightTop";

        /**
         * value: "RightBottom"
         * @const
         */
        RightBottom = "RightBottom";

        /**
         * value: "LeftBottom"
         * @const
         */
        LeftBottom = "LeftBottom";


    /**
    * Returns a <code>DrawingImageOrientation</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DrawingImageOrientation} The enum <code>DrawingImageOrientation</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
