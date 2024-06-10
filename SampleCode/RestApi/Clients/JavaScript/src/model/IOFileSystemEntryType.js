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
* Enum class IOFileSystemEntryType.
* @enum {}
* @readonly
*/
export default class IOFileSystemEntryType {
        /**
         * value: "File"
         * @const
         */
        File = "File";

        /**
         * value: "Directory"
         * @const
         */
        Directory = "Directory";

        /**
         * value: "NetworkComputer"
         * @const
         */
        NetworkComputer = "NetworkComputer";

        /**
         * value: "NetworkShare"
         * @const
         */
        NetworkShare = "NetworkShare";


    /**
    * Returns a <code>IOFileSystemEntryType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/IOFileSystemEntryType} The enum <code>IOFileSystemEntryType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
