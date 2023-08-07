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
* Enum class ConfigurationProxyHeaderMode.
* @enum {}
* @readonly
*/
export default class ConfigurationProxyHeaderMode {
        /**
         * value: "None"
         * @const
         */
        none = "None";

        /**
         * value: "LanAddressesOnly"
         * @const
         */
        lanAddressesOnly = "LanAddressesOnly";

        /**
         * value: "AllAddresses"
         * @const
         */
        allAddresses = "AllAddresses";


    /**
    * Returns a <code>ConfigurationProxyHeaderMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConfigurationProxyHeaderMode} The enum <code>ConfigurationProxyHeaderMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
