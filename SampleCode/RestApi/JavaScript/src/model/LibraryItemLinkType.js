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
* Enum class LibraryItemLinkType.
* @enum {}
* @readonly
*/
export default class LibraryItemLinkType {
        /**
         * value: "Artists"
         * @const
         */
        Artists = "Artists";

        /**
         * value: "AlbumArtists"
         * @const
         */
        AlbumArtists = "AlbumArtists";

        /**
         * value: "Genres"
         * @const
         */
        Genres = "Genres";

        /**
         * value: "Studios"
         * @const
         */
        Studios = "Studios";

        /**
         * value: "Tags"
         * @const
         */
        Tags = "Tags";

        /**
         * value: "Composers"
         * @const
         */
        Composers = "Composers";

        /**
         * value: "Collections"
         * @const
         */
        Collections = "Collections";

        /**
         * value: "Albums"
         * @const
         */
        Albums = "Albums";

        /**
         * value: "CollectionFolders"
         * @const
         */
        CollectionFolders = "CollectionFolders";

        /**
         * value: "LiveTVSeries"
         * @const
         */
        LiveTVSeries = "LiveTVSeries";

        /**
         * value: "GameSystems"
         * @const
         */
        GameSystems = "GameSystems";


    /**
    * Returns a <code>LibraryItemLinkType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LibraryItemLinkType} The enum <code>LibraryItemLinkType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
