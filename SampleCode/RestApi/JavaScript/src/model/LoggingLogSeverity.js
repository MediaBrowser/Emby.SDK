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
* Enum class LoggingLogSeverity.
* @enum {}
* @readonly
*/
export default class LoggingLogSeverity {
        /**
         * value: "Info"
         * @const
         */
        Info = "Info";

        /**
         * value: "Debug"
         * @const
         */
        Debug = "Debug";

        /**
         * value: "Warn"
         * @const
         */
        Warn = "Warn";

        /**
         * value: "Error"
         * @const
         */
        Error = "Error";

        /**
         * value: "Fatal"
         * @const
         */
        Fatal = "Fatal";


    /**
    * Returns a <code>LoggingLogSeverity</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LoggingLogSeverity} The enum <code>LoggingLogSeverity</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
