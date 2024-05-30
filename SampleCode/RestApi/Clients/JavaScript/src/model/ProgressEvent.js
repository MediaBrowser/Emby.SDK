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
* Enum class ProgressEvent.
* @enum {}
* @readonly
*/
export default class ProgressEvent {
        /**
         * value: "TimeUpdate"
         * @const
         */
        timeUpdate = "TimeUpdate";

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
         * value: "VolumeChange"
         * @const
         */
        volumeChange = "VolumeChange";

        /**
         * value: "RepeatModeChange"
         * @const
         */
        repeatModeChange = "RepeatModeChange";

        /**
         * value: "AudioTrackChange"
         * @const
         */
        audioTrackChange = "AudioTrackChange";

        /**
         * value: "SubtitleTrackChange"
         * @const
         */
        subtitleTrackChange = "SubtitleTrackChange";

        /**
         * value: "PlaylistItemMove"
         * @const
         */
        playlistItemMove = "PlaylistItemMove";

        /**
         * value: "PlaylistItemRemove"
         * @const
         */
        playlistItemRemove = "PlaylistItemRemove";

        /**
         * value: "PlaylistItemAdd"
         * @const
         */
        playlistItemAdd = "PlaylistItemAdd";

        /**
         * value: "QualityChange"
         * @const
         */
        qualityChange = "QualityChange";

        /**
         * value: "StateChange"
         * @const
         */
        stateChange = "StateChange";

        /**
         * value: "SubtitleOffsetChange"
         * @const
         */
        subtitleOffsetChange = "SubtitleOffsetChange";

        /**
         * value: "PlaybackRateChange"
         * @const
         */
        playbackRateChange = "PlaybackRateChange";

        /**
         * value: "ShuffleChange"
         * @const
         */
        shuffleChange = "ShuffleChange";


    /**
    * Returns a <code>ProgressEvent</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ProgressEvent} The enum <code>ProgressEvent</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
