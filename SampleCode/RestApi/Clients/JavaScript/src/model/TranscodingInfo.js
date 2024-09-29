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
import ProcessRunMetricsProcessStatistics from './ProcessRunMetricsProcessStatistics';
import TranscodeReason from './TranscodeReason';
import TranscodingVpStepInfo from './TranscodingVpStepInfo';
import TupleDoubleDouble from './TupleDoubleDouble';

/**
* The TranscodingInfo model module.
* @module model/TranscodingInfo
* @version 4.8.10.0
*/
export default class TranscodingInfo {
    /**
    * Constructs a new <code>TranscodingInfo</code>.
    * @alias module:model/TranscodingInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TranscodingInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TranscodingInfo} obj Optional instance to populate.
    * @return {module:model/TranscodingInfo} The populated <code>TranscodingInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TranscodingInfo();
                        
            
            if (data.hasOwnProperty('AudioCodec')) {
                obj['AudioCodec'] = ApiClient.convertToType(data['AudioCodec'], 'String');
            }
            if (data.hasOwnProperty('VideoCodec')) {
                obj['VideoCodec'] = ApiClient.convertToType(data['VideoCodec'], 'String');
            }
            if (data.hasOwnProperty('SubProtocol')) {
                obj['SubProtocol'] = ApiClient.convertToType(data['SubProtocol'], 'String');
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('IsVideoDirect')) {
                obj['IsVideoDirect'] = ApiClient.convertToType(data['IsVideoDirect'], 'Boolean');
            }
            if (data.hasOwnProperty('IsAudioDirect')) {
                obj['IsAudioDirect'] = ApiClient.convertToType(data['IsAudioDirect'], 'Boolean');
            }
            if (data.hasOwnProperty('Bitrate')) {
                obj['Bitrate'] = ApiClient.convertToType(data['Bitrate'], 'Number');
            }
            if (data.hasOwnProperty('AudioBitrate')) {
                obj['AudioBitrate'] = ApiClient.convertToType(data['AudioBitrate'], 'Number');
            }
            if (data.hasOwnProperty('VideoBitrate')) {
                obj['VideoBitrate'] = ApiClient.convertToType(data['VideoBitrate'], 'Number');
            }
            if (data.hasOwnProperty('Framerate')) {
                obj['Framerate'] = ApiClient.convertToType(data['Framerate'], 'Number');
            }
            if (data.hasOwnProperty('CompletionPercentage')) {
                obj['CompletionPercentage'] = ApiClient.convertToType(data['CompletionPercentage'], 'Number');
            }
            if (data.hasOwnProperty('TranscodingPositionTicks')) {
                obj['TranscodingPositionTicks'] = ApiClient.convertToType(data['TranscodingPositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('TranscodingStartPositionTicks')) {
                obj['TranscodingStartPositionTicks'] = ApiClient.convertToType(data['TranscodingStartPositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
            if (data.hasOwnProperty('AudioChannels')) {
                obj['AudioChannels'] = ApiClient.convertToType(data['AudioChannels'], 'Number');
            }
            if (data.hasOwnProperty('TranscodeReasons')) {
                obj['TranscodeReasons'] = ApiClient.convertToType(data['TranscodeReasons'], [TranscodeReason]);
            }
            if (data.hasOwnProperty('CurrentCpuUsage')) {
                obj['CurrentCpuUsage'] = ApiClient.convertToType(data['CurrentCpuUsage'], 'Number');
            }
            if (data.hasOwnProperty('AverageCpuUsage')) {
                obj['AverageCpuUsage'] = ApiClient.convertToType(data['AverageCpuUsage'], 'Number');
            }
            if (data.hasOwnProperty('CpuHistory')) {
                obj['CpuHistory'] = ApiClient.convertToType(data['CpuHistory'], [TupleDoubleDouble]);
            }
            if (data.hasOwnProperty('ProcessStatistics')) {
                obj['ProcessStatistics'] = ProcessRunMetricsProcessStatistics.constructFromObject(data['ProcessStatistics']);
            }
            if (data.hasOwnProperty('CurrentThrottle')) {
                obj['CurrentThrottle'] = ApiClient.convertToType(data['CurrentThrottle'], 'Number');
            }
            if (data.hasOwnProperty('VideoDecoder')) {
                obj['VideoDecoder'] = ApiClient.convertToType(data['VideoDecoder'], 'String');
            }
            if (data.hasOwnProperty('VideoDecoderIsHardware')) {
                obj['VideoDecoderIsHardware'] = ApiClient.convertToType(data['VideoDecoderIsHardware'], 'Boolean');
            }
            if (data.hasOwnProperty('VideoDecoderMediaType')) {
                obj['VideoDecoderMediaType'] = ApiClient.convertToType(data['VideoDecoderMediaType'], 'String');
            }
            if (data.hasOwnProperty('VideoDecoderHwAccel')) {
                obj['VideoDecoderHwAccel'] = ApiClient.convertToType(data['VideoDecoderHwAccel'], 'String');
            }
            if (data.hasOwnProperty('VideoEncoder')) {
                obj['VideoEncoder'] = ApiClient.convertToType(data['VideoEncoder'], 'String');
            }
            if (data.hasOwnProperty('VideoEncoderIsHardware')) {
                obj['VideoEncoderIsHardware'] = ApiClient.convertToType(data['VideoEncoderIsHardware'], 'Boolean');
            }
            if (data.hasOwnProperty('VideoEncoderMediaType')) {
                obj['VideoEncoderMediaType'] = ApiClient.convertToType(data['VideoEncoderMediaType'], 'String');
            }
            if (data.hasOwnProperty('VideoEncoderHwAccel')) {
                obj['VideoEncoderHwAccel'] = ApiClient.convertToType(data['VideoEncoderHwAccel'], 'String');
            }
            if (data.hasOwnProperty('VideoPipelineInfo')) {
                obj['VideoPipelineInfo'] = ApiClient.convertToType(data['VideoPipelineInfo'], [TranscodingVpStepInfo]);
            }
            if (data.hasOwnProperty('SubtitlePipelineInfos')) {
                obj['SubtitlePipelineInfos'] = ApiClient.convertToType(data['SubtitlePipelineInfos'], [[TranscodingVpStepInfo]]);
            }
        }
        return obj;
    }

    /**
    * @member {String} AudioCodec
    */
    'AudioCodec' = undefined;
    /**
    * @member {String} VideoCodec
    */
    'VideoCodec' = undefined;
    /**
    * @member {String} SubProtocol
    */
    'SubProtocol' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {Boolean} IsVideoDirect
    */
    'IsVideoDirect' = undefined;
    /**
    * @member {Boolean} IsAudioDirect
    */
    'IsAudioDirect' = undefined;
    /**
    * @member {Number} Bitrate
    */
    'Bitrate' = undefined;
    /**
    * @member {Number} AudioBitrate
    */
    'AudioBitrate' = undefined;
    /**
    * @member {Number} VideoBitrate
    */
    'VideoBitrate' = undefined;
    /**
    * @member {Number} Framerate
    */
    'Framerate' = undefined;
    /**
    * @member {Number} CompletionPercentage
    */
    'CompletionPercentage' = undefined;
    /**
    * @member {Number} TranscodingPositionTicks
    */
    'TranscodingPositionTicks' = undefined;
    /**
    * @member {Number} TranscodingStartPositionTicks
    */
    'TranscodingStartPositionTicks' = undefined;
    /**
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * @member {Number} AudioChannels
    */
    'AudioChannels' = undefined;
    /**
    * @member {Array.<module:model/TranscodeReason>} TranscodeReasons
    */
    'TranscodeReasons' = undefined;
    /**
    * Deprecated, please use ProcessStatistics instead
    * @member {Number} CurrentCpuUsage
    */
    'CurrentCpuUsage' = undefined;
    /**
    * Deprecated, please use ProcessStatistics instead
    * @member {Number} AverageCpuUsage
    */
    'AverageCpuUsage' = undefined;
    /**
    * Deprecated, please use ProcessStatistics instead
    * @member {Array.<module:model/TupleDoubleDouble>} CpuHistory
    */
    'CpuHistory' = undefined;
    /**
    * @member {module:model/ProcessRunMetricsProcessStatistics} ProcessStatistics
    */
    'ProcessStatistics' = undefined;
    /**
    * @member {Number} CurrentThrottle
    */
    'CurrentThrottle' = undefined;
    /**
    * @member {String} VideoDecoder
    */
    'VideoDecoder' = undefined;
    /**
    * @member {Boolean} VideoDecoderIsHardware
    */
    'VideoDecoderIsHardware' = undefined;
    /**
    * @member {String} VideoDecoderMediaType
    */
    'VideoDecoderMediaType' = undefined;
    /**
    * @member {String} VideoDecoderHwAccel
    */
    'VideoDecoderHwAccel' = undefined;
    /**
    * @member {String} VideoEncoder
    */
    'VideoEncoder' = undefined;
    /**
    * @member {Boolean} VideoEncoderIsHardware
    */
    'VideoEncoderIsHardware' = undefined;
    /**
    * @member {String} VideoEncoderMediaType
    */
    'VideoEncoderMediaType' = undefined;
    /**
    * @member {String} VideoEncoderHwAccel
    */
    'VideoEncoderHwAccel' = undefined;
    /**
    * @member {Array.<module:model/TranscodingVpStepInfo>} VideoPipelineInfo
    */
    'VideoPipelineInfo' = undefined;
    /**
    * @member {Array.<Array.<module:model/TranscodingVpStepInfo>>} SubtitlePipelineInfos
    */
    'SubtitlePipelineInfos' = undefined;




}
