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
* Enum class LibraryUserCopyOptions.
* @enum {}
* @readonly
*/
export default class LibraryUserCopyOptions {
        /**
         * value: "UserPolicy"
         * @const
         */
        userPolicy = "UserPolicy";

        /**
         * value: "UserConfiguration"
         * @const
         */
        userConfiguration = "UserConfiguration";


    /**
    * Returns a <code>LibraryUserCopyOptions</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LibraryUserCopyOptions} The enum <code>LibraryUserCopyOptions</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
