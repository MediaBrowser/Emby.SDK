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
* Enum class DrawingImageOrientation.
* @enum {}
* @readonly
*/
export default class DrawingImageOrientation {
        /**
         * value: "TopLeft"
         * @const
         */
        topLeft = "TopLeft";

        /**
         * value: "TopRight"
         * @const
         */
        topRight = "TopRight";

        /**
         * value: "BottomRight"
         * @const
         */
        bottomRight = "BottomRight";

        /**
         * value: "BottomLeft"
         * @const
         */
        bottomLeft = "BottomLeft";

        /**
         * value: "LeftTop"
         * @const
         */
        leftTop = "LeftTop";

        /**
         * value: "RightTop"
         * @const
         */
        rightTop = "RightTop";

        /**
         * value: "RightBottom"
         * @const
         */
        rightBottom = "RightBottom";

        /**
         * value: "LeftBottom"
         * @const
         */
        leftBottom = "LeftBottom";


    /**
    * Returns a <code>DrawingImageOrientation</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DrawingImageOrientation} The enum <code>DrawingImageOrientation</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
