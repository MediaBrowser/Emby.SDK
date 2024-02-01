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
* Enum class ImageSavingConvention.
* @enum {}
* @readonly
*/
export default class ImageSavingConvention {
        /**
         * value: "Legacy"
         * @const
         */
        legacy = "Legacy";

        /**
         * value: "Compatible"
         * @const
         */
        compatible = "Compatible";


    /**
    * Returns a <code>ImageSavingConvention</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ImageSavingConvention} The enum <code>ImageSavingConvention</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
