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
* Enum class PluginsConfigurationPageType.
* @enum {}
* @readonly
*/
export default class PluginsConfigurationPageType {
        /**
         * value: "PluginConfiguration"
         * @const
         */
        pluginConfiguration = "PluginConfiguration";

        /**
         * value: "None"
         * @const
         */
        none = "None";


    /**
    * Returns a <code>PluginsConfigurationPageType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PluginsConfigurationPageType} The enum <code>PluginsConfigurationPageType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
