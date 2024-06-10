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
* Enum class UnratedItem.
* @enum {}
* @readonly
*/
export default class UnratedItem {
        /**
         * value: "Movie"
         * @const
         */
        Movie = "Movie";

        /**
         * value: "Trailer"
         * @const
         */
        Trailer = "Trailer";

        /**
         * value: "Series"
         * @const
         */
        Series = "Series";

        /**
         * value: "Music"
         * @const
         */
        Music = "Music";

        /**
         * value: "Game"
         * @const
         */
        Game = "Game";

        /**
         * value: "Book"
         * @const
         */
        Book = "Book";

        /**
         * value: "LiveTvChannel"
         * @const
         */
        LiveTvChannel = "LiveTvChannel";

        /**
         * value: "LiveTvProgram"
         * @const
         */
        LiveTvProgram = "LiveTvProgram";

        /**
         * value: "ChannelContent"
         * @const
         */
        ChannelContent = "ChannelContent";

        /**
         * value: "Other"
         * @const
         */
        Other = "Other";


    /**
    * Returns a <code>UnratedItem</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UnratedItem} The enum <code>UnratedItem</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
