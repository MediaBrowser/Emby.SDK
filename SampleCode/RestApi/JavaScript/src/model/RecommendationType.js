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
* Enum class RecommendationType.
* @enum {}
* @readonly
*/
export default class RecommendationType {
        /**
         * value: "SimilarToRecentlyPlayed"
         * @const
         */
        SimilarToRecentlyPlayed = "SimilarToRecentlyPlayed";

        /**
         * value: "SimilarToLikedItem"
         * @const
         */
        SimilarToLikedItem = "SimilarToLikedItem";

        /**
         * value: "HasDirectorFromRecentlyPlayed"
         * @const
         */
        HasDirectorFromRecentlyPlayed = "HasDirectorFromRecentlyPlayed";

        /**
         * value: "HasActorFromRecentlyPlayed"
         * @const
         */
        HasActorFromRecentlyPlayed = "HasActorFromRecentlyPlayed";

        /**
         * value: "HasLikedDirector"
         * @const
         */
        HasLikedDirector = "HasLikedDirector";

        /**
         * value: "HasLikedActor"
         * @const
         */
        HasLikedActor = "HasLikedActor";


    /**
    * Returns a <code>RecommendationType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RecommendationType} The enum <code>RecommendationType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
