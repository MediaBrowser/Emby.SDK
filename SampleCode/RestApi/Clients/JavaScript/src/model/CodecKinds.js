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
* Enum class CodecKinds.
* @enum {}
* @readonly
*/
export default class CodecKinds {
        /**
         * value: "Audio"
         * @const
         */
        audio = "Audio";

        /**
         * value: "Video"
         * @const
         */
        video = "Video";

        /**
         * value: "SubTitles"
         * @const
         */
        subTitles = "SubTitles";


    /**
    * Returns a <code>CodecKinds</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/CodecKinds} The enum <code>CodecKinds</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
