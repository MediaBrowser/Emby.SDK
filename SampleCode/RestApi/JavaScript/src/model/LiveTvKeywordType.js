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
* Enum class LiveTvKeywordType.
* @enum {}
* @readonly
*/
export default class LiveTvKeywordType {
        /**
         * value: "Name"
         * @const
         */
        Name = "Name";

        /**
         * value: "EpisodeTitle"
         * @const
         */
        EpisodeTitle = "EpisodeTitle";

        /**
         * value: "Overview"
         * @const
         */
        Overview = "Overview";

        /**
         * value: "Actor"
         * @const
         */
        Actor = "Actor";

        /**
         * value: "Director"
         * @const
         */
        Director = "Director";


    /**
    * Returns a <code>LiveTvKeywordType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvKeywordType} The enum <code>LiveTvKeywordType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
