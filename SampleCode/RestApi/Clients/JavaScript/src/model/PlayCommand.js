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
* Enum class PlayCommand.
* @enum {}
* @readonly
*/
export default class PlayCommand {
        /**
         * value: "PlayNow"
         * @const
         */
        playNow = "PlayNow";

        /**
         * value: "PlayNext"
         * @const
         */
        playNext = "PlayNext";

        /**
         * value: "PlayLast"
         * @const
         */
        playLast = "PlayLast";

        /**
         * value: "PlayInstantMix"
         * @const
         */
        playInstantMix = "PlayInstantMix";

        /**
         * value: "PlayShuffle"
         * @const
         */
        playShuffle = "PlayShuffle";


    /**
    * Returns a <code>PlayCommand</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PlayCommand} The enum <code>PlayCommand</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
