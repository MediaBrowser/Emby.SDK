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
* Enum class ConfigurationMetadataFeatures.
* @enum {}
* @readonly
*/
export default class ConfigurationMetadataFeatures {
        /**
         * value: "Collections"
         * @const
         */
        collections = "Collections";

        /**
         * value: "Adult"
         * @const
         */
        adult = "Adult";

        /**
         * value: "RequiredSetup"
         * @const
         */
        requiredSetup = "RequiredSetup";


    /**
    * Returns a <code>ConfigurationMetadataFeatures</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConfigurationMetadataFeatures} The enum <code>ConfigurationMetadataFeatures</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
