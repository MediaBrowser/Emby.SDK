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
* Enum class UserActionType.
* @enum {}
* @readonly
*/
export default class UserActionType {
        /**
         * value: "PlayedItem"
         * @const
         */
        playedItem = "PlayedItem";

        /**
         * value: "MarkPlayed"
         * @const
         */
        markPlayed = "MarkPlayed";

        /**
         * value: "MarkFavorite"
         * @const
         */
        markFavorite = "MarkFavorite";


    /**
    * Returns a <code>UserActionType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UserActionType} The enum <code>UserActionType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
