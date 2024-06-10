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
* Enum class TranscodeReason.
* @enum {}
* @readonly
*/
export default class TranscodeReason {
        /**
         * value: "ContainerNotSupported"
         * @const
         */
        ContainerNotSupported = "ContainerNotSupported";

        /**
         * value: "VideoCodecNotSupported"
         * @const
         */
        VideoCodecNotSupported = "VideoCodecNotSupported";

        /**
         * value: "AudioCodecNotSupported"
         * @const
         */
        AudioCodecNotSupported = "AudioCodecNotSupported";

        /**
         * value: "ContainerBitrateExceedsLimit"
         * @const
         */
        ContainerBitrateExceedsLimit = "ContainerBitrateExceedsLimit";

        /**
         * value: "AudioBitrateNotSupported"
         * @const
         */
        AudioBitrateNotSupported = "AudioBitrateNotSupported";

        /**
         * value: "AudioChannelsNotSupported"
         * @const
         */
        AudioChannelsNotSupported = "AudioChannelsNotSupported";

        /**
         * value: "VideoResolutionNotSupported"
         * @const
         */
        VideoResolutionNotSupported = "VideoResolutionNotSupported";

        /**
         * value: "UnknownVideoStreamInfo"
         * @const
         */
        UnknownVideoStreamInfo = "UnknownVideoStreamInfo";

        /**
         * value: "UnknownAudioStreamInfo"
         * @const
         */
        UnknownAudioStreamInfo = "UnknownAudioStreamInfo";

        /**
         * value: "AudioProfileNotSupported"
         * @const
         */
        AudioProfileNotSupported = "AudioProfileNotSupported";

        /**
         * value: "AudioSampleRateNotSupported"
         * @const
         */
        AudioSampleRateNotSupported = "AudioSampleRateNotSupported";

        /**
         * value: "AnamorphicVideoNotSupported"
         * @const
         */
        AnamorphicVideoNotSupported = "AnamorphicVideoNotSupported";

        /**
         * value: "InterlacedVideoNotSupported"
         * @const
         */
        InterlacedVideoNotSupported = "InterlacedVideoNotSupported";

        /**
         * value: "SecondaryAudioNotSupported"
         * @const
         */
        SecondaryAudioNotSupported = "SecondaryAudioNotSupported";

        /**
         * value: "RefFramesNotSupported"
         * @const
         */
        RefFramesNotSupported = "RefFramesNotSupported";

        /**
         * value: "VideoBitDepthNotSupported"
         * @const
         */
        VideoBitDepthNotSupported = "VideoBitDepthNotSupported";

        /**
         * value: "VideoBitrateNotSupported"
         * @const
         */
        VideoBitrateNotSupported = "VideoBitrateNotSupported";

        /**
         * value: "VideoFramerateNotSupported"
         * @const
         */
        VideoFramerateNotSupported = "VideoFramerateNotSupported";

        /**
         * value: "VideoLevelNotSupported"
         * @const
         */
        VideoLevelNotSupported = "VideoLevelNotSupported";

        /**
         * value: "VideoProfileNotSupported"
         * @const
         */
        VideoProfileNotSupported = "VideoProfileNotSupported";

        /**
         * value: "AudioBitDepthNotSupported"
         * @const
         */
        AudioBitDepthNotSupported = "AudioBitDepthNotSupported";

        /**
         * value: "SubtitleCodecNotSupported"
         * @const
         */
        SubtitleCodecNotSupported = "SubtitleCodecNotSupported";

        /**
         * value: "DirectPlayError"
         * @const
         */
        DirectPlayError = "DirectPlayError";

        /**
         * value: "VideoRangeNotSupported"
         * @const
         */
        VideoRangeNotSupported = "VideoRangeNotSupported";

        /**
         * value: "SubtitleContentOptionsEnabled"
         * @const
         */
        SubtitleContentOptionsEnabled = "SubtitleContentOptionsEnabled";


    /**
    * Returns a <code>TranscodeReason</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TranscodeReason} The enum <code>TranscodeReason</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
