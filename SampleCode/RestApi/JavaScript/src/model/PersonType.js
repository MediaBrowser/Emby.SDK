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
* Enum class PersonType.
* @enum {}
* @readonly
*/
export default class PersonType {
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
         * value: "Writer"
         * @const
         */
        Writer = "Writer";

        /**
         * value: "Producer"
         * @const
         */
        Producer = "Producer";

        /**
         * value: "GuestStar"
         * @const
         */
        GuestStar = "GuestStar";

        /**
         * value: "Composer"
         * @const
         */
        Composer = "Composer";

        /**
         * value: "Conductor"
         * @const
         */
        Conductor = "Conductor";

        /**
         * value: "Lyricist"
         * @const
         */
        Lyricist = "Lyricist";


    /**
    * Returns a <code>PersonType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PersonType} The enum <code>PersonType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
