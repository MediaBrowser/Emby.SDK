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
* Enum class TranscodeReason.
* @enum {}
* @readonly
*/
export default class TranscodeReason {
        /**
         * value: "ContainerNotSupported"
         * @const
         */
        containerNotSupported = "ContainerNotSupported";

        /**
         * value: "VideoCodecNotSupported"
         * @const
         */
        videoCodecNotSupported = "VideoCodecNotSupported";

        /**
         * value: "AudioCodecNotSupported"
         * @const
         */
        audioCodecNotSupported = "AudioCodecNotSupported";

        /**
         * value: "ContainerBitrateExceedsLimit"
         * @const
         */
        containerBitrateExceedsLimit = "ContainerBitrateExceedsLimit";

        /**
         * value: "AudioBitrateNotSupported"
         * @const
         */
        audioBitrateNotSupported = "AudioBitrateNotSupported";

        /**
         * value: "AudioChannelsNotSupported"
         * @const
         */
        audioChannelsNotSupported = "AudioChannelsNotSupported";

        /**
         * value: "VideoResolutionNotSupported"
         * @const
         */
        videoResolutionNotSupported = "VideoResolutionNotSupported";

        /**
         * value: "UnknownVideoStreamInfo"
         * @const
         */
        unknownVideoStreamInfo = "UnknownVideoStreamInfo";

        /**
         * value: "UnknownAudioStreamInfo"
         * @const
         */
        unknownAudioStreamInfo = "UnknownAudioStreamInfo";

        /**
         * value: "AudioProfileNotSupported"
         * @const
         */
        audioProfileNotSupported = "AudioProfileNotSupported";

        /**
         * value: "AudioSampleRateNotSupported"
         * @const
         */
        audioSampleRateNotSupported = "AudioSampleRateNotSupported";

        /**
         * value: "AnamorphicVideoNotSupported"
         * @const
         */
        anamorphicVideoNotSupported = "AnamorphicVideoNotSupported";

        /**
         * value: "InterlacedVideoNotSupported"
         * @const
         */
        interlacedVideoNotSupported = "InterlacedVideoNotSupported";

        /**
         * value: "SecondaryAudioNotSupported"
         * @const
         */
        secondaryAudioNotSupported = "SecondaryAudioNotSupported";

        /**
         * value: "RefFramesNotSupported"
         * @const
         */
        refFramesNotSupported = "RefFramesNotSupported";

        /**
         * value: "VideoBitDepthNotSupported"
         * @const
         */
        videoBitDepthNotSupported = "VideoBitDepthNotSupported";

        /**
         * value: "VideoBitrateNotSupported"
         * @const
         */
        videoBitrateNotSupported = "VideoBitrateNotSupported";

        /**
         * value: "VideoFramerateNotSupported"
         * @const
         */
        videoFramerateNotSupported = "VideoFramerateNotSupported";

        /**
         * value: "VideoLevelNotSupported"
         * @const
         */
        videoLevelNotSupported = "VideoLevelNotSupported";

        /**
         * value: "VideoProfileNotSupported"
         * @const
         */
        videoProfileNotSupported = "VideoProfileNotSupported";

        /**
         * value: "AudioBitDepthNotSupported"
         * @const
         */
        audioBitDepthNotSupported = "AudioBitDepthNotSupported";

        /**
         * value: "SubtitleCodecNotSupported"
         * @const
         */
        subtitleCodecNotSupported = "SubtitleCodecNotSupported";

        /**
         * value: "DirectPlayError"
         * @const
         */
        directPlayError = "DirectPlayError";

        /**
         * value: "VideoRangeNotSupported"
         * @const
         */
        videoRangeNotSupported = "VideoRangeNotSupported";

        /**
         * value: "SubtitleContentOptionsEnabled"
         * @const
         */
        subtitleContentOptionsEnabled = "SubtitleContentOptionsEnabled";


    /**
    * Returns a <code>TranscodeReason</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TranscodeReason} The enum <code>TranscodeReason</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
