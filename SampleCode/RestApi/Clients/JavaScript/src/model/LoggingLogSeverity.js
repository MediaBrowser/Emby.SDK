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
* Enum class LoggingLogSeverity.
* @enum {}
* @readonly
*/
export default class LoggingLogSeverity {
        /**
         * value: "Info"
         * @const
         */
        info = "Info";

        /**
         * value: "Debug"
         * @const
         */
        debug = "Debug";

        /**
         * value: "Warn"
         * @const
         */
        warn = "Warn";

        /**
         * value: "Error"
         * @const
         */
        error = "Error";

        /**
         * value: "Fatal"
         * @const
         */
        fatal = "Fatal";


    /**
    * Returns a <code>LoggingLogSeverity</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LoggingLogSeverity} The enum <code>LoggingLogSeverity</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
