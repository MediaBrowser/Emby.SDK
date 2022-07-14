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
* Enum class RatingType.
* @enum {}
* @readonly
*/
export default class RatingType {
        /**
         * value: "Score"
         * @const
         */
        score = "Score";

        /**
         * value: "Likes"
         * @const
         */
        likes = "Likes";


    /**
    * Returns a <code>RatingType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RatingType} The enum <code>RatingType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
