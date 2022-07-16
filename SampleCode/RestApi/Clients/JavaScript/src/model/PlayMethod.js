/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class PlayMethod.
* @enum {}
* @readonly
*/
export default class PlayMethod {
        /**
         * value: "Transcode"
         * @const
         */
        transcode = "Transcode";

        /**
         * value: "DirectStream"
         * @const
         */
        directStream = "DirectStream";

        /**
         * value: "DirectPlay"
         * @const
         */
        directPlay = "DirectPlay";


    /**
    * Returns a <code>PlayMethod</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PlayMethod} The enum <code>PlayMethod</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
