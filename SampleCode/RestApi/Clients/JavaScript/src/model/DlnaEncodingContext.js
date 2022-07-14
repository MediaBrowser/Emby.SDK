/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class DlnaEncodingContext.
* @enum {}
* @readonly
*/
export default class DlnaEncodingContext {
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
    * Returns a <code>DlnaEncodingContext</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaEncodingContext} The enum <code>DlnaEncodingContext</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
