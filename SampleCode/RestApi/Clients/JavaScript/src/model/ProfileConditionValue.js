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
* Enum class ProfileConditionValue.
* @enum {}
* @readonly
*/
export default class ProfileConditionValue {
        /**
         * value: "AudioChannels"
         * @const
         */
        AudioChannels = "AudioChannels";

        /**
         * value: "AudioBitrate"
         * @const
         */
        AudioBitrate = "AudioBitrate";

        /**
         * value: "AudioProfile"
         * @const
         */
        AudioProfile = "AudioProfile";

        /**
         * value: "Width"
         * @const
         */
        Width = "Width";

        /**
         * value: "Height"
         * @const
         */
        Height = "Height";

        /**
         * value: "Has64BitOffsets"
         * @const
         */
        Has64BitOffsets = "Has64BitOffsets";

        /**
         * value: "PacketLength"
         * @const
         */
        PacketLength = "PacketLength";

        /**
         * value: "VideoBitDepth"
         * @const
         */
        VideoBitDepth = "VideoBitDepth";

        /**
         * value: "VideoBitrate"
         * @const
         */
        VideoBitrate = "VideoBitrate";

        /**
         * value: "VideoFramerate"
         * @const
         */
        VideoFramerate = "VideoFramerate";

        /**
         * value: "VideoLevel"
         * @const
         */
        VideoLevel = "VideoLevel";

        /**
         * value: "VideoProfile"
         * @const
         */
        VideoProfile = "VideoProfile";

        /**
         * value: "VideoTimestamp"
         * @const
         */
        VideoTimestamp = "VideoTimestamp";

        /**
         * value: "IsAnamorphic"
         * @const
         */
        IsAnamorphic = "IsAnamorphic";

        /**
         * value: "RefFrames"
         * @const
         */
        RefFrames = "RefFrames";

        /**
         * value: "NumAudioStreams"
         * @const
         */
        NumAudioStreams = "NumAudioStreams";

        /**
         * value: "NumVideoStreams"
         * @const
         */
        NumVideoStreams = "NumVideoStreams";

        /**
         * value: "IsSecondaryAudio"
         * @const
         */
        IsSecondaryAudio = "IsSecondaryAudio";

        /**
         * value: "VideoCodecTag"
         * @const
         */
        VideoCodecTag = "VideoCodecTag";

        /**
         * value: "IsAvc"
         * @const
         */
        IsAvc = "IsAvc";

        /**
         * value: "IsInterlaced"
         * @const
         */
        IsInterlaced = "IsInterlaced";

        /**
         * value: "AudioSampleRate"
         * @const
         */
        AudioSampleRate = "AudioSampleRate";

        /**
         * value: "AudioBitDepth"
         * @const
         */
        AudioBitDepth = "AudioBitDepth";

        /**
         * value: "VideoRange"
         * @const
         */
        VideoRange = "VideoRange";

        /**
         * value: "VideoRotation"
         * @const
         */
        VideoRotation = "VideoRotation";


    /**
    * Returns a <code>ProfileConditionValue</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ProfileConditionValue} The enum <code>ProfileConditionValue</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
