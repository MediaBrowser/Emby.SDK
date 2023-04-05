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
import DlnaDlnaProfileType from './DlnaDlnaProfileType';
import DlnaEncodingContext from './DlnaEncodingContext';
import DlnaTranscodeSeekInfo from './DlnaTranscodeSeekInfo';

/**
* The DlnaTranscodingProfile model module.
* @module model/DlnaTranscodingProfile
* @version 4.8.0.29
*/
export default class DlnaTranscodingProfile {
    /**
    * Constructs a new <code>DlnaTranscodingProfile</code>.
    * @alias module:model/DlnaTranscodingProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaTranscodingProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaTranscodingProfile} obj Optional instance to populate.
    * @return {module:model/DlnaTranscodingProfile} The populated <code>DlnaTranscodingProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaTranscodingProfile();
                        
            
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaDlnaProfileType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('VideoCodec')) {
                obj['VideoCodec'] = ApiClient.convertToType(data['VideoCodec'], 'String');
            }
            if (data.hasOwnProperty('AudioCodec')) {
                obj['AudioCodec'] = ApiClient.convertToType(data['AudioCodec'], 'String');
            }
            if (data.hasOwnProperty('Protocol')) {
                obj['Protocol'] = ApiClient.convertToType(data['Protocol'], 'String');
            }
            if (data.hasOwnProperty('EstimateContentLength')) {
                obj['EstimateContentLength'] = ApiClient.convertToType(data['EstimateContentLength'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableMpegtsM2TsMode')) {
                obj['EnableMpegtsM2TsMode'] = ApiClient.convertToType(data['EnableMpegtsM2TsMode'], 'Boolean');
            }
            if (data.hasOwnProperty('TranscodeSeekInfo')) {
                obj['TranscodeSeekInfo'] = DlnaTranscodeSeekInfo.constructFromObject(data['TranscodeSeekInfo']);
            }
            if (data.hasOwnProperty('CopyTimestamps')) {
                obj['CopyTimestamps'] = ApiClient.convertToType(data['CopyTimestamps'], 'Boolean');
            }
            if (data.hasOwnProperty('Context')) {
                obj['Context'] = DlnaEncodingContext.constructFromObject(data['Context']);
            }
            if (data.hasOwnProperty('MaxAudioChannels')) {
                obj['MaxAudioChannels'] = ApiClient.convertToType(data['MaxAudioChannels'], 'String');
            }
            if (data.hasOwnProperty('MinSegments')) {
                obj['MinSegments'] = ApiClient.convertToType(data['MinSegments'], 'Number');
            }
            if (data.hasOwnProperty('SegmentLength')) {
                obj['SegmentLength'] = ApiClient.convertToType(data['SegmentLength'], 'Number');
            }
            if (data.hasOwnProperty('BreakOnNonKeyFrames')) {
                obj['BreakOnNonKeyFrames'] = ApiClient.convertToType(data['BreakOnNonKeyFrames'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowInterlacedVideoStreamCopy')) {
                obj['AllowInterlacedVideoStreamCopy'] = ApiClient.convertToType(data['AllowInterlacedVideoStreamCopy'], 'Boolean');
            }
            if (data.hasOwnProperty('ManifestSubtitles')) {
                obj['ManifestSubtitles'] = ApiClient.convertToType(data['ManifestSubtitles'], 'String');
            }
            if (data.hasOwnProperty('MaxManifestSubtitles')) {
                obj['MaxManifestSubtitles'] = ApiClient.convertToType(data['MaxManifestSubtitles'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {module:model/DlnaDlnaProfileType} Type
    */
    'Type' = undefined;
    /**
    * @member {String} VideoCodec
    */
    'VideoCodec' = undefined;
    /**
    * @member {String} AudioCodec
    */
    'AudioCodec' = undefined;
    /**
    * @member {String} Protocol
    */
    'Protocol' = undefined;
    /**
    * @member {Boolean} EstimateContentLength
    */
    'EstimateContentLength' = undefined;
    /**
    * @member {Boolean} EnableMpegtsM2TsMode
    */
    'EnableMpegtsM2TsMode' = undefined;
    /**
    * @member {module:model/DlnaTranscodeSeekInfo} TranscodeSeekInfo
    */
    'TranscodeSeekInfo' = undefined;
    /**
    * @member {Boolean} CopyTimestamps
    */
    'CopyTimestamps' = undefined;
    /**
    * @member {module:model/DlnaEncodingContext} Context
    */
    'Context' = undefined;
    /**
    * @member {String} MaxAudioChannels
    */
    'MaxAudioChannels' = undefined;
    /**
    * @member {Number} MinSegments
    */
    'MinSegments' = undefined;
    /**
    * @member {Number} SegmentLength
    */
    'SegmentLength' = undefined;
    /**
    * @member {Boolean} BreakOnNonKeyFrames
    */
    'BreakOnNonKeyFrames' = undefined;
    /**
    * @member {Boolean} AllowInterlacedVideoStreamCopy
    */
    'AllowInterlacedVideoStreamCopy' = undefined;
    /**
    * @member {String} ManifestSubtitles
    */
    'ManifestSubtitles' = undefined;
    /**
    * @member {Number} MaxManifestSubtitles
    */
    'MaxManifestSubtitles' = undefined;




}
