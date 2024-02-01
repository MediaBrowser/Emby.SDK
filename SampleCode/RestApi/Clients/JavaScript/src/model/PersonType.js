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
* Enum class PersonType.
* @enum {}
* @readonly
*/
export default class PersonType {
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
         * value: "Writer"
         * @const
         */
        writer = "Writer";

        /**
         * value: "Producer"
         * @const
         */
        producer = "Producer";

        /**
         * value: "GuestStar"
         * @const
         */
        guestStar = "GuestStar";

        /**
         * value: "Composer"
         * @const
         */
        composer = "Composer";

        /**
         * value: "Conductor"
         * @const
         */
        conductor = "Conductor";

        /**
         * value: "Lyricist"
         * @const
         */
        lyricist = "Lyricist";


    /**
    * Returns a <code>PersonType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PersonType} The enum <code>PersonType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
