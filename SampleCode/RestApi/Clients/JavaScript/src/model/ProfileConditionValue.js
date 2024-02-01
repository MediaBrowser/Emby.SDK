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
* Enum class ProfileConditionValue.
* @enum {}
* @readonly
*/
export default class ProfileConditionValue {
        /**
         * value: "AudioChannels"
         * @const
         */
        audioChannels = "AudioChannels";

        /**
         * value: "AudioBitrate"
         * @const
         */
        audioBitrate = "AudioBitrate";

        /**
         * value: "AudioProfile"
         * @const
         */
        audioProfile = "AudioProfile";

        /**
         * value: "Width"
         * @const
         */
        width = "Width";

        /**
         * value: "Height"
         * @const
         */
        height = "Height";

        /**
         * value: "Has64BitOffsets"
         * @const
         */
        has64BitOffsets = "Has64BitOffsets";

        /**
         * value: "PacketLength"
         * @const
         */
        packetLength = "PacketLength";

        /**
         * value: "VideoBitDepth"
         * @const
         */
        videoBitDepth = "VideoBitDepth";

        /**
         * value: "VideoBitrate"
         * @const
         */
        videoBitrate = "VideoBitrate";

        /**
         * value: "VideoFramerate"
         * @const
         */
        videoFramerate = "VideoFramerate";

        /**
         * value: "VideoLevel"
         * @const
         */
        videoLevel = "VideoLevel";

        /**
         * value: "VideoProfile"
         * @const
         */
        videoProfile = "VideoProfile";

        /**
         * value: "VideoTimestamp"
         * @const
         */
        videoTimestamp = "VideoTimestamp";

        /**
         * value: "IsAnamorphic"
         * @const
         */
        isAnamorphic = "IsAnamorphic";

        /**
         * value: "RefFrames"
         * @const
         */
        refFrames = "RefFrames";

        /**
         * value: "NumAudioStreams"
         * @const
         */
        numAudioStreams = "NumAudioStreams";

        /**
         * value: "NumVideoStreams"
         * @const
         */
        numVideoStreams = "NumVideoStreams";

        /**
         * value: "IsSecondaryAudio"
         * @const
         */
        isSecondaryAudio = "IsSecondaryAudio";

        /**
         * value: "VideoCodecTag"
         * @const
         */
        videoCodecTag = "VideoCodecTag";

        /**
         * value: "IsAvc"
         * @const
         */
        isAvc = "IsAvc";

        /**
         * value: "IsInterlaced"
         * @const
         */
        isInterlaced = "IsInterlaced";

        /**
         * value: "AudioSampleRate"
         * @const
         */
        audioSampleRate = "AudioSampleRate";

        /**
         * value: "AudioBitDepth"
         * @const
         */
        audioBitDepth = "AudioBitDepth";

        /**
         * value: "VideoRange"
         * @const
         */
        videoRange = "VideoRange";

        /**
         * value: "VideoRotation"
         * @const
         */
        videoRotation = "VideoRotation";


    /**
    * Returns a <code>ProfileConditionValue</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ProfileConditionValue} The enum <code>ProfileConditionValue</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
