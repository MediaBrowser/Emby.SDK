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
* Enum class ProgressEvent.
* @enum {}
* @readonly
*/
export default class ProgressEvent {
        /**
         * value: "TimeUpdate"
         * @const
         */
        TimeUpdate = "TimeUpdate";

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
         * value: "VolumeChange"
         * @const
         */
        VolumeChange = "VolumeChange";

        /**
         * value: "RepeatModeChange"
         * @const
         */
        RepeatModeChange = "RepeatModeChange";

        /**
         * value: "AudioTrackChange"
         * @const
         */
        AudioTrackChange = "AudioTrackChange";

        /**
         * value: "SubtitleTrackChange"
         * @const
         */
        SubtitleTrackChange = "SubtitleTrackChange";

        /**
         * value: "PlaylistItemMove"
         * @const
         */
        PlaylistItemMove = "PlaylistItemMove";

        /**
         * value: "PlaylistItemRemove"
         * @const
         */
        PlaylistItemRemove = "PlaylistItemRemove";

        /**
         * value: "PlaylistItemAdd"
         * @const
         */
        PlaylistItemAdd = "PlaylistItemAdd";

        /**
         * value: "QualityChange"
         * @const
         */
        QualityChange = "QualityChange";

        /**
         * value: "StateChange"
         * @const
         */
        StateChange = "StateChange";

        /**
         * value: "SubtitleOffsetChange"
         * @const
         */
        SubtitleOffsetChange = "SubtitleOffsetChange";

        /**
         * value: "PlaybackRateChange"
         * @const
         */
        PlaybackRateChange = "PlaybackRateChange";

        /**
         * value: "ShuffleChange"
         * @const
         */
        ShuffleChange = "ShuffleChange";


    /**
    * Returns a <code>ProgressEvent</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ProgressEvent} The enum <code>ProgressEvent</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
