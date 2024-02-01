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
* Enum class LibraryItemLinkType.
* @enum {}
* @readonly
*/
export default class LibraryItemLinkType {
        /**
         * value: "Artists"
         * @const
         */
        artists = "Artists";

        /**
         * value: "AlbumArtists"
         * @const
         */
        albumArtists = "AlbumArtists";

        /**
         * value: "Genres"
         * @const
         */
        genres = "Genres";

        /**
         * value: "Studios"
         * @const
         */
        studios = "Studios";

        /**
         * value: "Tags"
         * @const
         */
        tags = "Tags";

        /**
         * value: "Composers"
         * @const
         */
        composers = "Composers";

        /**
         * value: "Collections"
         * @const
         */
        collections = "Collections";

        /**
         * value: "Albums"
         * @const
         */
        albums = "Albums";

        /**
         * value: "CollectionFolders"
         * @const
         */
        collectionFolders = "CollectionFolders";


    /**
    * Returns a <code>LibraryItemLinkType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LibraryItemLinkType} The enum <code>LibraryItemLinkType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
