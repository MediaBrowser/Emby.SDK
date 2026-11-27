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
* Enum class MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.
* @enum {}
* @readonly
*/
export default class MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType {
        /**
         * value: "Configure"
         * @const
         */
        Configure = "Configure";

        /**
         * value: "Conditions"
         * @const
         */
        Conditions = "Conditions";

        /**
         * value: "LoadLimits"
         * @const
         */
        LoadLimits = "LoadLimits";

        /**
         * value: "LoadBalancing"
         * @const
         */
        LoadBalancing = "LoadBalancing";

        /**
         * value: "ToggleEnabled"
         * @const
         */
        ToggleEnabled = "ToggleEnabled";

        /**
         * value: "Move"
         * @const
         */
        Move = "Move";

        /**
         * value: "Insert"
         * @const
         */
        Insert = "Insert";

        /**
         * value: "Delete"
         * @const
         */
        _Delete = "Delete";

        /**
         * value: "InsertGpuConfig"
         * @const
         */
        InsertGpuConfig = "InsertGpuConfig";

        /**
         * value: "InsertGraph"
         * @const
         */
        InsertGraph = "InsertGraph";

        /**
         * value: "InsertLoadBalancer"
         * @const
         */
        InsertLoadBalancer = "InsertLoadBalancer";

        /**
         * value: "InsertErrorOut"
         * @const
         */
        InsertErrorOut = "InsertErrorOut";


    /**
    * Returns a <code>MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType} The enum <code>MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
