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
import ExtendedVideoSubTypes from './ExtendedVideoSubTypes';
import ExtendedVideoTypes from './ExtendedVideoTypes';
import MediaProtocol from './MediaProtocol';
import MediaStreamType from './MediaStreamType';
import SubtitleDeliveryMethod from './SubtitleDeliveryMethod';
import SubtitleLocationType from './SubtitleLocationType';

/**
* The MediaStream model module.
* @module model/MediaStream
* @version 4.8.10.0
*/
export default class MediaStream {
    /**
    * Constructs a new <code>MediaStream</code>.
    * MediaStream information.      MediaStream itens are typically included in a &#x60;MediaBrowser.Model.Dto.MediaSourceInfo&#x60; object.      &#x60;MediaBrowser.Model.Dto.MediaSourceInfo.MediaStreams&#x60;  
    * @alias module:model/MediaStream
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaStream</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaStream} obj Optional instance to populate.
    * @return {module:model/MediaStream} The populated <code>MediaStream</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaStream();
                        
            
            if (data.hasOwnProperty('Codec')) {
                obj['Codec'] = ApiClient.convertToType(data['Codec'], 'String');
            }
            if (data.hasOwnProperty('CodecTag')) {
                obj['CodecTag'] = ApiClient.convertToType(data['CodecTag'], 'String');
            }
            if (data.hasOwnProperty('Language')) {
                obj['Language'] = ApiClient.convertToType(data['Language'], 'String');
            }
            if (data.hasOwnProperty('ColorTransfer')) {
                obj['ColorTransfer'] = ApiClient.convertToType(data['ColorTransfer'], 'String');
            }
            if (data.hasOwnProperty('ColorPrimaries')) {
                obj['ColorPrimaries'] = ApiClient.convertToType(data['ColorPrimaries'], 'String');
            }
            if (data.hasOwnProperty('ColorSpace')) {
                obj['ColorSpace'] = ApiClient.convertToType(data['ColorSpace'], 'String');
            }
            if (data.hasOwnProperty('Comment')) {
                obj['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
            }
            if (data.hasOwnProperty('StreamStartTimeTicks')) {
                obj['StreamStartTimeTicks'] = ApiClient.convertToType(data['StreamStartTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('TimeBase')) {
                obj['TimeBase'] = ApiClient.convertToType(data['TimeBase'], 'String');
            }
            if (data.hasOwnProperty('Title')) {
                obj['Title'] = ApiClient.convertToType(data['Title'], 'String');
            }
            if (data.hasOwnProperty('Extradata')) {
                obj['Extradata'] = ApiClient.convertToType(data['Extradata'], 'String');
            }
            if (data.hasOwnProperty('VideoRange')) {
                obj['VideoRange'] = ApiClient.convertToType(data['VideoRange'], 'String');
            }
            if (data.hasOwnProperty('DisplayTitle')) {
                obj['DisplayTitle'] = ApiClient.convertToType(data['DisplayTitle'], 'String');
            }
            if (data.hasOwnProperty('DisplayLanguage')) {
                obj['DisplayLanguage'] = ApiClient.convertToType(data['DisplayLanguage'], 'String');
            }
            if (data.hasOwnProperty('NalLengthSize')) {
                obj['NalLengthSize'] = ApiClient.convertToType(data['NalLengthSize'], 'String');
            }
            if (data.hasOwnProperty('IsInterlaced')) {
                obj['IsInterlaced'] = ApiClient.convertToType(data['IsInterlaced'], 'Boolean');
            }
            if (data.hasOwnProperty('IsAVC')) {
                obj['IsAVC'] = ApiClient.convertToType(data['IsAVC'], 'Boolean');
            }
            if (data.hasOwnProperty('ChannelLayout')) {
                obj['ChannelLayout'] = ApiClient.convertToType(data['ChannelLayout'], 'String');
            }
            if (data.hasOwnProperty('BitRate')) {
                obj['BitRate'] = ApiClient.convertToType(data['BitRate'], 'Number');
            }
            if (data.hasOwnProperty('BitDepth')) {
                obj['BitDepth'] = ApiClient.convertToType(data['BitDepth'], 'Number');
            }
            if (data.hasOwnProperty('RefFrames')) {
                obj['RefFrames'] = ApiClient.convertToType(data['RefFrames'], 'Number');
            }
            if (data.hasOwnProperty('Rotation')) {
                obj['Rotation'] = ApiClient.convertToType(data['Rotation'], 'Number');
            }
            if (data.hasOwnProperty('Channels')) {
                obj['Channels'] = ApiClient.convertToType(data['Channels'], 'Number');
            }
            if (data.hasOwnProperty('SampleRate')) {
                obj['SampleRate'] = ApiClient.convertToType(data['SampleRate'], 'Number');
            }
            if (data.hasOwnProperty('IsDefault')) {
                obj['IsDefault'] = ApiClient.convertToType(data['IsDefault'], 'Boolean');
            }
            if (data.hasOwnProperty('IsForced')) {
                obj['IsForced'] = ApiClient.convertToType(data['IsForced'], 'Boolean');
            }
            if (data.hasOwnProperty('IsHearingImpaired')) {
                obj['IsHearingImpaired'] = ApiClient.convertToType(data['IsHearingImpaired'], 'Boolean');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('AverageFrameRate')) {
                obj['AverageFrameRate'] = ApiClient.convertToType(data['AverageFrameRate'], 'Number');
            }
            if (data.hasOwnProperty('RealFrameRate')) {
                obj['RealFrameRate'] = ApiClient.convertToType(data['RealFrameRate'], 'Number');
            }
            if (data.hasOwnProperty('Profile')) {
                obj['Profile'] = ApiClient.convertToType(data['Profile'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = MediaStreamType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('AspectRatio')) {
                obj['AspectRatio'] = ApiClient.convertToType(data['AspectRatio'], 'String');
            }
            if (data.hasOwnProperty('Index')) {
                obj['Index'] = ApiClient.convertToType(data['Index'], 'Number');
            }
            if (data.hasOwnProperty('IsExternal')) {
                obj['IsExternal'] = ApiClient.convertToType(data['IsExternal'], 'Boolean');
            }
            if (data.hasOwnProperty('DeliveryMethod')) {
                obj['DeliveryMethod'] = SubtitleDeliveryMethod.constructFromObject(data['DeliveryMethod']);
            }
            if (data.hasOwnProperty('DeliveryUrl')) {
                obj['DeliveryUrl'] = ApiClient.convertToType(data['DeliveryUrl'], 'String');
            }
            if (data.hasOwnProperty('IsExternalUrl')) {
                obj['IsExternalUrl'] = ApiClient.convertToType(data['IsExternalUrl'], 'Boolean');
            }
            if (data.hasOwnProperty('IsTextSubtitleStream')) {
                obj['IsTextSubtitleStream'] = ApiClient.convertToType(data['IsTextSubtitleStream'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsExternalStream')) {
                obj['SupportsExternalStream'] = ApiClient.convertToType(data['SupportsExternalStream'], 'Boolean');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('Protocol')) {
                obj['Protocol'] = MediaProtocol.constructFromObject(data['Protocol']);
            }
            if (data.hasOwnProperty('PixelFormat')) {
                obj['PixelFormat'] = ApiClient.convertToType(data['PixelFormat'], 'String');
            }
            if (data.hasOwnProperty('Level')) {
                obj['Level'] = ApiClient.convertToType(data['Level'], 'Number');
            }
            if (data.hasOwnProperty('IsAnamorphic')) {
                obj['IsAnamorphic'] = ApiClient.convertToType(data['IsAnamorphic'], 'Boolean');
            }
            if (data.hasOwnProperty('ExtendedVideoType')) {
                obj['ExtendedVideoType'] = ExtendedVideoTypes.constructFromObject(data['ExtendedVideoType']);
            }
            if (data.hasOwnProperty('ExtendedVideoSubType')) {
                obj['ExtendedVideoSubType'] = ExtendedVideoSubTypes.constructFromObject(data['ExtendedVideoSubType']);
            }
            if (data.hasOwnProperty('ExtendedVideoSubTypeDescription')) {
                obj['ExtendedVideoSubTypeDescription'] = ApiClient.convertToType(data['ExtendedVideoSubTypeDescription'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('AttachmentSize')) {
                obj['AttachmentSize'] = ApiClient.convertToType(data['AttachmentSize'], 'Number');
            }
            if (data.hasOwnProperty('MimeType')) {
                obj['MimeType'] = ApiClient.convertToType(data['MimeType'], 'String');
            }
            if (data.hasOwnProperty('SubtitleLocationType')) {
                obj['SubtitleLocationType'] = SubtitleLocationType.constructFromObject(data['SubtitleLocationType']);
            }
        }
        return obj;
    }

    /**
    * The codec.    Probe Field: `codec_name`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`    Related Enums: `T:Emby.Media.Model.Enums.VideoMediaTypes`, `Emby.Media.Model.Enums.AudioMediaTypes`, `Emby.Media.Model.Enums.SubtitleMediaTypes`.
    * @member {String} Codec
    */
    'Codec' = undefined;
    /**
    * The codec tag.    Probe Field: `codec_tag`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {String} CodecTag
    */
    'CodecTag' = undefined;
    /**
    * The language.    Probe Field: `tags[\"language\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {String} Language
    */
    'Language' = undefined;
    /**
    * The color transfer characteristics.    Probe Field: `color_transfer`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorTransfers`.
    * @member {String} ColorTransfer
    */
    'ColorTransfer' = undefined;
    /**
    * The chromaticity coordinates of the source primaries.    Probe Field: `color_primaries`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorPrimaries`.
    * @member {String} ColorPrimaries
    */
    'ColorPrimaries' = undefined;
    /**
    * The YUV colorspace type.    Probe Field: `color_space`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorSpaces`.
    * @member {String} ColorSpace
    */
    'ColorSpace' = undefined;
    /**
    * The comment.    Probe Field: `tags[\"comment\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {String} Comment
    */
    'Comment' = undefined;
    /**
    * The start time of the stream.    Probe Field: `start_time`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Actual type: `System.TimeSpan`.
    * @member {Number} StreamStartTimeTicks
    */
    'StreamStartTimeTicks' = undefined;
    /**
    * The time\\-base.    Probe Field: `time_base`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Actual type: `Emby.Media.Model.Types.Rational`.
    * @member {String} TimeBase
    */
    'TimeBase' = undefined;
    /**
    * The title.    Probe Field: `tags[\"title\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {String} Title
    */
    'Title' = undefined;
    /**
    * The extradata.    Probe Field: `extradata`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Currently, this value is only parsed for subtitle streams with codec `Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext`.
    * @member {String} Extradata
    */
    'Extradata' = undefined;
    /**
    * @member {String} VideoRange
    */
    'VideoRange' = undefined;
    /**
    * The display title.    Custom property set by the application.
    * @member {String} DisplayTitle
    */
    'DisplayTitle' = undefined;
    /**
    * The display language.    Custom property set by the application.
    * @member {String} DisplayLanguage
    */
    'DisplayLanguage' = undefined;
    /**
    * The nal length size.    Probe Field: `nal_length_size`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video` of type `Emby.Media.Model.Enums.VideoMediaTypes.h264`.    Actual type: `System.Int32`.
    * @member {String} NalLengthSize
    */
    'NalLengthSize' = undefined;
    /**
    * A value indicating whether this instance is interlaced.    Probe Field: `field_order` \\!\\= `progressive`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
    * @member {Boolean} IsInterlaced
    */
    'IsInterlaced' = undefined;
    /**
    * @member {Boolean} IsAVC
    */
    'IsAVC' = undefined;
    /**
    * The channel layout.    Probe Field: `channel_layout`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enum: `MediaBrowser.Model.Entities.MediaStream.ChannelLayout`.
    * @member {String} ChannelLayout
    */
    'ChannelLayout' = undefined;
    /**
    * The bit rate.    Probe Field: `bit_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!
    * @member {Number} BitRate
    */
    'BitRate' = undefined;
    /**
    * The bit depth.    Probe Field: `bits_per_sample` or `bits_per_raw_sample`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`.
    * @member {Number} BitDepth
    */
    'BitDepth' = undefined;
    /**
    * The reference frames.    Probe Field: `refs`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
    * @member {Number} RefFrames
    */
    'RefFrames' = undefined;
    /**
    * @member {Number} Rotation
    */
    'Rotation' = undefined;
    /**
    * The audio channel count.    Probe Field: `channels`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`.
    * @member {Number} Channels
    */
    'Channels' = undefined;
    /**
    * The sample rate.    Probe Field: `sample_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enum: `Emby.Media.Model.Enums.SampleRates`.
    * @member {Number} SampleRate
    */
    'SampleRate' = undefined;
    /**
    * A value indicating whether this instance is default.    Probe Field: `disposition[\"default\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {Boolean} IsDefault
    */
    'IsDefault' = undefined;
    /**
    * A value indicating whether this instance is forced.    Probe Field: `disposition[\"forced\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {Boolean} IsForced
    */
    'IsForced' = undefined;
    /**
    * @member {Boolean} IsHearingImpaired
    */
    'IsHearingImpaired' = undefined;
    /**
    * The height.    Probe Field: `height`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * The width.    Probe Field: `width`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * The average frame rate..    Probe Field: `avg_frame_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.
    * @member {Number} AverageFrameRate
    */
    'AverageFrameRate' = undefined;
    /**
    * The real frame rate..    Probe Field: `r_frame_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.
    * @member {Number} RealFrameRate
    */
    'RealFrameRate' = undefined;
    /**
    * The profile.    Probe Field: `profile`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enums: `Emby.Media.Model.Enums.AacProfiles`, `Emby.Media.Model.Enums.AvcProfiles`, `Emby.Media.Model.Enums.H263Profiles`, `Emby.Media.Model.Enums.HevcProfiles`, `Emby.Media.Model.Enums.Mpeg2Profiles`,`Emby.Media.Model.Enums.Vc1Profiles`, `Emby.Media.Model.Enums.Mpeg4Profiles`, `Emby.Media.Model.Enums.Vp8Profiles`, `Emby.Media.Model.Enums.Vp9Profiles`.
    * @member {String} Profile
    */
    'Profile' = undefined;
    /**
    * @member {module:model/MediaStreamType} Type
    */
    'Type' = undefined;
    /**
    * The aspect ratio.    Probe Field: `display_aspect_ratio`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.
    * @member {String} AspectRatio
    */
    'AspectRatio' = undefined;
    /**
    * The index of the stream inside its container.    Probe Field: `index`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
    * @member {Number} Index
    */
    'Index' = undefined;
    /**
    * A value indicating whether this instance is external.    Custom property set by the application.
    * @member {Boolean} IsExternal
    */
    'IsExternal' = undefined;
    /**
    * @member {module:model/SubtitleDeliveryMethod} DeliveryMethod
    */
    'DeliveryMethod' = undefined;
    /**
    * The delivery URL.    Custom property set by the application.
    * @member {String} DeliveryUrl
    */
    'DeliveryUrl' = undefined;
    /**
    * A value indicating whether this instance is external URL.    Custom property set by the application.
    * @member {Boolean} IsExternalUrl
    */
    'IsExternalUrl' = undefined;
    /**
    * @member {Boolean} IsTextSubtitleStream
    */
    'IsTextSubtitleStream' = undefined;
    /**
    * A value indicating whether \\[supports external stream\\].
    * @member {Boolean} SupportsExternalStream
    */
    'SupportsExternalStream' = undefined;
    /**
    * The filename.
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {module:model/MediaProtocol} Protocol
    */
    'Protocol' = undefined;
    /**
    * The pixel format.    Probe Field: `pix_fmt`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `MediaBrowser.Model.Entities.MediaStream.PixelFormat`.
    * @member {String} PixelFormat
    */
    'PixelFormat' = undefined;
    /**
    * The codec level.    Probe Field: `level`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enums: `Emby.Media.Model.Enums.AvcLevels`, `Emby.Media.Model.Enums.H263Levels`, `Emby.Media.Model.Enums.HevcLevels`, `Emby.Media.Model.Enums.Mpeg2Levels`,`Emby.Media.Model.Enums.Vc1Levels`, `Emby.Media.Model.Enums.Mpeg4Levels`, `Emby.Media.Model.Enums.Vp8Levels`, `Emby.Media.Model.Enums.Vp9Levels`.
    * @member {Number} Level
    */
    'Level' = undefined;
    /**
    * A value indicating whether this instance is anamorphic.
    * @member {Boolean} IsAnamorphic
    */
    'IsAnamorphic' = undefined;
    /**
    * @member {module:model/ExtendedVideoTypes} ExtendedVideoType
    */
    'ExtendedVideoType' = undefined;
    /**
    * @member {module:model/ExtendedVideoSubTypes} ExtendedVideoSubType
    */
    'ExtendedVideoSubType' = undefined;
    /**
    * The extended video sub\\-type description.
    * @member {String} ExtendedVideoSubTypeDescription
    */
    'ExtendedVideoSubTypeDescription' = undefined;
    /**
    * Used only by our Windows app. Not used by Emby Server.
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * Used only by our Windows app. Not used by Emby Server.
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * The size of the attachment.
    * @member {Number} AttachmentSize
    */
    'AttachmentSize' = undefined;
    /**
    * The type of the MIME.
    * @member {String} MimeType
    */
    'MimeType' = undefined;
    /**
    * @member {module:model/SubtitleLocationType} SubtitleLocationType
    */
    'SubtitleLocationType' = undefined;




}
