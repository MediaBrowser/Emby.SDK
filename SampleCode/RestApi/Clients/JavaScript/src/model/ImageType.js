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
* Enum class ImageType.
* @enum {}
* @readonly
*/
export default class ImageType {
        /**
         * value: "Primary"
         * @const
         */
        Primary = "Primary";

        /**
         * value: "Art"
         * @const
         */
        Art = "Art";

        /**
         * value: "Backdrop"
         * @const
         */
        Backdrop = "Backdrop";

        /**
         * value: "Banner"
         * @const
         */
        Banner = "Banner";

        /**
         * value: "Logo"
         * @const
         */
        Logo = "Logo";

        /**
         * value: "Thumb"
         * @const
         */
        Thumb = "Thumb";

        /**
         * value: "Disc"
         * @const
         */
        Disc = "Disc";

        /**
         * value: "Box"
         * @const
         */
        Box = "Box";

        /**
         * value: "Screenshot"
         * @const
         */
        Screenshot = "Screenshot";

        /**
         * value: "Menu"
         * @const
         */
        Menu = "Menu";

        /**
         * value: "Chapter"
         * @const
         */
        Chapter = "Chapter";

        /**
         * value: "BoxRear"
         * @const
         */
        BoxRear = "BoxRear";

        /**
         * value: "Thumbnail"
         * @const
         */
        Thumbnail = "Thumbnail";

        /**
         * value: "LogoLight"
         * @const
         */
        LogoLight = "LogoLight";

        /**
         * value: "LogoLightColor"
         * @const
         */
        LogoLightColor = "LogoLightColor";


    /**
    * Returns a <code>ImageType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ImageType} The enum <code>ImageType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
