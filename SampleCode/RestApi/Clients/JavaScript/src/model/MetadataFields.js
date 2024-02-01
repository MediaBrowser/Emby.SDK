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
* Enum class MetadataFields.
* @enum {}
* @readonly
*/
export default class MetadataFields {
        /**
         * value: "Cast"
         * @const
         */
        cast = "Cast";

        /**
         * value: "Genres"
         * @const
         */
        genres = "Genres";

        /**
         * value: "ProductionLocations"
         * @const
         */
        productionLocations = "ProductionLocations";

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
         * value: "Name"
         * @const
         */
        name = "Name";

        /**
         * value: "Overview"
         * @const
         */
        overview = "Overview";

        /**
         * value: "Runtime"
         * @const
         */
        runtime = "Runtime";

        /**
         * value: "OfficialRating"
         * @const
         */
        officialRating = "OfficialRating";

        /**
         * value: "Collections"
         * @const
         */
        collections = "Collections";

        /**
         * value: "ChannelNumber"
         * @const
         */
        channelNumber = "ChannelNumber";

        /**
         * value: "SortName"
         * @const
         */
        sortName = "SortName";

        /**
         * value: "OriginalTitle"
         * @const
         */
        originalTitle = "OriginalTitle";

        /**
         * value: "SortIndexNumber"
         * @const
         */
        sortIndexNumber = "SortIndexNumber";

        /**
         * value: "SortParentIndexNumber"
         * @const
         */
        sortParentIndexNumber = "SortParentIndexNumber";

        /**
         * value: "CommunityRating"
         * @const
         */
        communityRating = "CommunityRating";

        /**
         * value: "CriticRating"
         * @const
         */
        criticRating = "CriticRating";

        /**
         * value: "Tagline"
         * @const
         */
        tagline = "Tagline";


    /**
    * Returns a <code>MetadataFields</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MetadataFields} The enum <code>MetadataFields</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
