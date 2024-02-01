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
* Enum class ImageType.
* @enum {}
* @readonly
*/
export default class ImageType {
        /**
         * value: "Primary"
         * @const
         */
        primary = "Primary";

        /**
         * value: "Art"
         * @const
         */
        art = "Art";

        /**
         * value: "Backdrop"
         * @const
         */
        backdrop = "Backdrop";

        /**
         * value: "Banner"
         * @const
         */
        banner = "Banner";

        /**
         * value: "Logo"
         * @const
         */
        logo = "Logo";

        /**
         * value: "Thumb"
         * @const
         */
        thumb = "Thumb";

        /**
         * value: "Disc"
         * @const
         */
        disc = "Disc";

        /**
         * value: "Box"
         * @const
         */
        box = "Box";

        /**
         * value: "Screenshot"
         * @const
         */
        screenshot = "Screenshot";

        /**
         * value: "Menu"
         * @const
         */
        menu = "Menu";

        /**
         * value: "Chapter"
         * @const
         */
        chapter = "Chapter";

        /**
         * value: "BoxRear"
         * @const
         */
        boxRear = "BoxRear";

        /**
         * value: "Thumbnail"
         * @const
         */
        thumbnail = "Thumbnail";

        /**
         * value: "LogoLight"
         * @const
         */
        logoLight = "LogoLight";

        /**
         * value: "LogoLightColor"
         * @const
         */
        logoLightColor = "LogoLightColor";


    /**
    * Returns a <code>ImageType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ImageType} The enum <code>ImageType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
