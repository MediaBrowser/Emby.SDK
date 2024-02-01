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
* Enum class UnratedItem.
* @enum {}
* @readonly
*/
export default class UnratedItem {
        /**
         * value: "Movie"
         * @const
         */
        movie = "Movie";

        /**
         * value: "Trailer"
         * @const
         */
        trailer = "Trailer";

        /**
         * value: "Series"
         * @const
         */
        series = "Series";

        /**
         * value: "Music"
         * @const
         */
        music = "Music";

        /**
         * value: "Game"
         * @const
         */
        game = "Game";

        /**
         * value: "Book"
         * @const
         */
        book = "Book";

        /**
         * value: "LiveTvChannel"
         * @const
         */
        liveTvChannel = "LiveTvChannel";

        /**
         * value: "LiveTvProgram"
         * @const
         */
        liveTvProgram = "LiveTvProgram";

        /**
         * value: "ChannelContent"
         * @const
         */
        channelContent = "ChannelContent";

        /**
         * value: "Other"
         * @const
         */
        other = "Other";


    /**
    * Returns a <code>UnratedItem</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UnratedItem} The enum <code>UnratedItem</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
