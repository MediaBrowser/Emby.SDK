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
* Enum class LiveTvKeywordType.
* @enum {}
* @readonly
*/
export default class LiveTvKeywordType {
        /**
         * value: "Name"
         * @const
         */
        name = "Name";

        /**
         * value: "EpisodeTitle"
         * @const
         */
        episodeTitle = "EpisodeTitle";

        /**
         * value: "Overview"
         * @const
         */
        overview = "Overview";

        /**
         * value: "Actor"
         * @const
         */
        actor = "Actor";

        /**
         * value: "Director"
         * @const
         */
        director = "Director";


    /**
    * Returns a <code>LiveTvKeywordType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvKeywordType} The enum <code>LiveTvKeywordType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
