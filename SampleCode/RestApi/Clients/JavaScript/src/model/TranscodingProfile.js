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
import DlnaProfileType from './DlnaProfileType';
import EncodingContext from './EncodingContext';
import TranscodeSeekInfo from './TranscodeSeekInfo';

/**
* The TranscodingProfile model module.
* @module model/TranscodingProfile
* @version 4.8.10.0
*/
export default class TranscodingProfile {
    /**
    * Constructs a new <code>TranscodingProfile</code>.
    * @alias module:model/TranscodingProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TranscodingProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TranscodingProfile} obj Optional instance to populate.
    * @return {module:model/TranscodingProfile} The populated <code>TranscodingProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TranscodingProfile();
                        
            
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaProfileType.constructFromObject(data['Type']);
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
                obj['TranscodeSeekInfo'] = TranscodeSeekInfo.constructFromObject(data['TranscodeSeekInfo']);
            }
            if (data.hasOwnProperty('CopyTimestamps')) {
                obj['CopyTimestamps'] = ApiClient.convertToType(data['CopyTimestamps'], 'Boolean');
            }
            if (data.hasOwnProperty('Context')) {
                obj['Context'] = EncodingContext.constructFromObject(data['Context']);
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
            if (data.hasOwnProperty('MaxWidth')) {
                obj['MaxWidth'] = ApiClient.convertToType(data['MaxWidth'], 'Number');
            }
            if (data.hasOwnProperty('MaxHeight')) {
                obj['MaxHeight'] = ApiClient.convertToType(data['MaxHeight'], 'Number');
            }
            if (data.hasOwnProperty('FillEmptySubtitleSegments')) {
                obj['FillEmptySubtitleSegments'] = ApiClient.convertToType(data['FillEmptySubtitleSegments'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {module:model/DlnaProfileType} Type
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
    * @member {module:model/TranscodeSeekInfo} TranscodeSeekInfo
    */
    'TranscodeSeekInfo' = undefined;
    /**
    * @member {Boolean} CopyTimestamps
    */
    'CopyTimestamps' = undefined;
    /**
    * @member {module:model/EncodingContext} Context
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
    /**
    * @member {Number} MaxWidth
    */
    'MaxWidth' = undefined;
    /**
    * @member {Number} MaxHeight
    */
    'MaxHeight' = undefined;
    /**
    * @member {Boolean} FillEmptySubtitleSegments
    */
    'FillEmptySubtitleSegments' = undefined;




}
