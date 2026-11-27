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
* Enum class MediaEncodingSettingsHwaProjectionEnumsUiNodeType.
* @enum {}
* @readonly
*/
export default class MediaEncodingSettingsHwaProjectionEnumsUiNodeType {
        /**
         * value: "Unknown"
         * @const
         */
        Unknown = "Unknown";

        /**
         * value: "Root"
         * @const
         */
        Root = "Root";

        /**
         * value: "Graph"
         * @const
         */
        Graph = "Graph";

        /**
         * value: "LoadBalancer"
         * @const
         */
        LoadBalancer = "LoadBalancer";

        /**
         * value: "GpuConfig"
         * @const
         */
        GpuConfig = "GpuConfig";

        /**
         * value: "ErrorOut"
         * @const
         */
        ErrorOut = "ErrorOut";

        /**
         * value: "UiHint"
         * @const
         */
        UiHint = "UiHint";

        /**
         * value: "Divider"
         * @const
         */
        Divider = "Divider";


    /**
    * Returns a <code>MediaEncodingSettingsHwaProjectionEnumsUiNodeType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeType} The enum <code>MediaEncodingSettingsHwaProjectionEnumsUiNodeType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
