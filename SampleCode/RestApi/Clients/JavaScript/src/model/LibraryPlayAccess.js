/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class LibraryPlayAccess.
* @enum {}
* @readonly
*/
export default class LibraryPlayAccess {
        /**
         * value: "Full"
         * @const
         */
        full = "Full";

        /**
         * value: "None"
         * @const
         */
        none = "None";


    /**
    * Returns a <code>LibraryPlayAccess</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LibraryPlayAccess} The enum <code>LibraryPlayAccess</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
