/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class PlaystateCommand.
* @enum {}
* @readonly
*/
export default class PlaystateCommand {
        /**
         * value: "Stop"
         * @const
         */
        stop = "Stop";

        /**
         * value: "Pause"
         * @const
         */
        pause = "Pause";

        /**
         * value: "Unpause"
         * @const
         */
        unpause = "Unpause";

        /**
         * value: "NextTrack"
         * @const
         */
        nextTrack = "NextTrack";

        /**
         * value: "PreviousTrack"
         * @const
         */
        previousTrack = "PreviousTrack";

        /**
         * value: "Seek"
         * @const
         */
        seek = "Seek";

        /**
         * value: "Rewind"
         * @const
         */
        rewind = "Rewind";

        /**
         * value: "FastForward"
         * @const
         */
        fastForward = "FastForward";

        /**
         * value: "PlayPause"
         * @const
         */
        playPause = "PlayPause";


    /**
    * Returns a <code>PlaystateCommand</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PlaystateCommand} The enum <code>PlaystateCommand</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}