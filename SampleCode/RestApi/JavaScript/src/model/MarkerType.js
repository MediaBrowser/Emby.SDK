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
* Enum class MarkerType.
* @enum {}
* @readonly
*/
export default class MarkerType {
        /**
         * value: "Chapter"
         * @const
         */
        Chapter = "Chapter";

        /**
         * value: "IntroStart"
         * @const
         */
        IntroStart = "IntroStart";

        /**
         * value: "IntroEnd"
         * @const
         */
        IntroEnd = "IntroEnd";

        /**
         * value: "CreditsStart"
         * @const
         */
        CreditsStart = "CreditsStart";


    /**
    * Returns a <code>MarkerType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MarkerType} The enum <code>MarkerType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
