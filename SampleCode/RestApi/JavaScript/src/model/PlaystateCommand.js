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
* Enum class PlaystateCommand.
* @enum {}
* @readonly
*/
export default class PlaystateCommand {
        /**
         * value: "Stop"
         * @const
         */
        Stop = "Stop";

        /**
         * value: "Pause"
         * @const
         */
        Pause = "Pause";

        /**
         * value: "Unpause"
         * @const
         */
        Unpause = "Unpause";

        /**
         * value: "NextTrack"
         * @const
         */
        NextTrack = "NextTrack";

        /**
         * value: "PreviousTrack"
         * @const
         */
        PreviousTrack = "PreviousTrack";

        /**
         * value: "Seek"
         * @const
         */
        Seek = "Seek";

        /**
         * value: "Rewind"
         * @const
         */
        Rewind = "Rewind";

        /**
         * value: "FastForward"
         * @const
         */
        FastForward = "FastForward";

        /**
         * value: "PlayPause"
         * @const
         */
        PlayPause = "PlayPause";

        /**
         * value: "SeekRelative"
         * @const
         */
        SeekRelative = "SeekRelative";


    /**
    * Returns a <code>PlaystateCommand</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PlaystateCommand} The enum <code>PlaystateCommand</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
