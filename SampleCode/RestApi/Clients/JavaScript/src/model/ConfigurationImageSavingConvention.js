/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class ConfigurationImageSavingConvention.
* @enum {}
* @readonly
*/
export default class ConfigurationImageSavingConvention {
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
    * Returns a <code>ConfigurationImageSavingConvention</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConfigurationImageSavingConvention} The enum <code>ConfigurationImageSavingConvention</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
