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
* Enum class MetadataRefreshMode.
* @enum {}
* @readonly
*/
export default class MetadataRefreshMode {
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
    * Returns a <code>MetadataRefreshMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MetadataRefreshMode} The enum <code>MetadataRefreshMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
