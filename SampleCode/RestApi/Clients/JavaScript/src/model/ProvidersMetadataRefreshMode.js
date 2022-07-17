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
* Enum class ProvidersMetadataRefreshMode.
* @enum {}
* @readonly
*/
export default class ProvidersMetadataRefreshMode {
        /**
         * value: "ValidationOnly"
         * @const
         */
        validationOnly = "ValidationOnly";

        /**
         * value: "Default"
         * @const
         */
        _default = "Default";

        /**
         * value: "FullRefresh"
         * @const
         */
        fullRefresh = "FullRefresh";


    /**
    * Returns a <code>ProvidersMetadataRefreshMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ProvidersMetadataRefreshMode} The enum <code>ProvidersMetadataRefreshMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
