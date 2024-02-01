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
* Enum class MetadataFeatures.
* @enum {}
* @readonly
*/
export default class MetadataFeatures {
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
    * Returns a <code>MetadataFeatures</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MetadataFeatures} The enum <code>MetadataFeatures</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
