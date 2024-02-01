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
* Enum class ItemFileType.
* @enum {}
* @readonly
*/
export default class ItemFileType {
        /**
         * value: "Media"
         * @const
         */
        media = "Media";

        /**
         * value: "Image"
         * @const
         */
        image = "Image";

        /**
         * value: "Subtitles"
         * @const
         */
        subtitles = "Subtitles";


    /**
    * Returns a <code>ItemFileType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ItemFileType} The enum <code>ItemFileType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
