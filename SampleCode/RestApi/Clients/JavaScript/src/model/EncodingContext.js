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
* Enum class EncodingContext.
* @enum {}
* @readonly
*/
export default class EncodingContext {
        /**
         * value: "Streaming"
         * @const
         */
        streaming = "Streaming";

        /**
         * value: "Static"
         * @const
         */
        _static = "Static";


    /**
    * Returns a <code>EncodingContext</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EncodingContext} The enum <code>EncodingContext</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
